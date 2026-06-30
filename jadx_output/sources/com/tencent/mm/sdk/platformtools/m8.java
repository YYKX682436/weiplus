package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public final class m8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.m8 f192864a = new com.tencent.mm.sdk.platformtools.m8();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f192865b = jz5.h.a(jz5.i.f302829d, com.tencent.mm.sdk.platformtools.l8.f192842d);

    /* renamed from: c, reason: collision with root package name */
    public static yz5.l f192866c;

    public final void a(android.net.Uri uri, java.lang.String path) {
        kotlin.jvm.internal.o.g(uri, "uri");
        kotlin.jvm.internal.o.g(path, "path");
        if (path.length() > 0) {
            jz5.g gVar = f192865b;
            synchronized (((java.util.Map) gVar.getValue())) {
                java.util.Map map = (java.util.Map) gVar.getValue();
                java.lang.String o17 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(path)).o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                java.lang.String uri2 = uri.toString();
                kotlin.jvm.internal.o.f(uri2, "toString(...)");
                map.put(o17, uri2);
            }
        }
    }

    public final void b(yz5.l lVar) {
        f192866c = lVar;
    }
}
