package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class gs extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.gs f126853d = new com.tencent.mm.plugin.finder.storage.gs();

    public gs() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "设置页小程序中引用该视频功能显示开关", null, null, 12, null);
        aVar.a("FINDER_SETTING_MINI_APP_REFERENCE_ENTRY", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        aVar.b("IsShowFinderMiniAppReferenceEntry");
        return aVar;
    }
}
