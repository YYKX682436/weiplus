package com.tencent.mm.ui.base;

/* loaded from: classes11.dex */
public class MMTagPanel extends com.tencent.mm.ui.base.FlowLayout {
    public final java.util.LinkedList A;
    public final java.util.LinkedList B;
    public db5.t6 C;
    public int D;
    public android.view.View E;
    public com.tencent.mm.ui.widget.MMEditText F;
    public int G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View.OnClickListener f197579J;
    public boolean K;
    public db5.a7 L;

    /* renamed from: i, reason: collision with root package name */
    public boolean f197580i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f197581m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f197582n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f197583o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f197584p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f197585q;

    /* renamed from: r, reason: collision with root package name */
    public int f197586r;

    /* renamed from: s, reason: collision with root package name */
    public int f197587s;

    /* renamed from: t, reason: collision with root package name */
    public int f197588t;

    /* renamed from: u, reason: collision with root package name */
    public int f197589u;

    /* renamed from: v, reason: collision with root package name */
    public int f197590v;

    /* renamed from: w, reason: collision with root package name */
    public int f197591w;

    /* renamed from: x, reason: collision with root package name */
    public int f197592x;

    /* renamed from: y, reason: collision with root package name */
    public int f197593y;

    /* renamed from: z, reason: collision with root package name */
    public db5.b7 f197594z;

    public MMTagPanel(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197580i = false;
        this.f197581m = true;
        this.f197582n = false;
        this.f197583o = true;
        this.f197584p = false;
        this.f197585q = false;
        this.f197586r = com.tencent.mm.R.drawable.cfw;
        this.f197587s = 0;
        this.f197588t = com.tencent.mm.R.drawable.f482150b51;
        this.f197589u = com.tencent.mm.R.color.a0c;
        this.f197590v = com.tencent.mm.R.drawable.b4t;
        this.f197591w = com.tencent.mm.R.color.aaq;
        this.f197592x = com.tencent.mm.R.drawable.b4w;
        this.f197593y = com.tencent.mm.R.color.f479549ab0;
        this.f197594z = null;
        this.A = new java.util.LinkedList();
        this.B = new java.util.LinkedList();
        this.H = false;
        this.I = false;
        this.f197579J = new db5.s6(this);
        this.K = true;
        l();
    }

    public static db5.b7 b(com.tencent.mm.ui.base.MMTagPanel mMTagPanel, java.lang.String str) {
        mMTagPanel.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMTagPanel", "want to get tag info, but it is null or empty");
            return null;
        }
        java.util.Iterator it = mMTagPanel.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (str.equals(b7Var.f228295a)) {
                return b7Var;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MMTagPanel", "want to get tag %s, but it not exsited!", str);
        return null;
    }

    public java.lang.String c(android.widget.EditText editText, android.text.Editable editable, java.lang.String str, android.text.TextWatcher textWatcher) {
        return str;
    }

