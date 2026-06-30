package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public final class x9 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j9 f165823e = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j9(null);

    /* renamed from: f, reason: collision with root package name */
    public static final kotlinx.coroutines.r0 f165824f;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y6 f165825a;

    /* renamed from: b, reason: collision with root package name */
    public final ab4.f0 f165826b;

    /* renamed from: c, reason: collision with root package name */
    public kotlinx.coroutines.y0 f165827c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f165828d;

    static {
        int i17 = kotlinx.coroutines.r0.N0;
        f165824f = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w9(kotlinx.coroutines.q0.f310567d);
    }

    public x9(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y6 adLandingPageQRCodeBtnComp, ab4.f0 f0Var) {
        kotlin.jvm.internal.o.g(adLandingPageQRCodeBtnComp, "adLandingPageQRCodeBtnComp");
        this.f165825a = adLandingPageQRCodeBtnComp;
        this.f165826b = f0Var;
        this.f165828d = "";
    }

    public static final void a(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9 x9Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$dismissDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        x9Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        if (u3Var != null) {
            try {
                if (u3Var.isShowing()) {
                    u3Var.dismiss();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$dismissDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0089, code lost:
    
        if (r1 == r6) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9 r21, java.lang.String r22, ab4.f0 r23, ab4.n0 r24, java.lang.String r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9.b(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9, java.lang.String, ab4.f0, ab4.n0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(android.content.Context context, ab4.n0 n0Var, java.lang.String str, ca4.b0 b0Var) {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y6 y6Var = this.f165825a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        ab4.f0 f0Var = this.f165826b;
        if (b0Var == null || f0Var == null || n0Var == null || context == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestQR failed! ");
            sb6.append(b0Var == null);
            sb6.append(' ');
            sb6.append(f0Var == null);
            sb6.append(' ');
            sb6.append(n0Var == null);
            sb6.append(' ');
            sb6.append(context == null);
            sb6.append(' ');
            com.tencent.mars.xlog.Log.e("AdLandingQRCodeBtnCompDelegate", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
            return;
        }
        try {
            java.lang.String str2 = this.f165828d;
            if (r26.n0.N(str2)) {
                java.lang.String str3 = f0Var.f2837z1;
                if (str3 == null) {
                    str3 = "";
                }
                str2 = str3;
            }
            y6Var.f165386t.b("qrUrl", str2);
            y6Var.P();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingQRCodeBtnCompDelegate", "requestQR() clickReport err!" + th6);
        }
        if (this.f165827c == null) {
            this.f165827c = kotlinx.coroutines.z0.b();
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlinx.coroutines.y0 y0Var = this.f165827c;
        if (y0Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a.plus(f165824f), null, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q9(h0Var, context, this, n0Var, str, b0Var, null), 2, null)).p(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r9(this, h0Var));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
    }
}
