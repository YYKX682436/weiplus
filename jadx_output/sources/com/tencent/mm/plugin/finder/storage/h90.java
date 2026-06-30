package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class h90 {
    public h90(kotlin.jvm.internal.i iVar) {
    }

    public static /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem b(com.tencent.mm.plugin.finder.storage.h90 h90Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        return h90Var.a(finderObject, i17);
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem a(com.tencent.mm.protocal.protobuf.FinderObject feedObject, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = new com.tencent.mm.plugin.finder.storage.FinderItem();
        finderItem.setFromType(i17);
        finderItem.setFeedObject(feedObject);
        if (com.tencent.mm.sdk.platformtools.t8.K0(finderItem.getFeedObject().getNickname()) && finderItem.getFeedObject().getContact() != null) {
            com.tencent.mm.protocal.protobuf.FinderContact contact = finderItem.getFeedObject().getContact();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(contact != null ? contact.getNickname() : null)) {
                com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = finderItem.getFeedObject();
                com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderItem.getFeedObject().getContact();
                if (contact2 == null || (str = contact2.getNickname()) == null) {
                    str = "";
                }
                feedObject2.setNickname(str);
            }
        }
        return finderItem;
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem c(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.ar0 ar0Var, long j17) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = new com.tencent.mm.plugin.finder.storage.FinderItem();
        finderItem.setLocalId(j17);
        finderItem.setFeedObject(finderObject);
        if (ar0Var != null) {
            finderItem.field_localFlag = ar0Var.getInteger(0);
            finderItem.field_postinfo = (r45.qb4) ar0Var.getCustom(1);
            finderItem.field_mediaExtList = (r45.fc4) ar0Var.getCustom(2);
            finderItem.field_reportObject = (com.tencent.mm.protocal.protobuf.FinderFeedReportObject) ar0Var.getCustom(3);
            finderItem.field_postExtraData = (r45.qp2) ar0Var.getCustom(4);
            finderItem.field_customData = (r45.u01) ar0Var.getCustom(5);
            finderItem.field_longVideoMediaExtList = (r45.fc4) ar0Var.getCustom(6);
            finderItem.field_halfMediaExtList = (r45.fc4) ar0Var.getCustom(7);
            finderItem.field_clipList = (r45.za4) ar0Var.getCustom(8);
        }
        return finderItem;
    }

    public final r45.kr0 d(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        boolean z17;
        boolean z18;
        com.tencent.mm.protobuf.g byteString;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3899v2).getValue()).r()).intValue();
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3908w2).getValue()).r()).intValue();
        int intValue3 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3917x2).getValue()).r()).intValue();
        int intValue4 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3926y2).getValue()).r()).intValue();
        int intValue5 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R3).getValue()).r()).intValue();
        int intValue6 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3935z2).getValue()).r()).intValue();
        int intValue7 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.A2).getValue()).r()).intValue();
        int intValue8 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.B2).getValue()).r()).intValue();
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (!z18 || (intValue == 0 && intValue2 == 0 && intValue3 == 0 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0 && intValue7 == 0 && intValue8 == 0)) {
            r45.kr0 kr0Var = new r45.kr0();
            r45.dm2 object_extend = finderObject.getObject_extend();
            byte[] g17 = (object_extend == null || (byteString = object_extend.getByteString(17)) == null) ? null : byteString.g();
            if (g17 != null) {
                try {
                    kr0Var.parseFrom(g17);
                    return kr0Var;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            return null;
        }
        r45.kr0 kr0Var2 = new r45.kr0();
        if (intValue == 1) {
            kr0Var2.set(0, 1);
            r45.jg6 jg6Var = new r45.jg6();
            jg6Var.set(0, 2);
            jg6Var.set(1, java.lang.Boolean.TRUE);
            jg6Var.set(2, 5);
            jg6Var.set(3, 5);
            jg6Var.set(4, 10);
            i17 = 1;
            kr0Var2.set(1, jg6Var);
        } else if (intValue != 2) {
            if (intValue == 3) {
                kr0Var2.set(0, 3);
                r45.qg6 qg6Var = new r45.qg6();
                qg6Var.set(0, 5);
                qg6Var.set(1, 200);
                qg6Var.set(2, 10);
                kr0Var2.set(3, qg6Var);
            } else if (intValue == 5) {
                kr0Var2.set(0, 5);
                r45.bg6 bg6Var = new r45.bg6();
                bg6Var.set(0, 5);
                bg6Var.set(1, 5);
                kr0Var2.set(5, bg6Var);
            } else if (intValue != 17) {
                i17 = 1;
            } else {
                kr0Var2.set(0, 17);
                r45.lg6 lg6Var = new r45.lg6();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.xa0 xa0Var = new r45.xa0();
                xa0Var.set(0, 1);
                xa0Var.set(2, 3000);
                linkedList.add(xa0Var);
                r45.xa0 xa0Var2 = new r45.xa0();
                xa0Var2.set(0, 12);
                xa0Var2.set(2, 3000);
                linkedList.add(xa0Var2);
                r45.xa0 xa0Var3 = new r45.xa0();
                xa0Var3.set(0, 19);
                xa0Var3.set(2, 3000);
                linkedList.add(xa0Var3);
                r45.xa0 xa0Var4 = new r45.xa0();
                xa0Var4.set(0, 27);
                xa0Var4.set(2, 3000);
                linkedList.add(xa0Var4);
                r45.xa0 xa0Var5 = new r45.xa0();
                xa0Var5.set(0, 20);
                xa0Var5.set(2, 5000);
                linkedList.add(xa0Var5);
                lg6Var.set(0, linkedList);
                lg6Var.set(1, java.lang.Boolean.FALSE);
                kr0Var2.set(9, lg6Var);
                if (finderObject.getLiveInfo() != null) {
                    r45.nw1 liveInfo2 = finderObject.getLiveInfo();
                    if ((liveInfo2 != null ? (r45.iw1) liveInfo2.getCustom(81) : null) == null && (liveInfo = finderObject.getLiveInfo()) != null) {
                        r45.iw1 iw1Var = new r45.iw1();
                        iw1Var.set(0, "这是一段mock的高光总结内容，用于测试样式27的展示效果滴答滴答滴答滴答滴答滴答的的的的等待的的的的");
                        iw1Var.set(1, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)));
                        liveInfo.set(81, iw1Var);
                    }
                }
                java.util.LinkedList list = kr0Var2.getList(12);
                r45.kz3 kz3Var = new r45.kz3();
                kz3Var.set(0, 27);
                r45.wg6 wg6Var = new r45.wg6();
                wg6Var.set(0, java.lang.Boolean.TRUE);
                wg6Var.set(1, 0);
                kz3Var.set(18, wg6Var);
                list.add(kz3Var);
            }
            i17 = 1;
        } else {
            kr0Var2.set(0, 2);
            r45.bh6 bh6Var = new r45.bh6();
            bh6Var.set(0, 3);
            i17 = 1;
            bh6Var.set(1, 5);
            kr0Var2.set(2, bh6Var);
        }
        if (intValue2 == i17) {
            java.util.LinkedList list2 = kr0Var2.getList(12);
            r45.kz3 kz3Var2 = new r45.kz3();
            kz3Var2.set(0, 6);
            r45.mg6 mg6Var = new r45.mg6();
            mg6Var.set(0, java.lang.Boolean.TRUE);
            i18 = 1;
            kz3Var2.set(1, mg6Var);
            list2.add(kz3Var2);
        } else {
            i18 = i17;
        }
        if (intValue3 == i18) {
            java.util.LinkedList list3 = kr0Var2.getList(12);
            r45.kz3 kz3Var3 = new r45.kz3();
            kz3Var3.set(0, 7);
            r45.kg6 kg6Var = new r45.kg6();
            kg6Var.set(0, 5);
            kg6Var.set(2, java.lang.Boolean.TRUE);
            i19 = 1;
            kg6Var.set(1, 2);
            kz3Var3.set(2, kg6Var);
            list3.add(kz3Var3);
        } else {
            i19 = i18;
        }
        if (intValue4 == i19) {
            java.util.LinkedList list4 = kr0Var2.getList(12);
            r45.kz3 kz3Var4 = new r45.kz3();
            kz3Var4.set(0, 8);
            r45.xf6 xf6Var = new r45.xf6();
            xf6Var.set(0, new java.util.LinkedList(kz5.c0.i(1, 2)));
            kz3Var4.set(3, xf6Var);
            list4.add(kz3Var4);
            i27 = 1;
        } else {
            i27 = i19;
        }
        if (intValue5 == i27) {
            java.util.LinkedList list5 = kr0Var2.getList(12);
            r45.kz3 kz3Var5 = new r45.kz3();
            kz3Var5.set(0, 9);
            r45.hg6 hg6Var = new r45.hg6();
            hg6Var.set(0, 5);
            hg6Var.set(1, 2);
            hg6Var.set(2, 3600L);
            kz3Var5.set(4, hg6Var);
            list5.add(kz3Var5);
            i27 = 1;
        }
        if (intValue6 == i27) {
            java.util.LinkedList list6 = kr0Var2.getList(12);
            r45.kz3 kz3Var6 = new r45.kz3();
            kz3Var6.set(0, 16);
            r45.ng6 ng6Var = new r45.ng6();
            ng6Var.set(0, 5);
            i28 = 1;
            ng6Var.set(1, 1);
            ng6Var.set(2, 1);
            kz3Var6.set(8, ng6Var);
            list6.add(kz3Var6);
        } else {
            i28 = i27;
        }
        if (intValue7 == i28) {
            java.util.LinkedList list7 = kr0Var2.getList(12);
            r45.kz3 kz3Var7 = new r45.kz3();
            kz3Var7.set(0, 18);
            r45.yf6 yf6Var = new r45.yf6();
            yf6Var.set(0, 5);
            kz3Var7.set(9, yf6Var);
            list7.add(kz3Var7);
            i29 = 1;
        } else {
            i29 = i28;
        }
        if (intValue8 == i29) {
            java.util.LinkedList list8 = kr0Var2.getList(12);
            r45.kz3 kz3Var8 = new r45.kz3();
            kz3Var8.set(0, 20);
            r45.sg6 sg6Var = new r45.sg6();
            sg6Var.set(0, 2);
            sg6Var.set(1, java.lang.Boolean.TRUE);
            kz3Var8.set(11, sg6Var);
            list8.add(kz3Var8);
        }
        return kr0Var2;
    }

    public final boolean e(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        r45.zz3 zz3Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        r45.dm2 object_extend = finderObject.getObject_extend();
        if (object_extend == null || (zz3Var = (r45.zz3) object_extend.getCustom(41)) == null || (string = zz3Var.getString(4)) == null) {
            return false;
        }
        return string.length() > 0;
    }

    public final boolean f(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        boolean A;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.G2).getValue()).r()).intValue() == 1) {
            A = true;
        } else {
            r45.kr0 d17 = d(finderObject);
            A = pm0.v.A(d17 != null ? d17.getLong(11) : 0L, 1L);
        }
        r45.kr0 d18 = d(finderObject);
        boolean z17 = (d18 == null || (list = d18.getList(12)) == null || !(list.isEmpty() ^ true)) ? false : true;
        r45.kr0 d19 = d(finderObject);
        return (d19 != null ? d19.getInteger(0) : 0) > 0 || !A || z17;
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem g(r45.ec1 ec1Var, long j17) {
        kotlin.jvm.internal.o.g(ec1Var, "<this>");
        if (((com.tencent.mm.protocal.protobuf.FinderObject) ec1Var.getCustom(0)) == null) {
            return new com.tencent.mm.plugin.finder.storage.FinderItem();
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ec1Var.getCustom(0);
        if (finderObject == null) {
            finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        }
        return c(finderObject, (r45.ar0) ec1Var.getCustom(1), j17);
    }

    public final r45.ec1 h(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        kotlin.jvm.internal.o.g(finderItem, "<this>");
        r45.ec1 ec1Var = new r45.ec1();
        ec1Var.set(0, finderItem.getFeedObject());
        r45.ar0 ar0Var = new r45.ar0();
        ar0Var.set(0, java.lang.Integer.valueOf(finderItem.field_localFlag));
        ar0Var.set(1, finderItem.field_postinfo);
        ar0Var.set(2, finderItem.field_mediaExtList);
        ar0Var.set(3, finderItem.field_reportObject);
        ar0Var.set(4, finderItem.field_postExtraData);
        ar0Var.set(5, finderItem.field_customData);
        ar0Var.set(6, finderItem.field_longVideoMediaExtList);
        ar0Var.set(7, finderItem.field_halfMediaExtList);
        ar0Var.set(8, finderItem.field_clipList);
        ec1Var.set(1, ar0Var);
        return ec1Var;
    }
}
