package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f168843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f168842d = improveHeaderUIC;
        this.f168843e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$avatarImg$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$avatarImg$2");
        com.tencent.mm.plugin.sns.ui.TouchImageView touchImageView = (com.tencent.mm.plugin.sns.ui.TouchImageView) com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getHeadLayout(this.f168842d).findViewById(com.tencent.mm.R.id.a_4);
        java.lang.String string = this.f168843e.getString(com.tencent.mm.R.string.j9d, c01.z1.l());
        kotlin.jvm.internal.o.f(string, "getString(...)");
        touchImageView.setContentDescription(string);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$avatarImg$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$avatarImg$2");
        return touchImageView;
    }
}
