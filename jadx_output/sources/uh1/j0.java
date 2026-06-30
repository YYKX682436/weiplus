package uh1;

/* loaded from: classes7.dex */
public enum j0 {
    ;

    public static boolean A(java.util.ArrayList arrayList, java.lang.String str, boolean z17) {
        if (t(arrayList, str, z17)) {
            return true;
        }
        if (u((java.lang.String) D(str).get("host")) != 2) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUtil", "matchUrl, url in the same net %s", str);
        return true;
    }

    public static boolean B(int i17) {
        return i17 == 301 || i17 == 302 || i17 == 307;
    }

    public static java.lang.String C(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("protocols");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                linkedList.add(optJSONArray.optString(i17));
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return null;
        }
        return android.text.TextUtils.join(", ", linkedList);
    }

    public static java.util.HashMap D(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        android.net.Uri parse;
        java.lang.String str4 = "";
        try {
            parse = android.net.Uri.parse(str);
            str2 = parse.getHost();
            try {
                str3 = parse.getScheme();
            } catch (java.lang.Exception e17) {
                e = e17;
                str3 = "";
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            str2 = "";
            str3 = str2;
        }
        try {
            str4 = java.lang.String.valueOf(parse.getPort());
        } catch (java.lang.Exception e19) {
            e = e19;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e, "Exception: parseUrl error", new java.lang.Object[0]);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("host", str2);
            hashMap.put("scheme", str3);
            hashMap.put("port", str4);
            return hashMap;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("host", str2);
        hashMap2.put("scheme", str3);
        hashMap2.put("port", str4);
        return hashMap2;
    }

    public static void E(long j17, long j18, long j19) {
        if (new java.util.Random().nextInt(100) <= 1) {
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(j17, j18, j19, false);
        }
    }

    public static boolean G(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        int ordinal = lVar.getAppState().ordinal();
        return ordinal == 2 || ordinal == 3;
    }

    public static java.util.Map H(java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (str != null && !str.isEmpty()) {
                    java.lang.String str2 = (java.lang.String) entry.getValue();
                    java.util.List list = (java.util.List) hashMap.get(str);
                    if (list == null) {
                        list = new java.util.ArrayList();
                    }
                    list.add(str2);
                    hashMap.put(str, list);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e17, "JSONException: put header error", new java.lang.Object[0]);
        }
        return hashMap;
    }

    public static void a(java.net.HttpURLConnection httpURLConnection, java.util.ArrayList arrayList) {
        if (httpURLConnection == null) {
            return;
        }
        ((javax.net.ssl.HttpsURLConnection) httpURLConnection).setHostnameVerifier(new uh1.i0(javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier(), arrayList));
    }

    public static int b(int i17) {
        java.lang.String d17 = d(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUtil", "calcMaskIntByPrefixLength result:%s", d17);
        java.lang.String[] split = d17.split("\\.");
        return kk.u.c(new byte[]{(byte) (com.tencent.mm.sdk.platformtools.t8.P(split[0], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[1], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[2], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[3], 0) & 255)});
    }

    public static java.lang.String d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUtil", "calcMaskStrByPrefixLength length:%d", java.lang.Integer.valueOf(i17));
        int i18 = (-1) << (32 - i17);
        int[] iArr = new int[4];
        for (int i19 = 0; i19 < 4; i19++) {
            iArr[3 - i19] = (i18 >> (i19 * 8)) & 255;
        }
        java.lang.String str = "" + iArr[0];
        for (int i27 = 1; i27 < 4; i27++) {
            str = str + "." + iArr[i27];
        }
        return str;
    }

    public static org.json.JSONObject e(java.util.Map map, int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (i17 == 1) {
            try {
                jSONObject.put("__AppBrandRemoteDebugRequestHeader__", true);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e17, "JSONException: getHeaderJsonObject put REQUEST_HEADER header error", new java.lang.Object[0]);
            }
        }
        if (map == null) {
            return jSONObject;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && list != null && !list.isEmpty()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append((java.lang.String) list.get(0));
                for (int i18 = 1; i18 < list.size(); i18++) {
                    sb6.append(",");
                    sb6.append((java.lang.String) list.get(i18));
                }
                try {
                    jSONObject.put(str, sb6.toString());
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e18, "JSONException: getHeaderJsonObject put header error", new java.lang.Object[0]);
                }
            }
        }
        return jSONObject;
    }

    public static int f(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUtil", "getHostIPNetMaskPrefixLength invalid ip");
            return 0;
        }
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                for (java.net.InterfaceAddress interfaceAddress : networkInterfaces.nextElement().getInterfaceAddresses()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUtil", "address:%s", interfaceAddress.getAddress().getHostAddress());
                    if (!interfaceAddress.getAddress().isLoopbackAddress() && !interfaceAddress.getAddress().isAnyLocalAddress() && interfaceAddress.getAddress().getHostAddress().equals(str)) {
                        return interfaceAddress.getNetworkPrefixLength();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e17, "lm:get mask failed", new java.lang.Object[0]);
        }
        return 0;
    }

    public static java.util.Map g(org.json.JSONObject jSONObject, uh1.a aVar) {
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("header");
            if (optJSONObject != null) {
                java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    if (next != null) {
                        hashMap.put(next.toLowerCase(), optJSONObject.getString(next));
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e17, "Exception: get header error", new java.lang.Object[0]);
        }
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUtil", "hy: no network config!");
        } else {
            int i17 = aVar.E;
            if (i17 == 1) {
                java.util.ArrayList arrayList2 = aVar.f427755v;
                if (arrayList2 != null) {
                    if (arrayList2.isEmpty()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUtil", "filterHttpHeaderBlackList fail, headerMap is null or blacklist is null or nil.");
                    } else {
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            java.lang.String str = (java.lang.String) it.next();
                            if (str != null) {
                            }
                        }
                    }
                }
            } else if (i17 == 2 && (arrayList = aVar.f427756w) != null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it6.next();
                    if (str2 != null) {
                        java.lang.String lowerCase = str2.toLowerCase();
                        java.lang.String str3 = (java.lang.String) hashMap.get(lowerCase);
                        if (str3 != null) {
                            hashMap2.put(lowerCase, str3);
                        }
                    }
                }
                hashMap = hashMap2;
            }
            hashMap.remove("referer");
            if (!android.text.TextUtils.isEmpty(aVar.D)) {
                hashMap.put("referer", aVar.D);
            }
        }
        return hashMap;
    }

    public static java.lang.String h(int i17) {
        return (i17 & 255) + "." + ((i17 >> 8) & 255) + "." + ((i17 >> 16) & 255) + "." + ((i17 >> 24) & 255);
    }

    public static int i(java.lang.String str) {
        if (!s(str)) {
            return 0;
        }
        java.lang.String[] split = str.split("\\.");
        return kk.u.c(new byte[]{(byte) (com.tencent.mm.sdk.platformtools.t8.P(split[0], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[1], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[2], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[3], 0) & 255)});
    }

    public static java.lang.String j(java.net.URI uri) {
        if (uri == null) {
            return null;
        }
        java.lang.String scheme = uri.getScheme();
        if (com.tencent.mm.sdk.platformtools.t8.K0(scheme)) {
            return null;
        }
        if (scheme.equalsIgnoreCase("wss")) {
            scheme = "https";
        } else if (scheme.equalsIgnoreCase("ws")) {
            scheme = "http";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(scheme);
        sb6.append("://");
        sb6.append(uri.getHost());
        int port = uri.getPort();
        if (!(port == -1 || (scheme.equalsIgnoreCase("http") && port == 80) || (scheme.equalsIgnoreCase("https") && port == 443))) {
            sb6.append(":");
            sb6.append(uri.getPort());
        }
        return sb6.toString();
    }

    public static synchronized java.util.Map k(com.tencent.mars.cdn.CronetLogic.WebPageProfile webPageProfile) {
        java.util.HashMap hashMap;
        synchronized (uh1.j0.class) {
            hashMap = new java.util.HashMap();
            if (webPageProfile != null) {
                hashMap.put("redirectStart", java.lang.Long.valueOf(webPageProfile.redirectStart));
                hashMap.put("redirectEnd", java.lang.Long.valueOf(webPageProfile.redirectEnd));
                hashMap.put("fetchStart", java.lang.Long.valueOf(webPageProfile.fetchStart));
                hashMap.put("domainLookUpStart", java.lang.Long.valueOf(webPageProfile.domainLookUpStart));
                hashMap.put("domainLookUpEnd", java.lang.Long.valueOf(webPageProfile.domainLookUpEnd));
                hashMap.put("connectStart", java.lang.Long.valueOf(webPageProfile.connectStart));
                hashMap.put("connectEnd", java.lang.Long.valueOf(webPageProfile.connectEnd));
                hashMap.put("SSLconnectionStart", java.lang.Long.valueOf(webPageProfile.SSLconnectionStart));
                hashMap.put("SSLconnectionEnd", java.lang.Long.valueOf(webPageProfile.SSLconnectionEnd));
                hashMap.put("requestStart", java.lang.Long.valueOf(webPageProfile.requestStart));
                hashMap.put("requestEnd", java.lang.Long.valueOf(webPageProfile.requestEnd));
                hashMap.put("responseStart", java.lang.Long.valueOf(webPageProfile.responseStart));
                hashMap.put("responseEnd", java.lang.Long.valueOf(webPageProfile.responseEnd));
                hashMap.put("rtt", java.lang.Integer.valueOf(webPageProfile.rtt));
                hashMap.put("estimate_nettype", java.lang.Integer.valueOf(webPageProfile.networkTypeEstimate));
                hashMap.put("httpRttEstimate", java.lang.Integer.valueOf(webPageProfile.httpRttEstimate));
                hashMap.put("transportRttEstimate", java.lang.Integer.valueOf(webPageProfile.transportRttEstimate));
                hashMap.put("downstreamThroughputKbpsEstimate", java.lang.Integer.valueOf(webPageProfile.downstreamThroughputKbpsEstimate));
                hashMap.put("throughputKbps", java.lang.Integer.valueOf(webPageProfile.throughputKbps));
                hashMap.put("peerIP", webPageProfile.peerIP);
                hashMap.put("port", java.lang.Integer.valueOf(webPageProfile.port));
                hashMap.put("protocol", webPageProfile.protocol);
                hashMap.put("socketReused", java.lang.Boolean.valueOf(webPageProfile.socketReused));
                hashMap.put("sendBytesCount", java.lang.Long.valueOf(webPageProfile.sendBytesCount));
                hashMap.put("receivedBytedCount", java.lang.Long.valueOf(webPageProfile.receivedBytedCount));
            }
        }
        return hashMap;
    }

    public static java.lang.String l(java.net.HttpURLConnection httpURLConnection) {
        java.net.URL url;
        if (httpURLConnection == null || (url = httpURLConnection.getURL()) == null) {
            return "";
        }
        java.lang.String headerField = httpURLConnection.getHeaderField("Location");
        if (headerField == null) {
            headerField = httpURLConnection.getHeaderField(ya.b.LOCATION);
        }
        if (headerField == null) {
            return null;
        }
        try {
            return url.toURI().resolve(headerField).toString();
        } catch (java.net.URISyntaxException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e17, "URISyntaxException: resolve url error", new java.lang.Object[0]);
            return headerField;
        }
    }

    public static org.json.JSONObject m(java.net.HttpURLConnection httpURLConnection) {
        return httpURLConnection == null ? e(null, 1) : e(httpURLConnection.getRequestProperties(), 1);
    }

    public static int n(uh1.a aVar, int i17) {
        if (i17 == 0) {
            return aVar.f427741e;
        }
        if (i17 == 1) {
            return aVar.f427742f;
        }
        if (i17 == 2) {
            return aVar.f427743g;
        }
        if (i17 != 3) {
            return 0;
        }
        return aVar.f427744h;
    }

    public static org.json.JSONObject o(java.net.HttpURLConnection httpURLConnection) {
        return httpURLConnection == null ? e(null, 2) : e(httpURLConnection.getHeaderFields(), 2);
    }

    public static javax.net.ssl.SSLContext p(uh1.a aVar) {
        uh1.y0 r17 = r(aVar);
        if (r17 == null) {
            return null;
        }
        javax.net.ssl.TrustManager[] trustManagerArr = {r17};
        try {
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerArr, null);
            return sSLContext;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e17, "Exception: SSLContext init error", new java.lang.Object[0]);
            return null;
        }
    }

    public static uh1.y0 r(uh1.a aVar) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = aVar.f427757x.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            if (bArr != null && bArr.length != 0) {
                linkedList.add(new java.io.ByteArrayInputStream(bArr));
            }
        }
        if (linkedList.isEmpty()) {
            if (!aVar.H || !aVar.I) {
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUtil", "getTrustManagerWithSelfSignedCertificates debug type");
            uh1.y0 y0Var = new uh1.y0(true);
            y0Var.a();
            return y0Var;
        }
        uh1.y0 y0Var2 = new uh1.y0(aVar.H);
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            java.io.InputStream inputStream = (java.io.InputStream) it6.next();
            java.security.KeyStore keyStore = y0Var2.f427934c;
            if (keyStore == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandX509TrustManager", "local keystore is null");
            } else {
                try {
                    try {
                        java.security.cert.Certificate generateCertificate = java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(inputStream);
                        inputStream.close();
                        keyStore.setCertificateEntry(((java.security.cert.X509Certificate) generateCertificate).getSubjectDN() + "", generateCertificate);
                    } catch (java.lang.Throwable th6) {
                        inputStream.close();
                        throw th6;
                        break;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandX509TrustManager", e17, "Exception: initLocalSelfSignedCertificate", new java.lang.Object[0]);
                }
            }
        }
        y0Var2.a();
        return y0Var2;
    }

    public static boolean s(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, url is null");
            return false;
        }
        if (!org.apache.http.conn.util.InetAddressUtils.isIPv4Address(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, url is not ip");
            return false;
        }
        java.lang.String[] split = str.split("\\.");
        if (split.length != 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, invalid ip format");
            return false;
        }
        for (java.lang.String str2 : split) {
            int P = com.tencent.mm.sdk.platformtools.t8.P(str2, -1);
            if (P < 0 || P > 255) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, invalid ip format");
                return false;
            }
        }
        return true;
    }

    public static boolean t(java.util.ArrayList arrayList, java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, url is null");
            return false;
        }
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, configUrls is empty");
            return false;
        }
        arrayList.size();
        java.util.HashMap D = D(str);
        java.lang.String str2 = (java.lang.String) D.get("host");
        java.lang.String str3 = (java.lang.String) D.get("scheme");
        java.lang.String str4 = (java.lang.String) D.get("port");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            boolean z18 = j62.e.g().i("clicfg_weapp_android_allow_wildcard_domain_check", 0, true, true) == 1;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.util.HashMap D2 = D((java.lang.String) it.next());
                java.lang.String str5 = (java.lang.String) D2.get("host");
                java.lang.String str6 = (java.lang.String) D2.get("scheme");
                java.lang.String str7 = (java.lang.String) D2.get("port");
                if (str2.equalsIgnoreCase(str5) && str3.equalsIgnoreCase(str6) && (z17 || str4.equalsIgnoreCase(str7))) {
                    return true;
                }
                if (z18) {
                    if ((str5 != null && str5.length() >= 2 && str5.charAt(0) == '*' && str5.charAt(1) == '.') && str3.equalsIgnoreCase(str6) && (z17 || str4.equalsIgnoreCase(str7))) {
                        java.lang.String substring = str5.substring(1);
                        if (str2.length() > substring.length() && str2.substring(str2.length() - substring.length()).equalsIgnoreCase(substring)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int u(java.lang.String str) {
        int i17;
        int i18;
        int i19 = 0;
        if (!s(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, url is null");
            return 0;
        }
        java.lang.String[] split = str.split("\\.");
        int c17 = kk.u.c(new byte[]{(byte) (com.tencent.mm.sdk.platformtools.t8.P(split[0], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[1], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[2], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[3], 0) & 255)});
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext().getSystemService("wifi");
        if (wifiManager.getWifiState() == 3) {
            int g17 = com.tencent.mm.sdk.platformtools.v0.f193027a.g(false);
            java.lang.String h17 = h(g17);
            try {
                i18 = wifiManager.getDhcpInfo().netmask;
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e17, "NullPointerException: getDhcpInfo error", new java.lang.Object[0]);
                i18 = 0;
            }
            if (i18 <= 0) {
                i19 = f(h17);
                i18 = b(i19);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUtil", "matchIp oldIpStr:%s, localIp:%s,oldIpInt:%d, localIpInt:%d, netmask:%d, prefixLength:%d", str, h17, java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(g17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            return w(i18, c17, g17);
        }
        int i27 = 13;
        try {
            i27 = ((java.lang.Integer) wifiManager.getClass().getField("WIFI_AP_STATE_ENABLED").get(wifiManager)).intValue();
            i17 = ((java.lang.Integer) wifiManager.getClass().getMethod("getWifiApState", new java.lang.Class[0]).invoke(wifiManager, new java.lang.Object[0])).intValue();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e18, "Exception: getWifiApState error", new java.lang.Object[0]);
            i17 = 0;
        }
        if (i17 != i27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUtil", "apState:%d", java.lang.Integer.valueOf(i17));
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUtil", "matchip in apmode");
        try {
            java.util.Iterator it = java.util.Collections.list(java.net.NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (java.net.InterfaceAddress interfaceAddress : ((java.net.NetworkInterface) it.next()).getInterfaceAddresses()) {
                    if (!interfaceAddress.getAddress().isLoopbackAddress()) {
                        java.lang.String upperCase = interfaceAddress.getAddress().getHostAddress().toUpperCase();
                        boolean isIPv4Address = org.apache.http.conn.util.InetAddressUtils.isIPv4Address(upperCase);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUtil", "check ip:%s, isIPv4:%b", upperCase, java.lang.Boolean.valueOf(isIPv4Address));
                        if (isIPv4Address) {
                            int i28 = i(upperCase);
                            long b17 = b(interfaceAddress.getNetworkPrefixLength());
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUtil", "matchAddress oldIpInt:%d, localIpInt:%d, netmask:%d", java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(b17));
                            return w(b17, c17, i28);
                        }
                    }
                }
            }
            return 0;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e19, "Exception: matchAddress error", new java.lang.Object[0]);
            return 0;
        }
    }

    public static uh1.j0 valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(uh1.j0.class, str));
        return null;
    }

    public static int w(long j17, int i17, int i18) {
        int c17 = kk.u.c(new byte[]{-1, -1, -1, 0});
        long[] jArr = new long[4];
        if (j17 > 0) {
            jArr[0] = j17 >>> 24;
            jArr[1] = (j17 & 16777215) >>> 16;
            jArr[2] = (j17 & 65535) >>> 8;
            jArr[3] = j17 & 255;
        }
        int i19 = 0;
        for (int i27 = 0; i27 < 4; i27++) {
            long j18 = jArr[i27];
            i19 = (int) (i19 + j18);
            if (j18 < 0 || j18 > 255) {
                i19 = -1;
                break;
            }
        }
        long j19 = i19 <= 0 ? c17 : j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUtil", "matchNetMask oldIpInt:%d, localIpInt:%d, netmask:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j19));
        if ((i17 & j19) == (j19 & i18)) {
            return i17 == i18 ? 1 : 2;
        }
        return 0;
    }

    public static boolean y(java.util.ArrayList arrayList, java.lang.String str) {
        return A(arrayList, str, false);
    }
}
