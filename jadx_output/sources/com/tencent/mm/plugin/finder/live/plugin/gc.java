package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gc implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f112677d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f112678e;

    /* renamed from: f, reason: collision with root package name */
    public final cm2.t f112679f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f112680g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f112681h;

    public gc(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f112677d = context;
        this.f112678e = basePlugin;
        this.f112679f = tVar;
        this.f112680g = "FinderLiveBulkBuyBubble";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e97, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f112681h = (android.view.ViewGroup) inflate;
    }

    public static final void a(com.tencent.mm.plugin.finder.live.plugin.gc gcVar, r45.hw0 hw0Var, java.lang.String str) {
        gcVar.getClass();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327264s;
        cl0.g gVar = new cl0.g();
        ml2.f4 f4Var = ml2.f4.f327431e;
        gVar.o("commerceAction", com.tencent.mm.plugin.appbrand.jsapi.p6.CTRL_INDEX);
        gVar.p(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, hw0Var.getLong(0));
        gVar.h("request_id", hw0Var.getString(23));
        gVar.h("extra_report_json", hw0Var.getString(22));
        if (str.length() > 0) {
            gVar.h("btn_word", str);
        }
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f112679f;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(cm2.i0 r25) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.gc.b(cm2.i0):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.bys;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.i0) {
            b((cm2.i0) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        return this.f112681h;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.i0) {
            cm2.i0 i0Var = (cm2.i0) data;
            b(i0Var);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f327264s;
            cl0.g gVar = new cl0.g();
            ml2.f4 f4Var = ml2.f4.f327431e;
            gVar.o("commerceAction", 1082);
            r45.hw0 hw0Var = i0Var.f43354v;
            gVar.p(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, hw0Var.getLong(0));
            gVar.h("request_id", hw0Var.getString(23));
            gVar.h("extra_report_json", hw0Var.getString(22));
            ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.hhj;
    }
}
