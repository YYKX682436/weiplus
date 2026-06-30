package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lt f127153d = new com.tencent.mm.plugin.finder.storage.lt();

    public lt() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(172800, "转发按钮可出菜单教育限制的时间间隔", null, null, 12, null);
        aVar.a("FINDER_SHARE_TO_MORE_SHOW_GUIDE_INTERVAL", kz5.c0.i(172800, 5, 10), kz5.c0.i("default:2day", "5s", "10s"));
        return aVar;
    }
}
