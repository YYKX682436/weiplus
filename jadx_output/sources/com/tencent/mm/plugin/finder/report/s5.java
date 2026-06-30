package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.s5 f125349a = new com.tencent.mm.plugin.finder.report.s5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f125350b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String mediaId, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f125350b;
        android.support.v4.media.f.a(concurrentHashMap.get(mediaId));
        if (z17) {
            return;
        }
        android.support.v4.media.f.a(concurrentHashMap.remove(mediaId));
    }
}
