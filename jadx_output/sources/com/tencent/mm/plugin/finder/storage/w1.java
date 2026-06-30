package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.w1 f128221d = new com.tencent.mm.plugin.finder.storage.w1();

    public w1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否支持视频号播放器画质增强", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_channel_sharpen_value_xlab_android, false, 2, null);
        aVar.a("ENABLE_RENDERER_SHARPEN", new java.util.ArrayList(kz5.c0.i(-2, -1, 0, 1, 2, 3, 4, 5, 6)), kz5.c0.i("关闭", "关闭", "关闭", "打开-弱档", "打开-弱档", "打开-中档", "打开-中档", "打开-强档", "打开-强档"));
        return aVar;
    }
}
