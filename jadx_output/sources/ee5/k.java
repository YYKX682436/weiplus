package ee5;

/* loaded from: classes4.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f251940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251941e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ee5.z zVar, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251940d = zVar;
        this.f251941e = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.k(this.f251940d, this.f251941e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ee5.k kVar = (ee5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ee5.z zVar = this.f251940d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = zVar.f252101h;
        boolean z17 = false;
        if (u3Var != null && u3Var.isShowing()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = zVar.f252101h;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            zVar.f252101h = null;
        }
        zVar.V6(this.f251941e);
        return jz5.f0.f302826a;
    }
}
