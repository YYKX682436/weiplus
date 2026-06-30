package tu0;

/* loaded from: classes5.dex */
public final class g extends yl.g {

    /* renamed from: p, reason: collision with root package name */
    public byte[] f422082p;

    /* renamed from: q, reason: collision with root package name */
    public tl.h0 f422083q;

    public g(int i17, int i18) {
        super(i17, i18);
        this.f422082p = null;
        this.f422083q = null;
    }

    @Override // yl.g, yl.b
    public void d() {
        super.d();
        this.f422082p = null;
        this.f422083q = null;
    }

    public int h(byte[] bArr, int i17, boolean z17) {
        byte[] bArr2 = this.f422082p;
        if (bArr2 == null || bArr2.length < i17) {
            this.f422082p = new byte[i17];
        }
        java.lang.System.arraycopy(bArr, 0, this.f422082p, 0, i17);
        if (this.f422083q == null) {
            this.f422083q = new tl.h0(this.f422082p, i17, z17);
        }
        tl.h0 h0Var = this.f422083q;
        h0Var.f420048a = this.f422082p;
        h0Var.f420049b = i17;
        h0Var.f420050c = z17;
        return e(h0Var, 0, false);
    }
}
