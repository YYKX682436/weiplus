package gx0;

/* loaded from: classes5.dex */
public final class x7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(gx0.w8 w8Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277163d = w8Var;
        this.f277164e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.x7(this.f277163d, this.f277164e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.x7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.w8 w8Var = this.f277163d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = w8Var.U;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str = this.f277164e;
        boolean z17 = false;
        if (u3Var2 == null) {
            w8Var.U = com.tencent.mm.ui.widget.dialog.u3.f(w8Var.getContext(), str, false, 3, null);
            return f0Var;
        }
        if (u3Var2 != null) {
            if (str == null) {
                str = "";
            }
            u3Var2.setMessage(str);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var3 = w8Var.U;
        if (u3Var3 != null && u3Var3.isShowing()) {
            z17 = true;
        }
        if (!z17 && (u3Var = w8Var.U) != null) {
            u3Var.show();
        }
        return f0Var;
    }
}
