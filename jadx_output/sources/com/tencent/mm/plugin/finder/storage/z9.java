package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class z9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.z9 f128440d = new com.tencent.mm.plugin.finder.storage.z9();

    public z9() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "会话预加载使用dataservice batchload", "FINDER_DATASERVICE_BATCHLOAD_CGI_ENABLE", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_dataservice_batchload_cgi_enable, false, 2, null);
        return aVar;
    }
}
