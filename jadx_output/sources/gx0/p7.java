package gx0;

/* loaded from: classes5.dex */
public final class p7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276828d;

    /* renamed from: e, reason: collision with root package name */
    public int f276829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276830f = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.p7(this.f276830f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.p7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        gx0.w8 w8Var;
        io.clipworks.displaysys.DSRenderView dSRenderView;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276829e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.w8 w8Var2 = this.f276830f;
            java.lang.ref.WeakReference weakReference = w8Var2.A;
            if (weakReference != null && (dSRenderView = (io.clipworks.displaysys.DSRenderView) weakReference.get()) != null) {
                return dSRenderView;
            }
            gx0.bf V6 = w8Var2.V6();
            androidx.appcompat.app.AppCompatActivity activity = w8Var2.getActivity();
            this.f276828d = w8Var2;
            this.f276829e = 1;
            V6.getClass();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new gx0.td(V6, activity, null), this);
            if (g17 == aVar) {
                return aVar;
            }
            w8Var = w8Var2;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w8Var = (gx0.w8) this.f276828d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.clipworks.displaysys.DSRenderView dSRenderView2 = (io.clipworks.displaysys.DSRenderView) obj;
        dSRenderView2.setId(android.view.View.generateViewId());
        w8Var.A = new java.lang.ref.WeakReference(dSRenderView2);
        dSRenderView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        w8Var.B7().addView(dSRenderView2);
        return dSRenderView2;
    }
}
