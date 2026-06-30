package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class c6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f146778a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f146779b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f146780c = false;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f146781d;

    public boolean a(int i17, boolean z17) {
        android.widget.TextView textView;
        this.f146780c = false;
        this.f146779b = false;
        int i18 = 0;
        while (true) {
            java.util.List list = this.f146778a;
            if (i18 >= ((java.util.LinkedList) list).size()) {
                break;
            }
            com.tencent.mm.plugin.luckymoney.ui.d6 d6Var = (com.tencent.mm.plugin.luckymoney.ui.d6) ((java.util.LinkedList) list).get(i18);
            int c17 = d6Var.c();
            if (c17 != 0) {
                d6Var.a();
                g(d6Var.d(c17));
                this.f146780c = true;
            } else {
                d6Var.b();
            }
            i18++;
        }
        if (!this.f146780c && (textView = this.f146781d) != null) {
            textView.setVisibility(8);
            this.f146779b = false;
        }
        return this.f146780c;
    }

    public boolean b() {
        android.widget.TextView textView;
        this.f146780c = false;
        this.f146779b = false;
        int i17 = 0;
        while (true) {
            java.util.List list = this.f146778a;
            if (i17 >= ((java.util.LinkedList) list).size()) {
                break;
            }
            com.tencent.mm.plugin.luckymoney.ui.d6 d6Var = (com.tencent.mm.plugin.luckymoney.ui.d6) ((java.util.LinkedList) list).get(i17);
            int e17 = d6Var.e();
            if (e17 == 0 || this.f146780c) {
                d6Var.b();
            } else {
                d6Var.a();
                g(d6Var.d(e17));
                this.f146780c = true;
            }
            i17++;
        }
        if (!this.f146780c && (textView = this.f146781d) != null) {
            textView.setVisibility(8);
            this.f146779b = false;
        }
        return this.f146780c;
    }

    public boolean c() {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f146778a;
            if (i17 >= ((java.util.LinkedList) list).size()) {
                return false;
            }
            if (((com.tencent.mm.plugin.luckymoney.ui.d6) ((java.util.LinkedList) list).get(i17)).c() != 0) {
                return true;
            }
            i17++;
        }
    }

    public void d(com.tencent.mm.plugin.luckymoney.ui.d6 d6Var) {
        if (d6Var == null) {
            return;
        }
        java.util.List list = this.f146778a;
        if (((java.util.LinkedList) list).contains(d6Var)) {
            return;
        }
        ((java.util.LinkedList) list).add(d6Var);
    }

    public void e() {
        ((java.util.LinkedList) this.f146778a).clear();
    }

    public void f(java.lang.String str) {
        if (this.f146781d != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f146781d.setText(str);
            this.f146781d.setVisibility(0);
            this.f146779b = true;
        } else {
            android.widget.TextView textView = this.f146781d;
            if (textView != null) {
                textView.setVisibility(8);
                this.f146779b = false;
            }
        }
    }

    public void g(java.lang.String str) {
        if (this.f146781d == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!this.f146779b) {
            this.f146781d.setText(str);
        }
        this.f146781d.setVisibility(0);
        this.f146781d.sendAccessibilityEvent(32768);
        this.f146779b = true;
    }
}
