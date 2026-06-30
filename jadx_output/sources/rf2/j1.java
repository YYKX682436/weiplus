package rf2;

/* loaded from: classes10.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f394779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f394781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f394782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(xg2.h hVar, kotlin.coroutines.Continuation continuation, rf2.o1 o1Var, r45.dm4 dm4Var, kotlin.jvm.internal.c0 c0Var) {
        super(2, continuation);
        this.f394779d = hVar;
        this.f394780e = o1Var;
        this.f394781f = dm4Var;
        this.f394782g = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.j1(this.f394779d, continuation, this.f394780e, this.f394781f, this.f394782g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rf2.j1 j1Var = (rf2.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rf2.o1 o1Var = this.f394780e;
        com.tencent.mars.xlog.Log.i(o1Var.f394838c, "reserveLottery success, modify data");
        r45.dm4 dm4Var = this.f394781f;
        if (dm4Var != null) {
            dm4Var.f372574i = 1;
        }
        db5.t7.f(o1Var.f394836a.getContext(), o1Var.f394836a.getContext().getString(com.tencent.mm.R.string.dri), rf2.l1.f394803a);
        this.f394782g.f310112d = true;
        return jz5.f0.f302826a;
    }
}
