package s92;

/* loaded from: classes2.dex */
public final class f implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f405005b;

    public f(java.lang.String str, android.app.Activity activity) {
        this.f405004a = str;
        this.f405005b = activity;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.sz6 sz6Var;
        r45.sz6 sz6Var2;
        r45.sz6 sz6Var3;
        r45.sz6 sz6Var4;
        r45.r03 r03Var;
        java.lang.String viewId = this.f405004a;
        kotlin.jvm.internal.o.g(viewId, "viewId");
        android.app.Activity activity = this.f405005b;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC finderActivityTabUIC = (com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC.class);
        java.lang.String str2 = null;
        r45.e21 e21Var = (finderActivityTabUIC == null || (r03Var = (r45.r03) finderActivityTabUIC.f452711w) == null) ? null : (r45.e21) r03Var.getCustom(16);
        long longExtra = activity.getIntent().getLongExtra("key_activity_id", 0L);
        if (e21Var != null) {
            longExtra = e21Var.getLong(0);
        }
        java.lang.String u17 = pm0.v.u(longExtra);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getReportMap] viewId:");
        sb6.append(viewId);
        sb6.append(" activityId:");
        sb6.append(u17);
        sb6.append(" templateType:");
        sb6.append((e21Var == null || (sz6Var4 = (r45.sz6) e21Var.getCustom(26)) == null) ? null : java.lang.Integer.valueOf(sz6Var4.getInteger(1)));
        sb6.append(" templateId:");
        sb6.append((e21Var == null || (sz6Var3 = (r45.sz6) e21Var.getCustom(26)) == null) ? null : sz6Var3.getString(2));
        com.tencent.mars.xlog.Log.i("FinderActivityReporter", sb6.toString());
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("page_activityid", u17);
        lVarArr[1] = new jz5.l("template_type", (e21Var == null || (sz6Var2 = (r45.sz6) e21Var.getCustom(26)) == null) ? null : java.lang.Integer.valueOf(sz6Var2.getInteger(1)));
        if (e21Var != null && (sz6Var = (r45.sz6) e21Var.getCustom(26)) != null) {
            str2 = sz6Var.getString(2);
        }
        lVarArr[2] = new jz5.l("templateid", str2);
        return kz5.c1.k(lVarArr);
    }
}
