package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class f6 extends com.tencent.mm.sdk.platformtools.n3 {
    public f6(com.tencent.mm.sdk.platformtools.i6 i6Var, android.os.Looper looper) {
        super(looper);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        java.lang.Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        ((com.tencent.mm.sdk.platformtools.g6) obj).b();
    }
}
