package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class kk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.kk f127079d = new com.tencent.mm.plugin.finder.storage.kk();

    public kk() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "原生短剧tab是否开启预加载", "FINDER_NATIVE_DRAMA_TAB_PRELOAD_SWITCH", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_native_drama_tab_preload_enable, false, 2, null);
        return aVar;
    }
}
