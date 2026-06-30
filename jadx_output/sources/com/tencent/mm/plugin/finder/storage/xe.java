package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xe f128305d = new com.tencent.mm.plugin.finder.storage.xe();

    public xe() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否打开hdr-hlg", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_hdr_hlg, false, 2, null);
        aVar.a("是否打开hdr-hlg", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
