package m84;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m84.u f324779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m84.u uVar) {
        super(0);
        this.f324779d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mOptionHotAreas$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mOptionHotAreas$2");
        android.view.View[] viewArr = new android.view.View[4];
        m84.u uVar = this.f324779d;
        android.widget.FrameLayout A = m84.u.A(uVar);
        viewArr[0] = A != null ? A.findViewById(com.tencent.mm.R.id.f487009v80) : null;
        android.widget.FrameLayout A2 = m84.u.A(uVar);
        viewArr[1] = A2 != null ? A2.findViewById(com.tencent.mm.R.id.f487010v81) : null;
        android.widget.FrameLayout A3 = m84.u.A(uVar);
        viewArr[2] = A3 != null ? A3.findViewById(com.tencent.mm.R.id.f487011v82) : null;
        android.widget.FrameLayout A4 = m84.u.A(uVar);
        viewArr[3] = A4 != null ? A4.findViewById(com.tencent.mm.R.id.f487012v83) : null;
        java.util.List i17 = kz5.c0.i(viewArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mOptionHotAreas$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mOptionHotAreas$2");
        return i17;
    }
}
