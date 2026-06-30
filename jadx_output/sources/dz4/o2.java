package dz4;

/* loaded from: classes11.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.u2 f245363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.favorites.d f245365f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(dz4.u2 u2Var, android.app.Activity activity, com.tencent.wechat.aff.favorites.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245363d = u2Var;
        this.f245364e = activity;
        this.f245365f = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz4.o2(this.f245363d, this.f245364e, this.f245365f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dz4.o2 o2Var = (dz4.o2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dz4.u2 u2Var = this.f245363d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = u2Var.f245427b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        u2Var.f245427b = null;
        com.tencent.wechat.aff.favorites.d dVar = this.f245365f;
        dz4.u2.a(u2Var, this.f245364e, dVar.f216753h[3] ? dVar.f216751f : "");
        return jz5.f0.f302826a;
    }
}
