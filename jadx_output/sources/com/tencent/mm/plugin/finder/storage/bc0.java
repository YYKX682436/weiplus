package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class bc0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.bc0 f126521d = new com.tencent.mm.plugin.finder.storage.bc0();

    public bc0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(5, "发表N秒后提示文案变化", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_post_next_tips_interval, false);
        aVar.a("FINDER_POST_NEXT_TIPS_INTERVAL", kz5.c0.i(5, 3, 10), kz5.c0.i("5秒(默认)", "3秒", "10秒"));
        return aVar;
    }
}
