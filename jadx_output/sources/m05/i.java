package m05;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final m05.i f322570a = new m05.i();

    public final void a(java.lang.String bizType, java.lang.String bizId, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(bizType, "bizType");
        kotlin.jvm.internal.o.g(bizId, "bizId");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, bizType, bizId, str, str2, java.lang.Integer.valueOf(com.tencent.mm.ui.bk.C() ? 1 : 0), "", java.lang.Integer.valueOf(j65.e.b() ? 1 : 0), java.lang.Integer.valueOf(i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a) > 1.0f ? 1 : 0));
    }

    public final void b(java.lang.String bizId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.o.g(bizId, "bizId");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = "9";
        objArr[1] = bizId;
        objArr[2] = str;
        objArr[3] = str2;
        if (str3 == null) {
            str3 = "";
        }
        objArr[4] = str3;
        if (str4 == null) {
            str4 = "";
        }
        objArr[5] = str4;
        if (str5 == null) {
            str5 = "";
        }
        objArr[6] = str5;
        if (str6 == null) {
            str6 = "";
        }
        objArr[7] = str6;
        g0Var.d(36486, objArr);
    }

    public final void c(java.lang.String functionId, java.lang.String errorCode, java.lang.String str) {
        kotlin.jvm.internal.o.g(functionId, "functionId");
        kotlin.jvm.internal.o.g(errorCode, "errorCode");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, "4", functionId, errorCode, str, "", java.lang.Integer.valueOf(com.tencent.mm.ui.bk.C() ? 1 : 0), java.lang.Integer.valueOf(j65.e.b() ? 1 : 0), java.lang.Integer.valueOf(i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a) > 1.0f ? 1 : 0));
    }

    public final void d(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l17, java.lang.Long l18) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[0] = com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = "";
        objArr[3] = "";
        if (str == null) {
            str = "";
        }
        objArr[4] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[5] = str2;
        if (str3 == null) {
            str3 = "";
        }
        objArr[6] = str3;
        if (str4 == null) {
            str4 = "";
        }
        objArr[7] = str4;
        objArr[8] = java.lang.Long.valueOf(l17 != null ? l17.longValue() : -1L);
        objArr[9] = java.lang.Long.valueOf(l18 != null ? l18.longValue() : -1L);
        g0Var.d(36486, objArr);
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = "";
        objArr[3] = "";
        if (str == null) {
            str = "";
        }
        objArr[4] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[5] = str2;
        if (str3 == null) {
            str3 = "";
        }
        objArr[6] = str3;
        if (str4 == null) {
            str4 = "";
        }
        objArr[7] = str4;
        objArr[8] = java.lang.Long.valueOf(l17 != null ? l17.longValue() : -1L);
        objArr[9] = java.lang.Long.valueOf(l18 != null ? l18.longValue() : -1L);
        objArr[10] = java.lang.Long.valueOf(l19 != null ? l19.longValue() : -1L);
        g0Var.d(36486, objArr);
    }
}
