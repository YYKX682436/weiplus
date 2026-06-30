package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class vx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.vx f128215d = new com.tencent.mm.plugin.finder.storage.vx();

    public vx() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "使用真实屏幕尺寸计算视频布局", "FINDER_USE_REAL_DISPLAY_SIZE", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_use_real_display_size, false, 2, null);
        return aVar;
    }
}
