package so2;

/* loaded from: classes2.dex */
public final class g3 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.g3 f410361d = new so2.g3();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        int i17;
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        so2.x5 x5Var;
        kotlin.jvm.internal.o.g(it, "it");
        int i18 = it.what;
        int i19 = 3;
        int i27 = 1;
        if (i18 == 0) {
            java.lang.Object obj = it.obj;
            if (obj instanceof java.util.LinkedList) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.MarkReadStat>");
                int i28 = 0;
                for (r45.ni4 ni4Var : (java.util.LinkedList) obj) {
                    so2.h3 h3Var = so2.h3.f410392d;
                    int integer = ni4Var.getInteger(i27);
                    long j17 = ni4Var.getLong(0);
                    int integer2 = ni4Var.getInteger(11);
                    long j18 = ni4Var.getLong(14);
                    java.util.Iterator it6 = so2.h3.f410395g.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            i17 = 0;
                            break;
                        }
                        r45.ni4 ni4Var2 = (r45.ni4) it6.next();
                        if (ni4Var2.getInteger(i27) == integer && ni4Var2.getLong(0) == j17 && ni4Var2.getInteger(11) == integer2 && ni4Var2.getLong(14) == j18) {
                            i17 = i27;
                            break;
                        }
                    }
                    jz5.f0 f0Var3 = jz5.f0.f302826a;
                    if (i17 == 0) {
                        i28++;
                        so2.h3.f410395g.add(ni4Var);
                        java.util.HashMap hashMap = (java.util.HashMap) so2.h3.f410399n.get(java.lang.Integer.valueOf((ni4Var.getInteger(i19) == 156 || ni4Var.getInteger(i19) == 155 || ni4Var.getInteger(i19) == 171) ? 17 : ni4Var.getInteger(i19)));
                        if (hashMap != null && (x5Var = (so2.x5) hashMap.get(java.lang.Long.valueOf(ni4Var.getLong(0)))) != null) {
                            x5Var.f410700e = true;
                            x5Var.f410702g = ni4Var;
                        }
                        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(ni4Var.getLong(0));
                        if (h17 != null) {
                            com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "mark read scene:" + ni4Var.getInteger(1) + ", subScene:" + ni4Var.getInteger(2) + ", commScene:" + ni4Var.getInteger(3) + ", " + pm0.v.u(ni4Var.getLong(0)) + ", nickname:" + h17.getNickName() + ", desc:" + hc2.o0.l(h17.getFeedObject()) + ", expose:" + ni4Var.getInteger(5) + ", actionType=" + ni4Var.getInteger(11) + ", area_id=" + ni4Var.getLong(14));
                            f0Var2 = f0Var3;
                        } else {
                            f0Var2 = null;
                        }
                        if (f0Var2 == null) {
                            com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "mark read ".concat(pm0.v.u(ni4Var.getLong(0))));
                        }
                    } else {
                        com.tencent.mm.plugin.finder.storage.FinderItem h18 = bu2.j.f24534a.h(ni4Var.getLong(0));
                        if (h18 != null) {
                            com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "contains read scene:" + ni4Var.getInteger(1) + ", subScene:" + ni4Var.getInteger(2) + ", commScene:" + ni4Var.getInteger(3) + ", " + pm0.v.u(ni4Var.getLong(0)) + ", nickname:" + h18.getNickName() + ", desc:" + hc2.o0.l(h18.getFeedObject()) + "}, expose:" + ni4Var.getInteger(5) + ", actionType=" + ni4Var.getInteger(11) + ", area_id=" + ni4Var.getLong(14));
                            f0Var = f0Var3;
                        } else {
                            f0Var = null;
                        }
                        if (f0Var == null) {
                            so2.h3 h3Var2 = so2.h3.f410392d;
                            com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "contains read ".concat(pm0.v.u(ni4Var.getLong(0))));
                        }
                    }
                    i19 = 3;
                    i27 = 1;
                }
                int size = so2.h3.f410395g.size();
                int i29 = 1000;
                if (size > 1000 && 1000 <= size) {
                    while (true) {
                        so2.h3.f410395g.removeFirst();
                        if (i29 == size) {
                            break;
                        }
                        i29++;
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("final add ");
                sb6.append(i28);
                sb6.append(' ');
                sb6.append(size);
                sb6.append(' ');
                so2.h3 h3Var3 = so2.h3.f410392d;
                sb6.append(so2.h3.f410395g.size());
                com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", sb6.toString());
                so2.h3.a(h3Var3);
                if (i28 > 0) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkSend: size = ");
                    sb7.append(so2.h3.f410395g.size());
                    sb7.append(" feedCountThreshold：");
                    jz5.g gVar = so2.h3.f410396h;
                    sb7.append(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
                    com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", sb7.toString());
                    if (so2.h3.f410395g.size() >= ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue()) {
                        com.tencent.mm.sdk.platformtools.n3 n3Var = so2.h3.f410397i;
                        n3Var.removeMessages(1);
                        n3Var.sendEmptyMessage(1);
                    }
                }
            }
        } else if (i18 == 1) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("SEND markReadItemList size: ");
            so2.h3 h3Var4 = so2.h3.f410392d;
            sb8.append(so2.h3.f410395g.size());
            com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", sb8.toString());
            if (so2.h3.f410395g.size() > 0) {
                so2.h3.b(h3Var4);
                h3Var4.i();
            }
        } else if (i18 == 2) {
            java.lang.Object obj2 = it.obj;
            if (obj2 instanceof java.util.LinkedList) {
                so2.h3 h3Var5 = so2.h3.f410392d;
                java.util.LinkedList linkedList = so2.h3.f410395g;
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.MarkReadStat>");
                linkedList.removeAll((java.util.LinkedList) obj2);
                so2.h3.a(h3Var5);
            }
        } else if (i18 == 3) {
            so2.h3 h3Var6 = so2.h3.f410392d;
            java.lang.String str = com.tencent.mm.plugin.finder.assist.e9.f102145n + "markread.info";
            if (com.tencent.mm.vfs.w6.j(str)) {
                byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
                r45.qf2 qf2Var = new r45.qf2();
                try {
                    qf2Var.parseFrom(N);
                    java.util.LinkedList list = qf2Var.getList(2);
                    kotlin.jvm.internal.o.f(list, "getReadStats(...)");
                    so2.h3.f410395g = list;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderMarkReadLogic", e17, "read", new java.lang.Object[0]);
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "readFromFile " + str);
            }
        } else if (i18 == 4) {
            so2.h3.a(so2.h3.f410392d);
        } else if (i18 == 5) {
            so2.h3.b(so2.h3.f410392d);
            so2.h3.f410399n = new java.util.HashMap();
        }
        return false;
    }
}
