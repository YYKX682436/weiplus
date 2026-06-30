package p16;

/* loaded from: classes16.dex */
public class e0 implements p16.e {

    /* renamed from: d, reason: collision with root package name */
    public int f351272d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f351273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p16.f0 f351274f;

    public e0(p16.f0 f0Var, p16.d0 d0Var) {
        this.f351274f = f0Var;
        this.f351273e = f0Var.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351272d < this.f351273e;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return java.lang.Byte.valueOf(nextByte());
    }

    @Override // p16.e
    public byte nextByte() {
        try {
            byte[] bArr = this.f351274f.f351281e;
            int i17 = this.f351272d;
            this.f351272d = i17 + 1;
            return bArr[i17];
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            throw new java.util.NoSuchElementException(e17.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
