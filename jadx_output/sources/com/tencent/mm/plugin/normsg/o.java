package com.tencent.mm.plugin.normsg;

/* loaded from: classes13.dex */
class o implements com.tencent.mm.ipcinvoker.k0 {
    private o() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        fo3.s sVar = fo3.s.INSTANCE;
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            sVar.Ig();
            byte[] g17 = com.tencent.mm.normsg.WCProbe$Info.g(intent);
            if (g17 == null) {
                g17 = new byte[0];
            }
            bundle.putByteArray("result", g17);
        } finally {
            try {
                return bundle;
            } finally {
            }
        }
        return bundle;
    }
}
