package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class gb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.gb f126826d = new com.tencent.mm.plugin.finder.storage.gb();

    public gb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否支持横屏预览", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_horizontal_previewing_enable, false, 2, null);
        aVar.a("FINDER_ENABLE_HORIZONTAL_PREVIEWING", kz5.c0.i(0, 1), kz5.c0.i("关", "开"));
        return aVar;
    }
}
