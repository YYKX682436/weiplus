package qt2;

/* loaded from: classes2.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.b0 f366546d;

    public a0(qt2.b0 b0Var) {
        this.f366546d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$refreshDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qt2.b0.a7(this.f366546d, 4);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$refreshDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
