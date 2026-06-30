package r61;

/* loaded from: classes4.dex */
public class t0 extends l75.a1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.u0 f392954d;

    public t0(r61.u0 u0Var) {
        this.f392954d = u0Var;
    }

    @Override // l75.a1
    public boolean f() {
        r61.u0 u0Var = this.f392954d;
        l75.k0 k0Var = u0Var.f392963d;
        if (k0Var != null && !k0Var.J()) {
            return true;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        l75.k0 k0Var2 = u0Var.f392963d;
        objArr[0] = k0Var2 == null ? "null" : java.lang.Boolean.valueOf(k0Var2.J());
        com.tencent.mars.xlog.Log.w("MicroMsg.GoogleContact.GoogleFriendUI", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }
}
