package hm;

/* loaded from: classes12.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f282174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hm.u f282175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w65.m f282176f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlin.jvm.internal.h0 h0Var, hm.u uVar, w65.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f282174d = h0Var;
        this.f282175e = uVar;
        this.f282176f = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hm.t(this.f282174d, this.f282175e, this.f282176f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hm.t tVar = (hm.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object putIfAbsent;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        hm.u uVar = this.f282175e;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((jz5.n) uVar.f282179g).getValue();
        w65.m mVar = this.f282176f;
        java.lang.Class z17 = mVar.z1();
        java.lang.Object obj2 = concurrentHashMap.get(z17);
        if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(z17, (obj2 = (x65.a) mVar.z1().getConstructor(androidx.lifecycle.y.class).newInstance(uVar.f300267d)))) != null) {
            obj2 = putIfAbsent;
        }
        this.f282174d.f310123d = obj2;
        return jz5.f0.f302826a;
    }
}
