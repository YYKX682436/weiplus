package ew0;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f257017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f257018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(cw0.l0 l0Var, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f257017d = l0Var;
        this.f257018e = mjid;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ew0.h(this.f257017d, this.f257018e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ew0.h hVar = (ew0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cw0.l0.Q7(this.f257017d, null, this.f257018e, null, 5, null);
        return jz5.f0.f302826a;
    }
}
