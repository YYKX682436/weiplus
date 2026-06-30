package vh0;

/* loaded from: classes5.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f437003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f437004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f437005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(android.content.Context context, int i17, android.content.DialogInterface.OnCancelListener onCancelListener, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f437003d = context;
        this.f437004e = i17;
        this.f437005f = onCancelListener;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vh0.y2(this.f437003d, this.f437004e, this.f437005f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.y2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f437003d);
        e4Var.f211780g = 2;
        e4Var.f211778e = true;
        e4Var.d(this.f437004e);
        e4Var.f211781h = this.f437005f;
        return e4Var.c();
    }
}
