package cu2;

/* loaded from: classes10.dex */
public final class a0 {
    public a0(kotlin.jvm.internal.i iVar) {
    }

    public static /* synthetic */ java.util.List c(cu2.a0 a0Var, long j17, int i17, int[] iArr, int i18, java.lang.String str, int i19, int i27, java.lang.Object obj) {
        return a0Var.b(j17, i17, (i27 & 4) != 0 ? new int[0] : iArr, i18, str, (i27 & 32) != 0 ? 0 : i19);
    }

    public final boolean a(dm.pd mention, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(mention, "mention");
        l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(g(i17));
        if (g(i17) == 1) {
            int i18 = dm.x4.f241026a3;
            str = "WxIdentityMsg";
        } else {
            int i19 = dm.x4.f241026a3;
            str = "FinderIdentityMsg";
        }
        java.lang.String str2 = "DELETE FROM " + str + " WHERE id=" + mention.field_id;
        boolean execSQL = fk6.execSQL(str, str2);
        com.tencent.mars.xlog.Log.i("Finder.FinderMentionLogic", "updateMentionExtFlag sql:" + str2 + ", flag:" + mention.field_extFlag + " succ:" + execSQL);
        return execSQL;
    }

    public final java.util.List b(long j17, int i17, int[] iArr, int i18, java.lang.String finderUsername, int i19) {
        java.lang.String str;
        java.lang.String str2;
        java.util.LinkedList linkedList;
        int[] types = iArr;
        kotlin.jvm.internal.o.g(types, "types");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        m92.b j37 = g92.a.j3(g92.b.f269769e, finderUsername, false, 2, null);
        int integer = j37 != null ? j37.u0().getInteger(34) : 0;
        l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(g(i18));
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC, 0);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) t70Var.f2().r()).intValue() != -1) {
            integer = ((java.lang.Number) t70Var.f2().r()).intValue();
        }
        if (integer == 1 || i19 == 1) {
            str = " AND businessType = " + i19;
        } else {
            str = "";
        }
        if (types.length == 0) {
            str2 = e(i18) + " WHERE " + f(i18, finderUsername) + "id < " + j17 + "  AND flag = 0  AND userVersion = " + r17 + str + " ORDER BY createTime DESC,id DESC LIMIT " + i17;
        } else {
            int length = types.length;
            java.lang.String str3 = "(";
            int i27 = 0;
            int i28 = 0;
            while (i27 < length) {
                int i29 = types[i27];
                int i37 = i28 + 1;
                if (i28 > 0) {
                    str3 = str3 + ',';
                }
                str3 = str3 + i29;
                i27++;
                types = iArr;
                i28 = i37;
            }
            str2 = e(i18) + " WHERE " + f(i18, finderUsername) + " id < " + j17 + "  AND flag = 0  AND type IN " + (str3 + ')') + " AND userVersion = " + r17 + str + " ORDER BY createTime DESC,id DESC LIMIT " + i17;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderMentionLogic", "get mention sql " + str2);
        android.database.Cursor rawQuery = fk6.rawQuery(str2, new java.lang.String[0]);
        try {
            if (rawQuery != null) {
                linkedList = new java.util.LinkedList();
                while (rawQuery.moveToNext()) {
                    try {
                        l75.f0 f0Var = (l75.f0) dm.pd.class.newInstance();
                        f0Var.convertFrom(rawQuery);
                        linkedList.add(f0Var);
                    } finally {
                    }
                }
                vz5.b.a(rawQuery, null);
            } else {
                linkedList = new java.util.LinkedList();
            }
            vz5.b.a(rawQuery, null);
            return linkedList;
        } finally {
        }
    }

    public final dm.pd d(long j17, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("Finder.FinderMentionLogic", "getMention by id " + j17 + " mentionCreateTime " + i17);
        android.database.Cursor rawQuery = ((c61.l7) i95.n0.c(c61.l7.class)).fk(g(i18)).rawQuery(e(i18) + " WHERE id = " + j17 + " AND createTime = " + i17, new java.lang.String[0]);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToNext()) {
                    dm.pd pdVar = new dm.pd();
                    pdVar.convertFrom(rawQuery);
                    vz5.b.a(rawQuery, null);
                    return pdVar;
                }
                vz5.b.a(rawQuery, null);
            } finally {
            }
        }
        return null;
    }

    public final java.lang.String e(int i17) {
        java.lang.String str;
        if (g(i17) == 1) {
            int i18 = dm.x4.f241026a3;
            str = "WxIdentityMsg";
        } else {
            int i19 = dm.x4.f241026a3;
            str = "FinderIdentityMsg";
        }
        return "SELECT rowid, * FROM ".concat(str);
    }

    public final java.lang.String f(int i17, java.lang.String str) {
        if (i17 != 1) {
            return " ";
        }
        if (!kotlin.jvm.internal.o.b(str, g92.b.f269769e.T0()) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return " finderUserName='" + str + "' AND ";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return " ";
        }
        return " (finderUserName='" + str + "' OR finderUserName IS NULL OR finderUserName='') AND ";
    }

    public final int g(int i17) {
        if (i17 != 1) {
            return i17 != 2 ? 0 : 1;
        }
        return 2;
    }

    public final int h(java.util.List mentionList, int i17) {
        kotlin.jvm.internal.o.g(mentionList, "mentionList");
        java.util.Iterator it = mentionList.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            dm.pd mention = (dm.pd) it.next();
            cu2.a0 a0Var = cu2.b0.f222371a;
            kotlin.jvm.internal.o.g(mention, "mention");
            l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(a0Var.g(i17));
            dm.pd d17 = a0Var.d(mention.field_id, mention.field_createTime, i17);
            if (d17 != null) {
                fk6.delete(d17.systemRowid);
                com.tencent.mars.xlog.Log.i("Finder.FinderMentionLogic", "insertMention: delete exist data, id=" + mention.field_id + ", createTime=" + mention.field_createTime);
            }
            boolean insert = fk6.insert(mention);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replace mention success ");
            sb6.append(mention.field_id);
            sb6.append(", ");
            sb6.append(d17 == null ? "null" : java.lang.Long.valueOf(d17.systemRowid));
            sb6.append(", ");
            sb6.append(insert);
            com.tencent.mars.xlog.Log.i("Finder.FinderMentionLogic", sb6.toString());
            if (insert) {
                i18++;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderMentionLogic", "insert mention insertSucc=" + i18 + ", size=" + mentionList.size() + ", scene=" + i17);
        return i18;
    }

    public final void i(java.lang.String clientMsgId, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(clientMsgId, "clientMsgId");
        l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(g(i17));
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC, 0);
        if (g(i17) == 1) {
            int i18 = dm.x4.f241026a3;
            str = "WxIdentityMsg";
        } else {
            int i19 = dm.x4.f241026a3;
            str = "FinderIdentityMsg";
        }
        java.lang.String str2 = "DELETE FROM " + str + "  WHERE type=10  AND clientMsgId='" + clientMsgId + "'  AND userVersion=" + r17 + ' ';
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT * FROM ");
        sb6.append(str);
        sb6.append("  WHERE type=10  AND clientMsgId='");
        sb6.append(clientMsgId);
        sb6.append("'  AND userVersion=");
        sb6.append(r17);
        sb6.append(' ');
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.i("Finder.FinderMentionLogic", "removePrivateMention, succ " + fk6.execSQL(str, str2) + ",  sql " + str2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0048. Please report as an issue. */
    public final so2.i j(dm.pd mention) {
        so2.i r3Var;
        kotlin.jvm.internal.o.g(mention, "mention");
        int i17 = mention.field_type;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 == 4) {
                        r3Var = new so2.c4(mention);
                    } else if (i17 == 5) {
                        r3Var = new so2.a4(mention);
                    } else if (i17 == 7) {
                        r3Var = new so2.w3(mention);
                    } else if (i17 == 8) {
                        r3Var = new so2.v3(mention);
                    } else if (i17 == 10) {
                        r3Var = new so2.s3(mention);
                    } else if (i17 == 11) {
                        r3Var = new so2.t3(mention);
                    } else if (i17 == 15) {
                        r3Var = new so2.p3(mention);
                    } else if (i17 == 25) {
                        r3Var = new so2.z3(mention);
                    } else if (i17 == 33) {
                        r3Var = new so2.x3(mention);
                    } else if (i17 != 43) {
                        if (i17 != 17) {
                            if (i17 != 18) {
                                if (i17 != 35 && i17 != 36) {
                                    switch (i17) {
                                        case 28:
                                            r3Var = new so2.f4(mention);
                                            break;
                                        case 29:
                                            r3Var = new so2.e4(mention);
                                            break;
                                        case 30:
                                            r3Var = new so2.g4(mention);
                                            break;
                                        default:
                                            switch (i17) {
                                                case 39:
                                                case 40:
                                                    r3Var = new so2.n3(mention);
                                                    break;
                                                case 41:
                                                    break;
                                                default:
                                                    return null;
                                            }
                                    }
                                }
                            }
                            r3Var = new so2.q3(mention);
                        } else {
                            r3Var = new so2.u3(mention);
                        }
                    }
                }
                r3Var = new so2.o3(mention);
            }
            r3Var = new so2.y3(mention);
        } else {
            r3Var = new so2.r3(mention);
        }
        return r3Var;
    }

    public final dm.pd k(int i17, r45.pg2 mention, java.lang.String finderUsername) {
        kotlin.jvm.internal.o.g(mention, "mention");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        dm.pd pdVar = new dm.pd();
        pdVar.field_headUrl = mention.getString(0);
        if (mention.getInteger(23) != 0) {
            r45.rg2 rg2Var = new r45.rg2();
            rg2Var.set(1, java.lang.Integer.valueOf(mention.getInteger(23)));
            rg2Var.set(0, mention.getList(22));
            pdVar.field_aggregatedContacts = rg2Var;
        } else {
            pdVar.field_aggregatedContacts = new r45.rg2();
        }
        if (i17 != 1) {
            finderUsername = "";
        }
        pdVar.field_finderUserName = finderUsername;
        pdVar.field_nickname = mention.getString(1);
        pdVar.field_type = mention.getInteger(2);
        pdVar.field_content = mention.getString(3);
        pdVar.field_createTime = mention.getInteger(4);
        pdVar.field_thumbUrl = mention.getString(5);
        pdVar.field_id = mention.getLong(6);
        pdVar.field_objectId = mention.getLong(7);
        pdVar.field_objectNonceId = mention.getString(17);
        pdVar.field_commentId = mention.getLong(8);
        pdVar.field_flag = mention.getInteger(9);
        pdVar.field_refContent = mention.getString(11);
        pdVar.field_extFlag = mention.getInteger(10);
        pdVar.field_notify = (r45.rk2) mention.getCustom(12);
        pdVar.field_mediaType = mention.getInteger(13);
        pdVar.field_description = mention.getString(14);
        pdVar.field_replayUsername = mention.getString(16);
        pdVar.field_replayNickname = mention.getString(15);
        pdVar.field_username = mention.getString(18);
        r45.tg2 tg2Var = (r45.tg2) mention.getCustom(19);
        pdVar.field_contact = tg2Var != null ? (com.tencent.mm.protocal.protobuf.FinderContact) tg2Var.getCustom(0) : null;
        r45.tg2 tg2Var2 = (r45.tg2) mention.getCustom(20);
        pdVar.field_replyContact = tg2Var2 != null ? (com.tencent.mm.protocal.protobuf.FinderContact) tg2Var2.getCustom(0) : null;
        pdVar.field_userVersion = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC, 0);
        pdVar.field_followExpireTime = mention.getInteger(24);
        pdVar.field_clientMsgId = mention.getString(25);
        pdVar.field_followId = mention.getLong(26);
        pdVar.field_objectType = mention.getInteger(27);
        pdVar.field_refVideoObjectId = mention.getLong(28);
        pdVar.field_refVideoObjectNonceId = mention.getString(29);
        r45.t64 t64Var = (r45.t64) mention.getCustom(30);
        pdVar.field_likeId = t64Var != null ? t64Var.getLong(1) : 0L;
        r45.tg2 tg2Var3 = (r45.tg2) mention.getCustom(19);
        pdVar.field_fansId = tg2Var3 != null ? tg2Var3.getLong(2) : 0L;
        pdVar.field_authorContact = (com.tencent.mm.protocal.protobuf.FinderContact) mention.getCustom(31);
        r45.t64 t64Var2 = (r45.t64) mention.getCustom(30);
        pdVar.field_likeType = t64Var2 != null ? t64Var2.getInteger(0) : 0;
        pdVar.field_commentMentionedUser = (r45.oy0) mention.getCustom(32);
        r45.tg2 tg2Var4 = (r45.tg2) mention.getCustom(19);
        pdVar.field_relationType = tg2Var4 != null ? tg2Var4.getInteger(3) : 0;
        pdVar.field_extInfo = (r45.vg2) mention.getCustom(33);
        pdVar.field_svrMentionId = mention.getLong(34);
        pdVar.field_followFlag = mention.getInteger(35);
        pdVar.field_likeInfo = (r45.t64) mention.getCustom(30);
        pdVar.field_thankInfo = (r45.xg2) mention.getCustom(38);
        pdVar.field_businessType = mention.getInteger(39);
        pdVar.field_finderIdentity = (r45.ub1) mention.getCustom(40);
        pdVar.field_sourceType = mention.getInteger(44);
        pdVar.field_mentionSubtype = mention.getInteger(46);
        pdVar.field_followReason = (r45.r31) mention.getCustom(41);
        pdVar.field_orderCount = mention.getInteger(47);
        pdVar.field_interactionCount = mention.getInteger(48);
        pdVar.field_memberProviderFinderusername = mention.getString(49);
        pdVar.field_forceUseContent = mention.getInteger(50);
        pdVar.field_svrReportInfo = mention.getString(51);
        pdVar.field_rootCommentId = mention.getLong(45);
        pdVar.field_thankIconType = mention.getInteger(52);
        pdVar.field_help_promotion_info = (r45.fb1) mention.getCustom(54);
        pdVar.field_svrMention = mention;
        pdVar.field_isSilentMention = mention.getInteger(56);
        java.lang.String string = mention.getString(57);
        if (string == null) {
            string = "";
        }
        pdVar.field_silentMentionEntityId = string;
        java.lang.String string2 = mention.getString(58);
        pdVar.field_aggregateTitle = string2 != null ? string2 : "";
        pdVar.field_commentContentType = mention.getInteger(59);
        pdVar.field_commentContentInfo = (r45.e60) mention.getCustom(60);
        pdVar.field_jumpType = mention.getInteger(61);
        pdVar.field_jumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) mention.getCustom(62);
        pdVar.field_reply_comment_id = mention.getLong(63);
        return pdVar;
    }

    public final boolean l(dm.pd mention, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(mention, "mention");
        l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(g(i17));
        if (g(i17) == 1) {
            int i18 = dm.x4.f241026a3;
            str = "WxIdentityMsg";
        } else {
            int i19 = dm.x4.f241026a3;
            str = "FinderIdentityMsg";
        }
        java.lang.String str2 = "UPDATE " + str + " SET extFlag=" + mention.field_extFlag + " WHERE id=" + mention.field_id;
        boolean execSQL = fk6.execSQL(str, str2);
        com.tencent.mars.xlog.Log.i("Finder.FinderMentionLogic", "updateMentionExtFlag sql:" + str2 + ", success:" + execSQL + " flag:" + mention.field_extFlag);
        return execSQL;
    }
}
