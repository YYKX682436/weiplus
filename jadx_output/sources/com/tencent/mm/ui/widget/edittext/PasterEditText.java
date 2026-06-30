package com.tencent.mm.ui.widget.edittext;

/* loaded from: classes15.dex */
public class PasterEditText extends android.widget.EditText {

    /* renamed from: d, reason: collision with root package name */
    public boolean f212076d;

    /* renamed from: e, reason: collision with root package name */
    public int f212077e;

    /* renamed from: f, reason: collision with root package name */
    public int f212078f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f212079g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f212080h;

    /* renamed from: i, reason: collision with root package name */
    public int f212081i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f212082m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f212083n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f212084o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f212085p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f212086q;

    public PasterEditText(android.content.Context context) {
        super(context);
        this.f212076d = false;
        this.f212077e = 0;
        this.f212078f = 0;
        this.f212079g = "";
        this.f212080h = "";
        this.f212081i = 0;
        this.f212082m = false;
        this.f212083n = "";
        this.f212084o = new java.util.ArrayList();
        this.f212085p = new java.util.LinkedList();
        this.f212086q = java.util.Collections.synchronizedList(new java.util.LinkedList());
        r();
    }

    private void r() {
        super.addTextChangedListener(new nl5.t(this));
        if (android.os.Build.VERSION.SDK_INT < 35 || !com.tencent.mm.ui.b4.b(getContext())) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(android.text.TextWatcher textWatcher) {
        this.f212085p.add(textWatcher);
    }

    public android.view.ViewParent g() {
        return getParent();
    }

    public java.lang.CharSequence getPasterContent() {
        return this.f212080h;
    }

    public int getPasterLen() {
        return this.f212081i;
    }

    public boolean getSimilarPasteChange() {
        return this.f212082m;
    }

    public java.lang.String getSimilarPasteSeqStr() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < 3; i17++) {
            java.util.List list = this.f212084o;
            if (i17 >= list.size()) {
                break;
            }
            if (i17 != 0) {
                sb6.append(",");
            }
            sb6.append(list.get(i17));
        }
        return sb6.toString();
    }

    public void h() {
        requestLayout();
    }

    public int i() {
        return getWidth();
    }

    public boolean k() {
        return requestFocus();
    }

    @Override // android.widget.TextView
    public boolean onPrivateIMECommand(java.lang.String str, android.os.Bundle bundle) {
        return super.onPrivateIMECommand(str, bundle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if (i17 != 16908322) {
            return i17 == 16908321 ? super.onTextContextMenuItem(i17) : super.onTextContextMenuItem(i17);
        }
        this.f212076d = true;
        return super.onTextContextMenuItem(i17);
    }

    public android.content.Context p() {
        return getContext();
    }

    public void q() {
        this.f212082m = false;
        this.f212084o.clear();
        this.f212083n = "";
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(android.text.TextWatcher textWatcher) {
        this.f212085p.remove(textWatcher);
    }

    public PasterEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212076d = false;
        this.f212077e = 0;
        this.f212078f = 0;
        this.f212079g = "";
        this.f212080h = "";
        this.f212081i = 0;
        this.f212082m = false;
        this.f212083n = "";
        this.f212084o = new java.util.ArrayList();
        this.f212085p = new java.util.LinkedList();
        this.f212086q = java.util.Collections.synchronizedList(new java.util.LinkedList());
        r();
    }

    public PasterEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212076d = false;
        this.f212077e = 0;
        this.f212078f = 0;
        this.f212079g = "";
        this.f212080h = "";
        this.f212081i = 0;
        this.f212082m = false;
        this.f212083n = "";
        this.f212084o = new java.util.ArrayList();
        this.f212085p = new java.util.LinkedList();
        this.f212086q = java.util.Collections.synchronizedList(new java.util.LinkedList());
        r();
    }
}
