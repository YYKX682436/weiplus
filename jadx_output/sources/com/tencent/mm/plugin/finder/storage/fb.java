package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fb f126764d = new com.tencent.mm.plugin.finder.storage.fb();

    public fb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "忽略HDR相关检查", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_enable_hdr_ignore_support, false, 2, null);
        aVar.a("FINDER_ENABLE_HDR_IGNORE_SUPPORT", kz5.c0.i(0, 1), kz5.c0.i("不忽略", "忽略"));
        return aVar;
    }
}
