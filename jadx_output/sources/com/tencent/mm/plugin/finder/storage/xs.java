package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xs extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xs f128325d = new com.tencent.mm.plugin.finder.storage.xs();

    public xs() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "圈外分享模式(仅预览)", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_comment_fullscreen, false, 2, null);
        aVar.a("USERINFO_FINDER_FORWARD_DEBUG_TYPE_INT", kz5.c0.i(-1, 1, 2), kz5.c0.i("默认", "允许nickname", "过滤nickname"));
        return aVar;
    }
}
