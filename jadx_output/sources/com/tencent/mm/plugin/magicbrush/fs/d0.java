package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class d0 {
    public d0(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String str) {
        com.tencent.mm.vfs.x1 m17;
        if (com.tencent.mm.vfs.w6.j(str + "/dir.lock")) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str + "/dir.lock");
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            long j17 = 0;
            if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                j17 = m17.f213235e;
            }
            if (currentTimeMillis - j17 < com.tencent.mm.plugin.magicbrush.fs.e0.f147963b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushTempFileCleaner", "checkMagicDirHasLocked path %s, locked", str);
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushTempFileCleaner", "checkMagicDirHasLocked path %s, lock expired", str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushTempFileCleaner", "checkMagicDirHasLocked path %s, lock free", str);
        return false;
    }
}
