package e46;

/* loaded from: classes16.dex */
public class g extends e46.d {
    public g(e46.b bVar) {
        super(null);
    }

    @Override // e46.d
    public int a() {
        return 0;
    }

    @Override // e46.d
    public boolean b() {
        return false;
    }

    @Override // e46.d
    public int c(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        throw new java.lang.IllegalStateException("Cannot read in this state");
    }

    @Override // e46.d
    public e46.j d() {
        return e46.j.INITIAL;
    }
}
