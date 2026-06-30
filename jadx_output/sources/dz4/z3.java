package dz4;

/* loaded from: classes11.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.h4 f245478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.g f245479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.wcrte.h f245480f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(dz4.h4 h4Var, dz4.g gVar, com.tencent.wechat.aff.wcrte.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245478d = h4Var;
        this.f245479e = gVar;
        this.f245480f = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz4.z3(this.f245478d, this.f245479e, this.f245480f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dz4.z3 z3Var = (dz4.z3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dz4.h4 h4Var = this.f245478d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = h4Var.f245287e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h4Var.f245287e = null;
        h4Var.d(this.f245479e, this.f245480f);
        return jz5.f0.f302826a;
    }
}
