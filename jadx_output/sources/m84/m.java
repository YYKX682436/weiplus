package m84;

/* loaded from: classes4.dex */
public final class m implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m84.u f324781a;

    public m(m84.u uVar) {
        this.f324781a = uVar;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mPagFlushListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        m84.u uVar = this.f324781a;
        android.widget.ImageView R = uVar.R();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (R != null && R.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i(uVar.j(), "pagThumb need to be gone, stage=" + m84.u.z(uVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPagView$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            com.tencent.mm.view.MMPAGView mMPAGView = uVar.f324789J;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPagView$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            if (mMPAGView != null) {
                mMPAGView.j(this);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            android.widget.ImageView R2 = uVar.R();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            if (R2 != null) {
                R2.clearAnimation();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            android.widget.ImageView R3 = uVar.R();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            if (R3 != null) {
                R3.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mPagFlushListener$1");
    }
}
