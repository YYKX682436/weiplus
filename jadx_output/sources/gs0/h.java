package gs0;

/* loaded from: classes10.dex */
public final class h extends gs0.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f274986i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f274987j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f274988k;

    /* renamed from: l, reason: collision with root package name */
    public final gs0.e f274989l;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f274990m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.media.MediaFormat mediaFormat, yz5.q frameEncodeCallback, yz5.a frameEncodeEndCallback) {
        super(mediaFormat, frameEncodeCallback, frameEncodeEndCallback);
        kotlin.jvm.internal.o.g(mediaFormat, "mediaFormat");
        kotlin.jvm.internal.o.g(frameEncodeCallback, "frameEncodeCallback");
        kotlin.jvm.internal.o.g(frameEncodeEndCallback, "frameEncodeEndCallback");
        this.f274986i = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f274987j = java.util.Collections.synchronizedList(new java.util.ArrayList());
        gs0.e eVar = new gs0.e(this);
        this.f274989l = eVar;
        try {
            this.f274965c.f447719a.setCallback(eVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecAACEncoderAsync", e17, "", new java.lang.Object[0]);
        }
        this.f274990m = new gs0.g(this);
    }

    @Override // gs0.a
    public void c(byte[] data, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f274986i.add(new gs0.d(data, j17, z17));
        java.util.List list = this.f274987j;
        int size = list.size();
        wo.i1 i1Var = this.f274965c;
        if (size > 0) {
            java.lang.Integer num = (java.lang.Integer) kz5.n0.X(list);
            list.remove(num);
            android.media.MediaCodec mediaCodec = i1Var.f447719a;
            kotlin.jvm.internal.o.f(mediaCodec, "getMediaCodecImpl(...)");
            kotlin.jvm.internal.o.d(num);
            this.f274989l.onInputBufferAvailable(mediaCodec, num.intValue());
        }
        if (this.f274988k) {
            return;
        }
        i1Var.x();
        this.f274988k = true;
    }
}
