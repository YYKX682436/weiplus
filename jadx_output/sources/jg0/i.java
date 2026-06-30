package jg0;

/* loaded from: classes12.dex */
public final class i extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.f0 f299576e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(jg0.x xVar, qi3.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f299575d = xVar;
        this.f299576e = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new jg0.i(this.f299575d, this.f299576e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((jg0.i) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
        jg0.x xVar = this.f299575d;
        java.lang.String str = xVar.f299638i.f41049b;
        ((bv.p0) h1Var).getClass();
        w21.w0 j17 = w21.x0.j(str);
        qi3.f0 f0Var = this.f299576e;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (j17 == null) {
            f0Var.f363700a = -520014;
            return f0Var2;
        }
        j17.f442492i = 3;
        j17.f442489f = 0;
        long j18 = 1000;
        j17.f442493j = java.lang.System.currentTimeMillis() / j18;
        j17.f442494k = java.lang.System.currentTimeMillis() / j18;
        j17.f442484a = 8648;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "start resend. ret: " + ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).Ui(xVar.f299638i.f41049b, j17) + " file:" + j17.f442485b + " msgId:" + j17.f442496m + "  stat:" + j17.f442492i);
        if (j17.f442496m != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(j17.f442486c)) {
            pt0.e0 e0Var = pt0.f0.f358209b1;
            com.tencent.mm.storage.f9 k17 = e0Var.k(j17.f442486c, j17.f442496m);
            if (k17 != null) {
                k17.r1(1);
                qz5.b.d(e0Var.s(k17.Q0(), k17.getMsgId(), k17));
            }
            return f0Var2;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", " failed msg id:" + j17.f442496m + " user:" + j17.f442486c);
        f0Var.f363700a = -520025;
        return f0Var2;
    }
}
