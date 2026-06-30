package kp3;

/* loaded from: classes14.dex */
public final class l implements ju3.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp3.x f311006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout f311007b;

    public l(kp3.x xVar, com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout) {
        this.f311006a = xVar;
        this.f311007b = cameraKitRecordViewLayout;
    }

    @Override // ju3.y
    public void a(byte[] data) {
        kotlin.jvm.internal.o.g(data, "data");
        kp3.x xVar = this.f311006a;
        if (xVar.f311055n.get() || xVar.f311054m.get() || xVar.f311053i.get() || xVar.f311050f == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new kp3.r(xVar, data), "PalmPrintProcess");
    }

    @Override // ju3.y
    public void b(android.util.Size previewSize) {
        kotlin.jvm.internal.o.g(previewSize, "previewSize");
        kp3.x xVar = this.f311006a;
        xVar.f311052h = previewSize;
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onFirstFrameReady], previewSize:" + previewSize + ", MIN_PREVIEW_SIZE_HEIGHT:800");
        if (previewSize.getHeight() <= 0 || previewSize.getWidth() <= 0) {
            xVar.f311055n.set(true);
            com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout = xVar.f311051g;
            if (cameraKitRecordViewLayout != null) {
                cameraKitRecordViewLayout.f();
            }
            jp3.g.f301000a.i(xVar.getActivity(), 80002, "ERR_PALM_INIT_CAMERA", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return;
        }
        if (previewSize.getHeight() >= 800) {
            xVar.f311055n.set(false);
            xVar.Q6(1);
            return;
        }
        xVar.f311055n.set(true);
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout2 = xVar.f311051g;
        if (cameraKitRecordViewLayout2 != null) {
            cameraKitRecordViewLayout2.f();
        }
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout3 = this.f311007b;
        android.content.Context context = cameraKitRecordViewLayout3.getContext();
        java.lang.String r17 = i65.a.r(cameraKitRecordViewLayout3.getContext(), com.tencent.mm.R.string.m4b);
        kp3.k kVar = new kp3.k(xVar);
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "[showAlert] error, context is null! errMsg:" + r17);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.a(false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(r17)) {
            r17 = context.getString(com.tencent.mm.R.string.f490391to);
        }
        u1Var.g(r17);
        u1Var.l(new jp3.f(kVar));
        u1Var.n(context.getString(com.tencent.mm.R.string.f490454vi));
        u1Var.q(false);
    }
}
