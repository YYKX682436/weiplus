package h36;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f278585a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.TreeMap f278586b = new java.util.TreeMap();

    public e(android.content.Context context) {
        this.f278585a = context;
    }

    public static java.util.TreeMap a(java.lang.String str) {
        int indexOf;
        int i17;
        int indexOf2;
        int i18;
        if (str != null && !str.equals("null")) {
            try {
                java.util.TreeMap treeMap = new java.util.TreeMap();
                java.lang.String substring = str.substring(1, str.length() - 1);
                if (substring.trim().length() == 0) {
                    return treeMap;
                }
                for (int i19 = 0; i19 < substring.length() && (indexOf = substring.indexOf("\"", i19)) != -1 && (indexOf2 = substring.indexOf("\"", (i17 = indexOf + 1))) != -1; i19 = i18) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Long.parseLong(substring.substring(i17, indexOf2)));
                    int indexOf3 = substring.indexOf("{", indexOf2);
                    if (indexOf3 == -1) {
                        break;
                    }
                    i18 = indexOf3 + 1;
                    int i27 = 1;
                    while (i18 < substring.length() && i27 > 0) {
                        if (substring.charAt(i18) == '{') {
                            i27++;
                        } else if (substring.charAt(i18) == '}') {
                            i27--;
                        }
                        i18++;
                    }
                    oicq.wlogin_sdk.request.WloginAllSigInfo b17 = b(substring.substring(indexOf3, i18));
                    if (b17 != null) {
                        treeMap.put(valueOf, b17);
                    }
                }
                return treeMap;
            } catch (java.lang.Exception e17) {
                oicq.wlogin_sdk.tools.util.d("JsonToTreeMap", "parse failed: " + e17.getMessage());
            }
        }
        return null;
    }

    public static oicq.wlogin_sdk.request.WloginAllSigInfo b(java.lang.String str) {
        int indexOf;
        int i17;
        int indexOf2;
        int i18;
        if (str != null && !str.equals("null")) {
            try {
                oicq.wlogin_sdk.request.WloginAllSigInfo wloginAllSigInfo = new oicq.wlogin_sdk.request.WloginAllSigInfo();
                int indexOf3 = str.indexOf("\"_useInfo\":");
                if (indexOf3 != -1) {
                    int indexOf4 = str.indexOf("{", indexOf3);
                    wloginAllSigInfo._useInfo = d(str.substring(indexOf4, str.indexOf("}", indexOf4) + 1));
                }
                int indexOf5 = str.indexOf("\"_uin\":");
                if (indexOf5 != -1) {
                    int i19 = indexOf5 + 7;
                    int indexOf6 = str.indexOf(",", i19);
                    if (indexOf6 == -1) {
                        indexOf6 = str.indexOf("}", i19);
                    }
                    wloginAllSigInfo._uin = java.lang.Long.parseLong(str.substring(i19, indexOf6).trim());
                }
                int indexOf7 = str.indexOf("\"_tk_map\":{");
                if (indexOf7 != -1) {
                    java.lang.String substring = str.substring(str.indexOf("{", indexOf7 + 10) + 1, str.lastIndexOf("}"));
                    for (int i27 = 0; i27 < substring.length() && (indexOf = substring.indexOf("\"", i27)) != -1 && (indexOf2 = substring.indexOf("\"", (i17 = indexOf + 1))) != -1; i27 = i18) {
                        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Long.parseLong(substring.substring(i17, indexOf2)));
                        int indexOf8 = substring.indexOf("{", indexOf2);
                        if (indexOf8 == -1) {
                            break;
                        }
                        i18 = indexOf8 + 1;
                        int i28 = 1;
                        while (i18 < substring.length() && i28 > 0) {
                            if (substring.charAt(i18) == '{') {
                                i28++;
                            } else if (substring.charAt(i18) == '}') {
                                i28--;
                            }
                            i18++;
                        }
                        oicq.wlogin_sdk.sharemem.WloginSigInfo c17 = c(substring.substring(indexOf8, i18));
                        if (c17 != null) {
                            wloginAllSigInfo._tk_map.put(valueOf, c17);
                        }
                    }
                }
                return wloginAllSigInfo;
            } catch (java.lang.Exception e17) {
                oicq.wlogin_sdk.tools.util.d("JsonToWloginAllSigInfo", "parse failed: " + e17.getMessage());
            }
        }
        return null;
    }

    public static oicq.wlogin_sdk.sharemem.WloginSigInfo c(java.lang.String str) {
        if (str == null || str.equals("null")) {
            return null;
        }
        try {
            byte[] bArr = new byte[0];
            byte[] bArr2 = new byte[0];
            byte[] bArr3 = new byte[0];
            byte[] bArr4 = new byte[0];
            byte[] bArr5 = new byte[0];
            byte[] bArr6 = new byte[0];
            byte[] bArr7 = new byte[0];
            byte[] bArr8 = new byte[0];
            byte[] bArr9 = new byte[0];
            byte[] bArr10 = new byte[0];
            byte[] bArr11 = new byte[0];
            byte[] bArr12 = new byte[0];
            byte[] bArr13 = new byte[0];
            byte[] bArr14 = new byte[0];
            byte[] bArr15 = new byte[0];
            byte[] bArr16 = new byte[0];
            byte[] bArr17 = new byte[0];
            byte[] bArr18 = new byte[0];
            byte[] bArr19 = new byte[0];
            long j17 = 0;
            long j18 = 0;
            long j19 = 0;
            long j27 = 0;
            long j28 = 0;
            for (java.lang.String str2 : str.substring(1, str.length() - 1).split(",(?=\\\"[^\\\"]*\\\":)")) {
                java.lang.String[] split = str2.split(":", 2);
                if (split.length == 2) {
                    java.lang.String replace = split[0].trim().replace("\"", "");
                    java.lang.String trim = split[1].trim();
                    if (!replace.equals("_expire_time") && !replace.equals("_A2_expire_time") && !replace.equals("_create_time") && !replace.equals("_app_pri") && !replace.equals("_ret_appid")) {
                        if (trim.startsWith("\"") && trim.endsWith("\"")) {
                            trim = trim.substring(1, trim.length() - 1);
                        }
                        byte[] f17 = f(trim);
                        if (replace.equals("_TGT")) {
                            bArr8 = f17;
                        } else if (replace.equals("_TGTKey")) {
                            bArr9 = f17;
                        } else if (replace.equals("_userStSig")) {
                            bArr10 = f17;
                        } else if (replace.equals("_userSt_Key")) {
                            bArr11 = f17;
                        } else if (replace.equals("_userStWebSig")) {
                            bArr12 = f17;
                        } else if (!replace.equals("_userPasswdSig")) {
                            if (replace.equals("_userA5")) {
                                bArr13 = f17;
                            } else if (replace.equals("_userA8")) {
                                bArr14 = f17;
                            } else if (replace.equals("_lsKey")) {
                                bArr15 = f17;
                            } else if (replace.equals("_sKey")) {
                                bArr16 = f17;
                            } else if (replace.equals("_userSig64")) {
                                bArr17 = f17;
                            } else if (replace.equals("_openid")) {
                                bArr18 = f17;
                            } else if (replace.equals("_openkey")) {
                                bArr19 = f17;
                            } else if (replace.equals("_noPicSig")) {
                                bArr = f17;
                            } else if (replace.equals("_vkey")) {
                                bArr2 = f17;
                            } else if (replace.equals("_en_A1")) {
                                bArr3 = f17;
                            } else if (replace.equals("_access_token")) {
                                bArr4 = f17;
                            } else if (replace.equals("_D2")) {
                                bArr5 = f17;
                            } else if (replace.equals("_D2Key")) {
                                bArr6 = f17;
                            } else if (replace.equals("_sid")) {
                                bArr7 = f17;
                            }
                        }
                    }
                    long parseLong = java.lang.Long.parseLong(trim);
                    if (replace.equals("_expire_time")) {
                        j19 = parseLong;
                    } else if (replace.equals("_A2_expire_time")) {
                        j27 = parseLong;
                    } else if (replace.equals("_create_time")) {
                        j18 = parseLong;
                    } else if (replace.equals("_app_pri")) {
                        j28 = parseLong;
                    } else if (replace.equals("_ret_appid")) {
                        j17 = parseLong;
                    }
                }
            }
            oicq.wlogin_sdk.sharemem.WloginSigInfo wloginSigInfo = new oicq.wlogin_sdk.sharemem.WloginSigInfo(j28, j18, j19, j27, bArr8, bArr9, bArr10, bArr11, bArr12, bArr13, bArr14, bArr15, bArr16, bArr17, bArr18, bArr19, new byte[][]{bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr});
            wloginSigInfo._ret_appid = j17;
            return wloginSigInfo;
        } catch (java.lang.Exception e17) {
            oicq.wlogin_sdk.tools.util.d("JsonToWloginSigInfo", "parse failed: " + e17.getMessage());
            return null;
        }
    }

    public static oicq.wlogin_sdk.sharemem.WloginSimpleInfo d(java.lang.String str) {
        if (str == null || str.equals("null")) {
            return new oicq.wlogin_sdk.sharemem.WloginSimpleInfo();
        }
        try {
            oicq.wlogin_sdk.sharemem.WloginSimpleInfo wloginSimpleInfo = new oicq.wlogin_sdk.sharemem.WloginSimpleInfo();
            for (java.lang.String str2 : str.substring(1, str.length() - 1).split(",(?=\\\"[^\\\"]*\\\":)")) {
                java.lang.String[] split = str2.split(":", 2);
                if (split.length == 2) {
                    java.lang.String replace = split[0].trim().replace("\"", "");
                    java.lang.String trim = split[1].trim();
                    if (trim.startsWith("\"") && trim.endsWith("\"")) {
                        trim = trim.substring(1, trim.length() - 1);
                    }
                    if (replace.equals("_uin")) {
                        wloginSimpleInfo._uin = java.lang.Long.parseLong(trim);
                    } else if (replace.equals("_face")) {
                        wloginSimpleInfo._face = f(trim);
                    } else if (replace.equals("_age")) {
                        wloginSimpleInfo._age = f(trim);
                    } else if (replace.equals("_gender")) {
                        wloginSimpleInfo._gender = f(trim);
                    } else if (replace.equals("_nick")) {
                        wloginSimpleInfo._nick = f(trim);
                    }
                }
            }
            return wloginSimpleInfo;
        } catch (java.lang.Exception e17) {
            oicq.wlogin_sdk.tools.util.d("JsonToWloginSimpleInfo", "parse failed: " + e17.getMessage());
            return new oicq.wlogin_sdk.sharemem.WloginSimpleInfo();
        }
    }

    public static java.lang.String e(java.util.TreeMap treeMap) {
        java.lang.String sb6;
        java.lang.String str;
        java.lang.String sb7;
        if (treeMap == null) {
            return "null";
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("{");
        boolean z17 = true;
        for (java.lang.Long l17 : treeMap.keySet()) {
            oicq.wlogin_sdk.request.WloginAllSigInfo wloginAllSigInfo = (oicq.wlogin_sdk.request.WloginAllSigInfo) treeMap.get(l17);
            if (!z17) {
                sb8.append(",");
            }
            java.lang.String str2 = "\"";
            sb8.append("\"");
            sb8.append(l17);
            sb8.append("\":");
            if (wloginAllSigInfo == null) {
                sb6 = "null";
            } else {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("{\"_useInfo\":");
                oicq.wlogin_sdk.sharemem.WloginSimpleInfo wloginSimpleInfo = wloginAllSigInfo._useInfo;
                sb9.append(wloginSimpleInfo == null ? "null" : "{\"_uin\":" + wloginSimpleInfo._uin + ",\"_face\":\"" + h(g(wloginSimpleInfo._face)) + "\",\"_age\":\"" + h(g(wloginSimpleInfo._age)) + "\",\"_gender\":\"" + h(g(wloginSimpleInfo._gender)) + "\",\"_nick\":\"" + h(g(wloginSimpleInfo._nick)) + "\"}");
                sb9.append(",\"_uin\":");
                sb9.append(wloginAllSigInfo._uin);
                sb9.append(",\"_tk_map\":{");
                boolean z18 = true;
                for (java.lang.Long l18 : wloginAllSigInfo._tk_map.keySet()) {
                    oicq.wlogin_sdk.sharemem.WloginSigInfo wloginSigInfo = wloginAllSigInfo._tk_map.get(l18);
                    if (!z18) {
                        sb9.append(",");
                    }
                    sb9.append(str2);
                    sb9.append(l18);
                    sb9.append("\":");
                    if (wloginSigInfo == null) {
                        sb7 = "null";
                        str = str2;
                    } else {
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("{\"_TGT\":\"");
                        sb10.append(h(g(wloginSigInfo._TGT)));
                        sb10.append("\",\"_TGTKey\":\"");
                        sb10.append(h(g(wloginSigInfo._TGTKey)));
                        sb10.append("\",\"_userStSig\":\"");
                        sb10.append(h(g(wloginSigInfo._userStSig)));
                        sb10.append("\",\"_userSt_Key\":\"");
                        sb10.append(h(g(wloginSigInfo._userSt_Key)));
                        sb10.append("\",\"_userStWebSig\":\"");
                        sb10.append(h(g(wloginSigInfo._userStWebSig)));
                        sb10.append("\",\"_userPasswdSig\":\"");
                        sb10.append(h(g(wloginSigInfo._userPasswdSig)));
                        sb10.append("\",\"_userA5\":\"");
                        sb10.append(h(g(wloginSigInfo._userA5)));
                        sb10.append("\",\"_userA8\":\"");
                        sb10.append(h(g(wloginSigInfo._userA8)));
                        sb10.append("\",\"_lsKey\":\"");
                        sb10.append(h(g(wloginSigInfo._lsKey)));
                        sb10.append("\",\"_sKey\":\"");
                        sb10.append(h(g(wloginSigInfo._sKey)));
                        sb10.append("\",\"_userSig64\":\"");
                        sb10.append(h(g(wloginSigInfo._userSig64)));
                        sb10.append("\",\"_openid\":\"");
                        sb10.append(h(g(wloginSigInfo._openid)));
                        sb10.append("\",\"_openkey\":\"");
                        sb10.append(h(g(wloginSigInfo._openkey)));
                        sb10.append("\",\"_noPicSig\":\"");
                        sb10.append(h(g(wloginSigInfo._noPicSig)));
                        sb10.append("\",\"_vkey\":\"");
                        sb10.append(h(g(wloginSigInfo._vkey)));
                        sb10.append("\",\"_en_A1\":\"");
                        sb10.append(h(g(wloginSigInfo._en_A1)));
                        sb10.append("\",\"_access_token\":\"");
                        sb10.append(h(g(wloginSigInfo._access_token)));
                        sb10.append("\",\"_D2\":\"");
                        sb10.append(h(g(wloginSigInfo._D2)));
                        sb10.append("\",\"_D2Key\":\"");
                        sb10.append(h(g(wloginSigInfo._D2Key)));
                        sb10.append("\",\"_sid\":\"");
                        sb10.append(h(g(wloginSigInfo._sid)));
                        sb10.append("\",\"_expire_time\":");
                        str = str2;
                        sb10.append(wloginSigInfo._expire_time);
                        sb10.append(",\"_A2_expire_time\":");
                        sb10.append(wloginSigInfo._A2_expire_time);
                        sb10.append(",\"_create_time\":");
                        sb10.append(wloginSigInfo._create_time);
                        sb10.append(",\"_app_pri\":");
                        sb10.append(wloginSigInfo._app_pri);
                        sb10.append(",\"_ret_appid\":");
                        sb10.append(wloginSigInfo._ret_appid);
                        sb10.append("}");
                        sb7 = sb10.toString();
                    }
                    sb9.append(sb7);
                    z18 = false;
                    str2 = str;
                }
                sb9.append("}}");
                sb6 = sb9.toString();
            }
            sb8.append(sb6);
            z17 = false;
        }
        sb8.append("}");
        return sb8.toString();
    }

    public static byte[] f(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new byte[0];
        }
        try {
            return android.util.Base64.decode(str, 2);
        } catch (java.lang.Exception e17) {
            oicq.wlogin_sdk.tools.util.d("base64ToByteArray", "decode failed: " + e17.getMessage());
            return new byte[0];
        }
    }

    public static java.lang.String g(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? "" : android.util.Base64.encodeToString(bArr, 2);
    }

    public static java.lang.String h(java.lang.String str) {
        java.lang.String str2;
        if (str == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < str.length(); i17++) {
            char charAt = str.charAt(i17);
            if (charAt == '\f') {
                str2 = "\\f";
            } else if (charAt == '\r') {
                str2 = "\\r";
            } else if (charAt == '\"') {
                str2 = "\\\"";
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        str2 = "\\b";
                        break;
                    case '\t':
                        str2 = "\\t";
                        break;
                    case '\n':
                        str2 = "\\n";
                        break;
                    default:
                        if (charAt < ' ') {
                            str2 = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(charAt));
                            break;
                        } else {
                            sb6.append(charAt);
                            break;
                        }
                }
            } else {
                str2 = "\\\\";
            }
            sb6.append(str2);
        }
        return sb6.toString();
    }

    public static byte[] j(android.content.Context context, java.lang.String str) {
        h36.a aVar;
        android.database.Cursor cursor;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        try {
            aVar = new h36.a(context, str, null, 1);
        } catch (java.lang.Exception e17) {
            e = e17;
            aVar = null;
        }
        try {
            android.database.sqlite.SQLiteDatabase readableDatabase = aVar.getReadableDatabase();
            try {
                cursor = readableDatabase.rawQuery("select count(*) from sqlite_master where type ='table' and name ='" + str + "' ", null);
                try {
                    if (cursor.moveToNext() && cursor.getInt(0) > 0) {
                        bool = java.lang.Boolean.TRUE;
                    }
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                    if (!bool.booleanValue()) {
                        aVar.close();
                        return null;
                    }
                    android.database.Cursor query = readableDatabase.query(str, new java.lang.String[]{str}, "ID=0", null, null, null, null);
                    if (query.getCount() == 0) {
                        query.close();
                        aVar.close();
                        return null;
                    }
                    query.moveToFirst();
                    byte[] blob = query.getBlob(0);
                    query.close();
                    aVar.close();
                    return blob;
                } catch (android.database.SQLException e18) {
                    e = e18;
                    oicq.wlogin_sdk.tools.util.u(e);
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    aVar.close();
                    return null;
                }
            } catch (android.database.SQLException e19) {
                e = e19;
                cursor = null;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            oicq.wlogin_sdk.tools.util.u(e);
            if (aVar != null) {
                aVar.close();
            }
            return null;
        }
    }

    public static void n(long j17, java.util.TreeMap treeMap) {
        if (treeMap == null) {
            return;
        }
        try {
            if (0 != j17) {
                oicq.wlogin_sdk.tools.util.c("[" + j17 + "] allsig: " + ((oicq.wlogin_sdk.request.WloginAllSigInfo) treeMap.get(java.lang.Long.valueOf(j17)))._tk_map);
                return;
            }
            for (java.lang.Object obj : treeMap.keySet()) {
                oicq.wlogin_sdk.tools.util.c("[" + obj + "] allsig: " + ((oicq.wlogin_sdk.request.WloginAllSigInfo) treeMap.get(obj))._tk_map);
            }
        } catch (java.lang.Exception e17) {
            oicq.wlogin_sdk.tools.util.v("printTreeMapInfo-sig", e17);
        }
    }

    public static int r(android.content.Context context, java.lang.String str, byte[] bArr) {
        h36.a aVar = null;
        try {
            h36.a aVar2 = new h36.a(context, str, null, 1);
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = aVar2.getWritableDatabase();
                try {
                    writableDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + str + " (ID INTEGER PRIMARY KEY, " + str + " BLOB);");
                    android.database.Cursor query = writableDatabase.query(str, new java.lang.String[]{"ID"}, "ID=0", null, null, null, null);
                    if (query.getCount() == 0) {
                        try {
                            writableDatabase.execSQL("insert into " + str + " (ID, " + str + ") values (?,?);", new java.lang.Object[]{0, new byte[1]});
                        } catch (android.database.SQLException e17) {
                            oicq.wlogin_sdk.tools.util.u(e17);
                            query.close();
                            aVar2.close();
                            return -1022;
                        }
                    }
                    writableDatabase.execSQL("update " + str + " set " + str + " =? where ID=0", new java.lang.Object[]{bArr});
                    query.close();
                    aVar2.close();
                    return 0;
                } catch (android.database.SQLException e18) {
                    oicq.wlogin_sdk.tools.util.u(e18);
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                aVar = aVar2;
                oicq.wlogin_sdk.tools.util.u(e);
                if (aVar != null) {
                    aVar.close();
                }
                return -1022;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
        }
    }

    public synchronized oicq.wlogin_sdk.request.WloginAllSigInfo i(long j17) {
        oicq.wlogin_sdk.tools.util.b("get_all_siginfo", "uin=" + j17);
        oicq.wlogin_sdk.request.WloginAllSigInfo wloginAllSigInfo = (oicq.wlogin_sdk.request.WloginAllSigInfo) this.f278586b.get(new java.lang.Long(j17));
        if (wloginAllSigInfo != null) {
            return wloginAllSigInfo;
        }
        android.content.Context context = this.f278585a;
        if (context == null) {
            return null;
        }
        java.util.TreeMap l17 = l(context, "tk_file");
        if (l17 == null) {
            return null;
        }
        oicq.wlogin_sdk.request.WloginAllSigInfo wloginAllSigInfo2 = (oicq.wlogin_sdk.request.WloginAllSigInfo) l17.get(new java.lang.Long(j17));
        if (wloginAllSigInfo2 == null) {
            oicq.wlogin_sdk.tools.util.b("get_all_siginfo", "null");
            return null;
        }
        this.f278586b.put(new java.lang.Long(j17), wloginAllSigInfo2);
        return wloginAllSigInfo2.get_clone();
    }

    public synchronized oicq.wlogin_sdk.sharemem.WloginSigInfo k(long j17, long j18) {
        oicq.wlogin_sdk.tools.util.b("get_siginfo", "uin=" + j17 + "appid=" + j18);
        oicq.wlogin_sdk.request.WloginAllSigInfo i17 = i(j17);
        if (i17 == null) {
            return null;
        }
        oicq.wlogin_sdk.sharemem.WloginSigInfo wloginSigInfo = i17._tk_map.get(new java.lang.Long(j18));
        if (wloginSigInfo == null) {
            return null;
        }
        return wloginSigInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179 A[Catch: all -> 0x01b8, TryCatch #5 {, blocks: (B:4:0x0005, B:9:0x000d, B:77:0x0036, B:61:0x004b, B:63:0x0051, B:65:0x0054, B:69:0x007b, B:73:0x008a, B:45:0x0091, B:47:0x0097, B:49:0x009a, B:53:0x00c5, B:57:0x00d4, B:29:0x00db, B:31:0x00e1, B:33:0x00e4, B:37:0x010f, B:17:0x0126, B:21:0x0158, B:24:0x0167, B:41:0x011e, B:80:0x0044, B:84:0x016d, B:86:0x0179, B:89:0x0180, B:91:0x0188, B:95:0x019e), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188 A[Catch: all -> 0x01b8, TryCatch #5 {, blocks: (B:4:0x0005, B:9:0x000d, B:77:0x0036, B:61:0x004b, B:63:0x0051, B:65:0x0054, B:69:0x007b, B:73:0x008a, B:45:0x0091, B:47:0x0097, B:49:0x009a, B:53:0x00c5, B:57:0x00d4, B:29:0x00db, B:31:0x00e1, B:33:0x00e4, B:37:0x010f, B:17:0x0126, B:21:0x0158, B:24:0x0167, B:41:0x011e, B:80:0x0044, B:84:0x016d, B:86:0x0179, B:89:0x0180, B:91:0x0188, B:95:0x019e), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.TreeMap l(android.content.Context r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h36.e.l(android.content.Context, java.lang.String):java.util.TreeMap");
    }

    public synchronized java.util.TreeMap m(android.content.Context context, java.lang.String str) {
        byte[] j17;
        java.util.TreeMap treeMap = null;
        try {
            j17 = j(context, str);
        } catch (java.lang.Exception e17) {
            oicq.wlogin_sdk.tools.util.v("loadTKTreeMapBak", e17);
        }
        if (j17 != null && j17.length != 0) {
            byte[] a17 = k36.e.a(j17, 0, j17.length, h36.h.A);
            if (a17 != null && a17.length != 0) {
                java.lang.String str2 = new java.lang.String(a17, com.tencent.mapsdk.internal.rv.f51270c);
                oicq.wlogin_sdk.tools.util.c("loadTKTreeMapBak data to json len:" + str2.length());
                java.util.TreeMap a18 = a(str2);
                if (a18 == null) {
                    oicq.wlogin_sdk.tools.util.d("loadTKTreeMapBak", "JsonToTreeMap failed");
                }
                treeMap = a18;
                return treeMap;
            }
            oicq.wlogin_sdk.tools.util.d("loadTKTreeMapBak", "decrypt failed");
            return null;
        }
        oicq.wlogin_sdk.tools.util.d("loadTKTreeMapBak", "get_from_db failed or empty data");
        return null;
    }

    public synchronized int o(long j17, long j18, long j19, long j27, long j28, long j29, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[] bArr13, byte[] bArr14, byte[] bArr15, byte[] bArr16, byte[][] bArr17) {
        int put_siginfo;
        oicq.wlogin_sdk.sharemem.WloginSigInfo wloginSigInfo;
        byte[] bArr18;
        oicq.wlogin_sdk.request.WloginAllSigInfo wloginAllSigInfo = (oicq.wlogin_sdk.request.WloginAllSigInfo) this.f278586b.get(new java.lang.Long(j17));
        if (wloginAllSigInfo == null) {
            wloginAllSigInfo = new oicq.wlogin_sdk.request.WloginAllSigInfo();
        }
        oicq.wlogin_sdk.request.WloginAllSigInfo wloginAllSigInfo2 = wloginAllSigInfo;
        byte[] bArr19 = new byte[0];
        oicq.wlogin_sdk.sharemem.WloginSigInfo wloginSigInfo2 = wloginAllSigInfo2._tk_map.get(new java.lang.Long(j18));
        if (wloginSigInfo2 != null && (bArr18 = wloginSigInfo2._en_A1) != null) {
            bArr19 = (byte[]) bArr18.clone();
        }
        byte[] bArr20 = bArr19;
        wloginAllSigInfo2._useInfo = new oicq.wlogin_sdk.sharemem.WloginSimpleInfo(j17, bArr, bArr2, bArr3, bArr4);
        put_siginfo = wloginAllSigInfo2.put_siginfo(j18, j19, j27, j28, j29, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10, bArr11, bArr12, bArr13, bArr14, bArr15, bArr16, bArr17);
        oicq.wlogin_sdk.tools.util.c("before put_siginfo, ret=" + put_siginfo);
        android.content.Context context = this.f278585a;
        if (context != null) {
            java.util.TreeMap l17 = l(context, "tk_file");
            if (l17 == null) {
                l17 = new java.util.TreeMap();
            }
            oicq.wlogin_sdk.tools.util.c("after loadTKTreeMap");
            l17.put(new java.lang.Long(j17), wloginAllSigInfo2.get_clone());
            synchronized (this) {
                int p17 = "tk_file" == "tk_file" ? p(l17, "tk_file") : 0;
                oicq.wlogin_sdk.tools.util.c("after refreshTKTreeMap, ret=" + p17);
                put_siginfo = p17;
            }
        }
        if (put_siginfo != 0 && (wloginSigInfo = wloginAllSigInfo2._tk_map.get(new java.lang.Long(j18))) != null) {
            wloginSigInfo._en_A1 = (byte[]) bArr20.clone();
        }
        this.f278586b.put(new java.lang.Long(j17), wloginAllSigInfo2);
        return put_siginfo;
    }

    public synchronized int p(java.util.TreeMap treeMap, java.lang.String str) {
        int i17;
        int q17;
        try {
            for (java.lang.Object obj : treeMap.keySet()) {
                oicq.wlogin_sdk.request.WloginAllSigInfo wloginAllSigInfo = (oicq.wlogin_sdk.request.WloginAllSigInfo) treeMap.get(obj);
                if (wloginAllSigInfo != null) {
                    oicq.wlogin_sdk.tools.util.c(obj + " save allsig: " + wloginAllSigInfo._tk_map);
                }
            }
        } catch (java.lang.Exception e17) {
            oicq.wlogin_sdk.tools.util.u(e17);
        }
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(h36.h.A, "DESede");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("DESede");
            cipher.init(1, secretKeySpec);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(new javax.crypto.CipherOutputStream(byteArrayOutputStream, cipher));
            objectOutputStream.writeObject(treeMap);
            objectOutputStream.close();
            i17 = r(this.f278585a, str, byteArrayOutputStream.toByteArray());
        } catch (java.lang.Exception e18) {
            oicq.wlogin_sdk.tools.util.v("save origin", e18);
            i17 = -1022;
        }
        oicq.wlogin_sdk.tools.util.c("saveTKTreeMap origin ret=" + i17 + ", i=" + h36.h.A);
        q17 = q(treeMap, "tk_file_bak");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("saveTKTreeMap saveBak ret=");
        sb6.append(q17);
        oicq.wlogin_sdk.tools.util.c(sb6.toString());
        return q17;
    }

    public synchronized int q(java.util.TreeMap treeMap, java.lang.String str) {
        byte[] b17;
        int i17 = -1022;
        try {
            java.lang.String e17 = e(treeMap);
            oicq.wlogin_sdk.tools.util.c("saveTKTreeMapBak json len:" + e17.length());
            byte[] bytes = e17.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
            b17 = k36.e.b(bytes, 0, bytes.length, h36.h.A);
        } catch (java.lang.Exception e18) {
            oicq.wlogin_sdk.tools.util.v("save bak", e18);
        }
        if (b17 != null && b17.length != 0) {
            int r17 = r(this.f278585a, str, b17);
            oicq.wlogin_sdk.tools.util.d("saveTKTreeMapBak", "write_to_db success ret=" + r17);
            i17 = r17;
            return i17;
        }
        oicq.wlogin_sdk.tools.util.d("saveTKTreeMapBak", "encrypt failed");
        return -1022;
    }
}
