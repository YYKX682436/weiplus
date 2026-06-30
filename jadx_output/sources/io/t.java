package io;

/* loaded from: classes5.dex */
public final class t implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.z0 f293429a;

    /* renamed from: b, reason: collision with root package name */
    public wd5.b f293430b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.z0 z0Var = this.f293429a;
        android.view.View view = z0Var != null ? z0Var.f254967a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ehs, (android.view.ViewGroup) null);
        this.f293429a = new em.z0(inflate);
        c(null, this.f293430b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        wd5.b bVar = (wd5.b) pVar;
        wd5.b bVar2 = this.f293430b;
        this.f293430b = bVar;
        c(bVar2, bVar);
    }

    public final void c(wd5.b bVar, wd5.b bVar2) {
        boolean z17;
        int i17;
        em.z0 z0Var = this.f293429a;
        if (bVar2 == null || z0Var == null) {
            return;
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            java.util.Objects.toString(bVar2.f445085f);
            java.util.Objects.toString(bVar2.f445090n);
        }
        z0Var.a().setText(bVar2.f445085f);
        z0Var.a().setTag(bVar2.f445086g);
        java.lang.Integer num = bVar2.f445087h;
        if (num != null) {
            z0Var.a().setTextColor(num.intValue());
        }
        java.lang.Integer num2 = bVar2.f445088i;
        android.view.View view = z0Var.f254967a;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (z0Var.f254969c == null) {
                z0Var.f254969c = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.lgy);
            }
            z0Var.f254969c.setBackgroundResource(intValue);
        }
        if (bVar2.f445089m) {
            z0Var.a().setVisibility(0);
            z0Var.e().setVisibility(0);
            z0Var.e().setOnLongClickListener(bVar2.f445091o);
            if (bVar2.f445093q != -1) {
                z0Var.b().setOnClickListener(bVar2.f445092p);
                z0Var.e().setOnClickListener(new io.s(z0Var));
            } else {
                z0Var.e().setOnClickListener(bVar2.f445092p);
            }
            z17 = true;
        } else {
            java.lang.CharSequence charSequence = bVar2.f445090n;
            if (charSequence == null || r26.n0.N(charSequence)) {
                z0Var.a().setVisibility(8);
                z17 = false;
            } else {
                z17 = true;
            }
            z0Var.e().setVisibility(8);
        }
        if (z0Var.f254972f == null) {
            z0Var.f254972f = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.che);
        }
        z0Var.f254972f.setVisibility(z17 ? 0 : 8);
        if (bVar2.f445093q == -1) {
            android.content.Context context = view.getContext();
            z0Var.a().setMaxWidth((int) (com.tencent.mm.ui.zk.a(context, com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE) / i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a)));
            android.view.ViewGroup.LayoutParams layoutParams = z0Var.a().getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.rightMargin = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479738dv);
            layoutParams2.topMargin = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479643bi);
            layoutParams2.removeRule(10);
            layoutParams2.addRule(15);
            z0Var.a().setGravity(19);
            z0Var.a().setLayoutParams(layoutParams2);
            z0Var.b().setVisibility(8);
            z0Var.c().setVisibility(8);
            z0Var.d().setVisibility(8);
            return;
        }
        android.content.Context context2 = view.getContext();
        z0Var.c().setVisibility(0);
        ct.a3 a3Var = (ct.a3) i95.n0.c(ct.a3.class);
        kotlin.jvm.internal.o.d(context2);
        ((bt.u0) a3Var).getClass();
        pf5.z zVar = pf5.z.f353948a;
        boolean z18 = context2 instanceof androidx.appcompat.app.AppCompatActivity;
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context2;
        ((la5.l0) zVar.a(appCompatActivity).a(la5.l0.class)).setValue("quote_img", "");
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((la5.u) zVar.a(appCompatActivity).a(la5.u.class)).setValue("quote_img", "");
        z0Var.a().setMaxWidth((int) (com.tencent.mm.ui.zk.a(context2, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT) / i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        android.view.ViewGroup.LayoutParams layoutParams3 = z0Var.a().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.removeRule(15);
        layoutParams4.addRule(10);
        layoutParams4.topMargin = com.tencent.mm.ui.zk.e(context2, com.tencent.mm.R.dimen.f479738dv);
        layoutParams4.rightMargin = 0;
        z0Var.a().setGravity(48);
        z0Var.a().setIncludeFontPadding(false);
        z0Var.a().setLayoutParams(layoutParams4);
        z0Var.b().setVisibility(0);
        if (bVar2.f445093q == 2) {
            z0Var.d().setVisibility(0);
            i17 = 8;
        } else {
            i17 = 8;
            z0Var.d().setVisibility(8);
        }
        if (bVar2.f445093q == 11) {
            z0Var.c().setVisibility(i17);
        } else {
            z0Var.c().setVisibility(0);
        }
        z0Var.c().setImageBitmap(null);
        ti3.m mVar = new ti3.m();
        mVar.f419629a = z0Var.c();
        mVar.f419630b = z0Var.d();
        com.tencent.mm.ui.tools.e3 e3Var = new com.tencent.mm.ui.tools.e3(mVar);
        java.lang.Object obj = bVar2.f445084e;
        if (ti3.i.o(context2, null, e3Var, obj instanceof com.tencent.mm.storage.f9 ? (com.tencent.mm.storage.f9) obj : null, true)) {
            return;
        }
        z0Var.c().setImageResource(com.tencent.mm.R.raw.icons_filled_pic_error1);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293430b;
    }
}
