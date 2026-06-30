package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class t40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.t40 f127583d = new com.tencent.mm.plugin.finder.storage.t40();

    public t40() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "引导用户点赞自己的视频", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_self_like_edu, false, 2, null);
        aVar.a("DEBUG_SELF_LIKE_EDU", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "支持"));
        return aVar;
    }
}
