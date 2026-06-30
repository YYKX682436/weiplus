package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.a0 f126374d = new com.tencent.mm.plugin.finder.storage.a0();

    public a0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "清理 finder sync key buffer", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_clean_finder_sync_key_buf, false, 2, null);
        aVar.a("CLEAN_FINDER_SYNC_KEY_BUF", kz5.c0.i(0, 1, 2, 3, 4, 5, 6, 7, 8), kz5.c0.i("0", "1", "2", "3", "4", "5", "6", "7", "8"));
        return aVar;
    }
}
