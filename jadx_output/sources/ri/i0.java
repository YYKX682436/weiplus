package ri;

/* loaded from: classes16.dex */
public final class i0 {
    public i0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(ri.j0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        boolean h17 = ih.a.h("clicfg_matrix_disable_push_isolated_memory_report", false);
        boolean h18 = ih.a.h("clicfg_matrix_enable_push_isolated_memory_report_solid", true);
        boolean Ui = ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Ui();
        long j17 = data.f395881o;
        long j18 = data.f395880n;
        java.lang.String str = data.f395879m;
        int i17 = data.f395878l;
        java.lang.String str2 = data.f395877k;
        int i18 = data.f395876j;
        java.lang.String str3 = data.f395875i;
        int i19 = data.f395874h;
        long j19 = data.f395873g;
        long j27 = data.f395872f;
        long j28 = data.f395871e;
        int i27 = data.f395870d;
        int i28 = data.f395869c;
        java.lang.String str4 = data.f395868b;
        int i29 = data.f395867a;
        if (h17 || !(Ui || h18)) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[33];
            objArr[0] = java.lang.Integer.valueOf(i29);
            objArr[1] = str4;
            objArr[2] = java.lang.Integer.valueOf(i28);
            objArr[3] = java.lang.Integer.valueOf(i27);
            objArr[4] = java.lang.Long.valueOf(j28);
            objArr[5] = java.lang.Long.valueOf(j27);
            objArr[6] = java.lang.Long.valueOf(j19);
            objArr[7] = java.lang.Integer.valueOf(i19);
            objArr[8] = str3;
            objArr[9] = java.lang.Integer.valueOf(i18);
            objArr[10] = str2;
            objArr[11] = java.lang.Integer.valueOf(i17);
            objArr[12] = str;
            objArr[13] = java.lang.Long.valueOf(j18);
            objArr[14] = java.lang.Long.valueOf(j17);
            objArr[15] = java.lang.Long.valueOf(data.f395882p);
            objArr[16] = data.f395883q;
            objArr[17] = data.f395884r;
            objArr[18] = java.lang.Integer.valueOf(data.f395885s);
            objArr[19] = java.lang.Integer.valueOf(data.f395886t);
            objArr[20] = java.lang.Integer.valueOf(data.f395887u);
            objArr[21] = java.lang.Integer.valueOf(data.f395888v);
            objArr[22] = java.lang.Integer.valueOf(data.f395889w);
            objArr[23] = java.lang.Long.valueOf(data.f395890x);
            objArr[24] = data.f395891y;
            objArr[25] = data.f395892z;
            java.lang.String str5 = data.A;
            if (str5 == null) {
                str5 = "";
            }
            objArr[26] = str5;
            objArr[27] = java.lang.Integer.valueOf(data.B);
            objArr[28] = java.lang.Integer.valueOf(data.C);
            objArr[29] = data.D;
            objArr[30] = data.E;
            objArr[31] = java.lang.Integer.valueOf(data.F);
            objArr[32] = java.lang.Integer.valueOf(data.G);
            g0Var.d(24556, objArr);
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[33];
        objArr2[0] = java.lang.Integer.valueOf(i29);
        objArr2[1] = str4;
        objArr2[2] = java.lang.Integer.valueOf(i28);
        objArr2[3] = java.lang.Integer.valueOf(i27);
        objArr2[4] = java.lang.Long.valueOf(j28);
        objArr2[5] = java.lang.Long.valueOf(j27);
        objArr2[6] = java.lang.Long.valueOf(j19);
        objArr2[7] = java.lang.Integer.valueOf(i19);
        objArr2[8] = str3;
        objArr2[9] = java.lang.Integer.valueOf(i18);
        objArr2[10] = str2;
        objArr2[11] = java.lang.Integer.valueOf(i17);
        objArr2[12] = str;
        objArr2[13] = java.lang.Long.valueOf(j18);
        objArr2[14] = java.lang.Long.valueOf(j17);
        objArr2[15] = java.lang.Long.valueOf(data.f395882p);
        objArr2[16] = data.f395883q;
        objArr2[17] = data.f395884r;
        objArr2[18] = java.lang.Integer.valueOf(data.f395885s);
        objArr2[19] = java.lang.Integer.valueOf(data.f395886t);
        objArr2[20] = java.lang.Integer.valueOf(data.f395887u);
        objArr2[21] = java.lang.Integer.valueOf(data.f395888v);
        objArr2[22] = java.lang.Integer.valueOf(data.f395889w);
        objArr2[23] = java.lang.Long.valueOf(data.f395890x);
        objArr2[24] = data.f395891y;
        objArr2[25] = data.f395892z;
        java.lang.String str6 = data.A;
        if (str6 == null) {
            str6 = "";
        }
        objArr2[26] = str6;
        objArr2[27] = java.lang.Integer.valueOf(data.B);
        objArr2[28] = java.lang.Integer.valueOf(data.C);
        objArr2[29] = data.D;
        objArr2[30] = data.E;
        objArr2[31] = java.lang.Integer.valueOf(data.F);
        objArr2[32] = java.lang.Integer.valueOf(data.G);
        if (!kx3.a.f313280a) {
            g0Var2.H(24556, false, false, objArr2);
        } else {
            boolean z17 = kx3.a.f313281b;
            g0Var2.H(24556, z17, z17, objArr2);
        }
    }
}
