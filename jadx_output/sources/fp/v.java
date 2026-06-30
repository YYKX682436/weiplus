package fp;

/* loaded from: classes13.dex */
public final class v extends java.util.zip.Inflater {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f265242a = true;

    @Override // java.util.zip.Inflater
    public boolean finished() {
        if (!f265242a || getRemaining() > 0) {
            return super.finished();
        }
        return true;
    }

    @Override // java.util.zip.Inflater
    public int inflate(byte[] bArr, int i17, int i18) {
        int inflate = super.inflate(bArr, i17, i18);
        if (!f265242a || inflate > 0) {
            return inflate;
        }
        throw new java.lang.IllegalStateException("InflateNothing: needsInput=" + needsInput() + ", needsDictionary=" + needsDictionary() + ", remaining=" + getRemaining() + ", totalIn=" + getTotalIn() + ", totalOut=" + getTotalOut() + "");
    }
}
