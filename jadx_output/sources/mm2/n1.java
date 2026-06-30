package mm2;

/* loaded from: classes3.dex */
public final class n1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.s1 f329277d;

    public n1(mm2.s1 s1Var) {
        this.f329277d = s1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.z53 z53Var;
        r45.z53 z53Var2;
        r45.n73 n73Var = (r45.n73) obj;
        mm2.s1 s1Var = this.f329277d;
        java.lang.String str = s1Var.f329386f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#initPrepareData gameAppInfo collect: name=");
        sb6.append((n73Var == null || (z53Var2 = (r45.z53) n73Var.getCustom(1)) == null) ? null : z53Var2.getString(1));
        sb6.append(" game_type=");
        sb6.append((n73Var == null || (z53Var = (r45.z53) n73Var.getCustom(1)) == null) ? null : new java.lang.Integer(z53Var.getInteger(13)));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (n73Var != null) {
            mm2.c1 c1Var = (mm2.c1) s1Var.business(mm2.c1.class);
            r45.z53 z53Var3 = (r45.z53) n73Var.getCustom(1);
            c1Var.f328783b5 = z53Var3 != null ? z53Var3.getString(0) : null;
            mm2.c1 c1Var2 = (mm2.c1) s1Var.business(mm2.c1.class);
            r45.z53 z53Var4 = (r45.z53) n73Var.getCustom(1);
            c1Var2.Y4 = z53Var4 != null && z53Var4.getInteger(13) == 1;
            ((mm2.g1) s1Var.business(mm2.g1.class)).V6(n73Var);
        }
        s1Var.V6(n73Var);
        return jz5.f0.f302826a;
    }
}
