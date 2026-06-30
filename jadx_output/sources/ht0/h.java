package ht0;

/* loaded from: classes10.dex */
public class h implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.j f284697d;

    public h(ht0.j jVar) {
        this.f284697d = jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h90.z zVar;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        byteBuffer.position(0);
        if (byteBuffer.remaining() < bufferInfo.size) {
            return null;
        }
        ht0.s sVar = this.f284697d.f284701d;
        if (sVar.f284761i == null) {
            return null;
        }
        long j17 = bufferInfo.presentationTimeUs;
        if ((bufferInfo.flags & 1) > 0 && (zVar = sVar.H) != null) {
            ta1.c cVar = (ta1.c) zVar;
            synchronized (cVar) {
                ta1.l0 l0Var = cVar.f416606a.f416615d;
                if (l0Var != null) {
                    ((ma1.i$$e) l0Var).a(j17 / 1000);
                }
            }
        }
        ht0.s sVar2 = this.f284697d.f284701d;
        if (sVar2.f284767o.f253039a == ei3.l.Stop) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] writeH264Data, already stop");
            return null;
        }
        com.tencent.mm.plugin.sight.base.h hVar = sVar2.f284769q;
        int i17 = bufferInfo.size;
        long j18 = bufferInfo.presentationTimeUs;
        hVar.getClass();
        synchronized (com.tencent.mm.plugin.sight.base.h.f162414c) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.writeH264Data(hVar.f162415a, byteBuffer, i17, j18);
        }
        this.f284697d.f284701d.U++;
        return null;
    }
}
