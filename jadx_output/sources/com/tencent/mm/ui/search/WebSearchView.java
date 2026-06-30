package com.tencent.mm.ui.search;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100B%\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\u0006\u00101\u001a\u00020\u0003¢\u0006\u0004\b/\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001e¨\u00063"}, d2 = {"Lcom/tencent/mm/ui/search/WebSearchView;", "Landroid/widget/LinearLayout;", "Ltj5/z;", "", "visibile", "Ljz5/f0;", "setCancelBtnVisible", "Ltj5/y;", "searchViewListener", "setSearchViewListener", "visible", "setVisible", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "getFtsEditText", "Landroid/widget/TextView;", "getCancelBtn", "Lcom/tencent/mm/ui/search/FTSSearchEditTextView;", "d", "Lcom/tencent/mm/ui/search/FTSSearchEditTextView;", "getMFtsEditText", "()Lcom/tencent/mm/ui/search/FTSSearchEditTextView;", "setMFtsEditText", "(Lcom/tencent/mm/ui/search/FTSSearchEditTextView;)V", "mFtsEditText", "Landroid/view/View;", "e", "Landroid/view/View;", "getBackBtn", "()Landroid/view/View;", "setBackBtn", "(Landroid/view/View;)V", "backBtn", "f", "Landroid/widget/TextView;", "getMCancelBtn", "()Landroid/widget/TextView;", "setMCancelBtn", "(Landroid/widget/TextView;)V", "mCancelBtn", "g", "getWebActionbarSearchviewContainer", "setWebActionbarSearchviewContainer", "webActionbarSearchviewContainer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WebSearchView extends android.widget.LinearLayout implements tj5.z {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.ui.search.FTSSearchEditTextView mFtsEditText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.view.View backBtn;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView mCancelBtn;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.view.View webActionbarSearchviewContainer;

    /* renamed from: h, reason: collision with root package name */
    public tj5.y f209856h;

    public WebSearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        java.lang.Object systemService = getContext().getSystemService("layout_inflater");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((android.view.LayoutInflater) systemService).inflate(com.tencent.mm.R.layout.d9i, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482323bc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setBackBtn(findViewById);
        com.tencent.mm.sdk.platformtools.t8.q(getBackBtn(), 200, 200, 200, 200);
        getBackBtn().setOnClickListener(new tj5.c0(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.b5i);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setMCancelBtn((android.widget.TextView) findViewById2);
        getMCancelBtn().setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        getMCancelBtn().setOnClickListener(new tj5.d0(this));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.phj);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setWebActionbarSearchviewContainer(findViewById3);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.gfl);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        setMFtsEditText((com.tencent.mm.ui.search.FTSSearchEditTextView) findViewById4);
        getMFtsEditText().g();
    }

    public final android.view.View getBackBtn() {
        android.view.View view = this.backBtn;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("backBtn");
        throw null;
    }

    @Override // tj5.z
    public android.widget.TextView getCancelBtn() {
        return getMCancelBtn();
    }

    @Override // tj5.z
    public com.tencent.mm.ui.search.FTSEditTextView getFtsEditText() {
        return getMFtsEditText();
    }

    public final android.widget.TextView getMCancelBtn() {
        android.widget.TextView textView = this.mCancelBtn;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("mCancelBtn");
        throw null;
    }

    public final com.tencent.mm.ui.search.FTSSearchEditTextView getMFtsEditText() {
        com.tencent.mm.ui.search.FTSSearchEditTextView fTSSearchEditTextView = this.mFtsEditText;
        if (fTSSearchEditTextView != null) {
            return fTSSearchEditTextView;
        }
        kotlin.jvm.internal.o.o("mFtsEditText");
        throw null;
    }

    public final android.view.View getWebActionbarSearchviewContainer() {
        android.view.View view = this.webActionbarSearchviewContainer;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("webActionbarSearchviewContainer");
        throw null;
    }

    public final void setBackBtn(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.backBtn = view;
    }

    @Override // tj5.z
    public void setCancelBtnVisible(int i17) {
        if (getMCancelBtn() != null) {
            getMCancelBtn().setVisibility(i17);
        }
    }

    public final void setMCancelBtn(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.mCancelBtn = textView;
    }

    public final void setMFtsEditText(com.tencent.mm.ui.search.FTSSearchEditTextView fTSSearchEditTextView) {
        kotlin.jvm.internal.o.g(fTSSearchEditTextView, "<set-?>");
        this.mFtsEditText = fTSSearchEditTextView;
    }

    @Override // tj5.z
    public void setSearchViewListener(tj5.y searchViewListener) {
        kotlin.jvm.internal.o.g(searchViewListener, "searchViewListener");
        this.f209856h = searchViewListener;
    }

    @Override // tj5.z
    public void setVisible(int i17) {
        setVisibility(i17);
    }

    public final void setWebActionbarSearchviewContainer(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.webActionbarSearchviewContainer = view;
    }

    public WebSearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
