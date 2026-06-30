package t23;

/* loaded from: classes10.dex */
public class o2 {

    /* renamed from: e, reason: collision with root package name */
    public static final android.net.Uri f415216e = android.net.Uri.parse("content://com.open.gallery.smart.provider");

    /* renamed from: b, reason: collision with root package name */
    public boolean f415218b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f415219c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f415220d = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ContentResolver f415217a = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();

    public o2(t23.e2 e2Var) {
    }

    public final java.util.LinkedList a(java.util.ArrayList arrayList) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new com.tencent.mm.plugin.gallery.model.PrivateAlbumItem((t23.f2) it.next()));
        }
        return linkedList;
    }

    public final java.lang.String[] b() {
        return new java.lang.String[]{"categoryID", "categoryName", "albumID", "albumName", "albumCapacity", "coverID", "coverData", "albumTag"};
    }

    public final t23.h2 c(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            t23.f2 f2Var = (t23.f2) it.next();
            t23.i2 i2Var = f2Var.f415147b;
            java.util.List list2 = (java.util.List) hashMap.get(i2Var);
            if (list2 == null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(f2Var);
                hashMap.put(i2Var, arrayList2);
                arrayList.add(i2Var);
            } else {
                list2.add(f2Var);
            }
        }
        return new t23.h2(arrayList, hashMap);
    }

    public final java.util.List d(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        t23.f2 f2Var = null;
        while (it.hasNext()) {
            t23.f2 f2Var2 = (t23.f2) it.next();
            t23.g2 g2Var = f2Var2.f415153h;
            if (g2Var == null || !g2Var.f415154a) {
                t23.i2 i2Var = f2Var2.f415147b;
                java.util.List list2 = (java.util.List) hashMap.get(i2Var);
                if (list2 == null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(f2Var2);
                    hashMap.put(i2Var, arrayList2);
                } else {
                    list2.add(f2Var2);
                }
            } else {
                f2Var = f2Var2;
            }
        }
        for (t23.i2 i2Var2 : hashMap.keySet()) {
            arrayList.add(i2Var2);
            arrayList.addAll((java.util.Collection) hashMap.get(i2Var2));
        }
        if (f2Var != null) {
            arrayList.add(new t23.i2("OCR", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.j5j)));
            f2Var.f415149d = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.j5i, str);
            arrayList.add(f2Var);
        }
        return arrayList;
    }

    public final t23.g2 e(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        t23.g2 g2Var = new t23.g2();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            g2Var.f415154a = jSONObject.optBoolean("ocr", false);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("cropArea");
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("cropType", 0);
                double optDouble = optJSONObject.optDouble("left", -1.0d);
                double optDouble2 = optJSONObject.optDouble("top", -1.0d);
                double optDouble3 = optJSONObject.optDouble("right", -1.0d);
                double optDouble4 = optJSONObject.optDouble("bottom", -1.0d);
                t23.j2 j2Var = new t23.j2();
                j2Var.f415193a = optInt;
                j2Var.f415194b = optDouble;
                j2Var.f415195c = optDouble2;
                j2Var.f415196d = optDouble3;
                j2Var.f415197e = optDouble4;
                j2Var.f415198f = str2;
                g2Var.f415155b = j2Var;
            }
            boolean z17 = true;
            if (3 != jSONObject.optInt("coverType", 1)) {
                z17 = false;
            }
            g2Var.f415156c = z17;
            g2Var.f415157d = jSONObject.optBoolean("favorite", false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SmartGalleryQueryUtil", "parse album json error, msg: %s.", e17.getMessage(), e17);
        }
        return g2Var;
    }

    public java.util.LinkedList f() {
        android.database.Cursor cursor;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context, "android.permission.READ_EXTERNAL_STORAGE", true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryQueryUtil", "queryAlbum without READ_EXTERNAL_STORAGE.");
            return a(arrayList);
        }
        tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar2).getClass();
        if (zo.e.b(context2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryQueryUtil", "queryAlbum without FULL_MEDIA_PERMISSION.");
            return a(arrayList);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryQueryUtil", "queryPrivateAlbums has permiss.");
        try {
            android.net.Uri build = f415216e.buildUpon().appendEncodedPath("private").build();
            android.content.ContentProviderClient acquireUnstableContentProviderClient = this.f415217a.acquireUnstableContentProviderClient(build);
            if (acquireUnstableContentProviderClient != null) {
                cursor = acquireUnstableContentProviderClient.query(build, b(), null, null, null);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.SmartGalleryQueryUtil", "queryPrivateAlbums, contentProviderClient null.");
                cursor = null;
            }
            if (cursor != null) {
                int columnIndex = cursor.getColumnIndex("categoryID");
                int columnIndex2 = cursor.getColumnIndex("categoryName");
                int columnIndex3 = cursor.getColumnIndex("albumID");
                int columnIndex4 = cursor.getColumnIndex("albumName");
                int columnIndex5 = cursor.getColumnIndex("albumCapacity");
                int columnIndex6 = cursor.getColumnIndex("coverID");
                int columnIndex7 = cursor.getColumnIndex("coverData");
                int columnIndex8 = cursor.getColumnIndex("albumTag");
                while (cursor.moveToNext()) {
                    t23.f2 f2Var = new t23.f2();
                    if (columnIndex == -1 || columnIndex2 == -1) {
                        i17 = columnIndex;
                    } else {
                        i17 = columnIndex;
                        f2Var.f415147b = new t23.i2(cursor.getString(columnIndex), cursor.getString(columnIndex2));
                    }
                    f2Var.f415148c = cursor.getString(columnIndex3);
                    f2Var.f415149d = cursor.getString(columnIndex4);
                    f2Var.f415150e = com.tencent.mm.sdk.platformtools.t8.D1(cursor.getString(columnIndex5), 0);
                    int i18 = columnIndex2;
                    f2Var.f415151f = com.tencent.mm.sdk.platformtools.t8.E1(cursor.getString(columnIndex6));
                    f2Var.f415152g = cursor.getString(columnIndex7);
                    if (columnIndex8 != -1) {
                        java.lang.String string = cursor.getString(columnIndex8);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                            f2Var.f415153h = e(string, f2Var.f415148c);
                        }
                    }
                    arrayList.add(f2Var);
                    columnIndex2 = i18;
                    columnIndex = i17;
                }
                cursor.close();
            }
            if (acquireUnstableContentProviderClient != null) {
                acquireUnstableContentProviderClient.close();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SmartGalleryQueryUtil", e17, null, new java.lang.Object[0]);
        }
        return a(arrayList);
    }
}
