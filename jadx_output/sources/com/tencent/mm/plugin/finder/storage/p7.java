package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class p7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.p7 f127354d = new com.tencent.mm.plugin.finder.storage.p7();

    public p7() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "群视频号入口开关", null, null, 12, null);
        aVar.b("FinderClubEntranceDarkLaunch");
        aVar.a("FINDER_CLUB_ENABLE_SWITCH", new java.util.ArrayList(kz5.c0.i(0, 1, 0)), kz5.c0.i("默认(0)", "打开入口(1)", "关闭入口(0)"));
        return aVar;
    }
}
