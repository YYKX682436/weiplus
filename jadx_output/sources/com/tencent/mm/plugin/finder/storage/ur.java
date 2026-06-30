package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ur extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ur f128151d = new com.tencent.mm.plugin.finder.storage.ur();

    public ur() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "只选择后台下发的档位", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_select_svr_spec, false, 2, null);
        aVar.a("FINDER_SELECT_SVR_SPEC", kz5.c0.i(0, 1), kz5.c0.i("0", "1"));
        return aVar;
    }
}
