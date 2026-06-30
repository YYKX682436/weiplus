package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f183193a;

    /* renamed from: b, reason: collision with root package name */
    public final fl1.c0 f183194b;

    /* renamed from: c, reason: collision with root package name */
    public final fl1.o f183195c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.e3 f183196d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jv5 f183197e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f183198f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f183199g;

    /* renamed from: h, reason: collision with root package name */
    public int f183200h;

    /* renamed from: i, reason: collision with root package name */
    public int f183201i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f183202j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f183203k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.f3 f183204l;

    public y2(com.tencent.mm.plugin.webview.model.f3 f3Var, android.content.Context context, fl1.c0 container) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(container, "container");
        this.f183204l = f3Var;
        this.f183193a = context;
        this.f183194b = container;
        com.tencent.mm.plugin.webview.model.p2 p2Var = new com.tencent.mm.plugin.webview.model.p2(this);
        com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var = new com.tencent.mm.plugin.appbrand.platform.window.activity.r0();
        r0Var.G(r0Var.f87645d);
        this.f183195c = new fl1.o(context, r0Var, p2Var);
        this.f183198f = new java.util.ArrayList();
        this.f183202j = "";
        this.f183203k = "";
    }

    public final void a(r45.jv5 jv5Var, fl1.o oVar, java.util.List list, boolean z17, int i17) {
        oVar.setSelectListItem(list);
        android.content.Context context = this.f183193a;
        if (!z17 && i17 > list.size()) {
            oVar.setFunctionButtonText(context.getResources().getString(com.tencent.mm.R.string.l8a));
            oVar.setFunctionButtonTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479308vo));
            oVar.setFunctionButtonOnClickListener(new com.tencent.mm.plugin.webview.model.o2(this, this.f183204l));
        } else {
            if (z17) {
                oVar.setFunctionButtonText("");
            } else {
                oVar.setFunctionButtonText(context.getResources().getString(com.tencent.mm.R.string.l8a));
                oVar.setFunctionButtonTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
            }
            oVar.setFunctionButtonOnClickListener(null);
        }
    }
}
