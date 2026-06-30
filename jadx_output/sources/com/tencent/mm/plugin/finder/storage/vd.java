package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class vd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.vd f128189d = new com.tencent.mm.plugin.finder.storage.vd();

    public vd() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发表时不透传GPS信息", null, null, 12, null);
        aVar.b("FinderForbidPostMediaGPSInfo");
        aVar.a("FINDER_FORBID_POST_MEDIA_GPS_INFO", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
