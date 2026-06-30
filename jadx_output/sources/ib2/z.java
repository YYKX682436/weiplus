package ib2;

/* loaded from: classes2.dex */
public final class z implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ib2.i0 f290180a;

    public z(ib2.i0 i0Var) {
        this.f290180a = i0Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        ib2.i0 i0Var = this.f290180a;
        i0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPresenter", "requestLoadMore CgiFinderGetTopicFeed");
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        r45.vx0 vx0Var = i0Var.f290124f;
        int integer = vx0Var != null ? vx0Var.getInteger(21) : 0;
        q6Var.f410556b = integer;
        if (integer <= 0) {
            q6Var.f410556b = 16;
        }
        r45.vx0 vx0Var2 = i0Var.f290124f;
        q6Var.f410559e = vx0Var2 != null ? vx0Var2.getLong(0) : 0L;
        q6Var.f410555a = i0Var.f290125g;
        kotlinx.coroutines.l.d(i0Var.f290123e, null, null, new ib2.g0(i0Var, q6Var, null), 3, null);
        return true;
    }
}
