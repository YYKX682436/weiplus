package ee5;

/* loaded from: classes4.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.q3 f251948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(ee5.q3 q3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251948d = q3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.k3(this.f251948d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ee5.k3 k3Var = (ee5.k3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f251948d.f252014o;
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
