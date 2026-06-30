package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187155d;

    public d3(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, android.os.Bundle bundle) {
        this.f187155d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f187155d;
        int i17 = bundle != null ? bundle.getInt("key_image_pos", -1) : -1;
        int i18 = bundle != null ? bundle.getInt("key_webview_id", -1) : -1;
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        px4.a.f358955a.a(i18, i17);
    }
}
