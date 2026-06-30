package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class v9 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f133232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f133233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133234c;

    public v9(r45.h32 h32Var, com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, java.lang.String str) {
        this.f133232a = h32Var;
        this.f133233b = finderFeedLiveNoticeView;
        this.f133234c = str;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            cl0.g gVar = new cl0.g();
            gVar.s("source_type", 4);
            r45.h32 h32Var = this.f133232a;
            r45.q65 q65Var = (r45.q65) h32Var.getCustom(10);
            boolean z18 = false;
            gVar.s("pay_type", java.lang.Integer.valueOf((q65Var == null || !q65Var.getBoolean(0)) ? 0 : 1));
            java.lang.String string = h32Var.getString(8);
            if (string != null) {
                if (string.length() > 0) {
                    z18 = true;
                }
            }
            gVar.s("page_type", z18 ? "get_ticket" : "");
            com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView = this.f133233b;
            android.content.Context context = finderFeedLiveNoticeView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            cl0.g gVar2 = new cl0.g();
            gVar2.o("notice_type", 1);
            r45.ov2 a17 = zl2.t.a(h32Var);
            gVar2.h("coupon_id", a17 != null ? a17.getString(1) : null);
            i95.m c17 = i95.n0.c(c50.c1.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c50.c1 c1Var = (c50.c1) c17;
            ml2.i5 i5Var = ml2.i5.f327570e;
            java.lang.String str = this.f133234c;
            java.lang.String valueOf = java.lang.String.valueOf(V6.getInteger(5));
            java.lang.String string2 = h32Var.getString(3);
            c50.c1.l9(c1Var, i5Var, str, 0L, 0, valueOf, null, null, null, null, string2 == null ? "" : string2, gVar.toString(), h32Var.getString(4), gVar2.toString(), finderFeedLiveNoticeView.f131093p, V6.getInteger(5), null, 33248, null);
            com.tencent.mm.plugin.finder.report.l0 l0Var = com.tencent.mm.plugin.finder.report.l0.f125109a;
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(finderFeedLiveNoticeView.f131093p);
            java.lang.String string3 = h32Var.getString(4);
            com.tencent.mm.plugin.finder.report.l0.e(l0Var, V6, h17, 82, string3 == null ? "" : string3, 0, 16, null);
        }
    }
}
