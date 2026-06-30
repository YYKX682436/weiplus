package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class y4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.y4 f128342d = new com.tencent.mm.plugin.finder.storage.y4();

    public y4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "订阅号进视频号主入口", null, null, 12, null);
        aVar.a("FINDER_BIZ_TO_TIMELINE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_biz_to_timeline, false, 2, null);
        return aVar;
    }
}
