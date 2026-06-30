package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ik extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ik f126956d = new com.tencent.mm.plugin.finder.storage.ik();

    public ik() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "3tab流是否加入原生短剧tab", "FINDER_NATIVE_DRAMA_TAB_ENABLE", null);
        aVar.f317745p = "常用";
        lb2.j.d(aVar, e42.c0.clicfg_finder_native_drama_tab_enable, false, 2, null);
        return aVar;
    }
}
