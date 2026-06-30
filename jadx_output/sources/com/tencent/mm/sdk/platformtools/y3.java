package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public abstract class y3 {
    public static final boolean a(long j17, int i17) {
        return b(j17, i17 * 1000);
    }

    public static final boolean b(long j17, long j18) {
        return java.lang.System.currentTimeMillis() - j17 > j18;
    }
}
