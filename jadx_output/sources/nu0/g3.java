package nu0;

/* loaded from: classes5.dex */
public final class g3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339944d = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.g3(this.f339944d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nu0.g3 g3Var = (nu0.g3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nu0.b4 b4Var = this.f339944d;
        b4Var.f2().d();
        com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView p76 = b4Var.p7();
        androidx.recyclerview.widget.RecyclerView k76 = b4Var.k7();
        p76.getClass();
        p76.f69687e.remove(k76);
        com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView p77 = b4Var.p7();
        jz5.g gVar = b4Var.V;
        bv0.e handleBoxGesture = (bv0.e) ((jz5.n) gVar).getValue();
        p77.getClass();
        kotlin.jvm.internal.o.g(handleBoxGesture, "handleBoxGesture");
        java.util.ArrayList arrayList = p77.f69686d;
        if (arrayList.contains(handleBoxGesture)) {
            arrayList.remove(handleBoxGesture);
        }
        ((bv0.e) ((jz5.n) gVar).getValue()).f24694e.clear();
        return jz5.f0.f302826a;
    }
}
