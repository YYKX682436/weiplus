package qc4;

/* loaded from: classes4.dex */
public final class d implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout f361517a;

    public d(com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout snsImproveCoverLayout) {
        this.f361517a = snsImproveCoverLayout;
    }

    @Override // db5.c1
    public final void e(int i17) {
        yz5.a legacyClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$legacyClick$1");
        if (i17 == 0 && (legacyClickListener = this.f361517a.getLegacyClickListener()) != null) {
            legacyClickListener.invoke();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$legacyClick$1");
    }
}
