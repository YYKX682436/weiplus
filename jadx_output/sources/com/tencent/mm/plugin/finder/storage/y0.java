package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.y0 f128334d = new com.tencent.mm.plugin.finder.storage.y0();

    public y0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号入口权限", null, null, 12, null);
        aVar.a("DEBUG_FINDER_ENTRANCE_PERMISSION", new java.util.ArrayList(kz5.c0.i(0, 1, -1)), kz5.c0.i("无效", "打开", "关闭"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_entry_debug, false, 2, null);
        return aVar;
    }
}
