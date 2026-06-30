package s83;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f404866a = new java.lang.String(java.lang.Character.toChars(91));

    /* renamed from: b, reason: collision with root package name */
    public static java.util.HashMap f404867b = new java.util.HashMap();

    public static s83.c a(android.database.Cursor cursor, int i17, int i18, int i19) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        boolean d17 = j35.u.d(context, "android.permission.READ_CONTACTS", true);
        java.lang.String str = null;
        if (!d17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
            return null;
        }
        s83.c cVar = new s83.c();
        cVar.f404869t = new java.util.ArrayList();
        java.lang.String string = cursor.getString(i17);
        java.lang.String string2 = cursor.getString(i18);
        java.lang.String string3 = cursor.getString(i19);
        cVar.field_contactId = string;
        cVar.field_systemAddressBookUsername = string2;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string3) && !cVar.f404869t.contains(string3)) {
            cVar.f404869t.add(string3);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.field_systemAddressBookUsername) && cVar.f404869t.size() > 0) {
            cVar.field_systemAddressBookUsername = (java.lang.String) cVar.f404869t.get(0);
        }
        java.util.Iterator it = cVar.f404869t.iterator();
        java.lang.String str2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String j17 = t83.c.j((java.lang.String) it.next());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                if (!j17.endsWith("@stranger")) {
                    str2 = j17;
                    break;
                }
                str2 = j17;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            cVar.field_wechatUsername = str2;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.field_systemAddressBookUsername)) {
            cVar.field_sortKey = "";
        } else {
            try {
                str = x51.k.a(cVar.field_systemAddressBookUsername);
            } catch (java.lang.Exception e17) {
                e17.getMessage();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                cVar.field_sortKey = "";
            } else if (java.lang.Character.isLetter(str.charAt(0))) {
                cVar.field_sortKey = str.toUpperCase();
            } else {
                cVar.field_sortKey = f404866a + str.toUpperCase();
            }
        }
        return cVar;
    }

    public static java.util.ArrayList b() {
        java.util.ArrayList arrayList;
        java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
            return arrayList2;
        }
        android.database.Cursor query = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, new java.lang.String[]{"contact_id", "display_name", "data1"}, "mimetype='vnd.android.cursor.item/phone_v2'", null, null);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.System.currentTimeMillis();
        if (query == null) {
            return arrayList2;
        }
        try {
            try {
                query.getCount();
                if (query.moveToFirst()) {
                    int columnIndex = query.getColumnIndex("contact_id");
                    int columnIndex2 = query.getColumnIndex("display_name");
                    int columnIndex3 = query.getColumnIndex("data1");
                    while (!query.isAfterLast()) {
                        s83.c a17 = a(query, columnIndex, columnIndex2, columnIndex3);
                        if (a17 != null && (arrayList = a17.f404869t) != null && arrayList.size() > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(a17.field_contactId)) {
                            if (hashMap.containsKey(a17.field_contactId)) {
                                s83.c cVar = (s83.c) hashMap.get(a17.field_contactId);
                                if (a17.f404869t.size() > 0 && !cVar.f404869t.contains(a17.f404869t.get(0))) {
                                    cVar.f404869t.add((java.lang.String) a17.f404869t.get(0));
                                }
                            } else {
                                hashMap.put(a17.field_contactId, a17);
                            }
                        }
                        query.moveToNext();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook error: %s, class: %s", e17.getMessage(), e17.getClass().getSimpleName());
            }
            arrayList2.addAll(hashMap.values());
            f404867b = hashMap;
            java.lang.System.currentTimeMillis();
            arrayList2.size();
            return arrayList2;
        } finally {
            query.close();
        }
    }
}
