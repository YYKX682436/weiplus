package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes9.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f211820a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.a f211821b = new com.tencent.mm.ui.widget.dialog.a();

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f211822c;

    public i0(android.content.Context context) {
        this.f211820a = context;
    }

    public com.tencent.mm.ui.widget.dialog.j0 a() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this.f211820a, com.tencent.mm.R.style.f494791wd);
        com.tencent.mm.ui.widget.dialog.a aVar = this.f211821b;
        j0Var.e(aVar);
        this.f211822c = j0Var;
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        return j0Var;
    }

    public com.tencent.mm.ui.widget.dialog.j0 b(boolean z17) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this.f211820a, com.tencent.mm.R.style.f494791wd);
        com.tencent.mm.ui.widget.dialog.a aVar = this.f211821b;
        j0Var.e(aVar);
        this.f211822c = j0Var;
        if (((java.lang.String) aVar.f211729s).length() > 0) {
            this.f211822c.f211833n.getPaint().setFakeBoldText(z17);
        }
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        return j0Var;
    }

    public com.tencent.mm.ui.widget.dialog.i0 c(java.lang.String str, java.lang.CharSequence charSequence, java.lang.Boolean bool, com.tencent.mm.ui.widget.dialog.f0 f0Var, com.tencent.mm.ui.widget.dialog.e0 e0Var) {
        com.tencent.mm.ui.widget.dialog.a aVar = this.f211821b;
        aVar.f211717g = str;
        aVar.f211718h = charSequence;
        aVar.f211719i = bool.booleanValue();
        aVar.f211720j = f0Var;
        aVar.f211721k = e0Var;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.i0 d(int i17) {
        this.f211821b.f211729s = of5.b.a(this.f211820a).getString(i17);
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.i0 e(int i17) {
        this.f211821b.f211733w = of5.b.a(this.f211820a).getString(i17);
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.i0 f(int i17) {
        this.f211821b.f211732v = of5.b.a(this.f211820a).getString(i17);
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.i0 g(int i17) {
        this.f211821b.f211709a = of5.b.a(this.f211820a).getString(i17);
        return this;
    }

    public void h() {
        a();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f211822c;
        if (j0Var != null) {
            j0Var.show();
        }
    }
}
