package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xb0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xb0 f128300d = new com.tencent.mm.plugin.finder.storage.xb0();

    public xb0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "从拍摄进入发表的不能删除开关", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_post_from_shoot_forbid_delete, false, 2, null);
        aVar.a("FINDER_POST_FROM_SHOOT_FORBID_DELETE", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
