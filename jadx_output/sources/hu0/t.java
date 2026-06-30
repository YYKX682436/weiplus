package hu0;

/* loaded from: classes3.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.clipworks.displaysys.DSRenderView f285057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f285058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(io.clipworks.displaysys.DSRenderView dSRenderView, android.widget.FrameLayout frameLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285057d = dSRenderView;
        this.f285058e = frameLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu0.t(this.f285057d, this.f285058e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hu0.t tVar = (hu0.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        io.clipworks.displaysys.DSRenderView dSRenderView = this.f285057d;
        dSRenderView.setLayoutParams(layoutParams);
        this.f285058e.addView(dSRenderView, 0);
        return jz5.f0.f302826a;
    }
}
