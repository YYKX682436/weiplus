package su0;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f412720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yu0.c f412721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kotlin.coroutines.Continuation continuation, yu0.c cVar) {
        super(1);
        this.f412720d = continuation;
        this.f412721e = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        yu0.a aVar = (yu0.a) this.f412721e.f465783c;
        this.f412720d.resumeWith(kotlin.Result.m521constructorimpl(new yu0.b((com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo) obj, aVar.f465774b, aVar.f465775c)));
        return jz5.f0.f302826a;
    }
}
