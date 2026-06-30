package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes14.dex */
public class t3 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f211980a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f211981b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f211982c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f211983d;

    /* renamed from: e, reason: collision with root package name */
    public int f211984e;

    /* renamed from: f, reason: collision with root package name */
    public int f211985f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.s3 f211986g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f211987h = false;

    /* renamed from: i, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f211988i = null;

    /* renamed from: j, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f211989j = null;

    /* renamed from: k, reason: collision with root package name */
    public android.content.DialogInterface.OnShowListener f211990k = null;

    /* renamed from: l, reason: collision with root package name */
    public android.content.DialogInterface.OnKeyListener f211991l = null;

    public t3(android.content.Context context) {
        this.f211981b = context;
    }

    public com.tencent.mm.ui.widget.dialog.u3 a() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = new com.tencent.mm.ui.widget.dialog.u3(this.f211981b, this.f211985f, this.f211984e);
        u3Var.setMessage(this.f211982c);
        u3Var.setCancelable(this.f211983d);
        u3Var.setOnCancelListener(this.f211989j);
        u3Var.setCanceledOnTouchOutside(false);
        u3Var.f212008h = this;
        this.f211980a = u3Var;
        return u3Var;
    }

    public final boolean b(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return true;
        }
        if (context instanceof android.content.ContextWrapper) {
            return b(((android.content.ContextWrapper) context).getBaseContext());
        }
        return false;
    }
}
