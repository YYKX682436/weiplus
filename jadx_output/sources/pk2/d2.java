package pk2;

/* loaded from: classes.dex */
public final class d2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f355648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str) {
        super(2, continuation);
        this.f355648d = hVar;
        this.f355649e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk2.d2(this.f355648d, continuation, this.f355649e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pk2.d2 d2Var = (pk2.d2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("AnchorMoreLiveNoticeOption", "getLiveNotice: cgi fail, source=" + this.f355649e + ", exception=" + ((xg2.a) ((xg2.b) this.f355648d).f454381b));
        return jz5.f0.f302826a;
    }
}
