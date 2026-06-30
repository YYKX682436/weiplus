package com.tencent.mm.plugin.normsg;

/* loaded from: classes13.dex */
class n implements com.tencent.mm.ipcinvoker.k0 {
    private n() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        fo3.s sVar = fo3.s.INSTANCE;
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            sVar.Ig();
            byte[] byteArray = bundle.getByteArray("a_k_a_r_i_f_o");
            if (byteArray != null) {
                byte[] h17 = com.tencent.mm.normsg.WCProbe$Info.h(byteArray);
                if (h17 == null) {
                    h17 = new byte[0];
                }
                bundle2.putByteArray("result", h17);
            }
        } finally {
            try {
                return bundle2;
            } finally {
            }
        }
        return bundle2;
    }
}
