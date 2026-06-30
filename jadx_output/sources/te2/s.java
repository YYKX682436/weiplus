package te2;

/* loaded from: classes.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.t f418393d;

    public s(te2.t tVar) {
        this.f418393d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = this.f418393d.f418420i;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
