package com.tencent.mm.plugin.normsg;

/* loaded from: classes13.dex */
public final class NormsgDataService extends com.tencent.mm.util.HotpotService {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f152400f = 0;

    @Override // com.tencent.mm.util.HotpotService
    public void b(int i17, android.os.Bundle bundle, android.os.Bundle bundle2) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        java.lang.String str;
        if (bundle != null) {
            bundle.setClassLoader(getApplicationContext().getClassLoader());
        }
        boolean z17 = false;
        if (i17 == 1) {
            java.lang.String string = bundle.getString("package_name");
            try {
                android.content.pm.PackageManager packageManager = getApplicationContext().getPackageManager();
                str = packageManager.getApplicationInfo(string, 0).loadLabel(packageManager).toString();
            } catch (java.lang.Throwable unused) {
                str = "";
            }
            bundle2.putString("result", str);
            return;
        }
        fo3.s sVar = fo3.s.INSTANCE;
        int i18 = 2;
        if (i17 == 2) {
            try {
                z17 = sVar.o5();
            } catch (java.lang.Throwable unused2) {
            }
            bundle2.putBoolean("result", z17);
            return;
        }
        if (i17 == 3) {
            try {
                i18 = sVar.yi();
            } catch (java.lang.Throwable unused3) {
            }
            bundle2.putInt("result", i18);
            return;
        }
        if (i17 == 4) {
            try {
                bArr5 = com.tencent.mm.normsg.WCProbe$Info.g((android.content.Intent) bundle.getParcelable("a_k_i"));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NormsgDS", "run m4 error: " + th6);
                bArr5 = new byte[0];
            }
            bundle2.putByteArray("result", bArr5);
            return;
        }
        if (i17 == 5) {
            try {
                bArr4 = com.tencent.mm.normsg.WCProbe$Info.i(bundle.getInt("a_k_d_i"), bundle.getString("a_k_d_n"), bundle.getLong("a_k_t"), bundle.getInt("a_k_d_e_t"), bundle.getString("a_k_d_o_p"));
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NormsgDS", "run m5 error: " + th7);
                bArr4 = new byte[0];
            }
            bundle2.putByteArray("result", bArr4);
            return;
        }
        if (i17 == 6) {
            try {
                bArr3 = com.tencent.mm.normsg.WCProbe$Info.c(bundle.getLong("a_k_r_t"), ((com.tencent.mm.plugin.normsg.api.CameraStatus) bundle.getParcelable("a_k_c_s")).c(), ((com.tencent.mm.plugin.normsg.api.AudioModeStatus) bundle.getParcelable("a_k_a_m_s")).b(), bundle.getLong("a_k_pr_r_t"), ((com.tencent.mm.plugin.normsg.api.CameraStatus) bundle.getParcelable("a_k_pr_c_s")).c(), ((com.tencent.mm.plugin.normsg.api.AudioModeStatus) bundle.getParcelable("a_k_pr_a_m_s")).b());
            } catch (java.lang.Throwable th8) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NormsgDS", "run m6 error: " + th8);
                bArr3 = new byte[0];
            }
            bundle2.putByteArray("result", bArr3);
            return;
        }
        if (i17 == 7) {
            try {
                bArr2 = com.tencent.mm.normsg.WCProbe$Info.h(bundle.getByteArray("a_k_a_r_i_f_o"));
            } catch (java.lang.Throwable th9) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NormsgDS", "run m7 error: " + th9);
                bArr2 = new byte[0];
            }
            bundle2.putByteArray("result", bArr2);
            return;
        }
        if (i17 != 8) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NormsgDS", "unknown op: %s", java.lang.Integer.valueOf(i17));
            return;
        }
        int i19 = bundle.getInt("a_k_r_c");
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("a_k_c_r_r");
        int i27 = bundle.getInt("a_k_v_a_f_c");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (parcelableArrayList != null) {
                java.util.Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    com.iqoo.secure.antifraud.thirdpart.CheckRiskResult checkRiskResult = (com.iqoo.secure.antifraud.thirdpart.CheckRiskResult) it.next();
                    arrayList.add(new com.tencent.mm.normsg.j(checkRiskResult.f45813d, checkRiskResult.f45814e, checkRiskResult.f45815f));
                }
            }
            bArr = com.tencent.mm.normsg.WCProbe$Info.j(i19, arrayList, i27);
        } catch (java.lang.Throwable th10) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NormsgDS", "run m8 error: " + th10);
            bArr = new byte[0];
        }
        bundle2.putByteArray("result", bArr);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mm.normsg.o.a(fo3.s.INSTANCE.C9());
    }
}
