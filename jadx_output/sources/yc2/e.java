package yc2;

/* loaded from: classes2.dex */
public final class e extends yc2.f {
    @Override // yc2.f, xc2.j, xc2.z2
    public void f(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.f(holder, jumpView, infoEx);
        android.view.View findViewById = jumpView.findViewById(com.tencent.mm.R.id.tdv);
        if (findViewById != null) {
            com.tencent.mm.plugin.finder.report.d2.f(com.tencent.mm.plugin.finder.report.d2.f124994a, findViewById, "finder_feed_avatar", null, 0, kz5.b1.e(new jz5.l("if_living", 1)), null, 44, null);
        }
    }

    @Override // yc2.f, xc2.o, xc2.j
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        xc2.c1 c1Var = infoEx.T;
        if (baseFinderFeed != null && c1Var != null) {
            com.tencent.mm.plugin.finder.assist.m3.f102381a.a(holder, baseFinderFeed, c1Var.c(), 5, c1Var.b(holder), true, 1);
        }
        super.r(holder, jumpView, infoEx);
    }
}
