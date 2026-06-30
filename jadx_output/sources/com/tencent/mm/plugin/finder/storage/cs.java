package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class cs extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cs f126602d = new com.tencent.mm.plugin.finder.storage.cs();

    public cs() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号主态气泡开关", null, null, 12, null);
        aVar.a("FINDER_SELF_READ_FEED_CONFIG", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        aVar.c(e42.c0.clicfg_finder_show_self_read_tips_android, false);
        return aVar;
    }
}
