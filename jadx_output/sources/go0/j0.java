package go0;

/* loaded from: classes11.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.k0 f273789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(go0.k0 k0Var) {
        super(0);
        this.f273789d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        go0.k0 k0Var = this.f273789d;
        boolean z17 = false;
        if (k0Var.O && (str = k0Var.P) != null) {
            boolean z18 = false;
            for (java.lang.String str2 : r26.n0.f0(str, new java.lang.String[]{"$"}, false, 0, 6, null)) {
                java.lang.String str3 = k0Var.N;
                if (str3 != null && r26.n0.B(str3, str2, false)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GLTextureRenderProc", "should use direct rendering");
                    z18 = true;
                }
            }
            z17 = z18;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
