package df2;

/* loaded from: classes3.dex */
public final class rk implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.pl f231251a;

    public rk(df2.pl plVar) {
        this.f231251a = plVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        r45.zb4 zb4Var = new r45.zb4();
        df2.pl plVar = this.f231251a;
        ce2.i iVar = plVar.f231088n;
        if (iVar == null || (str = iVar.field_rewardProductId) == null) {
            str = "";
        }
        zb4Var.set(0, str);
        zb4Var.set(1, java.lang.Boolean.FALSE);
        ((mm2.s2) plVar.business(mm2.s2.class)).f329411p.postValue(zb4Var);
        return jz5.f0.f302826a;
    }
}
