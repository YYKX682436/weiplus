package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class y8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f192013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.z8 f192014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192016g;

    public y8(boolean z17, com.tencent.mm.pluginsdk.ui.tools.z8 z8Var, java.lang.String str, java.lang.String str2) {
        this.f192013d = z17;
        this.f192014e = z8Var;
        this.f192015f = str;
        this.f192016g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f192013d;
        java.lang.String str = this.f192016g;
        java.lang.String str2 = this.f192015f;
        com.tencent.mm.pluginsdk.ui.tools.z8 z8Var = this.f192014e;
        if (z17) {
            z8Var.evaluateJavascript("javascript:document.getElementById('_edw_iframe_').src = '" + str2 + "' + " + str, null);
            return;
        }
        z8Var.evaluateJavascript("javascript:console.log('" + str2 + "' + " + str + ")", null);
    }
}
