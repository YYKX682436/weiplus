package kp3;

/* loaded from: classes14.dex */
public final class j implements ju3.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp3.x f311002a;

    public j(kp3.x xVar) {
        this.f311002a = xVar;
    }

    @Override // ju3.x
    public void a(int i17, android.util.Range zoomRange) {
        kotlin.jvm.internal.o.g(zoomRange, "zoomRange");
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onOpenFinish] ret: " + i17 + ", zoomRange：" + zoomRange);
        if (i17 != 0) {
            kp3.x xVar = this.f311002a;
            xVar.f311055n.set(true);
            jp3.g.f301000a.i(xVar.getActivity(), 80002, "ERR_PALM_INIT_CAMERA", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
    }
}
