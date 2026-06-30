package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class ActionBarSearchView extends android.widget.LinearLayout implements com.tencent.mm.ui.tools.o3 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f209960u = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f209961d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText f209962e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f209963f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.tools.r f209964g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f209965h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.tools.vd f209966i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f209967m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.tools.q f209968n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.tools.p f209969o;

    /* renamed from: p, reason: collision with root package name */
    public final android.text.TextWatcher f209970p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnFocusChangeListener f209971q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f209972r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f209973s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f209974t;

    /* loaded from: classes12.dex */
    public static class ActionBarEditText extends com.tencent.mm.ui.widget.AutoMatchKeywordEditText {
        public ActionBarEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
            super(context, attributeSet, i17);
        }

        @Override // com.tencent.mm.ui.widget.AutoMatchKeywordEditText, com.tencent.mm.ui.widget.MMEditText, fl5.i
        public fl5.i getRealEditText() {
            return this;
        }

        public void setSearchView(com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView) {
        }

        public ActionBarEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public ActionBarSearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209964g = com.tencent.mm.ui.tools.r.CLEAR;
        this.f209965h = false;
        this.f209970p = new com.tencent.mm.ui.tools.f(this);
        this.f209971q = new com.tencent.mm.ui.tools.g(this);
        this.f209973s = new com.tencent.mm.ui.tools.h(this);
        this.f209974t = new com.tencent.mm.ui.tools.i(this);
        h();
    }

    @Override // com.tencent.mm.ui.tools.o3
    public boolean a() {
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        if (actionBarEditText != null) {
            return actionBarEditText.hasFocus();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void b() {
        this.f209962e.clearFocus();
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void c(java.lang.Boolean bool) {
        if (this.f209962e == null) {
            return;
        }
        if (!bool.booleanValue()) {
            this.f209962e.post(new com.tencent.mm.ui.tools.o(this));
        } else if (d()) {
            l();
        }
    }

    @Override // com.tencent.mm.ui.tools.o3
    public boolean d() {
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        if (actionBarEditText != null) {
            return actionBarEditText.requestFocus();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.tools.o3
    public boolean e() {
        return this instanceof com.tencent.mm.plugin.fts.ui.widget.v;
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void f(boolean z17) {
        if (z17 && z17 != this.f209965h) {
            k(com.tencent.mm.ui.tools.r.VOICE_SEARCH);
        }
        this.f209965h = z17;
        m();
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void g(boolean z17) {
        if (z17) {
            this.f209962e.setText("");
            return;
        }
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        android.text.TextWatcher textWatcher = this.f209970p;
        actionBarEditText.removeTextChangedListener(textWatcher);
        this.f209962e.setText("");
        this.f209962e.addTextChangedListener(textWatcher);
    }

    public com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText getEditText() {
        return this.f209962e;
    }

    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487915bh;
    }

    public int getLineCount() {
        return this.f209962e.getLineCount();
    }

    @Override // com.tencent.mm.ui.tools.o3
    public java.lang.String getSearchContent() {
        return this.f209962e.getEditableText() != null ? this.f209962e.getEditableText().toString() : "";
    }

    public int getSelectionEnd() {
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        if (actionBarEditText != null) {
            return actionBarEditText.getSelectionEnd();
        }
        return -1;
    }

    public int getSelectionStart() {
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        if (actionBarEditText != null) {
            return actionBarEditText.getSelectionStart();
        }
        return -1;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageButton getStatusBtn() {
        return this.f209963f;
    }

    public final void h() {
        ((android.view.LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(getLayoutId(), (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.b5i);
        this.f209961d = findViewById;
        findViewById.setOnClickListener(this.f209974t);
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = (com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText) findViewById(com.tencent.mm.R.id.d98);
        this.f209962e = actionBarEditText;
        this.f209966i = new com.tencent.mm.ui.tools.vd(actionBarEditText);
        this.f209962e.setSearchView(this);
        this.f209967m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.meb);
        this.f209962e.post(new com.tencent.mm.ui.tools.j(this));
        this.f209963f = (com.tencent.mm.ui.widget.imageview.WeImageButton) findViewById(com.tencent.mm.R.id.nhn);
        this.f209962e.addTextChangedListener(this.f209970p);
        this.f209962e.setOnKeyListener(new com.tencent.mm.ui.tools.k(this));
        this.f209962e.setOnSelectionChangeListener(new com.tencent.mm.ui.tools.l(this));
        this.f209962e.setOnFocusChangeListener(this.f209971q);
        if (!(this instanceof com.tencent.mm.plugin.fts.ui.widget.v)) {
            ck5.f b17 = ck5.f.b(this.f209962e);
            b17.f42561f = 0;
            b17.f42560e = 100;
            b17.d(null);
        }
        m();
        this.f209963f.setOnClickListener(this.f209973s);
        android.view.View view = this.f209967m;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.ui.tools.m(this));
        }
        if ((getContext() instanceof com.tencent.mm.ui.vas.VASActivity) && ((com.tencent.mm.ui.vas.VASActivity) getContext()).isFragmentMode()) {
            this.f209962e.setImeOptions(6);
        }
    }

    public void i(boolean z17) {
    }

    public void j(com.tencent.mm.ui.tools.r rVar) {
    }

    public void k(com.tencent.mm.ui.tools.r rVar) {
    }

    public void l() {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        if (this.f209962e == null || (inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(this.f209962e, 1);
    }

    public final void m() {
        this.f209963f.setImportantForAccessibility(1);
        android.text.Editable editableText = this.f209962e.getEditableText();
        com.tencent.mm.ui.tools.r rVar = com.tencent.mm.ui.tools.r.CLEAR;
        if (editableText != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f209962e.getEditableText().toString())) {
            this.f209963f.setImageResource(com.tencent.mm.R.raw.xmark_circle_filled);
            this.f209963f.setIconColor(getResources().getColor(com.tencent.mm.R.color.f478520a84));
            this.f209963f.setContentDescription(getContext().getString(com.tencent.mm.R.string.f490919b91));
            this.f209964g = rVar;
            return;
        }
        if (!this.f209965h) {
            this.f209963f.setImageResource(0);
            this.f209963f.setImportantForAccessibility(2);
            this.f209964g = rVar;
        } else {
            this.f209963f.setImageResource(com.tencent.mm.R.drawable.b9v);
            this.f209963f.setContentDescription(getContext().getString(com.tencent.mm.R.string.f492950ie3));
            this.f209963f.setIconColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
            this.f209964g = com.tencent.mm.ui.tools.r.VOICE_SEARCH;
        }
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setAutoMatchKeywords(boolean z17) {
        com.tencent.mm.ui.tools.vd vdVar = this.f209966i;
        if (vdVar != null) {
            vdVar.f210858e = z17;
        }
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setBackClickCallback(com.tencent.mm.ui.tools.p pVar) {
        this.f209969o = pVar;
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setCallBack(com.tencent.mm.ui.tools.q qVar) {
        this.f209968n = qVar;
    }

    public void setEditTextClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        if (actionBarEditText != null) {
            actionBarEditText.setFocusable(false);
            this.f209962e.setOnClickListener(onClickListener);
        }
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setEditTextEnabled(boolean z17) {
        this.f209962e.setEnabled(z17);
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f209972r = onFocusChangeListener;
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setHint(java.lang.CharSequence charSequence) {
        this.f209962e.setHint(charSequence);
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setImeScene(int i17) {
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        if (actionBarEditText != null) {
            actionBarEditText.getInputExtras(true).putInt("wechat_scene", i17);
        }
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setKeywords(java.util.ArrayList<java.lang.String> arrayList) {
        android.widget.EditText editText;
        com.tencent.mm.ui.tools.vd vdVar = this.f209966i;
        if (vdVar != null) {
            vdVar.f210856c = arrayList;
            if (!vdVar.f210858e || (editText = (android.widget.EditText) vdVar.f210855b.get()) == null) {
                return;
            }
            com.tencent.mm.ui.tools.vd.b(editText, vdVar.f210856c);
        }
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setNotRealCallBack(com.tencent.mm.ui.tools.i9 i9Var) {
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener onEditorActionListener) {
        this.f209962e.setOnEditorActionListener(onEditorActionListener);
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setSearchContent(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f209962e.setText(str);
        this.f209962e.setSelection(str.length());
    }

    public void setSearchTipIcon(int i17) {
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        if (actionBarEditText != null) {
            actionBarEditText.setCompoundDrawables(com.tencent.mm.sdk.platformtools.x2.f193075e.getDrawable(i17), null, null, null);
        }
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setSelectedTag(java.lang.String str) {
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        if (actionBarEditText != null) {
            actionBarEditText.setCompoundDrawables(new com.tencent.mm.ui.tools.s(this, this.f209962e, str), null, null, null);
            this.f209962e.setHint("");
        }
    }

    @Override // com.tencent.mm.ui.tools.o3
    public void setStatusBtnEnabled(boolean z17) {
        this.f209963f.setEnabled(z17);
    }

    public void setText(java.lang.String str) {
        this.f209962e.setText(str);
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        actionBarEditText.setSelection(actionBarEditText.getEditableText().length());
    }

    public ActionBarSearchView(android.content.Context context) {
        super(context);
        this.f209964g = com.tencent.mm.ui.tools.r.CLEAR;
        this.f209965h = false;
        this.f209970p = new com.tencent.mm.ui.tools.f(this);
        this.f209971q = new com.tencent.mm.ui.tools.g(this);
        this.f209973s = new com.tencent.mm.ui.tools.h(this);
        this.f209974t = new com.tencent.mm.ui.tools.i(this);
        h();
    }
}
