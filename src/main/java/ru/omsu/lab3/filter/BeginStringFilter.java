package ru.omsu.lab3.filter;

public class BeginStringFilter implements IFilter {
    private final String pattern;

    public BeginStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public Boolean apply(String sentence) {
        return sentence.startsWith(pattern);
    }
}
