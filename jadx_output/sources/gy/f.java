package gy;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy.g f277479d;

    public f(gy.g gVar) {
        this.f277479d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread.currentThread().setPriority(8);
        while (this.f277479d.f277483d) {
            try {
                gy.g gVar = this.f277479d;
                android.media.AudioRecord audioRecord = gVar.f277480a;
                if (audioRecord != null) {
                    audioRecord.read(gVar.f277485f.array(), 0, 640);
                }
                this.f277479d.f277486g.clear();
                gy.g gVar2 = this.f277479d;
                gVar2.f277486g.put(gVar2.f277485f.array(), 0, 640);
                this.f277479d.f277486g.flip();
                gy.g gVar3 = this.f277479d;
                java.nio.ByteBuffer byteBuffer = gVar3.f277486g;
                kotlin.jvm.internal.o.f(byteBuffer, "access$getFrameBuffer$p(...)");
                gy.g.b(gVar3, byteBuffer, 640);
                java.lang.Thread.sleep(20L);
            } catch (java.lang.InterruptedException unused) {
                com.tencent.mars.xlog.Log.i("ChatBot.SMCAudioManager", "the recording thread is interrupted normally");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("ChatBot.SMCAudioManager", "recording thread exception：" + e17.getMessage(), e17);
                java.lang.Thread.sleep(10L);
            }
        }
        com.tencent.mars.xlog.Log.i("ChatBot.SMCAudioManager", "the recording thread has stopped");
    }
}
