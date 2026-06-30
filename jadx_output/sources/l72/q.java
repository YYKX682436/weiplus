package l72;

/* loaded from: classes14.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f316859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI f316860e;

    public q(com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI, int i17) {
        this.f316860e = faceActionUI;
        this.f316859d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        vz2.c.h(this.f316859d);
        this.f316860e.finish();
    }
}
