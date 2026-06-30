package oc4;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f344335d;

    public c(android.view.ViewGroup viewGroup) {
        this.f344335d = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$1");
        android.view.ViewGroup viewGroup = this.f344335d;
        java.lang.Float valueOf = java.lang.Float.valueOf(viewGroup.getMeasuredHeight() / 2);
        android.os.Vibrator vibrator = ca4.z0.f40068a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("roundCorner", "com.tencent.mm.plugin.sns.data.SnsUtil");
        viewGroup.setOutlineProvider(new ca4.y0(valueOf));
        viewGroup.setClipToOutline(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("roundCorner", "com.tencent.mm.plugin.sns.data.SnsUtil");
        viewGroup.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$1");
    }
}
