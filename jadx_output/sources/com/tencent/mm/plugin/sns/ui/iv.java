package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class iv implements com.tencent.mm.plugin.sns.ui.tt {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f169448a;

    public iv(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f169448a = snsUserUI;
    }

    public int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        return 2;
    }

    public void b(boolean z17, int i17, java.util.List list, java.util.List list2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyList", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f169448a;
        if (i17 != -1 && com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI) != null) {
            com.tencent.mm.plugin.sns.ui.so T6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI);
            T6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addFristItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            com.tencent.mm.plugin.sns.ui.vo voVar = T6.G;
            if (voVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addHeaderItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                com.tencent.mm.plugin.sns.storage.SnsInfo i18 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
                if (i18 == null || i18.getTimeLine().ContentObj == null || voVar.f170699d.size() <= 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addHeaderItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                } else {
                    if (cc4.b.f40482a.a()) {
                        voVar.f170699d.add(2, i18);
                    } else {
                        voVar.f170699d.add(1, i18);
                    }
                    voVar.f();
                    voVar.e();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addHeaderItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addFristItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        }
        if (com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI) != null && list != null && list2 != null) {
            com.tencent.mm.plugin.sns.ui.so T62 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI);
            T62.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            if (T62.f170478J) {
                com.tencent.mm.plugin.sns.ui.xo xoVar = T62.H;
                if (xoVar != null) {
                    if (list.size() + list2.size() == 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        if (list.size() == 0) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        } else {
                            java.util.Iterator it = list.iterator();
                            while (it.hasNext()) {
                                int intValue = ((java.lang.Integer) it.next()).intValue();
                                int size = xoVar.f171574d.size();
                                int i19 = 1;
                                while (true) {
                                    if (i19 >= size) {
                                        break;
                                    }
                                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) xoVar.f171574d.get(i19);
                                    if (snsInfo != null && snsInfo.localid == intValue) {
                                        xoVar.f171574d.remove(i19);
                                        break;
                                    }
                                    i19++;
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        if (list2.size() == 0) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        } else {
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            int i27 = 1;
                            while (i27 < xoVar.f171574d.size()) {
                                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) xoVar.f171574d.get(i27);
                                if (snsInfo2 != null) {
                                    java.util.Iterator it6 = list2.iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            break;
                                        }
                                        int intValue2 = ((java.lang.Integer) it6.next()).intValue();
                                        if (snsInfo2.localid == intValue2) {
                                            xoVar.f171574d.remove(i27);
                                            linkedList.add(com.tencent.mm.plugin.sns.model.l4.Fj().i1(intValue2));
                                            i27--;
                                            break;
                                        }
                                    }
                                }
                                i27++;
                            }
                            java.util.Iterator it7 = linkedList.iterator();
                            while (it7.hasNext()) {
                                xoVar.f171574d.add((com.tencent.mm.plugin.sns.storage.SnsInfo) it7.next());
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sortInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        java.util.Collections.sort(xoVar.f171574d, xoVar.f171580j);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sortInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        xoVar.d(xoVar.f171578h, xoVar.f171574d);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            } else {
                com.tencent.mm.plugin.sns.ui.vo voVar2 = T62.G;
                if (voVar2 != null) {
                    if (list.size() + list2.size() == 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        if (list.size() == 0) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        } else {
                            java.util.Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                int intValue3 = ((java.lang.Integer) it8.next()).intValue();
                                int size2 = voVar2.f170699d.size();
                                int i28 = 1;
                                while (true) {
                                    if (i28 >= size2) {
                                        break;
                                    }
                                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = (com.tencent.mm.plugin.sns.storage.SnsInfo) voVar2.f170699d.get(i28);
                                    if (snsInfo3 != null && snsInfo3.localid == intValue3) {
                                        voVar2.f170699d.remove(i28);
                                        break;
                                    }
                                    i28++;
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        if (list2.size() == 0) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        } else {
                            java.util.LinkedList linkedList2 = new java.util.LinkedList();
                            int i29 = 1;
                            while (i29 < voVar2.f170699d.size()) {
                                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = (com.tencent.mm.plugin.sns.storage.SnsInfo) voVar2.f170699d.get(i29);
                                if (snsInfo4 != null) {
                                    java.util.Iterator it9 = list2.iterator();
                                    while (true) {
                                        if (!it9.hasNext()) {
                                            break;
                                        }
                                        int intValue4 = ((java.lang.Integer) it9.next()).intValue();
                                        if (snsInfo4.localid == intValue4) {
                                            voVar2.f170699d.remove(i29);
                                            linkedList2.add(com.tencent.mm.plugin.sns.model.l4.Fj().i1(intValue4));
                                            i29--;
                                            break;
                                        }
                                    }
                                }
                                i29++;
                            }
                            java.util.Iterator it10 = linkedList2.iterator();
                            while (it10.hasNext()) {
                                voVar2.f170699d.add((com.tencent.mm.plugin.sns.storage.SnsInfo) it10.next());
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        }
                        voVar2.f();
                        voVar2.e();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            }
        }
        if (z17 && com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI) != null) {
            com.tencent.mm.plugin.sns.ui.so T63 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI);
            T63.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            T63.P(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyList", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
    }
}
