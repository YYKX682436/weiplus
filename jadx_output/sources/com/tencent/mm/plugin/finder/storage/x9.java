package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class x9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.x9 f128294d = new com.tencent.mm.plugin.finder.storage.x9();

    public x9() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号目录自己的清理策略", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_posting_folder_strategy, false, 2, null);
        aVar.a("FINDER_POSTING_STRATEGY", kz5.c0.i(0, 1), kz5.c0.i("启用", "关闭"));
        return aVar;
    }
}
