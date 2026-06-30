package i05;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f286580a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f286581b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f286582c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f286583d;

    public j(android.view.View view, java.lang.String action, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(action, "action");
        this.f286580a = view;
        this.f286581b = action;
        this.f286582c = bundle;
        this.f286583d = view.getContext();
    }

    public static /* synthetic */ void b(i05.j jVar, long j17, java.lang.String str, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = "";
        }
        if ((i17 & 4) != 0) {
            map = null;
        }
        jVar.a(j17, str, map);
    }

    public final void a(long j17, java.lang.String errorMsg, java.util.Map map) {
        java.util.Set<java.util.Map.Entry> entrySet;
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callbackPrivateCommand: errCode=");
        sb6.append(j17);
        sb6.append(", action=");
        java.lang.String str = this.f286581b;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxImeCommandHandler", sb6.toString());
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f286583d.getSystemService("input_method");
        if (inputMethodManager != null) {
            android.os.Bundle bundle = this.f286582c;
            if (bundle != null) {
                bundle.putLong("command_error_code", j17);
                bundle.putString("command_error_msg", errorMsg);
                if (map != null && (entrySet = map.entrySet()) != null) {
                    for (java.util.Map.Entry entry : entrySet) {
                        java.lang.Object value = entry.getValue();
                        if (value instanceof java.lang.Boolean) {
                            java.lang.String str2 = (java.lang.String) entry.getKey();
                            java.lang.Object value2 = entry.getValue();
                            kotlin.jvm.internal.o.e(value2, "null cannot be cast to non-null type kotlin.Boolean");
                            bundle.putBoolean(str2, ((java.lang.Boolean) value2).booleanValue());
                        } else if (value instanceof java.lang.Integer) {
                            java.lang.String str3 = (java.lang.String) entry.getKey();
                            java.lang.Object value3 = entry.getValue();
                            kotlin.jvm.internal.o.e(value3, "null cannot be cast to non-null type kotlin.Int");
                            bundle.putInt(str3, ((java.lang.Integer) value3).intValue());
                        } else if (value instanceof java.lang.Long) {
                            java.lang.String str4 = (java.lang.String) entry.getKey();
                            java.lang.Object value4 = entry.getValue();
                            kotlin.jvm.internal.o.e(value4, "null cannot be cast to non-null type kotlin.Long");
                            bundle.putLong(str4, ((java.lang.Long) value4).longValue());
                        } else if (value instanceof java.lang.String) {
                            java.lang.String str5 = (java.lang.String) entry.getKey();
                            java.lang.Object value5 = entry.getValue();
                            kotlin.jvm.internal.o.e(value5, "null cannot be cast to non-null type kotlin.String");
                            bundle.putString(str5, (java.lang.String) value5);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.WxImeCommandHandler", "callbackPrivateCommand value not support " + entry.getValue());
                        }
                    }
                }
            } else {
                bundle = null;
            }
            inputMethodManager.sendAppPrivateCommand(this.f286580a, str, bundle);
        }
    }
}
