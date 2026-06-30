package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.NewVideoTalkingSmallView$2 f177152d;

    public g(com.tencent.mm.plugin.voip.widget.NewVideoTalkingSmallView$2 newVideoTalkingSmallView$2) {
        this.f177152d = newVideoTalkingSmallView$2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.widget.NewVideoTalkingSmallView$2 newVideoTalkingSmallView$2 = this.f177152d;
        java.lang.ref.WeakReference weakReference = newVideoTalkingSmallView$2.f177098d.f177090f;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "summerkick LogoutEvent ret[%b, %b, %b]", java.lang.Boolean.valueOf(((com.tencent.mm.plugin.voip.ui.g) newVideoTalkingSmallView$2.f177098d.f177090f.get()).t()), java.lang.Boolean.valueOf(((com.tencent.mm.plugin.voip.ui.g) newVideoTalkingSmallView$2.f177098d.f177090f.get()).n()), java.lang.Boolean.valueOf(((com.tencent.mm.plugin.voip.ui.g) newVideoTalkingSmallView$2.f177098d.f177090f.get()).w()));
    }
}
