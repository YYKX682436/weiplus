package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.t1 f127576d = new com.tencent.mm.plugin.finder.storage.t1();

    public t1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否开启打开视频号新动画", null, null, 12, null);
        aVar.a("ENABLE_FINDER_OPEN_NEW_ANIM", kz5.c0.i(0, 1, 0), kz5.c0.i("默认", "打开", "关闭"));
        return aVar;
    }
}
