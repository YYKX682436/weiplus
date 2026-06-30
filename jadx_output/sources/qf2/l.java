package qf2;

/* loaded from: classes3.dex */
public final class l extends if2.b implements mf2.v, mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f362455m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f362456n;

    /* renamed from: o, reason: collision with root package name */
    public long f362457o;

    /* renamed from: p, reason: collision with root package name */
    public ml2.p3 f362458p;

    /* renamed from: q, reason: collision with root package name */
    public long f362459q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f362458p = ml2.p3.f327788d;
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        e7(false);
    }

    public final void Z6(java.util.LinkedList linkedList) {
        java.lang.Object obj;
        java.lang.String str = ((mm2.e1) business(mm2.e1.class)).f328987q.f380301n;
        if (str == null) {
            str = "";
        }
        int i17 = 0;
        for (java.lang.Object obj2 : linkedList) {
            int i18 = i17 + 1;
            java.lang.Object obj3 = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            xh2.a aVar = (xh2.a) obj2;
            java.util.ArrayList arrayList = zn0.x.f474414a.f474415a;
            kotlin.jvm.internal.o.f(arrayList, "getRemoteUserConfigList(...)");
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((zn0.v) obj).f474406d, aVar.b())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            zn0.v vVar = (zn0.v) obj;
            if (vVar != null) {
                vVar.f474413n = aVar.f454521b.f454553e;
            }
            java.util.List list = ((mm2.o4) business(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (kotlin.jvm.internal.o.b(((km2.q) next).f309170a, aVar.b())) {
                        obj3 = next;
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj3;
            if (qVar != null) {
                qVar.f309192w = aVar.f454521b.f454553e;
            }
            if (kotlin.jvm.internal.o.b(aVar.b(), str)) {
                zn0.y yVar = zn0.x.f474414a;
                int i19 = aVar.f454521b.f454553e;
                int size = yVar.f474415a.size();
                yVar.f474416b = i19;
                yVar.f474417c = size;
            }
            i17 = i18;
        }
    }

    public final void a7(java.lang.String micId) {
        km2.q qVar;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(micId, "micId");
        java.util.List list = ((mm2.o4) business(mm2.o4.class)).f329335z;
        if (list != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309175f, micId)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
            }
            qVar = (km2.q) obj;
        } else {
            qVar = null;
        }
        com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "anchor start accept link mic micId: " + micId + " curLinkUser: " + qVar + " size: " + ((mm2.o4) business(mm2.o4.class)).f329335z.size());
        if (qVar != null) {
            r45.xn1 xn1Var = new r45.xn1();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact.setUsername(qVar.f309172c);
            finderContact.setNickname(qVar.f309173d);
            finderContact.setHeadUrl(qVar.f309171b);
            xn1Var.set(0, finderContact);
            mk2.h hVar = mk2.h.f327133a;
            java.lang.String str = qVar.f309175f;
            com.tencent.mars.xlog.Log.i("Finder.LinkMicTimeoutTimer", "startAcceptMicTimer micId:" + str + " delay:10000");
            if (str != null) {
                mk2.e eVar = new mk2.e();
                eVar.f327130d = str;
                mk2.h.f327137e.put(str, eVar);
                com.tencent.mm.sdk.platformtools.u3.i(eVar, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            }
            dk2.u4 u4Var = ((mm2.o4) business(mm2.o4.class)).Z;
            if (u4Var != null && u4Var.g()) {
                int i17 = zn0.x.f474414a.f474416b;
                java.util.List list2 = ((mm2.o4) business(mm2.o4.class)).f329335z;
                kotlin.jvm.internal.o.f(list2, "<get-linkMicUserInfoList>(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list2) {
                    km2.q qVar2 = (km2.q) obj2;
                    if ((kotlin.jvm.internal.o.b(qVar2.f309189t, java.lang.Boolean.TRUE) || qVar2.f309177h) ? false : true) {
                        arrayList.add(obj2);
                    }
                }
                com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "adjustCrossRoomUserPosValid curList = " + arrayList);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    km2.q qVar3 = (km2.q) it6.next();
                    int i18 = qVar3.f309192w;
                    if (i18 <= 0 || i18 > 5 || i18 == i17) {
                        arrayList2.add(qVar3);
                    } else if (hashMap.containsKey(java.lang.Integer.valueOf(i18))) {
                        arrayList2.add(qVar3);
                    } else {
                        hashMap.put(java.lang.Integer.valueOf(qVar3.f309192w), qVar3);
                    }
                }
                int i19 = 0;
                for (int i27 = 1; i27 < 6; i27++) {
                    if (!hashMap.containsKey(java.lang.Integer.valueOf(i27)) && i27 != i17) {
                        int i28 = i19 + 1;
                        km2.q qVar4 = (km2.q) kz5.n0.a0(arrayList2, i19);
                        if (qVar4 != null) {
                            qVar4.f309192w = i27;
                        }
                        i19 = i28;
                    }
                }
                com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "adjustCrossRoomUserPosValid result curList = " + arrayList);
            } else {
                int i29 = zn0.x.f474414a.f474416b;
                java.util.List<km2.q> list3 = ((mm2.o4) business(mm2.o4.class)).f329335z;
                com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "adjustUserPosValid curList = " + list3);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                kotlin.jvm.internal.o.d(list3);
                for (km2.q qVar5 : list3) {
                    int i37 = qVar5.f309192w;
                    if (i37 <= 0 || i37 > 9 || i37 == i29) {
                        arrayList3.add(qVar5);
                    } else if (hashMap2.containsKey(java.lang.Integer.valueOf(i37))) {
                        arrayList3.add(qVar5);
                    } else {
                        hashMap2.put(java.lang.Integer.valueOf(qVar5.f309192w), qVar5);
                    }
                }
                int i38 = 0;
                for (int i39 = 1; i39 < 10; i39++) {
                    if (!hashMap2.containsKey(java.lang.Integer.valueOf(i39)) && i39 != i29) {
                        int i47 = i38 + 1;
                        km2.q qVar6 = (km2.q) kz5.n0.a0(arrayList3, i38);
                        if (qVar6 != null) {
                            qVar6.f309192w = i39;
                        }
                        i38 = i47;
                    }
                }
                com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "adjustUserPosValid result curList = " + list3);
            }
            dk2.xf k17 = dk2.ef.f233372a.k(getStore().getLiveRoomData());
            if (k17 != null) {
                long j17 = ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0);
                long j18 = ((mm2.e1) business(mm2.e1.class)).f328983m;
                java.lang.String str2 = ((mm2.e1) business(mm2.e1.class)).f328992v;
                byte[] bArr = ((mm2.e1) business(mm2.e1.class)).f328985o;
                int i48 = qVar.f309174e;
                java.lang.String str3 = qVar.f309170a;
                java.lang.String str4 = qVar.f309175f;
                if (str4 == null) {
                    str4 = "";
                }
                int i49 = qVar.f309192w;
                qf2.e eVar2 = new qf2.e(qVar, this, xn1Var, micId);
                dk2.r4 r4Var = (dk2.r4) k17;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acceptAudienceLinkMic nickName: ");
                com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                sb6.append(finderContact2 != null ? finderContact2.getNickname() : null);
                sb6.append(" liveId:");
                sb6.append(j17);
                sb6.append(", objectId:");
                sb6.append(j18);
                sb6.append(", nonceId:");
                sb6.append(str2);
                sb6.append(", scene:1, micType:");
                sb6.append(i48);
                sb6.append(", userId:");
                sb6.append(str3);
                sb6.append(", sessionId:");
                sb6.append(str4);
                com.tencent.mars.xlog.Log.i(r4Var.f234009d, sb6.toString());
                r45.ch1 ch1Var = new r45.ch1();
                ch1Var.set(7, str4);
                ch1Var.set(0, xn1Var);
                r45.eh1 eh1Var = new r45.eh1();
                eh1Var.set(1, java.lang.Integer.valueOf(i48));
                eh1Var.set(0, str3);
                eh1Var.set(2, java.lang.Integer.valueOf(i49));
                ch1Var.set(4, com.tencent.mm.protobuf.g.b(eh1Var.toByteArray()));
                ch1Var.set(1, 20004);
                ch1Var.set(2, zl2.q4.f473933a.m());
                new ek2.b(j17, j18, str2, bArr, 1, ch1Var, eVar2).l();
            }
        }
    }

    public final void b7(int i17, java.lang.String str) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (str == null) {
            str = ((mm2.e1) business(mm2.e1.class)).f328987q.f380301n;
        }
        if (str == null) {
            str = "";
        }
        xh2.c cVar = (xh2.c) ((mm2.o4) business(mm2.o4.class)).A.getValue();
        if (cVar != null && (linkedList = cVar.f454531a) != null) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(((xh2.a) it.next()).a());
            }
            java.util.Iterator it6 = linkedList2.iterator();
            while (true) {
                obj = null;
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it6.next();
                    if (kotlin.jvm.internal.o.b(((xh2.a) obj2).b(), str)) {
                        break;
                    }
                }
            }
            xh2.a aVar = (xh2.a) obj2;
            java.util.Iterator it7 = linkedList2.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                java.lang.Object next = it7.next();
                boolean z17 = true;
                if (((xh2.a) next).f454521b.f454553e != 1) {
                    z17 = false;
                }
                if (z17) {
                    obj = next;
                    break;
                }
            }
            xh2.a aVar2 = (xh2.a) obj;
            if (aVar2 != null && aVar != null) {
                xh2.i a17 = aVar.f454521b.a();
                xh2.i iVar = aVar2.f454521b;
                kotlin.jvm.internal.o.g(iVar, "<set-?>");
                aVar.f454521b = iVar;
                aVar2.f454521b = a17;
            }
            Z6(linkedList2);
        }
        in0.q e17 = dk2.ef.f233372a.e();
        if (e17 != null) {
            e17.i0(i17, str);
        }
    }

    public final void c7(long j17, int i17, int i18, int i19) {
        if (j17 == this.f362457o) {
            r45.il4 il4Var = ((mm2.o4) business(mm2.o4.class)).U;
            il4Var.f377135m = i18;
            dk2.xf k17 = dk2.ef.f233372a.k(getStore().getLiveRoomData());
            if (k17 != null) {
                ((dk2.r4) k17).q0(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) business(mm2.e1.class)).f328983m, il4Var.f377129d, il4Var.f377131f, il4Var.f377132g, il4Var.f377133h, il4Var.f377134i, i18, new qf2.h(j17, this, i17, i18, i19));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "doSetMicSettingWithRetry seq outdated, skip. seq:" + j17 + " latest:" + this.f362457o + " newMode:" + i17 + " micLayoutBaseMode:" + i18 + " retryCount:" + i19);
    }

    public final void d7(android.os.Bundle bundle, in0.q qVar) {
        java.lang.String str;
        if (bundle == null || (str = bundle.getString("PARAM_FINDER_LIVE_FORCE_USER_ID")) == null) {
            str = "";
        }
        int i17 = bundle != null ? bundle.getInt("PARAM_FINDER_LIVE_MIC_MODE") : 0;
        if (bundle != null) {
            bundle.getInt("PARAM_FINDER_LIVE_MIC_ANCHOR_POSITION");
        }
        Z6(((mm2.y2) business(mm2.y2.class)).f329559i);
        if (qVar != null) {
            qVar.i0(i17, str);
        }
    }

    public final void e7(boolean z17) {
        ml2.p3 p3Var;
        int i17;
        zn0.a0 U;
        in0.q e17 = dk2.ef.f233372a.e();
        java.lang.Integer valueOf = (e17 == null || (U = e17.U()) == null) ? null : java.lang.Integer.valueOf(U.f474316t);
        if (!((mm2.o4) business(mm2.o4.class)).k7() || ((mm2.y2) business(mm2.y2.class)).Y6() || z17) {
            p3Var = ml2.p3.f327788d;
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
                p3Var = ml2.p3.f327789e;
            } else {
                if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 4)) {
                    p3Var = ml2.p3.f327791g;
                } else {
                    if ((((valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 6)) || (valueOf != null && valueOf.intValue() == 7)) || (valueOf != null && valueOf.intValue() == 8)) {
                        p3Var = ml2.p3.f327792h;
                    } else {
                        p3Var = (valueOf != null && valueOf.intValue() == 9) || (valueOf != null && valueOf.intValue() == 10) ? ml2.p3.f327790f : ml2.p3.f327788d;
                    }
                }
            }
        }
        if (p3Var == this.f362458p) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ml2.p3 p3Var2 = this.f362458p;
        long j17 = this.f362459q;
        ml2.p3 p3Var3 = ml2.p3.f327788d;
        if (p3Var2 != p3Var3 && j17 > 0) {
            long j18 = (currentTimeMillis - j17) / 1000;
            if (j18 > 0) {
                boolean z18 = p3Var2 == ml2.p3.f327792h;
                int i18 = z18 ? 2 : 1;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("duration", j18);
                jSONObject.put("mic_mode", i18);
                if (!z18) {
                    int ordinal = p3Var2.ordinal();
                    if (ordinal != 1) {
                        int i19 = 2;
                        if (ordinal == 2) {
                            ml2.f3[] f3VarArr = ml2.f3.f327429d;
                        } else if (ordinal != 3) {
                            ml2.f3[] f3VarArr2 = ml2.f3.f327429d;
                        } else {
                            ml2.f3[] f3VarArr3 = ml2.f3.f327429d;
                            i19 = 3;
                        }
                        i17 = i19;
                        jSONObject.put("mic_pos_style", i17);
                    } else {
                        ml2.f3[] f3VarArr4 = ml2.f3.f327429d;
                    }
                    i17 = 1;
                    jSONObject.put("mic_pos_style", i17);
                }
                com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "doReportMicModeUsageDuration type:" + p3Var2 + " durationSec:" + j18 + " json:" + jSONObject);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.Q2, jSONObject.toString(), null, 4, null);
            } else {
                com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "reportMicModeUsageDuration skip, durationSec<=0. lastType:" + p3Var2 + " durationSec:" + j18);
            }
        }
        com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "reportMicModeUsageDuration switch from " + this.f362458p + " to " + p3Var + ", curMicMode:" + valueOf + " isLiveEnd:" + z17);
        this.f362458p = p3Var;
        if (p3Var == p3Var3) {
            currentTimeMillis = 0;
        }
        this.f362459q = currentTimeMillis;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        kotlinx.coroutines.r2 r2Var = this.f362456n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f362456n = null;
        e7(true);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        r45.il4 il4Var;
        super.onLiveMsg(r71Var);
        if (this.f362455m != null || (il4Var = ((mm2.o4) business(mm2.o4.class)).U) == null) {
            return;
        }
        int i17 = (int) il4Var.f377129d;
        int i18 = pm0.v.z(i17, 32) ? 3 : pm0.v.z(i17, 64) ? 4 : 1;
        this.f362455m = java.lang.Integer.valueOf(i18);
        com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "onLiveMsg first onMicModeChange currentMicMode: " + i18);
        in0.q e17 = dk2.ef.f233372a.e();
        java.lang.String str = ((mm2.e1) business(mm2.e1.class)).f328987q.f380301n;
        if (str == null) {
            str = "";
        }
        if (e17 != null) {
            e17.i0(i18, str);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.j(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r4 != 3) goto L22;
     */
    @Override // mf2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s6(int r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r0 = 38
            if (r8 != r0) goto L62
            r8 = 0
            if (r9 == 0) goto Le
            java.lang.String r0 = "live_base_mic_mode_old"
            int r0 = r9.getInt(r0, r8)
            goto Lf
        Le:
            r0 = r8
        Lf:
            if (r9 == 0) goto L19
            java.lang.String r1 = "live_base_mic_mode_new"
            int r9 = r9.getInt(r1, r8)
            r4 = r9
            goto L1a
        L19:
            r4 = r8
        L1a:
            long r1 = r7.f362457o
            r5 = 1
            long r2 = r1 + r5
            r7.f362457o = r2
            kotlinx.coroutines.r2 r9 = r7.f362456n
            r1 = 1
            r5 = 0
            if (r9 == 0) goto L2b
            kotlinx.coroutines.p2.a(r9, r5, r1, r5)
        L2b:
            r7.f362456n = r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r5 = "onBaseMicModeChange oldMode:"
            r9.<init>(r5)
            r9.append(r0)
            java.lang.String r0 = " newMode:"
            r9.append(r0)
            r9.append(r4)
            java.lang.String r0 = " seq:"
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "AnchorMicCloudController"
            com.tencent.mars.xlog.Log.i(r0, r9)
            if (r4 == r1) goto L5c
            r9 = 2
            if (r4 == r9) goto L59
            r9 = 3
            if (r4 == r9) goto L59
            goto L5a
        L59:
            r8 = r9
        L5a:
            r5 = r8
            goto L5d
        L5c:
            r5 = r1
        L5d:
            r6 = 0
            r1 = r7
            r1.c7(r2, r4, r5, r6)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.l.s6(int, android.os.Bundle):void");
    }
}
