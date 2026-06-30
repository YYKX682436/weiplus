package df2;

/* loaded from: classes3.dex */
public final class cj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.oj f229887d;

    public cj(df2.oj ojVar) {
        this.f229887d = ojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup;
        jz5.l lVar;
        android.view.View view;
        android.view.View f76;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var;
        df2.oj ojVar = this.f229887d;
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) ojVar.R6(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
        jz5.f0 f0Var = null;
        if (ag0Var == null || (viewGroup = ag0Var.G1()) == null || !viewGroup.isShown()) {
            viewGroup = null;
        }
        android.view.View f77 = ojVar.f7();
        if (viewGroup == null || f77 == null) {
            lVar = null;
        } else {
            android.graphics.Rect r17 = pm0.v.r(viewGroup);
            int i17 = r17.left;
            lVar = new jz5.l(java.lang.Integer.valueOf(i17 + ((r17.right - i17) / 2)), java.lang.Integer.valueOf(r17.top));
        }
        android.view.View f78 = ojVar.f7();
        if (f78 == null || (view = f78.findViewById(com.tencent.mm.R.id.rvo)) == null) {
            view = null;
        } else {
            view.setOnClickListener(new df2.aj(ojVar));
        }
        if (lVar != null && view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            int intValue = ((java.lang.Number) lVar.f302833d).intValue();
            int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
            int i18 = intValue - (width / 2);
            if (i18 < 0) {
                i18 = 0;
            }
            int i19 = com.tencent.mm.ui.bl.b(ojVar.O6()).x - width;
            if (i18 > i19) {
                i18 = i19;
            }
            view.setTranslationX(i18);
            android.view.View f79 = ojVar.f7();
            android.view.View findViewById = f79 != null ? f79.findViewById(com.tencent.mm.R.id.rvm) : null;
            if (findViewById != null) {
                findViewById.setTranslationX(((intValue - view.getTranslationX()) - view.getPaddingLeft()) - (((java.lang.Number) ((jz5.n) ojVar.A).getValue()).intValue() / 2));
            }
            view.setTranslationY((intValue2 - height) + ((java.lang.Number) ((jz5.n) ojVar.B).getValue()).intValue());
            com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var = (com.tencent.mm.plugin.finder.live.plugin.ai0) ojVar.R6(com.tencent.mm.plugin.finder.live.plugin.ai0.class);
            if (ai0Var != null && (m10Var = ai0Var.f111891s) != null) {
                m10Var.k(false);
            }
            com.tencent.mm.plugin.finder.live.plugin.t20 t20Var = (com.tencent.mm.plugin.finder.live.plugin.t20) ojVar.R6(com.tencent.mm.plugin.finder.live.plugin.t20.class);
            if (t20Var != null) {
                t20Var.v1();
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null && (f76 = ojVar.f7()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f76, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$checkLocation$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f76, "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$checkLocation$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View f710 = ojVar.f7();
        if (f710 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(f710, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$checkLocation$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        f710.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(f710, "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$checkLocation$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
