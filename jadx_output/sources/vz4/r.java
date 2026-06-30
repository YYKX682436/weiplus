package vz4;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441743d;

    public r(java.lang.String str) {
        this.f441743d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String str = this.f441743d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            hashSet.add(str);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(vz4.b.c())) {
            hashSet.add(vz4.b.c());
        }
        com.tencent.mm.plugin.wepkg.version.f.b(hashSet, 0, -1, false);
    }
}
