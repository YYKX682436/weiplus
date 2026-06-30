package wh5;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq.s0 f446025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f446026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(aq.s0 s0Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446025d = s0Var;
        this.f446026e = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wh5.c(this.f446025d, this.f446026e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wh5.c cVar = (wh5.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f446025d.f12960a;
        android.content.Context context = this.f446026e;
        if (z17) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.ncn);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_done);
            e4Var.c();
        } else {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211776c = context.getString(com.tencent.mm.R.string.og6);
            e4Var2.c();
        }
        return jz5.f0.f302826a;
    }
}
