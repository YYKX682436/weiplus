package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.s3 f127520d = new com.tencent.mm.plugin.finder.storage.s3();

    public s3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "清除视频号app push开关展示", null, null, 12, null);
        aVar.f317743n = com.tencent.mm.plugin.finder.storage.r3.f127462d;
        aVar.a("FINDER_APP_PUSH_SETTING", kz5.b0.c(0), kz5.b0.c("清除"));
        return aVar;
    }
}
