package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class SearchViewNotRealTimeHelper extends android.widget.LinearLayout implements com.tencent.mm.ui.tools.o3 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f210143d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f210144e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f210145f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f210146g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.i9 f210147h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.tools.p f210148i;

    public SearchViewNotRealTimeHelper(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        h();
    }

    @Override // com.tencent.mm.ui.tools.o3
    public boolean a() {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void b() {
        this.f210144e.clearFocus();
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void c(java.lang.Boolean bool) {
    }

    @Override // com.tencent.mm.ui.tools.o3
    public boolean d() {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.o3
    public boolean e() {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void f(boolean z17) {
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void g(boolean z17) {
        if (z17) {
            this.f210144e.setText("");
        } else {
            this.f210144e.setText("");
        }
    }

    @Override // com.tencent.mm.ui.tools.o3
    public java.lang.String getSearchContent() {
        android.text.Editable editableText = this.f210144e.getEditableText();
        return editableText == null ? "" : editableText.toString();
    }

    public int getSelectionEnd() {
        return -1;
    }

    public int getSelectionStart() {
        return -1;
    }

    public final void h() {
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f487916bi, (android.view.ViewGroup) this, true);
        this.f210144e = (android.widget.EditText) findViewById(com.tencent.mm.R.id.d98);
        this.f210145f = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.nhn);
        this.f210143d = findViewById(com.tencent.mm.R.id.f482324bd);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.b2z);
        this.f210146g = button;
        button.setEnabled(false);
        this.f210144e.addTextChangedListener(new com.tencent.mm.ui.tools.d9(this));
        this.f210144e.setOnEditorActionListener(new com.tencent.mm.ui.tools.e9(this));
        ck5.f b17 = ck5.f.b(this.f210144e);
        b17.f42561f = 0;
        b17.f42560e = 100;
        b17.d(null);
        this.f210145f.setOnClickListener(new com.tencent.mm.ui.tools.f9(this));
        this.f210143d.setOnClickListener(new com.tencent.mm.ui.tools.g9(this));
        this.f210146g.setOnClickListener(new com.tencent.mm.ui.tools.h9(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setAutoMatchKeywords(boolean z17) {
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setBackClickCallback(com.tencent.mm.ui.tools.p pVar) {
        this.f210148i = pVar;
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setCallBack(com.tencent.mm.ui.tools.q qVar) {
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setEditTextEnabled(boolean z17) {
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setHint(java.lang.CharSequence charSequence) {
        setSearchHint(charSequence);
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setImeScene(int i17) {
        android.widget.EditText editText = this.f210144e;
        if (editText != null) {
            editText.getInputExtras(true).putInt("wechat_scene", i17);
        }
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setKeywords(java.util.ArrayList<java.lang.String> arrayList) {
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setNotRealCallBack(com.tencent.mm.ui.tools.i9 i9Var) {
        this.f210147h = i9Var;
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener onEditorActionListener) {
    }

    public void setSearchBtnText(java.lang.CharSequence charSequence) {
        this.f210146g.setText(charSequence);
    }

    public void setSearchColor(int i17) {
        this.f210144e.setTextColor(i17);
    }

    public void setSearchContent(java.lang.CharSequence charSequence) {
        this.f210144e.setText("");
        this.f210144e.append(charSequence);
    }

    public void setSearchHint(java.lang.CharSequence charSequence) {
        this.f210144e.setHint(charSequence);
    }

    public void setSearchHintColor(int i17) {
        this.f210144e.setHintTextColor(i17);
    }

    public void setSearchIcon(int i17) {
        this.f210144e.setCompoundDrawablesWithIntrinsicBounds(i17, 0, 0, 0);
    }

    public void setSearchTipIcon(int i17) {
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setSelectedTag(java.lang.String str) {
    }

    public void setShowBackIcon(boolean z17) {
        android.view.View view = this.f210143d;
        if (view != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setStatusBtnEnabled(boolean z17) {
    }

    public void setCallBack(com.tencent.mm.ui.tools.i9 i9Var) {
        this.f210147h = i9Var;
    }

    public SearchViewNotRealTimeHelper(android.content.Context context) {
        super(context);
        h();
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setSearchContent(java.lang.String str) {
        setSearchContent((java.lang.CharSequence) str);
    }
}
