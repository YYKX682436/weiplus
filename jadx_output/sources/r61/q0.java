package r61;

/* loaded from: classes11.dex */
public abstract class q0 {
    public static boolean a() {
        boolean a17 = gm0.j1.a();
        if (!a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FriendLogic", "canSyncAddrBook isAccHasReady: %b", java.lang.Boolean.valueOf(a17));
            return false;
        }
        boolean z17 = b() == js.x0.SUCC;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FriendLogic", "canSyncAddrBook userBindOpMobile: %b", java.lang.Boolean.valueOf(z17));
            return false;
        }
        boolean i17 = i();
        if (i17) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FriendLogic", "canSyncAddrBook isUploadContact: %b", java.lang.Boolean.valueOf(i17));
        return false;
    }

    public static js.x0 b() {
        js.x0 x0Var = js.x0.NO_INIT;
        try {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(4097, "");
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(6, "");
            boolean z17 = (c01.z1.p() & 131072) == 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.FriendLogic", "isUpload " + z17 + " stat " + c01.z1.p());
            if (str == null || str.length() <= 0) {
                str = null;
            }
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            return (str == null && str2 == null) ? x0Var : (str == null || str2 != null) ? z17 ? js.x0.SUCC : js.x0.SUCC_UNLOAD : js.x0.SET_MOBILE;
        } catch (java.lang.Exception unused) {
            return x0Var;
        }
    }

    public static void c(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FriendLogic", "clearFMsgAndFConvByTalker, rowId: %d, talker: %s", java.lang.Long.valueOf(j17), str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FriendLogic", "clearFMsgAndFConvByTalker, delete fconversation, ret = " + ((com.tencent.mm.storage.o7) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri()).D0(j17, str));
        com.tencent.mars.xlog.Log.i("MicroMsg.FriendLogic", "clearFMsgAndFConvByTalker, delete fmsginfo, ret = " + ((com.tencent.mm.storage.q7) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ui()).D0(str));
    }

    public static void d(java.util.List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.storage.q7) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ui()).J0(0)).iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.p7 p7Var = (com.tencent.mm.storage.p7) it.next();
            com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(p7Var.field_msgContent);
            java.lang.String str = D3.f196366i;
            java.lang.String str2 = D3.f196365h;
            int i17 = D3.f196364g;
            if (i17 == 10 || i17 == 11) {
                if (list.contains(str) || list.contains(str2)) {
                    hashSet.add(p7Var.field_talker);
                }
            }
        }
        hashSet.size();
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            c(0L, (java.lang.String) it6.next());
        }
    }

    public static java.util.List e() {
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        android.database.Cursor f17 = m61.k.wi().f392819d.f("select addr_upload2.md5 from addr_upload2 where addr_upload2.uploadtime = 0 AND addr_upload2.type = 1", null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            arrayList.add(f17.getString(0));
        }
        f17.close();
        return arrayList;
    }

    public static java.lang.String f(java.lang.String str) {
        java.lang.String str2;
        str2 = "";
        if (str != null && !str.equals("")) {
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            r61.b wi6 = m61.k.wi();
            wi6.getClass();
            android.database.Cursor f17 = wi6.f392819d.f("select addr_upload2.realname from addr_upload2 where addr_upload2.id = " + r61.a.d(str) + "", null, 2);
            if (f17 != null) {
                str2 = f17.moveToFirst() ? f17.getString(0) : "";
                f17.close();
            }
        }
        return str2;
    }

    public static java.util.List g() {
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        android.database.Cursor f17 = m61.k.wi().f392819d.f("select addr_upload2.moblie from addr_upload2 where addr_upload2.uploadtime = 0 AND addr_upload2.type = 0", null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            java.lang.String a17 = o25.b.a(f17.getString(0));
            if (a17.length() > 0) {
                arrayList.add(a17);
            }
        }
        f17.close();
        return arrayList;
    }

    public static boolean h() {
        js.x0 b17 = b();
        com.tencent.mars.xlog.Log.i("MicroMsg.FriendLogic", "isTipInMobileFriend, state %s", b17.toString());
        if (b17 == js.x0.SUCC) {
            boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1((java.lang.Boolean) gm0.j1.u().c().l(12322, java.lang.Boolean.FALSE), false);
            com.tencent.mars.xlog.Log.i("MicroMsg.FriendLogic", "USERINFO_UPLOAD_ADDR_LOOK_UP %B", java.lang.Boolean.valueOf(m17));
            if (!m17) {
                return true;
            }
        }
        return false;
    }

    public static boolean i() {
        if (gm0.j1.u() != null && gm0.j1.u().c() != null) {
            return com.tencent.mm.sdk.platformtools.t8.m1((java.lang.Boolean) gm0.j1.u().c().l(12322, java.lang.Boolean.TRUE), true);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FriendLogic", "[arthurdan.UploadPhone] Notice!!!! MMKernel.storage() is null!!!");
        return false;
    }

    public static boolean j(java.lang.String str, android.content.Context context, byte[] bArr) {
        android.database.Cursor cursor;
        boolean z17 = false;
        if (str == null || str.equals("")) {
            return false;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddressBookUtil", "no contact permission");
            return false;
        }
        android.database.Cursor cursor2 = null;
        try {
            try {
                android.content.ContentResolver contentResolver = context.getContentResolver();
                long E1 = com.tencent.mm.sdk.platformtools.t8.E1(str);
                android.content.ContentValues contentValues = new android.content.ContentValues();
                cursor = contentResolver.query(android.provider.ContactsContract.Data.CONTENT_URI, null, java.lang.String.format("%s=%d and %s='%s'", "raw_contact_id", java.lang.Long.valueOf(E1), "mimetype", "vnd.android.cursor.item/photo"), null, null);
                if (cursor != null) {
                    try {
                        int i17 = cursor.moveToFirst() ? cursor.getInt(cursor.getColumnIndexOrThrow("_id")) : -1;
                        contentValues.put("raw_contact_id", java.lang.Long.valueOf(E1));
                        contentValues.put("is_super_primary", (java.lang.Integer) 1);
                        contentValues.put("data15", bArr);
                        contentValues.put("mimetype", "vnd.android.cursor.item/photo");
                        if (i17 < 0) {
                            contentResolver.insert(android.provider.ContactsContract.Data.CONTENT_URI, contentValues);
                            cursor.close();
                            return true;
                        }
                        if (contentResolver.update(android.provider.ContactsContract.Data.CONTENT_URI, contentValues, "_id = " + i17, null) > 0) {
                            z17 = true;
                        }
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        cursor2 = cursor;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddressBookUtil", e, "", new java.lang.Object[0]);
                        if (cursor2 != null && !cursor2.isClosed()) {
                            cursor2.close();
                        }
                        if (cursor2 == null) {
                            return false;
                        }
                        cursor2.close();
                        return false;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } else if (cursor == null) {
                    return false;
                }
                cursor.close();
                return z17;
            } catch (java.lang.Throwable th7) {
                th = th7;
                cursor = null;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }

    public static void k(boolean z17) {
        if (z17 && !((java.lang.Boolean) gm0.j1.u().c().l(12322, java.lang.Boolean.FALSE)).booleanValue()) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_MANAGER_NEW_ACCOUNTS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        gm0.j1.u().c().w(12322, java.lang.Boolean.valueOf(z17));
    }

    public static void l(java.util.List list) {
        int i17;
        if (list == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FriendLogic", "set uploaded mobile contact failed, null info list");
            return;
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.b wi6 = m61.k.wi();
        wi6.getClass();
        com.tencent.mm.sdk.platformtools.i8 i8Var = new com.tencent.mm.sdk.platformtools.i8("MicroMsg.AddrUploadStorage", "set uploaded transaction");
        i8Var.a("transation begin");
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = wi6.f392819d;
        long F = k0Var.F(valueOf);
        boolean z17 = false;
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (str != null && str.length() > 0) {
                    r61.a aVar = new r61.a();
                    aVar.O = 8;
                    aVar.f392788d = com.tencent.mm.sdk.platformtools.t8.i1();
                    android.content.ContentValues c17 = aVar.c();
                    if (c17.size() > 0) {
                        i17 = k0Var.p("addr_upload2", c17, "id=?", new java.lang.String[]{"" + r61.a.d(str)});
                    } else {
                        i17 = 0;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AddrUploadStorage", "local contact uploaded : " + str + ", update result: " + i17);
                }
            }
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddrUploadStorage", "" + e17.getMessage());
        }
        k0Var.w(java.lang.Long.valueOf(F));
        i8Var.a("transation end");
        i8Var.b();
        if (z17) {
            wi6.b(3, wi6, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, r61.b, l75.a1] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static void m(int i17, java.util.List list) {
        boolean moveToFirst;
        int i18;
        boolean z17;
        if (list == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FriendLogic", "sync address book failed, null info list");
            return;
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        ?? wi6 = m61.k.wi();
        wi6.getClass();
        if (list.size() <= 0) {
            return;
        }
        com.tencent.mm.sdk.platformtools.i8 i8Var = new com.tencent.mm.sdk.platformtools.i8("MicroMsg.AddrUploadStorage", "transaction");
        i8Var.a("transation begin");
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = wi6.f392819d;
        long F = k0Var.F(valueOf);
        ?? r47 = 0;
        int i19 = 0;
        while (true) {
            try {
                if (i19 >= list.size()) {
                    break;
                }
                r61.a aVar = (r61.a) list.get(i19);
                if (aVar != null) {
                    android.database.Cursor f17 = k0Var.f("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where addr_upload2.id = " + r61.a.d(aVar.e()) + "", null, 2);
                    if (f17 == null) {
                        moveToFirst = r47;
                    } else {
                        moveToFirst = f17.moveToFirst();
                        f17.close();
                    }
                    if (moveToFirst) {
                        int d17 = r61.a.d(aVar.e());
                        android.content.ContentValues c17 = aVar.c();
                        if (c17.size() > 0) {
                            i18 = k0Var.p("addr_upload2", c17, "id=?", new java.lang.String[]{"" + d17});
                        } else {
                            i18 = 0;
                        }
                        if (i18 == 0) {
                            java.lang.Object[] objArr = new java.lang.Object[2];
                            objArr[0] = aVar.f();
                            java.lang.String str = aVar.f392798n;
                            if (str == null) {
                                str = "";
                            }
                            objArr[1] = str;
                            com.tencent.mars.xlog.Log.i("MicroMsg.AddrUploadStorage", "batchSet update result=0, num:%s email:%s", objArr);
                            z17 = false;
                        } else if (i18 < 0) {
                            java.lang.Object[] objArr2 = new java.lang.Object[2];
                            objArr2[0] = aVar.f();
                            java.lang.String str2 = aVar.f392798n;
                            if (str2 == null) {
                                str2 = "";
                            }
                            objArr2[1] = str2;
                            com.tencent.mars.xlog.Log.i("MicroMsg.AddrUploadStorage", "batchSet update failed, num:%s email:%s", objArr2);
                        } else {
                            z17 = false;
                            wi6.b(3, wi6, aVar.e());
                        }
                        i19++;
                        r47 = z17;
                    } else {
                        aVar.O = -1;
                        if (((int) k0Var.l("addr_upload2", dm.i4.COL_ID, aVar.c())) == -1) {
                            java.lang.Object[] objArr3 = new java.lang.Object[2];
                            objArr3[r47] = aVar.f();
                            java.lang.String str3 = aVar.f392798n;
                            if (str3 == null) {
                                str3 = "";
                            }
                            objArr3[1] = str3;
                            com.tencent.mars.xlog.Log.i("MicroMsg.AddrUploadStorage", "batchSet insert failed, num:%s email:%s", objArr3);
                        } else {
                            wi6.b(2, wi6, aVar.e());
                        }
                    }
                }
                z17 = r47;
                i19++;
                r47 = z17;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AddrUploadStorage", "" + e17.getMessage());
            }
        }
        k0Var.w(java.lang.Long.valueOf(F));
        i8Var.a("transation end");
        i8Var.b();
    }
}
