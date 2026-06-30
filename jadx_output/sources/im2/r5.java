package im2;

/* loaded from: classes.dex */
public final class r5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f292518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f292519e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f292518d = hVar;
        this.f292519e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im2.r5(this.f292518d, continuation, this.f292519e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        im2.r5 r5Var = (im2.r5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList list;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.gp1 gp1Var = (r45.gp1) ((xg2.i) this.f292518d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#requestFinderLiveEndNav good size=");
        kotlin.jvm.internal.h0 h0Var = this.f292519e;
        r45.gp1 gp1Var2 = (r45.gp1) h0Var.f310123d;
        sb6.append((gp1Var2 == null || (list = gp1Var2.getList(1)) == null) ? null : new java.lang.Integer(list.size()));
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPagePlugin", sb6.toString());
        h0Var.f310123d = gp1Var;
        return jz5.f0.f302826a;
    }
}
