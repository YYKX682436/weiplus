package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class hf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hf f126891d = new com.tencent.mm.plugin.finder.storage.hf();

    public hf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "3tab将上次退出时的feed替换为第一个feed", null, null, 12, null);
        aVar.a("FINDER_HOME_LAST_EXIT_FEED_REPLACE_FIRST_FEED", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_home_last_exit_feed_replace_first_feed, false, 2, null);
        return aVar;
    }
}
