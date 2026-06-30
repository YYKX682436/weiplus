package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.e3 f126686d = new com.tencent.mm.plugin.finder.storage.e3();

    public e3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(300, "视频号timeline双击后接单击出图标的最大间隔(毫秒)", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_after_double_like_single_click_max_time, false);
        return aVar;
    }
}
