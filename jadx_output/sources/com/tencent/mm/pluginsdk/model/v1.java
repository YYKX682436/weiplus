package com.tencent.mm.pluginsdk.model;

@j95.b
/* loaded from: classes9.dex */
public final class v1 extends i95.w implements o72.t4 {
    public r45.bq0 Ai(java.lang.String recordInfo) {
        kotlin.jvm.internal.o.g(recordInfo, "recordInfo");
        r45.ul5 c17 = com.tencent.mm.pluginsdk.model.x1.c(recordInfo);
        if (c17 == null) {
            return null;
        }
        r45.bq0 bq0Var = new r45.bq0();
        bq0Var.p(c17.f387463d);
        bq0Var.e(c17.f387464e);
        java.util.LinkedList items = c17.f387465f;
        kotlin.jvm.internal.o.f(items, "items");
        int i17 = 0;
        for (java.lang.Object obj : items) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bq0Var.f370964f.add((r45.gp0) obj);
            i17 = i18;
        }
        return bq0Var;
    }

    public java.lang.String wi(java.lang.String title, java.lang.String desc, r45.bq0 protoItem, int i17) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(protoItem, "protoItem");
        java.util.LinkedList<r45.gp0> dataList = protoItem.f370964f;
        kotlin.jvm.internal.o.f(dataList, "dataList");
        for (r45.gp0 gp0Var : dataList) {
            int i18 = gp0Var.I;
            if (i18 == 17 || i18 == 21) {
                r45.bq0 bq0Var = gp0Var.f375451y2;
                com.tencent.mm.pluginsdk.model.x1 x1Var = com.tencent.mm.pluginsdk.model.x1.f189497a;
                if (bq0Var != null) {
                    x1Var.a(bq0Var);
                }
                java.lang.String str = gp0Var.Z1;
                kotlin.jvm.internal.o.f(str, "getRecordInfo(...)");
                gp0Var.C0(x1Var.b(str));
            }
        }
        ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
        java.lang.String N = bt3.g2.N(title, desc, "", protoItem, protoItem.f370964f);
        kotlin.jvm.internal.o.f(N, "toRecordInfo(...)");
        return i17 != 35 ? r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(N, "cdndataurl", "cdn_dataurl", false), "cdndatakey", "cdn_datakey", false), "cdnthumburl", "cdn_thumburl", false), "cdnthumbkey", "cdn_thumbkey", false), "datasize", "fullsize", false), "thumbsize", "thumbfullsize", false), "sourcename", "datasrcname", false), "sourcetime", "datasrctime", false), "streamlowbandurl", "stream_lowbandurl", false), "streamdataurl", "stream_dataurl", false), "streamweburl", "stream_weburl", false) : N;
    }
}
