package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class dd0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.dd0 f126645d = new com.tencent.mm.plugin.finder.storage.dd0();

    public dd0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "DSL红点是否根据后台配置进行换行", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_change_line_by_server_config, false, 2, null);
        aVar.a("FINDER_CHANGE_LINE_BY_SERVER_CONFIG", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
