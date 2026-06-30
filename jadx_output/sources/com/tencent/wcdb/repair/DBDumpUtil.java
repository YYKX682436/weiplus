package com.tencent.wcdb.repair;

/* loaded from: classes12.dex */
public class DBDumpUtil {
    private static final java.lang.String TAG = "WCDB.DBDumpUtil";

    /* loaded from: classes12.dex */
    public interface ExecuteSqlCallback {
        java.lang.String preExecute(java.lang.String str);
    }

    public static java.lang.String buildColumnsString(java.util.ArrayList<java.lang.String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            sb6.append(arrayList.get(i17));
            if (i17 != arrayList.size() - 1) {
                sb6.append(",");
            }
        }
        sb6.append(")");
        java.lang.String sb7 = sb6.toString();
        java.lang.System.out.println(sb7);
        return sb7;
    }

    public static boolean doRecoveryDb(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return doRecoveryDb(sQLiteDatabase, str, str2, str3, null, null, null, true);
    }

    public static java.util.ArrayList<java.lang.String> getColumnNamesFromSql(java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.lang.String[] split = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")")).trim().split(",");
        for (int i17 = 0; i17 < split.length; i17++) {
            java.lang.String trim = split[i17].trim();
            split[i17] = trim;
            arrayList.add(split[i17].substring(0, trim.indexOf(" ")));
        }
        return arrayList;
    }

    public static java.lang.String getTableNameFromSql(java.lang.String str) {
        if (str.length() > 100) {
            str = str.substring(0, 100);
        }
        java.lang.String[] split = str.split("\\s");
        if (split == null || split.length <= 1) {
            return null;
        }
        return split[2].replaceAll("\"", "");
    }

    private static native boolean nativeDumpDB(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private static native boolean nativeIsSqlComplete(java.lang.String str);

    public static byte[] readFromFile(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        int length;
        java.io.File file = new java.io.File(str);
        java.io.FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            com.tencent.wcdb.support.Log.w(TAG, "readFromFile error, file is not exit, path = %s", str);
            return null;
        }
        try {
            length = (int) file.length();
            fileInputStream = new java.io.FileInputStream(file);
        } catch (java.lang.Exception unused) {
            fileInputStream = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            byte[] bArr = new byte[length];
            int read = fileInputStream.read(bArr);
            if (read == length) {
                try {
                    fileInputStream.close();
                } catch (java.io.IOException unused2) {
                }
                return bArr;
            }
            com.tencent.wcdb.support.Log.w(TAG, "readFromFile error, size is not equal, path = %s, file length is %d, count is %d", str, java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(read));
            try {
                fileInputStream.close();
            } catch (java.io.IOException unused3) {
            }
            return null;
        } catch (java.lang.Exception unused4) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (java.io.IOException unused5) {
                }
            }
            com.tencent.wcdb.support.Log.e(TAG, "readFromFile failed!");
            return null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.io.IOException unused6) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        if (r12.startsWith("CREATE TABLE") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f4, code lost:
    
        r7.put(r8, buildColumnsString(getColumnNamesFromSql(r12)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0133, code lost:
    
        if (r23 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        r5 = r23.preExecute(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013f, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0141, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
    
        r11 = r11 + 1;
        r17.execSQL(r12);
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014b, code lost:
    
        if (r13 < 100) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014d, code lost:
    
        r17.setTransactionSuccessful();
        r17.endTransaction();
        r17.beginTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0156, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013a, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0106, code lost:
    
        if (r12.startsWith("INSERT INTO") == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0108, code lost:
    
        r5 = (java.lang.String) r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0112, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0114, code lost:
    
        r9 = new java.lang.StringBuilder("INSERT INTO ");
        r9.append("\"");
        r9.append(r8);
        r9.append("\"");
        r8 = r9.toString();
        r9.append(r5);
        r12 = r12.replace(r8, r9.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1 A[Catch: all -> 0x01ca, IOException -> 0x01cc, TRY_LEAVE, TryCatch #6 {IOException -> 0x01cc, blocks: (B:13:0x002e, B:15:0x0038, B:105:0x0048, B:107:0x0060, B:44:0x008e, B:46:0x0094, B:47:0x009c, B:49:0x00a2, B:55:0x00e1, B:87:0x00b5, B:89:0x00bb, B:90:0x00c3, B:92:0x00c9, B:19:0x0069, B:21:0x0073, B:29:0x007e, B:31:0x0084, B:35:0x015e, B:40:0x0166), top: B:12:0x002e, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee A[EDGE_INSN: B:58:0x00ee->B:59:0x00ee BREAK  A[LOOP:1: B:15:0x0038->B:26:0x0038], EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean doRecoveryDb(com.tencent.wcdb.database.SQLiteDatabase r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List<java.lang.String> r21, java.util.List<java.lang.String> r22, com.tencent.wcdb.repair.DBDumpUtil.ExecuteSqlCallback r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.repair.DBDumpUtil.doRecoveryDb(com.tencent.wcdb.database.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, com.tencent.wcdb.repair.DBDumpUtil$ExecuteSqlCallback, boolean):boolean");
    }
}
