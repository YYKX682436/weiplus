package o25;

/* loaded from: classes7.dex */
public abstract class b {
    public static java.lang.String a(java.lang.String str) {
        java.lang.String trim = str.trim();
        boolean startsWith = trim.startsWith("+");
        if (startsWith && trim.length() > 1) {
            trim = trim.substring(1, trim.length());
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("[^0-9]").matcher(trim);
        if (!startsWith) {
            return matcher.replaceAll("").trim();
        }
        return "+" + matcher.replaceAll("").trim();
    }

    public static android.graphics.Bitmap b(java.lang.String str, android.content.Context context, boolean z17) {
        if (str != null && !str.equals("")) {
            try {
                java.io.InputStream openContactPhotoInputStream = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(context.getContentResolver(), android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Contacts.CONTENT_URI, com.tencent.mm.sdk.platformtools.t8.E1(str)), z17);
                if (openContactPhotoInputStream == null) {
                    return null;
                }
                android.graphics.Bitmap O = com.tencent.mm.sdk.platformtools.x.O(openContactPhotoInputStream);
                return O != null ? com.tencent.mm.sdk.platformtools.x.s0(O, true, 4.0f) : O;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddressBookUtil", e17, "getAvatar, contactId:%s", str);
            }
        }
        return null;
    }

