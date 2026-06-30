package vg2;

/* loaded from: classes3.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.y1 f436589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.u1 f436590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f436591f;

    public t1(vg2.y1 y1Var, vg2.u1 u1Var, int i17) {
        this.f436589d = y1Var;
        this.f436590e = u1Var;
        this.f436591f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/KTVGiftBatchSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.y1 y1Var = this.f436589d;
        tg2.h hVar = y1Var.f436623b;
        r45.kv1 kv1Var = y1Var.f436630i;
        if (kv1Var == null || (str = kv1Var.getString(0)) == null) {
            str = "";
        }
        tg2.h.d(hVar, str, ((r45.pv1) this.f436590e.f436595d.get(this.f436591f)).getInteger(0), null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/KTVGiftBatchSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
