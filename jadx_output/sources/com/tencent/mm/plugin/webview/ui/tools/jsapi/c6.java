package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class c6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f185024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f185025h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f185026i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f185027m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185028n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f185029o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185030p;

    public c6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, java.lang.String str3, boolean z17) {
        this.f185030p = c1Var;
        this.f185021d = y2Var;
        this.f185022e = str;
        this.f185023f = str2;
        this.f185024g = i17;
        this.f185025h = i18;
        this.f185026i = i19;
        this.f185027m = i27;
        this.f185028n = str3;
        this.f185029o = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f185030p.h7(this.f185021d, this.f185022e, this.f185023f, this.f185024g, this.f185025h, this.f185026i, this.f185027m, this.f185028n, this.f185029o);
    }
}
