package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class z10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.z10 f128420d = new com.tencent.mm.plugin.finder.storage.z10();

    public z10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否支持分享专辑", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_share_album_enable, false, 2, null);
        aVar.a("IS_ENABLE_SHARE_ALBUM", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
