package com.tencent.mm.plugin.normsg;

/* loaded from: classes13.dex */
class q implements com.tencent.mm.ipcinvoker.k0 {
    private q() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        fo3.s sVar = fo3.s.INSTANCE;
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            sVar.Ig();
            bundle.setClassLoader(com.iqoo.secure.antifraud.thirdpart.CheckRiskResult.class.getClassLoader());
            int i17 = bundle.getInt("a_k_r_c");
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("a_k_c_r_r");
            int i18 = bundle.getInt("a_k_v_a_f_c");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (parcelableArrayList != null) {
                java.util.Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    com.iqoo.secure.antifraud.thirdpart.CheckRiskResult checkRiskResult = (com.iqoo.secure.antifraud.thirdpart.CheckRiskResult) it.next();
                    arrayList.add(new com.tencent.mm.normsg.j(checkRiskResult.f45813d, checkRiskResult.f45814e, checkRiskResult.f45815f));
                }
            }
            byte[] j17 = com.tencent.mm.normsg.WCProbe$Info.j(i17, arrayList, i18);
            if (j17 == null) {
                j17 = new byte[0];
            }
            bundle2.putByteArray("result", j17);
        } finally {
            try {
                return bundle2;
            } finally {
            }
        }
        return bundle2;
    }
}
