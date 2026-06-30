package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class j60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.j60 f126984d = new com.tencent.mm.plugin.finder.storage.j60();

    public j60() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "微信profile是否显示视频号认证", null, null, 12, null);
        aVar.b("FinderWXProfileAuthInfoSwitch");
        aVar.a("WX_PROFILE_SHOW_FINDER_AUTH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
