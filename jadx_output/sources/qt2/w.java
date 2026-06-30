package qt2;

/* loaded from: classes2.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.b0 f366627d;

    public w(qt2.b0 b0Var) {
        this.f366627d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$initClose$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qt2.b0 b0Var = this.f366627d;
        b0Var.c7(0L);
        com.tencent.mm.plugin.finder.report.y3.b(com.tencent.mm.plugin.finder.report.y3.f125472a, b0Var.getActivity(), 5, null, 4, null);
        b0Var.clear();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$initClose$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
