package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class az extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.az f126489d = new com.tencent.mm.plugin.finder.storage.az();

    public az() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "朋友的外显评论是否显示头像", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_friend_comment_show_header, false, 2, null);
        aVar.a("DEBUG_SELF_LIKE_EDU", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
