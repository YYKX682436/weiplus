package nu0;

/* loaded from: classes5.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339912d;

    /* renamed from: e, reason: collision with root package name */
    public int f339913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339914f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339914f = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.d3(this.f339914f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.d3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        nu0.b4 b4Var;
        io.clipworks.displaysys.DSRenderView dSRenderView;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339913e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nu0.b4 b4Var2 = this.f339914f;
            java.lang.ref.WeakReference weakReference = b4Var2.f339890y;
            if (weakReference != null && (dSRenderView = (io.clipworks.displaysys.DSRenderView) weakReference.get()) != null) {
                return dSRenderView;
            }
            nu0.q0 U6 = b4Var2.U6();
            android.app.Activity context = b4Var2.getContext();
            this.f339912d = b4Var2;
            this.f339913e = 1;
            U6.getClass();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new nu0.z(U6, context, null), this);
            if (g17 == aVar) {
                return aVar;
            }
            b4Var = b4Var2;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b4Var = (nu0.b4) this.f339912d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.clipworks.displaysys.DSRenderView dSRenderView2 = (io.clipworks.displaysys.DSRenderView) obj;
        dSRenderView2.setId(android.view.View.generateViewId());
        b4Var.f339890y = new java.lang.ref.WeakReference(dSRenderView2);
        dSRenderView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        b4Var.m7().addView(dSRenderView2);
        return dSRenderView2;
    }
}
