package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ql extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ql f127439d = new com.tencent.mm.plugin.finder.storage.ql();

    public ql() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "打开小店，允许使用外部appBunble", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_open_ministore_bypass, false, 2, null);
        aVar.a("FINDER_OPEN_MINISTORE_BYPASS", kz5.c0.i(0, 1, 2), kz5.c0.i("0", "1", "2"));
        return aVar;
    }
}
