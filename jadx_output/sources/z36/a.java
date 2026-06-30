package z36;

/* loaded from: classes13.dex */
public class a extends java.io.IOException {
    public a(long j17, int i17) {
        super(j17 + " kb of memory would be needed; limit was " + i17 + " kb. If the file is not corrupt, consider increasing the memory limit.");
    }

    public a(long j17, int i17, java.lang.Exception exc) {
        super(j17 + " kb of memory would be needed; limit was " + i17 + " kb. If the file is not corrupt, consider increasing the memory limit.", exc);
    }
}
