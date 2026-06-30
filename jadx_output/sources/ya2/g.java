package ya2;

/* loaded from: classes10.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public static boolean h(ya2.g gVar, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        r45.xk b17;
        java.lang.String str3 = null;
        if ((i17 & 2) != 0) {
            str2 = null;
        }
        boolean z19 = false;
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        ya2.b2 b18 = gVar.b(str);
        boolean z27 = (str == null || b18 == null || b18.field_follow_Flag != ya2.b2.Q2) ? false : true;
        if (z17) {
            return z27;
        }
        if (str2 != null) {
            str3 = str2;
        } else if (b18 != null && (b17 = ya2.d.b(b18, z18)) != null) {
            str3 = b17.getString(0);
        }
        if (str3 == null) {
            return z27;
        }
        if (c01.e2.G(str3) && c01.e2.J(str3)) {
            z19 = true;
        }
        return z19;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean m(ya2.g gVar, com.tencent.mm.protocal.protobuf.FinderContact finderContact, boolean z17, int i17, java.lang.Object obj) {
        java.lang.String headUrl;
        java.lang.String nickname;
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        gVar.getClass();
        if (finderContact != null) {
            java.lang.String username = finderContact.getUsername();
            if ((username == null || username.length() == 0) != true) {
                java.lang.String username2 = finderContact.getUsername();
                if (username2 == null) {
                    username2 = "";
                }
                ya2.b2 b17 = gVar.b(username2);
                if (b17 == null) {
                    b17 = new ya2.b2();
                }
                r45.xk a17 = ya2.d.a(finderContact, false);
                java.lang.String username3 = finderContact.getUsername();
                if (username3 == null) {
                    username3 = "";
                }
                b17.field_username = username3;
                if ((a17 == null || (headUrl = a17.getString(2)) == null) && (headUrl = finderContact.getHeadUrl()) == null) {
                    headUrl = "";
                }
                b17.field_avatarUrl = headUrl;
                b17.field_nickname = ((a17 == null || (nickname = a17.getString(1)) == null) && (nickname = finderContact.getNickname()) == null) ? "" : nickname;
                com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = b17.field_authInfo;
                jz5.f0 f0Var = null;
                if (finderAuthInfo != null) {
                    if (finderContact.getAuthInfo() != null) {
                        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo = finderContact.getAuthInfo();
                        finderAuthInfo.setAppName(authInfo != null ? authInfo.getAppName() : null);
                        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo2 = finderContact.getAuthInfo();
                        finderAuthInfo.setAuthProfession(authInfo2 != null ? authInfo2.getAuthProfession() : null);
                        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo3 = finderContact.getAuthInfo();
                        finderAuthInfo.setAuthIconType(authInfo3 != null ? authInfo3.getAuthIconType() : 0);
                        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo4 = finderContact.getAuthInfo();
                        finderAuthInfo.setDetailLink(authInfo4 != null ? authInfo4.getDetailLink() : null);
                        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo5 = finderContact.getAuthInfo();
                        finderAuthInfo.setRealName(authInfo5 != null ? authInfo5.getRealName() : null);
                        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo6 = finderContact.getAuthInfo();
                        finderAuthInfo.setAuthIconUrl(authInfo6 != null ? authInfo6.getAuthIconUrl() : null);
                    }
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    b17.field_authInfo = finderContact.getAuthInfo();
                }
                b17.field_extInfo = finderContact.getExtInfo();
                r45.aw0 aw0Var = new r45.aw0();
                aw0Var.set(0, finderContact.getBind_info());
                b17.field_bindInfoList = aw0Var;
                ya2.g gVar2 = ya2.h.f460484a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replaceMinContact result %s onlyMemory ");
                sb6.append(z17);
                sb6.append(", ");
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mars.xlog.Log.i("Finder.FinderContactLogic", sb6.toString(), b17.L0());
                gVar.n(b17);
                if (z17) {
                    return true;
                }
                gVar.l(b17);
                return true;
            }
            ya2.g gVar3 = ya2.h.f460484a;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("error FinderContact username is null ");
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb7.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.e("Finder.FinderContactLogic", sb7.toString());
        }
        return false;
    }

    public final ya2.c a() {
        return (ya2.c) ((jz5.n) ya2.h.f460485b).getValue();
    }

    public final ya2.b2 b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        g92.b bVar = g92.b.f269769e;
        if (kotlin.jvm.internal.o.b(str, bVar.U())) {
            return e();
        }
        if (kotlin.jvm.internal.o.b(str, c01.z1.k())) {
            return f();
        }
        ya2.b2 a17 = a().a(str);
        boolean z17 = false;
        if (a17 != null) {
            java.lang.String str2 = a17.field_username;
            if (!(str2 == null || str2.length() == 0) && !kotlin.jvm.internal.o.b(str, bVar.U())) {
                z17 = true;
            }
        }
        if (z17) {
            return a().a(str);
        }
        ya2.b2 c17 = c(str);
        if (c17 != null) {
            n(c17);
        }
        return a().a(str);
    }

    public final ya2.b2 c(java.lang.String str) {
        ya2.b2 Ui = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ui(str);
        ya2.g gVar = ya2.h.f460484a;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = Ui != null ? Ui.J0() : null;
        com.tencent.mars.xlog.Log.i("Finder.FinderContactLogic", "get contact %s %s", objArr);
        return Ui;
    }

    public final boolean d(java.lang.String entrance) {
        boolean z17;
        kotlin.jvm.internal.o.g(entrance, "entrance");
        boolean z18 = pm0.v.z((int) e().field_liveSwitchFlag, 32);
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_live_task_sub_switch, "", true);
        kotlin.jvm.internal.o.d(Zi);
        if (!(Zi.length() == 0)) {
            try {
                z17 = new org.json.JSONObject(Zi).optBoolean(entrance);
            } catch (java.lang.Exception unused) {
                z17 = true;
            }
            return !z18 && z17;
        }
        z17 = true;
        if (z18) {
        }
    }

    public final ya2.b2 e() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.m36 m36Var;
        r45.l6 l6Var;
        r45.kz0 kz0Var;
        r45.il4 il4Var;
        r45.kz0 kz0Var2;
        r45.il4 il4Var2;
        r45.kz0 kz0Var3;
        r45.kz0 kz0Var4;
        java.lang.String str4;
        g92.b bVar = g92.b.f269769e;
        java.lang.String U = bVar.U();
        ya2.b2 a17 = a().a(U);
        if (a17 == null) {
            a17 = new ya2.b2();
            a17.field_username = U;
        }
        l75.e0 e0Var = ya2.b2.O2;
        a17.field_follow_Flag = ya2.b2.Q2;
        m92.b I1 = g92.a.I1(bVar, false, 1, null);
        java.lang.String str5 = "";
        if (I1 == null || (str = I1.field_nickname) == null) {
            str = "";
        }
        a17.field_nickname = str;
        if (I1 == null || (str2 = I1.field_avatarUrl) == null) {
            str2 = "";
        }
        a17.field_avatarUrl = str2;
        if (I1 == null || (str3 = I1.field_signature) == null) {
            str3 = "";
        }
        a17.field_signature = str3;
        a17.field_originalFlag = I1 != null ? I1.field_originalFlag : 0;
        a17.field_originalEntranceFlag = I1 != null ? I1.field_originalEntranceFlag : 0;
        a17.field_extFlag = I1 != null ? I1.field_extFlag : 0;
        a17.field_authInfo = I1 != null ? I1.field_authInfo : null;
        if (I1 != null && (str4 = I1.field_liveCoverImgUrl) != null) {
            str5 = str4;
        }
        a17.field_liveCoverImg = str5;
        long j17 = 0;
        a17.field_liveAnchorStatusFlag = (I1 == null || (kz0Var4 = I1.field_liveInfo) == null) ? 0L : kz0Var4.getLong(0);
        a17.field_liveSwitchFlag = (I1 == null || (kz0Var3 = I1.field_liveInfo) == null) ? 0L : kz0Var3.getInteger(1);
        a17.field_liveMicSetting = (I1 == null || (kz0Var2 = I1.field_liveInfo) == null || (il4Var2 = (r45.il4) kz0Var2.getCustom(3)) == null) ? 0L : il4Var2.f377129d;
        if (I1 != null && (kz0Var = I1.field_liveInfo) != null && (il4Var = (r45.il4) kz0Var.getCustom(3)) != null) {
            j17 = il4Var.f377130e;
        }
        a17.field_liveMicSettingSwitch = j17;
        if (I1 == null || (m36Var = (r45.m36) I1.u0().getCustom(13)) == null) {
            m36Var = new r45.m36();
        }
        a17.field_settlementInfo = m36Var;
        if (I1 == null || (l6Var = (r45.l6) I1.u0().getCustom(15)) == null) {
            l6Var = new r45.l6();
        }
        a17.field_agencyCollaborateInfo = l6Var;
        return a17;
    }

    public final ya2.b2 f() {
        ya2.c a17 = a();
        java.lang.String k17 = c01.z1.k();
        kotlin.jvm.internal.o.f(k17, "getMyFinderAliasUsername(...)");
        ya2.b2 a18 = a17.a(k17);
        if (a18 == null) {
            a18 = new ya2.b2();
            a18.field_username = c01.z1.k();
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MY_FINDER_ALIAS_NICKNAME_STRING_SYNC, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        a18.field_nickname = (java.lang.String) m17;
        java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MY_FINDER_ALIAS_AVATAR_URL_STRING_SYNC, "");
        kotlin.jvm.internal.o.e(m18, "null cannot be cast to non-null type kotlin.String");
        a18.field_avatarUrl = (java.lang.String) m18;
        return a18;
    }

    public final boolean g(java.lang.String str) {
        ya2.g gVar = ya2.h.f460484a;
        if (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return (a().a(str) == null && c(str) == null) ? false : true;
    }

    public final void i(java.lang.String finderUserName, int i17) {
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        ya2.g gVar = ya2.h.f460484a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("operationSetFollow ");
        sb6.append(finderUserName);
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(" and cacheItem ");
        ya2.b2 a17 = a().a(finderUserName);
        sb6.append(a17 != null ? a17.J0() : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderContactLogic", sb6.toString());
        ya2.f fVar = new ya2.f(i17);
        ya2.b2 b17 = b(finderUserName);
        if (b17 == null) {
            b17 = new ya2.b2();
            b17.field_username = finderUserName;
        }
        ya2.b2 b2Var = (ya2.b2) fVar.invoke(b17);
        n(b2Var);
        l(b2Var);
    }

    public final boolean j(com.tencent.mm.protocal.protobuf.FinderContact contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        java.lang.String username = contact.getUsername();
        if (username == null || username.length() == 0) {
            ya2.g gVar = ya2.h.f460484a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("error FinderContact username is null ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.e("Finder.FinderContactLogic", sb6.toString());
            return false;
        }
        java.lang.String username2 = contact.getUsername();
        if (username2 == null) {
            username2 = "";
        }
        ya2.b2 g17 = ya2.d.g(contact, b(username2), true);
        ya2.g gVar2 = ya2.h.f460484a;
        com.tencent.mars.xlog.Log.i("Finder.FinderContactLogic", "replaceContact contact %s result %s", g17.D0(), g17.J0());
        n(g17);
        l(g17);
        return true;
    }

    public final boolean k(ya2.b2 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        n(contact);
        return l(contact);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x010b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0109, code lost:
    
        if (r2 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0093, code lost:
    
        if (r2 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x010d, code lost:
    
        r2 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(ya2.b2 r21) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.g.l(ya2.b2):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r4.intValue() != r7) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(ya2.b2 r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.g.n(ya2.b2):void");
    }

    public final boolean o(ya2.b2 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        ya2.g gVar = ya2.h.f460484a;
        com.tencent.mars.xlog.Log.i("Finder.FinderContactLogic", "update contact " + contact.D0() + ' ' + contact.J0() + ' ' + ((java.lang.Object) ""));
        if (!g(contact.D0())) {
            return false;
        }
        n(contact);
        if (c(contact.D0()) == null) {
            return true;
        }
        ya2.h.f460484a.l(contact);
        return true;
    }
}
