package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pu f127391d = new com.tencent.mm.plugin.finder.storage.pu();

    public pu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, "朋友圈同时发表视频号视频时长限制", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_sns_post_entrance_duration_limit_ms, false, 2, null);
        return aVar;
    }
}
