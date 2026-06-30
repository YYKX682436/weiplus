package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class ua implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f174350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174351e;

    public ua(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174350d = bitmap;
        this.f174351e = textStatusEditActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f174350d;
        int width = bitmap.getWidth();
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174351e;
        if (width != 0) {
            com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
            if (textStatusEditActivity.q7().getWidth() != 0) {
                float height = bitmap.getHeight() / bitmap.getWidth();
                float height2 = textStatusEditActivity.q7().getHeight() / textStatusEditActivity.q7().getWidth();
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "setForegroundPic vpic post end " + bitmap.getWidth() + ' ' + bitmap.getHeight() + ' ' + height + ' ' + textStatusEditActivity.q7().getWidth() + ' ' + textStatusEditActivity.q7().getHeight() + ' ' + height2);
                if (height > height2) {
                    textStatusEditActivity.J7(bitmap);
                    return;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setForegroundPic vpic post end ");
        sb6.append(bitmap.getWidth());
        sb6.append(' ');
        sb6.append(bitmap.getHeight());
        sb6.append(' ');
        com.tencent.mm.plugin.textstatus.ui.d8 d8Var2 = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
        sb6.append(textStatusEditActivity.q7().getWidth());
        sb6.append(' ');
        sb6.append(textStatusEditActivity.q7().getHeight());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", sb6.toString());
        um5.d dVar = new um5.d();
        dVar.b(bitmap);
        int width2 = textStatusEditActivity.q7().getWidth();
        int height3 = textStatusEditActivity.q7().getHeight();
        dVar.f429141b = width2;
        dVar.f429142c = height3;
        dVar.f429144e.f429193b.d();
        dVar.a(new com.tencent.mm.plugin.textstatus.ui.ta(textStatusEditActivity));
    }
}
