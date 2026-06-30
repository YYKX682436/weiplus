package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class x8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174427e;

    public x8(java.lang.String str, com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174426d = str;
        this.f174427e = textStatusEditActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap b17 = dj4.w.b(this.f174426d);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "handleFileLocal decodeImg bitmap:" + b17);
        com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174427e;
        textStatusEditActivity.getClass();
        if (b17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "setForegroundPic vpic post start " + b17 + " true");
            textStatusEditActivity.q7().post(new com.tencent.mm.plugin.textstatus.ui.ua(b17, textStatusEditActivity));
        }
    }
}
