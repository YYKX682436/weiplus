package vg2;

/* loaded from: classes3.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.b1 f436474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.y0 f436475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f436476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yi6 f436477g;

    public a1(vg2.b1 b1Var, vg2.y0 y0Var, vg2.r1 r1Var, r45.yi6 yi6Var) {
        this.f436474d = b1Var;
        this.f436475e = y0Var;
        this.f436476f = r1Var;
        this.f436477g = yi6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("GiftSkinSelectPanelWidget", "select color click, ");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f3a);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        vg2.b1 b1Var = this.f436474d;
        b1Var.notifyItemChanged(intValue);
        b1Var.notifyItemChanged(b1Var.f436481e);
        vg2.b1 b1Var2 = this.f436474d;
        b1Var2.f436481e = intValue;
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            com.tencent.mm.plugin.finder.live.util.y.f(k0Var, null, null, new vg2.z0(this.f436475e, this.f436476f, this.f436477g, b1Var2, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
