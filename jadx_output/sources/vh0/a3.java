package vh0;

/* loaded from: classes.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f436831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f436832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(android.content.Context context, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436831d = context;
        this.f436832e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vh0.a3(this.f436831d, this.f436832e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.a3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f436831d);
        e4Var.f211779f = false;
        e4Var.d(this.f436832e);
        return e4Var.c();
    }
}
