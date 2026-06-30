package gx0;

/* loaded from: classes5.dex */
public final class s7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276945d = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.s7(this.f276945d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.s7 s7Var = (gx0.s7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.w8 w8Var = this.f276945d;
        w8Var.f2().d();
        com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView w76 = w8Var.w7();
        bv0.e handleBoxGesture = gx0.w8.e7(w8Var);
        w76.getClass();
        kotlin.jvm.internal.o.g(handleBoxGesture, "handleBoxGesture");
        java.util.ArrayList arrayList = w76.f69686d;
        if (arrayList.contains(handleBoxGesture)) {
            arrayList.remove(handleBoxGesture);
        }
        gx0.w8.e7(w8Var).f24694e.clear();
        return jz5.f0.f302826a;
    }
}
