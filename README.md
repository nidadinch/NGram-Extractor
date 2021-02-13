# NGram-Extractor

## About The Project

A  program  that extracts unigram features of the text document. N-gram is a contiguous sequence of n words from a given sample of text or speech. I have used HashMap data structure to hold n-gram features and their count value.I have exclusively computed frequency for each n-gram features.  The output is sorted by count value descendingly.


* Suppose that input.txt has a following text:
```sh
You are expected to develop a text analyzer tool.  The program allows you to find the mostfrequent phrases and frequencies of words.  Non-English language texts are supported.  Italso counts number of words,  characters,  sentences and syllables.  Also calculates lexicaldensity
```

* The command ”java NgramExtractor input.txt output.csv 1”  extracts all 1-gram features of text document to the output.csv file:

```sh
   Total number of tokens: 42
   ngram,count,frequency
   and,2,4.761904762
   of,2,4.761904762
   words,2,4.761904762
   are,2,4.761904762
   to,2,4.761904762
   calculates,1,2.380952381
   Also,1,2.380952381
   syllables,1,2.380952381
   sentences,1,2.380952381
   characters,1,2.380952381
   counts,1,2.380952381
   also,1,2.380952381
   It,1,2.380952381
   supported,1,2.380952381
   texts,1,2.380952381
   language,1,2.380952381
   Non-English,1,2.380952381
   lexical,1,2.380952381
   number,1,2.380952381
   You,1,2.380952381
   frequencies,1,2.380952381
   The,1,2.380952381
   expected,1,2.380952381
   develop,1,2.380952381
   a,1,2.380952381
   text,1,2.380952381
   analyzer,1,2.380952381
   tool,1,2.380952381
   program,1,2.380952381
   phrases,1,2.380952381
   allows,1,2.380952381
   you,1,2.380952381
   find,1,2.380952381
   the,1,2.380952381
   most,1,2.380952381
   frequent,1,2.380952381
   density,1,2.380952381
   ```

## Built With

* Java

## Getting Started


* ```sh
  javac NGramExtractor.java

   ```

* ```sh
  java NGramExtractor input.txt output.csv 1

   ```


## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


## License

Distributed under the MIT License. See `LICENSE` for more information.


## Contact

Nida Dinç - niddinc@gmail.com

Project Link: [https://github.com/nidadinch/NGram-Extractor](https://github.com/nidadinch/NGram-Extractor)
