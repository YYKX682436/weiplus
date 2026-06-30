package xe2;

/* loaded from: classes3.dex */
public final class t0 extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        int i17;
        java.util.Iterator it;
        java.util.LinkedList linkedList;
        int i18;
        km2.b0 b0Var;
        int i19;
        java.lang.String str;
        int i27;
        java.lang.String str2;
        int i28;
        java.lang.String str3;
        int i29;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Class cls;
        java.util.List list;
        boolean z17;
        boolean z18;
        java.lang.Object obj;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String username;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact6;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact7;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact8;
        r45.xn1 xn1Var;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        mm2.o4 o4Var = (mm2.o4) this.f445267a.a(mm2.o4.class);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = msgList.iterator();
        while (true) {
            i17 = 1;
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (kz5.z.F(o4Var.G1, ((r45.ch1) next).getInteger(1))) {
                arrayList.add(next);
            }
        }
        linkedList2.addAll(arrayList);
        java.util.Iterator it7 = linkedList2.iterator();
        while (it7.hasNext()) {
            r45.ch1 ch1Var = (r45.ch1) it7.next();
            r45.lh1 lh1Var = new r45.lh1();
            com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 != null) {
                try {
                    lh1Var.parseFrom(g17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            boolean booleanValue = ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) o4Var.H).getValue()).booleanValue();
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "receive apply mic msg: [sessionId:" + ch1Var.getString(7) + ", applyUserSdkId:" + lh1Var.getString(10) + " seatPosition: " + lh1Var.getInteger(i17) + "  confirm_expired_time: " + lh1Var.getLong(12) + " autoLink: " + lh1Var.getBoolean(2) + " isPayMic: " + booleanValue + ']');
            java.lang.String string = ch1Var.getString(7);
            if (string != null) {
                java.util.HashMap hashMap = o4Var.K;
                if (hashMap.get(string) != null) {
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "has received mic apply, skip msg. sessionId:".concat(string));
                } else {
                    long j17 = lh1Var.getLong(12) * 1000;
                    if (j17 <= 0 || c01.id.c() <= j17) {
                        hashMap.put(string, 0);
                        java.util.List list2 = o4Var.f329318o;
                        kotlin.jvm.internal.o.d(list2);
                        kz5.h0.B(list2, new mm2.b4(lh1Var));
                        if (lh1Var.getBoolean(4)) {
                            int integer = lh1Var.getInteger(7);
                            java.lang.String string2 = lh1Var.getString(5);
                            if (string2 == null) {
                                string2 = "";
                            }
                            b0Var = new km2.b0(integer, string2);
                        } else {
                            b0Var = null;
                        }
                        r45.xn1 xn1Var2 = (r45.xn1) ch1Var.getCustom(13);
                        if ((xn1Var2 != null ? (r45.vy1) xn1Var2.getCustom(18) : null) != null || (xn1Var = (r45.xn1) ch1Var.getCustom(13)) == null) {
                            it = it7;
                        } else {
                            it = it7;
                            xn1Var.set(18, (r45.vy1) lh1Var.getCustom(8));
                        }
                        java.lang.String string3 = lh1Var.getString(10);
                        r45.xn1 xn1Var3 = (r45.xn1) ch1Var.getCustom(13);
                        if (xn1Var3 == null || (finderContact8 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) {
                            i19 = 13;
                            str = null;
                        } else {
                            str = finderContact8.getHeadUrl();
                            i19 = 13;
                        }
                        r45.xn1 xn1Var4 = (r45.xn1) ch1Var.getCustom(i19);
                        if (xn1Var4 == null || (finderContact7 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null) {
                            i27 = 13;
                            str2 = null;
                        } else {
                            str2 = finderContact7.getUsername();
                            i27 = 13;
                        }
                        r45.xn1 xn1Var5 = (r45.xn1) ch1Var.getCustom(i27);
                        km2.q qVar = new km2.q(string3, str, str2, (xn1Var5 == null || (finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) == null) ? null : finderContact6.getNickname(), lh1Var.getInteger(0), ch1Var.getString(7), null, false, ((mm2.c1) o4Var.business(mm2.c1.class)).l8(), null, null, 0, 0, false, null, false, lh1Var.getInteger(11), (r45.xn1) ch1Var.getCustom(13), false, null, null, 0, lh1Var.getInteger(1), 0L, null, null, j17, null, 0, 0L, null, null, null, -71500096, 1, null);
                        qVar.v(b0Var);
                        list2.add(qVar);
                        java.util.List list3 = o4Var.f329322q;
                        kotlin.jvm.internal.o.d(list3);
                        kz5.h0.B(list3, new mm2.c4(lh1Var));
                        java.lang.String string4 = lh1Var.getString(10);
                        r45.xn1 xn1Var6 = (r45.xn1) ch1Var.getCustom(13);
                        if (xn1Var6 == null || (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var6.getCustom(0)) == null) {
                            i28 = 13;
                            str3 = null;
                        } else {
                            str3 = finderContact5.getHeadUrl();
                            i28 = 13;
                        }
                        r45.xn1 xn1Var7 = (r45.xn1) ch1Var.getCustom(i28);
                        if (xn1Var7 == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var7.getCustom(0)) == null) {
                            i29 = 13;
                            str4 = null;
                        } else {
                            str4 = finderContact4.getUsername();
                            i29 = 13;
                        }
                        r45.xn1 xn1Var8 = (r45.xn1) ch1Var.getCustom(i29);
                        km2.q qVar2 = new km2.q(string4, str3, str4, (xn1Var8 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var8.getCustom(0)) == null) ? null : finderContact3.getNickname(), lh1Var.getInteger(0), ch1Var.getString(7), null, false, ((mm2.c1) o4Var.business(mm2.c1.class)).l8(), null, null, 0, 0, false, null, false, lh1Var.getInteger(11), (r45.xn1) ch1Var.getCustom(13), false, null, null, 0, lh1Var.getInteger(1), 0L, null, null, j17, null, 0, 0L, null, null, null, -71500096, 1, null);
                        qVar2.v(b0Var);
                        list3.add(qVar2);
                        mm2.y2 y2Var = (mm2.y2) o4Var.business(mm2.y2.class);
                        r45.xn1 xn1Var9 = (r45.xn1) ch1Var.getCustom(13);
                        if (xn1Var9 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var9.getCustom(0)) == null || (str5 = finderContact2.getUsername()) == null) {
                            str5 = "";
                        }
                        java.util.Map map = y2Var.A;
                        if (map.containsKey(str5)) {
                            dk2.b8 b8Var = (dk2.b8) map.get(str5);
                            long j18 = b8Var != null ? b8Var.f233242a : 0L;
                            java.lang.Integer valueOf = b8Var != null ? java.lang.Integer.valueOf(b8Var.f233243b) : null;
                            cls = mm2.y2.class;
                            long c17 = c01.id.c() - j18;
                            if (j18 <= 0 || c01.id.c() <= j18) {
                                list = list3;
                                z17 = false;
                            } else {
                                list = list3;
                                z17 = true;
                            }
                            linkedList = linkedList2;
                            com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "isCanAutoAccept userName: " + str5 + " pos: " + valueOf + " curExpiredTime: " + j18 + " offestTime: " + c17 + " size: " + map.size());
                            z18 = z17 ^ true;
                        } else {
                            list = list3;
                            cls = mm2.y2.class;
                            linkedList = linkedList2;
                            z18 = false;
                        }
                        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                        if (dk2.ef.f233384g) {
                            r45.il4 il4Var = o4Var.U;
                            if ((pm0.v.z((int) (il4Var != null ? il4Var.f377129d : 0L), 16) || lh1Var.getBoolean(2) || z18) && !booleanValue) {
                                com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "autoAccept, sessionId:" + string + " mic_sdk_user_id: " + lh1Var.getString(10) + " isPayMic: " + booleanValue);
                                java.lang.Class cls2 = cls;
                                if (((mm2.y2) o4Var.business(cls2)).O6(false)) {
                                    java.util.Iterator it8 = list2.iterator();
                                    while (true) {
                                        if (!it8.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        java.lang.Object next2 = it8.next();
                                        if (kotlin.jvm.internal.o.b(((km2.q) next2).f309170a, lh1Var.getString(10))) {
                                            obj = next2;
                                            break;
                                        }
                                    }
                                    km2.q qVar3 = (km2.q) obj;
                                    if (qVar3 != null) {
                                        if (z18) {
                                            mm2.y2 y2Var2 = (mm2.y2) o4Var.business(cls2);
                                            r45.xn1 xn1Var10 = (r45.xn1) ch1Var.getCustom(13);
                                            dk2.b8 b8Var2 = (dk2.b8) y2Var2.A.get((xn1Var10 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var10.getCustom(0)) == null || (username = finderContact.getUsername()) == null) ? "" : username);
                                            if (b8Var2 != null) {
                                                qVar3.f309192w = b8Var2.f233243b;
                                            }
                                        }
                                        qVar3.z();
                                        o4Var.O7(qVar3);
                                        ((kotlinx.coroutines.flow.h3) o4Var.L).k(string);
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "autoAccept fail, over size");
                                }
                            }
                        }
                        if (!booleanValue) {
                            mm2.g4 g4Var = mm2.g4.f329088d;
                            r45.il4 il4Var2 = o4Var.U;
                            if (pm0.v.z((int) (il4Var2 != null ? il4Var2.f377129d : 0L), 2)) {
                                kz5.h0.B(list2, new mm2.d4(g4Var));
                                kz5.h0.B(list, new mm2.e4(g4Var));
                            } else {
                                java.util.List list4 = list;
                                r45.il4 il4Var3 = o4Var.U;
                                i18 = 1;
                                if (pm0.v.z((int) (il4Var3 != null ? il4Var3.f377129d : 0L), 1)) {
                                    kz5.h0.B(list2, new mm2.f4(g4Var));
                                    kz5.h0.B(list4, new mm2.y3(g4Var));
                                } else {
                                    r45.il4 il4Var4 = o4Var.U;
                                    if (pm0.v.z((int) (il4Var4 != null ? il4Var4.f377129d : 0L), 4)) {
                                        kz5.h0.B(list2, new mm2.z3(g4Var));
                                        kz5.h0.B(list4, new mm2.a4(g4Var));
                                    }
                                }
                                i17 = i18;
                                linkedList2 = linkedList;
                                it7 = it;
                            }
                        }
                        i18 = 1;
                        i17 = i18;
                        linkedList2 = linkedList;
                        it7 = it;
                    } else {
                        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "handleLinkMicMsg current apply has expired, applyExpiredTime: " + j17);
                    }
                }
            }
            it = it7;
            linkedList = linkedList2;
            i18 = i17;
            i17 = i18;
            linkedList2 = linkedList;
            it7 = it;
        }
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "handleLinkMicMsg applyMicMsgList:" + linkedList2);
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20003};
    }
}
