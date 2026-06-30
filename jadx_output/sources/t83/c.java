package t83;

/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.c5 f416411a = new com.tencent.mm.sdk.platformtools.c5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f416412b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f416413c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f416414d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f416415e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f416416f = new java.util.HashMap();

    public static java.lang.String a(java.lang.String str) {
        java.util.HashMap hashMap = f416413c;
        if (hashMap.size() == 0) {
            k();
        }
        if (m(str)) {
            java.lang.String i17 = t83.f.i(o(str));
            java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.keySet());
            java.util.Collections.sort(arrayList, java.util.Collections.reverseOrder(new t83.b(null)));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (i17.startsWith(str2)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public static java.lang.String b(java.lang.String str) {
        java.util.HashMap hashMap = f416413c;
        if (hashMap.size() == 0) {
            k();
        }
        if (!m(str)) {
            return str;
        }
        java.lang.String i17 = t83.f.i(o(str));
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.keySet());
        java.util.Collections.sort(arrayList, java.util.Collections.reverseOrder(new t83.b(null)));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (i17.startsWith(str2)) {
                return i17.substring(str2.length());
            }
        }
        return i17;
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String e17;
        java.lang.String i17 = t83.f.i(str);
        java.lang.String i18 = t83.f.i(i17);
        java.lang.String a17 = m(i18) ? a(i18) : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            e17 = com.tencent.mm.sdk.platformtools.c5.e(i17);
        } else {
            java.lang.String substring = o(i18).substring(a17.length());
            java.lang.String f17 = f416411a.f(a17, substring);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                substring = f17;
            }
            if (substring.startsWith("+")) {
                e17 = "+" + a17 + " " + substring.replace("+", "");
            } else {
                e17 = "+" + a17 + " " + substring;
            }
        }
        if (e17.length() <= 25) {
            return e17;
        }
        return e17.substring(0, 25) + "...";
    }

    public static android.graphics.Bitmap d(android.content.Context context, java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return o25.b.b(str, context, z17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        r2 = r9.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (r9 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(android.content.Context r9, java.lang.String r10) {
        /*
            java.lang.Class<tb0.j> r0 = tb0.j.class
            i95.m r0 = i95.n0.c(r0)
            tb0.j r0 = (tb0.j) r0
            sb0.f r0 = (sb0.f) r0
            r0.getClass()
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            r1 = 1
            boolean r0 = j35.u.d(r9, r0, r1)
            r2 = 0
            if (r0 != 0) goto L1f
            java.lang.String r9 = "MicroMsg.IPCallAddressUtil"
            java.lang.String r10 = "no contact permission"
            com.tencent.mars.xlog.Log.e(r9, r10)
            return r2
        L1f:
            android.content.ContentResolver r3 = r9.getContentResolver()
            android.net.Uri r4 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String r9 = "contact_id"
            java.lang.String r0 = "data1"
            java.lang.String[] r5 = new java.lang.String[]{r9, r0}
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)
            if (r9 == 0) goto L69
            boolean r0 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            if (r0 == 0) goto L69
        L3c:
            boolean r0 = r9.isAfterLast()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            if (r0 != 0) goto L69
            java.lang.String r0 = o25.b.a(r10)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.String r3 = r9.getString(r1)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            boolean r0 = android.telephony.PhoneNumberUtils.compare(r0, r3)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            if (r0 == 0) goto L57
            r10 = 0
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r2 = r10
            goto L69
        L57:
            r9.moveToNext()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            goto L3c
        L5b:
            r10 = move-exception
            goto L65
        L5d:
            r10 = move-exception
            r10.getMessage()     // Catch: java.lang.Throwable -> L5b
        L61:
            r9.close()
            goto L6c
        L65:
            r9.close()
            throw r10
        L69:
            if (r9 == 0) goto L6c
            goto L61
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t83.c.e(android.content.Context, java.lang.String):java.lang.String");
    }

    public static java.lang.String f(java.lang.String str) {
        java.util.HashMap hashMap = f416413c;
        if (hashMap.size() == 0) {
            k();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return (java.lang.String) hashMap.get(str);
    }

    public static java.lang.String g(java.lang.String str) {
        java.util.HashMap hashMap = f416415e;
        if (hashMap.size() == 0) {
            k();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return (java.lang.String) hashMap.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h() {
        /*
            java.util.HashMap r0 = t83.c.f416414d
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            k()
        Lb:
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.t8.d0(r0)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            java.lang.String r2 = "final sim countryCode: %s"
            java.util.HashMap r3 = t83.c.f416416f
            java.lang.String r4 = ""
            java.lang.String r5 = "MicroMsg.IPCallAddressUtil"
            if (r1 != 0) goto L41
            java.lang.String r1 = "simCountryCode: %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.i(r5, r1, r6)
            java.lang.String r0 = r0.toUpperCase()
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r1 != 0) goto L41
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.i(r5, r2, r1)
            goto L42
        L41:
            r0 = r4
        L42:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r1 != 0) goto L49
            return r0
        L49:
            c01.fb r0 = c01.fb.a()
            java.lang.String r0 = r0.f37193g
            java.lang.String r1 = "personalInfoCountryCode: %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.i(r5, r1, r6)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r1 != 0) goto L72
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r1 != 0) goto L72
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.i(r5, r2, r1)
            return r0
        L72:
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r1 = 2131759686(0x7f101246, float:1.9150371E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "fallbackCountryCode: %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.i(r5, r1, r2)
            java.lang.String r1 = "+"
            java.lang.String r0 = r0.replace(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t83.c.h():java.lang.String");
    }

    public static int i(java.lang.String str, java.lang.String str2) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressUtil", "no contact permission");
            return -1;
        }
        android.database.Cursor query = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new java.lang.String[]{str}, null);
        java.lang.String i17 = t83.f.i(str2);
        try {
            try {
                if (query.moveToFirst()) {
                    while (!query.isAfterLast()) {
                        int i18 = query.getInt(query.getColumnIndex("data2"));
                        if (t83.f.i(query.getString(query.getColumnIndex("data1"))).equals(i17)) {
                            return i18;
                        }
                        query.moveToNext();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressUtil", "getPhoneTypeByContactIdAndPhoneNumber error: %s", e17.getMessage());
            }
            return -1;
        } finally {
            query.close();
        }
    }

    public static java.lang.String j(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        r61.a i17 = m61.k.wi().i(kk.k.g(t83.f.i(str).getBytes()));
        if (i17 != null) {
            return i17.i();
        }
        return null;
    }

    public static void k() {
        java.lang.String str;
        f416413c.clear();
        f416414d.clear();
        f416415e.clear();
        f416416f.clear();
        f416412b.clear();
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("ipcall_country_code.txt");
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                str = new java.lang.String(bArr);
                try {
                    inputStream.close();
                } catch (java.io.IOException e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressUtil", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            } catch (java.io.IOException e18) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressUtil", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressUtil", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                    }
                }
                str = "";
            }
            java.lang.String[] split = str.trim().split("\n");
            for (int i17 = 0; i17 < split.length; i17++) {
                java.lang.String[] split2 = split[i17].trim().split(" ");
                if (split2.length < 2) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressUtil", "this country item has problem %s", split[i17]);
                } else {
                    t83.d dVar = new t83.d();
                    dVar.f416417a = split2[0];
                    dVar.f416418b = split2[1];
                    java.lang.String l17 = com.tencent.mm.storage.ha.k().l(split2[0]);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
                        l17 = new java.util.Locale("", split2[0]).getDisplayCountry(com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().locale);
                    }
                    dVar.f416419c = l17;
                    f416415e.put(dVar.f416418b, dVar.f416417a);
                    f416416f.put(dVar.f416417a, dVar.f416418b);
                    f416413c.put(dVar.f416418b, dVar.f416419c);
                    f416414d.put(dVar.f416419c, dVar.f416418b);
                    f416412b.put(dVar.f416417a, dVar);
                }
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e27) {
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressUtil", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
                }
            }
            throw th6;
        }
    }

    public static boolean l(java.lang.String str) {
        java.util.HashMap hashMap = f416413c;
        if (hashMap.size() == 0) {
            k();
        }
        return hashMap.containsKey(str);
    }

    public static boolean m(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return str.startsWith("+") || str.startsWith("00");
    }

    public static java.lang.String n(int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        return i17 != 1 ? i17 != 2 ? i17 != 4 ? i17 != 5 ? i17 != 10 ? context.getString(com.tencent.mm.R.string.f492701hi2) : context.getString(com.tencent.mm.R.string.hhx) : context.getString(com.tencent.mm.R.string.f492699hi0) : context.getString(com.tencent.mm.R.string.hhy) : context.getString(com.tencent.mm.R.string.f492700hi1) : context.getString(com.tencent.mm.R.string.hhz);
    }

    public static java.lang.String o(java.lang.String str) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str.startsWith("+") ? str.substring(1) : str.startsWith("00") ? str.substring(2) : str : str;
    }
}
