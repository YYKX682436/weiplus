package vz4;

/* loaded from: classes8.dex */
public class t implements com.tencent.mm.plugin.wepkg.event.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vz4.x f441747a;

    public t(vz4.x xVar) {
        this.f441747a = xVar;
    }

    @Override // com.tencent.mm.plugin.wepkg.event.c
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify downloadBigPkgCompleteNotify;
        java.lang.String str;
        boolean z17;
        java.lang.String a17;
        java.lang.String[] strArr;
        boolean z18 = obj instanceof com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify;
        vz4.x xVar = this.f441747a;
        if (z18) {
            com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify forceUpdateNotify = (com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify) obj;
            if (forceUpdateNotify == null || (strArr = forceUpdateNotify.f188329d) == null || strArr.length <= 0) {
                return;
            }
            for (java.lang.String str2 : strArr) {
                if (str2.equals(vz4.b.c()) || (!com.tencent.mm.sdk.platformtools.t8.K0(xVar.f441755c) && str2.equals(xVar.f441755c))) {
                    xVar.a();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    xVar.f441767o = currentTimeMillis;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "forceUpdatePageSrc, pkgId: %s, time: %d", str2, java.lang.Long.valueOf(currentTimeMillis));
                    ((java.util.HashSet) xVar.f441766n).add(str2);
                    com.tencent.mm.plugin.wepkg.event.d dVar = xVar.f441764l;
                    if (dVar != null && xVar.f441756d && !xVar.f441765m) {
                        xVar.f441765m = true;
                        dVar.a(str2);
                    }
                    if (vz4.b.c().equals(str2)) {
                        vz4.b.f441719b = true;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (!(obj instanceof com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify) || (downloadBigPkgCompleteNotify = (com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify) obj) == null || (str = downloadBigPkgCompleteNotify.f188325d) == null) {
            return;
        }
        if (str.equals(vz4.b.c()) || str.equals(xVar.f441755c)) {
            java.lang.String str3 = downloadBigPkgCompleteNotify.f188325d;
            xVar.getClass();
            boolean z19 = downloadBigPkgCompleteNotify.f188326e;
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "downloadPkgCpl, pkgId: %s, success: %b", str3, java.lang.Boolean.valueOf(z19));
            if (z19 && downloadBigPkgCompleteNotify.f188327f && str3.equalsIgnoreCase(xVar.f441755c)) {
                xVar.a();
            }
            java.util.HashSet hashSet = (java.util.HashSet) xVar.f441766n;
            if (hashSet.contains(str3)) {
                int i17 = z19 ? 1 : 2;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - xVar.f441767o;
                java.lang.String str4 = xVar.f441753a;
                java.lang.String str5 = xVar.f441755c;
                if (str5 == null || !str5.equals(str3)) {
                    if (vz4.b.c().equals(str3)) {
                        a17 = vz4.b.a();
                        long j17 = i17;
                        z17 = z19;
                        com.tencent.mm.plugin.wepkg.utils.a.c("forceUpdateTime", str4, str3, a17, j17, currentTimeMillis2, null);
                        hashSet.remove(str3);
                        ((java.util.HashMap) vz4.s.f441744a).remove(str3);
                    }
                    a17 = "";
                    long j172 = i17;
                    z17 = z19;
                    com.tencent.mm.plugin.wepkg.utils.a.c("forceUpdateTime", str4, str3, a17, j172, currentTimeMillis2, null);
                    hashSet.remove(str3);
                    ((java.util.HashMap) vz4.s.f441744a).remove(str3);
                } else {
                    com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = xVar.f441758f;
                    if (wepkgVersion != null) {
                        a17 = wepkgVersion.f188376f;
                        long j1722 = i17;
                        z17 = z19;
                        com.tencent.mm.plugin.wepkg.utils.a.c("forceUpdateTime", str4, str3, a17, j1722, currentTimeMillis2, null);
                        hashSet.remove(str3);
                        ((java.util.HashMap) vz4.s.f441744a).remove(str3);
                    }
                    a17 = "";
                    long j17222 = i17;
                    z17 = z19;
                    com.tencent.mm.plugin.wepkg.utils.a.c("forceUpdateTime", str4, str3, a17, j17222, currentTimeMillis2, null);
                    hashSet.remove(str3);
                    ((java.util.HashMap) vz4.s.f441744a).remove(str3);
                }
            } else {
                z17 = z19;
            }
            if (vz4.b.c().equals(str3) && (vz4.b.f441719b || vz4.s.f441746c == 0)) {
                vz4.b.f441719b = false;
                if (z17) {
                    vz4.b.b();
                }
            }
            if (xVar.f441764l != null && xVar.f441756d && hashSet.isEmpty()) {
                xVar.f441764l.b(z17);
            }
        }
    }
}
