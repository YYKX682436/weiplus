package cs0;

/* loaded from: classes14.dex */
public final class c implements cs0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView f222036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f222037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f222038c;

    public c(com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView, java.lang.Integer num, int i17) {
        this.f222036a = cameraFocusAndMeteringView;
        this.f222037b = num;
        this.f222038c = i17;
    }

    public void a(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMoveFinish >> ");
        com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f222036a;
        sb6.append(cameraFocusAndMeteringView.f68892r);
        sb6.append(", ");
        java.lang.Integer toDur = this.f222037b;
        sb6.append(toDur);
        sb6.append(' ');
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", sb6.toString());
        if (z17) {
            kotlin.jvm.internal.o.f(toDur, "$toDur");
            int intValue = toDur.intValue();
            int i17 = cameraFocusAndMeteringView.f68892r;
            int i18 = this.f222038c;
            if (intValue < i17) {
                cs0.b bVar = cameraFocusAndMeteringView.f68881d;
                if (bVar != null) {
                    ((com.tencent.mm.media.camera.view.CameraKitView) bVar).l(i18);
                }
            } else {
                cs0.b bVar2 = cameraFocusAndMeteringView.f68881d;
                if (bVar2 != null) {
                    ((com.tencent.mm.media.camera.view.CameraKitView) bVar2).k(i18);
                }
            }
            kotlin.jvm.internal.o.f(toDur, "$toDur");
            cameraFocusAndMeteringView.f68892r = toDur.intValue();
        }
        cameraFocusAndMeteringView.f68893s = false;
    }
}
