package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f137250d;

    public s(android.app.Activity activity) {
        this.f137250d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        vz2.c.k("msgVerify", "camera or mic 正在被占用");
        vz2.c.b().B = 1;
        vz2.c.f(90033);
        android.content.Intent b76 = com.tencent.mm.plugin.flash.FaceFlashUI.b7(4, 90033, "finish by voip call");
        android.app.Activity activity = this.f137250d;
        activity.setResult(1, b76);
        activity.finish();
    }
}
