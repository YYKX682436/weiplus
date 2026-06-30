package te2;

/* loaded from: classes3.dex */
public final class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418510d;

    public w5(te2.p8 p8Var) {
        this.f418510d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.p8 p8Var = this.f418510d;
        p8Var.g7().setIconColor(p8Var.getContext().getResources().getColor(com.tencent.mm.R.color.Brand_100));
        p8Var.h7().setIconColor(p8Var.getContext().getResources().getColor(com.tencent.mm.R.color.aby));
        p8Var.i7().setVisibility(4);
        te2.p8.Q6(p8Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
