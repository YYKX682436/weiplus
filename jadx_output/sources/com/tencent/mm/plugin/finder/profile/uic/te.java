package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class te extends zx2.y {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124235a;

    public te(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC tabUIC) {
        kotlin.jvm.internal.o.g(tabUIC, "tabUIC");
        this.f124235a = tabUIC;
    }

    @Override // zx2.y, zx2.z
    public void a(android.content.Context context, zx2.i tab) {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        super.a(context, tab);
        com.tencent.mars.xlog.Log.i("Finder.FinderTabViewAction", "TabViewAction super.onTabSelected after");
        tab.e(true);
        if (((com.tencent.mm.plugin.finder.profile.uic.re) tab).f477051i == com.tencent.mm.R.string.f3s) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            o3Var.Lk(context, false, o3Var.f125218q);
        }
        if (tab.f477041b == 70) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment D7 = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) a17).D7(com.tencent.mm.plugin.finder.profile.uic.FinderProfileEmojiFragment.class);
            if (D7 != null && (finderEmojiListUIC2 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC) zVar.b(D7).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.class)) != null) {
                finderEmojiListUIC2.T6();
            }
        } else {
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a18 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment D72 = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) a18).D7(com.tencent.mm.plugin.finder.profile.uic.FinderProfileEmojiFragment.class);
            if (D72 != null && (finderEmojiListUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC) zVar2.b(D72).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.class)) != null) {
                finderEmojiListUIC.f133552x = false;
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("page_out", finderEmojiListUIC, finderEmojiListUIC.R6(), 10, false);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderTabViewAction", "TabViewAction onTabSelected before");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124235a;
        finderProfileTabUIC.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.dg(tab, finderProfileTabUIC));
    }

    @Override // zx2.y, zx2.z
    public void b(android.content.Context context, zx2.i tab) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        super.b(context, tab);
        tab.e(false);
    }
}
