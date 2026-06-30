package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.z1 f128419d = new com.tencent.mm.plugin.finder.storage.z1();

    public z1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否打开视频预加载", null, null, 12, null);
        aVar.a("ENABLE_VIDEO_PRELOAD", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
