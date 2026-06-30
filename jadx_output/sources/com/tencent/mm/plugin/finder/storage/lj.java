package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lj f127142d = new com.tencent.mm.plugin.finder.storage.lj();

    public lj() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "消息列表评论与点赞互动作者侧开关", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_comment_mention_show_interaction, false);
        aVar.a("FINDER_MSG_COMMENT_OPERATE_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
