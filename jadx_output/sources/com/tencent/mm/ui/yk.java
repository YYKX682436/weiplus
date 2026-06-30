package com.tencent.mm.ui;

/* loaded from: classes15.dex */
public abstract class yk {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.ui.xk f212594a = new com.tencent.mm.ui.wk();

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mm.ui.xk xkVar = f212594a;
        if (xkVar != null) {
            xkVar.d(str, str2, objArr);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mm.ui.xk xkVar = f212594a;
        if (xkVar != null) {
            xkVar.e(str, str2, objArr);
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mm.ui.xk xkVar = f212594a;
        if (xkVar != null) {
            xkVar.i(str, str2, objArr);
        }
    }

    public static void d(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        if (f212594a != null) {
            if (objArr != null) {
                str2 = java.lang.String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            f212594a.e(str, str2 + "  " + android.util.Log.getStackTraceString(th6), new java.lang.Object[0]);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mm.ui.xk xkVar = f212594a;
        if (xkVar != null) {
            xkVar.v(str, str2, objArr);
        }
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mm.ui.xk xkVar = f212594a;
        if (xkVar != null) {
            xkVar.w(str, str2, objArr);
        }
    }
}
