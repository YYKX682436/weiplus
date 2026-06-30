package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class OfflineAlertView extends android.widget.LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f152472n = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f152473d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f152474e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f152475f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f152476g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.offline.ui.z f152477h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.CountDownTimer f152478i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.z f152479m;

    public OfflineAlertView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f152473d = 0;
        this.f152474e = null;
        this.f152475f = null;
        this.f152476g = true;
        this.f152477h = null;
        c();
    }

    public void a() {
        android.view.ViewGroup viewGroup = this.f152475f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        setVisibility(8);
        com.tencent.mm.plugin.offline.ui.z zVar = this.f152477h;
        if (zVar != null) {
            com.tencent.mm.plugin.offline.ui.q1 q1Var = (com.tencent.mm.plugin.offline.ui.q1) zVar;
            q1Var.getClass();
            int i17 = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.B2;
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = q1Var.f152694a;
            walletOfflineCoinPurseUI.getClass();
            ((com.tencent.mm.plugin.offline.ui.m3) walletOfflineCoinPurseUI.component(com.tencent.mm.plugin.offline.ui.m3.class)).O6();
        }
        android.os.CountDownTimer countDownTimer = this.f152478i;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.f152479m != null) {
            ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(this.f152479m);
        }
        this.f152473d = 0;
        this.f152476g = true;
    }

    public final at4.q0 b(at4.r0 r0Var, java.lang.String str) {
        java.util.Iterator it = ((java.util.ArrayList) r0Var.f13940f).iterator();
        while (it.hasNext()) {
            at4.q0 q0Var = (at4.q0) it.next();
            if (q0Var.f13930d.equals(str)) {
                return q0Var;
            }
        }
        return null;
    }

    public final void c() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d78, this);
        this.f152474e = inflate;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.khb);
        this.f152475f = viewGroup;
        viewGroup.setOnTouchListener(new com.tencent.mm.plugin.offline.ui.p(this));
    }

    public boolean d(int i17) {
        int i18;
        if (!e() || i17 == (i18 = this.f152473d) || i17 == 1) {
            return true;
        }
        if (i17 == 2 && (i18 == 3 || i18 == 4 || i18 == 5)) {
            return true;
        }
        if ((i17 == 5 && i18 == 4) || i17 == 6 || i17 == 7) {
            return true;
        }
        if (i17 == 8 && (i18 == 5 || i18 == 4 || i18 == 2)) {
            return true;
        }
        return i17 == 3 ? i18 != 1 : i17 == 9 && (i18 == 4 || i18 == 5 || i18 == 2);
    }

    public boolean e() {
        return getVisibility() == 0;
    }

    public final void f(android.view.View view, android.view.View.OnClickListener onClickListener, int i17) {
        this.f152473d = i17;
        setVisibility(0);
        this.f152475f.removeAllViews();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d7j, this.f152475f, false);
        if (i17 == 6) {
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482933s7)).setText(com.tencent.mm.R.string.f492660he0);
        } else if ((i17 == 3 || i17 == 1) && u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482933s7)).setText(com.tencent.mm.R.string.hea);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.m9c);
        if (viewGroup != null) {
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m9d);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.m9b);
            android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.m9a);
            textView.setMaxWidth(((((i65.a.B(getContext()) - (i65.a.h(getContext(), com.tencent.mm.R.dimen.f479704cz) * 2)) - (i65.a.h(getContext(), com.tencent.mm.R.dimen.f479688cn) * 2)) - i65.a.h(getContext(), com.tencent.mm.R.dimen.f479688cn)) - i65.a.h(getContext(), com.tencent.mm.R.dimen.f479738dv)) - i65.a.h(getContext(), com.tencent.mm.R.dimen.f479646bl));
            viewGroup.post(new com.tencent.mm.plugin.offline.ui.x(this, textView, imageView, imageView2));
            viewGroup.setForeground(getResources().getDrawable(com.tencent.mm.R.drawable.ati));
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.offline.ui.y(this, view));
            com.tencent.mm.wallet_core.ui.r1.k(viewGroup, i65.a.h(getContext(), com.tencent.mm.R.dimen.f479672c9));
        }
        this.f152475f.addView(inflate);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.kip);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kir);
        android.widget.Button button = (android.widget.Button) this.f152474e.findViewById(com.tencent.mm.R.id.h5h);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.kiq);
        viewGroup2.setVisibility(0);
        if (j65.e.b()) {
            checkBox.setBackgroundResource(com.tencent.mm.R.drawable.ath);
        }
        com.tencent.mm.wallet_core.ui.r1.k(checkBox, 50);
        checkBox.setChecked(false);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f492661he1);
        spannableStringBuilder.append((java.lang.CharSequence) string);
        spannableStringBuilder.append((java.lang.CharSequence) getContext().getString(com.tencent.mm.R.string.f492662he2));
        spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7(7, new com.tencent.mm.plugin.offline.ui.f(this)), string.length(), spannableStringBuilder.length(), 18);
        textView2.setText(spannableStringBuilder);
        textView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(getContext()));
        textView2.setClickable(true);
        button.setSelected(false);
        button.setOnClickListener(new com.tencent.mm.plugin.offline.ui.g(this, checkBox, onClickListener, viewGroup2, button));
        this.f152476g = false;
        view.post(new com.tencent.mm.plugin.offline.ui.h(this, textView2, checkBox, view));
    }

    public void setBlurDockerView(android.view.ViewGroup viewGroup) {
    }

    public void setDialogState(com.tencent.mm.plugin.offline.ui.z zVar) {
        this.f152477h = zVar;
    }

    public OfflineAlertView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f152473d = 0;
        this.f152474e = null;
        this.f152475f = null;
        this.f152476g = true;
        this.f152477h = null;
        c();
    }
}
