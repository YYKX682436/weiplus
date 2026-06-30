package com.tencent.mm.repairer.config.profile;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/profile/RepairerConfigRecommendLabelClear;", "Lq55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigRecommendLabelClear extends q55.a {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_RecommendLabelClear";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "推荐标签-清除曝光记录";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupRecommendLabel.class;
    }

    @Override // q55.a
    public void h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_Name_ShowOuterRecommendLabels").putStringSet("MMKV_Key_ShowOuterRecommendLabels", kz5.r0.f314002d);
        android.widget.Toast.makeText(context, "已清除", 0).show();
    }
}
