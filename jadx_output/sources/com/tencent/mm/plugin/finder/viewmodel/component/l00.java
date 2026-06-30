package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class l00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.le0 f135003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f135005f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135006g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135007h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.o00 f135008i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135009m;

    public l00(r45.le0 le0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, r45.qt2 qt2Var, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.viewmodel.component.o00 o00Var, in5.s0 s0Var) {
        this.f135003d = le0Var;
        this.f135004e = baseFinderFeed;
        this.f135005f = qt2Var;
        this.f135006g = str;
        this.f135007h = str2;
        this.f135008i = o00Var;
        this.f135009m = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC$checkShowClickSelfReadTips$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        r45.le0 le0Var = this.f135003d;
        lVarArr[0] = new jz5.l("main_status_interactive_icon_type", java.lang.Integer.valueOf(le0Var != null ? le0Var.getInteger(2) : 0));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135004e;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (str = feedObject2.getSessionBuffer()) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("session_buffer", str);
        lVarArr[2] = new jz5.l("feedid", pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        lVarArr[3] = new jz5.l("commentscene", java.lang.Integer.valueOf(this.f135005f.getInteger(5)));
        ((cy1.a) rVar).Bj("profile_feed_vv", "view_clk", kz5.c1.k(lVarArr), 1, false);
        android.content.Intent intent = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = this.f135006g;
        java.lang.String substring = str2.substring(0, r26.n0.L(str2, "=", 0, false, 6, null) + 1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append(this.f135007h);
        java.lang.String format = java.lang.String.format(sb6.toString() + "&from_page=2", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i(this.f135008i.f135406d, "rawUrl=".concat(format));
        intent.putExtra("rawUrl", format);
        j45.l.j(this.f135009m.f293121e, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC$checkShowClickSelfReadTips$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
