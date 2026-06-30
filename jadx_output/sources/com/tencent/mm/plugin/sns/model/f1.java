package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public abstract class f1 {
    public static long a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("UnsignedLongMinuOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
        if (j17 == Long.MIN_VALUE) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("UnsignedLongMinuOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        long j18 = j17 - 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("UnsignedLongMinuOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
        return j18;
    }

    public static long b(long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compareUnsignedLong", "com.tencent.mm.plugin.sns.model.FaultLogic");
        if ((j17 <= 0 || j18 <= 0) && (j17 >= 0 || j18 >= 0)) {
            long j19 = j17 < 0 ? 1L : -1L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareUnsignedLong", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return j19;
        }
        long j27 = j17 - j18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareUnsignedLong", "com.tencent.mm.plugin.sns.model.FaultLogic");
        return j27;
    }

    public static int c(long j17, long j18, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
        java.lang.String str2 = "MicroMsg.FaultLogic";
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaultLogic", "minId == 0.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        java.util.LinkedList linkedList = com.tencent.mm.plugin.sns.model.l4.Ej().L0(str).f378381d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaultLogic", "getLastReqTimeByMinId fault.count %s", java.lang.Integer.valueOf(linkedList.size()));
        if (linkedList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        r45.cp0 cp0Var = (r45.cp0) linkedList.getFirst();
        if (b(cp0Var.f371760e, j17) > 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaultLogic", "has a fault，minId:" + j18 + " fault.min:" + cp0Var.f371760e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        if (j18 != 0 && b(cp0Var.f371759d, j18) < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaultLogic", "has part of a fault, maxId:" + j18 + " fault.max:" + cp0Var.f371759d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        java.util.LinkedList linkedList2 = cp0Var.f371761f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaultLogic", "getLastReqTimeByMinId segmentList %s", java.lang.Integer.valueOf(linkedList2.size()));
        if (linkedList2.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        java.util.Iterator it = linkedList2.iterator();
        int i17 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            r45.cm6 cm6Var = (r45.cm6) it.next();
            java.lang.String str3 = str2;
            if (j18 == 0 || b(j18, cm6Var.f371671e) >= 0) {
                int i18 = cm6Var.f371672f;
                if (i18 < i17) {
                    i17 = i18;
                }
                if (b(j17, cm6Var.f371671e) >= 0) {
                    com.tencent.mars.xlog.Log.i(str3, "getLastReqTimeByMinId result %s", java.lang.Integer.valueOf(i17));
                    int i19 = i17 == Integer.MAX_VALUE ? 0 : i17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    return i19;
                }
            }
            str2 = str3;
        }
        com.tencent.mars.xlog.Log.i(str2, "should not to hear minId:" + j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
        return 0;
    }

    public static void d(java.lang.String str, long j17, long j18, int i17) {
        long j19;
        java.util.LinkedList linkedList;
        java.lang.String str2;
        java.util.Iterator it;
        java.util.LinkedList linkedList2;
        long j27;
        java.lang.String str3 = "updateFault";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
        com.tencent.mars.xlog.Log.i("MicroMsg.FaultLogic", "updateFault userName:%s ", str);
        long j28 = 0;
        if (j18 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return;
        }
        r45.k53 L0 = com.tencent.mm.plugin.sns.model.l4.Ej().L0(str);
        java.util.LinkedList linkedList3 = L0.f378381d;
        if (j17 != 0) {
            j19 = j17;
        } else {
            if (linkedList3.isEmpty()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
                return;
            }
            j19 = ((r45.cp0) L0.f378381d.getFirst()).f371759d;
        }
        r45.cp0 cp0Var = new r45.cp0();
        cp0Var.f371759d = j19;
        cp0Var.f371760e = j18;
        r45.cm6 cm6Var = new r45.cm6();
        cm6Var.f371670d = j19;
        cm6Var.f371671e = j18;
        cm6Var.f371672f = i17;
        cp0Var.f371761f.add(cm6Var);
        while (true) {
            boolean isEmpty = linkedList3.isEmpty();
            linkedList = L0.f378381d;
            if (isEmpty) {
                str2 = str3;
                break;
            }
            r45.cp0 cp0Var2 = (r45.cp0) linkedList.getFirst();
            java.lang.String str4 = str3;
            if (b(cp0Var.f371760e, cp0Var2.f371759d) > j28) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FaultLogic", "has a fault: newerMin:" + cp0Var.f371760e + " fault.Max" + cp0Var2.f371759d);
                str2 = str4;
                break;
            }
            linkedList.removeFirst();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unionFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
            r45.cp0 cp0Var3 = new r45.cp0();
            if (b(cp0Var2.f371759d, cp0Var.f371759d) > j28) {
                cp0Var3.f371759d = cp0Var2.f371759d;
            } else {
                cp0Var3.f371759d = cp0Var.f371759d;
            }
            if (b(cp0Var2.f371760e, cp0Var.f371760e) < j28) {
                cp0Var3.f371760e = cp0Var2.f371760e;
            } else {
                cp0Var3.f371760e = cp0Var.f371760e;
            }
            java.util.LinkedList linkedList4 = cp0Var2.f371761f;
            java.util.Iterator it6 = cp0Var.f371761f.iterator();
            while (it6.hasNext()) {
                r45.cm6 cm6Var2 = (r45.cm6) it6.next();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                if (linkedList4.isEmpty()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FaultLogic", "fault's segments should not empty!!");
                    linkedList4.addFirst(cm6Var2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    it = it6;
                    linkedList2 = linkedList3;
                } else {
                    long j29 = cm6Var2.f371671e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSmallerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    int size = linkedList4.size() - 1;
                    while (true) {
                        if (size < 0) {
                            it = it6;
                            linkedList2 = linkedList3;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSmallerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            size = -1;
                            break;
                        }
                        it = it6;
                        linkedList2 = linkedList3;
                        if (b(j29, ((r45.cm6) linkedList4.get(size)).f371670d) <= 0) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSmallerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            break;
                        } else {
                            size--;
                            it6 = it;
                            linkedList3 = linkedList2;
                        }
                    }
                    long j37 = cm6Var2.f371670d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBiggerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    int i18 = 0;
                    while (true) {
                        if (i18 >= linkedList4.size()) {
                            i18 = linkedList4.size();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBiggerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            break;
                        } else {
                            if (b(j37, ((r45.cm6) linkedList4.get(i18)).f371671e) >= 0) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBiggerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                                break;
                            }
                            i18++;
                        }
                    }
                    if (size == -1) {
                        linkedList4.addFirst(cm6Var2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    } else if (i18 == linkedList4.size()) {
                        linkedList4.addLast(cm6Var2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    } else {
                        r45.cm6 cm6Var3 = (r45.cm6) linkedList4.get(i18);
                        if (b(cm6Var2.f371670d, cm6Var3.f371670d) < 0) {
                            r45.cm6 cm6Var4 = new r45.cm6();
                            cm6Var4.f371670d = cm6Var3.f371670d;
                            long j38 = cm6Var2.f371670d;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("UnsingedLongAddOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            if (j38 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("UnsingedLongAddOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
                                j27 = Long.MIN_VALUE;
                            } else {
                                j27 = j38 + 1;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("UnsingedLongAddOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            }
                            cm6Var4.f371671e = j27;
                            cm6Var4.f371672f = cm6Var3.f371672f;
                            linkedList4.add(i18, cm6Var4);
                            size++;
                            i18++;
                        }
                        r45.cm6 cm6Var5 = (r45.cm6) linkedList4.get(size);
                        if (b(cm6Var2.f371671e, cm6Var5.f371671e) > 0) {
                            r45.cm6 cm6Var6 = new r45.cm6();
                            cm6Var6.f371671e = cm6Var5.f371671e;
                            cm6Var6.f371670d = a(cm6Var2.f371671e);
                            cm6Var6.f371672f = cm6Var5.f371672f;
                            linkedList4.add(size + 1, cm6Var6);
                        }
                        while (size >= i18) {
                            linkedList4.remove(size);
                            size--;
                        }
                        linkedList4.add(i18, cm6Var2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLimitCount", "com.tencent.mm.plugin.sns.model.FaultLogic");
                        if (linkedList4.size() <= 100) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLimitCount", "com.tencent.mm.plugin.sns.model.FaultLogic");
                        } else {
                            long j39 = ((r45.cm6) linkedList4.getLast()).f371671e;
                            long j47 = ((r45.cm6) linkedList4.getLast()).f371670d;
                            int i19 = ((r45.cm6) linkedList4.getLast()).f371672f;
                            while (linkedList4.size() >= 100) {
                                r45.cm6 cm6Var7 = (r45.cm6) linkedList4.removeLast();
                                long j48 = cm6Var7.f371670d;
                                int i27 = cm6Var7.f371672f;
                                if (i27 < i19) {
                                    i19 = i27;
                                }
                                j47 = j48;
                            }
                            r45.cm6 cm6Var8 = new r45.cm6();
                            cm6Var8.f371670d = j47;
                            cm6Var8.f371671e = j39;
                            cm6Var8.f371672f = i19;
                            linkedList4.addLast(cm6Var8);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLimitCount", "com.tencent.mm.plugin.sns.model.FaultLogic");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    }
                }
                it6 = it;
                linkedList3 = linkedList2;
            }
            cp0Var3.f371761f = linkedList4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unionFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
            cp0Var = cp0Var3;
            linkedList3 = linkedList3;
            j28 = 0;
            str3 = str4;
        }
        linkedList.addFirst(cp0Var);
        while (linkedList.size() > 100) {
            linkedList.removeLast();
        }
        if (linkedList.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaultLogic", "min " + ca4.z0.t0(((r45.cp0) linkedList.get(0)).f371760e) + " max " + ca4.z0.t0(((r45.cp0) linkedList.get(0)).f371759d));
        }
        com.tencent.mm.plugin.sns.storage.d2 J0 = com.tencent.mm.plugin.sns.model.l4.Ej().J0(str);
        try {
            J0.field_userName = str;
            J0.field_faultS = L0.toByteArray();
            com.tencent.mm.plugin.sns.model.l4.Ej().u1(J0);
        } catch (java.lang.Exception unused) {
        }
        if (linkedList.size() > 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaultLogic", "fault size : " + linkedList.size());
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                r45.cp0 cp0Var4 = (r45.cp0) it7.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.FaultLogic", "min - max " + ca4.z0.t0(cp0Var4.f371760e) + " " + ca4.z0.t0(cp0Var4.f371759d));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.model.FaultLogic");
    }
}
