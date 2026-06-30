package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class s00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.s00 f127515d = new com.tencent.mm.plugin.finder.storage.s00();

    public s00() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号操作震动反馈", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_operate_click_shock_android, false, 2, null);
        aVar.a("FinderOperateClickShock", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
