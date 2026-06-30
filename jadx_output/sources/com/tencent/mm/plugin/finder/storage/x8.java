package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class x8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.x8 f128293d = new com.tencent.mm.plugin.finder.storage.x8();

    public x8() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号评论区@视频号开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_comment_at_finder_contact_switch, false, 2, null);
        aVar.a("FINDER_COMMENT_MENTION_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
