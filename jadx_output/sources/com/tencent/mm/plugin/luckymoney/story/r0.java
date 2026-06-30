package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class r0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.b1 f145906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager f145907e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager, com.tencent.mm.plugin.luckymoney.story.b1 b1Var) {
        super(false);
        this.f145907e = envelopeStoryVideoManager;
        this.f145906d = b1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "click play btn");
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = this.f145906d;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView envelopeStoryVideoView = b1Var.f145833m;
        if (envelopeStoryVideoView == null || !envelopeStoryVideoView.isPlaying()) {
            b1Var.f145836p.setVisibility(4);
            java.util.Set set = com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.f145801o;
            this.f145907e.e(b1Var);
        }
    }
}
