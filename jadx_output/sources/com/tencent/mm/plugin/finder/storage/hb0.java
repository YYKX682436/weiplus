package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class hb0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hb0 f126884d = new com.tencent.mm.plugin.finder.storage.hb0();

    public hb0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发表页增加一起拍入口开关", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_convenient_event_switch, false);
        aVar.a("FINDER_CONVENIENT_EVENT_SWITCH", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
