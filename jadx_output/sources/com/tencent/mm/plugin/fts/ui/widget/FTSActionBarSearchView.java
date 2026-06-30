package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public class FTSActionBarSearchView extends com.tencent.mm.ui.tools.ActionBarSearchView {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f138219x = 0;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f138220v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f138221w;

    public FTSActionBarSearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138221w = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rfy);
        getEditText().setSizeChangeListener(new com.tencent.mm.plugin.fts.ui.widget.c0(this));
    }

    @Override // com.tencent.mm.ui.tools.ActionBarSearchView
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bce;
    }

    @Override // com.tencent.mm.ui.tools.ActionBarSearchView
    public void i(boolean z17) {
        android.widget.LinearLayout linearLayout = this.f138221w;
        if (linearLayout == null || getEditText() == null) {
            return;
        }
        if (z17) {
            linearLayout.setVisibility(8);
            com.tencent.mm.ui.widget.imageview.WeImageButton statusBtn = getStatusBtn();
            if (statusBtn != null) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) statusBtn.getLayoutParams();
                marginLayoutParams.leftMargin = i65.a.b(getContext(), 4);
                statusBtn.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageButton statusBtn2 = getStatusBtn();
        getEditText().setEllipsize(null);
        android.text.Selection.setSelection(getEditText().getText(), 0);
        getEditText().clearFocus();
        n();
        if (statusBtn2 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) statusBtn2.getLayoutParams();
            marginLayoutParams2.leftMargin = 0;
            statusBtn2.setLayoutParams(marginLayoutParams2);
        }
    }

    @Override // com.tencent.mm.ui.tools.ActionBarSearchView
    public void j(com.tencent.mm.ui.tools.r rVar) {
        if (rVar == com.tencent.mm.ui.tools.r.VOICE_SEARCH) {
            z50.e.f470163a.b(vu4.a.D, vu4.b.f440258e, z13.f.Y6(getContext()).a7(), z13.f.Y6(getContext()).f469401g);
        }
    }

    @Override // com.tencent.mm.ui.tools.ActionBarSearchView
    public void k(com.tencent.mm.ui.tools.r rVar) {
        if (rVar == com.tencent.mm.ui.tools.r.VOICE_SEARCH) {
            z50.e.f470163a.b(vu4.a.f440239f, vu4.b.f440258e, z13.f.Y6(getContext()).a7(), z13.f.Y6(getContext()).f469401g);
        }
    }

    public final void n() {
        android.widget.LinearLayout linearLayout = this.f138221w;
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText editText = getEditText();
        if (linearLayout == null || editText == null || editText.isFocused()) {
            return;
        }
        if (editText.getPaint().measureText(editText.getText().toString()) > ((float) (editText.getWidth() - i65.a.b(getContext(), 4)))) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public void setCursorVisible(boolean z17) {
        this.f209962e.setCursorVisible(z17);
    }

    public FTSActionBarSearchView(android.content.Context context) {
        super(context);
        this.f138221w = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rfy);
        getEditText().setSizeChangeListener(new com.tencent.mm.plugin.fts.ui.widget.c0(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mec);
        this.f138220v = findViewById;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.fts.ui.widget.b0(this));
    }
}
