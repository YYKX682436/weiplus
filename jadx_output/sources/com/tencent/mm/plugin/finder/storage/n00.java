package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class n00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.n00 f127219d = new com.tencent.mm.plugin.finder.storage.n00();

    public n00() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "消息通知处用户标签可点击", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_mention_user_tag_clickable_android, false, 2, null);
        aVar.a("FinderMentionUserTagClickable", kz5.c0.i(0, 1), kz5.c0.i("标签不可点击", "标签可点击"));
        return aVar;
    }
}
