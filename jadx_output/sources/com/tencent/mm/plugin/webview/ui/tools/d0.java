package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.f0 f184089f;

    public d0(com.tencent.mm.plugin.webview.ui.tools.f0 f0Var, java.lang.String str, java.lang.String str2) {
        this.f184089f = f0Var;
        this.f184087d = str;
        this.f184088e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_media_callback_type", 1);
        intent.putExtra("key_pick_local_media_local_id", this.f184087d);
        java.lang.String str = this.f184088e;
        intent.putExtra("key_pick_local_media_thumb_local_id", str);
        com.tencent.mm.plugin.webview.ui.tools.f0 f0Var = this.f184089f;
        intent.putExtra("sourceType", f0Var.f184165e);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "thumbLocalId:%s", str);
        f0Var.f184166f.setResult(-1, intent);
        f0Var.f184166f.finish();
    }
}
