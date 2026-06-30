package pg2;

/* loaded from: classes3.dex */
public final class n0 implements com.tencent.mm.ui.cd, j45.k {
    static {
        new pg2.m0(null);
    }

    @Override // com.tencent.mm.ui.ad, j45.i
    public boolean b(android.content.Context context, java.lang.String activity, android.content.Intent intent, int i17, com.tencent.mm.ui.x7 x7Var) {
        if (context != null) {
            if (!(activity == null || activity.length() == 0) && intent != null) {
                try {
                    c50.s0 s0Var = (c50.s0) i95.n0.c(c50.s0.class);
                    if (s0Var == null) {
                        return false;
                    }
                    kotlin.jvm.internal.o.g(activity, "activity");
                    if ((r26.i0.n(activity, "FinderLiveVisitorWithoutAffinityUI", false) || r26.i0.n(activity, "FinderLiveVisitorAffinityUI", false) || r26.i0.n(activity, "FinderLiveVisitorTopStoryAffinityUI", false)) && ((pg2.j0) s0Var).wh() && !intent.getBooleanExtra("key_handle_insert", false) && !intent.getBooleanExtra("intent_key_support_performer", false) && !(context instanceof com.tencent.mm.ui.fluent.ViewFluentTransparentActivity)) {
                        com.tencent.mars.xlog.Log.i("FinderLiveVisitorUIStartInterceptor", "insert start ViewFluentTransparentActivity from " + context.getClass().getSimpleName() + '@' + context.hashCode() + " to " + activity);
                        intent.putExtra("key_handle_insert", true);
                        ez2.e eVar = ez2.g.f257902a;
                        if (eVar != null) {
                            eVar.c();
                        }
                        boolean z17 = context instanceof android.app.Activity;
                        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) ((z17 || !((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Zi(context)) ? com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2.class : com.tencent.mm.plugin.finder.feed.ui.OccupyFinderAffinityUI2.class));
                        if (!z17) {
                            intent2.addFlags(268435456);
                        }
                        intent2.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent2);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveVisitorUIStartInterceptor", "intercept", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILcom/tencent/mm/ui/IActInterceptExtension;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveVisitorUIStartInterceptor", "intercept", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILcom/tencent/mm/ui/IActInterceptExtension;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                    return false;
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.w("FinderLiveVisitorUIStartInterceptor", "IFinderLiveSurfaceViewService not registered in process (like appbrand, it's ok)");
                }
            }
        }
        return false;
    }
}
