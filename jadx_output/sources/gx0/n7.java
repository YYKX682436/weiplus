package gx0;

/* loaded from: classes5.dex */
public final class n7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276758d = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.n7(this.f276758d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.n7 n7Var = (gx0.n7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.w8 w8Var = this.f276758d;
        if (!(w8Var.f2().f466571a.getParent() != null)) {
            if (w8Var.B7().getWidth() > 0) {
                w8Var.f2().a(w8Var.y7());
            } else {
                w8Var.B7().post(new gx0.m7(w8Var));
            }
            com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView w76 = w8Var.w7();
            bv0.e handleBoxGesture = gx0.w8.e7(w8Var);
            w76.getClass();
            kotlin.jvm.internal.o.g(handleBoxGesture, "handleBoxGesture");
            java.util.ArrayList arrayList = w76.f69686d;
            if (!arrayList.contains(handleBoxGesture)) {
                arrayList.add(handleBoxGesture);
            }
            gx0.w8.e7(w8Var).a(((gx0.x4) ((jz5.n) w8Var.f348901o).getValue()).X6());
            gx0.w8.e7(w8Var).a((tv0.k0) ((jz5.n) ((tv0.j0) w8Var.T6(tv0.j0.class)).A).getValue());
            gx0.w8.e7(w8Var).a((tv0.k0) ((jz5.n) ((iv0.w) w8Var.T6(iv0.w.class)).B).getValue());
        }
        return jz5.f0.f302826a;
    }
}
