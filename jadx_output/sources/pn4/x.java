package pn4;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f357244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.translate.model.TextToSpeechService$readVoiceMessageAndWait$3$downloadListener$1 f357245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f357246g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.plugin.translate.model.TextToSpeechService$readVoiceMessageAndWait$3$downloadListener$1 textToSpeechService$readVoiceMessageAndWait$3$downloadListener$1, kotlinx.coroutines.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357244e = atomicBoolean;
        this.f357245f = textToSpeechService$readVoiceMessageAndWait$3$downloadListener$1;
        this.f357246g = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pn4.x(this.f357244e, this.f357245f, this.f357246g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357243d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f357243d = 1;
            if (kotlinx.coroutines.k1.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean compareAndSet = this.f357244e.compareAndSet(false, true);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (compareAndSet) {
            dead();
            com.tencent.mars.xlog.Log.w("MicroMsg.TextToSpeechService", "readVoiceMessage: download timeout");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f357246g.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        }
        return f0Var;
    }
}
