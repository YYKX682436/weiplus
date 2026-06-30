package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f183099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.y2 f183101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f183102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.jv5 f183103h;

    public s2(int i17, int i18, com.tencent.mm.plugin.webview.model.y2 y2Var, java.util.ArrayList arrayList, r45.jv5 jv5Var) {
        this.f183099d = i17;
        this.f183100e = i18;
        this.f183101f = y2Var;
        this.f183102g = arrayList;
        this.f183103h = jv5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f183099d != 0 || this.f183100e != 0) {
            com.tencent.mm.plugin.webview.model.y2 y2Var = this.f183101f;
            y2Var.a(this.f183103h, y2Var.f183195c, y2Var.f183198f, y2Var.f183199g, y2Var.f183200h);
        } else {
            com.tencent.mm.plugin.webview.model.y2 y2Var2 = this.f183101f;
            y2Var2.f183198f.clear();
            y2Var2.f183198f.addAll(this.f183102g);
        }
    }
}
