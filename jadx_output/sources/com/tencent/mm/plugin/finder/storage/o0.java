package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.o0 f127278d = new com.tencent.mm.plugin.finder.storage.o0();

    public o0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "评论全屏方案", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_comment_fullscreen, false, 2, null);
        aVar.a("COMMENT_STYLE_CONFIG", kz5.c0.i(1, 0), kz5.c0.i("全屏", "半屏"));
        return aVar;
    }
}
