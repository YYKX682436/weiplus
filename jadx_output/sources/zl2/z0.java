package zl2;

/* loaded from: classes.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f474042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f474043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f474044f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(xg2.h hVar, kotlin.coroutines.Continuation continuation, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(2, continuation);
        this.f474042d = hVar;
        this.f474043e = context;
        this.f474044f = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zl2.z0(this.f474042d, continuation, this.f474043e, this.f474044f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zl2.z0 z0Var = (zl2.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f474042d).f454381b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkGiftLegalArgeement] cgi failed， errcode:");
        rm0.j jVar = aVar2.f454379a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f397425f) : null);
        sb6.append("， errType:");
        rm0.j jVar2 = aVar2.f454379a;
        sb6.append(jVar2 != null ? new java.lang.Integer(jVar2.f397424e) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        if (zl2.q4.f473933a.E()) {
            db5.t7.makeText(this.f474043e, "cgi failed", 0).show();
        }
        this.f474044f.u();
        return jz5.f0.f302826a;
    }
}
