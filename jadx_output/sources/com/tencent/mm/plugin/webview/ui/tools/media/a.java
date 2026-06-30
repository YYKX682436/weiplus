package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.media.a f185739a = new com.tencent.mm.plugin.webview.ui.tools.media.a();

    public final void a(int i17, int i18, int i19) {
        int i27 = 5;
        int i28 = 3;
        if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            if (i18 == 1) {
                i28 = 11;
            } else if (i18 == 2) {
                i28 = 23;
            } else if (i18 != 3) {
                i28 = i18 != 5 ? 7 : 19;
            }
            objArr[0] = java.lang.Integer.valueOf(i28);
            objArr[1] = java.lang.Integer.valueOf(i19);
            g0Var.d(18589, objArr);
            return;
        }
        int i29 = 4;
        if (i17 == 2) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            if (i18 == 1) {
                i29 = 12;
            } else if (i18 != 3) {
                i29 = 8;
            }
            objArr2[0] = java.lang.Integer.valueOf(i29);
            objArr2[1] = java.lang.Integer.valueOf(i19);
            g0Var2.d(18589, objArr2);
            return;
        }
        if (i17 == 4) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            objArr3[0] = java.lang.Integer.valueOf(i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 5 ? 18 : 20 : 17 : 24 : 22);
            objArr3[1] = java.lang.Integer.valueOf(i19);
            g0Var3.d(18589, objArr3);
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr4 = new java.lang.Object[2];
        if (i18 == 1) {
            i27 = 13;
        } else if (i18 == 2) {
            i27 = 25;
        } else if (i18 != 3) {
            i27 = i18 != 5 ? 9 : 21;
        }
        objArr4[0] = java.lang.Integer.valueOf(i27);
        objArr4[1] = java.lang.Integer.valueOf(i19);
        g0Var4.d(18589, objArr4);
    }
}
