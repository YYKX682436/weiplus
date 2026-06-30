package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class r implements com.tencent.mm.app.h4 {
    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        if (th6 instanceof java.lang.OutOfMemoryError) {
            com.tencent.mm.sdk.platformtools.t.b(new java.io.PrintWriter((java.io.Writer) new com.tencent.mm.sdk.platformtools.s(), false), 1048576L, -1);
        }
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
    }
}
