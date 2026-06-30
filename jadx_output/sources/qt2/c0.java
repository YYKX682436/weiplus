package qt2;

/* loaded from: classes2.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.f0 f366556d;

    public c0(qt2.f0 f0Var) {
        this.f366556d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC$initContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f366556d.d7();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC$initContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
