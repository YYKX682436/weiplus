package j94;

/* loaded from: classes4.dex */
public final class f implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f298549a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.u3 f298550b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f298551c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f298552d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.e80 f298553e;

    public f(android.content.Context context, com.tencent.mm.ui.widget.dialog.u3 u3Var, java.lang.String kefuUrl, java.lang.String uxInfo, r45.e80 confirmInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(kefuUrl, "kefuUrl");
        kotlin.jvm.internal.o.g(uxInfo, "uxInfo");
        kotlin.jvm.internal.o.g(confirmInfo, "confirmInfo");
        this.f298549a = context;
        this.f298550b = u3Var;
        this.f298551c = kefuUrl;
        this.f298552d = uxInfo;
        this.f298553e = confirmInfo;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
        try {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f298550b;
            if (u3Var != null) {
                u3Var.dismiss();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("WsFoldJumpWxKefuHelper", "onFinish dismiss progressDialog exp=%s", th6.toString());
        }
        j41.u uVar = i0Var != null ? i0Var.f297643d : null;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = uVar != null ? java.lang.Boolean.valueOf(((k41.g0) uVar).f303996p1) : null;
        objArr[1] = java.lang.Integer.valueOf(i0Var != null ? i0Var.f297644e : -1);
        objArr[2] = java.lang.Integer.valueOf(i0Var != null ? i0Var.f297640a : -1);
        objArr[3] = java.lang.Integer.valueOf(i0Var != null ? i0Var.f297641b : -1);
        com.tencent.mars.xlog.Log.i("WsFoldJumpWxKefuHelper", "onFinish, isValid=%s, confirmType=%d, errType=%d, errCode=%d", objArr);
        android.content.Context context = this.f298549a;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && activity.isFinishing()) {
            com.tencent.mars.xlog.Log.w("WsFoldJumpWxKefuHelper", "onFinish, context isFinishing, return");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
            return;
        }
        if (!(uVar != null && ((k41.g0) uVar).f303996p1)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1903L, 15L);
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = java.lang.Integer.valueOf(i0Var != null ? i0Var.f297640a : -1);
            objArr2[1] = java.lang.Integer.valueOf(i0Var != null ? i0Var.f297641b : -1);
            objArr2[2] = i0Var != null ? i0Var.f297642c : null;
            com.tencent.mars.xlog.Log.w("WsFoldJumpWxKefuHelper", "onFinish, contact is not valid, errType=%d, errCode=%d, errMsg=%s", objArr2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
            return;
        }
        r45.e80 e80Var = this.f298553e;
        java.lang.String str = e80Var.f373092d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = e80Var.f373093e;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = e80Var.f373094f;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String str6 = ((k41.g0) uVar).field_smallHeadImg;
        java.lang.String str7 = str6 == null ? "" : str6;
        k41.g0 g0Var = (k41.g0) uVar;
        java.lang.String str8 = g0Var.field_nickname;
        java.lang.String str9 = str8 == null ? "" : str8;
        java.lang.String str10 = g0Var.field_openImAppId;
        java.lang.String str11 = str10 == null ? "" : str10;
        java.lang.String str12 = g0Var.field_openImDescWordingId;
        try {
            j94.g.a(j94.g.f298554a, context, this.f298551c, this.f298552d, new com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo(str2, str4, str5, str7, str9, str11, str12 == null ? "" : str12));
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("WsFoldJumpWxKefuHelper", "onFinish, jumpToConfirmPage exp=%s", th7.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
    }

    @Override // j41.w
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTryFetch", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
        com.tencent.mars.xlog.Log.i("WsFoldJumpWxKefuHelper", "onTryFetch, username=%s", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTryFetch", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
    }
}
