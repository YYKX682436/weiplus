package o00;

/* loaded from: classes.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI f341861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f341861d = ecsGiftSendThanksLogicUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new o00.f(this.f341861d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        o00.f fVar = (o00.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI = this.f341861d;
        e4Var.f211776c = ecsGiftSendThanksLogicUI.getString(com.tencent.mm.R.string.fw6);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
        ecsGiftSendThanksLogicUI.finish();
        return jz5.f0.f302826a;
    }
}
