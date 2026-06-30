package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mj f127201d = new com.tencent.mm.plugin.finder.storage.mj();

    public mj() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "互动通知消除红点路径缩短", null, null, 12, null);
        aVar.a("FINDER_MSG_RED_DOT_BUBBLE_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关", "开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_enable_msg_red_dot_bubble, false, 2, null);
        return aVar;
    }
}
