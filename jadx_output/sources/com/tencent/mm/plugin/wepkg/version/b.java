package com.tencent.mm.plugin.wepkg.version;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d30 f188511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.version.c f188512e;

    public b(com.tencent.mm.plugin.wepkg.version.c cVar, r45.d30 d30Var) {
        this.f188512e = cVar;
        this.f188511d = d30Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.sa7 sa7Var;
        com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask wepkgVersionUpdater$WepkgNetSceneProcessTask = this.f188512e.f188513a;
        int i17 = wepkgVersionUpdater$WepkgNetSceneProcessTask.f188505i;
        boolean z17 = wepkgVersionUpdater$WepkgNetSceneProcessTask.f188506m;
        r45.d30 d30Var = this.f188511d;
        if (d30Var == null) {
            return;
        }
        java.util.LinkedList linkedList = d30Var.f372031d;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgManager", "response.PkgList.size() is empty");
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.k85 k85Var = (r45.k85) it.next();
            if (k85Var != null) {
                java.lang.String str = k85Var.f378490d;
                r45.va7 va7Var = k85Var.f378491e;
                r45.ra7 ra7Var = k85Var.f378493g;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    if (ra7Var != null) {
                        if (ra7Var.f384701e) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "wepkg reload now");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(859L, 17L, 1L, false);
                            if (k85Var.f378492f != null) {
                                ((java.util.HashSet) com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify.f188328e).add(k85Var.f378490d);
                            }
                        }
                        if (ra7Var.f384700d) {
                            com.tencent.mm.plugin.wepkg.model.i.c().e(str, 2, 3);
                        }
                    }
                    if (va7Var != null && (sa7Var = va7Var.f388057e) != null) {
                        java.util.ArrayList arrayList2 = null;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(sa7Var.f385601d)) {
                            com.tencent.mm.plugin.wepkg.model.o0.f(str, null);
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(859L, 18L, 1L, false);
                        } else {
                            com.tencent.mm.plugin.wepkg.model.o0.i(str, va7Var.f388057e.f385602e, r8.f385603f, r8.f385604g);
                            com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
                            wepkgCrossProcessTask.f188343h = 3009;
                            wepkgCrossProcessTask.f188344i.f188374d = str;
                            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                                wepkgCrossProcessTask.z();
                            } else {
                                wepkgCrossProcessTask.s();
                            }
                            com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask2 = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
                            wepkgCrossProcessTask2.f188343h = com.google.android.gms.wearable.WearableStatusCodes.DUPLICATE_CAPABILITY;
                            wepkgCrossProcessTask2.f188347o.f188363e = str;
                            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                                wepkgCrossProcessTask2.z();
                            } else {
                                wepkgCrossProcessTask2.s();
                            }
                            if (z17) {
                                r45.ya7 ya7Var = k85Var.f378492f;
                                if (ya7Var != null) {
                                    r45.qa7 qa7Var = ya7Var.f390933f;
                                    r45.xa7 xa7Var = ya7Var.f390934g;
                                    arrayList2 = new java.util.ArrayList();
                                    if (qa7Var != null && qa7Var.f383795d != null) {
                                        arrayList2.add(com.tencent.mm.sdk.platformtools.w2.a(k85Var.f378490d + qa7Var.f383795d.f386260e));
                                    }
                                    if (xa7Var != null) {
                                        java.util.LinkedList linkedList2 = xa7Var.f389919d;
                                        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
                                            java.util.Iterator it6 = linkedList2.iterator();
                                            while (it6.hasNext()) {
                                                r45.ua7 ua7Var = (r45.ua7) it6.next();
                                                if (ua7Var != null && ua7Var.f387190f != null) {
                                                    arrayList2.add(com.tencent.mm.sdk.platformtools.w2.a(k85Var.f378490d + ua7Var.f387190f.f386260e));
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList2)) {
                                    hashSet.addAll(arrayList2);
                                }
                            }
                            arrayList.add(k85Var);
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify.a();
        zz4.d dVar = zz4.b.f477709a;
        dVar.getClass();
        if (hashSet.isEmpty()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(859L, 20L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(859L, 21L, 1L, false);
            zz4.c cVar = new zz4.c(dVar);
            cVar.f477710a = hashSet.size();
            cVar.f477711b = 0L;
            java.util.Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                ((java.util.concurrent.ConcurrentHashMap) dVar.f477712a).put((java.lang.String) it7.next(), cVar);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            return;
        }
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            com.tencent.mm.plugin.wepkg.model.p0.b().e((r45.k85) it8.next(), i17);
        }
    }
}
