package kp3;

/* loaded from: classes14.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI f310963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI palmPrintFrontUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310963e = palmPrintFrontUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp3.a0(this.f310963e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp3.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310962d;
        com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI palmPrintFrontUI = this.f310963e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f310962d = 1;
            obj = com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI.U6(palmPrintFrontUI, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.e("MicroMsg.palmPrintFrontUI", "[initPalm] doCheckSdkResource failed");
            jp3.g gVar = jp3.g.f301000a;
            androidx.appcompat.app.AppCompatActivity context = palmPrintFrontUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gVar.i(context, 80010, "ERR_PALM_SDK_CHECK", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return f0Var;
        }
        int i18 = com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI.f152866h;
        palmPrintFrontUI.getClass();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.a(palmPrintFrontUI, "android.permission.CAMERA", 16, "", "")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.palmPrintFrontUI", "[initPalm] doCheckPermission failed");
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintFrontUI", "[initPalm] check success");
        palmPrintFrontUI.V6(palmPrintFrontUI.f152868e, palmPrintFrontUI.f152869f);
        return f0Var;
    }
}
