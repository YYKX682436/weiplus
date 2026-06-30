package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public interface n4 {
    default void C2(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$IGalleryTitleM");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$IGalleryTitleM");
    }

    void h6(java.lang.String str, java.lang.String str2);

    void s3(boolean z17, java.lang.String str, int i17);

    void y0();

    void y1(java.lang.String str, int i17);
}
