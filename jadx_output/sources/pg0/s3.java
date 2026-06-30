package pg0;

@j95.b(dependencies = {pg0.j2.class})
/* loaded from: classes9.dex */
public class s3 extends i95.w implements qg0.h0 {
    public java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        if (!com.tencent.mm.storage.z3.m4(str2)) {
            return str;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
        return com.tencent.mm.sdk.platformtools.t8.K0(fj6) ? str : fj6;
    }

    public java.lang.String Bi(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        if (!com.tencent.mm.storage.z3.m4(str2)) {
            return str;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
        if (com.tencent.mm.sdk.platformtools.t8.K0(fj6)) {
            str3 = "";
        } else {
            str3 = "@" + fj6;
        }
        return str + str3;
    }

    public int Di(java.lang.String str, java.lang.String str2) {
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        if (com.tencent.mm.ui.bk.C() && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str = str2;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return -1;
        }
        if (str.contains("#")) {
            return android.graphics.Color.parseColor(str);
        }
        long V = com.tencent.mm.sdk.platformtools.t8.V(str, -1L);
        if (V >= 0) {
            return android.graphics.Color.parseColor(java.lang.String.format("#%08x", java.lang.Long.valueOf(V)));
        }
        return -1;
    }

    public int Ni() {
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("OpenIMC2BPayTransferMeueGrayscaleStatus", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "getUnionTransferGrayscaleStatus:%d", java.lang.Integer.valueOf(b17));
        return b17;
    }

    public void Ri(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18) {
        gb3.m.f270020a = str;
        gb3.m.f270021b = str3;
        gb3.m.f270022c = str4;
        gb3.m.f270023d = i17;
        gb3.m.f270024e = i18;
        gb3.m.f270025f = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeExposureReport", "setData：openId %s, coverId: %s bizName:%s", str, str4, str2);
    }

    public boolean Ui(java.lang.String str) {
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        long z07 = ((u41.j) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).wi()).z0(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "showUnionTransferSessionEntry:%d", java.lang.Long.valueOf(z07));
        return (z07 & 8) > 0;
    }

    public void wi(java.lang.String str, java.lang.Long l17) {
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        synchronized (com.tencent.mm.plugin.luckymoney.model.m5.class) {
            try {
                com.tencent.mm.plugin.luckymoney.model.m5.f145452a.put(str, l17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyUtil", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
