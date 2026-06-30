package nu0;

/* loaded from: classes5.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(nu0.b4 b4Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340045d = b4Var;
        this.f340046e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.n3(this.f340045d, this.f340046e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.n3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nu0.b4 b4Var = this.f340045d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = b4Var.S;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str = this.f340046e;
        boolean z17 = false;
        if (u3Var2 == null) {
            b4Var.S = com.tencent.mm.ui.widget.dialog.u3.f(b4Var.getContext(), str, false, 3, null);
            return f0Var;
        }
        if (u3Var2 != null) {
            if (str == null) {
                str = "";
            }
            u3Var2.setMessage(str);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var3 = b4Var.S;
        if (u3Var3 != null && u3Var3.isShowing()) {
            z17 = true;
        }
        if (!z17 && (u3Var = b4Var.S) != null) {
            u3Var.show();
        }
        return f0Var;
    }
}
