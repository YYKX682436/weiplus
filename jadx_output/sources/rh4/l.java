package rh4;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh4.m f395761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395762e;

    public l(rh4.m mVar, int i17) {
        this.f395761d = mVar;
        this.f395762e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rh4.m mVar = this.f395761d;
        boolean E0 = mVar.getRecyclerView().E0();
        int i17 = this.f395762e;
        if (E0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "isComputingLayout");
            if (mVar.f395766y < 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "notifyItemRangeChangedDelay");
                mVar.postDelayed(new rh4.l(mVar, i17), 300L);
            }
            mVar.f395766y++;
            return;
        }
        mVar.f395766y = 0;
        androidx.recyclerview.widget.f2 adapter = mVar.getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyItemRangeChanged(0, i17);
        }
    }
}
