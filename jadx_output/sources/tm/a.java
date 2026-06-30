package tm;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f420398a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f420399b;

    /* renamed from: c, reason: collision with root package name */
    public int f420400c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f420401d;

    /* renamed from: e, reason: collision with root package name */
    public int f420402e;

    /* renamed from: f, reason: collision with root package name */
    public int f420403f = -100;

    /* renamed from: g, reason: collision with root package name */
    public tm.j f420404g;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ed, code lost:
    
        if (tm.j.a(r0.f420438c) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x011a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tm.a b(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.a.b(java.lang.String):tm.a");
    }

    public final void a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        if (!gm0.j1.a()) {
            intent.putExtra("neverGetA8Key", true);
        }
        int i17 = this.f420403f;
        if (i17 != -100) {
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public boolean c(android.content.Context context, final android.content.DialogInterface.OnClickListener onClickListener, final android.content.DialogInterface.OnClickListener onClickListener2) {
        if (this.f420400c == 8 && this.f420402e == 7 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f420398a)) {
            cm5.c.f43426a.a(context, this.f420398a);
            return true;
        }
        if (this.f420400c == 8 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f420398a)) {
            a(context, this.f420398a);
            return true;
        }
        int i17 = this.f420400c;
        if (i17 != 3 && i17 != 4) {
            if (i17 != 1) {
                if (i17 == 5) {
                    db5.e1.s(context, this.f420399b, this.f420401d);
                    return true;
                }
                if (i17 != 10) {
                    return false;
                }
                db5.t7.g(context, this.f420399b);
                return true;
            }
            final com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.u(this.f420401d);
            u1Var.g(this.f420399b);
            u1Var.n(context.getString(com.tencent.mm.R.string.f490507x1));
            u1Var.l(new com.tencent.mm.ui.widget.dialog.w1() { // from class: tm.a$$d
                @Override // com.tencent.mm.ui.widget.dialog.w1
                public final void a(boolean z17, java.lang.String str) {
                    android.content.DialogInterface.OnClickListener onClickListener3 = onClickListener;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(u1Var.f211998c, -1);
                    }
                }
            });
            u1Var.a(true);
            u1Var.q(false);
            return true;
        }
        tm.j jVar = this.f420404g;
        java.lang.String str = jVar.f420441f;
        java.lang.String str2 = jVar.f420442g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str = context.getString(this.f420400c == 3 ? com.tencent.mm.R.string.f490608zu : com.tencent.mm.R.string.f490507x1);
            str2 = context.getString(this.f420400c == 3 ? com.tencent.mm.R.string.f490503wx : com.tencent.mm.R.string.f490347sg);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            final boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            final com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var2.u(this.f420401d);
            u1Var2.g(this.f420399b);
            if (!K0) {
                str2 = str;
            }
            u1Var2.n(str2);
            u1Var2.l(new com.tencent.mm.ui.widget.dialog.w1() { // from class: tm.a$$a
                @Override // com.tencent.mm.ui.widget.dialog.w1
                public final void a(boolean z17, java.lang.String str3) {
                    boolean z18 = K0;
                    com.tencent.mm.ui.widget.dialog.u1 u1Var3 = u1Var2;
                    if (z18) {
                        android.content.DialogInterface.OnClickListener onClickListener3 = onClickListener;
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(u1Var3.f211998c, -1);
                            return;
                        }
                        return;
                    }
                    android.content.DialogInterface.OnClickListener onClickListener4 = onClickListener2;
                    if (onClickListener4 != null) {
                        onClickListener4.onClick(u1Var3.f211998c, -2);
                    }
                }
            });
            u1Var2.q(false);
            return true;
        }
        int i18 = this.f420404g.f420439d;
        if (i18 == 1) {
            java.lang.String str3 = this.f420401d;
            java.lang.String str4 = this.f420399b;
            tm.b bVar = new tm.b(this, onClickListener, context, onClickListener2);
            if (context == null) {
                return true;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var3 = new com.tencent.mm.ui.widget.dialog.u1(context);
            if (str3 == null) {
                str3 = "";
            }
            u1Var3.u(str3);
            if (str4 == null) {
                str4 = "";
            }
            u1Var3.g(str4);
            if (str == null) {
                str = "";
            }
            u1Var3.n(str);
            u1Var3.a(true);
            u1Var3.f211996a.f211821b.G = null;
            u1Var3.b(bVar);
            u1Var3.q(false);
            return true;
        }
        if (i18 != 7) {
            final com.tencent.mm.ui.widget.dialog.u1 u1Var4 = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var4.u(this.f420401d);
            u1Var4.g(this.f420399b);
            u1Var4.n(context.getString(com.tencent.mm.R.string.f490507x1));
            u1Var4.l(new com.tencent.mm.ui.widget.dialog.w1() { // from class: tm.a$$b
                @Override // com.tencent.mm.ui.widget.dialog.w1
                public final void a(boolean z17, java.lang.String str5) {
                    android.content.DialogInterface.OnClickListener onClickListener3 = onClickListener;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(u1Var4.f211998c, -1);
                    }
                }
            });
            u1Var4.j(str2);
            u1Var4.i(new com.tencent.mm.ui.widget.dialog.w1() { // from class: tm.a$$c
                @Override // com.tencent.mm.ui.widget.dialog.w1
                public final void a(boolean z17, java.lang.String str5) {
                    android.content.DialogInterface.OnClickListener onClickListener3 = onClickListener2;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(u1Var4.f211998c, -2);
                    }
                }
            });
            u1Var4.a(true);
            u1Var4.q(false);
            return true;
        }
        java.lang.String str5 = this.f420401d;
        java.lang.String str6 = this.f420399b;
        tm.c cVar = new tm.c(this, onClickListener, context, onClickListener2);
        if (context == null) {
            return true;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var5 = new com.tencent.mm.ui.widget.dialog.u1(context);
        if (str5 == null) {
            str5 = "";
        }
        u1Var5.u(str5);
        if (str6 == null) {
            str6 = "";
        }
        u1Var5.g(str6);
        if (str == null) {
            str = "";
        }
        u1Var5.n(str);
        if (str2 == null) {
            str2 = "";
        }
        u1Var5.j(str2);
        u1Var5.a(true);
        u1Var5.f211996a.f211821b.G = null;
        u1Var5.b(cVar);
        u1Var5.q(false);
        return true;
    }

    public boolean d(android.content.Context context, android.content.DialogInterface.OnDismissListener onDismissListener) {
        java.lang.String str = this.f420399b;
        java.lang.String str2 = this.f420401d;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return true;
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = str2;
        aVar.f211729s = str;
        aVar.H = onDismissListener;
        aVar.A = false;
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.f490507x1);
        aVar.E = new db5.p0();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        db5.e1.a(context, j0Var);
        return true;
    }
}
