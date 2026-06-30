package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class gq extends com.tencent.mm.ui.widget.dialog.g2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.sp f132185e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f132186f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f132187g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f132188h;

    /* renamed from: i, reason: collision with root package name */
    public final int f132189i;

    public gq(com.tencent.mm.plugin.finder.view.sp callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f132185e = callback;
        this.f132186f = "LiveChargeInputCoinValueBottomPage";
        this.f132189i = 4;
    }

    public static final boolean i(com.tencent.mm.plugin.finder.view.gq gqVar, java.lang.String str) {
        gqVar.getClass();
        if (str == null || str.length() == 0) {
            return false;
        }
        return com.tencent.mm.sdk.platformtools.t8.D1(str, 0) > 0;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f211798d;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.ap7, y1Var != null ? y1Var.C : null, false);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.f483784c14);
        if (editText != null) {
            editText.setInputType(2);
            editText.setKeyListener(android.text.method.DigitsKeyListener.getInstance("0123456789"));
            editText.setImeOptions(6);
            zl2.r4 r4Var = zl2.r4.f473950a;
            int i17 = this.f132189i;
            r4Var.Z2(editText, null, i17, i17, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new com.tencent.mm.plugin.finder.view.aq(this, editText, inflate));
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b2z);
            textView.setEnabled(false);
            r4Var.Y2(textView, false, false);
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.view.bq(textView, this, editText));
        }
        inflate.findViewById(com.tencent.mm.R.id.enx).setOnClickListener(new com.tencent.mm.plugin.finder.view.dq(inflate, this));
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((android.app.Activity) context);
        f5Var.f210400e = new com.tencent.mm.plugin.finder.view.eq(this);
        this.f132188h = f5Var;
        this.f132187g = (android.view.ViewGroup) inflate;
        return inflate;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void f() {
        android.view.Window b17;
        android.view.View decorView;
        com.tencent.mm.ui.tools.f5 f5Var = this.f132188h;
        if (f5Var != null) {
            f5Var.d();
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f211798d;
        if (y1Var == null || (b17 = y1Var.b()) == null || (decorView = b17.getDecorView()) == null) {
            return;
        }
        decorView.setPadding(0, 0, 0, 0);
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void g() {
        android.widget.EditText editText;
        android.view.Window b17;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f211798d;
        if (y1Var != null && (b17 = y1Var.b()) != null) {
            b17.setSoftInputMode(48);
        }
        com.tencent.mm.ui.tools.f5 f5Var = this.f132188h;
        if (f5Var != null) {
            f5Var.f();
        }
        android.view.ViewGroup viewGroup = this.f132187g;
        if (viewGroup == null || (editText = (android.widget.EditText) viewGroup.findViewById(com.tencent.mm.R.id.f483784c14)) == null) {
            return;
        }
        editText.postDelayed(new com.tencent.mm.plugin.finder.view.fq(editText, this), 300L);
    }
}
