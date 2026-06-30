package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class vu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.vu f128212d = new com.tencent.mm.plugin.finder.storage.vu();

    public vu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "朋友圈30s内的视频支持同步到视频号", null, null, 12, null);
        aVar.a("FINDER_SNS_POST_UNDER_30S_ENTRANCE", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        aVar.c(e42.d0.clicfg_finder_sns_post_under_30s_entrance, false);
        return aVar;
    }
}
