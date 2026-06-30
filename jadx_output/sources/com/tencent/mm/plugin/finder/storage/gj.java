package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class gj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.gj f126842d = new com.tencent.mm.plugin.finder.storage.gj();

    public gj() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "切换单Tab", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_more_tab_enable, false, 2, null);
        aVar.a("FINDER_TAB_STYLE_CONFIG", kz5.c0.i(1, 2), kz5.c0.i("切换多tab", "切换单tab"));
        return aVar;
    }
}
