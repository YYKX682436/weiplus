package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lf0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lf0 f127135d = new com.tencent.mm.plugin.finder.storage.lf0();

    public lf0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lb2.j jVar = new lb2.j(0, "允许【视频号】数字红点透传发现页底部tab，默认关");
        jVar.b("EnableFinderUnreadCountToTab");
        jVar.a("FINDER_REDDOT_ENABLE_COUNT_TO_TAB", kz5.c0.i(0, -100), kz5.c0.i("关", "开"));
        return jVar;
    }
}
