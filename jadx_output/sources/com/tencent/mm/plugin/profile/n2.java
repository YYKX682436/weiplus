package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.profile.n2 f153540a = new com.tencent.mm.plugin.profile.n2();

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[Catch: Exception -> 0x01c0, TryCatch #0 {Exception -> 0x01c0, blocks: (B:4:0x0015, B:7:0x001b, B:10:0x0046, B:13:0x004d, B:16:0x0054, B:18:0x0059, B:20:0x006a, B:23:0x0074, B:24:0x007a, B:27:0x008c, B:34:0x00b8, B:36:0x00c2, B:38:0x00cc, B:40:0x00da, B:42:0x00e2, B:44:0x00ea, B:46:0x00ef, B:47:0x00f3, B:49:0x00f9, B:51:0x0103, B:53:0x010b, B:55:0x0123, B:57:0x0127, B:59:0x012d, B:60:0x0139, B:62:0x0149, B:64:0x014f, B:65:0x0154, B:68:0x015e, B:71:0x0164, B:74:0x016e, B:77:0x0174, B:80:0x017e, B:83:0x019e, B:84:0x01a2, B:86:0x01a7, B:87:0x01ad, B:89:0x01b2, B:90:0x01b8, B:94:0x01bb, B:99:0x00a4, B:101:0x00ae, B:103:0x00b2), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123 A[Catch: Exception -> 0x01c0, TryCatch #0 {Exception -> 0x01c0, blocks: (B:4:0x0015, B:7:0x001b, B:10:0x0046, B:13:0x004d, B:16:0x0054, B:18:0x0059, B:20:0x006a, B:23:0x0074, B:24:0x007a, B:27:0x008c, B:34:0x00b8, B:36:0x00c2, B:38:0x00cc, B:40:0x00da, B:42:0x00e2, B:44:0x00ea, B:46:0x00ef, B:47:0x00f3, B:49:0x00f9, B:51:0x0103, B:53:0x010b, B:55:0x0123, B:57:0x0127, B:59:0x012d, B:60:0x0139, B:62:0x0149, B:64:0x014f, B:65:0x0154, B:68:0x015e, B:71:0x0164, B:74:0x016e, B:77:0x0174, B:80:0x017e, B:83:0x019e, B:84:0x01a2, B:86:0x01a7, B:87:0x01ad, B:89:0x01b2, B:90:0x01b8, B:94:0x01bb, B:99:0x00a4, B:101:0x00ae, B:103:0x00b2), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.lang.String r16, java.lang.String r17, int r18, int r19, r45.v60 r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.n2.a(java.lang.String, java.lang.String, int, int, r45.v60, java.lang.String):java.lang.String");
    }

    public static final void b(java.lang.String str, java.lang.String str2, int i17, int i18, r45.v60 v60Var, boolean z17, java.lang.Long l17, java.lang.String str3) {
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ProfileUtilsKt", "createSendMessage failed, talkerAddBySayHi is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "createSendMessage start, talker=" + str + ", type=" + i17 + ", scene=" + i18 + ", svrMsgId=" + l17 + ", encryptUsername=" + str3);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.q1.f310568a, null, new com.tencent.mm.plugin.profile.u1(str, str2, i17, i18, v60Var, str3, l17, z17, null), 2, null);
        }
    }

    public static final java.lang.String f(com.tencent.mm.storage.a3 a3Var, java.lang.String str) {
        java.lang.String str2 = null;
        if (a3Var == null) {
            return null;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null && ((int) n17.E2) > 0) {
            str2 = n17.w0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = a3Var.z0(str);
        }
        return (!com.tencent.mm.sdk.platformtools.t8.K0(str2) || n17 == null) ? str2 : n17.f2();
    }

    public static final void n(android.app.Activity mActivity, com.tencent.mm.storage.a3 a3Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(mActivity, "mActivity");
        java.lang.String stringExtra = mActivity.getIntent().getStringExtra("inviteer");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        java.lang.String f17 = f(a3Var, stringExtra);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", stringExtra);
        intent.putExtra("Contact_RemarkName", f17);
        intent.putExtra("Contact_RoomNickname", f17);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", str);
        intent.putExtra("Contact_Nick", ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(stringExtra, true).P0());
        intent.putExtra("Contact_Scene", 14);
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", str);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, mActivity);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.tencent.mm.storage.z3 r24, com.tencent.mm.sdk.coroutines.LifecycleScope r25, yz5.a r26, yz5.l r27) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.n2.c(com.tencent.mm.storage.z3, com.tencent.mm.sdk.coroutines.LifecycleScope, yz5.a, yz5.l):void");
    }

    public final java.lang.CharSequence d(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.ya yaVar, android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = yaVar != null ? yaVar.field_conDescription : null;
        if (str == null || str.length() == 0) {
            str = z3Var != null ? z3Var.f236589y1 : null;
        }
        if (str == null) {
            str = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stranger: ");
        sb6.append(yaVar);
        sb6.append(", contact: ");
        sb6.append(z3Var);
        sb6.append(", strangerDesc: ");
        sb6.append(yaVar != null ? yaVar.field_conDescription : null);
        sb6.append(", contactDesc: ");
        sb6.append(z3Var != null ? z3Var.f236589y1 : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", sb6.toString());
        return str;
    }

    public final java.util.List e(java.lang.String str) {
        com.tencent.mm.storage.z3 n17;
        java.util.LinkedList<r45.c5> linkedList;
        java.util.List list = kz5.p0.f313996d;
        if (str == null || (n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true)) == null) {
            return list;
        }
        if (n17.r2()) {
            r45.o80 A0 = n17.A0();
            if (A0 != null && (linkedList = A0.f382018d) != null) {
                list = new java.util.ArrayList();
                for (r45.c5 c5Var : linkedList) {
                    i21.q h17 = i21.q.h();
                    java.lang.String d17 = h17 != null ? h17.d(str, c5Var.f371292d) : null;
                    if (d17 != null) {
                        list.add(d17);
                    }
                }
            }
        } else {
            e06.k kVar = new e06.k(0, 2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = kVar.iterator();
            while (it.hasNext()) {
                int b17 = ((kz5.x0) it).b();
                i21.q h18 = i21.q.h();
                java.lang.String c17 = h18 != null ? h18.c(str, b17) : null;
                if (c17 != null) {
                    arrayList.add(c17);
                }
            }
            list = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a((java.lang.String) obj);
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                    list.add(obj);
                }
            }
            java.util.ArrayList a18 = com.tencent.mm.contact.b.a(n17.f236591z1);
            if (a18 != null) {
                list = new java.util.ArrayList();
                for (java.lang.Object obj2 : a18) {
                    com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a((java.lang.String) obj2);
                    java.lang.String str3 = a19.f213279f;
                    if (str3 != null) {
                        java.lang.String l18 = com.tencent.mm.vfs.e8.l(str3, false, false);
                        if (!str3.equals(l18)) {
                            a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l18, a19.f213280g, a19.f213281h);
                        }
                    }
                    com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a19, null);
                    if (!m18.a() ? false : m18.f213266a.F(m18.f213267b)) {
                        list.add(obj2);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "getDescImages() username: " + str + ", isContact: " + n17.r2() + ", images: " + list.size());
        return list;
    }

    public final java.lang.String g(com.tencent.mm.storage.z3 z3Var, android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String str = "";
        if (z3Var == null) {
            return "";
        }
        if (z3Var.y2()) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.hnb);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        boolean x27 = z3Var.x2();
        boolean P0 = ((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).P0(z3Var.d1(), 5L);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 0);
        if (x27) {
            if (Ni == 0) {
                java.lang.String string2 = context.getString(z3Var.I == 2 ? com.tencent.mm.R.string.f492733hn5 : com.tencent.mm.R.string.hn7);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                linkedList.add(string2);
            } else {
                java.lang.String string3 = context.getString(z3Var.I == 2 ? com.tencent.mm.R.string.hn6 : com.tencent.mm.R.string.hn8);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                linkedList.add(string3);
            }
        }
        if (P0) {
            if (Ni == 0) {
                java.lang.String string4 = context.getString(z3Var.I == 2 ? com.tencent.mm.R.string.f492729hn0 : com.tencent.mm.R.string.f492731hn2);
                kotlin.jvm.internal.o.f(string4, "getString(...)");
                linkedList.add(string4);
            } else {
                java.lang.String string5 = context.getString(z3Var.I == 2 ? com.tencent.mm.R.string.f492730hn1 : com.tencent.mm.R.string.f492732hn3);
                kotlin.jvm.internal.o.f(string5, "getString(...)");
                linkedList.add(string5);
            }
        }
        if (!linkedList.isEmpty()) {
            str = com.tencent.mm.sdk.platformtools.t8.c1(linkedList, context.getResources().getString(com.tencent.mm.R.string.f490924ba0));
            kotlin.jvm.internal.o.d(str);
        } else if (!com.tencent.mm.storage.z3.m4(z3Var.d1()) && !z17) {
            str = context.getString(com.tencent.mm.R.string.hmx);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        return str;
    }

    public final java.util.List h(com.tencent.mm.contact.o contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        yq3.v vVar = (yq3.v) contact;
        boolean z17 = true;
        if (vVar.k()) {
            java.lang.String str = (java.lang.String) vVar.f464554y.a(vVar, yq3.v.f464529z[6]);
            java.util.List i17 = ((b93.b) c93.a.a()).i(str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (i17 != null && !i17.isEmpty()) {
                    z17 = false;
                }
                if (!z17) {
                    kotlin.jvm.internal.o.d(i17);
                    return i17;
                }
            }
        } else {
            java.lang.String str2 = (java.lang.String) vVar.f464550u.a(vVar, yq3.v.f464529z[2]);
            java.util.List f17 = ((b93.b) c93.a.a()).f(str2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                kotlin.jvm.internal.o.d(f17);
                if (!f17.isEmpty()) {
                    return f17;
                }
            }
        }
        return kz5.p0.f313996d;
    }

    public final java.util.List i(com.tencent.mm.storage.z3 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        boolean r27 = contact.r2();
        boolean z17 = true;
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (r27) {
            java.lang.String D0 = contact.D0();
            java.util.List i17 = ((b93.b) c93.a.a()).i(D0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(D0)) {
                if (i17 != null && !i17.isEmpty()) {
                    z17 = false;
                }
                if (!z17) {
                    kotlin.jvm.internal.o.d(i17);
                    return i17;
                }
            }
        } else {
            com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(contact.d1());
            if (z07 == null) {
                return p0Var;
            }
            java.lang.String str = z07.field_contactLabels;
            java.util.List f17 = ((b93.b) c93.a.a()).f(str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                kotlin.jvm.internal.o.d(f17);
                if (!f17.isEmpty()) {
                    return f17;
                }
            }
        }
        return p0Var;
    }

    public final java.util.List j(com.tencent.mm.contact.o contact, android.content.Intent intent) {
        java.util.List arrayList;
        java.lang.String str;
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(intent, "intent");
        yq3.v vVar = (yq3.v) contact;
        if (vVar.k()) {
            java.lang.String[] b17 = com.tencent.mm.contact.a.b(vVar.f464535f);
            kotlin.jvm.internal.o.f(b17, "getSepPhone(...)");
            arrayList = kz5.n0.V0(kz5.z.I(b17));
        } else {
            arrayList = new java.util.ArrayList();
        }
        if (intent.getIntExtra("Contact_Scene", 9) != 15 || (str = intent.getStringExtra("Contact_Search_Mobile")) == null) {
            str = "";
        }
        if ((!r26.n0.N(str)) && !vVar.k()) {
            arrayList.add(str);
        }
        java.lang.String stringExtra = intent.getStringExtra("contact_phone_number_by_md5");
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = f153540a.l(contact, intent);
        }
        java.lang.String str2 = stringExtra != null ? stringExtra : "";
        if (!r26.n0.N(str2)) {
            arrayList.add(str2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!r26.n0.N((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final java.util.List k(com.tencent.mm.storage.z3 contact, android.content.Intent intent) {
        java.util.List arrayList;
        java.lang.String str;
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (contact.r2()) {
            java.lang.String[] b17 = com.tencent.mm.contact.a.b(contact);
            arrayList = b17 != null ? kz5.z.C0(b17) : new java.util.ArrayList();
        } else {
            arrayList = new java.util.ArrayList();
        }
        if (intent.getIntExtra("Contact_Scene", 9) != 15 || (str = intent.getStringExtra("Contact_Search_Mobile")) == null) {
            str = "";
        }
        if ((!r26.n0.N(str)) && !contact.r2()) {
            arrayList.add(str);
        }
        java.lang.String stringExtra = intent.getStringExtra("contact_phone_number_by_md5");
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = f153540a.m(contact, intent);
        }
        java.lang.String str2 = stringExtra != null ? stringExtra : "";
        if (!r26.n0.N(str2)) {
            arrayList.add(str2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!r26.n0.N((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final java.lang.String l(com.tencent.mm.contact.o oVar, android.content.Intent intent) {
        yq3.v vVar;
        java.lang.String h17;
        kotlin.jvm.internal.o.g(intent, "intent");
        if (oVar != null && (h17 = (vVar = (yq3.v) oVar).h()) != null) {
            long c17 = g95.e.f269801a.c(h17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "getPhoneByMd5() username: " + h17 + ", isContact: " + vVar.k() + ", createTime: " + c17);
            com.tencent.mm.storage.z3 z3Var = vVar.f464535f;
            if (!(z3Var != null && z3Var.p2()) && vVar.k() && c17 < 1737345600) {
                java.lang.String stringExtra = intent.getStringExtra("Contact_Mobile_MD5");
                java.lang.String stringExtra2 = intent.getStringExtra("Contact_full_Mobile_MD5");
                r61.a aVar = null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
                        aVar = m61.k.wi().h(h17);
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[0] = h17;
                        objArr[1] = aVar != null ? "false" : "true";
                        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "Contact name: %s AddrUpload IS NULL? %s", objArr);
                    }
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "Contact name: %s mMobileByMD5: %s mobileFullMD5:%s", h17, stringExtra, stringExtra2);
                    r61.b wi6 = m61.k.wi();
                    r61.a i17 = wi6 != null ? wi6.i(stringExtra) : null;
                    if (i17 == null || com.tencent.mm.sdk.platformtools.t8.K0(i17.e())) {
                        r61.b wi7 = m61.k.wi();
                        if (wi7 != null) {
                            aVar = wi7.i(stringExtra2);
                        }
                    } else {
                        aVar = i17;
                    }
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    objArr2[0] = h17;
                    objArr2[1] = aVar != null ? "false" : "true";
                    com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "Contact name: %s AddrUpload IS NULL? %s", objArr2);
                }
                if (aVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.e())) {
                    java.lang.String f17 = aVar.f();
                    if (f17 == null) {
                        f17 = "";
                    }
                    java.lang.String t17 = r26.i0.t(f17, " ", "", false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "Contact name: %s mMobileByMD5: %s", h17, t17);
                    return t17;
                }
            }
        }
        return "";
    }

    public final java.lang.String m(com.tencent.mm.storage.z3 contact, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String d17 = contact.d1();
        if (d17 == null) {
            return "";
        }
        long c17 = g95.e.f269801a.c(d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "getPhoneByMd5() username: " + d17 + ", isContact: " + contact.r2() + ", createTime: " + c17);
        if (!contact.p2() && contact.r2() && c17 < 1737345600) {
            java.lang.String stringExtra = intent.getStringExtra("Contact_Mobile_MD5");
            java.lang.String stringExtra2 = intent.getStringExtra("Contact_full_Mobile_MD5");
            r61.a aVar = null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                    aVar = m61.k.wi().h(d17);
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = d17;
                    objArr[1] = aVar != null ? "false" : "true";
                    com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "Contact name: %s AddrUpload IS NULL? %s", objArr);
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "Contact name: %s mMobileByMD5: %s mobileFullMD5:%s", d17, stringExtra, stringExtra2);
                r61.b wi6 = m61.k.wi();
                r61.a i17 = wi6 != null ? wi6.i(stringExtra) : null;
                if (i17 == null || com.tencent.mm.sdk.platformtools.t8.K0(i17.e())) {
                    r61.b wi7 = m61.k.wi();
                    if (wi7 != null) {
                        aVar = wi7.i(stringExtra2);
                    }
                } else {
                    aVar = i17;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                objArr2[0] = d17;
                objArr2[1] = aVar != null ? "false" : "true";
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "Contact name: %s AddrUpload IS NULL? %s", objArr2);
            }
            if (aVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.e())) {
                java.lang.String f17 = aVar.f();
                if (f17 == null) {
                    f17 = "";
                }
                java.lang.String t17 = r26.i0.t(f17, " ", "", false);
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "Contact name: %s mMobileByMD5: %s", d17, t17);
                return t17;
            }
        }
        return "";
    }

    public final void o(android.app.Activity activity, r45.wl wlVar, int i17, boolean z17, long j17, int i18, int i19, com.tencent.mm.plugin.profile.t1 t1Var) {
        java.lang.String string;
        int i27;
        kotlin.jvm.internal.o.g(activity, "activity");
        if (wlVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileUtilsKt", "handleFinderBlock: profileInfo is null");
            if (t1Var != null) {
                t1Var.a();
                return;
            }
            return;
        }
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = i17;
        if (i17 == 1) {
            f0Var.f310116d = 2;
            string = activity.getResources().getString(com.tencent.mm.R.string.hnp);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            i27 = com.tencent.mm.R.raw.icons_filled_done;
        } else {
            if (i17 != 2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ProfileUtilsKt", "handleFinderBlock: illegal block status, dismiss.");
                if (t1Var != null) {
                    t1Var.a();
                    return;
                }
                return;
            }
            f0Var.f310116d = 1;
            string = activity.getResources().getString(com.tencent.mm.R.string.hmq);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            i27 = com.tencent.mm.R.raw.icons_filled_eyes_off;
        }
        java.lang.String str = string;
        int i28 = i27;
        r45.l26 l26Var = new r45.l26();
        r45.pi piVar = wlVar.f389233d;
        l26Var.f379101e = piVar != null ? piVar.f383065d : null;
        r45.td5 td5Var = new r45.td5();
        td5Var.f386327d = f0Var.f310116d;
        l26Var.f379100d = td5Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4431;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/bizattr/setprofilesetting";
        lVar.f70665b = new r45.m26();
        lVar.f70664a = l26Var;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.profile.g2(wlVar, f0Var, z17, j17, i18, i19, t1Var, activity, str, i28));
    }

    public final void p(java.lang.String str, android.content.Context context) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(context, "context");
        if (str == null || r26.n0.N(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileUtilsKt", "jumpToPermissionSettingUI() username: " + str);
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 0) == 0 ? com.tencent.mm.plugin.profile.ui.PermissionSettingUI.class : com.tencent.mm.plugin.profile.ui.PermissionSettingUI2.class));
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            android.content.Intent intent2 = activity.getIntent();
            if (intent2 != null) {
                gr3.l[] lVarArr = gr3.l.f274892d;
                num = java.lang.Integer.valueOf(intent2.getIntExtra("entry_50321_path", 1));
            } else {
                num = null;
            }
            intent.putExtra("entry_50321_path", num);
            android.content.Intent intent3 = activity.getIntent();
            intent.putExtra("CONTACT_INFO_UI_SOURCE", intent3 != null ? java.lang.Integer.valueOf(intent3.getIntExtra("CONTACT_INFO_UI_SOURCE", 0)) : null);
        }
        intent.putExtra("sns_permission_userName", str);
        intent.putExtra("sns_permission_anim", true);
        intent.putExtra("sns_permission_block_scene", 1);
        intent.putExtra("INTENT_SOURCE_FROM_PROFILE_MENU", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/profile/ProfileUtilsKt", "jumpToPermissionSettingUI", "(Ljava/lang/String;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/profile/ProfileUtilsKt", "jumpToPermissionSettingUI", "(Ljava/lang/String;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
