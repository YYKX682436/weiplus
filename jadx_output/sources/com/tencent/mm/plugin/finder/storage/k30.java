package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class k30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.k30 f127045d = new com.tencent.mm.plugin.finder.storage.k30();

    public k30() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "圈外是否保留看一看红点总开关", null, com.tencent.mm.plugin.finder.storage.j30.f126978d, 4, null);
        aVar.g(8815, "newlife_reserve_look_reddot_switch");
        aVar.a("NEWLIFE_RESERVE_LOOK_REDDOT_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
