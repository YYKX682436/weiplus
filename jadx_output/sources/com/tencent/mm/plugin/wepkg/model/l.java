package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public abstract class l {
    public static java.lang.String a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        return c() + str + "/";
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return "";
        }
        return a(str) + str2;
    }

    public static java.lang.String c() {
        return com.tencent.mm.plugin.game.commlib.util.m.d() + "wepkg/";
    }
}
