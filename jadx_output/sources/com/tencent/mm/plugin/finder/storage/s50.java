package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class s50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.s50 f127525d = new com.tencent.mm.plugin.finder.storage.s50();

    public s50() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "话题推荐开关", null, null, 12, null);
        aVar.b("FinderSuggestTagViewShow");
        aVar.a("TOPIC_RECOMMEND_CONFIG", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
