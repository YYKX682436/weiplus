package ko4;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko4.l f310073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f310074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ko4.l lVar, int i17) {
        super(0);
        this.f310073d = lVar;
        this.f310074e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ko4.l lVar = this.f310073d;
        int a17 = lVar.f310088i.a(0L);
        if (a17 >= 0) {
            ko4.b c17 = lVar.f310088i.c(a17);
            int b17 = lVar.f310089j.b(0L);
            if (b17 >= 0) {
                if (com.tencent.mm.mediaplus.VideoSoftDecoderJni.nDecodeSample(lVar.f310091l, c17.f310038b, this.f310074e) > 0) {
                    int nGetLineSize = com.tencent.mm.mediaplus.VideoSoftDecoderJni.nGetLineSize(lVar.f310091l);
                    ko4.d dVar = lVar.f310090k;
                    if (dVar != null) {
                        int i17 = lVar.f310084e;
                        dVar.f310049a = nGetLineSize;
                        dVar.f310050b = i17;
                    }
                    lVar.f310089j.f310040b = com.tencent.mm.mediaplus.VideoSoftDecoderJni.nGetOutputBufferSize(lVar.f310091l);
                    ko4.b c18 = lVar.f310089j.c(b17);
                    java.nio.ByteBuffer byteBuffer = c18.f310038b;
                    byteBuffer.position(0);
                    int nGetOutputBuffer = com.tencent.mm.mediaplus.VideoSoftDecoderJni.nGetOutputBuffer(lVar.f310091l, byteBuffer);
                    long j17 = c17.f310037a.presentationTimeUs;
                    android.media.MediaCodec.BufferInfo bufferInfo = c18.f310037a;
                    bufferInfo.presentationTimeUs = j17;
                    bufferInfo.size = nGetOutputBuffer;
                    byteBuffer.position(0);
                    byteBuffer.limit(nGetOutputBuffer);
                    ko4.c cVar = lVar.f310089j;
                    java.util.concurrent.locks.ReentrantLock reentrantLock = cVar.f310042d;
                    reentrantLock.lock();
                    try {
                        cVar.f310046h++;
                        cVar.f310043e.signalAll();
                        reentrantLock.unlock();
                    } finally {
                    }
                } else {
                    ko4.c cVar2 = lVar.f310089j;
                    cVar2.f310042d.lock();
                    try {
                        cVar2.f310045g--;
                        cVar2.f310044f.signalAll();
                    } finally {
                    }
                }
                lVar.f310088i.d();
            }
        }
        return jz5.f0.f302826a;
    }
}
