package ff2;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f261637d;

    public b(yz5.a aVar) {
        this.f261637d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/util/FinderLiveAnchorMilestoneUIUtil$insertMilestoneCards$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = this.f261637d;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/util/FinderLiveAnchorMilestoneUIUtil$insertMilestoneCards$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
