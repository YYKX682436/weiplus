package com.tencent.mm.plugin.normsg;

/* loaded from: classes13.dex */
class p implements com.tencent.mm.ipcinvoker.k0 {
    private p() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        fo3.s sVar = fo3.s.INSTANCE;
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            sVar.Ig();
            byte[] i17 = com.tencent.mm.normsg.WCProbe$Info.i(bundle.getInt("a_k_d_i"), bundle.getString("a_k_d_n"), bundle.getLong("a_k_t"), bundle.getInt("a_k_d_e_t"), bundle.getString("a_k_d_o_p"));
            if (i17 == null) {
                i17 = new byte[0];
            }
            bundle2.putByteArray("result", i17);
        } finally {
            try {
                return bundle2;
            } finally {
            }
        }
        return bundle2;
    }
}
