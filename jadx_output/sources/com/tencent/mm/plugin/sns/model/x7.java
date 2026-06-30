package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public enum x7 {
    STATE_ERROR,
    STATE_OK,
    STATE_FALSE;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.model.UploadManager$MediaState");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.model.UploadManager$MediaState");
    }

    public static com.tencent.mm.plugin.sns.model.x7 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.model.UploadManager$MediaState");
        com.tencent.mm.plugin.sns.model.x7 x7Var = (com.tencent.mm.plugin.sns.model.x7) java.lang.Enum.valueOf(com.tencent.mm.plugin.sns.model.x7.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.model.UploadManager$MediaState");
        return x7Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.tencent.mm.plugin.sns.model.x7[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.model.UploadManager$MediaState");
        com.tencent.mm.plugin.sns.model.x7[] x7VarArr = (com.tencent.mm.plugin.sns.model.x7[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.model.UploadManager$MediaState");
        return x7VarArr;
    }
}
