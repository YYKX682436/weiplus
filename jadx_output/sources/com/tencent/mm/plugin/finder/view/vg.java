package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class vg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f133240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f133241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133242f;

    public vg(com.tencent.mm.ui.MMActivity mMActivity, int i17, android.view.View view) {
        this.f133240d = mMActivity;
        this.f133241e = i17;
        this.f133242f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lk(this.f133240d, this.f133241e, null, 1);
        hc2.p0.d(this.f133242f, "post_at", "view_clk", null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
