package tt2;

/* loaded from: classes3.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f422021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bd5 f422022e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(tt2.e1 e1Var, r45.bd5 bd5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422021d = e1Var;
        this.f422022e = bd5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tt2.y0(this.f422021d, this.f422022e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        tt2.y0 y0Var = (tt2.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context context = this.f422021d.f421880h;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = this.f422022e.getString(7);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
