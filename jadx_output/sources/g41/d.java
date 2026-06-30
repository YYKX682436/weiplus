package g41;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g41.f f268706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g41.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268706d = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g41.d(this.f268706d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g41.d dVar = (g41.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        g41.f fVar = this.f268706d;
        android.view.View view = fVar.f268709a;
        if (view == null) {
            kotlin.jvm.internal.o.o("floatingView");
            throw null;
        }
        java.lang.Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        android.view.View view2 = fVar.f268709a;
        if (view2 != null) {
            windowManager.removeView(view2);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("floatingView");
        throw null;
    }
}
