package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class n7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.n7 f127232d = new com.tencent.mm.plugin.finder.storage.n7();

    public n7() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3000, "ClientStatus cpu刷新间隔", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_clientstat_interval, false, 2, null);
        return aVar;
    }
}
