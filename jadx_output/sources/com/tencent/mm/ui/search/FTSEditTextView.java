package com.tencent.mm.ui.search;

/* loaded from: classes8.dex */
public class FTSEditTextView extends android.widget.LinearLayout {
    public static final /* synthetic */ int I = 0;
    public final int A;
    public tj5.l B;
    public boolean C;
    public final android.view.View.OnClickListener D;
    public tj5.n E;
    public final java.util.ArrayList F;
    public tj5.o G;
    public final android.view.View.OnFocusChangeListener H;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f209813d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f209814e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f209815f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f209816g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f209817h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f209818i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f209819m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f209820n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f209821o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f209822p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f209823q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f209824r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f209825s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f209826t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f209827u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f209828v;

    /* renamed from: w, reason: collision with root package name */
    public int f209829w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f209830x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f209831y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f209832z;

    public FTSEditTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209825s = true;
        this.f209826t = false;
        this.f209827u = false;
        this.f209828v = false;
        this.f209829w = 0;
        this.f209830x = "";
        this.A = 2;
        this.D = new tj5.j(this);
        this.F = new java.util.ArrayList();
        this.G = tj5.o.UserInput;
        this.H = new tj5.a(this);
        j(attributeSet);
    }

    public static void a(com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView) {
        java.lang.String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
        java.lang.String totalQuery = fTSEditTextView.getTotalQuery();
        tj5.n nVar = fTSEditTextView.E;
        if (nVar != null) {
            nVar.C3(totalQuery, inEditTextQuery, fTSEditTextView.f209817h, fTSEditTextView.G);
        }
        if (inEditTextQuery.length() == 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(fTSEditTextView.f209822p)) {
                fTSEditTextView.f209816g.setHint(fTSEditTextView.f209823q);
            } else {
                fTSEditTextView.f209816g.setHint(fTSEditTextView.f209822p);
            }
        }
        java.util.Iterator it = fTSEditTextView.F.iterator();
        while (it.hasNext()) {
            ((tj5.m) it.next()).C3(totalQuery, inEditTextQuery, fTSEditTextView.f209817h, fTSEditTextView.G);
        }
    }

    public static int getSearchInputType() {
        return j62.e.g().i("clicfg_websearch_input_type", 0, true, true);
    }

    public boolean b() {
        return false;
    }

    public final void c() {
        android.widget.LinearLayout linearLayout = this.f209821o;
        android.widget.EditText editText = getEditText();
        if (linearLayout == null || editText == null || editText.isFocused()) {
            return;
        }
        if (editText.getPaint().measureText(editText.getText().toString()) > ((float) (editText.getWidth() - i65.a.b(getContext(), 4)))) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] clearEditTextFocus, currentHasFocus=%s, textChangeStatus=%s", java.lang.Boolean.valueOf(this.f209816g.hasFocus()), this.G);
        this.f209816g.clearFocus();
    }

    public void e() {
        this.G = tj5.o.ClearText;
        if (this.f209825s) {
            ((java.util.ArrayList) this.f209817h).clear();
        }
        this.f209816g.setText("");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f209822p)) {
            this.f209816g.setHint(this.f209823q);
        } else {
            this.f209816g.setHint(this.f209822p);
        }
        this.f209815f.setVisibility(8);
        w();
        this.G = tj5.o.UserInput;
    }

    public void f() {
        if (this.f209827u) {
            this.f209815f.setVisibility(0);
        } else {
            this.f209815f.setVisibility(8);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "hideClearBtn， forceEditToBeTextView = %s. forceShowClearBtn = %s", new com.tencent.mm.sdk.platformtools.z3(), java.lang.Boolean.valueOf(this.f209827u));
    }

    public void g() {
        this.f209813d.setVisibility(8);
    }

    public android.widget.ImageButton getClearBtn() {
        return this.f209815f;
    }

    public android.widget.EditText getEditText() {
        return this.f209816g;
    }

    public int getHighlightColor() {
        return this.f209816g.getHighlightColor();
    }

    public android.view.View getIconMargin() {
        return this.f209814e;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView getIconView() {
        return this.f209813d;
    }

    public java.lang.String getInEditTextQuery() {
        return this.f209816g.getText().toString().trim();
    }

    public int getLimitInputLength() {
        return 100;
    }

    public java.lang.String getRecommendSearchHint() {
        return this.f209822p;
    }

    public android.view.View getSearchDone() {
        return this.f209831y;
    }

    public android.view.View getSearchInputBackground() {
        return this.f209832z;
    }

    public java.util.List<tj5.x> getTagList() {
        return this.f209817h;
    }

    public android.view.View getTagPanel() {
        return this.f209824r;
    }

    public tj5.o getTextChangeStatus() {
        return this.G;
    }

    public java.lang.String getTotalQuery() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = ((java.util.ArrayList) this.f209817h).iterator();
        while (it.hasNext()) {
            stringBuffer.append(((tj5.x) it.next()).R0());
            stringBuffer.append(" ");
        }
        stringBuffer.append(this.f209816g.getText().toString());
        return stringBuffer.toString().trim();
    }

    public void h() {
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f209816g.getWindowToken(), 0);
    }

    public void i(int i17) {
        if (i17 == this.A) {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489118bc3, (android.view.ViewGroup) this, true);
        } else {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489119bc4, (android.view.ViewGroup) this, true);
        }
    }

    public void j(android.util.AttributeSet attributeSet) {
        int i17;
        android.widget.ImageButton imageButton;
        this.f209829w = getSearchInputType();
        if (getContext() instanceof android.app.Activity) {
            this.C = ((android.app.Activity) getContext()).getIntent().getBooleanExtra("fts_need_sos_edittext_tobe_touch_only", false);
        }
        int[] iArr = wm0.a.f447189g;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iArr);
            i17 = obtainStyledAttributes.getInt(4, 0);
            obtainStyledAttributes.recycle();
        } else {
            i17 = 0;
        }
        i(i17);
        this.f209824r = findViewById(com.tencent.mm.R.id.f487217nx3);
        this.f209813d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h5n);
        this.f209816g = (android.widget.EditText) findViewById(com.tencent.mm.R.id.d98);
        this.f209815f = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.bxn);
        this.f209818i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nvv);
        this.f209819m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nvz);
        this.f209820n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487211nw3);
        this.f209821o = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rfy);
        this.f209832z = findViewById(com.tencent.mm.R.id.mek);
        this.f209814e = findViewById(com.tencent.mm.R.id.h79);
        this.f209831y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mdx);
        android.widget.LinearLayout linearLayout = this.f209821o;
        if (linearLayout != null && i17 == 3) {
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.f480733ud);
        }
        this.f209816g.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, iArr);
            int i18 = obtainStyledAttributes2.getInt(0, 0);
            if (i18 != 0) {
                this.f209816g.setHintTextColor(i18);
            }
            int i19 = obtainStyledAttributes2.getInt(3, 0);
            if (i19 != 0) {
                this.f209816g.setTextColor(i19);
            }
            int resourceId = obtainStyledAttributes2.getResourceId(1, 0);
            if (resourceId != 0 && (imageButton = this.f209815f) != null) {
                imageButton.setImageResource(resourceId);
            }
            obtainStyledAttributes2.recycle();
        }
        android.widget.TextView textView = this.f209831y;
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479850gz) * i65.a.m(getContext()));
        }
        this.f209817h = new java.util.ArrayList();
        this.f209816g.setOnKeyListener(new tj5.b(this));
        this.f209816g.addTextChangedListener(new tj5.c(this));
        this.f209816g.setOnFocusChangeListener(this.H);
        this.f209816g.setOnEditorActionListener(new tj5.d(this));
        android.widget.EditText editText = this.f209816g;
        if (editText instanceof com.tencent.mm.ui.widget.MMEditText) {
            ((com.tencent.mm.ui.widget.MMEditText) editText).setSizeChangeListener(new tj5.e(this));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSEditTextView", "init: editText is not MMEditText");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f209813d;
        if (weImageView != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) weImageView.getLayoutParams();
            if (b()) {
                layoutParams.width = (int) (getResources().getDimension(com.tencent.mm.R.dimen.f479704cz) * i65.a.q(getContext()));
                layoutParams.height = (int) (getResources().getDimension(com.tencent.mm.R.dimen.f479704cz) * i65.a.q(getContext()));
                layoutParams.rightMargin = 0;
            } else {
                layoutParams.width = (int) (getResources().getDimension(com.tencent.mm.R.dimen.f479693cs) * i65.a.m(getContext()));
                layoutParams.height = (int) (getResources().getDimension(com.tencent.mm.R.dimen.f479693cs) * i65.a.m(getContext()));
                layoutParams.rightMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
            }
            this.f209813d.setLayoutParams(layoutParams);
        }
        android.widget.TextView textView2 = this.f209818i;
        android.view.View.OnClickListener onClickListener = this.D;
        textView2.setOnClickListener(onClickListener);
        this.f209819m.setOnClickListener(onClickListener);
        this.f209820n.setOnClickListener(onClickListener);
        this.f209815f.setOnClickListener(new tj5.f(this));
        ck5.f b17 = ck5.f.b(this.f209816g);
        int limitInputLength = getLimitInputLength();
        b17.f42561f = 0;
        b17.f42560e = limitInputLength;
        b17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_1;
        b17.d(null);
        if (com.tencent.mm.ui.bk.C() || (this instanceof com.tencent.mm.ui.search.FTSEditTextViewNightMode)) {
            this.f209815f.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        this.f209815f.setContentDescription(getResources().getString(com.tencent.mm.R.string.ftn));
        if (getSearchDone() != null) {
            getSearchDone().setOnClickListener(new tj5.g(this));
        }
    }

    public boolean k() {
        return this.f209816g.hasFocus();
    }

    public void l(boolean z17) {
        android.widget.LinearLayout linearLayout = this.f209821o;
        android.widget.EditText editText = this.f209816g;
        if (editText == null) {
            return;
        }
        if (linearLayout == null) {
            if (z17) {
                editText.setEllipsize(null);
                return;
            }
            editText.setEllipsize(android.text.TextUtils.TruncateAt.END);
            android.text.Selection.setSelection(this.f209816g.getText(), 0);
            this.f209816g.clearFocus();
            return;
        }
        if (z17) {
            linearLayout.setVisibility(8);
            android.widget.ImageButton clearBtn = getClearBtn();
            if (clearBtn != null) {
                clearBtn.setPadding(i65.a.b(getContext(), 4), clearBtn.getPaddingTop(), clearBtn.getPaddingRight(), clearBtn.getPaddingBottom());
                return;
            }
            return;
        }
        editText.setEllipsize(null);
        android.text.Selection.setSelection(this.f209816g.getText(), 0);
        this.f209816g.clearFocus();
        c();
        android.widget.ImageButton clearBtn2 = getClearBtn();
        if (clearBtn2 != null) {
            clearBtn2.setPadding(0, clearBtn2.getPaddingTop(), clearBtn2.getPaddingRight(), clearBtn2.getPaddingBottom());
        }
    }

    public void m() {
        this.f209816g.requestFocus();
    }

    public void n(java.lang.String str, java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] setText(2-param), query=%s, will use UserInput", str);
        o(str, list, tj5.o.UserInput);
    }

    public void o(java.lang.String str, java.util.List list, tj5.o oVar) {
        p(str, list, oVar, false, false);
    }

    public void p(java.lang.String str, java.util.List list, tj5.o oVar, boolean z17, boolean z18) {
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String trim = str.trim();
        if (trim.length() > getLimitInputLength()) {
            trim = trim.substring(0, getLimitInputLength()).replace("\n", " ");
        }
        this.f209817h.clear();
        if (list != null) {
            this.f209817h.addAll(list);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "setText: %s %d", trim, java.lang.Integer.valueOf(this.f209817h.size()));
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] setText(5-param), query=%s, status=%s, alignStart=%s, isEditing=%s, hasFocus=%s", trim, oVar, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f209816g.hasFocus()));
        this.G = tj5.o.SetText;
        this.f209816g.setText(trim);
        if (z17) {
            android.text.Selection.setSelection(this.f209816g.getText(), 0);
            this.f209816g.clearFocus();
        } else {
            android.text.Selection.setSelection(this.f209816g.getText(), this.f209816g.getText().length());
        }
        w();
        this.G = oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] setText(5-param) done, final textChangeStatus=%s", oVar);
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            return;
        }
        v(z18);
    }

    public void q(java.lang.String str, java.util.List list, boolean z17) {
        p(str, list, tj5.o.UserInput, z17, false);
    }

    public void r() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "showClearBtn， forceEditToBeTextView = " + this.f209826t);
        if (this.f209826t) {
            this.f209815f.setVisibility(8);
        } else {
            this.f209815f.setVisibility(0);
        }
    }

    public void s() {
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.f209816g, 0);
    }

    public void setActionSearchDoneListener(tj5.l lVar) {
        this.B = lVar;
    }

    public void setCanDeleteTag(boolean z17) {
        this.f209825s = z17;
    }

    public void setClearBtnIconColor(int i17) {
        android.widget.ImageButton imageButton = this.f209815f;
        if (imageButton != null && (imageButton instanceof com.tencent.mm.ui.widget.imageview.WeImageButton)) {
            ((com.tencent.mm.ui.widget.imageview.WeImageButton) imageButton).setIconColor(i17);
            return;
        }
        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_ATOP;
        if (imageButton != null) {
            imageButton.getDrawable().setColorFilter(i17, mode);
        }
    }

    public void setClearBtnImageDrawable(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageButton imageButton = this.f209815f;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable);
        }
    }

    public void setClearBtnVisable(int i17) {
        android.widget.ImageButton imageButton = this.f209815f;
        if (imageButton != null) {
            imageButton.setVisibility(i17);
        }
    }

    public void setEditTextDrawableLeft(int i17) {
        if (i17 == -1) {
            this.f209816g.setCompoundDrawablesRelative(null, null, null, null);
            return;
        }
        android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(i17);
        drawable.setBounds(0, 0, i65.a.b(getContext(), 15), i65.a.b(getContext(), 15));
        this.f209816g.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setForceDisable(boolean z17) {
        this.f209826t = z17;
    }

    public void setForceHideSearchIconBtn(boolean z17) {
        this.f209828v = z17;
    }

    public void setForceShowClearBtn(boolean z17) {
        this.f209827u = z17;
    }

    public void setFtsEditTextListener(tj5.n nVar) {
        this.E = nVar;
    }

    public void setHint(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f209822p)) {
            this.f209816g.setHint(str);
        } else {
            this.f209816g.setHint(this.f209822p);
        }
        this.f209823q = str;
    }

    public void setHintColor(int i17) {
        this.f209816g.setHintTextColor(i17);
    }

    public void setIconMarginVisable(int i17) {
        android.view.View view = this.f209814e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/search/FTSEditTextView", "setIconMarginVisable", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/search/FTSEditTextView", "setIconMarginVisable", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setRecommendSearchHint(java.lang.String str) {
        this.f209816g.setHint(str);
        this.f209822p = str;
    }

    public void setSearchIconGone(int i17) {
        if (getSearchDone() != null) {
            android.view.View searchDone = getSearchDone();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(searchDone, arrayList.toArray(), "com/tencent/mm/ui/search/FTSEditTextView", "setSearchIconGone", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            searchDone.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(searchDone, "com/tencent/mm/ui/search/FTSEditTextView", "setSearchIconGone", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setSearchIconVisable(int i17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f209813d;
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
    }

    public void setTextColor(int i17) {
        this.f209816g.setTextColor(i17);
    }

    public void t() {
        post(new tj5.i(this));
    }

    public void u(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "updateActionDonePos, getSosEditTextView().getSearchBarCancelTextContainer().getVisibility() = " + z17);
        if (getSearchDone() != null) {
            if (z17) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getSearchDone().getLayoutParams();
                marginLayoutParams.rightMargin = 0;
                getSearchDone().setLayoutParams(marginLayoutParams);
            } else {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) getSearchDone().getLayoutParams();
                marginLayoutParams2.rightMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
                getSearchDone().setLayoutParams(marginLayoutParams2);
            }
        }
    }

    public void v(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] updateEllipsize, isEditing=%s, textChangeStatus=%s", java.lang.Boolean.valueOf(z17), this.G);
        this.f209816g.setKeyListener(null);
        l(z17);
        this.f209816g.setOnFocusChangeListener(new tj5.k(this));
    }

    public final void w() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "updateTagView %s", java.lang.Integer.valueOf(this.f209817h.size()));
        i65.a.h(getContext(), com.tencent.mm.R.dimen.f479897ia);
        if (this.f209817h.size() >= 1) {
            this.f209818i.setVisibility(0);
            this.f209818i.setText(pg5.d.a(getContext(), ((tj5.x) this.f209817h.get(0)).R0()));
        } else {
            this.f209818i.setVisibility(8);
        }
        if (this.f209817h.size() >= 2) {
            this.f209819m.setVisibility(0);
            this.f209819m.setText(pg5.d.a(getContext(), ((tj5.x) this.f209817h.get(1)).R0()));
        } else {
            this.f209819m.setVisibility(8);
        }
        if (this.f209817h.size() < 3) {
            this.f209820n.setVisibility(8);
        } else {
            this.f209820n.setVisibility(0);
            this.f209820n.setText(pg5.d.a(getContext(), ((tj5.x) this.f209817h.get(2)).R0()));
        }
    }

    public FTSEditTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f209825s = true;
        this.f209826t = false;
        this.f209827u = false;
        this.f209828v = false;
        this.f209829w = 0;
        this.f209830x = "";
        this.A = 2;
        this.D = new tj5.j(this);
        this.F = new java.util.ArrayList();
        this.G = tj5.o.UserInput;
        this.H = new tj5.a(this);
        j(attributeSet);
    }
}
