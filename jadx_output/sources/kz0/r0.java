package kz0;

/* loaded from: classes5.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.widget.MusicV2State f313801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.mj_template.album_template.widget.MusicV2State musicV2State, n0.v2 v2Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f313801d = musicV2State;
        this.f313802e = v2Var;
        this.f313803f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kz0.r0(this.f313801d, this.f313802e, this.f313803f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kz0.r0 r0Var = (kz0.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f313801d.f69763g.invoke(java.lang.Boolean.valueOf(kz0.k1.c(this.f313802e)), new kz0.q0(this.f313803f));
        return jz5.f0.f302826a;
    }
}
