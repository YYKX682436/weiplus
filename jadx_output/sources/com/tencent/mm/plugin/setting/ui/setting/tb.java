package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class tb extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f161570d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f161571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161570d = "";
        this.f161571e = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.sb(this));
    }

    public final void T6(android.widget.TextView textView, int i17, yz5.a aVar) {
        java.lang.String string = getString(i17);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new com.tencent.mm.plugin.setting.ui.setting.rb(aVar), 0, string.length(), 18);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(P6 != null ? P6.getContext() : null));
        textView.setClickable(true);
        textView.setText(spannableStringBuilder);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.enw;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MiroMsg.SettingsEmailVerifyUI", "onActivityResult requestCode: " + i17 + ", resultCode: " + i18);
        if (i17 != 1 || (P6 = P6()) == null) {
            return;
        }
        P6.finish();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f161570d = getIntent().getStringExtra("verify_email_address");
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_SETTING_EMAIL_VERIFY_SEND_TIME_LONG, 0L);
        com.tencent.mars.xlog.Log.i("MiroMsg.SettingsEmailVerifyUI", "isVerifyEmailOverTime curTime: " + com.tencent.mm.sdk.platformtools.t8.i1() + ", lastTime: " + t17);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setActionbarColor(getColor(com.tencent.mm.R.color.aaw));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P63 = P6();
        if (P63 != null) {
            P63.setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.ob(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        }
        jz5.g gVar = this.f161571e;
        em.z3 z3Var = (em.z3) ((jz5.n) gVar).getValue();
        if (z3Var.f254989c == null) {
            z3Var.f254989c = (com.tencent.mm.ui.widget.imageview.WeImageView) z3Var.f254987a.findViewById(com.tencent.mm.R.id.vlh);
        }
        z3Var.f254989c.setImageResource(com.tencent.mm.R.raw.email_regular);
        em.z3 z3Var2 = (em.z3) ((jz5.n) gVar).getValue();
        if (z3Var2.f254990d == null) {
            z3Var2.f254990d = (android.widget.TextView) z3Var2.f254987a.findViewById(com.tencent.mm.R.id.vli);
        }
        android.widget.TextView textView = z3Var2.f254990d;
        textView.setText(textView.getContext().getString(com.tencent.mm.R.string.oh9, this.f161570d));
        em.z3 z3Var3 = (em.z3) ((jz5.n) gVar).getValue();
        if (z3Var3.f254988b == null) {
            z3Var3.f254988b = (android.widget.TextView) z3Var3.f254987a.findViewById(com.tencent.mm.R.id.f483375si0);
        }
        android.widget.TextView textView2 = z3Var3.f254988b;
        kotlin.jvm.internal.o.d(textView2);
        T6(textView2, com.tencent.mm.R.string.oh7, new com.tencent.mm.plugin.setting.ui.setting.pb(this));
        em.z3 z3Var4 = (em.z3) ((jz5.n) gVar).getValue();
        if (z3Var4.f254991e == null) {
            z3Var4.f254991e = (android.widget.TextView) z3Var4.f254987a.findViewById(com.tencent.mm.R.id.f486649uz2);
        }
        android.widget.TextView textView3 = z3Var4.f254991e;
        kotlin.jvm.internal.o.d(textView3);
        T6(textView3, com.tencent.mm.R.string.in8, new com.tencent.mm.plugin.setting.ui.setting.qb(this));
    }
}
