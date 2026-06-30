package ip;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f293551f = com.tencent.mm.storage.v3.f196273a + "configlist/";

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f293552a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f293553b = com.tencent.mm.sdk.platformtools.o4.M("configListDecoder_debug_xml");

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f293554c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f293555d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f293556e = false;

    public static java.lang.String c(int i17) {
        return f293551f + "config_" + i17 + ".xml";
    }

    public java.util.List a() {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String a17 = ip.h.a(new java.lang.String[]{"FullScreenMpLinkPrefixList", "MpLinkPrefix"});
        ip.h d17 = d(1);
        java.util.Map map = null;
        if (d17 != null && (d17 instanceof ip.i)) {
            java.util.HashMap hashMap = ((ip.i) d17).f293568f;
            if (hashMap.containsKey("MPConfig")) {
                java.lang.Object obj = ((java.util.HashMap) hashMap.get("MPConfig")).get(a17);
                if (obj instanceof java.util.Map) {
                    map = (java.util.Map) obj;
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ConfigListInfoExtension", "get item list, but item object no instance of list");
                }
            }
        }
        if (map != null && !map.isEmpty()) {
            for (int i17 = 0; i17 < 100; i17++) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(i17 == 0 ? a17 : a17 + i17);
                sb6.append(".");
                java.lang.String sb7 = sb6.toString();
                java.util.Iterator it = map.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if (((java.lang.String) it.next()).startsWith(sb7)) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    break;
                }
                java.lang.String str = (java.lang.String) map.get(sb7 + "urlPrefix");
                if (!android.text.TextUtils.isEmpty(str)) {
                    jp.a aVar = new jp.a();
                    kotlin.jvm.internal.o.g(str, "<set-?>");
                    aVar.f300970a = str;
                    for (int i18 = 0; i18 < 100; i18++) {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(sb7);
                        sb8.append(i18 != 0 ? "showTypeList.showType" + i18 : "showTypeList.showType");
                        java.lang.String sb9 = sb8.toString();
                        if (!map.containsKey(sb9)) {
                            break;
                        }
                        java.lang.String str2 = (java.lang.String) map.get(sb9);
                        if (android.text.TextUtils.isEmpty(str2)) {
                            break;
                        }
                        try {
                            aVar.f300971b.add(java.lang.Integer.valueOf(str2.trim()));
                        } catch (java.lang.NumberFormatException unused) {
                        }
                    }
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    public java.lang.String b(int i17, java.lang.String str, java.lang.String str2) {
        ip.h d17 = d(i17);
        if (d17 == null) {
            return null;
        }
        java.util.HashMap hashMap = d17.f293565b;
        if (hashMap.containsKey(str)) {
            return (java.lang.String) ((java.util.HashMap) hashMap.get(str)).get(str2);
        }
        return null;
    }

    public final ip.h d(int i17) {
        if (!this.f293556e) {
            synchronized (this) {
                if (!this.f293556e) {
                    int i18 = 0;
                    while (true) {
                        int[] iArr = ip.h.f293563e;
                        if (i18 >= 1) {
                            break;
                        }
                        f(iArr[i18]);
                        i18++;
                    }
                    this.f293556e = true;
                }
            }
        }
        if (this.f293552a.get(i17) == null) {
            f(i17);
        }
        return (ip.h) this.f293552a.get(i17);
    }

    public java.util.List e() {
        java.lang.String b17 = b(1, "IBeacon", "Content");
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Iterator<java.lang.String> keys = new org.json.JSONObject(b17.replace(",}", "}")).keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                if (next != null) {
                    arrayList.add(next.toString());
                }
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConfigListDecoder", "[oneliang] json parse exception: " + e17.getMessage());
            return arrayList;
        }
    }

    public void f(int i17) {
        java.io.InputStream inputStream = null;
        try {
            try {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c(i17));
                java.lang.String str = a17.f213279f;
                if (str != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                    inputStream = com.tencent.mm.vfs.w6.D(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, m17));
                    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    while (true) {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            stringBuffer.append(readLine);
                        }
                    }
                    g(i17, stringBuffer.toString());
                    inputStreamReader.close();
                    bufferedReader.close();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e17) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.ConfigListDecoder", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                }
            } catch (java.lang.Exception e18) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.ConfigListDecoder", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ConfigListDecoder", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e27) {
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.ConfigListDecoder", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
                }
            }
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ip.e.g(int, java.lang.String):void");
    }

    public final void h(int i17) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f293555d);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.ui.tools.s4) ((ip.d) it.next())).getClass();
            if (i17 == 1) {
                synchronized (com.tencent.mm.plugin.webview.ui.tools.t4.f186884a) {
                    com.tencent.mm.plugin.webview.ui.tools.t4.f186888e.clear();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ConfigListDecoder", "notifyConfigFileUpdate configID=%s ", java.lang.Integer.valueOf(i17));
        ((java.util.ArrayList) this.f293554c).clear();
        ((java.util.ArrayList) this.f293554c).addAll(a());
    }

    public int i() {
        try {
            return com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceVOIPSwitch"), 0);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.ConfigListDecoder", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return 0;
        }
    }
}
