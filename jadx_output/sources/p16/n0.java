package p16;

/* loaded from: classes16.dex */
public class n0 implements p16.e {

    /* renamed from: d, reason: collision with root package name */
    public final p16.m0 f351327d;

    /* renamed from: e, reason: collision with root package name */
    public p16.e f351328e;

    /* renamed from: f, reason: collision with root package name */
    public int f351329f;

    public n0(p16.o0 o0Var, p16.k0 k0Var) {
        p16.m0 m0Var = new p16.m0(o0Var, null);
        this.f351327d = m0Var;
        this.f351328e = m0Var.next().iterator();
        this.f351329f = o0Var.f351331e;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351329f > 0;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return java.lang.Byte.valueOf(nextByte());
    }

    @Override // p16.e
    public byte nextByte() {
        if (!this.f351328e.hasNext()) {
            this.f351328e = this.f351327d.next().iterator();
        }
        this.f351329f--;
        return this.f351328e.nextByte();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
