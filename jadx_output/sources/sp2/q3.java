package sp2;

/* loaded from: classes2.dex */
public final class q3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f411190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f411191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(xg2.h hVar, kotlin.coroutines.Continuation continuation, sp2.x3 x3Var) {
        super(2, continuation);
        this.f411190d = hVar;
        this.f411191e = x3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.q3(this.f411190d, continuation, this.f411191e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sp2.q3 q3Var = (sp2.q3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f411190d).f454381b;
        com.tencent.mars.xlog.Log.e(this.f411191e.f411273d, "requestCgi error " + aVar2);
        return jz5.f0.f302826a;
    }
}
