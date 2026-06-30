package t46;

/* loaded from: classes13.dex */
public class b extends java.io.Writer implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.StringBuilder f415678d;

    public b() {
        this.f415678d = new java.lang.StringBuilder();
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char c17) {
        this.f415678d.append(c17);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public java.lang.String toString() {
        return this.f415678d.toString();
    }

    @Override // java.io.Writer
    public void write(java.lang.String str) {
        if (str != null) {
            this.f415678d.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.lang.Appendable append(char c17) {
        this.f415678d.append(c17);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i17, int i18) {
        if (cArr != null) {
            this.f415678d.append(cArr, i17, i18);
        }
    }

    public b(int i17) {
        this.f415678d = new java.lang.StringBuilder(i17);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence charSequence) {
        this.f415678d.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence) {
        this.f415678d.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence charSequence, int i17, int i18) {
        this.f415678d.append(charSequence, i17, i18);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence, int i17, int i18) {
        this.f415678d.append(charSequence, i17, i18);
        return this;
    }
}
