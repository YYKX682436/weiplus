package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes14.dex */
public class o3 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f211938a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.h f211939b = new com.tencent.mm.ui.widget.dialog.h();

    public o3(android.content.Context context) {
        this.f211938a = context;
    }

    public com.tencent.mm.ui.widget.dialog.z2 a() {
        com.tencent.mm.ui.widget.dialog.a4 a4Var;
        android.content.Context context = this.f211938a;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context);
        com.tencent.mm.ui.widget.dialog.h hVar = this.f211939b;
        int i17 = hVar.f211804a;
        if (i17 != 0) {
            z2Var.f212064p = i17;
            z2Var.d();
        }
        int i18 = hVar.f211805b;
        if (i18 != 0) {
            z2Var.f212065q = i18;
            z2Var.e();
        }
        com.tencent.mm.ui.widget.dialog.a4 a4Var2 = z2Var.f212055d;
        if (a4Var2 != null) {
            a4Var2.setCancelable(hVar.f211806c);
            z2Var.f212055d.f211745h = hVar.f211806c;
        }
        java.lang.CharSequence charSequence = hVar.f211808e;
        if (charSequence != null) {
            z2Var.y(charSequence);
        }
        int i19 = hVar.f211809f;
        if (i19 != 0) {
            z2Var.x(i19);
        }
        java.lang.CharSequence charSequence2 = hVar.f211810g;
        if (charSequence2 != null) {
            z2Var.q(charSequence2);
        }
        int i27 = hVar.f211811h;
        if (i27 != -1) {
            z2Var.r(context, i27);
        }
        int i28 = hVar.f211812i;
        if (i28 != 0) {
            z2Var.i(i28);
        }
        android.view.View view = hVar.f211807d;
        if (view != null) {
            z2Var.j(view);
        }
        com.tencent.mm.ui.widget.dialog.q3 q3Var = hVar.f211814k;
        if (q3Var != null) {
            z2Var.l(q3Var);
        }
        com.tencent.mm.ui.widget.dialog.r3 r3Var = hVar.f211813j;
        if (r3Var != null) {
            z2Var.K = r3Var;
            com.tencent.mm.ui.widget.dialog.o3 o3Var = z2Var.f212056e;
            if (o3Var != null) {
                o3Var.f211939b.f211813j = r3Var;
            }
        }
        android.content.DialogInterface.OnShowListener onShowListener = hVar.f211815l;
        if (onShowListener != null && (a4Var = z2Var.f212055d) != null) {
            a4Var.setOnShowListener(onShowListener);
        }
        return z2Var;
    }
}
