package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class f50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.f50 f126747d = new com.tencent.mm.plugin.finder.storage.f50();

    public f50() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "266选择是否支持levelorder", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_video_levelorder_switch, false, 2, null);
        aVar.a("SUPPORT_LEVEL_ORDER", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
