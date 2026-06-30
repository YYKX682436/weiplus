package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class s40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.s40 f127523d = new com.tencent.mm.plugin.finder.storage.s40();

    public s40() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "秒剪做同款", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_miaojian_samestyle, false, 2, null);
        aVar.a("SAME_STYLE_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
