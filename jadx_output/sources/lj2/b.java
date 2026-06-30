package lj2;

/* loaded from: classes10.dex */
public final class b implements ai2.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f318818a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f318819b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f318820c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f318821d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f318822e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f318823f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f318824g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f318825h;

    public b(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f318818a = rootView;
        this.f318819b = "FinderLiveBattleDrawResultBarWidget";
        this.f318820c = "finder_live_pk_result_draw.pag";
        this.f318821d = "finder_live_pk_result_draw_en.pag";
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.eoi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f318822e = (com.tencent.mm.view.MMPAGView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.eog);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f318823f = textView;
        this.f318825h = kotlinx.coroutines.z0.b();
        textView.setVisibility(8);
    }

    @Override // ai2.a
    public android.view.View h() {
        return this.f318818a;
    }

    @Override // ai2.a
    public void i(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f318819b, "battleStart withAnim:" + z17);
        this.f318822e.setVisibility(8);
        this.f318823f.setVisibility(8);
        android.view.View view = this.f318818a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ai2.a
    public void j(boolean z17, dk2.u4 u4Var) {
        java.lang.String str = this.f318819b;
        com.tencent.mars.xlog.Log.i(str, "battleEnd curBattle:" + u4Var);
        if (u4Var != null) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.m2.j() ? this.f318820c : this.f318821d;
            com.tencent.mars.xlog.Log.i(str, "battleEnd pagRes:" + str2);
            this.f318823f.setVisibility(8);
            if (str2 == null || str2.length() == 0) {
                return;
            }
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            boolean a17 = ae2.in.f3688a.a(ym5.f6.R);
            com.tencent.mm.view.MMPAGView mMPAGView = this.f318822e;
            mMPAGView.o(a17);
            kotlinx.coroutines.r2 r2Var = this.f318824g;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f318824g = kotlinx.coroutines.l.d(this.f318825h, null, null, new lj2.a(str2, this, null), 3, null);
            mMPAGView.setVisibility(0);
            android.view.View view = this.f318818a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "battleEnd", "(ZLcom/tencent/mm/plugin/finder/live/model/FinderLiveBattleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "battleEnd", "(ZLcom/tencent/mm/plugin/finder/live/model/FinderLiveBattleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ai2.a
    public void reset() {
        this.f318822e.n();
        android.view.View view = this.f318818a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveBattleDrawResultBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kotlinx.coroutines.r2 r2Var = this.f318824g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f318824g = null;
    }
}
