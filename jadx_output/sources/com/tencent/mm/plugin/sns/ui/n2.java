package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class n2 extends com.tencent.mm.plugin.sns.ui.o2 {

    /* renamed from: s, reason: collision with root package name */
    public final int f169961s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.ui.MMActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f169961s = 43;
    }

    @Override // com.tencent.mm.plugin.sns.ui.o2
    public int o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        return this.f169961s;
    }

    @Override // com.tencent.mm.plugin.sns.ui.o2
    public void p(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.sns.model.y7 packHelper) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(packHelper, "packHelper");
        android.content.Intent intent = context.getIntent();
        kotlin.jvm.internal.o.d(intent);
        com.tencent.mm.plugin.sns.ui.j2 j2Var = new com.tencent.mm.plugin.sns.ui.j2(packHelper);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        q(intent, "Ksnsupload_title", new com.tencent.mm.plugin.sns.ui.m2(j2Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        com.tencent.mm.plugin.sns.ui.k2 k2Var = new com.tencent.mm.plugin.sns.ui.k2(packHelper);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        q(intent, "Ksnsupload_link", new com.tencent.mm.plugin.sns.ui.m2(k2Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        q(intent, "Ksnsupload_imgurl", new com.tencent.mm.plugin.sns.ui.l2(packHelper));
        super.p(context, packHelper);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
    }

    public final java.lang.String q(android.content.Intent intent, java.lang.String str, yz5.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        java.lang.String stringExtra = intent.getStringExtra(str);
        java.lang.String str2 = null;
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                lVar.invoke(stringExtra);
                str2 = stringExtra;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        return str2;
    }
}
