package o00;

/* loaded from: classes.dex */
public final class g implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI f341862a;

    public g(com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI) {
        this.f341862a = ecsGiftSendThanksLogicUI;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("EcsGiftSendThanksLogicUI", "sendTanksPresent errType:" + i17 + " errCode:" + i18);
        ((j00.d2) ((c00.m3) i95.n0.c(c00.m3.class))).Di(true);
        com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI = this.f341862a;
        kotlinx.coroutines.y0 b17 = v65.m.b(ecsGiftSendThanksLogicUI);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new o00.f(ecsGiftSendThanksLogicUI, null), 2, null);
    }
}
