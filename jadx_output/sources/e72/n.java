package e72;

/* loaded from: classes14.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e72.v f249920d;

    public n(e72.v vVar) {
        this.f249920d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f249920d.f249944q) {
            e72.v vVar = this.f249920d;
            if (vVar.f249932e >= vVar.f249931d.length - 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "hy: already last. handle upper judge.");
                e72.v vVar2 = this.f249920d;
                vVar2.f249936i = true;
                com.tencent.mm.plugin.facedetect.model.y yVar = com.tencent.mm.plugin.facedetect.model.y.INSTANCE;
                com.tencent.mm.vfs.w6.N(vVar2.f249930c.f249893c, -1, -1);
                yVar.f100043d.f100044i.getClass();
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: set face data instance null!");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "hy: startShowNext");
                e72.v vVar3 = this.f249920d;
                vVar3.f249932e++;
                vVar3.f249933f = -1;
                vVar3.n(true);
                this.f249920d.o();
            }
        }
    }
}
