package com.tencent.mm.plugin.sns.model;

/* loaded from: classes.dex */
public class y4 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.vfs.r6[] r6VarArr;
        com.tencent.mm.vfs.r6[] G;
        java.lang.String str5 = "run";
        java.lang.String str6 = "com.tencent.mm.plugin.sns.model.SnsCore$21";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsCore$21");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dumpSnsFileImp", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (com.tencent.mm.plugin.sns.model.l4.f164405x1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpSnsFileImp", "com.tencent.mm.plugin.sns.model.SnsCore");
            str = "run";
            str2 = "com.tencent.mm.plugin.sns.model.SnsCore$21";
        } else {
            com.tencent.mm.plugin.sns.model.l4.f164405x1 = true;
            com.tencent.mm.vfs.r6[] G2 = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.sns.model.l4.Di()).G();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "snscheckfile start");
            long j17 = 0;
            int i17 = 0;
            while (i17 < G2.length) {
                com.tencent.mm.vfs.r6[] G3 = G2[i17].G();
                if (G3 != null) {
                    int i18 = 0;
                    while (i18 < G3.length) {
                        java.lang.String[] D = G3[i18].D();
                        if (D == null || (G = G3[i18].G()) == null) {
                            str3 = str5;
                            str4 = str6;
                            r6VarArr = G2;
                        } else {
                            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                            r6VarArr = G2;
                            int i19 = 0;
                            while (i19 < G.length) {
                                com.tencent.mm.vfs.r6 r6Var = G[i19];
                                long C = j17 + r6Var.C();
                                java.lang.String str7 = (java.lang.String) android.text.format.DateFormat.format("yyyy-M-d kk:mm", r6Var.B());
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(r6Var.o());
                                sb6.append(" ");
                                java.lang.String str8 = str5;
                                sb6.append(r6Var.C());
                                sb6.append(" ");
                                sb6.append(r6Var.B());
                                sb6.append(" ");
                                sb6.append(str7);
                                java.lang.String sb7 = sb6.toString();
                                stringBuffer.append(sb7 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", sb7);
                                i19++;
                                j17 = C;
                                G = G;
                                str5 = str8;
                                str6 = str6;
                            }
                            str3 = str5;
                            str4 = str6;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "filepath %s %d", G3[i18].o(), java.lang.Integer.valueOf(D.length));
                        }
                        i18++;
                        G2 = r6VarArr;
                        str5 = str3;
                        str6 = str4;
                    }
                }
                i17++;
                G2 = G2;
                str5 = str5;
                str6 = str6;
            }
            str = str5;
            str2 = str6;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "snscheckfile end " + j17);
            com.tencent.mm.plugin.sns.model.l4.f164405x1 = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpSnsFileImp", "com.tencent.mm.plugin.sns.model.SnsCore");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
