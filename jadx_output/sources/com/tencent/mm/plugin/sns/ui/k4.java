package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes2.dex */
public class k4 implements com.tencent.wechat.aff.sns.d {
    public k4(com.tencent.mm.plugin.sns.ui.c4 c4Var) {
    }

    @Override // com.tencent.wechat.aff.sns.d
    public void a(bw5.jk0 jk0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("complete", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$7");
        if (jk0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealWithDelSns snsResult code");
            sb6.append(jk0Var.f29004e);
            sb6.append(", type:");
            sb6.append(jk0Var.f29003d);
            sb6.append(", desc:");
            sb6.append(jk0Var.f29006g[3] ? jk0Var.f29005f : "");
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", sb6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("complete", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$7");
    }
}
