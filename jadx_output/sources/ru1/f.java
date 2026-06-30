package ru1;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ru1.g f399713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ru1.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399713e = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ru1.f fVar = new ru1.f(this.f399713e, continuation);
        fVar.f399712d = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ru1.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f399712d;
        ru1.g gVar = this.f399713e;
        android.media.AudioRecord audioRecord = gVar.f399717d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (audioRecord != null) {
            if (audioRecord.getState() != 1) {
                com.tencent.mars.xlog.Log.e("ScreenCastDirectlyEncoder", "createRecorder-audio ar.state != STATE_INITIALIZED");
                return f0Var;
            }
            yj0.a.j(audioRecord, "com/tencent/mm/plugin/cast/encoder/ScreenCastDirectlyEncoder$startRecord$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/media/AudioRecord", "startRecording", "()V");
            pu1.a aVar2 = gVar.f399714a;
            int minBufferSize = android.media.AudioRecord.getMinBufferSize(aVar2.f358416b, aVar2.f358417c == 2 ? 12 : 16, 2);
            byte[] bArr = new byte[minBufferSize];
            while (true) {
                if (!kotlinx.coroutines.z0.h(y0Var)) {
                    com.tencent.mars.xlog.Log.i("ScreenCastDirectlyEncoder", "#createRecorder-audio launch job is end.");
                    break;
                }
                int read = audioRecord.read(bArr, 0, bArr.length);
                if (read < 0) {
                    com.tencent.mars.xlog.Log.e("ScreenCastDirectlyEncoder", "#createRecorder-audio something wrong. readSize=" + read);
                    break;
                }
                if (read > 0) {
                    gVar.f399715b.invoke(kz5.v.q(bArr, 0, read));
                }
                bArr = new byte[minBufferSize];
            }
        }
        return f0Var;
    }
}
