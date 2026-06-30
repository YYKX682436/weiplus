package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class t7 implements com.tencent.mm.ui.tools.h1 {
    public t7(com.tencent.mm.plugin.sns.ui.p7 p7Var) {
    }

    @Override // com.tencent.mm.ui.tools.h1
    public java.lang.String a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genOutputPath", "com.tencent.mm.plugin.sns.ui.PicWidget$4");
        java.lang.String str2 = com.tencent.mm.plugin.sns.model.l4.Ni() + kk.k.g((str + java.lang.System.currentTimeMillis()).getBytes());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genOutputPath", "com.tencent.mm.plugin.sns.ui.PicWidget$4");
        return str2;
    }
}
