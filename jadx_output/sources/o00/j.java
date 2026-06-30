package o00;

/* loaded from: classes9.dex */
public final class j implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI f341865a;

    public j(com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI) {
        this.f341865a = ecsGiftSendThanksLogicUI;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("EcsGiftSendThanksLogicUI", "getPresentUserAttr errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.MmecGetPresentUserAttrResp");
        bw5.df0 df0Var = (bw5.df0) fVar;
        com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI = this.f341865a;
        if (i18 != 0 || i17 != 0) {
            int i19 = com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI.f65617h;
            ecsGiftSendThanksLogicUI.P6();
        } else {
            if (df0Var.getBaseResponse().f376959d == 0) {
                ecsGiftSendThanksLogicUI.f65618e.postValue(df0Var);
                return;
            }
            com.tencent.mars.xlog.Log.e("EcsGiftSendThanksLogicUI", "getPresentUserAttr resp error: " + df0Var.getBaseResponse().f376959d);
            int i27 = com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI.f65617h;
            ecsGiftSendThanksLogicUI.P6();
        }
    }
}
