package n34;

/* loaded from: classes4.dex */
public class x2 extends com.tencent.mm.sdk.event.n {
    public x2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        com.tencent.mm.autogen.events.RecentlySnsMediaObjEvent recentlySnsMediaObjEvent = (com.tencent.mm.autogen.events.RecentlySnsMediaObjEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecentlySnsMediaObjListener", "RecentlySnsMediaObjEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        } else if (recentlySnsMediaObjEvent instanceof com.tencent.mm.autogen.events.RecentlySnsMediaObjEvent) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            am.zp zpVar = recentlySnsMediaObjEvent.f54658h;
            zpVar.f8595a = null;
            zpVar.f8596b = null;
            zpVar.f8597c = null;
            zpVar.f8598d = null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recently username ");
            am.yp ypVar = recentlySnsMediaObjEvent.f54657g;
            sb6.append(ypVar.f8473a);
            com.tencent.mars.xlog.Log.i("MicroMsg.RecentlySnsMediaObjListener", sb6.toString());
            if (com.tencent.mm.sdk.platformtools.t8.K0(ypVar.f8473a)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
            } else {
                gm0.j1.i();
                boolean equals = ypVar.f8473a.equals((java.lang.String) gm0.j1.u().c().l(2, null));
                com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
                java.lang.String str = ypVar.f8473a;
                Fj.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserNewerInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                android.database.Cursor B = Fj.f165994d.B(("select *,rowid from SnsInfo " + Fj.J0(str, equals)) + " AND type in ( 1 , 54 , 15)" + com.tencent.mm.plugin.sns.storage.f2.f165982o + " limit 4", null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserNewerInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                if (B == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                } else {
                    boolean moveToFirst = B.moveToFirst();
                    am.zp zpVar2 = recentlySnsMediaObjEvent.f54658h;
                    if (moveToFirst) {
                        int i17 = 0;
                        do {
                            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                            snsInfo.convertFrom(B);
                            if (snsInfo.getTypeFlag() != 21) {
                                java.util.Iterator it = snsInfo.getTimeLine().ContentObj.f369840h.iterator();
                                while (it.hasNext()) {
                                    r45.jj4 jj4Var = (r45.jj4) it.next();
                                    int i18 = jj4Var.f377856e;
                                    if (i18 != 2 && i18 != 6) {
                                    }
                                    i17++;
                                    linkedList.add(jj4Var);
                                    if (i17 >= 4) {
                                        break;
                                    }
                                }
                            }
                        } while (B.moveToNext());
                        B.close();
                        if (linkedList.size() > 0) {
                            zpVar2.f8595a = (r45.jj4) linkedList.get(0);
                        }
                        if (linkedList.size() > 1) {
                            zpVar2.f8596b = (r45.jj4) linkedList.get(1);
                        }
                        if (linkedList.size() > 2) {
                            zpVar2.f8597c = (r45.jj4) linkedList.get(2);
                        }
                        if (linkedList.size() > 3) {
                            zpVar2.f8598d = (r45.jj4) linkedList.get(3);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                        z17 = true;
                    } else {
                        B.close();
                        java.lang.String userName = ypVar.f8473a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarFeedList", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                        java.util.LinkedList linkedList2 = new java.util.LinkedList();
                        if (cc4.b.f40482a.a()) {
                            pb4.e eVar = pb4.e.f353196a;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProfileNewerStarSnsInfoByLimit", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
                            kotlin.jvm.internal.o.g(userName, "userName");
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "getProfileNewerStarSnsInfoByLimit >> userName: " + userName + ", 4，" + pb4.e.f353197b);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            if (pb4.e.f353197b > 0) {
                                l75.k0 f17 = eVar.f();
                                p75.i0 i19 = dm.ab.f235716y.i();
                                i19.f352657d = dm.ab.B.j(userName);
                                i19.f352659f = kz5.b0.c(dm.ab.C.u());
                                i19.c(pb4.e.f353197b, 0);
                                java.util.List k17 = i19.a().k(f17, dm.ab.class);
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getStarSnsInfoByLimit >> ");
                                sb7.append(userName);
                                sb7.append(", 4, ");
                                java.util.ArrayList arrayList2 = (java.util.ArrayList) k17;
                                sb7.append(arrayList2.size());
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", sb7.toString());
                                java.util.Iterator it6 = arrayList2.iterator();
                                while (it6.hasNext()) {
                                    dm.ab abVar = (dm.ab) it6.next();
                                    if (com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(abVar.field_type) || abVar.field_type == 15) {
                                        com.tencent.mm.plugin.sns.storage.SnsInfo n17 = eVar.n(abVar);
                                        kotlin.jvm.internal.o.d(n17);
                                        arrayList.add(n17);
                                    }
                                    if (arrayList.size() >= 4) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProfileNewerStarSnsInfoByLimit", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
                                        break;
                                    }
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProfileNewerStarSnsInfoByLimit", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
                            com.tencent.mars.xlog.Log.i("MicroMsg.RecentlySnsMediaObjListener", "getStarFeedList >> %d", java.lang.Integer.valueOf(arrayList.size()));
                            java.util.Iterator it7 = arrayList.iterator();
                            int i27 = 0;
                            while (it7.hasNext()) {
                                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) it7.next();
                                if (snsInfo2.getTypeFlag() != 21) {
                                    java.util.Iterator it8 = snsInfo2.getTimeLine().ContentObj.f369840h.iterator();
                                    while (it8.hasNext()) {
                                        r45.jj4 jj4Var2 = (r45.jj4) it8.next();
                                        int i28 = jj4Var2.f377856e;
                                        if (i28 == 2 || i28 == 6) {
                                            i27++;
                                            linkedList2.add(jj4Var2);
                                            if (i27 >= 4) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (linkedList2.size() > 0) {
                                zpVar2.f8595a = (r45.jj4) linkedList2.get(0);
                            }
                            if (linkedList2.size() > 1) {
                                zpVar2.f8596b = (r45.jj4) linkedList2.get(1);
                            }
                            if (linkedList2.size() > 2) {
                                zpVar2.f8597c = (r45.jj4) linkedList2.get(2);
                            }
                            if (linkedList2.size() > 3) {
                                zpVar2.f8598d = (r45.jj4) linkedList2.get(3);
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarFeedList", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                    }
                }
            }
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.f("MicroMsg.RecentlySnsMediaObjListener", "mismatched event");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        return z17;
    }
}
