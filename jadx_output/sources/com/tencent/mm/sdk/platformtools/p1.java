package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class p1 implements com.tencent.stubs.logger.Log.Logger {

    /* renamed from: a, reason: collision with root package name */
    public static final bm5.p1 f192910a = new com.tencent.mm.sdk.platformtools.o1();

    public p1(com.tencent.mm.sdk.platformtools.o1 o1Var) {
    }

    @Override // com.tencent.stubs.logger.Log.Logger
    public boolean isLoggable(java.lang.String str, int i17) {
        return true;
    }

    @Override // com.tencent.stubs.logger.Log.Logger
    public void println(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i(str, str2);
        } else if (i17 == 5) {
            com.tencent.mars.xlog.Log.w(str, str2);
        } else {
            if (i17 != 6) {
                return;
            }
            com.tencent.mars.xlog.Log.e(str, str2);
        }
    }
}
