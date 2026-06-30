package g72;

/* loaded from: classes14.dex */
public class s implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectUI f269244d;

    public s(com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI) {
        this.f269244d = faceDetectUI;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "service connected %s", componentName);
        com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI = this.f269244d;
        faceDetectUI.f100085v = true;
        com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService faceDetectProcessService = ((f72.e) iBinder).f260042d;
        faceDetectUI.f100083t = faceDetectProcessService;
        com.tencent.mm.plugin.facedetect.model.y yVar = com.tencent.mm.plugin.facedetect.model.y.INSTANCE;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectManager", "bindService process name: %s, hashCode: %d", com.tencent.mm.sdk.platformtools.t8.W(com.tencent.mm.sdk.platformtools.x2.f193071a, android.os.Process.myPid()), java.lang.Integer.valueOf(yVar.hashCode()));
        yVar.f100043d = faceDetectProcessService;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "FaceDetectUI service hashCode: %d", java.lang.Integer.valueOf(this.f269244d.f100083t.hashCode()));
        com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI2 = this.f269244d;
        faceDetectUI2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "start");
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "startFaceDetect ");
        android.view.WindowManager.LayoutParams attributes = faceDetectUI2.getWindow().getAttributes();
        if (attributes.screenBrightness < 0.9f) {
            attributes.screenBrightness = 0.9f;
            faceDetectUI2.getWindow().setAttributes(attributes);
        }
        com.tencent.mm.plugin.facedetect.views.FaceScanRect faceScanRect = faceDetectUI2.f100081r;
        faceScanRect.f100168y = i72.v.INIT;
        i72.v vVar = i72.v.OPENED;
        android.view.View view = faceScanRect.f100167x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "startScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "startScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        faceScanRect.f100150d.setBackgroundResource(com.tencent.mm.R.drawable.c2a);
        faceScanRect.f100167x.startAnimation(faceScanRect.f100164u);
        for (android.widget.ImageView imageView : faceScanRect.f100159p) {
            imageView.clearAnimation();
            imageView.setBackgroundColor(faceScanRect.getResources().getColor(com.tencent.mm.R.color.aaw));
        }
        faceScanRect.f100168y = vVar;
        faceDetectUI2.f100080q.f100120e.f100113d = false;
        faceDetectUI2.f100081r.setVisibility(0);
        faceDetectUI2.f100081r.getTop();
        faceDetectUI2.f100081r.getRight();
        faceDetectUI2.f100081r.getLeft();
        faceDetectUI2.f100081r.getBottom();
        faceDetectUI2.f100075i = true;
        faceDetectUI2.f100076m = false;
        g72.a0 a0Var = faceDetectUI2.f100074h;
        synchronized (a0Var) {
            a0Var.f269224a = false;
        }
        if (faceDetectUI2.f100075i) {
            faceDetectUI2.f100087x = new g72.t(faceDetectUI2);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: start preview");
            i72.z zVar = faceDetectUI2.f100087x;
            com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView = faceDetectUI2.f100080q;
            faceDetectView.f100119d.H(new i72.r(faceDetectView, zVar));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "service disconnected %s", componentName.toString());
        this.f269244d.f100085v = false;
    }
}
