package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.qc f202624a = new com.tencent.mm.ui.chatting.qc();

    public final boolean a(java.lang.String url, com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(networkDeviceInfo, "networkDeviceInfo");
        java.lang.String str = networkDeviceInfo.f66590h;
        java.lang.String str2 = networkDeviceInfo.f66591i;
        java.lang.String host = android.net.Uri.parse(url).getHost();
        if (str2 == null) {
            return false;
        }
        if (!(str2.length() > 0) || str == null || !r26.n0.B(str, "wxmsg_url", false)) {
            return false;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(str2).getJSONArray("wxmsg_url");
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String string = jSONArray.getString(i17);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                if (kotlin.jvm.internal.o.b(string, host)) {
                    return true;
                }
            }
            return false;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SendDataToDeviceLogic", e17, str2, new java.lang.Object[0]);
            return false;
        }
    }

    public final boolean b(int i17, com.tencent.mm.storage.f9 f9Var, java.lang.String str, com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo) {
        java.lang.String str2;
        int i18;
        boolean z17;
        kotlin.jvm.internal.o.g(networkDeviceInfo, "networkDeviceInfo");
        java.lang.String str3 = networkDeviceInfo.f66590h;
        if (f9Var != null && f9Var.getMsgId() != 0) {
            z17 = f9Var.k2();
            i18 = f9Var.getType();
            str2 = f9Var.j();
        } else {
            if (str == null) {
                return false;
            }
            str2 = str;
            i18 = i17;
            z17 = false;
        }
        if (z17) {
            ot0.q v17 = ot0.q.v(str2);
            if (v17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SendDataToDeviceLogic", "get content is null");
                return false;
            }
            int i19 = v17.f348666i;
            if (i19 == 3 || i19 == 76 || i19 == 92) {
                if (!networkDeviceInfo.f66594o) {
                    kotlin.jvm.internal.o.d(str3);
                    if (!r26.n0.B(str3, "wxmsg_music", false)) {
                        return false;
                    }
                } else if (!networkDeviceInfo.a(1)) {
                    return false;
                }
            } else {
                if (i19 == 4) {
                    boolean z18 = networkDeviceInfo.f66594o;
                    return false;
                }
                if (!((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f348666i))) {
                    int i27 = v17.f348666i;
                    if (i27 == 5) {
                        if (!networkDeviceInfo.f66594o) {
                            java.lang.String url = v17.f348674k;
                            kotlin.jvm.internal.o.f(url, "url");
                            return a(url, networkDeviceInfo);
                        }
                        if (!networkDeviceInfo.a(5)) {
                            return false;
                        }
                    } else {
                        if (i27 != 2 || networkDeviceInfo.f66594o) {
                            return false;
                        }
                        kotlin.jvm.internal.o.d(str3);
                        if (!r26.n0.B(str3, "wxmsg_image", false)) {
                            return false;
                        }
                    }
                } else if (!networkDeviceInfo.f66594o) {
                    kotlin.jvm.internal.o.d(str3);
                    if (!r26.n0.B(str3, "wxmsg_file", false)) {
                        return false;
                    }
                } else if (!networkDeviceInfo.a(4)) {
                    return false;
                }
            }
        } else if (i18 == 3) {
            if (!networkDeviceInfo.f66594o) {
                kotlin.jvm.internal.o.d(str3);
                if (!r26.n0.B(str3, "wxmsg_image", false)) {
                    return false;
                }
            } else if (!networkDeviceInfo.a(3)) {
                return false;
            }
        } else if (i18 == 48) {
            if (!networkDeviceInfo.f66594o) {
                kotlin.jvm.internal.o.d(str3);
                if (!r26.n0.B(str3, "wxmsg_poi", false)) {
                    return false;
                }
            } else if (!networkDeviceInfo.a(2)) {
                return false;
            }
        } else if (i18 == 43) {
            if (!networkDeviceInfo.f66594o || !networkDeviceInfo.a(6)) {
                return false;
            }
        } else {
            if (i18 != 62 || networkDeviceInfo.f66594o) {
                return false;
            }
            kotlin.jvm.internal.o.d(str3);
            if (!r26.n0.B(str3, "wxmsg_video", false)) {
                return false;
            }
        }
        return true;
    }
}
