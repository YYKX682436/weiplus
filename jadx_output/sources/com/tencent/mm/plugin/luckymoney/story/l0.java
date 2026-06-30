package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager f145889d;

    public l0(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager) {
        this.f145889d = envelopeStoryVideoManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = this.f145889d;
        com.tencent.mm.ui.MMActivity mMActivity = envelopeStoryVideoManager.f145802d;
        if (mMActivity == null || mMActivity.getSupportActionBar() == null || envelopeStoryVideoManager.f145802d.getSupportActionBar().j() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "[overlayActionBarTouch] null check failed");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "[overlayActionBarTouch]");
            envelopeStoryVideoManager.f145802d.getSupportActionBar().j().setOnTouchListener(new com.tencent.mm.plugin.luckymoney.story.t0(envelopeStoryVideoManager));
        }
    }
}
