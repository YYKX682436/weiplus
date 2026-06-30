package g72;

/* loaded from: classes14.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g72.w f269247d;

    public v(g72.w wVar) {
        this.f269247d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        g72.z zVar = this.f269247d.f269249e;
        if (zVar != null) {
            g72.x xVar = (g72.x) zVar;
            xVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "set result and return to FaceDetectPrepareUI");
            com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI = xVar.f269251a;
            faceDetectUI.f100086w = true;
            faceDetectUI.T6(0, 0, "collect data ok", null);
        }
    }
}
