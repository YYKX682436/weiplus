package wt3;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.q f449435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(wt3.q qVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f449435e = qVar;
        this.f449436f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wt3.l(this.f449435e, this.f449436f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.nio.ByteBuffer byteBuffer;
        jz5.f0 f0Var;
        com.tencent.maas.instamovie.base.MJError.MaasEC maasEC;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f449434d;
        wt3.q qVar = this.f449435e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", "classifierResult " + java.lang.Thread.currentThread().getName());
            this.f449434d = 1;
            obj = qVar.f(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioMaasClassifier", "classifierResult but is init error");
            return null;
        }
        kotlinx.coroutines.r2 r2Var = qVar.f449476e;
        if ((r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) || qVar.f449472a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioMaasClassifier", "classifierResult but is release");
            return null;
        }
        java.lang.String str = this.f449436f;
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(str, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", "classifierResult >> " + str + ", " + i18);
        if (i18 != null) {
            try {
                byteBuffer = com.tencent.maas.utils.MJAudioPCMExtractor.a(new java.io.File(i18), 2, 1, 16000, com.tencent.maas.model.time.MJTimeRange.fromSecondsStartTimeDuration(0.0d, 3.0d));
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AudioMaasClassifier", "get pcm data is error " + e17.getMessage());
                byteBuffer = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", "get audioBuffer finish");
            if (byteBuffer != null) {
                com.tencent.maas.utils.MJVideoClassifier mJVideoClassifier = qVar.f449472a;
                com.tencent.maas.instamovie.base.MJError b17 = mJVideoClassifier != null ? mJVideoClassifier.b(byteBuffer) : null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed audio frame >> ");
                sb6.append((b17 == null || (maasEC = b17.f48175ec) == null) ? null : new java.lang.Integer(maasEC.getErrorCode()));
                com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", sb6.toString());
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AudioMaasClassifier", "get pcm data is null");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", "start calculateClassifyResult");
        com.tencent.maas.utils.MJVideoClassifier mJVideoClassifier2 = qVar.f449472a;
        com.tencent.maas.utils.MJVideoClassifierResult a17 = mJVideoClassifier2 != null ? mJVideoClassifier2.a() : null;
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", "get data success");
            return wt3.q.f449470g.a(a17, qVar.d());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", "get result error");
        return null;
    }
}
