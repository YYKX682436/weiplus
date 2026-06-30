package n34;

@j95.b
/* loaded from: classes4.dex */
public class p4 extends i95.w implements p94.o0 {
    public java.lang.String Ai(java.lang.String str, com.tencent.mm.pointers.PString pString) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getADExtStr", "com.tencent.mm.plugin.sns.SnsStatService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        java.lang.String str2 = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        } else {
            byte[] decode = android.util.Base64.decode(str, 0);
            r45.td6 td6Var = new r45.td6();
            try {
                td6Var.parseFrom(decode);
                r45.ud6 ud6Var = td6Var.f386329d;
                java.lang.String format = java.lang.String.format("snsId=%s&uxInfo=%s&source=%d&snsStatExt=%s", java.net.URLEncoder.encode(ud6Var.f387269f, com.tencent.mapsdk.internal.rv.f51270c), java.net.URLEncoder.encode(ud6Var.f387268e, com.tencent.mapsdk.internal.rv.f51270c), java.lang.Integer.valueOf(td6Var.f386329d.f387270g), java.net.URLEncoder.encode(com.tencent.mm.modelstat.k0.g(td6Var.f386329d), com.tencent.mapsdk.internal.rv.f51270c));
                r45.rd6 rd6Var = td6Var.f386331f;
                pString.value = rd6Var == null ? "" : rd6Var.f384752d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
                str2 = format;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsStatExtUtil", e17, "", new java.lang.Object[0]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getADExtStr", "com.tencent.mm.plugin.sns.SnsStatService");
        return str2;
    }

    public void wi(java.lang.String str, c01.l2 l2Var, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealWith", "com.tencent.mm.plugin.sns.SnsStatService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (f9Var.k2()) {
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
            } else {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(v17.Y1)) {
                    l2Var.i(str, v17.Y1);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWith", "com.tencent.mm.plugin.sns.SnsStatService");
    }
}
