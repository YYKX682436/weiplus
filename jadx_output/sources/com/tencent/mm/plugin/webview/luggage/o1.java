package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182586f;

    public o1(com.tencent.mm.plugin.webview.luggage.e0 e0Var, java.lang.String str, int i17) {
        this.f182586f = e0Var;
        this.f182584d = str;
        this.f182585e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182586f;
        if (e0Var.f182186t != null) {
            java.lang.String str = this.f182584d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                e0Var.f182186t.setTitleText(str);
            }
            int i17 = this.f182585e;
            if (i17 != 0) {
                e0Var.f182186t.setTitleColor(i17);
            }
        }
    }
}
