package com.tencent.mm.plugin.wepkg.utils;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {
    public c(com.tencent.mm.plugin.wepkg.utils.d dVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 2003;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.s();
        }
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = wepkgCrossProcessTask.f188344i;
        if (wepkgVersion == null || com.tencent.mm.sdk.platformtools.t8.K0(wepkgVersion.f188374d)) {
            return;
        }
        com.tencent.mm.plugin.wepkg.model.p0.b().d(wepkgVersion.f188374d, true);
    }
}
