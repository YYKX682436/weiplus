package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f164745a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f164746b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.LinkedHashMap f164747c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Comparator f164748d;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("sns_recvd_ad");
        f164746b = sb6.toString();
        f164748d = new com.tencent.mm.plugin.sns.model.v();
    }

    public static void A(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateStatExtInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = adSnsInfo.getTimeLine();
        r45.td6 td6Var = new r45.td6();
        r45.ud6 ud6Var = new r45.ud6();
        td6Var.f386329d = ud6Var;
        ud6Var.f387269f = aDInfo.uxInfo;
        ud6Var.f387268e = timeLine.Id;
        ud6Var.f387270g = adSnsInfo.getSource();
        r45.ud6 ud6Var2 = td6Var.f386329d;
        ud6Var2.f387271h = com.tencent.mm.modelstat.k0.g(ud6Var2);
        int i17 = timeLine.ContentObj.f369837e;
        if (i17 == 1) {
            td6Var.f386329d.f387267d = 1;
        } else if (i17 == 15) {
            td6Var.f386329d.f387267d = 2;
        } else {
            td6Var.f386329d.f387267d = 0;
        }
        td6Var.f386329d.f387272i = adSnsInfo.getExpId();
        try {
            java.lang.String replace = android.util.Base64.encodeToString(td6Var.toByteArray(), 0).replace("\n", "");
            r45.ud6 ud6Var3 = td6Var.f386329d;
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "replace newly add snsId:%s, statExtStr:%s(id=%s,uxInfo=%s)", timeLine.Id, replace, ud6Var3.f387268e, ud6Var3.f387269f);
            timeLine.statExtStr = replace;
            adSnsInfo.setTimeLine(timeLine);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateStatExtInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (j17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        if (f164747c == null) {
            l();
        }
        f164747c.put(java.lang.Long.valueOf(j17), 0);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            try {
                java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(f164747c);
                objectOutputStream.flush();
                o35.a.k(f164746b, byteArrayOutputStream.toByteArray());
            } catch (java.io.IOException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.AdSnsInfoStorageLogic", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException unused) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            }
        } catch (java.lang.Throwable th6) {
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException unused2) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            throw th6;
        }
    }

    public static boolean b(long j17, r45.l76 l76Var, int i17, int i18, int i19, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        int i27;
        java.lang.String str3;
        int i28;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        int size;
        r45.k76 k76Var;
        java.lang.String str11;
        int i29;
        java.lang.String str12 = "checkComment";
        java.lang.String str13 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (l76Var != null && (i29 = l76Var.f379205f.f378462h) != 7 && i29 != 8 && i29 != 16) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        if (l76Var != null && (k76Var = l76Var.f379206g) != null && (str11 = k76Var.f378458d) != null && str11.equals(r17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return true;
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(j17);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "AdSnsInfo of %s is not exist!", java.lang.Long.valueOf(j17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        try {
            snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(y07.field_attrBuf);
            snsObject.Id = j17;
            i27 = y07.field_firstControlTime;
            r45.k76 k76Var2 = l76Var.f379205f;
            int i37 = k76Var2.f378462h;
            str3 = r17;
            java.lang.String str14 = "checkComment";
            try {
                if (i37 == 7) {
                    if (i18 > 0) {
                        try {
                            if (i27 + i18 < k76Var2.f378464m) {
                                if (z17) {
                                    try {
                                        if (com.tencent.mm.plugin.sns.model.l4.Fj().b1(y07.getSnsId()) != null) {
                                            com.tencent.mm.plugin.sns.storage.ADInfo adInfo = y07.getAdInfo();
                                            if (adInfo != null) {
                                                p94.f0 f0Var = (p94.f0) i95.n0.c(p94.f0.class);
                                                int source = y07.getSource();
                                                java.lang.Object[] objArr = new java.lang.Object[7];
                                                objArr[0] = java.lang.Long.valueOf(com.tencent.mm.plugin.sns.storage.w2.n(y07.getSnsId()));
                                                objArr[1] = adInfo.viewId;
                                                objArr[2] = 2;
                                                objArr[3] = 1;
                                                java.util.LinkedList<r45.e86> linkedList = snsObject.LikeUserList;
                                                if (linkedList != null) {
                                                    try {
                                                        size = linkedList.size();
                                                    } catch (java.lang.Exception e17) {
                                                        e = e17;
                                                        str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                                        str2 = str14;
                                                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e, "", new java.lang.Object[0]);
                                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
                                                        return true;
                                                    }
                                                } else {
                                                    size = 0;
                                                }
                                                objArr[4] = java.lang.Integer.valueOf(size);
                                                java.util.LinkedList<r45.e86> linkedList2 = snsObject.CommentUserList;
                                                objArr[5] = java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : 0);
                                                str10 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                                objArr[6] = java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000));
                                                ((p34.p) f0Var).Bi(13182, source, objArr);
                                            } else {
                                                str10 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                                com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
                                            }
                                        } else {
                                            str10 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
                                        }
                                    } catch (java.lang.Exception e18) {
                                        e = e18;
                                        str2 = str14;
                                        str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e, "", new java.lang.Object[0]);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
                                        return true;
                                    }
                                } else {
                                    str10 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                }
                                try {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + j17 + " firstCreateTime " + i27 + " actionLikeTimeLimit: " + i18 + " curAction.createTime: " + k76Var2.f378464m + "is over the time limit!");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str14, str10);
                                    return false;
                                } catch (java.lang.Exception e19) {
                                    e = e19;
                                    str12 = str14;
                                    str13 = str10;
                                    str2 = str12;
                                    str = str13;
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e, "", new java.lang.Object[0]);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
                                    return true;
                                }
                            }
                        } catch (java.lang.Exception e27) {
                            e = e27;
                            str12 = str14;
                        }
                    }
                    i28 = i19;
                    str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                    str4 = " actionLikeTimeLimit: ";
                    str7 = " actionCommentTimeLimit: ";
                    str2 = str14;
                } else {
                    str12 = str14;
                    if (i37 == 8 || i37 == 16) {
                        i28 = i19;
                        if (i28 > 0) {
                            str4 = " actionLikeTimeLimit: ";
                            if (i27 + i28 < k76Var2.f378464m) {
                                if (z17) {
                                    try {
                                        if (com.tencent.mm.plugin.sns.model.l4.Fj().b1(y07.getSnsId()) != null) {
                                            com.tencent.mm.plugin.sns.storage.ADInfo adInfo2 = y07.getAdInfo();
                                            if (adInfo2 != null) {
                                                p94.f0 f0Var2 = (p94.f0) i95.n0.c(p94.f0.class);
                                                int source2 = y07.getSource();
                                                java.lang.Object[] objArr2 = new java.lang.Object[7];
                                                objArr2[0] = java.lang.Long.valueOf(com.tencent.mm.plugin.sns.storage.w2.n(y07.getSnsId()));
                                                objArr2[1] = adInfo2.viewId;
                                                objArr2[2] = 2;
                                                objArr2[3] = 2;
                                                java.util.LinkedList<r45.e86> linkedList3 = snsObject.LikeUserList;
                                                objArr2[4] = java.lang.Integer.valueOf(linkedList3 != null ? linkedList3.size() : 0);
                                                java.util.LinkedList<r45.e86> linkedList4 = snsObject.CommentUserList;
                                                objArr2[5] = java.lang.Integer.valueOf(linkedList4 != null ? linkedList4.size() : 0);
                                                str5 = str12;
                                                str6 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                                objArr2[6] = java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000));
                                                ((p34.p) f0Var2).Bi(13182, source2, objArr2);
                                            } else {
                                                str5 = str12;
                                                str6 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                                com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
                                            }
                                        } else {
                                            str5 = str12;
                                            str6 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
                                        }
                                    } catch (java.lang.Exception e28) {
                                        e = e28;
                                        str14 = str12;
                                        str2 = str14;
                                        str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e, "", new java.lang.Object[0]);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
                                        return true;
                                    }
                                } else {
                                    str5 = str12;
                                    str6 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + j17 + " firstCreateTime " + i27 + " actionCommentTimeLimit: " + i28 + " curAction.createTime: " + k76Var2.f378464m + "is over the time limit!");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str6);
                                return false;
                            }
                            str2 = str12;
                            str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                            str7 = " actionCommentTimeLimit: ";
                        }
                    } else {
                        i28 = i19;
                    }
                    str2 = str12;
                    str = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic";
                    str4 = " actionLikeTimeLimit: ";
                    str7 = " actionCommentTimeLimit: ";
                }
            } catch (java.lang.Exception e29) {
                e = e29;
            }
        } catch (java.lang.Exception e37) {
            e = e37;
        }
        try {
            java.util.Iterator<r45.e86> it = snsObject.LikeUserList.iterator();
            int i38 = 0;
            while (it.hasNext()) {
                r45.e86 next = it.next();
                if (next.f373131i > i27) {
                    java.lang.String str15 = next.f373126d;
                    str9 = str3;
                    if (str15 == null || !str15.equals(str9)) {
                        i38++;
                    }
                } else {
                    str9 = str3;
                }
                str3 = str9;
            }
            java.lang.String str16 = str3;
            int i39 = i38 + 0;
            java.util.Iterator<r45.e86> it6 = snsObject.CommentUserList.iterator();
            int i47 = 0;
            while (it6.hasNext()) {
                r45.e86 next2 = it6.next();
                java.util.Iterator<r45.e86> it7 = it6;
                if (next2.f373131i > i27 && ((str8 = next2.f373126d) == null || !str8.equals(str16))) {
                    i47++;
                }
                it6 = it7;
            }
            int i48 = i39 + i47;
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "totalsize " + i48 + " firstCreateTime " + i27 + " actionLimit: " + i17 + str4 + i18 + str7 + i28);
            if (i48 >= i17) {
                if (z17) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(y07.getSnsId());
                    if (b17 != null) {
                        com.tencent.mm.plugin.sns.storage.ADInfo adInfo3 = b17.getAdInfo();
                        if (adInfo3 != null) {
                            p94.f0 f0Var3 = (p94.f0) i95.n0.c(p94.f0.class);
                            int source3 = y07.getSource();
                            java.lang.Object[] objArr3 = new java.lang.Object[7];
                            objArr3[0] = java.lang.Long.valueOf(com.tencent.mm.plugin.sns.storage.w2.n(y07.getSnsId()));
                            objArr3[1] = adInfo3.viewId;
                            objArr3[2] = 1;
                            objArr3[3] = 2;
                            java.util.LinkedList<r45.e86> linkedList5 = snsObject.LikeUserList;
                            objArr3[4] = java.lang.Integer.valueOf(linkedList5 != null ? linkedList5.size() : 0);
                            java.util.LinkedList<r45.e86> linkedList6 = snsObject.CommentUserList;
                            objArr3[5] = java.lang.Integer.valueOf(linkedList6 != null ? linkedList6.size() : 0);
                            objArr3[6] = java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000));
                            ((p34.p) f0Var3).Bi(13182, source3, objArr3);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
                return false;
            }
        } catch (java.lang.Exception e38) {
            e = e38;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
        return true;
    }

    public static r45.g5 c(r45.ck5 ck5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (ck5Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return null;
        }
        r45.g5 g5Var = new r45.g5();
        r45.du5 du5Var = ck5Var.f371621e;
        g5Var.f374886e = du5Var;
        if (du5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "recObject.RecommendInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return null;
        }
        g5Var.f374885d = d(ck5Var.f371620d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return g5Var;
    }

    public static r45.f76 d(r45.ca6 ca6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (ca6Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return null;
        }
        r45.f76 f76Var = new r45.f76();
        r45.du5 du5Var = ca6Var.f371403e;
        f76Var.f374077e = du5Var;
        if (du5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "recommendObj.RecommendXml is null");
        }
        f76Var.f374076d = ca6Var.f371402d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return f76Var;
    }

    public static java.util.LinkedList e(java.util.LinkedList linkedList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertRecObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.g5 c17 = c((r45.ck5) it.next());
            if (c17 != null) {
                linkedList2.add(c17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertRecObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return linkedList2;
    }

    public static void f(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        try {
            java.lang.String t07 = ca4.z0.t0(j17);
            com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(j17);
            if (y07 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "deleteAdWithNoCheck, adSnsInfo is null, snsId=" + t07);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "deleteAdWithNoCheck, snsId=" + t07);
            try {
                ca4.c0.b(i17, j17, y07.getAdInfo(), y07.getAdXml());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdSnsInfoStorageLogic", "reportAdDelException: " + th6.toString());
            }
            a84.n.e(y07);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdSnsInfoStorageLogic", "deleteAdWithNoCheck, snsId=" + ca4.z0.t0(j17) + ", exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAdWithNoCheck", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        }
    }

    public static int g(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCreateTime", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(snsObject.Id);
        int i17 = W0 == null ? snsObject.CreateTime : W0.field_createTime;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCreateTime", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return i17;
    }

    public static int h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicGraySwitch", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        int i17 = 1;
        try {
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_timeline_dynamic_snsobject_enable_android, 1);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdSnsInfoStorageLogic", "getDynamicGraySwitch, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicGraySwitch", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x039a A[Catch: all -> 0x03a3, TRY_LEAVE, TryCatch #1 {all -> 0x03a3, blocks: (B:59:0x038a, B:61:0x039a), top: B:58:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(java.util.List r42, java.util.List r43, boolean r44, int r45) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.x.i(java.util.List, java.util.List, boolean, int):void");
    }

    public static void j(java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (linkedList != null) {
            java.util.LinkedList e17 = e(linkedList);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + e17.size() + " recObj to AdvertiseObj");
            java.util.Iterator it = e17.iterator();
            while (it.hasNext()) {
                r45.g5 g5Var = (r45.g5) it.next();
                if (k(g5Var.f374885d.f374076d.Id)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by snsId " + g5Var.f374885d.f374076d.Id);
                    it.remove();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertTestAD", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            if (linkedList2 == null || linkedList2.size() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertTestAD", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            } else {
                int g17 = g((com.tencent.mm.protocal.protobuf.SnsObject) linkedList2.get(linkedList2.size() - 1));
                for (int i18 = 0; i18 < e17.size(); i18++) {
                    r45.g5 g5Var2 = (r45.g5) e17.get(i18);
                    if (g5Var2 == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "ad is null");
                    } else {
                        r45.f76 f76Var = g5Var2.f374885d;
                        if (f76Var == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject is null");
                        } else if (f76Var.f374076d == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject.SnsObject is null");
                        } else {
                            java.lang.String g18 = x51.j1.g(g5Var2.f374886e);
                            java.lang.String g19 = x51.j1.g(g5Var2.f374885d.f374077e);
                            java.lang.String f17 = x51.j1.f(g5Var2.f374885d.f374076d.ObjectDesc);
                            com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = new com.tencent.mm.plugin.sns.storage.ADInfo(g18);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "skXml " + g18);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "adXml " + g19);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "snsXml " + f17 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
                            com.tencent.mm.plugin.sns.storage.ADXml aDXml = new com.tencent.mm.plugin.sns.storage.ADXml(g19);
                            long j17 = aDXml.originSnsId;
                            if (j17 == 0 || !k(j17)) {
                                int i19 = g17 + 1;
                                if (aDInfo.ad_sns_pos >= linkedList2.size() || (i17 = aDInfo.ad_sns_pos) < 0) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.AdSnsInfoStorageLogic", "invalid ad.pos " + aDInfo.ad_sns_pos);
                                } else {
                                    i19 = g((com.tencent.mm.protocal.protobuf.SnsObject) linkedList2.get(i17)) + 1;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "create adinfo time  " + i19 + " pos " + aDInfo.ad_sns_pos);
                                }
                                int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
                                com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "gettime " + currentTimeMillis);
                                o(g5Var2, i19, currentTimeMillis);
                                a(g5Var2.f374885d.f374076d.Id);
                                a(aDXml.originSnsId);
                                u(g5Var2.f374885d.f374076d.Id, aDInfo);
                            } else {
                                com.tencent.mars.xlog.Log.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by originSnsId " + aDXml.originSnsId);
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertTestAD", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1697L, 76L, linkedList.size());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static boolean k(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        l();
        boolean z17 = f164747c.get(java.lang.Long.valueOf(j17)) != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRecvdAd", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l() {
        /*
            java.lang.String r0 = "MicroMsg.AdSnsInfoStorageLogic"
            java.lang.String r1 = "loadRecvdAd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.util.LinkedHashMap r3 = com.tencent.mm.plugin.sns.model.x.f164747c
            if (r3 != 0) goto L93
            java.lang.String r3 = com.tencent.mm.plugin.sns.model.x.f164746b
            byte[] r3 = o35.a.i(r3)
            if (r3 == 0) goto L71
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r3)
            r3 = 0
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L4a java.io.StreamCorruptedException -> L59
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L4a java.io.StreamCorruptedException -> L59
            java.lang.Object r3 = r5.readObject()     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L30 java.io.IOException -> L32 java.io.StreamCorruptedException -> L34
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L30 java.io.IOException -> L32 java.io.StreamCorruptedException -> L34
            com.tencent.mm.plugin.sns.model.x.f164747c = r3     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L30 java.io.IOException -> L32 java.io.StreamCorruptedException -> L34
            r5.close()     // Catch: java.io.IOException -> L71
            goto L71
        L2d:
            r0 = move-exception
            r3 = r5
            goto L68
        L30:
            r3 = move-exception
            goto L3b
        L32:
            r3 = move-exception
            goto L4d
        L34:
            r3 = move-exception
            goto L5c
        L36:
            r0 = move-exception
            goto L68
        L38:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L3b:
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.z3.c(r3)     // Catch: java.lang.Throwable -> L2d
            com.tencent.mars.xlog.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L71
        L46:
            r5.close()     // Catch: java.io.IOException -> L71
            goto L71
        L4a:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L4d:
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.z3.c(r3)     // Catch: java.lang.Throwable -> L2d
            com.tencent.mars.xlog.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L71
            goto L46
        L59:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L5c:
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.z3.c(r3)     // Catch: java.lang.Throwable -> L2d
            com.tencent.mars.xlog.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L71
            goto L46
        L68:
            if (r3 == 0) goto L6d
            r3.close()     // Catch: java.io.IOException -> L6d
        L6d:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r0
        L71:
            java.util.LinkedHashMap r0 = com.tencent.mm.plugin.sns.model.x.f164747c
            if (r0 != 0) goto L93
            java.lang.String r0 = "instanceRecvdAd"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            com.tencent.mm.plugin.sns.model.w r3 = new com.tencent.mm.plugin.sns.model.w
            r4 = 4649075278012743680(0x4084d55560000000, double:666.6666870117188)
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r4 = r4 + 1
            r5 = 1061158912(0x3f400000, float:0.75)
            r3.<init>(r4, r5)
            com.tencent.mm.plugin.sns.model.x.f164747c = r3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
        L93:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.x.l():void");
    }

    public static void m(java.util.LinkedList linkedList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPagesRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.LinkedList e17 = e(linkedList);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + e17.size() + " recObj to AdvertiseObj");
            za4.f1.a(e17, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x044f A[Catch: all -> 0x0471, TryCatch #0 {all -> 0x0471, blocks: (B:61:0x0449, B:63:0x044f, B:64:0x0453, B:66:0x0459, B:68:0x0463), top: B:60:0x0449 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.sns.storage.AdSnsInfo n(r45.f76 r19, int r20) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.x.n(r45.f76, int):com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public static void o(r45.g5 g5Var, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        p(g5Var, i17, i18, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static void p(r45.g5 g5Var, int i17, int i18, int i19) {
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (g5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        r45.f76 f76Var = g5Var.f374885d;
        if (f76Var == null || (snsObject = f76Var.f374076d) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo n17 = n(f76Var, i19);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdSnsInfoStorageLogic", "adSnsInfo is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        java.lang.String g17 = x51.j1.g(g5Var.f374886e);
        if (i19 == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(n17.field_adinfo)) {
            g17 = n17.field_adinfo;
        }
        A(n17, new com.tencent.mm.plugin.sns.storage.ADInfo(g17));
        n17.field_createTime = i17;
        n17.field_createAdTime = i18;
        java.lang.String g18 = x51.j1.g(g5Var.f374885d.f374077e);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(g18)) {
            n17.field_recxml = g18;
        }
        java.lang.String str = n17.field_recxml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        n17.field_adxml = str;
        if (i19 == 0) {
            n17.field_adinfo = x51.j1.g(g5Var.f374886e);
        } else if (i19 == 1) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(n17.field_adinfo)) {
                n17.field_adinfo = x51.j1.g(g5Var.f374886e);
            }
        } else if (i19 == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(x51.j1.g(g5Var.f374886e))) {
            n17.field_adinfo = x51.j1.g(g5Var.f374886e);
        }
        m44.a.e(n17, "replace");
        com.tencent.mm.plugin.sns.model.l4.Vi().W0(snsObject.Id, n17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static void q(r45.g5 g5Var, int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (g5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        r45.f76 f76Var = g5Var.f374885d;
        if (f76Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject.SnsADObject is null ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = f76Var.f374076d;
        if (snsObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject.SnsADObject.SnsObject is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(snsObject.Id);
        if (com.tencent.mm.plugin.sns.model.l4.Vi().P0(g5Var.f374885d.f374076d.Id)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "replaceAtObj, update, snsId=" + t07);
            r(g5Var.f374885d, "", i17, true);
        } else {
            com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = g5Var.f374885d.f374076d;
            int i19 = snsObject2.CommentUserListCount;
            java.util.LinkedList<r45.e86> linkedList = snsObject2.CommentUserList;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdCreateTimeByComments", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            if (i19 > 0 && linkedList != null) {
                java.util.Iterator<r45.e86> it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.e86 next = it.next();
                    if (!com.tencent.mm.plugin.sns.ui.widget.t2.i(next.f373139t, 32) && currentTimeMillis > (i18 = next.f373131i)) {
                        currentTimeMillis = i18;
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCreateTimeByComments", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "replaceAtObj, insert at adObject, snsId=" + t07 + ", createTime=" + currentTimeMillis);
            p(g5Var, currentTimeMillis, currentTimeMillis, i17);
            com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(g5Var.f374885d.f374076d.Id);
            if (y07 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "set at ad invisible");
                y07.setLocalInvisible();
                com.tencent.mm.plugin.sns.model.l4.Vi().W0(y07.field_snsId, y07);
            }
        }
        y(g5Var.f374885d);
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y08 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(g5Var.f374885d.f374076d.Id);
        if (y08 != null) {
            java.lang.String str = y08.field_atAdinfo;
            y08.field_atAdinfo = x51.j1.g(g5Var.f374886e);
            if (i17 == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                y08.field_atAdinfo = str;
            }
            r45.o3 remindInfoGroup = y08.getRemindInfoGroup();
            if (remindInfoGroup == null) {
                remindInfoGroup = new r45.o3();
            }
            r45.mo5 mo5Var = g5Var.f374888g;
            remindInfoGroup.f381862e = mo5Var;
            if (mo5Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "update atFriend remindInfo, aid64 %d, aid %d", java.lang.Long.valueOf(mo5Var.f380718i), java.lang.Integer.valueOf(remindInfoGroup.f381862e.f380713d));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdSnsInfoStorageLogic", "atFriendRemindInfo == null");
            }
            y08.setRemindInfoGroup(remindInfoGroup);
            m44.a.e(y08, "replaceAtObj");
            com.tencent.mm.plugin.sns.model.l4.Vi().W0(y08.field_snsId, y08);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceAtObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static void r(r45.f76 f76Var, java.lang.String str, int i17, boolean z17) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (f76Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "replaceObj, error adobj");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = f76Var.f374076d;
        if (snsObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "replaceObj, error adobj");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(snsObject.Id);
        com.tencent.mm.plugin.sns.storage.AdSnsInfo n17 = n(f76Var, i17);
        if (!z17 && i17 == 2 && n17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            n17.field_adinfo = str;
        }
        if (!z17 && i17 == 2 && n17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n17.field_adinfo)) {
            A(n17, new com.tencent.mm.plugin.sns.storage.ADInfo(n17.field_adinfo));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "adDynamic replaceObj, snsId=" + t07 + "isAt=" + z17 + ", replaceDynamicMode=" + i17 + ", dynamicAdinfoStr=" + str);
        com.tencent.mm.plugin.sns.model.l4.Vi().W0(f76Var.f374076d.Id, n17);
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).d7(com.tencent.mm.plugin.sns.storage.w2.m(n17.getLocalid()), o75.b.f343583d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static boolean s(long j17, r45.l76 l76Var) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        r45.k76 k76Var = l76Var.f379205f;
        int i17 = k76Var.f378462h;
        if (i17 != 7 && i17 != 8 && i17 != 16) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(j17);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "pass the action because the snsinfo is null " + j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        try {
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(y07.field_attrBuf);
            snsObject.Id = j17;
            int i18 = k76Var.f378462h;
            if (i18 == 7) {
                java.util.Iterator<r45.e86> it = snsObject.LikeUserList.iterator();
                while (it.hasNext()) {
                    r45.e86 next = it.next();
                    if (next.f373131i == k76Var.f378464m && next.f373126d.equals(k76Var.f378458d)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + next.f373131i + " ");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                        return false;
                    }
                }
                snsObject.LikeUserList.add(com.tencent.mm.plugin.sns.model.i4.l(l76Var));
            } else if (i18 == 8 || i18 == 16) {
                java.util.Iterator<r45.e86> it6 = snsObject.CommentUserList.iterator();
                while (it6.hasNext()) {
                    r45.e86 next2 = it6.next();
                    if (next2.f373131i == k76Var.f378464m && next2.f373126d.equals(k76Var.f378458d)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + next2.f373131i + " ");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                        return false;
                    }
                }
                snsObject.CommentUserList.add(com.tencent.mm.plugin.sns.model.i4.l(l76Var));
                com.tencent.mm.plugin.sns.ui.widget.t2.n(y07, snsObject.CommentUserList);
            }
            y07.setAttrBuf(snsObject.toByteArray());
            com.tencent.mm.plugin.sns.model.l4.Vi().W0(snsObject.Id, y07);
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).d7(com.tencent.mm.plugin.sns.storage.w2.m(y07.getLocalid()), o75.b.f343583d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdSnsInfoStorageLogic", "e " + e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(r45.f76 r18, r45.cu5 r19, java.lang.String r20, int r21) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.x.t(r45.f76, r45.cu5, java.lang.String, int):void");
    }

    public static void u(long j17, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateADInfoImm", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (aDInfo == null || !aDInfo.adInfoSyncBufferImm || com.tencent.mm.sdk.platformtools.t8.K0(aDInfo.adInfoSyncBuffer)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateADInfoImm", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        com.tencent.mm.plugin.sns.model.k2 k2Var = new com.tencent.mm.plugin.sns.model.k2(j17, 1, aDInfo.adInfoSyncBuffer);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(k2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateADInfoImm", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static boolean v(r45.g5 g5Var) {
        r45.f76 f76Var;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAdvertiseObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (g5Var == null || (f76Var = g5Var.f374885d) == null || (snsObject = f76Var.f374076d) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "updateAdvertiseObjDynamicField, params err");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdvertiseObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        java.lang.String t07 = ca4.z0.t0(snsObject.Id);
        r45.f76 f76Var2 = g5Var.f374885d;
        if (f76Var2.f374077e == null) {
            f76Var2.f374077e = x51.j1.i("");
        }
        if (g5Var.f374886e == null) {
            g5Var.f374886e = x51.j1.i("");
        }
        com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = g5Var.f374885d.f374076d;
        if (snsObject2.ObjectDesc == null) {
            snsObject2.ObjectDesc = x51.j1.h("", false);
        }
        r45.f76 f76Var3 = g5Var.f374885d;
        boolean c17 = x51.j1.c(f76Var3.f374079g, f76Var3.f374080h, f76Var3.f374078f);
        if (c17) {
            g5Var.f374886e.c(x51.j1.g(g5Var.f374885d.f374079g));
            r45.f76 f76Var4 = g5Var.f374885d;
            f76Var4.f374077e.c(x51.j1.g(f76Var4.f374080h));
            r45.f76 f76Var5 = g5Var.f374885d;
            f76Var5.f374076d.ObjectDesc.d(x51.j1.g(f76Var5.f374078f).getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "adDynamic, updateAdvertiseObjDynamicField called with: advertiseObject = [" + g5Var + "] isValid = " + c17 + ", snsId=" + t07);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdvertiseObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return c17;
    }

    public static void w(r45.f76 f76Var, com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAdxmlForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        r45.du5 du5Var = f76Var.f374077e;
        if (du5Var != null) {
            java.lang.String g17 = x51.j1.g(du5Var);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                adSnsInfo.field_recxml = g17;
            }
            java.lang.String str = adSnsInfo.field_recxml;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterAdxml", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !str.equals(adSnsInfo.field_adxml)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "update field adxml ".concat(str));
                adSnsInfo.field_adxml = str;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdxmlForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static boolean x(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo, r45.cu5 cu5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        java.lang.String f17 = x51.j1.f(cu5Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return true;
        }
        if (adSnsInfo.setContent(f17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateContentForAdSnsInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return true;
    }

    public static void y(r45.f76 f76Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateEmojiInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (f76Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "updateEmojiInfo >> ad is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateEmojiInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = f76Var.f374076d;
        if (snsObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "updateEmojiInfo .SnsObject is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateEmojiInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return;
        }
        java.util.LinkedList<r45.e86> linkedList = snsObject.CommentUserList;
        if (linkedList != null) {
            java.util.Iterator<r45.e86> it = linkedList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.j(snsObject.Id, it.next());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateEmojiInfo", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
    }

    public static boolean z(r45.f76 f76Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsADObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        if (f76Var == null || f76Var.f374076d == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsADObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            return false;
        }
        if (f76Var.f374077e == null) {
            f76Var.f374077e = x51.j1.i("");
        }
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = f76Var.f374076d;
        if (snsObject.ObjectDesc == null) {
            snsObject.ObjectDesc = x51.j1.h("", false);
        }
        boolean c17 = x51.j1.c(f76Var.f374079g, f76Var.f374080h, f76Var.f374078f);
        if (c17) {
            f76Var.f374077e.c(x51.j1.g(f76Var.f374080h));
            f76Var.f374076d.ObjectDesc.d(x51.j1.g(f76Var.f374078f).getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsADObjDynamicField", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        return c17;
    }
}
