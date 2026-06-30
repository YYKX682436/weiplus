package f92;

/* loaded from: classes10.dex */
public final class m implements pf5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f92.t f260260a;

    public m(f92.t tVar) {
        this.f260260a = tVar;
    }

    @Override // pf5.a
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // pf5.a
    public void onActivityPostDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if ((activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) || (activity instanceof com.tencent.mm.ui.base.preference.MMPreference)) {
            java.lang.String str = (java.lang.String) this.f260260a.f260281n.remove(java.lang.Integer.valueOf(activity.hashCode()));
            if (str == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i("Finder.AccountManager", "onActivityPostDestroyed, activity=" + activity + ", selfFinderUsername=" + str);
        }
    }

    @Override // pf5.a
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if ((activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) || (activity instanceof com.tencent.mm.ui.base.preference.MMPreference)) {
            java.lang.String stringExtra = activity.getIntent().getStringExtra("KEY_FINDER_USERNAME_SELF");
            if (stringExtra == null) {
                stringExtra = "";
            }
            boolean booleanExtra = activity.getIntent().getBooleanExtra("KEY_CAN_USE_SELF_CLUB_USERNAME", false);
            int i17 = 1;
            if (!(stringExtra.length() > 0)) {
                if (booleanExtra) {
                    stringExtra = ((f92.t) pf5.u.f353936a.e(m40.g0.class).a(f92.t.class)).N6();
                    i17 = 2;
                } else {
                    stringExtra = g92.b.f269769e.T0();
                    i17 = 3;
                }
            }
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).c(zy2.ra.class));
            kotlin.jvm.internal.o.g(stringExtra, "<set-?>");
            nyVar.F = stringExtra;
            this.f260260a.f260281n.put(java.lang.Integer.valueOf(activity.hashCode()), stringExtra);
            com.tencent.mars.xlog.Log.i("Finder.AccountManager", "onActivityPreCreated, case=" + i17 + ", activity=" + activity + ", selfFinderUsername=" + stringExtra);
        }
    }

    @Override // pf5.a
    public void onActivityPreDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }
}
