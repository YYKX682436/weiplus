package s01;

/* loaded from: classes11.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f401924a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f401925b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f401926c = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f401927d = new java.lang.Object();

    public static boolean a(s01.h hVar, java.lang.String str, java.lang.String str2, r45.j53 j53Var) {
        boolean z17;
        if (hVar != null && str != null && j53Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_brandUserName)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                if (jSONArray.length() != 1 || !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        r45.sj sjVar = new r45.sj();
                        sjVar.f385768d = str2;
                        linkedList.add(sjVar);
                    }
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        s01.a0 a0Var = new s01.a0();
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                        a0Var.field_userId = jSONObject.getString(dm.i4.COL_ID);
                        a0Var.field_userName = jSONObject.getString("nick_name");
                        a0Var.field_brandUserName = hVar.field_brandUserName;
                        a0Var.field_headImageUrl = jSONObject.getString("head_img_url");
                        a0Var.field_profileUrl = jSONObject.getString("profile_url");
                        a0Var.field_UserVersion = jSONObject.getInt("ver");
                        a0Var.field_addMemberUrl = hVar.field_addMemberUrl;
                        if (!r01.q3.Vi().J0(a0Var)) {
                            r01.q3.Vi().insert(a0Var);
                        }
                        r45.sj sjVar2 = new r45.sj();
                        sjVar2.f385768d = a0Var.field_userId;
                        linkedList.add(sjVar2);
                    }
                    j53Var.f377593e = linkedList;
                    hVar.field_bizChatLocalId = -1L;
                    return true;
                }
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                java.lang.String string = jSONObject2.getString(dm.i4.COL_ID);
                s01.a0 y07 = r01.q3.Vi().y0(string);
                if (y07 == null) {
                    y07 = new s01.a0();
                    z17 = true;
                } else {
                    z17 = false;
                }
                y07.field_userId = string;
                y07.field_userName = jSONObject2.getString("nick_name");
                y07.field_headImageUrl = jSONObject2.getString("head_img_url");
                y07.field_profileUrl = jSONObject2.getString("profile_url");
                y07.field_UserVersion = jSONObject2.getInt("ver");
                java.lang.String str3 = y07.field_brandUserName;
                if (str3 == null || str3.length() == 0) {
                    y07.field_brandUserName = hVar.field_brandUserName;
                    z17 = true;
                }
                java.lang.String str4 = y07.field_addMemberUrl;
                if (str4 == null || str4.length() == 0) {
                    y07.field_addMemberUrl = hVar.field_addMemberUrl;
                    z17 = true;
                }
                if (!r01.q3.Vi().J0(y07)) {
                    r01.q3.Vi().insert(y07);
                }
                if (z17) {
                    r01.q3.Ni().j(y07.field_userId, y07.field_brandUserName);
                }
                s01.h hVar2 = new s01.h();
                hVar2.field_bizChatServId = y07.field_userId;
                hVar2.field_brandUserName = y07.field_brandUserName;
                hVar2.field_chatName = y07.field_userName;
                hVar2.field_chatType = 1;
                s01.h m17 = m(hVar2);
                if (m17 == null) {
                    return false;
                }
                hVar.field_bizChatLocalId = m17.field_bizChatLocalId;
                hVar.field_chatName = y07.field_userName;
                return true;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizChatInfoStorageLogic", "parse memberJson Exception:%s", e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizChatInfoStorageLogic", e17, "", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public static void b(java.lang.String str, boolean z17, c01.da daVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        gm0.j1.e().j(new s01.o(str, z17, daVar));
    }

    public static java.lang.String c(java.lang.String str) {
        return "2" + com.tencent.mm.sdk.platformtools.t8.i1() + str + s01.q.f401920a.nextInt();
    }

    public static s01.a0 d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo brandUserName==null");
            return null;
        }
        s01.s z07 = r01.q3.Di().z0(str);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo bizChatMyUserInfo==null");
            return null;
        }
        s01.a0 y07 = r01.q3.Vi().y0(z07.field_userId);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo bizChatUserInfo==null");
        }
        return y07;
    }

    public static java.lang.String e(java.lang.String str) {
        s01.a0 y07 = r01.q3.Vi().y0(str);
        if (y07 != null) {
            return y07.field_headImageUrl;
        }
        return null;
    }

    public static java.lang.String f(java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "getFormatMsgSource msgSource==null");
            return null;
        }
        int indexOf = str.indexOf("<enterprise_info>") + 17;
        int indexOf2 = str.indexOf("</enterprise_info>");
        if (indexOf == -1 || indexOf2 == -1 || indexOf >= indexOf2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "getFormatMsgSource error start:%s,end:%s", java.lang.Integer.valueOf(indexOf), java.lang.Integer.valueOf(indexOf2));
            return null;
        }
        java.lang.String substring = str.substring(indexOf, indexOf2);
        return str.replace(substring, substring.replace("<", "&lt;").replace(">", "&gt;"));
    }

    public static long g(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "chatId == null");
            return -1L;
        }
        s01.h D0 = r01.q3.Ui().D0(str);
        if (D0 != null) {
            return D0.field_bizChatLocalId;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "bizChatInfo == null");
        return -1L;
    }

    public static int h(long j17) {
        java.util.List w07 = r01.q3.Ui().z0(j17).w0();
        if (w07 != null) {
            return w07.size();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "getMembersCountByBizChatId list == null");
        return 0;
    }

    public static java.lang.String i() {
        java.lang.String str;
        synchronized (f401927d) {
            str = f401924a;
        }
        return str;
    }

    public static java.lang.String j(s01.h hVar) {
        s01.a0 d17;
        java.lang.String str;
        java.lang.String format;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "getMsgSource bizChatInfo=%s");
            return null;
        }
        if (hVar.field_bizChatServId == null || (d17 = d(hVar.field_brandUserName)) == null || (str = d17.field_userId) == null) {
            return null;
        }
        f401925b = str;
        synchronized (f401927d) {
            java.lang.String str2 = d17.field_userId;
            format = java.lang.String.format("<msgsource><enterprise_info><qy_msg_type>%d</qy_msg_type><bizchat_id>%s</bizchat_id><bizchat_ver>%d</bizchat_ver><user_id>%s</user_id><climsgid>%s</climsgid></enterprise_info></msgsource>", 1, hVar.field_bizChatServId, java.lang.Integer.valueOf(hVar.field_chatVersion), str2, c(str2));
            f401924a = format;
        }
        return format;
    }

    public static java.lang.String k(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "tempUser";
        }
        return g83.a.b() + kk.k.g(str.getBytes()) + "/user/";
    }

    public static java.lang.String l(java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "getUserName bizChatId == null");
            return null;
        }
        s01.a0 y07 = r01.q3.Vi().y0(str);
        if (y07 != null) {
            return y07.field_userName;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatInfoStorageLogic", "getUserName userInfo == null");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r01.q3.Ui().J0(r4) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s01.h m(s01.h r4) {
        /*
            if (r4 == 0) goto L74
            java.lang.String r0 = r4.field_bizChatServId
            if (r0 != 0) goto L7
            goto L74
        L7:
            s01.m r0 = r01.q3.Ui()
            java.lang.String r1 = r4.field_bizChatServId
            s01.h r0 = r0.D0(r1)
            r1 = 1
            if (r0 == 0) goto L40
            int r2 = r4.field_chatVersion
            int r3 = r0.field_chatVersion
            if (r2 > r3) goto L22
            java.lang.String r2 = r0.field_brandUserName
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r2 == 0) goto L4d
        L22:
            java.lang.String r2 = r4.field_chatName
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r2 != 0) goto L2e
            java.lang.String r2 = r4.field_chatName
            r0.field_chatName = r2
        L2e:
            java.lang.String r2 = r4.field_brandUserName
            r0.field_brandUserName = r2
            r0.field_needToUpdate = r1
            int r4 = r4.field_chatType
            r0.field_chatType = r4
            s01.m r4 = r01.q3.Ui()
            r4.P0(r0)
            goto L4d
        L40:
            r4.field_needToUpdate = r1
            s01.m r1 = r01.q3.Ui()
            boolean r1 = r1.J0(r4)
            if (r1 == 0) goto L4d
            goto L4e
        L4d:
            r4 = r0
        L4e:
            boolean r0 = r4.z0()
            if (r0 == 0) goto L73
            boolean r0 = r4.y0()
            r1 = 5000(0x1388, float:7.006E-42)
            if (r0 == 0) goto L68
            s01.y r0 = r01.q3.Ni()
            java.lang.String r2 = r4.field_bizChatServId
            java.lang.String r3 = r4.field_brandUserName
            r0.f(r2, r3, r1)
            goto L73
        L68:
            s01.y r0 = r01.q3.Ni()
            java.lang.String r2 = r4.field_bizChatServId
            java.lang.String r3 = r4.field_brandUserName
            r0.g(r2, r3, r1)
        L73:
            return r4
        L74:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s01.r.m(s01.h):s01.h");
    }

    public static boolean n(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith("@qy_u") || str.endsWith("@qy_g");
    }

    public static boolean o(java.lang.String str) {
        if (str != null) {
            return str.endsWith("@qy_g");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatInfoStorageLogic", "isGroupChat chatId == null");
        return false;
    }

    public static boolean p(s01.h hVar) {
        if (hVar == null) {
            return false;
        }
        java.util.List w07 = hVar.w0();
        qk.m6 m6Var = (qk.m6) i95.n0.c(qk.m6.class);
        java.lang.String str = hVar.field_brandUserName;
        ((c01.d0) m6Var).getClass();
        java.lang.String z07 = r01.q3.Vi().z0(str);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseBizChatInfo", "bizchat myUserId is null");
            return false;
        }
        java.util.Iterator it = w07.iterator();
        while (it.hasNext()) {
            if (z07.equals((java.lang.String) it.next())) {
                return true;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseBizChatInfo", "bizchat not in chatroom myUserId is %s", z07);
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseBizChatInfo", "bizchat not in chatroom memberlist is %s", java.util.Arrays.toString(w07.toArray()));
        return false;
    }

    public static void q(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatInfoStorageLogic", "qy_chat_update %s, %s, %s", str, str2, str3);
        gm0.j1.e().j(new s01.p(str2, str3, str));
    }

    public static void r(s01.h hVar) {
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "bizChatInfo is null");
            return;
        }
        s01.g aj6 = r01.q3.aj();
        boolean f17 = aj6.f1(aj6.J0(hVar.field_bizChatLocalId));
        boolean t07 = hVar.t0(16);
        if (t07 && !f17) {
            r01.q3.aj().i1(hVar.field_bizChatLocalId);
        } else {
            if (t07 || !f17) {
                return;
            }
            r01.q3.aj().k1(hVar.field_bizChatLocalId);
        }
    }
}
