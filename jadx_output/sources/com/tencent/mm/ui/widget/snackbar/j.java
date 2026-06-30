package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f212477a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f212478b = true;

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (f212478b) {
            int i17 = al5.u4.f6058t;
            al5.t4 t4Var = new al5.t4(context);
            t4Var.f6042e = context.getString(com.tencent.mm.R.string.oep);
            t4Var.e(com.tencent.mm.R.raw.check_mark_regular);
            boolean z17 = true;
            t4Var.f6050m = true;
            if (str != null) {
                int length = str.length();
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        break;
                    }
                    int codePointAt = str.codePointAt(i18);
                    if (!java.lang.Character.isWhitespace(codePointAt)) {
                        z17 = false;
                        break;
                    }
                    i18 += java.lang.Character.charCount(codePointAt);
                }
                if (!z17) {
                    t4Var.a(context.getString(com.tencent.mm.R.string.oei));
                    t4Var.h(str, str2);
                    return;
                }
            }
            t4Var.h(null, str2);
        }
    }

    public static void b(android.content.Context context, android.view.View view, java.lang.String str, com.tencent.mm.ui.widget.snackbar.h hVar) {
        com.tencent.mm.ui.widget.snackbar.f fVar = new com.tencent.mm.ui.widget.snackbar.f(context, view);
        fVar.f212469c = str;
        fVar.f212470d = 1500;
        if (!f212478b) {
            if (hVar != null) {
                fVar.f212467a.f212474c = hVar;
            }
            fVar.a();
            return;
        }
        int i17 = al5.u4.f6058t;
        al5.t4 t4Var = new al5.t4(context);
        t4Var.f6042e = fVar.f212469c;
        t4Var.e(com.tencent.mm.R.raw.check_mark_regular);
        t4Var.a(null);
        t4Var.f6047j = hVar;
        t4Var.g();
    }

    public static void c(java.lang.String str, java.lang.String str2, android.content.Context context, com.tencent.mm.ui.widget.snackbar.g gVar, com.tencent.mm.ui.widget.snackbar.h hVar) {
        if (f212478b) {
            int i17 = al5.u4.f6058t;
            al5.t4 t4Var = new al5.t4(context);
            t4Var.f6042e = str;
            t4Var.e(com.tencent.mm.R.raw.check_mark_regular);
            t4Var.a(str2);
            t4Var.f6038a.f6014b = gVar;
            t4Var.f6047j = hVar;
            t4Var.g();
        }
    }
}
