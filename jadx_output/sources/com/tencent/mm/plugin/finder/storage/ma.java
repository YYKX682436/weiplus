package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ma extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ma f127181d = new com.tencent.mm.plugin.finder.storage.ma();

    public ma() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号不感兴趣二期", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_dislike_reason_select_v2, true);
        aVar.a("FINDER_DISLIKE_REASON_SELECT_V2", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
