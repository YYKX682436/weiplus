package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class j2 extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.k2 f117154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f117155b;

    public j2(com.tencent.mm.plugin.finder.live.viewmodel.k2 k2Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f117154a = k2Var;
        this.f117155b = appCompatActivity;
    }

    @Override // com.tencent.xweb.s0
    public void o(com.tencent.xweb.WebView webView, java.lang.String str) {
        android.widget.TextView textView;
        com.tencent.mm.plugin.finder.live.viewmodel.k2 k2Var = this.f117154a;
        com.tencent.mars.xlog.Log.i(k2Var.f117176d, "onReceivedTitle title:" + str + ' ' + this.f117155b);
        if ((str == null || str.length() == 0) || kotlin.jvm.internal.o.b(k2Var.f117178f, str)) {
            return;
        }
        ((yg0.s3) ((zg0.b3) i95.n0.c(zg0.b3.class))).getClass();
        if (com.tencent.mm.plugin.webview.luggage.util.g.d(str) || r26.i0.y(str, "about:blank", false) || (textView = k2Var.f117182m) == null) {
            return;
        }
        textView.setText(str);
    }
}
