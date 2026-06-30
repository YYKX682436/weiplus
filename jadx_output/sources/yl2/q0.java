package yl2;

/* loaded from: classes3.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f463062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f463063e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f463062d = hVar;
        this.f463063e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yl2.q0(this.f463062d, continuation, this.f463063e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yl2.q0 q0Var = (yl2.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f463062d).f454381b;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "result error: " + aVar2);
        rm0.j jVar = aVar2.f454379a;
        int i17 = jVar != null ? jVar.f397425f : -1;
        if (jVar == null || (str = jVar.f397426g) == null) {
            str = "";
        }
        java.lang.Object obj2 = jVar != null ? jVar.f397427h : null;
        this.f463063e.f310123d = new yl2.k(i17, str, obj2 instanceof r45.j01 ? (r45.j01) obj2 : null);
        return jz5.f0.f302826a;
    }
}
