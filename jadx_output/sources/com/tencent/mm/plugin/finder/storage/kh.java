package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class kh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.kh f127074d = new com.tencent.mm.plugin.finder.storage.kh();

    public kh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "单流点赞后头像动画样式", null, null, 12, null);
        aVar.a("FINDER_LIKE_AVATAR_ANIMATIOR_CONFIG", kz5.c0.i(0, 1, 2), kz5.c0.i("默认", "左右碰撞", "上下弹起"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_like_avatar_animator_style, false, 2, null);
        return aVar;
    }
}
