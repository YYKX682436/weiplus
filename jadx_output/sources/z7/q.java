package z7;

/* loaded from: classes12.dex */
public class q extends java.io.Writer {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.Writer f470499d;

    /* renamed from: e, reason: collision with root package name */
    public final char[] f470500e;

    /* renamed from: f, reason: collision with root package name */
    public int f470501f = 0;

    public q(java.io.Writer writer, int i17) {
        this.f470499d = writer;
        this.f470500e = new char[i17];
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        this.f470499d.write(this.f470500e, 0, this.f470501f);
        this.f470501f = 0;
    }

    @Override // java.io.Writer
    public void write(int i17) {
        int i18 = this.f470501f;
        char[] cArr = this.f470500e;
        if (i18 > cArr.length - 1) {
            flush();
        }
        int i19 = this.f470501f;
        this.f470501f = i19 + 1;
        cArr[i19] = (char) i17;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i17, int i18) {
        int i19 = this.f470501f;
        char[] cArr2 = this.f470500e;
        if (i19 > cArr2.length - i18) {
            flush();
            if (i18 > cArr2.length) {
                this.f470499d.write(cArr, i17, i18);
                return;
            }
        }
        java.lang.System.arraycopy(cArr, i17, cArr2, this.f470501f, i18);
        this.f470501f += i18;
    }

    @Override // java.io.Writer
    public void write(java.lang.String str, int i17, int i18) {
        int i19 = this.f470501f;
        char[] cArr = this.f470500e;
        if (i19 > cArr.length - i18) {
            flush();
            if (i18 > cArr.length) {
                this.f470499d.write(str, i17, i18);
                return;
            }
        }
        str.getChars(i17, i17 + i18, cArr, this.f470501f);
        this.f470501f += i18;
    }
}
