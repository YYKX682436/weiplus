package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class k2 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f166037e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.sns.storage.j2.f166026w, "SnsReportKv")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f166038d;

    public k2(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.sns.storage.j2.f166026w, "SnsReportKv", dm.wa.f240887m);
        this.f166038d = k0Var;
    }

    public int y0(r45.e96 e96Var) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        r45.e96 e96Var2 = new r45.e96();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int size = e96Var.f373180d.size();
            linkedList = e96Var2.f373180d;
            if (i17 >= size) {
                break;
            }
            r45.e44 e44Var = (r45.e44) e96Var.f373180d.get(i17);
            byte[] bArr = e44Var.f373008e.f192156a;
            if (bArr.length + i18 > 51200) {
                z0(e96Var2, i18);
                i19++;
                linkedList.clear();
                i18 = 0;
            } else {
                i18 += bArr.length;
                linkedList.add(e44Var);
            }
            i17++;
        }
        if (linkedList.size() > 0) {
            i19++;
            z0(e96Var2, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        return i19;
    }

    public final int z0(r45.e96 e96Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addKvImpl", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        try {
            byte[] byteArray = e96Var.toByteArray();
            com.tencent.mm.plugin.sns.storage.j2 j2Var = new com.tencent.mm.plugin.sns.storage.j2();
            j2Var.field_value = byteArray;
            j2Var.field_logtime = java.lang.System.currentTimeMillis();
            j2Var.field_logsize = i17;
            j2Var.field_offset = 0;
            int l17 = (int) this.f166038d.l("SnsReportKv", "", j2Var.convertTo());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addKvImpl", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
            return l17;
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addKvImpl", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
            return 0;
        }
    }
}