    public void d(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMTagPanel", "want to add tag, but it is null or empty");
            return;
        }
        java.lang.String trim = str.trim();
        p(trim);
        java.util.LinkedList linkedList = this.A;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (trim.equals(((db5.b7) it.next()).f228295a)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMTagPanel", "want to add tag %s, but it exsited!", trim);
                return;
            }
        }
        db5.b7 i17 = i();
        t(i17, trim, z17);
        linkedList.add(i17);
        if (this.f197582n) {
            addView(i17.f228296b, getChildCount() - 1);
        } else {
            addView(i17.f228296b);
        }
        h();
    }

    public void e() {
        java.util.LinkedList linkedList = this.A;
        linkedList.clear();
        removeAllViews();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            n((db5.b7) it.next());
        }
    }

    public void f() {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.os.IBinder windowToken;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText == null || !mMEditText.isFocused() || (inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")) == null || (windowToken = this.F.getWindowToken()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        this.F.clearFocus();
    }

    public void g() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText != null) {
            mMEditText.setText("");
        }
    }

    public java.lang.String getEditText() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        return mMEditText != null ? mMEditText.getText().toString() : "";
    }

    public android.widget.EditText getEditTextView() {
        return this.F;
    }

    public int getEditViewLayoutId() {
        return com.tencent.mm.R.layout.c1l;
    }

    public java.lang.String getEdittextText() {
        return (!this.f197582n || com.tencent.mm.sdk.platformtools.t8.J0(this.F.getText())) ? "" : this.F.getText().toString();
    }

    public java.util.ArrayList<java.lang.String> getSelectTagList() {
        android.widget.TextView textView;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (b7Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(b7Var.f228295a) && (textView = b7Var.f228296b) != null && ((java.lang.Integer) textView.getTag()).intValue() == 1) {
                arrayList.add(b7Var.f228295a);
            }
        }
        return arrayList;
    }

    public int getTagCount() {
        return this.A.size();
    }

    public java.util.ArrayList<java.lang.String> getTagList() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b7Var.f228295a)) {
                arrayList.add(b7Var.f228295a);
            }
        }
        return arrayList;
    }

    public java.util.Set<java.lang.String> getTagSet() {
        java.util.TreeSet treeSet = new java.util.TreeSet();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b7Var.f228295a)) {
                treeSet.add(b7Var.f228295a);
            }
        }
        return treeSet;
    }

    public void h() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText != null) {
            mMEditText.isFocused();
            this.F.setCursorVisible(true);
        }
        db5.b7 b7Var = this.f197594z;
        if (b7Var == null) {
            return;
        }
        android.widget.TextView textView = b7Var.f228296b;
        u(textView, ((java.lang.Integer) textView.getTag()).intValue() == 1, false);
        this.f197594z = null;
    }

    public db5.b7 i() {
        java.util.LinkedList linkedList = this.B;
        if (!linkedList.isEmpty()) {
            return (db5.b7) linkedList.removeFirst();
        }
        db5.b7 b7Var = new db5.b7();
        b7Var.f228296b = j();
        return b7Var;
    }

    public android.widget.TextView j() {
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setBackgroundResource(this.f197588t);
        textView.setTextColor(getResources().getColor(this.f197589u));
        textView.setTag(0);
        textView.setGravity(17);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.f197586r, 0);
        textView.setOnClickListener(this.f197581m ? this.f197579J : null);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setSingleLine();
        return textView;
    }

    public void k(boolean z17) {
        if (z17 == this.f197582n) {
            return;
        }
        this.f197582n = z17;
        removeView(this.E);
        if (this.f197582n) {
            addView(this.E);
            f();
        }
    }

    public final void l() {
        this.D = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479853h2);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(getEditViewLayoutId(), (android.view.ViewGroup) null);
        this.E = inflate;
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) inflate.findViewById(com.tencent.mm.R.id.d98);
        this.F = mMEditText;
        mMEditText.setOnKeyListener(new db5.i6(this));
        this.F.addTextChangedListener(new db5.j6(this));
        this.F.setOnFocusChangeListener(new db5.k6(this));
        this.F.setOnClickListener(new db5.l6(this));
        this.F.setOnEditorActionListener(new db5.m6(this));
        db5.z6 z6Var = new db5.z6(this);
        this.F.setFilters(new android.text.InputFilter[]{z6Var, new db5.x6(this)});
        f();
        setOnClickListener(new db5.n6(this));
        setOnTouchListener(new db5.o6(this, z6Var));
    }

    public void m() {
    }

    public void n(db5.b7 b7Var) {
        b7Var.f228296b.setOnClickListener(null);
        java.util.LinkedList linkedList = this.B;
        if (linkedList.size() >= 16) {
            return;
        }
        linkedList.add(b7Var);
    }

    public void o() {
        java.util.LinkedList linkedList = this.A;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            removeView(b7Var.f228296b);
            n(b7Var);
        }
        linkedList.clear();
        h();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.K) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void p(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMTagPanel", "want to remove tag, but it is null or empty");
            return;
        }
        java.util.LinkedList linkedList = this.A;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (str.equals(b7Var.f228295a)) {
                linkedList.remove(b7Var);
                removeView(b7Var.f228296b);
                n(b7Var);
                h();
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MMTagPanel", "want to remove tag %s, but it not exsited!", str);
    }

    public void q() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText == null || mMEditText.isFocused()) {
            return;
        }
        this.F.requestFocus();
    }

    public void r(java.util.Collection collection, java.util.List list) {
        e();
        if (this.f197582n) {
            addView(this.E);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            d(str, collection == null ? false : collection.contains(str));
        }
    }

    public void s(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMTagPanel", "want to update tag status, but it is null or empty");
            return;
        }
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (str.equals(b7Var.f228295a)) {
                t(b7Var, str, z17);
                h();
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MMTagPanel", "want to update tag %s status, but it not exsited!", str);
    }

    public void setCallBack(db5.t6 t6Var) {
        this.C = t6Var;
    }

    public void setEditHint(java.lang.String str) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText != null) {
            mMEditText.setHint(str);
        }
    }

    public void setEditTextColor(int i17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText != null) {
            mMEditText.setTextColor(i17);
        }
    }

    public void setEditTextEnable(boolean z17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText != null) {
            mMEditText.setEnabled(z17);
        }
    }

    public void setEditTextEnableEdit(boolean z17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText != null) {
            mMEditText.setCursorVisible(z17);
            this.F.setFocusable(z17);
            this.F.setFocusableInTouchMode(z17);
        }
    }

    public void setEditTextHit(boolean z17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText != null) {
            if (z17) {
                mMEditText.setHint(com.tencent.mm.R.string.f489842da);
            } else {
                mMEditText.setHint("");
            }
        }
    }

    public void setEditTextOnClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText != null) {
            mMEditText.setClickable(true);
            this.F.setOnClickListener(onClickListener);
        }
    }

    public void setEditTextSize(float f17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText != null) {
            mMEditText.setTextSize(0, f17);
        }
    }

    public void setEdittextMaxSize(int i17) {
        this.G = i17;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.F;
        if (mMEditText != null) {
            mMEditText.setMaxEms(i17);
        }
    }

    public void setHintTextSize(int i17) {
        this.D = i17;
    }

    public void setIsAllowEnterCharacter(boolean z17) {
        this.H = z17;
    }

    public void setPanelClickable(boolean z17) {
        this.K = z17;
    }

    public void setTagEditTextBG(int i17) {
        this.f197587s = i17;
        if (this.F != null) {
            i65.a.b(getContext(), 6);
            getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
            this.F.setBackgroundResource(this.f197587s);
        }
    }

    public void setTagHighlineBG(int i17) {
        this.f197592x = i17;
    }

    public void setTagNormalBG(int i17) {
        this.f197588t = i17;
    }

    public void setTagNormalTextColorRes(int i17) {
        this.f197589u = i17;
    }

    public void setTagSelectedBG(int i17) {
        this.f197590v = i17;
    }

    public void setTagSelectedTextColorRes(int i17) {
        this.f197591w = i17;
    }

    public void setTagTipsDrawable(int i17) {
        this.f197586r = i17;
    }

    public void setTaghighlineTextColorRes(int i17) {
        this.f197593y = i17;
    }

    public void setTagsSelected(java.util.ArrayList<java.lang.String> arrayList) {
        if (arrayList == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMTagPanel", "want to update tags status, but tags list is null");
            return;
        }
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            java.lang.String str = b7Var.f228295a;
            t(b7Var, str, arrayList.contains(str));
        }
    }

    public void setUnUseBackground(boolean z17) {
        this.I = z17;
    }

    public void t(db5.b7 b7Var, java.lang.String str, boolean z17) {
        b7Var.f228295a = str;
        b7Var.f228296b.setText(pg5.d.a(getContext(), str));
        b7Var.f228296b.setOnClickListener(this.f197581m ? this.f197579J : null);
        u(b7Var.f228296b, z17, false);
    }

    public void u(android.widget.TextView textView, boolean z17, boolean z18) {
        textView.setTextSize(0, this.D * i65.a.q(getContext()));
        if (z18) {
            textView.setBackgroundResource(this.f197592x);
            textView.setTextColor(getResources().getColor(this.f197593y));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.f197586r, 0);
            textView.setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.bop, textView.getText()));
            return;
        }
        if (z17) {
            textView.setTag(1);
            textView.setBackgroundResource(this.f197590v);
            textView.setTextColor(getResources().getColor(this.f197591w));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            textView.setContentDescription(((java.lang.Object) textView.getText()) + getContext().getResources().getString(com.tencent.mm.R.string.cbd) + getContext().getResources().getString(com.tencent.mm.R.string.d_));
            return;
        }
        textView.setTag(0);
        textView.setBackgroundResource(this.f197588t);
        textView.setTextColor(getResources().getColor(this.f197589u));
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        textView.setContentDescription(((java.lang.Object) textView.getText()) + getContext().getResources().getString(com.tencent.mm.R.string.cbd) + getContext().getResources().getString(com.tencent.mm.R.string.f489843db));
    }

    public MMTagPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197580i = false;
        this.f197581m = true;
        this.f197582n = false;
        this.f197583o = true;
        this.f197584p = false;
        this.f197585q = false;
        this.f197586r = com.tencent.mm.R.drawable.cfw;
        this.f197587s = 0;
        this.f197588t = com.tencent.mm.R.drawable.f482150b51;
        this.f197589u = com.tencent.mm.R.color.a0c;
        this.f197590v = com.tencent.mm.R.drawable.b4t;
        this.f197591w = com.tencent.mm.R.color.aaq;
        this.f197592x = com.tencent.mm.R.drawable.b4w;
        this.f197593y = com.tencent.mm.R.color.f479549ab0;
        this.f197594z = null;
        this.A = new java.util.LinkedList();
        this.B = new java.util.LinkedList();
        this.H = false;
        this.I = false;
        this.f197579J = new db5.s6(this);
        this.K = true;
        l();
    }
}
