package com.tencent.mm.plugin.finder.member.all;

/* loaded from: classes2.dex */
public final class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f121074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.all.m f121075e;

    public e(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.member.all.m mVar) {
        this.f121074d = baseFinderFeed;
        this.f121075e = mVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.member.all.m mVar = this.f121075e;
            com.tencent.mm.ui.MMActivity mMActivity = mVar.f121088d;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f121074d;
            if (!hc2.b0.j(baseFinderFeed, mMActivity)) {
                g4Var.a(2, com.tencent.mm.R.string.f490394tr);
            }
            com.tencent.mm.ui.MMActivity mMActivity2 = mVar.f121088d;
            java.lang.String e17 = xy2.c.e(mMActivity2);
            java.lang.String str = mVar.f121089e;
            if ((kotlin.jvm.internal.o.b(str, e17) && baseFinderFeed.getFeedObject().isQAFeed()) || hc2.b0.j(baseFinderFeed, mMActivity2)) {
                g4Var.a(1, com.tencent.mm.R.string.f490367t0);
            }
            if (!hc2.b0.j(baseFinderFeed, mMActivity2) && baseFinderFeed.getFeedObject().isQAFeed() && kotlin.jvm.internal.o.b(str, xy2.c.e(mMActivity2))) {
                g4Var.a(4, com.tencent.mm.R.string.mqk);
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                g4Var.a(3, com.tencent.mm.R.string.f490364sx);
            }
        }
    }
}
