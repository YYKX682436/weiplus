package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class i70 implements com.tencent.mm.plugin.finder.view.sr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.l70 f134711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f134712c;

    public i70(in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.l70 l70Var, java.util.List list) {
        this.f134710a = s0Var;
        this.f134711b = l70Var;
        this.f134712c = list;
    }

    @Override // com.tencent.mm.plugin.finder.view.sr
    public void a(com.tencent.mm.plugin.finder.view.tr optionItem, android.content.Context context) {
        kotlin.jvm.internal.o.g(optionItem, "optionItem");
        kotlin.jvm.internal.o.g(context, "context");
        in5.s0 s0Var = this.f134710a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = s0Var != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? baseFinderFeed : null;
        if (baseFinderFeed2 == null) {
            com.tencent.mars.xlog.Log.i("FinderSubtitleSettingUIC", "subtitleSettingClick onOptionSelected  item is null");
            return;
        }
        java.lang.String str = optionItem.f133148a;
        boolean b17 = kotlin.jvm.internal.o.b(str, "self_open_subtitle");
        java.util.List list = this.f134712c;
        com.tencent.mm.plugin.finder.viewmodel.component.l70 l70Var = this.f134711b;
        if (b17) {
            l70Var.U6(s0Var, baseFinderFeed2, false);
            this.f134711b.R6(context, baseFinderFeed2, "view_clk", list.size(), "40000");
        } else if (kotlin.jvm.internal.o.b(str, "self_close_subtitle")) {
            l70Var.U6(s0Var, baseFinderFeed2, true);
            this.f134711b.R6(context, baseFinderFeed2, "view_clk", list.size(), "30000");
        }
    }
}
