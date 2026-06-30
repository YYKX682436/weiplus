package kp3;

/* loaded from: classes10.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f311039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f311040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f311041f;

    public s(kp3.x xVar, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2) {
        this.f311039d = xVar;
        this.f311040e = f0Var;
        this.f311041f = f0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f311040e.f310116d;
        int i18 = this.f311041f.f310116d;
        kp3.x xVar = this.f311039d;
        if (xVar.f311060s <= 0.0f || xVar.f311061t <= 0.0f) {
            xVar.f311060s = i17 * 0.5f;
            xVar.f311061t = i18 * 0.54f;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[setFocusOn] run： " + xVar.f311060s + ", " + xVar.f311061t + " , screen： " + i17 + ", " + i18);
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout = xVar.f311051g;
        if (cameraKitRecordViewLayout != null) {
            float f17 = xVar.f311060s;
            float f18 = xVar.f311061t;
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecordViewLayout", "focusOn >> " + f17 + "  " + f18);
            cameraKitRecordViewLayout.f155807f.h(f17, f18);
        }
    }
}
