package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public abstract class w {
    public static boolean a() {
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            return true;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }

    public static boolean b(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 R;
        if (!a() || str == null || (R = com.tencent.mm.sdk.platformtools.o4.R("GameCenter.DebugTool")) == null) {
            return false;
        }
        return R.getBoolean(str, false);
    }

    public static java.lang.String c(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 R;
        return (!a() || str == null || (R = com.tencent.mm.sdk.platformtools.o4.R("GameCenter.DebugTool")) == null) ? "" : R.getString(str, "");
    }

    public static boolean d(java.lang.String str, java.lang.String str2) {
        if (!a() || str == null) {
            return false;
        }
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("GameCenter.DebugTool");
        if (R == null) {
            return false;
        }
        return R.D(str, str2);
    }
}
