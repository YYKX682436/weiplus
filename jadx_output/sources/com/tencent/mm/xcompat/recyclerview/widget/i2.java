package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.h2 f214544a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.g2 f214545b = new com.tencent.mm.xcompat.recyclerview.widget.g2();

    public i2(com.tencent.mm.xcompat.recyclerview.widget.h2 h2Var) {
        this.f214544a = h2Var;
    }

    public android.view.View a(int i17, int i18, int i19, int i27) {
        com.tencent.mm.xcompat.recyclerview.widget.h2 h2Var = this.f214544a;
        int a17 = h2Var.a();
        int b17 = h2Var.b();
        int i28 = i18 > i17 ? 1 : -1;
        android.view.View view = null;
        while (i17 != i18) {
            android.view.View childAt = h2Var.getChildAt(i17);
            int c17 = h2Var.c(childAt);
            int d17 = h2Var.d(childAt);
            com.tencent.mm.xcompat.recyclerview.widget.g2 g2Var = this.f214545b;
            g2Var.f214535b = a17;
            g2Var.f214536c = b17;
            g2Var.f214537d = c17;
            g2Var.f214538e = d17;
            if (i19 != 0) {
                g2Var.f214534a = i19 | 0;
                if (g2Var.a()) {
                    return childAt;
                }
            }
            if (i27 != 0) {
                g2Var.f214534a = i27 | 0;
                if (g2Var.a()) {
                    view = childAt;
                }
            }
            i17 += i28;
        }
        return view;
    }
}
