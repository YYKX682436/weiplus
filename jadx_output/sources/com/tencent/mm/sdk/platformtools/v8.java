package com.tencent.mm.sdk.platformtools;

/* loaded from: classes5.dex */
public abstract class v8 {
    public static boolean a(int i17) {
        int i18 = i17 & 255;
        return i18 >= 16 && i18 <= 47;
    }

    public static boolean b(int i17) {
        return (i17 & 255) <= 15;
    }
}
