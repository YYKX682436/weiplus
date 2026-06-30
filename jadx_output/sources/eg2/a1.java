package eg2;

/* loaded from: classes3.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f252531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg2.b1 f252532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(eg2.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252532e = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new eg2.a1(this.f252532e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((eg2.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        eg2.x0 x0Var;
        boolean z17;
        eg2.t0 t0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f252531d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        eg2.b1 b1Var = this.f252532e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.f252531d = 1;
                obj = eg2.b1.f(b1Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            x0Var = (eg2.x0) obj;
            z17 = b1Var.f252577b.get();
            t0Var = b1Var.f252543k;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FinderLiveHDTaskProcessor", e17, "task error", new java.lang.Object[0]);
            boolean z18 = b1Var.f252577b.get();
            eg2.o oVar = (eg2.o) b1Var.f252543k;
            if (z18) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var = oVar.f252604a.f252610n;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "HD task cancelled");
            } else {
                oVar.a(e17);
            }
        }
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = ((eg2.o) t0Var).f252604a.f252610n;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "HD task cancelled");
            return f0Var;
        }
        if (x0Var instanceof eg2.w0) {
            ((eg2.o) t0Var).b(((eg2.w0) x0Var).f252643a);
        } else if (x0Var instanceof eg2.v0) {
            eg2.o oVar2 = (eg2.o) t0Var;
            oVar2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "HD task: no need to enhance");
            com.tencent.mm.ui.widget.dialog.u3 u3Var3 = oVar2.f252604a.f252610n;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
        } else if (x0Var instanceof eg2.u0) {
            ((eg2.o) t0Var).a(null);
        }
        return f0Var;
    }
}
