package fr2;

/* loaded from: classes2.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr2.p f265733d;

    public m(fr2.p pVar) {
        this.f265733d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC$showBottomBar$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fr2.p pVar = this.f265733d;
        kotlinx.coroutines.l.d(pVar.getLifecycleScope(), null, null, new fr2.l(pVar, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC$showBottomBar$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
