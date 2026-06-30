package jn2;

/* loaded from: classes10.dex */
public final class q1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f300671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f300672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f300673f;

    public q1(jn2.r1 r1Var, r45.z22 z22Var, int i17) {
        this.f300671d = r1Var;
        this.f300672e = z22Var;
        this.f300673f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.ay1 ay1Var;
        r45.ay1 ay1Var2;
        int itemId = menuItem.getItemId();
        jn2.r1 r1Var = this.f300671d;
        if (itemId == r1Var.K) {
            r1Var.f300685p1.a();
            r45.z22 z22Var = this.f300672e;
            r45.by1 by1Var = z22Var.f391631h;
            if (by1Var != null && (ay1Var2 = by1Var.f371143d) != null) {
                sf2.x xVar = r1Var.I;
                xVar.getClass();
                te2.a9.f(te2.a9.f417883a, xVar.h7(), 4, kz5.b0.c(ay1Var2), null, 8, null);
            }
            int i18 = this.f300673f;
            r1Var.getClass();
            java.lang.String str = z22Var.f391629f;
            boolean z17 = str == null || str.length() == 0;
            java.lang.String str2 = r1Var.f300682J;
            if (z17) {
                com.tencent.mars.xlog.Log.e(str2, "deleteNewSong: unique_add_id is null or empty");
                return;
            }
            r45.by1 by1Var2 = z22Var.f391631h;
            java.lang.String str3 = (by1Var2 == null || (ay1Var = by1Var2.f371143d) == null) ? null : ay1Var.f370351e;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = str3;
            com.tencent.mars.xlog.Log.i(str2, "deleteNewSong: pos=" + i18 + ", song=" + str4 + ", uniqueAddId=" + str);
            kotlinx.coroutines.y0 y0Var = r1Var.E;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new jn2.e1(r1Var, z22Var, str4, i18, null), 3, null);
            }
        }
    }
}
