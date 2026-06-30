package com.tencent.mm.plugin.scanner;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.d0 f158718a = new com.tencent.mm.plugin.scanner.d0();

    public final int a(java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        if (z17) {
            return 2;
        }
        return com.tencent.mm.storage.z3.p4(str) ? 9 : 1;
    }

    public final void b(long j17, int i17, java.util.ArrayList dataList, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, long j18, int i18, int i19) {
        java.lang.String sb6;
        java.lang.String sb7;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[16];
        int i27 = 0;
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Integer.valueOf(dataList.size());
        java.lang.String str = "";
        if (dataList.isEmpty()) {
            sb6 = "";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            int i28 = 0;
            for (java.lang.Object obj : dataList) {
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean2 = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) obj;
                if (i28 != 0) {
                    sb8.append("#");
                }
                sb8.append(imageQBarDataBean2.f158619d);
                i28 = i29;
            }
            sb6 = sb8.toString();
            kotlin.jvm.internal.o.f(sb6, "toString(...)");
        }
        objArr[2] = sb6;
        if (dataList.isEmpty()) {
            sb7 = "";
        } else {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            int i37 = 0;
            for (java.lang.Object obj2 : dataList) {
                int i38 = i37 + 1;
                if (i37 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean3 = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) obj2;
                if (i37 != 0) {
                    sb9.append("#");
                }
                sb9.append(imageQBarDataBean3.f158628p);
                i37 = i38;
            }
            sb7 = sb9.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
        }
        objArr[3] = sb7;
        objArr[4] = java.lang.Integer.valueOf(i17);
        java.lang.String str2 = imageQBarDataBean != null ? imageQBarDataBean.f158619d : null;
        if (str2 == null) {
            str2 = "";
        }
        objArr[5] = str2;
        objArr[6] = java.lang.Integer.valueOf(imageQBarDataBean != null ? imageQBarDataBean.f158628p : 0);
        objArr[7] = java.lang.Long.valueOf(j18);
        objArr[8] = "";
        if (!(dataList.isEmpty())) {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            for (java.lang.Object obj3 : dataList) {
                int i39 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean4 = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) obj3;
                if (i27 != 0) {
                    sb10.append("#");
                }
                sb10.append(imageQBarDataBean4.f158622g);
                i27 = i39;
            }
            str = sb10.toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
        }
        objArr[9] = str;
        objArr[10] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[11] = java.lang.Integer.valueOf(i18);
        objArr[12] = 0;
        objArr[13] = 0;
        objArr[14] = java.lang.Integer.valueOf(i19);
        objArr[15] = java.lang.Long.valueOf(j17);
        g0Var.d(19332, objArr);
    }

    public final void c(long j17, int i17, java.util.ArrayList dataList, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, long j18, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        b(j17, i17, dataList, imageQBarDataBean, j18, z17 ? 2 : 1, i18);
    }

    public final void d(long j17, int i17, int i18, int i19, java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23040, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), url);
    }
}