    public static java.lang.String c(java.lang.String str, android.content.Context context) {
        android.database.Cursor cursor;
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.d(context, "android.permission.READ_CONTACTS", false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddressBookUtil", "no contact permission");
            return "";
        }
        try {
            cursor = context.getContentResolver().query(android.provider.ContactsContract.Contacts.CONTENT_URI, new java.lang.String[]{"display_name"}, "_id = ?", new java.lang.String[]{str}, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddressBookUtil", e17, "getContactNameById:", new java.lang.Object[0]);
            cursor = null;
        }
        if (cursor == null) {
            return "";
        }
        java.lang.String string = cursor.moveToFirst() ? cursor.getString(0) : "";
        cursor.close();
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r12.moveToFirst() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        r3 = r12.getString(r12.getColumnIndex("display_name"));
        r1.add(new java.lang.String[]{r12.getString(r12.getColumnIndex("contact_id")), r3, r12.getString(r12.getColumnIndex("data1")), r12.getString(r12.getColumnIndex("raw_contact_id")), "" + java.lang.Long.valueOf(r12.getLong(r12.getColumnIndex("photo_id")))});
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b9, code lost:
    
        if (r12.moveToNext() != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(android.content.Context r12) {
        /*
            java.lang.String r0 = ""
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            android.content.ContentResolver r2 = r12.getContentResolver()
            java.lang.Class<tb0.j> r3 = tb0.j.class
            i95.m r3 = i95.n0.c(r3)
            tb0.j r3 = (tb0.j) r3
            sb0.f r3 = (sb0.f) r3
            r3.getClass()
            java.lang.String r3 = "android.permission.READ_CONTACTS"
            r8 = 0
            boolean r12 = j35.u.d(r12, r3, r8)
            java.lang.String r9 = "MicroMsg.AddressBookUtil"
            if (r12 != 0) goto L29
            java.lang.String r12 = "no contact permission"
            com.tencent.mars.xlog.Log.e(r9, r12)
            return r1
        L29:
            android.net.Uri r3 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch: java.lang.Exception -> L34
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L34
            goto L48
        L34:
            r12 = move-exception
            java.lang.String r2 = r12.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "getMobileInfo: exception occured [%s]"
            com.tencent.mars.xlog.Log.e(r9, r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            com.tencent.mars.xlog.Log.printErrStackTrace(r9, r12, r0, r2)
            r12 = 0
        L48:
            if (r12 != 0) goto L50
            java.lang.String r12 = "getMobileInfo: mobile is null"
            com.tencent.mars.xlog.Log.e(r9, r12)
            return r1
        L50:
            r2 = 1
            int r3 = r12.getCount()     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            if (r3 <= 0) goto Lbb
            boolean r3 = r12.moveToFirst()     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            if (r3 == 0) goto Lbb
        L5d:
            java.lang.String r3 = "display_name"
            int r3 = r12.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            java.lang.String r3 = r12.getString(r3)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            java.lang.String r4 = "contact_id"
            int r4 = r12.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            java.lang.String r4 = r12.getString(r4)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            java.lang.String r5 = "data1"
            int r5 = r12.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            java.lang.String r5 = r12.getString(r5)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            java.lang.String r6 = "raw_contact_id"
            int r6 = r12.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            java.lang.String r6 = r12.getString(r6)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            java.lang.String r7 = "photo_id"
            int r7 = r12.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            long r10 = r12.getLong(r7)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            r10 = 5
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            r10[r8] = r4     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            r10[r2] = r3     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            r3 = 2
            r10[r3] = r5     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            r3 = 3
            r10[r3] = r6     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            r3.<init>()     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            r3.append(r7)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            r4 = 4
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            r1.add(r10)     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            boolean r3 = r12.moveToNext()     // Catch: java.lang.Throwable -> Lbf java.lang.Exception -> Lc1
            if (r3 != 0) goto L5d
        Lbb:
            r12.close()
            goto Ld5
        Lbf:
            r0 = move-exception
            goto Ld6
        Lc1:
            r3 = move-exception
            java.lang.String r4 = "getMobileInfo: exception2 occured [%s]"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r5 = r3.getMessage()     // Catch: java.lang.Throwable -> Lbf
            r2[r8] = r5     // Catch: java.lang.Throwable -> Lbf
            com.tencent.mars.xlog.Log.e(r9, r4, r2)     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Lbf
            com.tencent.mars.xlog.Log.printErrStackTrace(r9, r3, r0, r2)     // Catch: java.lang.Throwable -> Lbf
            goto Lbb
        Ld5:
            return r1
        Ld6:
            r12.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o25.b.d(android.content.Context):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r11.moveToFirst() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        r1.add(new java.lang.String[]{r11.getString(r11.getColumnIndex("contact_id")), r11.getString(r11.getColumnIndex("display_name")), r11.getString(r11.getColumnIndex("data1")), r11.getString(r11.getColumnIndex("raw_contact_id"))});
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        if (r11.moveToNext() != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List e(android.content.Context r11) {
        /*
            java.lang.String r0 = ""
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            android.content.ContentResolver r8 = r11.getContentResolver()
            java.lang.Class<tb0.j> r2 = tb0.j.class
            i95.m r2 = i95.n0.c(r2)
            tb0.j r2 = (tb0.j) r2
            sb0.f r2 = (sb0.f) r2
            r2.getClass()
            java.lang.String r2 = "android.permission.READ_CONTACTS"
            r9 = 0
            boolean r11 = j35.u.d(r11, r2, r9)
            java.lang.String r10 = "MicroMsg.AddressBookUtil"
            if (r11 != 0) goto L29
            java.lang.String r11 = "no contact permission"
            com.tencent.mars.xlog.Log.e(r10, r11)
            return r1
        L29:
            android.net.Uri r3 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch: java.lang.Exception -> L37
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "sort_key_alt"
            r2 = r8
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L37
            goto L55
        L37:
            r11 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r9]
            com.tencent.mars.xlog.Log.printErrStackTrace(r10, r11, r0, r2)
            java.lang.String r11 = r11.getMessage()
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r2 = "exception in getMoblieOrderInfo(), [%s]"
            com.tencent.mars.xlog.Log.e(r10, r2, r11)
            android.net.Uri r3 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7)
        L55:
            if (r11 != 0) goto L5d
            java.lang.String r11 = "getMobileInfo: mobile is null"
            com.tencent.mars.xlog.Log.e(r10, r11)
            return r1
        L5d:
            int r2 = r11.getCount()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            if (r2 <= 0) goto L9e
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            if (r2 == 0) goto L9e
        L69:
            java.lang.String r2 = "display_name"
            int r2 = r11.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = r11.getString(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r3 = "contact_id"
            int r3 = r11.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r4 = "data1"
            int r4 = r11.getColumnIndex(r4)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r4 = r11.getString(r4)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r5 = "raw_contact_id"
            int r5 = r11.getColumnIndex(r5)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r5 = r11.getString(r5)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String[] r2 = new java.lang.String[]{r3, r2, r4, r5}     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r1.add(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            boolean r2 = r11.moveToNext()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            if (r2 != 0) goto L69
        L9e:
            r11.close()
            goto Lb9
        La2:
            r0 = move-exception
            goto Lba
        La4:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> La2
            com.tencent.mars.xlog.Log.printErrStackTrace(r10, r2, r0, r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "exception in getMoblieOrderInfo()2, [%s]"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> La2
            r3[r9] = r2     // Catch: java.lang.Throwable -> La2
            com.tencent.mars.xlog.Log.e(r10, r0, r3)     // Catch: java.lang.Throwable -> La2
            goto L9e
        Lb9:
            return r1
        Lba:
            r11.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o25.b.e(android.content.Context):java.util.List");
    }
}
