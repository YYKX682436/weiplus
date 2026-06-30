package dn2;

/* loaded from: classes3.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn2.l0 f241936d;

    public k0(dn2.l0 l0Var) {
        this.f241936d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingConsumedItem$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mm2.f6 f6Var = (mm2.f6) dk2.ef.f233372a.i(mm2.f6.class);
        boolean z17 = false;
        if (f6Var != null && f6Var.f329035i) {
            z17 = true;
        }
        dn2.l0 l0Var = this.f241936d;
        if (z17) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null) {
                k0Var.statusChange(qo0.b.f365349f2, null);
            }
        } else {
            l0Var.getClass();
            com.tencent.mars.xlog.Log.e("ShoppingConsumedItem", "clicked but shopping not available!");
        }
        l0Var.e(2);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingConsumedItem$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
