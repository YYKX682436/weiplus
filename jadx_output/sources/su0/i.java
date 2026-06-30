package su0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f412655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yu0.c f412656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlinx.coroutines.q qVar, yu0.c cVar) {
        super(1);
        this.f412655d = qVar;
        this.f412656e = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo = (com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo) obj;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        yu0.p pVar = (yu0.p) this.f412656e.f465783c;
        ((kotlinx.coroutines.r) this.f412655d).resumeWith(kotlin.Result.m521constructorimpl(new yu0.q(pVar.f465826a, pVar.f465827b, pVar.f465828c, mJAsyncSpeechSubmitResponseInfo, pVar.f465829d)));
        return jz5.f0.f302826a;
    }
}
