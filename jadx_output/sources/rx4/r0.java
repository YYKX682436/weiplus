package rx4;

/* loaded from: classes8.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.u0 f401257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(rx4.u0 u0Var) {
        super(1);
        this.f401257d = u0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.n8 n8Var = (bw5.n8) obj;
        int i17 = n8Var != null ? n8Var.f30539f : -1;
        java.lang.String str = this.f401257d.f401280d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryPreloadBannerWxa: open done, ret=");
        sb6.append(i17);
        sb6.append(", errMsg=");
        java.lang.String errMsg = n8Var != null ? n8Var.getErrMsg() : null;
        if (errMsg == null) {
            errMsg = "";
        }
        sb6.append(errMsg);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return jz5.f0.f302826a;
    }
}
