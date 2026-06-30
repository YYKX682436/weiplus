package com.tencent.mm.plugin.wepkg.version;

/* loaded from: classes8.dex */
public abstract class f {
    public static void a(java.util.List list, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(list);
        b(hashSet, i17, -1, false);
    }

    public static void b(java.util.Set set, int i17, int i18, boolean z17) {
        if (set == null) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                stringBuffer.append(str);
                stringBuffer.append(";");
                r45.m40 m40Var = new r45.m40();
                m40Var.f380136d = str;
                m40Var.f380138f = i17;
                com.tencent.mm.plugin.wepkg.model.WepkgVersion d17 = com.tencent.mm.plugin.wepkg.model.o0.d(str);
                if (d17 == null) {
                    m40Var.f380137e = "";
                    linkedList.add(m40Var);
                } else {
                    m40Var.f380137e = d17.f188376f;
                    java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
                    if (java.lang.Math.abs((com.tencent.mm.sdk.platformtools.t8.i1() - d17.f188387t) + d17.f188380m) >= d17.f188380m) {
                        linkedList.add(m40Var);
                        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
                        wepkgCrossProcessTask.f188343h = 3003;
                        wepkgCrossProcessTask.f188344i.f188374d = str;
                        if (com.tencent.mm.sdk.platformtools.x2.n()) {
                            com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.wepkg.model.g0(wepkgCrossProcessTask));
                        } else {
                            wepkgCrossProcessTask.d();
                        }
                    } else {
                        stringBuffer2.append(str);
                        stringBuffer2.append(";");
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionUpdater", "All wepkg list[%s] to update, excluded wepkg list[%s], scene:%d, downloadTriggerType:%d, isReportSize:%b", stringBuffer.toString(), stringBuffer2.toString(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList) || linkedList.size() == 0) {
            return;
        }
        com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask wepkgVersionUpdater$WepkgNetSceneProcessTask = new com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask();
        wepkgVersionUpdater$WepkgNetSceneProcessTask.f188505i = i18;
        wepkgVersionUpdater$WepkgNetSceneProcessTask.f188506m = z17;
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            r45.m40 m40Var2 = (r45.m40) it6.next();
            com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask.WepkgCheckReq wepkgCheckReq = new com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask.WepkgCheckReq(null);
            wepkgCheckReq.f188507d = m40Var2.f380136d;
            wepkgCheckReq.f188508e = m40Var2.f380137e;
            wepkgCheckReq.f188509f = m40Var2.f380138f;
            ((java.util.ArrayList) wepkgVersionUpdater$WepkgNetSceneProcessTask.f188504h).add(wepkgCheckReq);
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.wepkg.version.a(wepkgVersionUpdater$WepkgNetSceneProcessTask));
        } else {
            wepkgVersionUpdater$WepkgNetSceneProcessTask.d();
        }
    }
}
