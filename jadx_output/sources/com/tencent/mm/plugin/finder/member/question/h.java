package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.question.s f121326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f121327e;

    public h(com.tencent.mm.plugin.finder.member.question.s sVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f121326d = sVar;
        this.f121327e = baseFinderFeed;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.member.question.s sVar = this.f121326d;
            boolean g17 = sVar.g();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f121327e;
            if (g17) {
                if (baseFinderFeed.getFeedObject().getStickyTime() == 0) {
                    g4Var.a(4, com.tencent.mm.R.string.f8k);
                } else {
                    g4Var.a(5, com.tencent.mm.R.string.lsu);
                }
            }
            if (sVar.g() || hc2.b0.j(baseFinderFeed, sVar.f121344d)) {
                g4Var.a(1, com.tencent.mm.R.string.f490367t0);
            }
            if (!hc2.b0.j(baseFinderFeed, sVar.f121344d)) {
                g4Var.a(2, com.tencent.mm.R.string.f490394tr);
            }
            if (!hc2.b0.j(baseFinderFeed, sVar.f121344d) && baseFinderFeed.getFeedObject().isQAFeed() && sVar.g()) {
                g4Var.a(6, com.tencent.mm.R.string.mqk);
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                g4Var.a(3, com.tencent.mm.R.string.f490364sx);
            }
        }
    }
}
