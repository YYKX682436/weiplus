package zm5;

/* loaded from: classes4.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.r0 f474229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(zm5.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f474229d = r0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zm5.j0(this.f474229d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zm5.j0 j0Var = (zm5.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryMainUIC", "init engine done");
        aq.n nVar = aq.o.f12922c;
        zm5.r0 r0Var = this.f474229d;
        if (nVar != null) {
            nVar.a(r0Var.getActivity());
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = r0Var.f474261f;
        boolean z17 = false;
        if (u3Var != null && u3Var.isShowing()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = r0Var.f474261f;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            r0Var.f474261f = null;
        }
        return jz5.f0.f302826a;
    }
}
