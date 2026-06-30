package fd2;

/* loaded from: classes2.dex */
public final class g implements com.tencent.mm.plugin.finder.view.om {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd2.j f261268a;

    public g(fd2.j jVar) {
        this.f261268a = jVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.om
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", "dislike edu tips click");
        fd2.j jVar = this.f261268a;
        in5.s0 s0Var = jVar.P6().f251270f;
        fd2.j.O6(jVar, "view_clk", s0Var != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i : null);
        yz5.a aVar = jVar.f261275f;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
