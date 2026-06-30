package jn2;

/* loaded from: classes10.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f300652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.r0 f300653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jn2.p0 f300654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f300655g;

    public n0(r45.z22 z22Var, jn2.r0 r0Var, jn2.p0 p0Var, int i17) {
        this.f300652d = z22Var;
        this.f300653e = r0Var;
        this.f300654f = p0Var;
        this.f300655g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.z22 z22Var = this.f300652d;
        java.lang.String str = z22Var.f391629f;
        if (str != null) {
            jn2.r0 r0Var = this.f300653e;
            boolean contains = r0Var.f300679h.contains(str);
            java.util.Set set = r0Var.f300679h;
            if (contains) {
                set.remove(str);
            } else {
                set.add(str);
            }
            this.f300654f.f300663d.setChecked(set.contains(str));
            yz5.p pVar = r0Var.f300680i;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(this.f300655g), z22Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
