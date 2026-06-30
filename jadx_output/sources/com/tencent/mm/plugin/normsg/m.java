package com.tencent.mm.plugin.normsg;

/* loaded from: classes13.dex */
class m implements com.tencent.mm.ipcinvoker.k0 {
    private m() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        fo3.s sVar = fo3.s.INSTANCE;
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            sVar.Ig();
            bundle.setClassLoader(com.tencent.mm.sdk.platformtools.x2.f193071a.getClassLoader());
            long j17 = bundle.getLong("a_k_r_t");
            com.tencent.mm.plugin.normsg.api.CameraStatus cameraStatus = (com.tencent.mm.plugin.normsg.api.CameraStatus) bundle.getParcelable("a_k_c_s");
            com.tencent.mm.plugin.normsg.api.AudioModeStatus audioModeStatus = (com.tencent.mm.plugin.normsg.api.AudioModeStatus) bundle.getParcelable("a_k_a_m_s");
            byte[] c17 = com.tencent.mm.normsg.WCProbe$Info.c(j17, cameraStatus.c(), audioModeStatus.b(), bundle.getLong("a_k_pr_r_t"), ((com.tencent.mm.plugin.normsg.api.CameraStatus) bundle.getParcelable("a_k_pr_c_s")).c(), ((com.tencent.mm.plugin.normsg.api.AudioModeStatus) bundle.getParcelable("a_k_pr_a_m_s")).b());
            if (c17 == null) {
                c17 = new byte[0];
            }
            bundle2.putByteArray("result", c17);
        } finally {
            try {
                return bundle2;
            } finally {
            }
        }
        return bundle2;
    }
}
