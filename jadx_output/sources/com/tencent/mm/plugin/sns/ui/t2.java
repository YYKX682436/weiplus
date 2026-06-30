package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class t2 extends com.tencent.mm.plugin.sns.ui.p7 {
    public m21.h K;
    public java.lang.String L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.ui.MMActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.L = "";
    }

    @Override // com.tencent.mm.plugin.sns.ui.p7, com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.crj, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.n8c);
        m21.h hVar = this.K;
        if (hVar != null && hVar.b() != null) {
            int[] c17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(mMActivity);
            java.lang.Object obj = m21.y.k(c17[0], c17[1], mMActivity, false).first;
            java.lang.Integer num = (java.lang.Integer) obj;
            int floatValue = (int) ((((java.lang.Number) obj).floatValue() * 3.5f) / 3.0f);
            kotlin.jvm.internal.o.d(num);
            inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(num.intValue(), floatValue));
            inflate.requestLayout();
            kotlin.jvm.internal.o.d(imageView);
            new com.tencent.mm.plugin.sns.ui.r2(imageView, this.L).d("");
            imageView.setOnClickListener(new com.tencent.mm.plugin.sns.ui.s2(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        return inflate;
    }

    @Override // com.tencent.mm.plugin.sns.ui.p7, com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        java.util.Map d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("sns_kemdia_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.L = stringExtra;
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("ksnsupload_finder_live_xml");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(stringExtra2, "finderLive", null)) != null) {
            m21.h hVar = new m21.h();
            hVar.d("", d17);
            this.K = hVar;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.p7, com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.p7
    public void t(com.tencent.mm.plugin.sns.model.y7 y7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        m21.h hVar = this.K;
        if (hVar != null && y7Var != null) {
            y7Var.L(hVar);
        }
        super.t(y7Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
    }
}
