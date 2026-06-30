package gx0;

/* loaded from: classes3.dex */
public final class hb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(gx0.ac acVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276507d = acVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.hb(this.f276507d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.hb hbVar = (gx0.hb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hbVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.ac acVar = this.f276507d;
        android.app.Activity context = acVar.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = acVar.getContext().getString(com.tencent.mm.R.string.lwz);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
