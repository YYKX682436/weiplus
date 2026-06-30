package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public abstract class y2 {
    public static java.lang.String a() {
        return com.tencent.mm.storage.v3.f196275c + "/pkg/wxalitebaselibrary/bundle";
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = !com.tencent.mm.sdk.platformtools.t8.K0(str3) ? str3 : "_";
        }
        return com.tencent.mm.storage.v3.f196275c + "/pkg/wxalitebaselibrary/" + str2 + "/" + str;
    }

    public static java.lang.String c(com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.LiteAppConfigType liteAppConfigType, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i17 = com.tencent.mm.plugin.lite.logic.x2.f144089a[liteAppConfigType.ordinal()];
        java.lang.String str4 = "config";
        if (i17 != 1) {
            if (i17 == 2) {
                str4 = "engineconfig";
            } else if (i17 == 3) {
                str4 = "samplingconfig";
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = !com.tencent.mm.sdk.platformtools.t8.K0(str3) ? str3 : "_";
        }
        java.lang.String str5 = com.tencent.mm.storage.v3.f196275c + "/" + str4 + "/" + str + "/" + str2;
        if (!com.tencent.mm.vfs.w6.j(str5)) {
            com.tencent.mm.vfs.w6.u(str5);
        }
        return str5 + "/config.json";
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = !com.tencent.mm.sdk.platformtools.t8.K0(str3) ? str3 : "_";
        }
        java.lang.String str4 = com.tencent.mm.storage.v3.f196275c + "/config/" + str + "/" + str2;
        if (!com.tencent.mm.vfs.w6.j(str4)) {
            com.tencent.mm.vfs.w6.u(str4);
        }
        return str4 + "/config.json";
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = !com.tencent.mm.sdk.platformtools.t8.K0(str3) ? str3 : "_";
        }
        return com.tencent.mm.storage.v3.f196275c + "/pkg/" + str + "/" + str2;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = !com.tencent.mm.sdk.platformtools.t8.K0(str3) ? str3 : "_";
        }
        return com.tencent.mm.storage.v3.f196275c + "/tmp/" + str + "/" + str2 + "/";
    }

    public static java.lang.String g() {
        java.lang.String str = com.tencent.mm.storage.v3.f196275c + "/tmp/";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        return str;
    }
}
