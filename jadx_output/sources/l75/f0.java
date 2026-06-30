package l75;

/* loaded from: classes12.dex */
public abstract class f0 {
    public static final java.lang.String COL_ROWID = "rowid";
    public static final java.lang.String FIELD_PREFIX = "field_";
    public static final java.lang.String SYSTEM_ROWID_FIELD = "rowid";
    private static final java.lang.String TAG = "MicroMsg.SDK.IAutoDBItem";
    public long systemRowid = -1;

    /* JADX WARN: Removed duplicated region for block: B:53:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean checkIOEqual(android.content.ContentValues r10, android.database.Cursor r11) {
        /*
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L9
            if (r11 != 0) goto L7
            goto L8
        L7:
            r0 = r1
        L8:
            return r0
        L9:
            if (r11 == 0) goto Lc8
            int r2 = r11.getCount()
            if (r2 == r0) goto L13
            goto Lc8
        L13:
            r11.moveToFirst()
            int r2 = r11.getColumnCount()
            int r3 = r10.size()
            java.lang.String r4 = "rowid"
            boolean r5 = r10.containsKey(r4)
            if (r5 == 0) goto L29
            int r3 = r3 + (-1)
        L29:
            int r5 = r11.getColumnIndex(r4)
            r6 = -1
            if (r5 == r6) goto L32
            int r2 = r2 + (-1)
        L32:
            if (r3 == r2) goto L35
            return r1
        L35:
            java.util.Set r2 = r10.valueSet()     // Catch: java.lang.Exception -> Lbe
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Lbe
        L3d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> Lbe
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> Lbe
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Exception -> Lbe
            java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> Lbe
            boolean r5 = r3.equals(r4)     // Catch: java.lang.Exception -> Lbe
            if (r5 == 0) goto L56
            goto L3d
        L56:
            int r5 = r11.getColumnIndex(r3)     // Catch: java.lang.Exception -> Lbe
            if (r5 != r6) goto L5d
            return r1
        L5d:
            java.lang.Object r7 = r10.get(r3)     // Catch: java.lang.Exception -> Lbe
            boolean r7 = r7 instanceof byte[]     // Catch: java.lang.Exception -> Lbe
            if (r7 == 0) goto L96
            java.lang.Object r3 = r10.get(r3)     // Catch: java.lang.Exception -> Lbe
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Exception -> Lbe
            byte[] r5 = r11.getBlob(r5)     // Catch: java.lang.Exception -> Lbe
            if (r3 != 0) goto L75
            if (r5 != 0) goto L75
        L73:
            r3 = r0
            goto L93
        L75:
            if (r3 != 0) goto L7b
            if (r5 == 0) goto L7b
        L79:
            r3 = r1
            goto L93
        L7b:
            if (r3 == 0) goto L80
            if (r5 != 0) goto L80
            goto L79
        L80:
            int r7 = r3.length     // Catch: java.lang.Exception -> Lbe
            int r8 = r5.length     // Catch: java.lang.Exception -> Lbe
            if (r7 == r8) goto L85
            goto L79
        L85:
            r7 = r1
        L86:
            int r8 = r3.length     // Catch: java.lang.Exception -> Lbe
            if (r7 >= r8) goto L73
            r8 = r3[r7]     // Catch: java.lang.Exception -> Lbe
            r9 = r5[r7]     // Catch: java.lang.Exception -> Lbe
            if (r8 == r9) goto L90
            goto L79
        L90:
            int r7 = r7 + 1
            goto L86
        L93:
            if (r3 != 0) goto L3d
            return r1
        L96:
            java.lang.String r7 = r11.getString(r5)     // Catch: java.lang.Exception -> Lbe
            if (r7 != 0) goto La3
            java.lang.Object r7 = r10.get(r3)     // Catch: java.lang.Exception -> Lbe
            if (r7 == 0) goto La3
            return r1
        La3:
            java.lang.Object r7 = r10.get(r3)     // Catch: java.lang.Exception -> Lbe
            if (r7 != 0) goto Laa
            return r1
        Laa:
            java.lang.Object r3 = r10.get(r3)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r5 = r11.getString(r5)     // Catch: java.lang.Exception -> Lbe
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Exception -> Lbe
            if (r3 != 0) goto L3d
            return r1
        Lbd:
            return r0
        Lbe:
            r10 = move-exception
            java.lang.String r11 = ""
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "MicroMsg.SDK.IAutoDBItem"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r10, r11, r0)
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l75.f0.checkIOEqual(android.content.ContentValues, android.database.Cursor):boolean");
    }

    public static java.lang.String getColName(java.lang.reflect.Field field) {
        java.lang.String name;
        if (field == null || (name = field.getName()) == null || name.length() <= 0) {
            return null;
        }
        return name.startsWith(FIELD_PREFIX) ? name.substring(6) : name;
    }

    public static android.database.Cursor getCursorForProjection(android.content.ContentValues contentValues, java.lang.String[] strArr) {
        int length = strArr.length;
        java.lang.Object[] objArr = new java.lang.Object[length];
        for (int i17 = 0; i17 < length; i17++) {
            objArr[i17] = contentValues.get(strArr[i17]);
        }
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(strArr);
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    public static java.lang.reflect.Field[] getValidFields(java.lang.Class<?> cls) {
        return initAutoDBInfo(cls).f316952a;
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        int i17;
        java.lang.String str;
        l75.e0 e0Var = new l75.e0();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
            int modifiers = field.getModifiers();
            java.lang.String name = field.getName();
            if (name != null && java.lang.reflect.Modifier.isPublic(modifiers) && !java.lang.reflect.Modifier.isFinal(modifiers)) {
                java.lang.String substring = name.startsWith(FIELD_PREFIX) ? name.substring(6) : name;
                if (field.isAnnotationPresent(l75.m0.class)) {
                    if (((l75.m0) field.getAnnotation(l75.m0.class)).primaryKey() == 1) {
                        e0Var.f316953b = substring;
                    }
                } else if (!name.startsWith(FIELD_PREFIX)) {
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(substring)) {
                    if (substring.equals("rowid")) {
                        iz5.a.g("field_rowid reserved by MAutoDBItem, change now!", false);
                    }
                    linkedList.add(field);
                }
            }
        }
        java.lang.reflect.Field[] fieldArr = (java.lang.reflect.Field[]) linkedList.toArray(new java.lang.reflect.Field[0]);
        e0Var.f316952a = fieldArr;
        java.lang.String[] strArr = new java.lang.String[fieldArr.length + 1];
        for (int i18 = 0; i18 < fieldArr.length; i18++) {
            strArr[i18] = getColName(fieldArr[i18]);
            iz5.a.g("getFullColumns failed:" + fieldArr[i18].getName(), !com.tencent.mm.sdk.platformtools.t8.K0(strArr[i18]));
        }
        strArr[fieldArr.length] = "rowid";
        e0Var.f316954c = strArr;
        java.lang.reflect.Field[] fieldArr2 = e0Var.f316952a;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.reflect.Field field2 : fieldArr2) {
            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) l75.d0.f316944a).get(field2.getType());
            if (str2 == null) {
                com.tencent.mars.xlog.Log.e(TAG, "failed identify on column: " + field2.getName() + ", skipped");
            } else {
                java.lang.String colName = getColName(field2);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(colName)) {
                    hashMap.put(colName, str2);
                }
            }
        }
        e0Var.f316955d = hashMap;
        java.lang.reflect.Field[] fieldArr3 = e0Var.f316952a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i19 = 0;
        while (i19 < fieldArr3.length) {
            java.lang.reflect.Field field3 = fieldArr3[i19];
            java.lang.String str3 = (java.lang.String) ((java.util.HashMap) l75.d0.f316944a).get(field3.getType());
            if (str3 == null) {
                com.tencent.mars.xlog.Log.e(TAG, "failed identify on column: " + field3.getName() + ", skipped");
            } else {
                java.lang.String colName2 = getColName(field3);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(colName2)) {
                    if (field3.isAnnotationPresent(l75.m0.class)) {
                        str = " default '" + ((l75.m0) field3.getAnnotation(l75.m0.class)).defValue() + "' ";
                        i17 = ((l75.m0) field3.getAnnotation(l75.m0.class)).primaryKey();
                    } else {
                        i17 = 0;
                        str = "";
                    }
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(colName2);
                    sb7.append(" ");
                    sb7.append(str3);
                    sb7.append(str);
                    sb7.append(i17 == 1 ? " PRIMARY KEY " : "");
                    sb6.append(sb7.toString());
                    sb6.append(i19 != fieldArr3.length - 1 ? ", " : "");
                }
            }
            i19++;
        }
        e0Var.f316956e = sb6.toString();
        return e0Var;
    }

    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
    }

    public abstract void convertFrom(android.database.Cursor cursor);

    public abstract android.content.ContentValues convertTo();

    public void createMyTable(l75.k0 k0Var) {
    }

    public abstract l75.e0 getDBInfo();

    public o75.e getObserverOwner() {
        return new o75.e();
    }

    public java.lang.Object getPrimaryKeyValue() {
        return "";
    }

    public p75.n0 getTable() {
        return new p75.n0(getTableName());
    }

    public java.lang.String getTableName() {
        return "";
    }

    public java.lang.Object toJSON() {
        return "";
    }
}
