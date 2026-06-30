package zl2;

/* loaded from: classes.dex */
public final class l4 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f473882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f473883e;

    public l4(boolean z17, yz5.p pVar) {
        this.f473882d = z17;
        this.f473883e = pVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.g33 req = (r45.g33) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        zl2.q4 q4Var = zl2.q4.f473933a;
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", "[configFeedDanmakuOpenState], open:" + this.f473882d + ", ret:" + ret.getInteger(1));
        this.f473883e.invoke(req, ret);
    }
}
