package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f128847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f128848e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI, java.lang.Throwable th6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f128847d = finderCreateContactUI;
        this.f128848e = th6;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.a4(this.f128847d, this.f128848e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.ui.a4 a4Var = (com.tencent.mm.plugin.finder.ui.a4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.nk2 nk2Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = this.f128848e;
        int i17 = ((rm0.j) th6).f397424e;
        int i18 = ((rm0.j) th6).f397425f;
        com.tencent.mm.protobuf.f fVar = ((rm0.j) th6).f397427h;
        jz5.f0 f0Var = null;
        r45.r01 r01Var = fVar instanceof r45.r01 ? (r45.r01) fVar : null;
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI = this.f128847d;
        android.app.ProgressDialog progressDialog = finderCreateContactUI.U;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i18 == -4008) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 38L, 1L);
        } else if (i18 == -4003) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 37L, 1L);
        }
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (r01Var != null && (nk2Var = (r45.nk2) r01Var.getCustom(2)) != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "verify info: " + pm0.b0.g(nk2Var));
            if (nk2Var.getInteger(6) == 1) {
                android.widget.EditText editText = finderCreateContactUI.f128546w;
                if (editText == null) {
                    kotlin.jvm.internal.o.o("nickEdt");
                    throw null;
                }
                editText.setTextColor(i65.a.d(finderCreateContactUI, com.tencent.mm.R.color.a2y));
            }
            if (i18 == -4009) {
                com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(finderCreateContactUI.getContext());
                y1Var.j(com.tencent.mm.R.layout.ecn);
                android.widget.TextView textView = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.odf);
                if (textView != null) {
                    textView.setText(nk2Var.getString(0));
                }
                android.widget.TextView textView2 = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.f485967uh5);
                if (textView2 != null) {
                    textView2.setOnClickListener(new com.tencent.mm.plugin.finder.ui.g3(y1Var));
                }
                java.lang.String string = finderCreateContactUI.getContext().getResources().getString(com.tencent.mm.R.string.o2f);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                android.text.SpannableString spannableString = new android.text.SpannableString(string);
                spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(string, finderCreateContactUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478524a5), finderCreateContactUI.getContext().getResources().getColor(com.tencent.mm.R.color.Link_Alpha_0_6), false, false, new com.tencent.mm.plugin.finder.ui.h3(nk2Var), 16, null), 0, string.length(), 17);
                android.widget.TextView textView3 = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.sh7);
                if (textView3 != null) {
                    textView3.setText(string);
                    textView3.setOnTouchListener(new com.tencent.mm.plugin.finder.assist.c8(spannableString, textView3));
                }
                y1Var.s();
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(nk2Var.getString(1))) {
                java.lang.String string2 = finderCreateContactUI.getString(com.tencent.mm.R.string.cro);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.m7(finderCreateContactUI, string2, null, null, 6, null);
            } else {
                java.lang.String string3 = nk2Var.getString(1);
                if (string3 == null) {
                    string3 = "";
                }
                finderCreateContactUI.l7(string3, nk2Var.getString(8), nk2Var.getString(7));
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            java.lang.String string4 = finderCreateContactUI.getString(com.tencent.mm.R.string.cro);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.m7(finderCreateContactUI, string4, null, null, 6, null);
        }
        finderCreateContactUI.setResult(5);
        return f0Var2;
    }
}
