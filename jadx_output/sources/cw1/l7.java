package cw1;

/* loaded from: classes12.dex */
public final class l7 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final cw1.l7 f223123d = new cw1.l7();

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        android.app.usage.StorageStats queryStatsForPackage = ((android.app.usage.StorageStatsManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(android.app.usage.StorageStatsManager.class)).queryStatsForPackage(android.os.storage.StorageManager.UUID_DEFAULT, com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName(), android.os.Process.myUserHandle());
        kotlin.jvm.internal.o.f(queryStatsForPackage, "queryStatsForPackage(...)");
        return java.lang.Long.valueOf(queryStatsForPackage.getDataBytes());
    }
}
