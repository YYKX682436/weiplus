package go5;

/* loaded from: classes14.dex */
public final class k implements go5.f {

    /* renamed from: a, reason: collision with root package name */
    public tl.w f274140a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f274141b;

    public k() {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(0);
        kotlin.jvm.internal.o.f(allocateDirect, "allocateDirect(...)");
        this.f274141b = allocateDirect;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPAudioCapturer", "release");
        tl.w wVar = this.f274140a;
        if (wVar != null) {
            wVar.l();
        }
        this.f274140a = null;
        this.f274141b.clear();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(0);
        kotlin.jvm.internal.o.f(allocateDirect, "allocateDirect(...)");
        this.f274141b = allocateDirect;
    }
}
