package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xa f128297d = new com.tencent.mm.plugin.finder.storage.xa();

    public xa() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "设计师表情发布是否开启", null, null, 12, null);
        aVar.a("FINDER_EMOJI_POST_ENABLE_TEST", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
