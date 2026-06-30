package gp5;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp5.e f274457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f274458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f274459f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gp5.e eVar, long j17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f274457d = eVar;
        this.f274458e = j17;
        this.f274459f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gp5.d(this.f274457d, this.f274458e, this.f274459f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gp5.d dVar = (gp5.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gp5.e eVar = this.f274457d;
        if (eVar.f274463d && eVar.f274465f) {
            eVar.a(eVar.f274460a, eVar.f274461b, eVar.f274462c, this.f274458e, this.f274459f);
        }
        return jz5.f0.f302826a;
    }
}
