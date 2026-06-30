package i45;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f288400a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f288401b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f288402c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f288403d;

    public d(android.view.View view, java.lang.String action, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(action, "action");
        this.f288400a = view;
        this.f288401b = action;
        this.f288402c = bundle;
        this.f288403d = view.getContext();
    }

    public static /* synthetic */ void b(i45.d dVar, long j17, java.lang.String str, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = "";
        }
        if ((i17 & 4) != 0) {
            map = null;
        }
        dVar.a(j17, str, map);
    }

    public final void a(long j17, java.lang.String errorMsg, java.util.Map map) {
        android.os.Bundle bundle;
        java.util.Set<java.util.Map.Entry> entrySet;
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callbackPrivateCommand: errCode=");
        sb6.append(j17);
        sb6.append(", action=");
        java.lang.String str = this.f288401b;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxImeCommandHandler", sb6.toString());
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f288403d.getSystemService("input_method");
        android.os.Bundle bundle2 = this.f288402c;
        if (inputMethodManager != null) {
            java.lang.String str2 = str == null ? "" : str;
            if (bundle2 != null) {
                bundle2.putLong("command_error_code", j17);
                bundle2.putString("command_error_msg", errorMsg);
                if (map != null && (entrySet = map.entrySet()) != null) {
                    for (java.util.Map.Entry entry : entrySet) {
                        java.lang.Object value = entry.getValue();
                        if (value instanceof java.lang.Boolean) {
                            java.lang.String str3 = (java.lang.String) entry.getKey();
                            java.lang.Object value2 = entry.getValue();
                            kotlin.jvm.internal.o.e(value2, "null cannot be cast to non-null type kotlin.Boolean");
                            bundle2.putBoolean(str3, ((java.lang.Boolean) value2).booleanValue());
                        } else if (value instanceof java.lang.Integer) {
                            java.lang.String str4 = (java.lang.String) entry.getKey();
                            java.lang.Object value3 = entry.getValue();
                            kotlin.jvm.internal.o.e(value3, "null cannot be cast to non-null type kotlin.Int");
                            bundle2.putInt(str4, ((java.lang.Integer) value3).intValue());
                        } else if (value instanceof java.lang.Long) {
                            java.lang.String str5 = (java.lang.String) entry.getKey();
                            java.lang.Object value4 = entry.getValue();
                            kotlin.jvm.internal.o.e(value4, "null cannot be cast to non-null type kotlin.Long");
                            bundle2.putLong(str5, ((java.lang.Long) value4).longValue());
                        } else if (value instanceof java.lang.String) {
                            java.lang.String str6 = (java.lang.String) entry.getKey();
                            java.lang.Object value5 = entry.getValue();
                            kotlin.jvm.internal.o.e(value5, "null cannot be cast to non-null type kotlin.String");
                            bundle2.putString(str6, (java.lang.String) value5);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.WxImeCommandHandler", "callbackPrivateCommand value not support " + entry.getValue());
                        }
                    }
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            inputMethodManager.sendAppPrivateCommand(this.f288400a, str2, bundle);
        }
        java.lang.String d17 = i45.j.f288415a.d();
        java.lang.String string = bundle2 != null ? bundle2.getString("i_t", "") : null;
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = bundle2 != null ? bundle2.getString("command_id", "") : null;
        java.lang.String str7 = string2 != null ? string2 : "";
        com.tencent.mm.autogen.mmdata.rpt.WxImeCommandTokenReportStruct wxImeCommandTokenReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WxImeCommandTokenReportStruct();
        wxImeCommandTokenReportStruct.f62993d = wxImeCommandTokenReportStruct.b("CurrentImePackageName", d17, true);
        wxImeCommandTokenReportStruct.f62994e = wxImeCommandTokenReportStruct.b("Action", str, true);
        wxImeCommandTokenReportStruct.f62995f = (int) j17;
        wxImeCommandTokenReportStruct.f62996g = wxImeCommandTokenReportStruct.b("Token", string, true);
        wxImeCommandTokenReportStruct.f62997h = wxImeCommandTokenReportStruct.b("CommandId", str7, true);
        wxImeCommandTokenReportStruct.k();
        java.lang.String n17 = wxImeCommandTokenReportStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxImeReport", "report%s %s", 29960, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
