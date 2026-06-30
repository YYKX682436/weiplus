package te5;

/* loaded from: classes.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f418715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418715d = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te5.n(this.f418715d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te5.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f418715d);
        e4Var.f211780g = 2;
        e4Var.f211778e = true;
        e4Var.d(com.tencent.mm.R.string.oe6);
        return e4Var.c();
    }
}
