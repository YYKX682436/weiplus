package ko0;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.t f309903a = new ko0.t();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f309904b = jz5.h.b(ko0.r.f309902d);

    public static final java.lang.String b(r45.ka4 ka4Var, java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (ka4Var != null && ka4Var.S > 0) {
            java.lang.String str = ka4Var.T;
            if (!(str == null || str.length() == 0)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("api", "setEncryptionParams");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("url", url);
                jSONObject2.put("encMode", ka4Var.S);
                java.lang.String str2 = ka4Var.U;
                if (!(str2 == null || str2.length() == 0)) {
                    jSONObject2.put("encIV", ka4Var.U);
                }
                jSONObject2.put("encKey", ka4Var.T);
                jSONObject.put("params", jSONObject2);
                java.lang.String jSONObject3 = jSONObject.toString();
                kotlin.jvm.internal.o.d(jSONObject3);
                return jSONObject3;
            }
        }
        com.tencent.mars.xlog.Log.e("Finder.LiveCoreUtil", "genDecryptionParams error!");
        return "";
    }

    public final android.graphics.Point a(int i17, int i18) {
        if (i17 == 0 || i18 == 0) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCoreUtil", "calcFloatBallSize invalid, width:" + i17 + ", height:" + i18);
            return new android.graphics.Point(c(88), c(132));
        }
        float f17 = i17 / i18;
        com.tencent.mars.xlog.Log.i("Finder.LiveCoreUtil", "calcFloatBallSize width:" + i17 + ", height:" + i18 + ", rate:" + f17);
        return f17 >= 1.5f ? new android.graphics.Point(c(132), c(88)) : f17 >= 0.6666667f ? new android.graphics.Point(c(108), c(108)) : new android.graphics.Point(c(88), c(132));
    }

    public final int c(int i17) {
        return i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i17);
    }

    public final java.lang.String d(java.lang.String str) {
        java.lang.String str2;
        java.util.List list;
        int i17;
        int i18;
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        int L = r26.n0.L(str, "?", 0, false, 6, null);
        if (L == -1 || L > length) {
            str2 = str;
        } else {
            str2 = str.substring(0, L);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        }
        if (str2.length() == 0) {
            return null;
        }
        int P = r26.n0.P(str2, "/", 0, false, 6, null);
        int length2 = str2.length();
        if (P != -1 && (i18 = P + 1) <= length2) {
            str2 = str2.substring(i18);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        }
        if (str2.length() == 0) {
            return null;
        }
        int L2 = r26.n0.L(str2, ".", 0, false, 6, null);
        int length3 = str2.length();
        if (L2 != -1 && L2 <= length3) {
            str2 = str2.substring(0, L2);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        }
        if (str2.length() == 0) {
            return null;
        }
        if (!r26.i0.y(str, "webrtc://", false)) {
            return str2;
        }
        java.lang.String str3 = "";
        if (!(str.length() == 0)) {
            if (!("tabr_start_bitrate".length() == 0)) {
                java.util.List g17 = new r26.t("\\?").g(str, 0);
                boolean isEmpty = g17.isEmpty();
                java.util.List list2 = kz5.p0.f313996d;
                if (!isEmpty) {
                    java.util.ListIterator listIterator = g17.listIterator(g17.size());
                    while (listIterator.hasPrevious()) {
                        if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                            list = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = list2;
                java.lang.String[] strArr = (java.lang.String[]) list.toArray(new java.lang.String[0]);
                if (strArr.length >= 2) {
                    java.util.List g18 = new r26.t("&").g(strArr[1], 0);
                    if (!g18.isEmpty()) {
                        java.util.ListIterator listIterator2 = g18.listIterator(g18.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                break;
                            }
                            if (!(((java.lang.String) listIterator2.previous()).length() == 0)) {
                                list2 = kz5.n0.K0(g18, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    java.lang.String[] strArr2 = (java.lang.String[]) list2.toArray(new java.lang.String[0]);
                    int length4 = strArr2.length;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= length4) {
                            break;
                        }
                        java.lang.String str4 = strArr2[i19];
                        int L3 = r26.n0.L(str4, "=", 0, false, 6, null);
                        if (L3 > 0 && (i17 = L3 + 1) <= str4.length()) {
                            java.lang.String substring = str4.substring(0, L3);
                            kotlin.jvm.internal.o.f(substring, "substring(...)");
                            java.lang.String substring2 = str4.substring(i17);
                            kotlin.jvm.internal.o.f(substring2, "substring(...)");
                            if (r26.i0.p(substring, "tabr_start_bitrate", true)) {
                                str3 = substring2;
                                break;
                            }
                        }
                        i19++;
                    }
                }
            }
        }
        if (str3.length() == 0) {
            return str2;
        }
        return str2 + '_' + str3;
    }

    public final void e(boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.live2.V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig = new com.tencent.live2.V2TXLiveDef.V2TXLiveLogConfig();
        v2TXLiveLogConfig.enableObserver = true;
        v2TXLiveLogConfig.logLevel = 0;
        v2TXLiveLogConfig.enableConsole = false;
        v2TXLiveLogConfig.enableLogFile = false;
        com.tencent.live2.V2TXLivePremier.setLogConfig(v2TXLiveLogConfig);
        com.tencent.live2.V2TXLivePremier.setObserver(new ko0.s());
        if (z17) {
            v2TXLiveLogConfig.logLevel = 0;
            v2TXLiveLogConfig.enableConsole = true;
        } else {
            v2TXLiveLogConfig.logLevel = 4;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveCoreUtil", "initLogConfig: isDebugMode=" + z17 + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public final boolean f(int i17, android.os.Bundle bundle) {
        if (i17 != 2103) {
            return false;
        }
        java.lang.String string = bundle != null ? bundle.getString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION) : null;
        return string != null && r26.n0.B(string, "1001", false) && r26.n0.B(string, "java.io.FileNotFoundException", false);
    }

    public final boolean g(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (!(url.length() == 0)) {
            return r26.n0.B(url, "live.p2p.com", false) && r26.n0.B(url, "127.0.0.1", false);
        }
        com.tencent.mars.xlog.Log.e("Finder.LiveCoreUtil", "isP2PUrl: url is empty");
        return false;
    }

    public final ko0.q h(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return i(str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final ko0.q i(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        int L = r26.n0.L(str, "://", 0, false, 6, null);
        qs5.q qVar = (L == -1 || !r26.i0.r(str, 0, "webrtc", 0, L, true)) ? qs5.q.f366460d : qs5.q.f366461e;
        int K = r26.n0.K(str, '?', 0, false, 6, null);
        int length = K != -1 ? K : str.length();
        int O = r26.n0.O(str, '/', length - 1, false, 4, null) + 1;
        int K2 = r26.n0.K(str, '.', O, false, 4, null);
        if (K2 == -1 || K2 >= length) {
            K2 = -1;
        }
        if (K2 != -1) {
            length = K2;
        }
        java.lang.String substring = str.substring(O, length);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String str4 = null;
        if (K == -1 || (i17 = K + 1) >= str.length()) {
            str2 = null;
        } else {
            java.lang.String substring2 = str.substring(i17);
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            q26.r0 r0Var = (q26.r0) r26.n0.g0(substring2, new char[]{'&'}, false, 0, 6, null);
            java.util.Iterator it = r0Var.f359890a.iterator();
            str2 = null;
            while (it.hasNext()) {
                java.lang.String str5 = (java.lang.String) r0Var.f359891b.invoke(it.next());
                int K3 = r26.n0.K(str5, '=', 0, false, 6, null);
                if (K3 != -1) {
                    java.lang.String substring3 = str5.substring(0, K3);
                    kotlin.jvm.internal.o.f(substring3, "substring(...)");
                    java.lang.String substring4 = str5.substring(K3 + 1);
                    kotlin.jvm.internal.o.f(substring4, "substring(...)");
                    if (kotlin.jvm.internal.o.b(substring3, "cdntagname")) {
                        if ((substring4.length() > 0) && str4 == null) {
                            str4 = substring4;
                            if (str4 != null && str2 != null) {
                                break;
                            }
                        }
                    }
                    if (kotlin.jvm.internal.o.b(substring3, "tabr_start_bitrate")) {
                        if ((substring4.length() > 0) && str2 == null) {
                            str2 = substring4;
                        }
                    }
                    if (str4 != null) {
                        break;
                        break;
                    }
                    continue;
                }
            }
        }
        java.lang.String str6 = str4 == null ? str2 : str4;
        int O2 = r26.n0.O(substring, '_', 0, false, 6, null);
        if (O2 > 0) {
            java.lang.String substring5 = substring.substring(O2 + 1);
            kotlin.jvm.internal.o.f(substring5, "substring(...)");
            java.lang.String substring6 = substring.substring(0, O2);
            kotlin.jvm.internal.o.f(substring6, "substring(...)");
            if (str6 == null || str6.length() == 0) {
                str6 = "";
                str3 = substring;
            } else {
                if ((substring5.length() > 0) && kotlin.jvm.internal.o.b(substring5, str6)) {
                    substring = substring6;
                    str3 = substring;
                } else {
                    str3 = substring + '_' + str6;
                }
            }
        } else {
            java.lang.String str7 = str6 != null ? str6 : "";
            if (str6 != null && str6.length() != 0) {
                r11 = false;
            }
            if (r11) {
                str3 = substring;
            } else {
                str3 = substring + '_' + str6;
            }
            str6 = str7;
        }
        return new ko0.q(qVar, substring, str3, str6);
    }
}
