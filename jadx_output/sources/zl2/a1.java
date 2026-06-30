package zl2;

/* loaded from: classes.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f473635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.u3 f473636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f473637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f473638g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f473639h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.storage.u3 u3Var, int i17, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(2, continuation);
        this.f473635d = hVar;
        this.f473636e = u3Var;
        this.f473637f = i17;
        this.f473638g = c0Var;
        this.f473639h = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zl2.a1(this.f473635d, continuation, this.f473636e, this.f473637f, this.f473638g, this.f473639h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zl2.a1 a1Var = (zl2.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[checkGiftLegalArgeement] cgi success");
        gm0.j1.u().c().x(this.f473636e, new java.lang.Integer(this.f473637f));
        this.f473638g.f310112d = true;
        this.f473639h.u();
        return jz5.f0.f302826a;
    }
}
