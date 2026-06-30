package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public abstract class n7 implements com.tencent.mm.plugin.sns.model.h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f164515a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f164516b = new java.util.concurrent.ConcurrentHashMap();

    public static com.tencent.mm.plugin.sns.model.m7 a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaToInfo", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) f164516b.get(str);
        if (weakReference != null) {
            android.support.v4.media.f.a(weakReference.get());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaToInfo", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        return null;
    }

    public static void b(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordEndLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        boolean z17 = x51.o1.f452042a;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) f164516b.get(str);
        if (weakReference != null) {
            android.support.v4.media.f.a(weakReference.get());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordEndLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
    }
}
