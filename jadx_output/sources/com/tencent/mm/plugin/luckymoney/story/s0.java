package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class s0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.b1 f145909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager f145910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager, com.tencent.mm.plugin.luckymoney.story.b1 b1Var) {
        super(false);
        this.f145910e = envelopeStoryVideoManager;
        this.f145909d = b1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = this.f145910e;
        if (envelopeStoryVideoManager.f145803e != -1) {
            com.tencent.mm.plugin.luckymoney.story.b1 b1Var = this.f145909d;
            if (b1Var.f145833m != null) {
                envelopeStoryVideoManager.getClass();
                com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView envelopeStoryVideoView = b1Var.f145833m;
                if (envelopeStoryVideoView == null) {
                    return;
                }
                boolean z17 = !envelopeStoryVideoView.P1;
                envelopeStoryVideoManager.f145804f = z17;
                com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "click to mute: %s", java.lang.Boolean.valueOf(z17));
                b1Var.f145833m.setMute(envelopeStoryVideoManager.f145804f);
                boolean z18 = envelopeStoryVideoManager.f145804f;
                fp.e eVar = envelopeStoryVideoManager.f145806h;
                if (!z18) {
                    eVar.b();
                    envelopeStoryVideoManager.f145807i = true;
                } else if (envelopeStoryVideoManager.f145807i) {
                    eVar.a();
                    envelopeStoryVideoManager.f145807i = false;
                }
                envelopeStoryVideoManager.i(b1Var);
            }
        }
    }
}
