package pk2;

/* loaded from: classes3.dex */
public final class s3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.t3 f356233e;

    public s3(pk2.o9 o9Var, pk2.t3 t3Var) {
        this.f356232d = o9Var;
        this.f356233e = t3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendSettingsOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pk2.o9 o9Var = this.f356232d;
        int i17 = (int) (o9Var.f356078d.getResources().getDisplayMetrics().heightPixels * 0.6d);
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(o9Var.f356078d);
        android.view.View inflate = android.view.LayoutInflater.from(o9Var.f356078d).inflate(com.tencent.mm.R.layout.dim, (android.view.ViewGroup) null);
        com.tencent.mars.xlog.Log.i("AnchorRecommendSettingsOption", "showAnchorRecommendSettingPanel: peekHeight=" + i17);
        if (o9Var.h()) {
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(o9Var.f356078d.getResources().getDisplayMetrics().heightPixels, -2));
        } else {
            if (i17 <= 0) {
                i17 = -1;
            }
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(-1, i17));
        }
        android.view.View view2 = e3Var.f131959f;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.qoh);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.qog);
        pk2.t3 t3Var = this.f356233e;
        if (findViewById != null) {
            int i18 = t3Var.n() ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendSettingsOption$addItem$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendSettingsOption$addItem$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        e3Var.c(true);
        e3Var.b();
        for (qk2.f fVar : t3Var.f356263j) {
            qk2.d dVar = fVar instanceof qk2.d ? (qk2.d) fVar : null;
            if (dVar != null) {
                qk2.d.s(dVar, e3Var, null, 2, null);
            }
        }
        e3Var.f131968r = new pk2.r3(t3Var);
        e3Var.i();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendSettingsOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
