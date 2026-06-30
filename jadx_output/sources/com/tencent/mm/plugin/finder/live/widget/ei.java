package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ei extends com.tencent.mm.plugin.finder.live.widget.n8 implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f118252h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f118253i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f118254m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f118255n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.EditText f118256o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f118257p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f118258q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f118259r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f118260s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aqk, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f118253i = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ds7);
        this.f118254m = findViewById;
        android.view.View findViewById2 = this.f118253i.findViewById(com.tencent.mm.R.id.ds8);
        this.f118255n = findViewById2;
        android.widget.TextView title = (android.widget.TextView) this.f118253i.findViewById(com.tencent.mm.R.id.dsa);
        android.widget.EditText editText = (android.widget.EditText) this.f118253i.findViewById(com.tencent.mm.R.id.jpt);
        this.f118256o = editText;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f118253i.findViewById(com.tencent.mm.R.id.ds9);
        android.widget.TextView textView = (android.widget.TextView) this.f118253i.findViewById(com.tencent.mm.R.id.jpp);
        this.f118257p = textView;
        this.f118258q = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.di(this));
        this.f118259r = "";
        this.f118260s = "";
        kotlin.jvm.internal.o.f(title, "title");
        com.tencent.mm.ui.fk.a(title);
        d(false);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        weImageView.setOnClickListener(this);
        textView.setOnClickListener(this);
        zl2.r4.f473950a.Z2(editText, null, 6, 3, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new com.tencent.mm.plugin.finder.live.widget.yh(this));
        editText.clearFocus();
        setTextBold(textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.finder.live.widget.ai getModifyBottomPage() {
        return (com.tencent.mm.plugin.finder.live.widget.ai) ((jz5.n) this.f118258q).getValue();
    }

    public final void c(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        r45.eq1 eq1Var;
        mm2.n2 n2Var = (mm2.n2) dk2.ef.f233372a.i(mm2.n2.class);
        java.lang.String string = (n2Var == null || (eq1Var = n2Var.f329279g) == null) ? null : eq1Var.getString(0);
        if (string == null) {
            string = "";
        }
        this.f118260s = string;
        this.f118256o.setHint(string);
        zl2.r4.f473950a.Q2(this);
        if (y1Var != null) {
            y1Var.h(getModifyBottomPage());
        }
    }

    public final void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFansModifyNameWidget", "updateConfirmBtn canConfirm:" + z17);
        this.f118257p.setEnabled(z17);
    }

    public final yz5.a getBackClickListener() {
        return this.f118252h;
    }

    public final java.lang.String getFansClubName() {
        return this.f118259r;
    }

    public final java.lang.String getLastFansClubName() {
        return this.f118260s;
    }

    public final android.view.View getRoot() {
        return this.f118253i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyNameWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.EditText editText = this.f118256o;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.ds7) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = getModifyBottomPage().f211798d;
            if (y1Var != null) {
                y1Var.q();
            }
            editText.clearFocus();
            editText.setText("");
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.ds9) {
            editText.clearFocus();
            editText.setText("");
            editText.clearFocus();
            android.content.Context context = editText.getContext();
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) (context != null ? context.getSystemService("input_method") : null);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
            postDelayed(new com.tencent.mm.plugin.finder.live.widget.ci(this), 300L);
            yz5.a aVar = this.f118252h;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.jpp) {
            d(false);
            java.lang.String str = this.f118259r;
            r45.eq1 eq1Var = new r45.eq1();
            eq1Var.set(0, str);
            new ke2.e(2, eq1Var, (r45.qt2) null).l().K(new com.tencent.mm.plugin.finder.live.widget.bi(this));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyNameWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setBackClickListener(yz5.a aVar) {
        this.f118252h = aVar;
    }

    public final void setFansClubName(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f118259r = str;
    }

    public final void setLastFansClubName(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f118260s = str;
    }

    public final void setRoot(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f118253i = view;
    }
}
