package com.tencent.mm.plugin.qqmail.ui;

/* loaded from: classes8.dex */
public class MailAddrsViewControl extends android.widget.RelativeLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.regex.Pattern f154881p = java.util.regex.Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    /* renamed from: d, reason: collision with root package name */
    public boolean f154882d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f154883e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.AutoCompleteTextView f154884f;

    /* renamed from: g, reason: collision with root package name */
    public os3.t2 f154885g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f154886h;

    /* renamed from: i, reason: collision with root package name */
    public os3.u2 f154887i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.GestureDetector f154888m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f154889n;

    /* renamed from: o, reason: collision with root package name */
    public os3.q2 f154890o;

    public MailAddrsViewControl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f154882d = false;
        this.f154883e = new java.util.LinkedList();
        this.f154886h = new com.tencent.mm.sdk.platformtools.n3();
        this.f154890o = null;
        this.f154888m = new android.view.GestureDetector(context, new os3.p2(this));
    }

    public void a() {
        com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl = this;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < childCount) {
            android.view.View childAt = mailAddrsViewControl.getChildAt(i17);
            if (childAt.getVisibility() != 8 || (childAt instanceof android.widget.AutoCompleteTextView)) {
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                if (width == 0) {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
                    width = childAt.getMeasuredWidth();
                }
                android.widget.AutoCompleteTextView autoCompleteTextView = mailAddrsViewControl.f154884f;
                if (autoCompleteTextView != null && i17 == childCount - 1 && !autoCompleteTextView.isFocused()) {
                    width = 0;
                }
                if (i18 + width > measuredWidth) {
                    i19 += height;
                    i18 = 0;
                }
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.setMargins(i18, i19, layoutParams.rightMargin, layoutParams.bottomMargin);
                childAt.setLayoutParams(layoutParams);
                i18 += width;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "adjust", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "adjust", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i17++;
            mailAddrsViewControl = this;
        }
    }

    public void b(ks3.u uVar) {
        boolean z17;
        if (uVar == null) {
            return;
        }
        java.util.LinkedList linkedList = this.f154883e;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (((ks3.u) it.next()).f311751f.equalsIgnoreCase(uVar.f311751f)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cbf, null);
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.lek);
        viewGroup.removeView((android.view.View) button.getParent());
        button.setText(uVar.f311750e);
        if (this.f154882d) {
            button.setCompoundDrawables(null, null, null, null);
        }
        button.setTag("" + linkedList.size());
        android.view.View view = (android.view.View) button.getParent();
        button.setTag(uVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "insertMailAddr", "(Lcom/tencent/mm/plugin/qqmail/model/MailAddr;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "insertMailAddr", "(Lcom/tencent/mm/plugin/qqmail/model/MailAddr;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setTag(uVar);
        addView(view, linkedList.size());
        linkedList.add(uVar);
        this.f154886h.postDelayed(new os3.j2(this, button), 100L);
    }

    public void c(java.util.List list, boolean z17) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (z17) {
            removeAllViews();
            this.f154883e.clear();
            a();
            invalidate();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            b((ks3.u) it.next());
        }
    }

    public boolean d() {
        java.lang.String trim = this.f154884f.getEditableText().toString().trim();
        return !com.tencent.mm.sdk.platformtools.t8.K0(trim) && f154881p.matcher(trim).matches();
    }

    public final void e(java.lang.String str, boolean z17) {
        java.lang.String trim = str.trim();
        if (trim.length() == 0) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().f311706b.e(trim);
        if (arrayList.size() > 0) {
            b((ks3.u) arrayList.get(0));
            this.f154884f.setText("");
            return;
        }
        if (f154881p.matcher(trim).matches()) {
            ks3.u uVar = new ks3.u();
            uVar.f311750e = trim;
            uVar.f311751f = trim;
            uVar.f311752g = 0;
            b(uVar);
            this.f154884f.setText("");
            return;
        }
        if (!z17) {
            os3.q2 q2Var = this.f154890o;
            if (q2Var != null) {
                os3.l0 l0Var = (os3.l0) q2Var;
                com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = l0Var.f348140a;
                db5.e1.u(composeUI.getContext(), composeUI.getString(com.tencent.mm.R.string.hkd), "", new os3.i0(l0Var, this), new os3.k0(l0Var, this));
                return;
            }
            return;
        }
        os3.q2 q2Var2 = this.f154890o;
        if (q2Var2 != null) {
            com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI2 = ((os3.l0) q2Var2).f348140a;
            db5.t7.o(composeUI2, composeUI2.getString(com.tencent.mm.R.string.hkd), 1500L);
        } else {
            dp.a.makeText(getContext(), com.tencent.mm.R.string.hkd, 2000).show();
        }
        this.f154884f.setText(trim);
        this.f154884f.setSelection(trim.length());
    }

    public void f(ks3.u uVar) {
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f154883e;
            if (i17 >= linkedList.size()) {
                return;
            }
            if (uVar.f311751f.equalsIgnoreCase(((ks3.u) linkedList.get(i17)).f311751f)) {
                removeViewAt(i17);
                linkedList.remove(i17);
                a();
                invalidate();
                return;
            }
            i17++;
        }
    }

    public boolean g(boolean z17) {
        java.util.LinkedList linkedList = this.f154883e;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (!f154881p.matcher(((ks3.u) it.next()).f311751f).matches()) {
                return false;
            }
        }
        return !z17 || linkedList.size() > 0;
    }

    public java.lang.String getAddrsString() {
        int i17 = 0;
        if (d()) {
            e(this.f154884f.getEditableText().toString(), false);
        }
        java.lang.String str = "";
        while (true) {
            java.util.LinkedList linkedList = this.f154883e;
            if (i17 >= linkedList.size()) {
                return str;
            }
            ks3.u uVar = (ks3.u) linkedList.get(i17);
            if (i17 != 0) {
                str = str + ",";
            }
            str = str + uVar.f311751f;
            i17++;
        }
    }

    public java.lang.String[] getMailAddrStringArray() {
        java.util.LinkedList linkedList = this.f154883e;
        java.lang.String[] strArr = new java.lang.String[linkedList.size()];
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            ks3.u uVar = (ks3.u) linkedList.get(i17);
            strArr[i17] = uVar.f311750e + " " + uVar.f311751f;
        }
        return strArr;
    }

    public java.util.LinkedList<ks3.u> getMailAddrs() {
        return this.f154883e;
    }

    public int getSize() {
        return this.f154883e.size();
    }

    public void setAddrsAdapter(os3.t2 t2Var) {
        android.widget.AutoCompleteTextView autoCompleteTextView = this.f154884f;
        if (autoCompleteTextView == null || t2Var == null) {
            return;
        }
        this.f154885g = t2Var;
        autoCompleteTextView.setAdapter(t2Var);
    }

    public void setEditable(boolean z17) {
        android.widget.AutoCompleteTextView autoCompleteTextView;
        this.f154882d = z17;
        if (!z17 || this.f154884f != null) {
            if (z17 || (autoCompleteTextView = this.f154884f) == null) {
                return;
            }
            autoCompleteTextView.setVisibility(8);
            return;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= getChildCount()) {
                break;
            }
            android.view.View childAt = getChildAt(i17);
            if (childAt instanceof android.widget.AutoCompleteTextView) {
                this.f154884f = (android.widget.AutoCompleteTextView) childAt;
                break;
            }
            if (childAt instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) childAt;
                for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                    android.view.View childAt2 = viewGroup.getChildAt(i18);
                    if (childAt2 instanceof android.widget.AutoCompleteTextView) {
                        this.f154884f = (android.widget.AutoCompleteTextView) childAt2;
                    }
                }
            }
            if (this.f154884f != null) {
                break;
            } else {
                i17++;
            }
        }
        android.widget.AutoCompleteTextView autoCompleteTextView2 = this.f154884f;
        if (autoCompleteTextView2 != null) {
            autoCompleteTextView2.setDropDownBackgroundResource(com.tencent.mm.R.drawable.blu);
            setOnClickListener(new os3.h2(this));
            this.f154884f.setOnItemClickListener(new os3.k2(this));
            this.f154884f.setOnEditorActionListener(new os3.l2(this));
            this.f154884f.setOnKeyListener(new os3.m2(this));
            this.f154884f.addTextChangedListener(new os3.n2(this));
            this.f154884f.setOnFocusChangeListener(new os3.o2(this));
        }
    }

    public void setInvalidMailAddrListener(os3.q2 q2Var) {
        this.f154890o = q2Var;
    }

    public void setMailAdds(java.util.List<ks3.u> list) {
        java.util.LinkedList linkedList;
        if (list == null) {
            return;
        }
        int i17 = 0;
        while (true) {
            linkedList = this.f154883e;
            if (i17 >= linkedList.size()) {
                break;
            }
            ks3.u uVar = (ks3.u) linkedList.get(i17);
            int i18 = 0;
            while (i18 < list.size()) {
                if (uVar.f311751f.equalsIgnoreCase(list.get(i18).f311751f)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 == list.size()) {
                f(uVar);
            }
            i17++;
        }
        for (int i19 = 0; i19 < list.size(); i19++) {
            ks3.u uVar2 = list.get(i19);
            int i27 = 0;
            while (i27 < linkedList.size()) {
                if (uVar2.f311751f.equalsIgnoreCase(((ks3.u) linkedList.get(i27)).f311751f)) {
                    break;
                } else {
                    i27++;
                }
            }
            if (i27 == linkedList.size()) {
                b(uVar2);
            }
        }
    }

    public void setOnActionListener(os3.u2 u2Var) {
        this.f154887i = u2Var;
    }
}
