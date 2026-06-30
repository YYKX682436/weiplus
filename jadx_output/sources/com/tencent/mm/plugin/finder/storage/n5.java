package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.n5 f127228d = new com.tencent.mm.plugin.finder.storage.n5();

    public n5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(200, "弹幕快捷跟发 冲入持续时间(MS)", null, null, 12, null);
        aVar.a("FINDER_BULLET_FAST_FOLLOW_RUSH_DURATION", kz5.c0.i(100, 150, 200, 250, 300), kz5.c0.i("100", "150", "200", "250", "300"));
        return aVar;
    }
}
