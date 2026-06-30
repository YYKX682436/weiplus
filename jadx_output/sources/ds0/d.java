package ds0;

/* loaded from: classes5.dex */
public final class d implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds0.d0 f242790d;

    public d(ds0.d0 d0Var) {
        this.f242790d = d0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what != 1024) {
            return false;
        }
        java.lang.Object obj = it.obj;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.media.codec.MediaCodecAACCodec.EncoderData");
        ds0.c cVar = (ds0.c) obj;
        ds0.d0 d0Var = this.f242790d;
        d0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start encode data ");
        sb6.append(cVar.f242786a.length);
        sb6.append(", pts:");
        long j17 = cVar.f242787b;
        sb6.append(j17);
        sb6.append(", isLast: ");
        boolean z17 = cVar.f242788c;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", sb6.toString());
        gs0.a aVar = d0Var.f242797g;
        if (aVar != null) {
            aVar.c(cVar.f242786a, j17, z17);
            return false;
        }
        kotlin.jvm.internal.o.o("mAudioEncoder");
        throw null;
    }
}
