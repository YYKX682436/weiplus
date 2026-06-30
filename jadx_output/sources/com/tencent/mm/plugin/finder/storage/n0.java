package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.n0 f127218d = new com.tencent.mm.plugin.finder.storage.n0();

    public n0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "二级评论是否展开", null, null, 12, null);
        aVar.b("FinderCommentAutoExpandSubcommentList");
        aVar.a("COMMENT_EXPAND_CONFIG", kz5.c0.i(1, 0), kz5.c0.i("是", "否"));
        return aVar;
    }
}
