package yf2;

/* loaded from: classes3.dex */
public final class x0 implements w25.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.z0 f461809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f461810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d64 f461811f;

    public x0(yf2.z0 z0Var, kotlinx.coroutines.q qVar, r45.d64 d64Var) {
        this.f461809d = z0Var;
        this.f461810e = qVar;
        this.f461811f = d64Var;
    }

    @Override // w25.e
    public final void i3(java.lang.String str, java.util.List list) {
        yf2.z0 z0Var = this.f461809d;
        boolean z17 = z0Var.f461825n;
        kotlinx.coroutines.q qVar = this.f461810e;
        if (z17 || list == null) {
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
        r45.d64 d64Var = this.f461811f;
        sb6.append(d64Var.f372174d);
        sb6.append(" lat=");
        sb6.append(d64Var.f372175e);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostLocationWidget", sb6.toString());
        z0Var.f461826o = true;
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
