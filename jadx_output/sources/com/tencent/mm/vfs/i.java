package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class i extends com.tencent.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f212986e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f212987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.ApkCleanupFileSystem f212988g;

    public i(com.tencent.mm.vfs.ApkCleanupFileSystem apkCleanupFileSystem, com.tencent.mm.vfs.q2 q2Var) {
        this.f212988g = apkCleanupFileSystem;
        this.f212986e = q2Var;
        this.f212987f = java.util.Collections.singletonList(q2Var);
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return this.f212987f;
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f212986e;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        android.os.Bundle bundle;
        java.lang.Iterable<com.tencent.mm.vfs.x1> list = this.f212986e.list("");
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        com.tencent.mm.vfs.x1 x1Var = null;
        int i17 = 0;
        com.tencent.mm.vfs.x1 x1Var2 = null;
        for (com.tencent.mm.vfs.x1 x1Var3 : list) {
            if (!x1Var3.f213236f) {
                java.lang.String str = x1Var3.f213232b;
                boolean endsWith = str.endsWith(".temp");
                long j17 = x1Var3.f213235e;
                if (endsWith) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (java.lang.System.currentTimeMillis() - j17 > 86400000) {
                        x1Var3.a();
                    } else {
                        if (x1Var != null) {
                            if (j17 > x1Var.f213235e) {
                                x1Var.a();
                            } else {
                                x1Var3.a();
                            }
                        }
                        x1Var = x1Var3;
                    }
                } else if (str.endsWith(".apk")) {
                    android.content.pm.PackageInfo packageArchiveInfo = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageArchiveInfo(x1Var3.f213237g.D(x1Var3.f213231a, false), 128);
                    if (packageArchiveInfo != null) {
                        java.lang.String str2 = packageArchiveInfo.packageName;
                        if (str2 == null || str2.equals(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
                            android.content.pm.ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                                int i18 = bundle.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION");
                                int i19 = o45.wf.f343023a;
                                if (i18 <= o45.wf.f343029g) {
                                    x1Var3.a();
                                } else {
                                    if (x1Var2 != null) {
                                        if (i18 > i17) {
                                            x1Var2.a();
                                        } else {
                                            x1Var3.a();
                                        }
                                    }
                                    x1Var2 = x1Var3;
                                    i17 = i18;
                                }
                            }
                        } else {
                            x1Var3.a();
                        }
                    }
                    if (i17 != 0) {
                        x1Var3.a();
                    } else {
                        if (x1Var2 != null) {
                            if (j17 > x1Var2.f213235e) {
                                x1Var2.a();
                            } else {
                                x1Var3.a();
                            }
                        }
                        x1Var2 = x1Var3;
                    }
                }
            }
        }
        super.q(cancellationSignal);
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return "apkClean <- " + this.f212986e;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f212988g;
    }
}
