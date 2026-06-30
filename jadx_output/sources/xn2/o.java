package xn2;

/* loaded from: classes2.dex */
public final class o implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f455538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455539e;

    public o(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, xn2.p0 p0Var) {
        this.f455538d = baseFinderFeed;
        this.f455539e = p0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (this.f455538d.N0()) {
            return;
        }
        xn2.p0 p0Var = this.f455539e;
        g4Var.j(99, p0Var.f455543a.getResources().getString(com.tencent.mm.R.string.gyz), com.tencent.mm.R.raw.finder_feed_dislike_new, p0Var.f455543a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_8), false);
    }
}
