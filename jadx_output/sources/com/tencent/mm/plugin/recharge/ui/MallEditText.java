package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class MallEditText extends android.widget.LinearLayout implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.ui.l f155083d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f155084e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f155085f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.AutoCompleteTextView f155086g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f155087h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f155088i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.ui.k f155089m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f155090n;

    /* renamed from: o, reason: collision with root package name */
    public int f155091o;

    /* renamed from: p, reason: collision with root package name */
    public int f155092p;

    /* renamed from: q, reason: collision with root package name */
    public int f155093q;

    /* renamed from: r, reason: collision with root package name */
    public final int f155094r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f155095s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f155096t;

    /* renamed from: u, reason: collision with root package name */
    public vs3.a f155097u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f155098v;

    /* renamed from: w, reason: collision with root package name */
    public int f155099w;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MallEditText(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recharge.ui.MallEditText.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setInputForce(vs3.a aVar) {
        this.f155097u = aVar;
        if (aVar == null) {
            this.f155086g.setText("");
            b();
            this.f155085f.setText("");
            this.f155085f.setVisibility(8);
            return;
        }
        android.text.method.KeyListener keyListener = this.f155086g.getKeyListener();
        this.f155086g.setKeyListener(null);
        this.f155086g.setText(aVar.f439875a);
        android.widget.AutoCompleteTextView autoCompleteTextView = this.f155086g;
        autoCompleteTextView.setSelection(autoCompleteTextView.getText().length());
        this.f155086g.setKeyListener(keyListener);
        b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f439876b) || !this.f155095s) {
            this.f155085f.setText("");
            this.f155085f.setVisibility(8);
        } else {
            this.f155085f.setText(aVar.f439876b);
            this.f155085f.setVisibility(0);
        }
    }

    public boolean a() {
        if (this.f155094r != 1) {
            return this.f155086g.getText().length() >= this.f155093q;
        }
        java.lang.String obj = this.f155086g.getText().toString();
        return obj.length() >= this.f155093q && obj.length() <= this.f155092p && android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(vs3.b.a(obj));
    }

    public final void b() {
        boolean a17 = a();
        if (a17 != this.f155095s) {
            this.f155095s = a17;
            com.tencent.mm.plugin.recharge.ui.l lVar = this.f155083d;
            if (lVar != null) {
                com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = (com.tencent.mm.plugin.recharge.ui.RechargeUI) lVar;
                if (!a17) {
                    ((java.util.HashMap) rechargeUI.A).clear();
                    rechargeUI.f155123e.setText("");
                    rechargeUI.f155124f.setVisibility(4);
                }
                rechargeUI.T6();
            }
            if (!a17) {
                if (this.f155085f.getVisibility() == 0) {
                    this.f155085f.setText("");
                    this.f155085f.setVisibility(8);
                }
                this.f155097u = null;
            }
        }
        com.tencent.mm.plugin.recharge.ui.l lVar2 = this.f155083d;
        if (lVar2 != null) {
            ((com.tencent.mm.plugin.recharge.ui.RechargeUI) lVar2).a7();
        }
    }

    public void getFocus() {
        this.f155086g.findFocus();
    }

    public vs3.a getInputRecord() {
        vs3.a aVar = this.f155097u;
        if (aVar != null) {
            return aVar;
        }
        vs3.a aVar2 = new vs3.a(getText(), this.f155085f.getText().toString(), 0);
        this.f155097u = aVar2;
        return aVar2;
    }

    public java.lang.String getText() {
        if (this.f155094r != 1) {
            java.lang.String obj = this.f155086g.getText().toString();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            return obj == null ? "" : obj;
        }
        java.lang.String obj2 = this.f155086g.getText().toString();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return obj2 == null ? "" : obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f155084e;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        com.tencent.mm.plugin.recharge.ui.l lVar = this.f155083d;
        if (lVar != null) {
            com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = (com.tencent.mm.plugin.recharge.ui.RechargeUI) lVar;
            if (!this.f155095s) {
                ((java.util.HashMap) rechargeUI.A).clear();
                rechargeUI.f155123e.setText("");
                rechargeUI.f155124f.setVisibility(4);
            }
            rechargeUI.T6();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return !this.f155098v;
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        this.f155086g.setEllipsize(truncateAt);
    }

    public void setHintStr(java.lang.String str) {
        this.f155086g.setHint(str);
    }

    public void setImeOptions(int i17) {
        this.f155086g.setImeOptions(i17);
    }

    public void setInfoTvImageResource(int i17) {
        this.f155088i = i17 == com.tencent.mm.R.drawable.f481913aj3;
        this.f155087h.setImageResource(i17);
    }

    public void setInfoTvOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f155087h.setOnClickListener(onClickListener);
    }

    public void setInput(vs3.a aVar) {
        this.f155097u = aVar;
        if (aVar == null) {
            this.f155086g.setText("");
            b();
            this.f155085f.setText("");
            this.f155085f.setVisibility(8);
            return;
        }
        this.f155086g.setText(aVar.f439875a);
        android.widget.AutoCompleteTextView autoCompleteTextView = this.f155086g;
        autoCompleteTextView.setSelection(autoCompleteTextView.getText().length());
        b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f439876b) || !this.f155095s) {
            this.f155085f.setText("");
            this.f155085f.setVisibility(8);
        } else {
            this.f155085f.setText(aVar.f439876b);
            this.f155085f.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f155086g.setOnClickListener(onClickListener);
    }

    public void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener onEditorActionListener) {
        this.f155086g.setOnEditorActionListener(onEditorActionListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f155084e = onFocusChangeListener;
    }

    public void setOnInputValidChangeListener(com.tencent.mm.plugin.recharge.ui.l lVar) {
        this.f155083d = lVar;
    }

    public MallEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
