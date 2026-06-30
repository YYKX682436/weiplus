package fo1;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f264880e;

    public k(java.lang.String str, long j17) {
        this.f264879d = str;
        this.f264880e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMediaTimeByTalker, talker=");
        java.lang.String str = this.f264879d;
        sb6.append(str);
        sb6.append(", time=");
        long j17 = this.f264880e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("RoamBackup.MediaPullObserver", sb6.toString());
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("RoamMediaTime", gm0.j1.b().h(), 1);
        kotlin.jvm.internal.o.f(J2, "getAccountAwareMMKV(...)");
        java.util.Iterator it = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.h(false).iterator();
        while (it.hasNext()) {
            java.lang.String str2 = ((com.tencent.wechat.aff.affroam.g) it.next()).f215829d + '_' + str;
            if (J2.q(str2, com.tencent.wcdb.core.Database.DictDefaultMatchValue) > j17) {
                J2.B(str2, j17);
            }
        }
    }
}
