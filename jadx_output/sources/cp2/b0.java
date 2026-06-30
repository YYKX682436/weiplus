package cp2;

/* loaded from: classes2.dex */
public final class b0 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220779a;

    public b0(cp2.v0 v0Var) {
        this.f220779a = v0Var;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        cp2.v0 v0Var = this.f220779a;
        if (booleanValue) {
            v0Var.i();
            return;
        }
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.era);
        s3Var.f463517b = -2;
        v0Var.g(s3Var);
    }
}
