package ix5;

/* loaded from: classes.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f295667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f295669f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295668e = str;
        this.f295669f = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix5.q(this.f295668e, this.f295669f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix5.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f295667d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ix5.h hVar = ix5.h.f295631b;
            java.util.Map k17 = kz5.c1.k(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f295668e), new jz5.l("delegate", this.f295669f));
            this.f295667d = 1;
            obj = hVar.g("setDelegate", k17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
