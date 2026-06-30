package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI f152135d;

    public e1(com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI) {
        this.f152135d = nearbySayHiListUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        an3.f fVar = new an3.f(2, 0.0f, 0.0f, 0, 0, "", "");
        com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI = this.f152135d;
        nearbySayHiListUI.f152118o = fVar;
        gm0.j1.d().g(nearbySayHiListUI.f152118o);
        nearbySayHiListUI.f152117n = db5.e1.Q(nearbySayHiListUI.getContext(), nearbySayHiListUI.getString(com.tencent.mm.R.string.f490573yv), nearbySayHiListUI.getString(com.tencent.mm.R.string.h5z), true, true, new com.tencent.mm.plugin.nearby.ui.d1(this));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11429, "0");
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
