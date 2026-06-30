package kl2;

/* loaded from: classes3.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.n f308782d;

    public h(kl2.n nVar) {
        this.f308782d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kl2.n nVar = this.f308782d;
        il2.r rVar = (il2.r) nVar.f308791h;
        rVar.getClass();
        ((mm2.v5) rVar.P0(mm2.v5.class)).f329488n.postValue(mm2.r5.f329380a);
        nVar.a();
        il2.s.f292086a.a(zl2.e5.f473739f, nVar.f308797q);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
