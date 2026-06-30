package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pt f127390d = new com.tencent.mm.plugin.finder.storage.pt();

    public pt() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "评论区省略时是否出全文", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_show_all_comment_tag_when_ellipse_android, false);
        aVar.a("FINDER_SHOW_ALL_COMMENT_TAG_WHEN_ELLIPSE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
