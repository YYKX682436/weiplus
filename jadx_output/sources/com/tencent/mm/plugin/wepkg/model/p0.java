package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.wepkg.model.p0 f188452a;

    public static com.tencent.mm.plugin.wepkg.model.p0 b() {
        if (f188452a == null) {
            synchronized (com.tencent.mm.plugin.wepkg.model.p0.class) {
                if (f188452a == null) {
                    f188452a = new com.tencent.mm.plugin.wepkg.model.p0();
                }
            }
        }
        return f188452a;
    }

    public final void a(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            f(z17, str, 3);
            return;
        }
        java.util.List b17 = com.tencent.mm.plugin.wepkg.model.o0.b(str);
        if (!com.tencent.mm.sdk.platformtools.t8.L0(b17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:false list.size:%s", java.lang.Integer.valueOf(b17.size()));
            f(z17, str, 1);
            return;
        }
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 3006;
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = wepkgCrossProcessTask.f188344i;
        wepkgVersion.f188374d = str;
        wepkgVersion.f188391x = true;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.s();
        }
        com.tencent.mm.plugin.wepkg.model.WepkgVersion d17 = com.tencent.mm.plugin.wepkg.model.o0.d(str);
        if (d17 != null && d17.f188388u != 0) {
            com.tencent.mm.plugin.wepkg.utils.a.c("downloadCompleteTime", "", d17.f188374d, d17.f188376f, -1L, java.lang.System.currentTimeMillis() - (d17.f188388u * 1000), null);
            com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask2 = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
            wepkgCrossProcessTask2.f188343h = com.tencent.shadow.dynamic.host.FailedException.ERROR_CODE_RELOAD_RUNTIME_EXCEPTION;
            wepkgCrossProcessTask2.f188344i.f188374d = str;
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                wepkgCrossProcessTask2.z();
            } else {
                wepkgCrossProcessTask2.s();
            }
        }
        f(z17, str, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:true");
    }

    public final void c(java.lang.String str, java.util.List list, boolean z17) {
        try {
            if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "loopDownload WepkgPreloadFile is empty");
                a(str, z17);
                return;
            }
            com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile = (com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile) list.remove(0);
            if (wepkgPreloadFile == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "download item is null, to loop");
                c(str, list, z17);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "download preload files pkgid:%s, version:%s, rid:%s", wepkgPreloadFile.f188363e, wepkgPreloadFile.f188364f, wepkgPreloadFile.f188366h);
                com.tencent.mm.plugin.wepkg.model.s0 s0Var = new com.tencent.mm.plugin.wepkg.model.s0(this, str, list, z17);
                s0Var.f188394a = wepkgPreloadFile;
                com.tencent.mm.plugin.wepkg.model.o0.a(2, wepkgPreloadFile.f188363e, wepkgPreloadFile.f188366h, wepkgPreloadFile.f188369n, wepkgPreloadFile.f188370o, wepkgPreloadFile.f188364f, wepkgPreloadFile.f188368m, wepkgPreloadFile.f188371p, s0Var);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgUpdater", "loopDownload err:%s", e17.getMessage());
        }
    }

    public void d(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            f(z17, str, 3);
            return;
        }
        com.tencent.mm.plugin.wepkg.model.q0 q0Var = new com.tencent.mm.plugin.wepkg.model.q0(this, z17, str);
        q0Var.f188394a = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "start update wepkg. pkgid:%s, isAutoUpdate:%s", str, java.lang.Boolean.valueOf(z17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            f(z17, str, 3);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "update big package. pkgid:%s, isAutoUpdate:%s", str, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.wepkg.model.WepkgVersion d17 = com.tencent.mm.plugin.wepkg.model.o0.d(str);
        if (d17 == null) {
            f(z17, str, 3);
            return;
        }
        if (!d17.f188390w) {
            com.tencent.mm.plugin.wepkg.model.o0.a(1, d17.f188374d, "", d17.f188384q, d17.f188385r, d17.f188376f, d17.f188383p, d17.f188386s, new com.tencent.mm.plugin.wepkg.model.r0(this, q0Var, z17, str));
            return;
        }
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188333f = true;
        wepkgCrossProcessTask.f188334g = true;
        q0Var.a(wepkgCrossProcessTask);
    }

    public void e(r45.k85 k85Var, int i17) {
        r45.ya7 ya7Var;
        r45.qa7 qa7Var;
        r45.ta7 ta7Var;
        r45.wa7 wa7Var;
        r45.ta7 ta7Var2;
        if (k85Var == null || (ya7Var = k85Var.f378492f) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "dont need to update wepkg");
            if (k85Var != null) {
                d(k85Var.f378490d, false);
                return;
            }
            return;
        }
        r45.qa7 qa7Var2 = ya7Var.f390933f;
        r45.xa7 xa7Var = ya7Var.f390934g;
        if (qa7Var2 == null && xa7Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "bigPackage is null and preloadFiles is null");
            com.tencent.mm.plugin.wepkg.model.i.c().e(k85Var.f378490d, 2, 5);
            return;
        }
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 2002;
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = wepkgCrossProcessTask.f188344i;
        wepkgVersion.getClass();
        wepkgVersion.f188374d = k85Var.f378490d;
        r45.va7 va7Var = k85Var.f378491e;
        r45.ya7 ya7Var2 = k85Var.f378492f;
        if (va7Var != null) {
            wepkgVersion.f188375e = va7Var.f388056d;
            r45.sa7 sa7Var = va7Var.f388057e;
            if (sa7Var != null) {
                wepkgVersion.f188376f = sa7Var.f385601d;
                wepkgVersion.f188378h = sa7Var.f385602e;
                wepkgVersion.f188379i = sa7Var.f385603f;
                wepkgVersion.f188380m = sa7Var.f385604g;
            }
        }
        if (ya7Var2 != null) {
            wepkgVersion.f188382o = ya7Var2.f390931d;
            wepkgVersion.f188389v = ya7Var2.f390932e;
            r45.qa7 qa7Var3 = ya7Var2.f390933f;
            if (qa7Var3 == null || (ta7Var2 = qa7Var3.f383795d) == null || com.tencent.mm.sdk.platformtools.t8.K0(ta7Var2.f386260e)) {
                wepkgVersion.f188390w = true;
            } else {
                r45.ta7 ta7Var3 = qa7Var3.f383795d;
                wepkgVersion.f188383p = ta7Var3.f386259d;
                wepkgVersion.f188384q = ta7Var3.f386260e;
                wepkgVersion.f188385r = ta7Var3.f386262g;
                wepkgVersion.f188386s = ta7Var3.f386261f;
                wepkgVersion.f188390w = false;
            }
            r45.xa7 xa7Var2 = ya7Var2.f390934g;
            if (xa7Var2 != null) {
                wepkgVersion.f188392y = xa7Var2.f389920e;
            }
            if (xa7Var2 == null || com.tencent.mm.sdk.platformtools.t8.L0(xa7Var2.f389919d) || !xa7Var2.f389920e) {
                wepkgVersion.f188391x = true;
            } else {
                wepkgVersion.f188391x = false;
            }
            wepkgVersion.f188393z = 0;
        }
        wepkgVersion.A = i17;
        com.tencent.mm.plugin.wepkg.model.WePkgDiffInfo wePkgDiffInfo = wepkgCrossProcessTask.f188346n;
        wePkgDiffInfo.getClass();
        r45.ya7 ya7Var3 = k85Var.f378492f;
        if (ya7Var3 != null && (qa7Var = ya7Var3.f390933f) != null && (ta7Var = qa7Var.f383795d) != null && (wa7Var = ta7Var.f386263h) != null && !com.tencent.mm.sdk.platformtools.t8.K0(wa7Var.f389020e)) {
            r45.wa7 wa7Var2 = k85Var.f378492f.f390933f.f383795d.f386263h;
            wePkgDiffInfo.f188338g = k85Var.f378491e.f388057e.f385601d;
            wePkgDiffInfo.f188335d = k85Var.f378490d;
            wePkgDiffInfo.f188339h = wa7Var2.f389020e;
            wePkgDiffInfo.f188340i = wa7Var2.f389019d;
            wePkgDiffInfo.f188341m = wa7Var2.f389022g;
            wePkgDiffInfo.f188342n = wa7Var2.f389021f;
        }
        r45.xa7 xa7Var3 = k85Var.f378492f.f390934g;
        if (xa7Var3 != null) {
            java.util.LinkedList linkedList = xa7Var3.f389919d;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.ua7 ua7Var = (r45.ua7) it.next();
                    com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile = new com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile();
                    java.lang.String str = k85Var.f378490d;
                    java.lang.String str2 = k85Var.f378491e.f388057e.f385601d;
                    if (ua7Var != null) {
                        wepkgPreloadFile.f188362d = com.tencent.mm.plugin.wepkg.utils.n.c(str, ua7Var.f387188d);
                        wepkgPreloadFile.f188363e = str;
                        wepkgPreloadFile.f188364f = str2;
                        wepkgPreloadFile.f188366h = ua7Var.f387188d;
                        wepkgPreloadFile.f188367i = ua7Var.f387189e;
                        r45.ta7 ta7Var4 = ua7Var.f387190f;
                        if (ta7Var4 != null) {
                            wepkgPreloadFile.f188368m = ta7Var4.f386259d;
                            wepkgPreloadFile.f188369n = ta7Var4.f386260e;
                            wepkgPreloadFile.f188370o = ta7Var4.f386262g;
                            wepkgPreloadFile.f188371p = ta7Var4.f386261f;
                        }
                        wepkgPreloadFile.f188372q = false;
                    }
                    arrayList.add(wepkgPreloadFile);
                }
                wepkgCrossProcessTask.f188348p = arrayList;
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.s();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "downloadTriggerType:%d", java.lang.Integer.valueOf(i17));
        if (i17 == -1 || i17 == 0) {
            d(k85Var.f378490d, false);
            return;
        }
        if (i17 == 1) {
            if (com.tencent.mm.plugin.wepkg.utils.n.e(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                d(k85Var.f378490d, false);
            }
        } else {
            if (i17 != 2) {
                return;
            }
            com.tencent.mm.autogen.events.GetEntranceStateEvent getEntranceStateEvent = new com.tencent.mm.autogen.events.GetEntranceStateEvent();
            getEntranceStateEvent.e();
            if (getEntranceStateEvent.f54392g.f8003a) {
                d(k85Var.f378490d, false);
            }
        }
    }

    public final void f(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent = new com.tencent.mm.autogen.events.WepkgNotifyEvent();
            wepkgNotifyEvent.f54992g.f7969a = 0;
            wepkgNotifyEvent.e();
        }
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END;
        wepkgCrossProcessTask.f188344i.f188374d = str;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.s();
        }
        com.tencent.mm.plugin.wepkg.model.i.c().e(str, 3, 6);
    }
}
