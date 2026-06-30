package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class r8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.r8 f127472d = new com.tencent.mm.plugin.finder.storage.r8();

    public r8() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_COMMENT_IMAGE_SWITCH_INT_SYNC, 0);
        ob2.a aVar = new ob2.a(-1, "评论图片强制开关", null, null, 12, null);
        aVar.a("FINDER_COMMENT_IMAGE_SWITCH", kz5.c0.i(-1, 0, 1), kz5.c0.i("svr(" + r17 + ')', "关闭", "显示"));
        return aVar;
    }
}
