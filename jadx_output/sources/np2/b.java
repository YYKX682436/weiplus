package np2;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.square.operation.FinderLiveOperationFragment f338794d;

    public b(com.tencent.mm.plugin.finder.nearby.live.square.operation.FinderLiveOperationFragment finderLiveOperationFragment) {
        this.f338794d = finderLiveOperationFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/square/operation/FinderLiveOperationFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.nearby.live.square.operation.FinderLiveOperationFragment finderLiveOperationFragment = this.f338794d;
        if (currentTimeMillis - finderLiveOperationFragment.f121517u < 300) {
            finderLiveOperationFragment.z0();
        }
        finderLiveOperationFragment.f121517u = currentTimeMillis;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/square/operation/FinderLiveOperationFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
