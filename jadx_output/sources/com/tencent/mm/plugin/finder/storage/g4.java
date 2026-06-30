package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.g4 f126806d = new com.tencent.mm.plugin.finder.storage.g4();

    public g4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3, "原创半屏兴趣认证开关", null, null, 12, null);
        aVar.a("FINDER_AUTH_CONDITION", kz5.c0.i(0, 1, 2, 3), kz5.c0.i("关闭", "无权限", "有权限", "默认"));
        return aVar;
    }
}
