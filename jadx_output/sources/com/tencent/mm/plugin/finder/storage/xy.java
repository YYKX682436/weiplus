package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xy f128331d = new com.tencent.mm.plugin.finder.storage.xy();

    public xy() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "修复reinit selector", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_fix_reinit_selector_enable, false, 2, null);
        aVar.a("FIX_REINIT_SELECTOR_ENABLE", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
