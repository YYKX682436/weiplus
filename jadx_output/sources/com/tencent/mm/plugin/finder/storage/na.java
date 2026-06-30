package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class na extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.na f127238d = new com.tencent.mm.plugin.finder.storage.na();

    public na() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(3L, "视频号自动上滑次数频控", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_display_auto_play_tips_auto_scroll_count_limit, false, 2, null);
        aVar.a("FINDER_DISPLAY_AUTO_PLAY_TIPS_AUTO_SCROLL_COUNT_LIMIT", kz5.c0.i(java.lang.Long.valueOf(com.tencent.wcdb.core.Database.DictDefaultMatchValue), 3L), kz5.c0.i("无限制", "3次"));
        return aVar;
    }
}
