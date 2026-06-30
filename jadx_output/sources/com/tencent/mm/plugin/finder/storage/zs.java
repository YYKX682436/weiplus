package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class zs extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.zs f128469d = new com.tencent.mm.plugin.finder.storage.zs();

    public zs() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "分享完播弹出视频号入口", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_share_popup_entrance_enable, false, 2, null);
        aVar.a("debugSharePopupEntrance", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
