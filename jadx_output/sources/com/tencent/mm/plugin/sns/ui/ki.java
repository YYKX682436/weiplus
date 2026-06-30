package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ki implements com.tencent.mm.ui.tools.o4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.li f169634a;

    public ki(com.tencent.mm.plugin.sns.ui.li liVar) {
        this.f169634a = liVar;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4$1");
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f169634a.f169743d;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        snsGalleryUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4$1");
    }

    @Override // com.tencent.mm.ui.tools.o4
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4$1");
        com.tencent.mm.plugin.sns.ui.li liVar = this.f169634a;
        android.view.KeyEvent.Callback currentImageView = liVar.f169743d.f166810o.getCurrentImageView();
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = liVar.f169743d;
        if (snsGalleryUI.X && !com.tencent.mm.plugin.sns.ui.SnsGalleryUI.v7(snsGalleryUI) && (currentImageView instanceof db5.f0)) {
            ((db5.f0) currentImageView).n(f17, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4$1");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4$1");
        com.tencent.mm.plugin.sns.ui.li liVar = this.f169634a;
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = liVar.f169743d;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        snsGalleryUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = liVar.f169743d.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.o0();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4$1");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4$1");
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f169634a.f169743d;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        snsGalleryUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4$1");
    }
}
