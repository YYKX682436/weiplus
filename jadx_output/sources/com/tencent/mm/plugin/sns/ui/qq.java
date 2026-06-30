package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class qq implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI f170354d;

    public qq(com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI snsSpringUploadUI) {
        this.f170354d = snsSpringUploadUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI$onCreate$1");
        kotlin.jvm.internal.o.g(s17, "s");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI$onCreate$1");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI$onCreate$1");
        kotlin.jvm.internal.o.g(s17, "s");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI$onCreate$1");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI$onCreate$1");
        kotlin.jvm.internal.o.g(s17, "s");
        com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI snsSpringUploadUI = this.f170354d;
        snsSpringUploadUI.enableOptionMenu(snsSpringUploadUI.t7());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI$onCreate$1");
    }
}
