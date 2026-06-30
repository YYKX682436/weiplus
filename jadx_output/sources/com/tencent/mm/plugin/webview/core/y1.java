package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class y1 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f182024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f182025b;

    public y1(com.tencent.mm.plugin.webview.core.e3 e3Var, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f182024a = e3Var;
        this.f182025b = mMWebView;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://");
    }

    @Override // rw4.a
    public boolean f(java.lang.String urlOrig) {
        kotlin.jvm.internal.o.g(urlOrig, "urlOrig");
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f182024a;
        java.lang.String stringExtra = e3Var.d0().getStringExtra("sentUsername");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int k07 = e3Var.k0(stringExtra);
        java.lang.String w17 = o25.z.w(urlOrig);
        if (!o25.z.q(w17, e3Var.K1)) {
            return false;
        }
        try {
            if (kotlin.jvm.internal.o.b("weixin://dl/shopping", w17)) {
                java.lang.String m37 = e3Var.e0().m3();
                kotlin.jvm.internal.o.f(m37, "getJDUrl(...)");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(m37)) {
                    zg0.q2.b(this.f182024a, m37, null, false, 6, null);
                }
            } else if (kotlin.jvm.internal.o.b("weixin://dl/faq", w17)) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.iz_, java.lang.Integer.valueOf(e3Var.e0().J3()), java.lang.Integer.valueOf(e3Var.e0().fd()));
                kotlin.jvm.internal.o.f(string, "getString(...)");
                zg0.q2.b(this.f182024a, string, null, false, 6, null);
            } else if (kotlin.jvm.internal.o.b("weixin://dl/posts", w17)) {
                e3Var.e0().Ri();
            } else if (kotlin.jvm.internal.o.b("weixin://dl/moments", w17)) {
                e3Var.e0().Y2();
            } else {
                kotlin.jvm.internal.o.d(w17);
                if (r26.i0.y(w17, "weixin://dl/feedback", false)) {
                    kotlin.jvm.internal.o.f(e3Var.e0().Ge(w17), "getFeedbackUrl(...)");
                } else if (kotlin.jvm.internal.o.b("weixin://dl/scan", w17)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_scan_report_enter_scene", 27);
                    j45.l.k(e3Var.Y(), "scanner", ".ui.BaseScanUI", intent, false);
                } else {
                    o25.z.m(this.f182025b.getActivityContextIfHas(), w17);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.o.d(w17);
            arrayList.add(w17);
            arrayList.add("1");
            arrayList.add(java.lang.String.valueOf(k07));
            java.lang.String stringExtra2 = e3Var.d0().getStringExtra("sentUsername");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            arrayList.add(stringExtra2);
            java.lang.String i17 = e3Var.i();
            if (i17 != null) {
                str = i17;
            }
            arrayList.add(str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.l(11405, arrayList);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(e3Var.o1(), "kv report fail, ex = %s", e17.getMessage());
        }
        return true;
    }
}
