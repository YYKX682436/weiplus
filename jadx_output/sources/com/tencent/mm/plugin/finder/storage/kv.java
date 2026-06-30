package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class kv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.kv f127090d = new com.tencent.mm.plugin.finder.storage.kv();

    public kv() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "星标/私密赞引导时间限制", null, null, 12, null);
        aVar.a("FINDER_STAR_TIPS_TIME_LIMIT", kz5.c0.i(0, 1), kz5.c0.i("24小时", "5分钟"));
        return aVar;
    }
}
