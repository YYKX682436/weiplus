package ei3;

/* loaded from: classes10.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.f f253036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei3.g f253037e;

    public e(ei3.g gVar, ei3.f fVar) {
        this.f253037e = gVar;
        this.f253036d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.g gVar = this.f253037e;
        com.tencent.mars.xlog.Log.i("MicroMsg.FrameBufProcessor", "process srcWidth %d srcHeight %d targetWidth %d targetHeight %d bufIndex: %d", java.lang.Integer.valueOf(gVar.f253047d), java.lang.Integer.valueOf(gVar.f253048e), java.lang.Integer.valueOf(gVar.f253049f), java.lang.Integer.valueOf(gVar.f253050g), java.lang.Integer.valueOf(gVar.f253046c));
        int i17 = gVar.f253051h;
        if (i17 == 21 || i17 == 2130706688) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.NV21ToYUV420XXAndScaleRotate(gVar.f253044a, gVar.f253045b, gVar.f253047d, gVar.f253048e, gVar.f253049f, gVar.f253050g, 1, gVar.f253055l, gVar.f253052i, gVar.f253054k, gVar.f253053j);
        } else if (i17 == 19) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.NV21ToYUV420XXAndScaleRotate(gVar.f253044a, gVar.f253045b, gVar.f253047d, gVar.f253048e, gVar.f253049f, gVar.f253050g, 2, gVar.f253055l, gVar.f253052i, gVar.f253054k, gVar.f253053j);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        int length = gVar.f253044a.length;
        int length2 = gVar.f253045b.length;
        ei3.b bVar = (ei3.b) this.f253036d;
        bVar.f252994a.f253030e.post(new ei3.a(bVar, gVar));
        ei3.x.f253187d.o(gVar.f253044a);
    }
}
