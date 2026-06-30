package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class t0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f137182d;

    public t0(android.app.Activity activity) {
        this.f137182d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        vz2.c.k("msgVerify", "camera or mic 正在被占用");
        vz2.c.c().f56217s = 1;
        vz2.c.h(90033);
        android.content.Intent c76 = com.tencent.mm.plugin.flash.action.FaceFlashActionUI.c7(4, 90030, "finish by voip call");
        android.app.Activity activity = this.f137182d;
        activity.setResult(1, c76);
        activity.finish();
    }
}
