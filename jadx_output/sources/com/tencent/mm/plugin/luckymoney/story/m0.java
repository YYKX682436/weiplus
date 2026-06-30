package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.b1 f145895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager f145896e;

    public m0(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager, com.tencent.mm.plugin.luckymoney.story.b1 b1Var) {
        this.f145896e = envelopeStoryVideoManager;
        this.f145895d = b1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.f145801o;
        this.f145896e.getClass();
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = this.f145895d;
        if (b1Var.f145834n.getTop() < 0 || b1Var.f145834n.getTop() > com.tencent.mm.ui.bk.p(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            ((android.widget.RelativeLayout.LayoutParams) b1Var.f145837q.getLayoutParams()).topMargin = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        } else {
            ((android.widget.RelativeLayout.LayoutParams) b1Var.f145837q.getLayoutParams()).topMargin = (com.tencent.mm.ui.bk.p(com.tencent.mm.sdk.platformtools.x2.f193071a) - b1Var.f145834n.getTop()) + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        }
        b1Var.f145837q.requestLayout();
    }
}
