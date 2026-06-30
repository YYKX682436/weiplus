package nr2;

/* loaded from: classes2.dex */
public final class z0 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f339332a;

    public z0(nr2.i1 i1Var) {
        this.f339332a = i1Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        nr2.i1 i1Var = this.f339332a;
        i1Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPresenter", "requestLoadMore CgiFinderGetTopicFeed");
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        q6Var.f410556b = 16;
        nr2.m mVar = i1Var.f339215f;
        q6Var.f410559e = mVar != null ? mVar.l() : 0L;
        q6Var.f410555a = i1Var.f339216g;
        kotlinx.coroutines.l.d(i1Var.f339214e, null, null, new nr2.g1(i1Var, q6Var, null), 3, null);
        return true;
    }
}
