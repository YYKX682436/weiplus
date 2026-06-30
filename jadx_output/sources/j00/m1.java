package j00;

/* loaded from: classes9.dex */
public final class m1 implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map values, com.tencent.mm.modelbase.p0 p0Var) {
        int D1;
        boolean insert;
        kotlin.jvm.internal.o.g(values, "values");
        if (kotlin.jvm.internal.o.b(str, "mmec_gift_msg")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "consumeNewXml, subType: " + str);
            java.lang.String str2 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.subtype");
            boolean z17 = true;
            if (str2 == null || str2.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "giftXmlSubType is null");
                D1 = 0;
            } else {
                D1 = com.tencent.mm.sdk.platformtools.t8.D1(str2, 0);
            }
            if (D1 == 1) {
                java.lang.String str3 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.gift_msgid");
                if (str3 == null || str3.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, giftMsgId is empty");
                    return null;
                }
                java.lang.String str4 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.gift_msg_xml");
                if (str4 == null || str4.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, msgXml is empty");
                    return null;
                }
                byte[] decode = android.util.Base64.decode(str4, 0);
                kotlin.jvm.internal.o.d(decode);
                java.lang.String str5 = new java.lang.String(decode, r26.c.f368865a);
                n00.e y07 = n00.d.f333815a.a().y0(str3);
                long j17 = y07.field_msgLocalId;
                java.lang.String str6 = y07.field_talkerUserName;
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, giftMsgId:" + str3 + ", msgId:" + j17 + ", talker:" + str6);
                pt0.e0 e0Var = pt0.f0.f358209b1;
                com.tencent.mm.storage.f9 k17 = e0Var.k(str6, j17);
                if (k17 != null) {
                    com.tencent.mm.storage.f9 k18 = e0Var.k(str6, j17);
                    java.lang.String hj6 = ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).hj(k17, str5);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, newMsgXml:".concat(hj6));
                    k17.d1(hj6);
                    c00.e3 e3Var = (c00.e3) i95.n0.c(c00.e3.class);
                    kotlin.jvm.internal.o.d(k18);
                    if (!((j00.k1) e3Var).Ni(k18, k17)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, do not update msg");
                        return null;
                    }
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, k17, true);
                    if (((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).aj()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, check red digest start");
                        c00.e3 e3Var2 = (c00.e3) i95.n0.c(c00.e3.class);
                        kotlin.jvm.internal.o.d(str6);
                        j00.k1 k1Var = (j00.k1) e3Var2;
                        k1Var.getClass();
                        if (k1Var.Ri(str6)) {
                            l15.c cVar = new l15.c();
                            java.lang.String j18 = k17.j();
                            if (j18 == null) {
                                j18 = "";
                            }
                            cVar.fromXml(j18);
                            v05.b k19 = cVar.k();
                            w05.d dVar = k19 != null ? (w05.d) k19.getCustom(k19.f432315e + 66) : null;
                            if (dVar == null) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, ecsGiftAppMsgInfo is null");
                            } else if (dVar.s().size() <= 0) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, gift msg list is empty");
                            } else {
                                java.lang.Object obj = dVar.s().get(0);
                                kotlin.jvm.internal.o.f(obj, "get(...)");
                                w05.e eVar = (w05.e) obj;
                                if (eVar.l() == 2 || eVar.l() == 4) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, gift invalid, start check digest");
                                    if (dVar.B() != 2 || k1Var.nj(dVar.z())) {
                                        w20.f y08 = ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi().y0(str6);
                                        long j19 = y08 != null ? y08.field_lastHandleEcsGiftTimeStampMs : 0L;
                                        long createTime = k17.getCreateTime();
                                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, orderId:" + dVar.t() + ", last handle:" + j19 + ", msg create time:" + createTime);
                                        if (j19 > createTime) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, this msg has been read, invalid do nothing");
                                        } else {
                                            int i17 = y08 != null ? y08.field_ecsUnhandledGiftCount : 0;
                                            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, talker:" + str6 + ", unhandledCnt:" + i17 + ", ret:" + (i17 <= 0 ? ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi().D0(str6, 0) : ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi().D0(str6, i17 - 1)));
                                            if (i17 <= 1) {
                                                com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str6);
                                                p17.e2(4096);
                                                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, update conv ret:" + ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, str6, true, true));
                                            }
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, is exclusive gift but not exclusive receiver");
                                    }
                                }
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, not handle conv");
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, get msg null");
                }
            } else if (D1 == 2) {
                java.lang.String str7 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.to_username");
                if (str7 == null || str7.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeBackupMsg, to username is empty");
                    return null;
                }
                java.lang.String str8 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.gift_msg_xml");
                if (str8 != null && str8.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeBackupMsg, msgXml is empty");
                    return null;
                }
                byte[] decode2 = android.util.Base64.decode(str8, 0);
                kotlin.jvm.internal.o.d(decode2);
                java.lang.String str9 = new java.lang.String(decode2, r26.c.f368865a);
                java.lang.String str10 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.msgsvrid");
                java.lang.Long valueOf = str10 != null ? java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.b8.c(str10)) : null;
                if (valueOf != null && valueOf.longValue() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeBackupMsg, msg svr id is empty");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeBackupMsg, msgXml: " + str9 + ", toUserName: " + str7);
                j00.k1 k1Var2 = (j00.k1) ((c00.e3) i95.n0.c(c00.e3.class));
                k1Var2.getClass();
                ((ku5.t0) ku5.t0.f312615d).h(new j00.e1(k1Var2, str9, str7, false, valueOf), "MicroMsg.EcsGiftMsgService");
            } else if (D1 == 3) {
                if (!((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).aj()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeLotteryDraw, toggle close, not show red digest");
                    return null;
                }
                java.lang.String talker = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.to_username");
                if (talker == null || talker.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeLotteryDraw, to username is empty");
                    return null;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeLotteryDraw, check digest, talker is " + talker);
                j00.k1 k1Var3 = (j00.k1) ((c00.e3) i95.n0.c(c00.e3.class));
                k1Var3.getClass();
                kotlin.jvm.internal.o.g(talker, "talker");
                if (k1Var3.Ri(talker)) {
                    w20.g wi6 = ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi();
                    wi6.getClass();
                    if (wi6.J0(talker)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsConversationRecordStorage", "insertOrUpdateEcsGiftRedLabelType, talker:" + talker + ", red label type:2");
                        insert = wi6.execSQL("EcsConversationRecord", "UPDATE EcsConversationRecord SET ecsGiftRedLabelType=2 WHERE talker='" + talker + '\'');
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsConversationRecordStorage", "updateEcsRedLabelType, talker:" + talker + ", unhandled count:2, ret:" + insert);
                    } else {
                        w20.f fVar = new w20.f();
                        fVar.field_talker = talker;
                        fVar.field_ecsUnhandledGiftCount = 0;
                        fVar.field_ecsGiftRedLabelType = 2;
                        insert = wi6.insert(fVar);
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsConversationRecordStorage", "insertOrUpdateEcsGiftRedLabelType, insert new, talker:" + talker + ", red label type:2");
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "markEcsGiftRedLabelLotteryDraw, talker:" + talker + ", ret:" + insert);
                    com.tencent.mm.storage.l4 p18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(talker);
                    kotlin.jvm.internal.o.f(p18, "get(...)");
                    p18.j1(p18.u0() | 4096);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "markEcsGiftRedLabelLotteryDraw, update conv ret:" + ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p18, talker, true, true));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "markEcsGiftRedLabelLotteryDraw, not handle conv");
                }
            }
        }
        return null;
    }
}
