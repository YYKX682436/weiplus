package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class p5 {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Bundle f183061a;

    public p5(com.tencent.mm.plugin.webview.model.b6 b6Var, android.os.Bundle bundle) {
        this.f183061a = bundle;
    }

    public void a(java.lang.String str, java.lang.Object obj) {
        android.os.Bundle bundle = this.f183061a;
        if (bundle != null) {
            if (obj instanceof java.lang.String) {
                bundle.putString(str, (java.lang.String) obj);
                return;
            }
            if (obj instanceof java.lang.Boolean) {
                bundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Integer) {
                bundle.putInt(str, ((java.lang.Integer) obj).intValue());
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebviewReporter", "put unknow type value.");
            }
        }
    }
}
