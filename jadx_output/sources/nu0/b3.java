package nu0;

/* loaded from: classes5.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339876d = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.b3(this.f339876d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nu0.b3 b3Var = (nu0.b3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nu0.b4 b4Var = this.f339876d;
        if (!(b4Var.f2().f466571a.getParent() != null)) {
            if (b4Var.m7().getWidth() > 0) {
                b4Var.f2().a(b4Var.r7());
            } else {
                b4Var.m7().post(new nu0.a3(b4Var));
            }
            com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView p76 = b4Var.p7();
            jz5.g gVar = b4Var.V;
            bv0.e handleBoxGesture = (bv0.e) ((jz5.n) gVar).getValue();
            p76.getClass();
            kotlin.jvm.internal.o.g(handleBoxGesture, "handleBoxGesture");
            java.util.ArrayList arrayList = p76.f69686d;
            if (!arrayList.contains(handleBoxGesture)) {
                arrayList.add(handleBoxGesture);
            }
            ((bv0.e) ((jz5.n) gVar).getValue()).a(((nu0.b1) ((jz5.n) b4Var.f339917n).getValue()).X6());
        }
        return jz5.f0.f302826a;
    }
}
