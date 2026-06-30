package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class y {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return null;
        }
        return str.equals(str2) ? str : java.lang.String.format("%s(%s)", str, str2);
    }
}
