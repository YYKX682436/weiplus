package db2;

/* loaded from: classes8.dex */
public final class d6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f227944g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f227945h;

    /* renamed from: i, reason: collision with root package name */
    public final int f227946i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f227947m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f227948n;

    /* renamed from: o, reason: collision with root package name */
    public cz2.f f227949o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't wrap try/catch for region: R(81:1|(2:2|3)|4|(1:6)|7|(1:9)(1:262)|10|(1:12)|13|(1:261)(1:17)|(1:260)(1:21)|(7:23|(1:25)(1:37)|(1:29)|30|(1:32)(1:36)|(1:34)|35)|38|(1:40)(1:259)|41|(1:43)(1:258)|44|(4:(1:47)(1:53)|48|(1:50)(1:52)|51)|(1:55)(1:257)|56|(1:58)(1:256)|59|(1:61)(1:255)|(1:63)|64|(7:66|67|68|69|70|71|(49:73|74|(1:76)(1:246)|(1:245)(1:79)|80|(1:244)(1:84)|(2:239|240)|86|(7:88|(4:91|(3:(1:94)|95|96)(2:98|99)|97|89)|100|(1:102)|103|(3:105|(2:108|106)|109)(1:111)|110)|112|(1:120)|121|(5:124|(1:126)(1:133)|(3:128|129|130)(1:132)|131|122)|134|135|(2:138|136)|139|140|(1:142)|143|(1:145)(1:238)|146|(1:148)(1:237)|149|(1:236)(1:153)|154|(1:235)(1:158)|159|160|161|(3:163|(4:166|(3:168|(8:171|(1:173)(1:185)|174|(1:176)(1:184)|177|(2:179|180)(2:182|183)|181|169)|186)(1:188)|187|164)|189)|190|191|(1:193)(1:229)|194|(1:196)|197|(1:199)(1:228)|200|(1:202)(1:227)|203|(1:205)(1:226)|206|(1:225)(3:212|(2:215|213)|216)|217|(2:220|218)|221|222|223))(1:254)|247|74|(0)(0)|(0)|245|80|(1:82)|244|(0)|86|(0)|112|(4:114|116|118|120)|121|(1:122)|134|135|(1:136)|139|140|(0)|143|(0)(0)|146|(0)(0)|149|(1:151)|236|154|(1:156)|235|159|160|161|(0)|190|191|(0)(0)|194|(0)|197|(0)(0)|200|(0)(0)|203|(0)(0)|206|(1:208)|225|217|(1:218)|221|222|223|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x073e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x073f, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("Finder.NetSceneFinderSync", r0, "[safeCtrlInfo] failed!", new java.lang.Object[0]);
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x074b, code lost:
    
        if (r0 == null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x074d, code lost:
    
        r0 = "exception";
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x059a A[LOOP:3: B:136:0x0592->B:138:0x059a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0684 A[Catch: Exception -> 0x073e, TryCatch #1 {Exception -> 0x073e, blocks: (B:161:0x067d, B:163:0x0684, B:164:0x0688, B:166:0x068e, B:168:0x069d, B:169:0x06a1, B:171:0x06a7, B:173:0x06c4, B:174:0x06cf, B:176:0x06dd, B:177:0x06e8, B:179:0x06f2, B:181:0x06f6, B:184:0x06e4, B:185:0x06cb, B:187:0x0708, B:190:0x0735), top: B:160:0x067d }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x08bd A[LOOP:7: B:218:0x08b7->B:220:0x08bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x036c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d6(java.lang.String r23, java.util.List r24, byte[] r25, int r26, int r27, ya2.t1 r28) {
        /*
            Method dump skipped, instructions count: 2282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.d6.<init>(java.lang.String, java.util.List, byte[], int, int, ya2.t1):void");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.util.LinkedList list;
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        kotlin.jvm.internal.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
        r45.az2 az2Var = (r45.az2) fVar;
        if (i18 >= 4) {
            this.f227949o = cz2.f.f225002d;
        }
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.g byteString = az2Var.getByteString(10);
            if (byteString != null) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_LAST_BUFF_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(byteString.f192156a));
            } else {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_LAST_BUFF_STRING_SYNC, "");
            }
            jx3.f.INSTANCE.idkeyStat(1279L, 11L, 1L, false);
            r45.qw0 qw0Var = (r45.qw0) az2Var.getCustom(8);
            int i27 = 0;
            if (qw0Var != null) {
                com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", "[onGYNetEnd] check_expire_info=" + bq.v1.b(qw0Var));
                if (qw0Var.getInteger(0) == 1) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_RED_DOT_EXPIRED_INFO_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(qw0Var.toByteArray()));
                }
            }
            r45.ml2 ml2Var = (r45.ml2) az2Var.getCustom(11);
            if (ml2Var != null && (list = ml2Var.getList(0)) != null) {
                java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderObject> arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.jm2) it.next()).getCustom(0);
                    if (finderObject != null) {
                        arrayList.add(finderObject);
                    }
                }
                for (com.tencent.mm.protocal.protobuf.FinderObject finderObject2 : arrayList) {
                    bu2.j jVar = bu2.j.f24534a;
                    com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                    kotlin.jvm.internal.o.d(finderObject2);
                    com.tencent.mm.plugin.finder.storage.FinderItem a17 = h90Var.a(finderObject2, i27);
                    com.tencent.mm.protobuf.f fVar2 = oVar.f70710a.f70684a;
                    kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
                    r45.kv0 kv0Var = (r45.kv0) ((r45.zy2) fVar2).getCustom(6);
                    jVar.n(a17, new bu2.h(3565, kv0Var != null ? kv0Var.getLong(5) : 0L));
                    i27 = 0;
                }
            }
            java.util.LinkedList<r45.om5> list2 = az2Var.getList(13);
            if (list2 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("discardReddotInFindMoreTab config=");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                for (r45.om5 om5Var : list2) {
                    arrayList2.add(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE + om5Var.getInteger(1) + ",accumulate_expose_interval=" + om5Var.getInteger(2) + ",last_expose_interval=" + om5Var.getInteger(3) + ",path=" + com.tencent.mm.sdk.platformtools.t8.c1(om5Var.getList(0), ","));
                }
                sb6.append(arrayList2);
                com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", sb6.toString());
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_RED_DOT_DISCARD_CONFIG_STRING_SYNC;
                r45.qc4 qc4Var = new r45.qc4();
                qc4Var.set(0, list2);
                c17.x(u3Var, com.tencent.mm.sdk.platformtools.t8.l(qc4Var.toByteArray()));
            }
            java.util.LinkedList list3 = az2Var.getList(12);
            if (list3 != null) {
                com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_RED_DOT_FREQ_CTRL_CONFIG_STRING_SYNC;
                r45.tm5 tm5Var = new r45.tm5();
                tm5Var.set(0, list3);
                c18.x(u3Var2, com.tencent.mm.sdk.platformtools.t8.l(tm5Var.toByteArray()));
            }
            r45.ep2 ep2Var = (r45.ep2) az2Var.getCustom(14);
            if (ep2Var != null) {
                com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", "popup_client_freq_config expose_quota=" + ep2Var.getInteger(0) + ",expose_interval=" + ep2Var.getInteger(1));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_POPUP_CLIENT_FREQ_CONFIG_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(ep2Var.toByteArray()));
            }
        } else {
            jx3.f.INSTANCE.idkeyStat(1279L, 12L, 1L, false);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f227945h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    public final void K(int i17, ya2.t1 t1Var) {
        com.tencent.mm.plugin.finder.extension.reddot.jb L0;
        int i18;
        com.tencent.mm.plugin.finder.extension.reddot.jb L02;
        r45.vs2 vs2Var;
        com.tencent.mm.plugin.finder.extension.reddot.jb L03;
        r45.vs2 vs2Var2;
        java.util.Iterator it;
        java.util.Iterator it6;
        if (t1Var == null) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        boolean z17 = aj0Var.F() == 1;
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        if (z17) {
            com.tencent.mm.plugin.finder.extension.reddot.jb L04 = nk6.L0("FinderEntrance");
            L0 = L04 != null ? L04.u1() : null;
        } else {
            L0 = nk6.L0("FinderEntrance");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fillRedDotArgs args=" + t1Var + ",copyReddot=" + z17 + ",finderEntranceCtrlInfo=" + L0);
        if (L0 != null && L0.field_ctrInfo == null && aj0Var.G() == 1) {
            sb6.append(",throw redDot!");
            L0 = null;
        }
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", sb6.toString());
        if ((t1Var.f460538a.length() == 0) && L0 != null) {
            java.lang.String str = L0.field_tipsId;
            if (str == null) {
                str = "";
            }
            t1Var.f460538a = str;
        }
        java.util.LinkedList linkedList = t1Var.f460539b;
        if (L0 != null) {
            java.util.Iterator it7 = linkedList.iterator();
            int i19 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i19 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L0.field_tipsId, ((r45.vs2) it7.next()).f388490h)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 < 0) {
                ya2.w1.a(linkedList, L0);
                java.lang.String str2 = L0.field_tips_uuid;
                if (str2 != null) {
                    nk6.z("FinderEntrance", str2, L0);
                }
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L05 = nk6.L0("FinderMentionEntrance");
        if (L05 != null) {
            java.util.Iterator it8 = linkedList.iterator();
            int i27 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i27 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L05.field_tipsId, ((r45.vs2) it8.next()).f388490h)) {
                    break;
                } else {
                    i27++;
                }
            }
            if (i27 < 0) {
                ya2.w1.a(linkedList, L05);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L06 = nk6.L0("TLFollow");
        if (L06 != null) {
            java.util.Iterator it9 = linkedList.iterator();
            int i28 = 0;
            while (true) {
                if (!it9.hasNext()) {
                    i28 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L06.field_tipsId, ((r45.vs2) it9.next()).f388490h)) {
                    break;
                } else {
                    i28++;
                }
            }
            if (i28 < 0) {
                ya2.w1.a(linkedList, L06);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L07 = nk6.L0("TLRecommendTab");
        if (L07 != null) {
            java.util.Iterator it10 = linkedList.iterator();
            int i29 = 0;
            while (true) {
                if (!it10.hasNext()) {
                    i29 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L07.field_tipsId, ((r45.vs2) it10.next()).f388490h)) {
                    break;
                } else {
                    i29++;
                }
            }
            if (i29 < 0) {
                ya2.w1.a(linkedList, L07);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L08 = nk6.L0("finder_tl_hot_tab");
        if (L08 != null) {
            java.util.Iterator it11 = linkedList.iterator();
            int i37 = 0;
            while (true) {
                if (!it11.hasNext()) {
                    i37 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L08.field_tipsId, ((r45.vs2) it11.next()).f388490h)) {
                    break;
                } else {
                    i37++;
                }
            }
            if (i37 < 0) {
                ya2.w1.a(linkedList, L08);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L09 = nk6.L0("finder_tl_nearby_tab");
        if (L09 != null) {
            java.util.Iterator it12 = linkedList.iterator();
            int i38 = 0;
            while (true) {
                if (!it12.hasNext()) {
                    i38 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L09.field_tipsId, ((r45.vs2) it12.next()).f388490h)) {
                    break;
                } else {
                    i38++;
                }
            }
            if (i38 < 0) {
                ya2.w1.a(linkedList, L09);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L010 = nk6.L0("finder_tl_city_tab");
        if (L010 != null) {
            java.util.Iterator it13 = linkedList.iterator();
            int i39 = 0;
            while (true) {
                if (!it13.hasNext()) {
                    i39 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L010.field_tipsId, ((r45.vs2) it13.next()).f388490h)) {
                    break;
                } else {
                    i39++;
                }
            }
            if (i39 < 0) {
                ya2.w1.a(linkedList, L010);
            }
        }
        for (java.lang.String str3 : r26.n0.f0(com.tencent.mm.plugin.finder.storage.aj0.f126440a.s(), new java.lang.String[]{";"}, false, 0, 6, null)) {
            com.tencent.mm.plugin.finder.extension.reddot.jb L011 = nk6.L0(str3);
            if (L011 != null) {
                java.util.Iterator it14 = linkedList.iterator();
                int i47 = 0;
                while (true) {
                    if (!it14.hasNext()) {
                        i47 = -1;
                        break;
                    } else if (kotlin.jvm.internal.o.b(L011.field_tipsId, ((r45.vs2) it14.next()).f388490h)) {
                        break;
                    } else {
                        i47++;
                    }
                }
                boolean z18 = i47 >= 0;
                com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", "[FINDER_REDDOT_SYNC_PATH_LIST] path=" + str3 + " isExist=" + z18 + " ctrlInfo=" + hc2.u0.e(L011.field_ctrInfo));
                if (!z18) {
                    ya2.w1.a(linkedList, L011);
                }
            }
        }
        java.util.Iterator it15 = ((java.util.ArrayList) ((ey2.c2) ((xy2.n) pf5.u.f353936a.e(zy2.b6.class).c(xy2.n.class))).N6()).iterator();
        while (it15.hasNext()) {
            int intValue = ((java.lang.Number) it15.next()).intValue();
            java.util.Iterator it16 = nk6.f(intValue, g92.b.f269769e.T0()).iterator();
            while (it16.hasNext()) {
                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) it16.next();
                java.util.Iterator it17 = linkedList.iterator();
                int i48 = 0;
                while (true) {
                    if (!it17.hasNext()) {
                        it = it15;
                        it6 = it16;
                        i48 = -1;
                        break;
                    } else {
                        it = it15;
                        it6 = it16;
                        if (kotlin.jvm.internal.o.b(jbVar.field_tips_uuid, ((r45.vs2) it17.next()).f388503x)) {
                            break;
                        }
                        i48++;
                        it16 = it6;
                        it15 = it;
                    }
                }
                boolean z19 = i48 >= 0;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[FINDER_REDDOT_SYNC_PATH_LIST] type=");
                sb7.append(intValue);
                sb7.append(" isExist=");
                sb7.append(z19);
                sb7.append(" ctrlInfo=");
                r45.vs2 vs2Var3 = jbVar.field_ctrInfo;
                sb7.append(vs2Var3 != null ? hc2.u0.e(vs2Var3) : null);
                com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", sb7.toString());
                if (!z19) {
                    ya2.w1.a(linkedList, jbVar);
                }
                it16 = it6;
                it15 = it;
            }
        }
        if ((t1Var.f460540c.length() == 0) && (L03 = nk6.L0("NearbyEntrance")) != null && (vs2Var2 = L03.field_ctrInfo) != null) {
            java.lang.String str4 = vs2Var2.f388490h;
            if (str4 == null) {
                str4 = "";
            }
            t1Var.f460540c = str4;
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L012 = nk6.L0("FinderLiveEntrance");
        if (L012 != null && (vs2Var = L012.field_ctrInfo) != null) {
            java.lang.String str5 = vs2Var.f388490h;
            t1Var.f460540c = str5 != null ? str5 : "";
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L013 = nk6.L0("NearbyEntrance");
        java.util.LinkedList linkedList2 = t1Var.f460541d;
        if (L013 != null) {
            java.util.Iterator it18 = linkedList2.iterator();
            int i49 = 0;
            while (true) {
                if (!it18.hasNext()) {
                    i49 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L013.field_tipsId, ((r45.vs2) it18.next()).f388490h)) {
                    break;
                } else {
                    i49++;
                }
            }
            if (i49 < 0) {
                ya2.w1.a(linkedList2, L013);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L014 = nk6.L0("NearbyFeedTab");
        if (L014 != null) {
            java.util.Iterator it19 = linkedList2.iterator();
            int i57 = 0;
            while (true) {
                if (!it19.hasNext()) {
                    i57 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L014.field_tipsId, ((r45.vs2) it19.next()).f388490h)) {
                    break;
                } else {
                    i57++;
                }
            }
            if (i57 < 0) {
                ya2.w1.a(linkedList2, L014);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L015 = nk6.L0("NearbyLiveTab");
        if (L015 != null) {
            java.util.Iterator it20 = linkedList2.iterator();
            int i58 = 0;
            while (true) {
                if (!it20.hasNext()) {
                    i58 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L015.field_tipsId, ((r45.vs2) it20.next()).f388490h)) {
                    break;
                } else {
                    i58++;
                }
            }
            if (i58 < 0) {
                ya2.w1.a(linkedList2, L015);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L016 = nk6.L0("NearbyPeopleTab");
        if (L016 != null) {
            java.util.Iterator it21 = linkedList2.iterator();
            int i59 = 0;
            while (true) {
                if (!it21.hasNext()) {
                    i59 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L016.field_tipsId, ((r45.vs2) it21.next()).f388490h)) {
                    break;
                } else {
                    i59++;
                }
            }
            if (i59 < 0) {
                ya2.w1.a(linkedList2, L016);
            }
        }
        ae2.b2 b2Var = ae2.b2.f3461a;
        for (java.lang.String str6 : r26.n0.f0((java.lang.CharSequence) ((lb2.j) ((jz5.n) ae2.b2.f3487u).getValue()).r(), new java.lang.String[]{";"}, false, 0, 6, null)) {
            if ((str6.length() > 0) && (L02 = nk6.L0(str6)) != null) {
                java.util.Iterator it22 = linkedList2.iterator();
                int i66 = 0;
                while (true) {
                    if (!it22.hasNext()) {
                        i66 = -1;
                        break;
                    } else if (kotlin.jvm.internal.o.b(L02.field_tipsId, ((r45.vs2) it22.next()).f388490h)) {
                        break;
                    } else {
                        i66++;
                    }
                }
                boolean z27 = i66 >= 0;
                com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", "[FINDER_LIVE_REDDOT_SYNC_PATH_LIST] path=" + str6 + " isExist=" + z27 + " ctrlInfo=" + hc2.u0.e(L02.field_ctrInfo));
                if (!z27) {
                    ya2.w1.a(linkedList2, L02);
                }
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L017 = nk6.L0("FinderSnsDeliveryEntrance");
        java.util.LinkedList linkedList3 = t1Var.f460542e;
        if (L017 != null) {
            java.util.Iterator it23 = linkedList3.iterator();
            int i67 = 0;
            while (true) {
                if (!it23.hasNext()) {
                    i18 = -1;
                    break;
                } else {
                    if (kotlin.jvm.internal.o.b(L017.field_tipsId, ((r45.vs2) it23.next()).f388490h)) {
                        i18 = i67;
                        break;
                    }
                    i67++;
                }
            }
            if (i18 < 0) {
                ya2.w1.a(linkedList3, L017);
            }
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("scene=");
        sb8.append(i17);
        sb8.append(" FINDER_REDDOT_SYNC_PATH_LIST=");
        sb8.append(com.tencent.mm.plugin.finder.storage.aj0.f126440a.s());
        sb8.append(" FINDER_LIVE_REDDOT_SYNC_PATH_LIST=");
        ae2.b2 b2Var2 = ae2.b2.f3461a;
        sb8.append((java.lang.String) ((lb2.j) ((jz5.n) ae2.b2.f3487u).getValue()).r());
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[fillRedDotArgs] scene=");
        sb9.append(i17);
        sb9.append(" finderCtrlInfoList=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it24 = linkedList.iterator();
        while (it24.hasNext()) {
            arrayList.add(((r45.vs2) it24.next()).f388490h);
        }
        sb9.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", sb9.toString());
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[fillRedDotArgs] scene=");
        sb10.append(i17);
        sb10.append(" nearbyCtrlInfoList=");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
        java.util.Iterator it25 = linkedList2.iterator();
        while (it25.hasNext()) {
            arrayList2.add(((r45.vs2) it25.next()).f388490h);
        }
        sb10.append(arrayList2);
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", sb10.toString());
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("[fillRedDotArgs] scene=");
        sb11.append(i17);
        sb11.append(" snsCtrlInfoList=");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
        java.util.Iterator it26 = linkedList3.iterator();
        while (it26.hasNext()) {
            arrayList3.add(((r45.vs2) it26.next()).f388490h);
        }
        sb11.append(arrayList3);
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", sb11.toString());
        L(linkedList);
        L(linkedList2);
        L(linkedList3);
    }

    public final void L(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.vs2 vs2Var = (r45.vs2) it.next();
            com.tencent.mm.protobuf.g gVar = vs2Var.f388501v;
            if (gVar != null) {
                r45.vs2 vs2Var2 = new r45.vs2();
                vs2Var2.f388501v = gVar;
                java.util.LinkedList<r45.f03> show_infos = vs2Var.f388489g;
                kotlin.jvm.internal.o.f(show_infos, "show_infos");
                for (r45.f03 f03Var : show_infos) {
                    java.util.LinkedList linkedList3 = vs2Var2.f388489g;
                    r45.f03 f03Var2 = new r45.f03();
                    f03Var2.f373892i = f03Var.f373892i;
                    linkedList3.add(f03Var2);
                }
                linkedList2.add(vs2Var2);
                com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSync", "[optCtrlInfoReport] " + hc2.u0.e(vs2Var2));
            } else {
                linkedList2.add(vs2Var);
            }
        }
        linkedList.clear();
        linkedList.addAll(linkedList2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f227945h = u0Var;
        return dispatch(sVar, this.f227944g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3565;
    }

    @Override // az2.u, cz2.j
    public cz2.f v() {
        return this.f227949o;
    }
}
