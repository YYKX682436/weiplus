package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class y00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.y00 f128335d = new com.tencent.mm.plugin.finder.storage.y00();

    public y00() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号发表半屏创建开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_post_half_create_switch, false, 2, null);
        aVar.a("FinderMcnShowSwitch", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
