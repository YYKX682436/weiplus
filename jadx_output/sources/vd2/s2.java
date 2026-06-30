package vd2;

/* loaded from: classes3.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.v2 f435910d;

    public s2(vd2.v2 v2Var) {
        this.f435910d = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        km2.r rVar;
        vd2.v2 v2Var = this.f435910d;
        v2Var.getClass();
        km2.n nVar = dk2.ef.H;
        if ((nVar == null || (rVar = nVar.f309151c) == null || rVar.f309207l != -1) ? false : true) {
            com.tencent.mars.xlog.Log.i("FinderLivePresenter", "refreshData but pullType is can't pull more");
        }
        com.tencent.mars.xlog.Log.i("FinderLivePresenter", "refreshData");
        vd2.v2.i(v2Var, 4, false, null, false, 12, null);
    }
}
