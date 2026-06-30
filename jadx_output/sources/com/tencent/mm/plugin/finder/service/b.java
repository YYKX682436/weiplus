package com.tencent.mm.plugin.finder.service;

/* loaded from: classes8.dex */
public final class b implements com.tencent.wechat.aff.finder.AffFinderProviderBase {

    /* renamed from: a, reason: collision with root package name */
    public float f126003a;

    /* renamed from: b, reason: collision with root package name */
    public float f126004b;

    /* renamed from: c, reason: collision with root package name */
    public final i11.c f126005c = new com.tencent.mm.plugin.finder.service.a(this);

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public java.lang.String curContextID() {
        return "";
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public java.lang.String curTabSessionID() {
        return "";
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public bw5.sc finderGetCGIBaseRequest(int i17, int i18) {
        r45.kv0 a17 = db2.t4.f228171a.a(i17);
        a17.set(1, java.lang.Integer.valueOf(i18));
        bw5.sc scVar = new bw5.sc();
        scVar.parseFrom(a17.toByteArray());
        return scVar;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public java.lang.String finderGetCurrentUsername() {
        return g92.b.f269769e.T0();
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public void finderRedDotDataChangedActionAsync(long j17, int i17, int i18, bw5.e0 e0Var, bw5.e0 e0Var2, java.lang.String str) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotDataChangedActionAsync--- taskId:" + j17 + ",actionType:" + i17 + ",subReasonType:" + i18 + ",fromCtrlInfoData:" + hc2.a.a(e0Var) + ",toCtrlInfoData:" + hc2.a.a(e0Var2) + ",disposePath:" + str);
        }
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public void finderRedDotDataChangedWithPathKey(java.lang.String path) {
        zy2.ga e07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().e0();
        if (e07 != null) {
            com.tencent.mm.plugin.finder.extension.reddot.k8 k8Var = (com.tencent.mm.plugin.finder.extension.reddot.k8) e07;
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotDataChangedWithPathKey--- " + path);
            if (path == null || path.length() == 0) {
                return;
            }
            com.tencent.mm.plugin.finder.extension.reddot.x9 x9Var = k8Var.f105630a;
            x9Var.getClass();
            kotlin.jvm.internal.o.g(path, "path");
            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(x9Var, path, g92.b.f269769e.T0(), false, false, 12, null);
            jz5.f0 f0Var = null;
            r45.f03 I0 = S0 != null ? S0.I0(path) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notifyRedDotChange] ");
            sb6.append(S0 != null ? S0.field_tipsId : null);
            sb6.append(" ,path:");
            sb6.append(I0 != null ? I0.f373892i : null);
            sb6.append('(');
            sb6.append(path);
            sb6.append(") businessType=");
            sb6.append(S0 != null ? java.lang.Integer.valueOf(S0.field_businessType) : null);
            sb6.append(" count:");
            sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f373888e) : null);
            sb6.append(" clearType:");
            sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f373891h) : null);
            sb6.append(" parent:");
            sb6.append(I0 != null ? I0.f373893m : null);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", sb6.toString());
            if (S0 != null && I0 != null) {
                com.tencent.mm.plugin.finder.extension.reddot.aa.b(com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a, "notifyRedDotChange", true, path, I0, S0, null, x9Var.p(path, S0), 32, null);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mm.plugin.finder.extension.reddot.aa.b(com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a, "notifyRedDotChange", false, path, I0, S0, null, x9Var.p(path, S0), 32, null);
            }
        }
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public void finderRedDotDataReceiveRedDotBindObjectPathKey(java.lang.String str) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotDataReceiveRedDotBindObjectPathKey--- " + str);
        }
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public void finderRedDotDataReceiveWithPathKey(java.lang.String str, boolean z17) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotDataReceiveWithPathKey--- path=" + str + " isAlreadExistRedDot=" + z17 + '!');
        }
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public void finderRedDotDataRevokedWithPathKey(java.lang.String str) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotDataRevokedWithPathKey--- " + str);
        }
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public boolean finderRedDotEnableUseCtrlInfoInNMStrategy(java.lang.String str, boolean z17, bw5.e0 e0Var) {
        zy2.ga e07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().e0();
        if (e07 == null) {
            return true;
        }
        com.tencent.mm.plugin.finder.extension.reddot.k8 k8Var = (com.tencent.mm.plugin.finder.extension.reddot.k8) e07;
        if (!z17) {
            if (!(str == null || str.length() == 0) && e0Var != null) {
                com.tencent.mm.plugin.finder.extension.reddot.jb b17 = hc2.a.b(e0Var);
                if (b17 == null) {
                    return true;
                }
                com.tencent.mm.plugin.finder.extension.reddot.l5 l5Var = (com.tencent.mm.plugin.finder.extension.reddot.l5) k8Var.f105631b;
                boolean z18 = !l5Var.C(str, b17);
                if (z18) {
                    z18 = !l5Var.E("finderRedDotEnableUseCtrlInfoInNMStrategy", str, b17, k8Var.y(kz5.b0.c(str)));
                }
                if (z18) {
                    com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotEnableUseCtrlInfoInNMStrategy--- redDotPath=" + str + " enableUse=" + z18 + '!');
                } else {
                    com.tencent.mars.xlog.Log.w("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotEnableUseCtrlInfoInNMStrategy--- redDotPath=" + str + " enableUse=" + z18 + '!');
                }
                return z18;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("---finderRedDotEnableUseCtrlInfoInNMStrategy--- redDotPath=");
        sb6.append(str);
        sb6.append(" ignoreNMFrequency=");
        sb6.append(z17);
        sb6.append(",maxPriorityCtrlInfoData=");
        sb6.append(e0Var != null ? hc2.a.a(e0Var) : null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
        return true;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public void finderRedDotHasAddActionAsync(long j17, bw5.e0 e0Var) {
        bw5.ev b17;
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("---finderRedDotHasAddActionAsync--- ");
            sb6.append((e0Var == null || (b17 = e0Var.b()) == null) ? null : b17.getTipsUuid());
            sb6.append(",taskId=");
            sb6.append(j17);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
        }
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public void finderRedDotHasDisposeActionAsync(long j17, java.lang.String str, bw5.e0 e0Var) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("---finderRedDotHasDisposeActionAsync--- taskId=");
            sb6.append(j17);
            sb6.append(",path=");
            sb6.append(str);
            sb6.append(",ctrlInfoData=");
            sb6.append(e0Var != null ? hc2.a.a(e0Var) : null);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
        }
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public boolean finderRedDotWillAddAction(bw5.e0 e0Var) {
        bw5.ev b17;
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() == null) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("---finderRedDotWillAddAction--- ");
        sb6.append((e0Var == null || (b17 = e0Var.b()) == null) ? null : b17.getTipsUuid());
        sb6.append(",forbidAction=false");
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
        return false;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public boolean finderRedDotWillDisposeAction(java.lang.String str) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---finderRedDotWillDisposeAction--- " + str + ", forbidAction=false");
        return false;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public bw5.tj getCacheLocation() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().f(this.f126005c);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        long j17 = i11.h.e().f287099h;
        bw5.tj tjVar = new bw5.tj();
        tjVar.f33467d = this.f126003a;
        boolean[] zArr = tjVar.f33470g;
        zArr[1] = true;
        tjVar.f33468e = this.f126004b;
        zArr[2] = true;
        tjVar.f33469f = (int) (j17 / 1000);
        zArr[3] = true;
        return tjVar;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public java.util.ArrayList getContact(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        ya2.b2 Ui = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ui(username);
        com.tencent.mm.protocal.protobuf.FinderContact i17 = Ui != null ? ya2.d.i(Ui) : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i17 != null) {
            bw5.ae aeVar = new bw5.ae();
            aeVar.parseFrom(i17.initialProtobufBytes());
            arrayList.add(aeVar);
        }
        return arrayList;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public int getCurFinderUnreadCountByUsername(java.lang.String str, boolean z17, int i17, int i18) {
        java.lang.String str2;
        zy2.ga e07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().e0();
        if (e07 == null) {
            return 0;
        }
        com.tencent.mm.plugin.finder.extension.reddot.k8 k8Var = (com.tencent.mm.plugin.finder.extension.reddot.k8) e07;
        if (str == null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---getCurFinderUnreadCountByUsername--- finderUsername:" + str);
            str2 = g92.b.f269769e.T0();
        } else {
            str2 = str;
        }
        int A = k8Var.A("---getCurFinderUnreadCountByUsername---", str2);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---getCurFinderUnreadCountByUsername--- finderUsername:" + str + " fromRedDotPath:" + z17 + ",finderMsgCount=" + i17 + ",finderMembershipCount=" + i18 + ",privateMsgUnreadCount=" + A);
        return A + i17 + i18;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public java.lang.String getFeedSessionBuffer(java.lang.String str, bw5.os0 os0Var, java.lang.String str2) {
        java.lang.String str3;
        r45.fl2 fl2Var;
        java.lang.String string;
        if (str == null) {
            return "";
        }
        if (str2 == null || (str3 = "_".concat(str2)) == null) {
            str3 = "";
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        long Z = pm0.v.Z(str);
        int i17 = os0Var != null ? os0Var.f31385d : 0;
        o3Var.getClass();
        com.tencent.mm.plugin.finder.report.e6 e6Var = (com.tencent.mm.plugin.finder.report.e6) o3Var.f125211g.get(Z + "__" + i17 + str3);
        return (e6Var == null || (fl2Var = e6Var.f125012a) == null || (string = fl2Var.getString(1)) == null) ? "" : string;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public java.util.ArrayList getLocalFinderObject(java.util.ArrayList arrayList) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        if (arrayList == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(pm0.v.Z((java.lang.String) it.next()));
            byte[] initialProtobufBytes = (h17 == null || (feedObject = h17.getFeedObject()) == null) ? null : feedObject.initialProtobufBytes();
            if (initialProtobufBytes != null) {
                arrayList2.add(new bw5.yr().parseFrom(initialProtobufBytes));
            }
        }
        return arrayList2;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public int getPrivateMsgTotalUnreadCountByUsername(java.lang.String str) {
        zy2.ga e07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().e0();
        if (e07 == null) {
            return 0;
        }
        com.tencent.mm.plugin.finder.extension.reddot.k8 k8Var = (com.tencent.mm.plugin.finder.extension.reddot.k8) e07;
        if (str == null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---getPrivateMsgTotalUnreadCountByUsername--- finderUsername:" + str);
            str = g92.b.f269769e.T0();
        }
        return k8Var.A("---getPrivateMsgTotalUnreadCountByUsername---", str);
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public boolean isRedDotMeetWithCondition(java.lang.String str, bw5.e0 e0Var) {
        com.tencent.mm.plugin.finder.extension.reddot.jb b17;
        java.lang.ref.WeakReference weakReference;
        yz5.l lVar;
        zy2.ga e07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().e0();
        if (e07 == null) {
            return true;
        }
        com.tencent.mm.plugin.finder.extension.reddot.k8 k8Var = (com.tencent.mm.plugin.finder.extension.reddot.k8) e07;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("---isRedDotMeetWithCondition--- conditionUniqueId:" + str + ",ctrlInfo:" + hc2.a.a(e0Var) + ",contain uniqueId:" + k8Var.C().containsKey(str));
        if (e0Var == null || (b17 = hc2.a.b(e0Var)) == null || (weakReference = (java.lang.ref.WeakReference) k8Var.C().get(str)) == null || (lVar = (yz5.l) weakReference.get()) == null) {
            sb6.append(" checkResult fail!");
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            return false;
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.invoke(b17)).booleanValue();
        sb6.append(" checkResult=" + booleanValue);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
        return booleanValue;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public boolean reddotPersonalExposeClearSwitch() {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            r1 = com.tencent.mm.plugin.finder.storage.aj0.f126440a.r() == 1;
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---reddotPersonalExposeClearSwitch--- switchOn:" + r1);
        }
        return r1;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public void reddotWillRevokeTipsUuidArray(java.util.ArrayList arrayList) {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().e0() != null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "---reddotWillRevokeTipsUuidArray--- willRevokeTipsUuid:" + arrayList);
        }
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public void saveFinderObject(java.util.ArrayList arrayList, bw5.os0 os0Var, java.lang.String str) {
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] initialProtobufBytes = ((bw5.yr) it.next()).initialProtobufBytes();
                if (initialProtobufBytes != null) {
                    com.tencent.mm.protobuf.f parseFrom = com.tencent.mm.protocal.protobuf.FinderObject.create().parseFrom(initialProtobufBytes);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = parseFrom instanceof com.tencent.mm.protocal.protobuf.FinderObject ? (com.tencent.mm.protocal.protobuf.FinderObject) parseFrom : null;
                    if (finderObject != null) {
                        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).rk(finderObject, os0Var != null ? os0Var.f31385d : 0, str);
                    }
                }
            }
        }
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase
    public void setCallback(com.tencent.wechat.aff.finder.AffFinderProviderBase.Callback callback) {
    }
}
