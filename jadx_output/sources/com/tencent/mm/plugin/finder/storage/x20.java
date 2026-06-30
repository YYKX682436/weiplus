package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class x20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.x20 f128282d = new com.tencent.mm.plugin.finder.storage.x20();

    public x20() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "我视频号入口开关是否独立", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_me_finder_independence_switch, false, 2, null);
        aVar.a("ME_FINDER_ENTRY_INDEPENDENCE_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
