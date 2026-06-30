package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class x7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.x7 f128291d = new com.tencent.mm.plugin.finder.storage.x7();

    public x7() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3000, "评论批量翻译请求字节数", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_comment_batch_byte_length, false, 2, null);
        aVar.a("FINDER_COMMENT_BATCH_TRANSLATE_BYTE_LENGTH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
