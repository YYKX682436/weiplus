package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class q8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.q8 f127415d = new com.tencent.mm.plugin.finder.storage.q8();

    public q8() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "评论图片过期时间", null, null, 12, null);
        aVar.a("FINDER_COMMENT_IMAGE_RED_DOT_OUTDATE_TIME", kz5.c0.i(0, 1), kz5.c0.i("14天", "2分钟"));
        return aVar;
    }
}
