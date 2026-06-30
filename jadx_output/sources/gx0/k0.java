package gx0;

/* loaded from: classes5.dex */
public final class k0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u0 f276605d;

    public k0(gx0.u0 u0Var) {
        this.f276605d = u0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        cx0.c cVar = (cx0.c) obj;
        gx0.u0 u0Var = this.f276605d;
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment l76 = u0Var.a8().l7();
        if (cVar.a() && (!cVar.f224501b.isEmpty()) && l76 == null) {
            u0Var.q7("");
        }
    }
}
