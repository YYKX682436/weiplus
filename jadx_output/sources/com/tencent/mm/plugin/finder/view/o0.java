package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class o0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f132753d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f132754e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.y0 f132755f;

    /* renamed from: g, reason: collision with root package name */
    public final int f132756g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.p0 f132757h;

    public o0(android.content.Context context, com.tencent.mm.plugin.finder.storage.FinderItem feedObject, so2.y0 commentItem, int i17, int i18, com.tencent.mm.plugin.finder.view.p0 p0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        this.f132753d = context;
        this.f132754e = feedObject;
        this.f132755f = commentItem;
        this.f132756g = i18;
        this.f132757h = p0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            com.tencent.mm.plugin.finder.view.p0 p0Var = this.f132757h;
            so2.y0 y0Var = this.f132755f;
            if (itemId == 17) {
                if (p0Var != null) {
                    p0Var.f(y0Var);
                    return;
                }
                return;
            }
            if (itemId == 13) {
                if (p0Var != null) {
                    p0Var.d(y0Var, false);
                    return;
                }
                return;
            }
            if (itemId == 14) {
                if (p0Var != null) {
                    p0Var.d(y0Var, true);
                    return;
                }
                return;
            }
            if (itemId == 6) {
                if (p0Var != null) {
                    p0Var.a(y0Var, false);
                    return;
                }
                return;
            }
            if (itemId == 7) {
                if (p0Var != null) {
                    p0Var.a(y0Var, true);
                    return;
                }
                return;
            }
            if (itemId == 0) {
                java.lang.String i18 = y0Var.i();
                if (com.tencent.mm.sdk.platformtools.t8.K0(i18)) {
                    return;
                }
                com.tencent.mm.sdk.platformtools.b0.e(i18);
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490361st, 0).show();
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                long t07 = y0Var.f410703d.t0();
                o3Var.getClass();
                com.tencent.mm.autogen.events.FinderCommentReportEvent finderCommentReportEvent = new com.tencent.mm.autogen.events.FinderCommentReportEvent();
                am.wa waVar = finderCommentReportEvent.f54266g;
                waVar.f8273a = 5;
                waVar.f8274b = t07;
                finderCommentReportEvent.e();
                return;
            }
            int i19 = this.f132756g;
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = this.f132754e;
            android.content.Context context = this.f132753d;
            if (itemId == 5) {
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                com.tencent.mm.plugin.finder.storage.yj0 comment = y0Var.f410703d;
                com.tencent.mm.plugin.finder.view.k0 k0Var = new com.tencent.mm.plugin.finder.view.k0();
                kotlin.jvm.internal.o.g(feedObject, "feedObject");
                kotlin.jvm.internal.o.g(comment, "comment");
                nv2.n1.f340551h.e(feedObject.getId(), feedObject.getDupFlag(), feedObject.getObjectNonceId(), comment, nv2.x1.f340628f, (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.j().r()).intValue() == 1 || com.tencent.mm.plugin.finder.storage.t70.M != 1) ? i19 : 1, k0Var, V6, hc2.o0.H(feedObject.getFeedObject()), null, 0, null);
                return;
            }
            if (itemId == 1) {
                if (p0Var != null) {
                    p0Var.c(y0Var);
                }
                com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                long t08 = y0Var.f410703d.t0();
                o3Var2.getClass();
                com.tencent.mm.autogen.events.FinderCommentReportEvent finderCommentReportEvent2 = new com.tencent.mm.autogen.events.FinderCommentReportEvent();
                am.wa waVar2 = finderCommentReportEvent2.f54266g;
                waVar2.f8273a = 4;
                waVar2.f8274b = t08;
                finderCommentReportEvent2.e();
                return;
            }
            if (itemId == 2) {
                if (p0Var != null) {
                    p0Var.e(y0Var);
                }
                com.tencent.mm.plugin.finder.report.o3 o3Var3 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                long t09 = y0Var.f410703d.t0();
                o3Var3.getClass();
                com.tencent.mm.autogen.events.FinderCommentReportEvent finderCommentReportEvent3 = new com.tencent.mm.autogen.events.FinderCommentReportEvent();
                am.wa waVar3 = finderCommentReportEvent3.f54266g;
                waVar3.f8273a = 6;
                waVar3.f8274b = t09;
                finderCommentReportEvent3.e();
                return;
            }
            if (itemId == 3) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3 o3Var4 = (com.tencent.mm.plugin.finder.report.o3) c17;
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                com.tencent.mm.plugin.finder.report.o3.Mj(o3Var4, context2, 11L, 4L, false, 0, 0, null, 120, null);
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
                k0Var2.r(context.getString(com.tencent.mm.R.string.ckh), 17, i65.a.b(context, 14), null);
                k0Var2.f211872n = new com.tencent.mm.plugin.finder.view.m0(context, this);
                k0Var2.f211881s = new com.tencent.mm.plugin.finder.view.n0(this);
                k0Var2.f211892z = new com.tencent.mm.plugin.finder.view.h0(y0Var, feedObject, context, i19);
                k0Var2.v();
                return;
            }
            if (itemId != 4) {
                if (itemId == 999) {
                    com.tencent.mm.plugin.finder.storage.yj0 yj0Var = y0Var.f410703d;
                    com.tencent.mm.sdk.platformtools.b0.e(yj0Var != null ? yj0Var.toString() : null);
                    return;
                }
                return;
            }
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var5 = (com.tencent.mm.plugin.finder.report.o3) c18;
            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            com.tencent.mm.plugin.finder.report.o3.Mj(o3Var5, context3, 11L, 111L, false, 0, 0, null, 120, null);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y yVar = hb2.y.f280114e;
            long itemId2 = y0Var.getItemId();
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = y0Var.f410703d;
            long j17 = yj0Var2.field_feedId;
            java.lang.String str = yj0Var2.field_objectNonceId;
            if (str == null) {
                str = "";
            }
            yVar.o(itemId2, j17, str, false, new com.tencent.mm.plugin.finder.view.l0(this));
        }
    }
}
