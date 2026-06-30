package zn0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f474351a;

    /* renamed from: b, reason: collision with root package name */
    public final zn0.a0 f474352b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f474353c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f474354d;

    public i(int i17, zn0.a0 trtcManager) {
        kotlin.jvm.internal.o.g(trtcManager, "trtcManager");
        this.f474351a = i17;
        this.f474352b = trtcManager;
    }

    public final void a(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zn0.v vVar = (zn0.v) it.next();
            int i17 = vVar.f474413n;
            if (i17 <= 0 || i17 > 5 || i17 == 1 || i17 == 2) {
                arrayList.add(vVar);
            } else if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
                arrayList.add(vVar);
            } else {
                hashMap.put(java.lang.Integer.valueOf(vVar.f474413n), vVar);
            }
        }
        java.util.Iterator it6 = list2.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            if (!hashMap.containsKey(java.lang.Integer.valueOf(intValue))) {
                int i19 = i18 + 1;
                zn0.v vVar2 = (zn0.v) kz5.n0.a0(arrayList, i18);
                if (vVar2 != null) {
                    vVar2.f474413n = intValue;
                }
                i18 = i19;
            }
        }
        if (list.size() > 1) {
            kz5.g0.t(list, new zn0.b());
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "adjustCrossRoomPkUserListPos after: " + list);
    }

    public final void b() {
        zn0.y yVar = zn0.x.f474414a;
        java.util.ArrayList<zn0.v> arrayList = yVar.f474415a;
        if (arrayList == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig remoteUserConfigList = null");
            return;
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new zn0.c());
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "adjustRemoteUserListPosValid before: " + arrayList);
        int i17 = yVar.f474416b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (zn0.v vVar : arrayList) {
            int i18 = vVar.f474413n;
            if (i18 <= 0 || i18 > 9 || i18 == i17) {
                arrayList2.add(vVar);
            } else if (hashMap.containsKey(java.lang.Integer.valueOf(i18))) {
                arrayList2.add(vVar);
            } else {
                hashMap.put(java.lang.Integer.valueOf(vVar.f474413n), vVar);
            }
        }
        int i19 = 0;
        for (int i27 = 1; i27 < 10; i27++) {
            if (!hashMap.containsKey(java.lang.Integer.valueOf(i27)) && i27 != i17) {
                int i28 = i19 + 1;
                zn0.v vVar2 = (zn0.v) kz5.n0.a0(arrayList2, i19);
                if (vVar2 != null) {
                    vVar2.f474413n = i27;
                }
                i19 = i28;
            }
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new zn0.d());
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "adjustRemoteUserListPosValid after: " + arrayList);
    }

    public final org.json.JSONObject c(java.lang.String selfRoomId, int i17, int i18, com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig config, com.tencent.trtc.TRTCCloudDef.TRTCMixUser mixUser) {
        java.lang.String str;
        int i19;
        float f17;
        float f18;
        kotlin.jvm.internal.o.g(selfRoomId, "selfRoomId");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(mixUser, "mixUser");
        java.util.ArrayList arrayList = zn0.x.f474414a.f474415a;
        com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "anchorPkFillConfig remoteUserConfigListSize: " + arrayList.size());
        if (arrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "anchorPkFillConfig: remoteUserConfigList is null or size = 0");
            return null;
        }
        mixUser.roomId = selfRoomId;
        jz5.o h17 = h(arrayList, selfRoomId);
        java.util.List list = (java.util.List) h17.f302841d;
        java.util.List list2 = (java.util.List) h17.f302842e;
        java.util.List list3 = (java.util.List) h17.f302843f;
        int size = list.size();
        int size2 = list2.size();
        int size3 = list3.size();
        zn0.a0 a0Var = this.f474352b;
        a0Var.getClass();
        java.lang.String str2 = "410";
        if (size3 <= 1) {
            if (size == 0) {
                if (size2 != 0) {
                    if (size2 == 1) {
                        str = "409";
                    } else if (size2 == 2) {
                        str2 = "2072";
                        str = str2;
                    }
                }
                str = "408";
            } else if (size != 1) {
                if (size == 2) {
                    if (size2 == 0) {
                        str2 = "2075";
                    } else if (size2 == 1) {
                        str2 = "2076";
                    } else if (size2 == 2) {
                        str2 = "2077";
                    }
                    str = str2;
                }
                str = "408";
            } else {
                if (size2 == 0) {
                    str2 = "2073";
                } else if (size2 != 1) {
                    if (size2 == 2) {
                        str2 = "2074";
                    }
                    str = "408";
                }
                str = str2;
            }
            com.tencent.mars.xlog.Log.i("TRTCRemoteUserManager", "chooseLinkMicBackground: ".concat(str));
        } else {
            str = size3 != 1 ? size3 != 2 ? "410" : "409" : "408";
        }
        config.backgroundImage = str;
        config.videoWidth = i17;
        int size4 = arrayList.size();
        if (size4 != 0) {
            if (size4 != 1) {
                f17 = i17;
                f18 = 1.0843374f;
            } else {
                f17 = i17;
                f18 = 1.2244898f;
            }
            i19 = (int) (f17 / f18);
        } else {
            i19 = i18;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "getMicAnchorPkLayoutHeight  size = " + size4 + " videoWidth = " + i17 + " oriVideoHeight = " + i18 + " newHeight = " + i19);
        int i27 = i19 * 2;
        config.videoHeight = i19;
        com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "anchorPkFillConfig: selfRoomId: " + selfRoomId + " videoWidth: " + i17 + " videoHeight: " + i19 + " otherRoomAnchorSize: " + size3 + " otherRoomVisitorUserList: " + list2 + " otherRoomAnchorUserList: " + list3);
        if (size3 == 0) {
            return a0Var.u(i17, i18, config, mixUser);
        }
        int i28 = 0;
        if (size3 == 1) {
            this.f474352b.e(list, mixUser, config, selfRoomId, new android.graphics.Point(0, 0), i17, i27);
            zn0.v vVar = (zn0.v) list3.get(0);
            java.lang.String str3 = vVar.f474411i;
            kotlin.jvm.internal.o.f(str3, "getRoomId(...)");
            com.tencent.trtc.TRTCCloudDef.TRTCMixUser g17 = g(str3, vVar);
            config.mixUsers.add(g17);
            this.f474352b.e(list2, g17, config, vVar.f474411i, new android.graphics.Point(i17 / 2, 0), i17, i27);
        } else if (size3 == 2) {
            mixUser.f215699x = 0;
            mixUser.f215700y = 0;
            int i29 = (int) (i17 / 2.0f);
            mixUser.width = i29;
            mixUser.height = i19;
            mixUser.zOrder = 0;
            for (java.lang.Object obj : list3) {
                int i37 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                zn0.v vVar2 = (zn0.v) obj;
                java.lang.String str4 = vVar2.f474411i;
                kotlin.jvm.internal.o.f(str4, "getRoomId(...)");
                com.tencent.trtc.TRTCCloudDef.TRTCMixUser g18 = g(str4, vVar2);
                g18.f215699x = i29;
                int i38 = (int) (i19 / 2.0f);
                g18.f215700y = i28 * i38;
                g18.width = i29;
                g18.height = i38;
                config.mixUsers.add(g18);
                i28 = i37;
            }
        } else if (size3 == 3) {
            mixUser.f215699x = 0;
            mixUser.f215700y = 0;
            int i39 = (int) (i17 / 2.0f);
            mixUser.width = i39;
            int i47 = (int) (i19 / 2.0f);
            mixUser.height = i47;
            mixUser.zOrder = 0;
            for (java.lang.Object obj2 : list3) {
                int i48 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                zn0.v vVar3 = (zn0.v) obj2;
                java.lang.String str5 = vVar3.f474411i;
                kotlin.jvm.internal.o.f(str5, "getRoomId(...)");
                com.tencent.trtc.TRTCCloudDef.TRTCMixUser g19 = g(str5, vVar3);
                g19.f215699x = (i48 % 2) * i39;
                g19.f215700y = (i48 / 2) * i47;
                g19.width = i39;
                g19.height = i47;
                config.mixUsers.add(g19);
                i28 = i48;
            }
        }
        java.util.List mixUsers = config.mixUsers;
        kotlin.jvm.internal.o.f(mixUsers, "mixUsers");
        org.json.JSONObject n17 = n(selfRoomId, config, mixUsers);
        e(config, list3);
        f(config, list3);
        return n17;
    }

    public final java.lang.String d(int i17, int i18) {
        return java.lang.String.valueOf(i17 / i18);
    }

    public final void e(com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig config, java.util.List otherRoomAnchorUserList) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(otherRoomAnchorUserList, "otherRoomAnchorUserList");
        java.util.ArrayList<com.tencent.trtc.TRTCCloudDef.TRTCMixUser> mixUsers = config.mixUsers;
        kotlin.jvm.internal.o.f(mixUsers, "mixUsers");
        for (com.tencent.trtc.TRTCCloudDef.TRTCMixUser tRTCMixUser : mixUsers) {
            java.util.Iterator it = otherRoomAnchorUserList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((zn0.v) obj).f474406d, tRTCMixUser.userId)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                fn0.g gVar = fn0.g.f264195a;
                java.lang.String userId = tRTCMixUser.userId;
                kotlin.jvm.internal.o.f(userId, "userId");
                if (gVar.d(userId)) {
                    tRTCMixUser.f215699x = 0;
                    tRTCMixUser.f215700y = 0;
                    tRTCMixUser.width = 0;
                    tRTCMixUser.height = 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r2 != true) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.i.f(com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig, java.util.List):void");
    }

    public final com.tencent.trtc.TRTCCloudDef.TRTCMixUser g(java.lang.String selfRoomId, zn0.v userConfig) {
        kotlin.jvm.internal.o.g(selfRoomId, "selfRoomId");
        kotlin.jvm.internal.o.g(userConfig, "userConfig");
        com.tencent.trtc.TRTCCloudDef.TRTCMixUser tRTCMixUser = new com.tencent.trtc.TRTCCloudDef.TRTCMixUser();
        userConfig.f474411i = selfRoomId;
        tRTCMixUser.roomId = selfRoomId;
        java.lang.String str = userConfig.f474406d;
        tRTCMixUser.userId = str;
        tRTCMixUser.streamType = userConfig.f474407e;
        tRTCMixUser.pureAudio = true;
        zn0.g0 i17 = this.f474352b.i(str, 0);
        if (i17 != null) {
            tRTCMixUser.pureAudio = i17.f474348c;
        }
        return tRTCMixUser;
    }

    public final jz5.o h(java.util.List remoteUserConfigList, java.lang.String selfRoomId) {
        java.util.List list;
        java.lang.Object obj;
        kn0.q qVar;
        java.util.List list2;
        java.lang.Object obj2;
        java.util.List list3;
        java.lang.Object obj3;
        java.util.List list4;
        java.lang.Object obj4;
        kotlin.jvm.internal.o.g(remoteUserConfigList, "remoteUserConfigList");
        kotlin.jvm.internal.o.g(selfRoomId, "selfRoomId");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.Iterator it = remoteUserConfigList.iterator();
        while (it.hasNext()) {
            zn0.v vVar = (zn0.v) it.next();
            fn0.g gVar = fn0.g.f264195a;
            java.lang.String str = vVar.f474406d;
            kn0.q qVar2 = null;
            if (fn0.g.f264196b != null) {
                if (str == null) {
                    str = "";
                }
                mm2.o4 o4Var = (mm2.o4) dk2.ef.f233372a.i(mm2.o4.class);
                if (o4Var != null && (list4 = o4Var.f329324s) != null) {
                    synchronized (list4) {
                        java.util.Iterator it6 = list4.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it6.next();
                            if (kotlin.jvm.internal.o.b(((km2.q) obj4).f309170a, str)) {
                                break;
                            }
                        }
                    }
                    km2.q qVar3 = (km2.q) obj4;
                    if (qVar3 != null) {
                        qVar = new kn0.q(str, java.lang.String.valueOf(qVar3.f309178i), true);
                        qVar2 = qVar;
                    }
                }
                mm2.o4 o4Var2 = (mm2.o4) dk2.ef.f233372a.i(mm2.o4.class);
                if (o4Var2 != null && (list3 = o4Var2.f329325t) != null) {
                    synchronized (list3) {
                        java.util.Iterator it7 = list3.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it7.next();
                            if (kotlin.jvm.internal.o.b(((km2.q) obj3).f309170a, str)) {
                                break;
                            }
                        }
                    }
                    km2.q qVar4 = (km2.q) obj3;
                    if (qVar4 != null) {
                        qVar = new kn0.q(str, java.lang.String.valueOf(qVar4.f309178i), true);
                        qVar2 = qVar;
                    }
                }
                mm2.o4 o4Var3 = (mm2.o4) dk2.ef.f233372a.i(mm2.o4.class);
                if (o4Var3 != null && (list2 = o4Var3.f329327v) != null) {
                    synchronized (list2) {
                        java.util.Iterator it8 = list2.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it8.next();
                            if (kotlin.jvm.internal.o.b(((km2.q) obj2).f309170a, str)) {
                                break;
                            }
                        }
                    }
                    km2.q qVar5 = (km2.q) obj2;
                    if (qVar5 != null) {
                        qVar = new kn0.q(str, java.lang.String.valueOf(qVar5.f309178i), false);
                        qVar2 = qVar;
                    }
                }
                mm2.o4 o4Var4 = (mm2.o4) dk2.ef.f233372a.i(mm2.o4.class);
                if (o4Var4 != null && (list = o4Var4.f329335z) != null) {
                    synchronized (list) {
                        java.util.Iterator it9 = list.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it9.next();
                            if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, str)) {
                                break;
                            }
                        }
                    }
                    km2.q qVar6 = (km2.q) obj;
                    if (qVar6 != null) {
                        qVar = new kn0.q(str, java.lang.String.valueOf(qVar6.f309178i), qVar6.f309177h);
                        qVar2 = qVar;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "updateCloudMixtureParamsForFinder getLiveTRTCRoomInfo = " + qVar2 + ", sdkId: " + vVar.f474406d);
            if (qVar2 != null) {
                java.lang.String str2 = qVar2.f309594b;
                vVar.f474411i = str2;
                vVar.f474412m = qVar2.f309595c;
                if (android.text.TextUtils.equals(str2, selfRoomId)) {
                    linkedList.add(vVar);
                } else if (vVar.f474412m) {
                    linkedList3.add(vVar);
                } else {
                    linkedList2.add(vVar);
                }
            }
        }
        return new jz5.o(linkedList, linkedList2, linkedList3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final int i() {
        int i17 = this.f474352b.f474316t;
        switch (i17) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
            case 10:
                if (i17 != 9 && i17 != 10) {
                    com.tencent.mars.xlog.Log.e("FinderLiveMicCloudMixture", "getDualMicSeiMode,curMicMode: " + i17);
                    return 0;
                }
                java.util.ArrayList arrayList = zn0.x.f474414a.f474415a;
                if (arrayList == null) {
                    return 0;
                }
                if (arrayList.size() <= 0) {
                    return 8;
                }
                if (i17 != 10) {
                    return 0;
                }
                return 1;
            default:
                return 0;
        }
    }

    public final int j(java.lang.String selfRoomId, com.tencent.trtc.TRTCCloudDef.TRTCMixUser mixUser) {
        int i17;
        kotlin.jvm.internal.o.g(selfRoomId, "selfRoomId");
        kotlin.jvm.internal.o.g(mixUser, "mixUser");
        zn0.v d17 = zn0.x.f474414a.d(mixUser.userId);
        int i18 = 0;
        if (d17 != null) {
            if (d17.f474410h <= this.f474351a) {
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                i18 = 1;
            } else {
                java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            }
            i18 = d17.f474412m ? i18 | 4 : i18 & (-5);
        }
        int a17 = this.f474352b.a(d17.f474412m, mixUser, i18);
        java.lang.String str = mixUser.roomId;
        if (str == null || kotlin.jvm.internal.o.b(str, selfRoomId)) {
            java.util.regex.Pattern pattern3 = pm0.v.f356802a;
            i17 = a17 & (-9);
        } else {
            java.util.regex.Pattern pattern4 = pm0.v.f356802a;
            i17 = a17 | 8;
        }
        fn0.g gVar = fn0.g.f264195a;
        java.lang.String userId = mixUser.userId;
        kotlin.jvm.internal.o.f(userId, "userId");
        return gVar.o(userId) ? i17 | 16 : i17 & (-17);
    }

    public final org.json.JSONObject k(java.lang.String selfRoomId, int i17, int i18, com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig config, com.tencent.trtc.TRTCCloudDef.TRTCMixUser mixUser, boolean z17) {
        kotlin.jvm.internal.o.g(selfRoomId, "selfRoomId");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(mixUser, "mixUser");
        zn0.y yVar = zn0.x.f474414a;
        java.util.ArrayList arrayList = yVar.f474415a;
        if (arrayList == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "micDualModeFillConfig remoteUserConfigList is null");
            return null;
        }
        int size = arrayList.size();
        com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "micDualModeFillConfig remoteUserConfigListSize: " + size + ",isFocus: " + z17);
        zn0.a0 a0Var = this.f474352b;
        if (size > 0) {
            return z17 ? m(selfRoomId, i17, i18, config, mixUser) : a0Var.l(i17, i18, config, mixUser);
        }
        int h17 = a0Var.h(i17, i18, 1);
        config.videoWidth = i17;
        int i19 = h17 / 2;
        config.videoHeight = i19;
        config.backgroundImage = "320994";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        mixUser.f215699x = 0;
        mixUser.f215700y = 0;
        int i27 = i17 / 2;
        mixUser.width = i27;
        mixUser.height = i19;
        com.tencent.trtc.TRTCCloudDef.TRTCMixUser tRTCMixUser = new com.tencent.trtc.TRTCCloudDef.TRTCMixUser();
        tRTCMixUser.zOrder = 1;
        tRTCMixUser.f215699x = mixUser.f215699x;
        tRTCMixUser.f215700y = mixUser.f215700y;
        tRTCMixUser.width = mixUser.width;
        tRTCMixUser.height = mixUser.height;
        tRTCMixUser.userId = this.f474354d;
        linkedList.add(tRTCMixUser);
        com.tencent.trtc.TRTCCloudDef.TRTCMixUser tRTCMixUser2 = new com.tencent.trtc.TRTCCloudDef.TRTCMixUser();
        tRTCMixUser2.zOrder = 2;
        tRTCMixUser2.f215699x = i27;
        tRTCMixUser2.f215700y = 0;
        tRTCMixUser2.width = i27;
        tRTCMixUser2.height = i19;
        linkedList.add(tRTCMixUser2);
        yVar.f474416b = 1;
        yVar.f474417c = size;
        return n(selfRoomId, config, linkedList);
    }

    public final org.json.JSONObject l(java.lang.String selfRoomId, int i17, int i18, com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig config, com.tencent.trtc.TRTCCloudDef.TRTCMixUser mixUser) {
        kotlin.jvm.internal.o.g(selfRoomId, "selfRoomId");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(mixUser, "mixUser");
        java.util.ArrayList arrayList = zn0.x.f474414a.f474415a;
        if (arrayList == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig remoteUserConfigList = null");
            return null;
        }
        int size = arrayList.size();
        b();
        com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "micGrabModeFillConfig videoHeight: " + i18 + " videoWidth: " + i17 + " size: " + size + " remoteUserConfigList: " + arrayList);
        config.videoWidth = i17;
        float f17 = (float) i17;
        int b17 = a06.d.b(f17 / 1.0866141f);
        config.videoHeight = b17;
        config.backgroundImage = "111318";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i19 = 0;
        while (i19 < 9) {
            com.tencent.trtc.TRTCCloudDef.TRTCMixUser tRTCMixUser = new com.tencent.trtc.TRTCCloudDef.TRTCMixUser();
            int i27 = i19 + 1;
            tRTCMixUser.zOrder = i27;
            tRTCMixUser.f215699x = a06.d.b((i19 % 3) * 0.33333334f * f17);
            float f18 = b17;
            tRTCMixUser.f215700y = a06.d.b((i19 / 3) * 0.33333334f * f18);
            tRTCMixUser.width = a06.d.b(f17 * 0.33333334f);
            tRTCMixUser.height = a06.d.b(f18 * 0.33333334f);
            linkedList.add(tRTCMixUser);
            i19 = i27;
        }
        mixUser.f215699x = ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(0)).f215699x;
        mixUser.f215700y = ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(0)).f215700y;
        mixUser.width = ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(0)).width;
        mixUser.height = ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(0)).height;
        ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(0)).userId = this.f474354d;
        ((com.tencent.trtc.TRTCCloudDef.TRTCMixUser) linkedList.get(0)).zOrder = 1;
        int i28 = 0;
        for (java.lang.Object obj : arrayList) {
            int i29 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            zn0.v vVar = (zn0.v) obj;
            vVar.f474411i = selfRoomId;
            com.tencent.trtc.TRTCCloudDef.TRTCMixUser tRTCMixUser2 = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) kz5.n0.a0(linkedList, vVar.f474413n - 1);
            if (tRTCMixUser2 != null) {
                java.lang.String str = vVar.f474406d;
                tRTCMixUser2.userId = str;
                tRTCMixUser2.streamType = vVar.f474407e;
                tRTCMixUser2.pureAudio = true;
                zn0.g0 i37 = this.f474352b.i(str, 0);
                if (i37 != null) {
                    tRTCMixUser2.pureAudio = i37.f474348c;
                }
                config.mixUsers.add(tRTCMixUser2);
            }
            i28 = i29;
        }
        zn0.y yVar = zn0.x.f474414a;
        yVar.f474416b = 1;
        yVar.f474417c = size;
        return n(selfRoomId, config, linkedList);
    }

    public final org.json.JSONObject m(java.lang.String selfRoomId, int i17, int i18, com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig config, com.tencent.trtc.TRTCCloudDef.TRTCMixUser mixUser) {
        zn0.a aVar;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(selfRoomId, "selfRoomId");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(mixUser, "mixUser");
        java.util.ArrayList arrayList = zn0.x.f474414a.f474415a;
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig remoteUserConfigList = null or size = 0");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("micFocusGrabModeFillConfig videostreams: ");
        zn0.a0 a0Var = this.f474352b;
        sb6.append(a0Var.f474300d.size());
        sb6.append(" videoHeight: ");
        sb6.append(i18);
        sb6.append(" videoWidth: ");
        sb6.append(i17);
        sb6.append(" curForceUserId: ");
        sb6.append(this.f474353c);
        com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", sb6.toString());
        config.videoWidth = i17;
        config.videoHeight = i18;
        config.backgroundImage = "37286";
        kn0.p pVar = a0Var.f474313q;
        if (pVar != null && pVar.f309589i) {
            float f17 = i17;
            int b17 = (int) ((i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 72) / com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x) * f17);
            aVar = new zn0.a(b17, (int) (b17 / 0.7346939f), 0, (int) (0.038647342f * f17), (int) (0.39130434f * f17), (int) (f17 * 0.019323671f));
        } else {
            float f18 = i18;
            int b18 = (int) ((i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 98) / com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y) * f18);
            aVar = new zn0.a((int) (b18 * 0.7346939f), b18, (i17 - ((int) (0.46153846f * f18))) / 2, (int) (i17 * 0.038647342f), (int) (0.20982143f * f18), (int) (f18 * 0.008928572f));
        }
        zn0.a aVar2 = aVar;
        int i19 = aVar2.f474292b;
        int i27 = aVar2.f474291a;
        int i28 = aVar2.f474293c;
        int i29 = aVar2.f474294d;
        int i37 = aVar2.f474295e;
        int i38 = aVar2.f474296f;
        com.tencent.mars.xlog.Log.i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig offestMargin: " + i28 + " micHeight: " + i19 + " micWidth: " + i27 + " micRightMargin: " + i29 + " micTopMargin: " + i37 + " micMargin: " + i38 + " oriTop: 0.20982143");
        zn0.h hVar = new zn0.h(i17, i18);
        zn0.g gVar = new zn0.g(i17, i27, i29, i28, i37, i38, i19);
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((zn0.v) obj).f474413n == 1) {
                break;
            }
        }
        zn0.v vVar = (zn0.v) obj;
        zn0.y yVar = zn0.x.f474414a;
        int i39 = yVar.f474416b;
        int i47 = yVar.f474417c;
        int i48 = (i47 <= arrayList.size() || (i39 = i39 - (i47 - arrayList.size())) > 2) ? i39 : 2;
        if (vVar == null) {
            hVar.invoke(mixUser);
            i48 = 1;
        } else {
            com.tencent.trtc.TRTCCloudDef.TRTCMixUser g17 = g(selfRoomId, vVar);
            hVar.invoke(g17);
            config.mixUsers.add(g17);
            gVar.invoke(mixUser, java.lang.Integer.valueOf(i48 - 2));
        }
        java.util.Iterator it6 = arrayList.iterator();
        int i49 = 0;
        while (it6.hasNext()) {
            zn0.v vVar2 = (zn0.v) it6.next();
            if (!kotlin.jvm.internal.o.b(vVar != null ? vVar.f474406d : null, vVar2.f474406d)) {
                com.tencent.trtc.TRTCCloudDef.TRTCMixUser g18 = g(selfRoomId, vVar2);
                if (i49 == i48 - 2) {
                    i49++;
                }
                gVar.invoke(g18, java.lang.Integer.valueOf(i49));
                i49++;
                config.mixUsers.add(g18);
            }
        }
        zn0.y yVar2 = zn0.x.f474414a;
        int size = arrayList.size();
        yVar2.f474416b = i48;
        yVar2.f474417c = size;
        java.util.ArrayList<com.tencent.trtc.TRTCCloudDef.TRTCMixUser> arrayList2 = config.mixUsers;
        if (arrayList2 != null) {
            java.util.Iterator<com.tencent.trtc.TRTCCloudDef.TRTCMixUser> it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                it7.next().roomId = null;
            }
        }
        return a0Var.m(config, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0188 A[Catch: JSONException -> 0x01f3, TryCatch #0 {JSONException -> 0x01f3, blocks: (B:32:0x0128, B:34:0x0163, B:35:0x0178, B:37:0x017c, B:42:0x0188, B:43:0x01bf, B:45:0x01a2, B:47:0x01a8, B:49:0x01ae, B:50:0x01b5, B:51:0x01b2), top: B:31:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a2 A[Catch: JSONException -> 0x01f3, TryCatch #0 {JSONException -> 0x01f3, blocks: (B:32:0x0128, B:34:0x0163, B:35:0x0178, B:37:0x017c, B:42:0x0188, B:43:0x01bf, B:45:0x01a2, B:47:0x01a8, B:49:0x01ae, B:50:0x01b5, B:51:0x01b2), top: B:31:0x0128 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject n(java.lang.String r19, com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.i.n(java.lang.String, com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig, java.util.List):org.json.JSONObject");
    }
}
