package q35;

/* loaded from: classes11.dex */
public final /* synthetic */ class b$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.System.currentTimeMillis();
        boolean[] zArr = q35.b.f359970a;
        if (!zArr[5] && !q35.b.a(lp0.b.z())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 5);
            zArr[5] = true;
        }
        if (!zArr[7] && !q35.b.a(lp0.b.l())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 7);
            zArr[7] = true;
        }
        if (!zArr[8] && !q35.b.a(lp0.b.g0())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 8);
            zArr[8] = true;
        }
        if (!zArr[9]) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb6.append(gm0.j1.u().d());
            sb6.append("emoji/");
            if (!q35.b.a(sb6.toString())) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 9);
                zArr[9] = true;
            }
        }
        if (!zArr[10]) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb7.append(gm0.j1.u().d());
            sb7.append("record/");
            if (!q35.b.a(sb7.toString())) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 10);
                zArr[10] = true;
            }
        }
        if (!zArr[11] && !q35.b.a(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).wi())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 11);
            zArr[11] = true;
        }
        if (!zArr[12] && !q35.b.a(com.tencent.mm.storage.s3.a())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 12);
            zArr[12] = true;
        }
        if (!zArr[13] && !q35.b.a(g83.a.a())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 13);
            zArr[13] = true;
        }
        if (!zArr[14] && !q35.b.a(g83.a.b())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 14);
            zArr[14] = true;
        }
        if (!zArr[15]) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb8.append(gm0.j1.u().d());
            sb8.append("video/");
            if (!q35.b.a(sb8.toString())) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 15);
                zArr[15] = true;
            }
        }
        if (!zArr[16]) {
            java.util.HashMap hashMap = w21.x0.f442511a;
            if (!q35.b.a(com.tencent.mm.vfs.q7.c("voice") + "/")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 16);
                zArr[16] = true;
            }
        }
        if (!zArr[17]) {
            java.util.HashMap hashMap2 = w21.x0.f442511a;
            if (!q35.b.a(com.tencent.mm.vfs.q7.c("voice2") + "/")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 17);
                zArr[17] = true;
            }
        }
        if (!zArr[18]) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb9.append(gm0.j1.u().d());
            sb9.append("dbback/");
            if (!q35.b.a(sb9.toString())) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 18);
                zArr[18] = true;
            }
        }
        if (!zArr[19]) {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb10.append(gm0.j1.u().d());
            sb10.append("mailapp/");
            if (!q35.b.a(sb10.toString())) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 19);
                zArr[19] = true;
            }
        }
        if (!zArr[20]) {
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb11.append(gm0.j1.u().d());
            sb11.append("openim/");
            if (!q35.b.a(sb11.toString())) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 20);
                zArr[20] = true;
            }
        }
        java.lang.System.currentTimeMillis();
    }
}
