package qf2;

/* loaded from: classes.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362473d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.m(this.f362473d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.m mVar = (qf2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "acceptMicReport fail, " + ((xg2.a) ((xg2.b) this.f362473d).f454381b));
        return jz5.f0.f302826a;
    }
}
