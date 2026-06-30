package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.d3 f126622d = new com.tencent.mm.plugin.finder.storage.d3();

    public d3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "首帧后才允许 seek", "FINDER_AFTERFIRSTFRAME_SEEK_ENABLE", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_afterfirstframe_seek_enable, false, 2, null);
        return aVar;
    }
}
