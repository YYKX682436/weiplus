package df2;

/* loaded from: classes10.dex */
public final class jt extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230498b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt(df2.lt ltVar, java.lang.Class cls) {
        super(cls);
        this.f230498b = ltVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.iy2 result = (r45.iy2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String str = df2.lt.W;
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "onPollingSuccess");
        df2.lt ltVar = this.f230498b;
        ((mm2.c1) ltVar.business(mm2.c1.class)).f328820i3 = true;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = ltVar.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            com.tencent.mm.plugin.finder.live.util.y.n(k0Var, kotlinx.coroutines.q1.f310570c, null, new df2.ht(ltVar, result, null), 2, null);
        }
    }
}
