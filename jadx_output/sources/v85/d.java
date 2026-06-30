package v85;

/* loaded from: classes10.dex */
public final class d implements x85.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.p64 f434102a;

    public d(r45.p64 p64Var) {
        this.f434102a = p64Var;
    }

    @Override // x85.c
    public void a(int i17, r45.p64 p64Var) {
        v85.e eVar = v85.e.f434103a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResult: ");
        r45.p64 p64Var2 = this.f434102a;
        sb6.append(p64Var2.f382792d);
        sb6.append(", ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoUserCache", sb6.toString());
        pm0.v.X(new v85.c(i17, p64Var2, p64Var));
    }
}
