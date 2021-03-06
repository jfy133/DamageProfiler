# DamageProfiler
[![Build Status](https://travis-ci.org/Integrative-Transcriptomics/DamageProfiler.svg?branch=master)](https://travis-ci.org/Integrative-Transcriptomics/DamageProfiler)
[![Documentation Status](https://readthedocs.org/projects/damageprofiler/badge/?version=latest)](http://damageprofiler.readthedocs.io/en/latest/?badge=latest)
[![DOI](https://zenodo.org/badge/84447018.svg)](https://zenodo.org/badge/latestdoi/84447018)
[![install with bioconda](https://img.shields.io/badge/install%20with-bioconda-brightgreen.svg?style=flat-square)](http://bioconda.github.io/recipes/damageprofiler/README.html)

This method can be used to calculate damage profiles of mapped ancient DNA reads. 

Main author: Judith Neukamm <judith.neukamm@uzh.ch>\
Contributor: Alexander Peltzer <alexander.peltzer@qbic.uni-tuebingen.de>

###### Method
DamageProfiler calculates damage profiles of mapped reads and provides a 
graphical as well as text based representation. 

It creates 
- damage plots
- a fragment length distribution
- a read identity distribution 
- a base frequency table of reference 
- a table of different base misincorporations and their occurrences


###### How to run

```
java -jar DamageProfiler-VERSION.jar <arguments> [options]
```




Arguments:

**-h,--help**\
Shows this help page.\
\
**-i,--input <INPUT>**\
The input sam/bam file.\
\
**-o,--output <OUTPUT>**\
The output folder.\
\
Options

**-l,--length <LENGTH>**\
Number of bases which are computations.\
\
**-merged,--all_mapped_and_merged_reads**\
Use all mapped and merged reads to calculate damage plot instead of using all mapped reads. The SAM/BAM entry must start with 'M_', otherwise it will be skipped. Default: false\
\
**-r,--reference <REFERENCE>**\
The reference file\
\
**-s,--specie <SPECIE>**\
RefSeq ID of the reference genome. This will just use the reads mapping to the specific reference for creating the damage profile. It can for example be used for MALT output files. In this case, please make sure that you run MALT without *--sparseSAM* option. This would create a sam file with is not readable. \
Example: -s NC_022116.1
\
\
**-sf,--specieslist file <SPECIES LIST>**\
List with species (RefSeq IDs) for which damage profile has to be calculated. One species per line, given as text file (.txt). Species must have the same format like *-s* parameter.\
\
**-t,--threshold <THRESHOLD>**\
Number of bases which are considered for plotting nucleotide misincorporations.\
\
**-title,--title <TITLE>**\
Title used for all plots (Default: file name of input SAM/BAM file).\
\
**-yaxis_damageplot,--yaxis_damageplot <YAXIS_DAMAGEPLOT>**\
Maximal value on y axis (Default: flexible, adapts to the calculated damage).\
\
**-xaxis_histo_id_min,--xaxis_histo_id_min <XAXIS_HISTO_ID_MIN>**\
Maximal value on y axis (Default: flexible, adapts to the calculated damage).\
\
**-xaxis_histo_id_max,--xaxis_histo_id_max <XAXIS_HISTO_ID_MAX>**\
Maximal value on y axis (Default: flexible, adapts to the calculated damage).\
\
**-xaxis_histo_length_min,--xaxis_histo_length_min <XAXIS_HISTO_LENGTH_MIN>**\
Maximal value on y axis (Default: flexible, adapts to the calculated damage).\
\
**-xaxis_histo_length_max,--xaxis_histo_length_max <XAXIS_HISTO_LENGTH_MAX>**\
Maximal value on y axis (Default: flexible, adapts to the calculated damage).





Running the jar file without any parameter starts a GUI to configure the run.

Stay tuned, a more detailed description, manual and tutorial of DamageProfiler is coming soon.