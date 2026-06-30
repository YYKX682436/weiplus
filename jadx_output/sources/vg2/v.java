package vg2;

/* loaded from: classes3.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.a0 f436597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.w f436598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f436599f;

    public v(vg2.a0 a0Var, vg2.w wVar, int i17) {
        this.f436597d = a0Var;
        this.f436598e = wVar;
        this.f436599f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.a0 a0Var = this.f436597d;
        tg2.h hVar = a0Var.f436467c;
        ce2.i iVar = a0Var.f436472h;
        java.lang.String str = iVar != null ? iVar.field_rewardProductId : null;
        if (str == null) {
            str = "";
        }
        tg2.h.d(hVar, str, ((r45.pv1) this.f436598e.f436611d.get(this.f436599f)).getInteger(0), null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
