package it3;

/* loaded from: classes10.dex */
public final class g0 implements ju3.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.TestActivity f294563a;

    public g0(com.tencent.mm.plugin.recordvideo.activity.TestActivity testActivity) {
        this.f294563a = testActivity;
    }

    @Override // ju3.y
    public void a(byte[] data) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // ju3.y
    public void b(android.util.Size previewSize) {
        kotlin.jvm.internal.o.g(previewSize, "previewSize");
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraTestActivity", "onFirstFrameReady " + previewSize + ',');
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new it3.f0(this.f294563a, null), 3, null);
    }
}
