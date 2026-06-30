package kl2;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.g f308755d;

    public d(kl2.g gVar) {
        this.f308755d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveCloseRestrictConsumePanel$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        il2.s sVar = il2.s.f292086a;
        zl2.e5 e5Var = zl2.e5.f473746p;
        kl2.g gVar = this.f308755d;
        sVar.a(e5Var, gVar.f308781v);
        gVar.f308770h.n(new il2.a(2, gVar.f308779t, gVar.f308780u, new kl2.e(gVar)));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveCloseRestrictConsumePanel$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
