package te2;

/* loaded from: classes3.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418495d;

    public v5(te2.p8 p8Var) {
        this.f418495d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.p8 p8Var = this.f418495d;
        p8Var.h7().setIconColor(p8Var.getContext().getResources().getColor(com.tencent.mm.R.color.Brand_100));
        p8Var.i7().setVisibility(0);
        int a17 = te2.sc.f418412a.a(p8Var.f418329x0);
        int i17 = p8Var.I1;
        if (i17 != a17) {
            p8Var.U6(false, i17);
        }
        p8Var.U6(true, a17);
        p8Var.I1 = a17;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
