import java.util.Random;
import java.util.Scanner;

class AsciiCharSequence implements CharSequence/* extends/implements */ {
    byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes.clone();
    }


    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int i) {
        return (char) bytes[i];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(bytes, start, end));
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (byte b : bytes) {
            s.append((char) b);
        }
        return s.toString();
    }
}