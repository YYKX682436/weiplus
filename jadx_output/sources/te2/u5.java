package te2;

/* loaded from: classes3.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418472d;

    public u5(te2.p8 p8Var) {
        this.f418472d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.p8 p8Var = this.f418472d;
        te2.p8.n7(p8Var, 10, 0, 2, null);
        te2.rc rcVar = p8Var.A1;
        r45.h32 h32Var = rcVar.f418391b;
        java.lang.Integer valueOf = h32Var != null ? java.lang.Integer.valueOf(h32Var.getInteger(18)) : null;
        r45.h32 h32Var2 = p8Var.f418320p1;
        if (h32Var2 == null) {
            h32Var2 = rcVar.f418391b;
        }
        if (h32Var2 != null) {
            ((com.tencent.mm.plugin.finder.live.widget.c80) ((jz5.n) p8Var.W).getValue()).e0(h32Var2, 1, new te2.t5(valueOf, p8Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
