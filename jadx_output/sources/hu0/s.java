package hu0;

/* loaded from: classes3.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.clipworks.displaysys.DSRenderView f285056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(io.clipworks.displaysys.DSRenderView dSRenderView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285056d = dSRenderView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu0.s(this.f285056d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu0.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        io.clipworks.displaysys.DSRenderView dSRenderView = this.f285056d;
        android.view.ViewParent parent = dSRenderView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeView(dSRenderView);
        return jz5.f0.f302826a;
    }
}
