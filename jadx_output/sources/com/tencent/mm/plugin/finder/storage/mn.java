package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mn f127205d = new com.tencent.mm.plugin.finder.storage.mn();

    public mn() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发表原创入口开关", null, null, 12, null);
        aVar.a("FINDER_POST_ORIGIN_SWITCH", kz5.c0.i(0, 1, 2, 3), kz5.c0.i("默认", "有入口无权限", "有入口有权限", "关闭入口"));
        return aVar;
    }
}
