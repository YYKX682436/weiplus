package vi1;

/* loaded from: classes7.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j1 f437318d;

    public f1(vi1.j1 j1Var) {
        this.f437318d = j1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi1.j1 j1Var = this.f437318d;
        com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView mMFormVerifyCodeInputView = j1Var.f437347d;
        java.lang.String valueOf = java.lang.String.valueOf(mMFormVerifyCodeInputView != null ? mMFormVerifyCodeInputView.getText() : null);
        java.util.List list = j1Var.f437351h;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it.next();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (kotlin.jvm.internal.o.b(valueOf, phoneItem.f87399d)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(j1Var.f437344a);
            i0Var.d(com.tencent.mm.R.string.a3h);
            i0Var.f(com.tencent.mm.R.string.gpa);
            i0Var.h();
        } else {
            vi1.d0 d0Var = j1Var.f437345b;
            if (d0Var != null) {
                com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView mMFormVerifyCodeInputView2 = j1Var.f437347d;
                java.lang.String valueOf2 = java.lang.String.valueOf(mMFormVerifyCodeInputView2 != null ? mMFormVerifyCodeInputView2.getText() : null);
                vi1.b1 b1Var = (vi1.b1) d0Var;
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(valueOf2);
                android.content.Context context = b1Var.f437273a;
                if (K0) {
                    java.lang.String string = context.getString(com.tencent.mm.R.string.a3l);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    b1Var.a(string);
                } else {
                    java.lang.String str = context.getString(com.tencent.mm.R.string.f490154mf) + valueOf2;
                    java.lang.String string2 = context.getString(com.tencent.mm.R.string.f490153me);
                    java.lang.String string3 = context.getString(com.tencent.mm.R.string.a4f);
                    java.lang.String string4 = context.getString(com.tencent.mm.R.string.a4j);
                    vi1.p0 p0Var = new vi1.p0(b1Var, valueOf2);
                    vi1.q0 q0Var = vi1.q0.f437432d;
                    com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                    aVar.f211709a = string2;
                    aVar.f211729s = str;
                    aVar.f211732v = string3;
                    aVar.E = p0Var;
                    aVar.f211733w = string4;
                    aVar.F = q0Var;
                    com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                    j0Var.e(aVar);
                    com.tencent.mm.ui.widget.dialog.d0 d0Var2 = aVar.f211723m;
                    if (d0Var2 != null) {
                        d0Var2.a(j0Var.f211837r);
                    }
                    j0Var.show();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
