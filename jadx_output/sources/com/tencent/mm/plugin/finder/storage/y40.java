package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class y40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.y40 f128343d = new com.tencent.mm.plugin.finder.storage.y40();

    public y40() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "拍摄美化按钮始终显示", "SHOOT_COMPOSING_BEAUTIFY_ALWAYS_SHOW", null);
        aVar.a("SHOOT_COMPOSING_BEAUTIFY_ALWAYS_SHOW", kz5.c0.i(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE), kz5.c0.i("打开([拍摄器]美化按钮始终显示)", "关闭(默认行为)"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_shoot_composing_beautify_always_show_xlab_android, false, 2, null);
        return aVar;
    }
}
