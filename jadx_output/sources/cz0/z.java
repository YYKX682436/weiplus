package cz0;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final cz0.z f224976a = new cz0.z();

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("maas_sdk");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public final java.lang.String b() {
        java.lang.String string = a().getString("KEY_SDK_SHA1", "");
        return string == null ? "" : string;
    }

    public final boolean c() {
        return a().getLong("KEY_SDK_UPDATE_TIME", 0L) < a().getLong("KEY_RES_UPDATE_TIME", 0L);
    }
}
