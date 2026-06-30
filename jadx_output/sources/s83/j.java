package s83;

/* loaded from: classes4.dex */
public class j extends l75.a1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s83.k f404882d;

    public j(s83.k kVar) {
        this.f404882d = kVar;
    }

    @Override // l75.a1
    public boolean f() {
        s83.k kVar = this.f404882d;
        l75.k0 k0Var = kVar.f404884d;
        if (k0Var != null && !k0Var.J()) {
            return true;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        l75.k0 k0Var2 = kVar.f404884d;
        objArr[0] = k0Var2 == null ? "null" : java.lang.Boolean.valueOf(k0Var2.J());
        com.tencent.mars.xlog.Log.w("MicroMsg.IPCallPopularCountryStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }
}
