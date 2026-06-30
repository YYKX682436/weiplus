package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.model.g6 f164210a = new com.tencent.mm.plugin.sns.model.g6();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f164211b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f164212c = new java.util.LinkedHashMap();

    public final void a(java.lang.String key, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addEmotionSafeStrategyInfoListOnPost", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        kotlin.jvm.internal.o.g(key, "key");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.api.EmotionStrategyInfo emotionStrategyInfo = (com.tencent.mm.api.EmotionStrategyInfo) it.next();
                r45.x96 x96Var = new r45.x96();
                x96Var.f389901d = emotionStrategyInfo.f53201d;
                x96Var.f389902e = emotionStrategyInfo.f53202e;
                arrayList.add(x96Var);
            }
        }
        f164212c.put(key, arrayList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addEmotionSafeStrategyInfoListOnPost", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
    }

    public final java.util.List b(java.lang.String path) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        kotlin.jvm.internal.o.g(path, "path");
        java.util.Map map = f164211b;
        if (((java.util.LinkedHashMap) map).get(path) == null) {
            map.put(path, new java.util.ArrayList());
        }
        java.lang.Object obj = ((java.util.LinkedHashMap) map).get(path);
        kotlin.jvm.internal.o.d(obj);
        java.util.List list = (java.util.List) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        return list;
    }

    public final void c(java.lang.String path, android.os.Bundle bundle, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        kotlin.jvm.internal.o.g(path, "path");
        if (bundle == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(path)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsPostSafeStrategyDataHelper", "putEmotionSafeStrategyInfoList: failed, arguments error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
            return;
        }
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
        if (parcelableArrayList == null) {
            parcelableArrayList = new java.util.ArrayList();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            android.os.Parcelable parcelable = (android.os.Parcelable) it.next();
            if (parcelable instanceof com.tencent.mm.api.EmotionStrategyInfo) {
                arrayList.add(parcelable);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        f164211b.put(path, arrayList);
        arrayList.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
    }

    public final void d(java.lang.String oldKey, java.lang.String newKey) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateKeyAndMoveEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        kotlin.jvm.internal.o.g(oldKey, "oldKey");
        kotlin.jvm.internal.o.g(newKey, "newKey");
        java.util.Map map = f164211b;
        java.util.Collection collection = (java.util.List) ((java.util.LinkedHashMap) map).get(oldKey);
        if (collection == null) {
            collection = new java.util.ArrayList();
        }
        map.put(newKey, collection);
        map.put(oldKey, new java.util.ArrayList());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateKeyAndMoveEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
    }
}
