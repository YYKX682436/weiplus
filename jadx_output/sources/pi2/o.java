package pi2;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.p f354798d;

    public o(pi2.p pVar) {
        this.f354798d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangeToastPanel$initContentView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pi2.p pVar = this.f354798d;
        com.tencent.mm.plugin.finder.live.widget.e0.t(pVar, false, 1, null);
        pVar.H.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangeToastPanel$initContentView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
