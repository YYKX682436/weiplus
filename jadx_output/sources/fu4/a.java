package fu4;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f266884a = -1;

    public static boolean a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintInfoStorage", "add fid to local: %s", str);
        try {
            org.json.JSONArray jSONArray = null;
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_FINGERPRINT_FID_LIST_STRING_SYNC, null);
            if (str2 != null) {
                try {
                    jSONArray = new org.json.JSONArray(str2);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FingerprintInfoStorage", e17, "", new java.lang.Object[0]);
                }
            }
            java.util.HashSet c17 = c(jSONArray);
            if (jSONArray == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FingerprintInfoStorage", "list is null");
                jSONArray = new org.json.JSONArray();
            }
            if (c17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FingerprintInfoStorage", "fidSet is null");
                c17 = new java.util.HashSet();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintInfoStorage", "fidList: %s before add fid", jSONArray.toString());
            if (!c17.contains(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FingerprintInfoStorage", "fidSet contains fid %s: %b", str, java.lang.Boolean.FALSE);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("fid", str);
                jSONArray.put(jSONObject);
                com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintInfoStorage", "list: %s", jSONArray.toString());
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_FINGERPRINT_FID_LIST_STRING_SYNC, jSONArray.toString());
                gm0.j1.u().c().i(true);
                return true;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FingerprintInfoStorage", e18, "", new java.lang.Object[0]);
        }
        return false;
    }

    public static void b() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintInfoStorage", "clear local fids, stack: %s", new com.tencent.mm.sdk.platformtools.z3());
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_FINGERPRINT_FID_LIST_STRING_SYNC, null);
        gm0.j1.u().c().i(true);
    }

    public static java.util.HashSet c(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                hashSet.add(jSONArray.getJSONObject(i17).getString("fid"));
            }
            return hashSet;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FingerprintInfoStorage", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static boolean d(java.lang.String str) {
        org.json.JSONArray jSONArray = null;
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_FINGERPRINT_FID_LIST_STRING_SYNC, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintInfoStorage", "fid: %s, fidInfoList: %s", str, str2);
        if (str2 != null) {
            try {
                jSONArray = new org.json.JSONArray(str2);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FingerprintInfoStorage", e17, "", new java.lang.Object[0]);
            }
        }
        java.util.HashSet c17 = c(jSONArray);
        return c17 != null && c17.contains(str);
    }

    public static boolean e() {
        hu4.l lVar;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 == null) {
            lVar = new hu4.l();
        } else {
            java.lang.String str = (java.lang.String) c17.m(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_FINGERPRINT_LAST_BLOCK_TIME_STRING_SYNC, null);
            if (str == null) {
                lVar = new hu4.l();
            } else {
                hu4.l lVar2 = new hu4.l();
                lVar2.a(hu4.j.h(str));
                lVar = lVar2;
            }
        }
        if (lVar.f285234a != -1) {
            hu4.j.b(lVar);
            long j17 = lVar.f285235b;
            if (j17 / 1000 < 30) {
                f(lVar.f285234a, j17);
                return true;
            }
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            if (c18 != null) {
                c18.x(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_FINGERPRINT_LAST_BLOCK_TIME_STRING_SYNC, null);
                c18.i(true);
            }
        }
        return false;
    }

    public static void f(long j17, long j18) {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_FINGERPRINT_LAST_BLOCK_TIME_STRING_SYNC;
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeLong(j17);
                dataOutputStream.writeLong(j18);
                dataOutputStream.close();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TimeInfo", e17, "", new java.lang.Object[0]);
            }
            c17.x(u3Var, hu4.j.a(byteArrayOutputStream.toByteArray()));
            c17.i(true);
        }
    }
}
