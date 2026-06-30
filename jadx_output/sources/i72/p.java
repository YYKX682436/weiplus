package i72;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.views.FaceDetectView f289432e;

    public p(com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView, java.lang.String str) {
        this.f289432e = faceDetectView;
        this.f289431d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.u3.h(new i72.o(this, com.tencent.mm.plugin.facedetect.model.s0.i(this.f289431d)));
    }
}
