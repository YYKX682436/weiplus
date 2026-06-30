package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public enum z1 {
    IMG_SCENE_NONE,
    IMG_SCENE_SNSUSER;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$IMG_SCENE");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$IMG_SCENE");
    }

    public static com.tencent.mm.plugin.sns.model.z1 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$IMG_SCENE");
        com.tencent.mm.plugin.sns.model.z1 z1Var = (com.tencent.mm.plugin.sns.model.z1) java.lang.Enum.valueOf(com.tencent.mm.plugin.sns.model.z1.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$IMG_SCENE");
        return z1Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.tencent.mm.plugin.sns.model.z1[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$IMG_SCENE");
        com.tencent.mm.plugin.sns.model.z1[] z1VarArr = (com.tencent.mm.plugin.sns.model.z1[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$IMG_SCENE");
        return z1VarArr;
    }
}
