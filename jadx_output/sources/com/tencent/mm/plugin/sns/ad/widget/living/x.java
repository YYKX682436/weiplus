package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.z f163773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.sns.ad.widget.living.z zVar) {
        super(0);
        this.f163773d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent$mLivingIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent$mLivingIcon$2");
        com.tencent.mm.plugin.sns.ad.widget.living.z zVar = this.f163773d;
        zVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        android.view.View view = zVar.f163775o;
        android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.v7b) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent$mLivingIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent$mLivingIcon$2");
        return imageView;
    }
}
