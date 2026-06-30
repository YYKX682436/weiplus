package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class vs extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.vs f128210d = new com.tencent.mm.plugin.finder.storage.vs();

    public vs() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "分享完播出引导下一个卡片开关", null, null, 12, null);
        aVar.a("FINDER_SHARE_GUIDE_NEXT_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_share_guide_next, false, 2, null);
        return aVar;
    }
}
