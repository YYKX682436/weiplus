package zl2;

/* loaded from: classes3.dex */
public final class e3 implements w25.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f473735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.d64 f473736e;

    public e3(kotlinx.coroutines.q qVar, r45.d64 d64Var) {
        this.f473735d = qVar;
        this.f473736e = d64Var;
    }

    @Override // w25.e
    public final void i3(java.lang.String str, java.util.List list) {
        kotlinx.coroutines.q qVar = this.f473735d;
        if (list == null) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#requestLocationLikeByUser ready to save: ");
        sb6.append(str);
        sb6.append(' ');
        r45.c64 c64Var = (r45.c64) kz5.n0.Z(list);
        java.lang.String str2 = c64Var != null ? c64Var.f371311e : null;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(' ');
        r45.c64 c64Var2 = (r45.c64) kz5.n0.Z(list);
        java.lang.String str3 = c64Var2 != null ? c64Var2.f371310d : null;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(" long=");
        r45.d64 d64Var = this.f473736e;
        sb6.append(d64Var.f372174d);
        sb6.append(" lat=");
        sb6.append(d64Var.f372175e);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        r45.ze2 ze2Var = new r45.ze2();
        ze2Var.set(2, str);
        ze2Var.set(0, java.lang.Float.valueOf(d64Var.f372174d));
        ze2Var.set(1, java.lang.Float.valueOf(d64Var.f372175e));
        r45.c64 c64Var3 = (r45.c64) kz5.n0.Z(list);
        if (c64Var3 != null) {
            java.lang.String str4 = c64Var3.f371311e;
            ze2Var.set(3, str4 != null ? str4 : "");
            ze2Var.set(5, c64Var3.f371310d);
        }
        qVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(ze2Var, list)));
    }
}
