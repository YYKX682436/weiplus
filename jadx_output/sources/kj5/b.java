package kj5;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj5.f f308456d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kj5.f fVar) {
        super(1);
        this.f308456d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        kj5.f fVar = this.f308456d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            fVar.getClass();
            d75.b.g(new kj5.e(fVar));
            fVar.T6().n().setOnClickListener(new kj5.a(fVar));
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.d0)) {
            wi5.d0 d0Var = (wi5.d0) dVar2;
            if (fVar.f308461q > 0 && d0Var.f446286c && ((rd0.v0) i95.n0.c(rd0.v0.class)) != null) {
                androidx.appcompat.app.AppCompatActivity activity = fVar.getActivity();
                java.lang.String str = d0Var.f446285b;
                com.tencent.mm.ui.chatting.x3.i(activity, str, true, str);
            }
        }
        return jz5.f0.f302826a;
    }
}
