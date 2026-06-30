package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class x0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.b1 f145929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.y0 f145930e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.luckymoney.story.y0 y0Var, com.tencent.mm.plugin.luckymoney.story.b1 b1Var) {
        super(false);
        this.f145930e = y0Var;
        this.f145929d = b1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "click retry btn");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = this.f145929d;
        b1Var.f145822b = uuid;
        b1Var.f145833m.setSessionId(b1Var.f145822b);
        b1Var.f145833m.setLocal(false);
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = (com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager) this.f145930e.f145934f.f145938e.get();
        if (envelopeStoryVideoManager != null) {
            java.util.Set set = com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.f145801o;
            envelopeStoryVideoManager.e(b1Var);
        }
    }
}
