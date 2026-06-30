package com.tencent.mm.ui.search;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109B%\b\u0016\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u0010:\u001a\u00020\u0003¢\u0006\u0004\b8\u0010;J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006<"}, d2 = {"Lcom/tencent/mm/ui/search/WeAppWebSearchView;", "Landroid/widget/LinearLayout;", "Ltj5/z;", "", "visible", "Ljz5/f0;", "setCancelBtnVisible", "Ltj5/y;", "searchViewListener", "setSearchViewListener", "setVisible", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "getFtsEditText", "Landroid/widget/TextView;", "getCancelBtn", "d", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "getMFtsEditText", "()Lcom/tencent/mm/ui/search/FTSEditTextView;", "setMFtsEditText", "(Lcom/tencent/mm/ui/search/FTSEditTextView;)V", "mFtsEditText", "Landroid/view/View;", "e", "Landroid/view/View;", "getBackBtn", "()Landroid/view/View;", "setBackBtn", "(Landroid/view/View;)V", "backBtn", "f", "Landroid/widget/TextView;", "getMCancelBtn", "()Landroid/widget/TextView;", "setMCancelBtn", "(Landroid/widget/TextView;)V", "mCancelBtn", "g", "Landroid/widget/LinearLayout;", "getSearchContainer", "()Landroid/widget/LinearLayout;", "setSearchContainer", "(Landroid/widget/LinearLayout;)V", "searchContainer", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "h", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getSearchIcon", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "setSearchIcon", "(Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "searchIcon", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WeAppWebSearchView extends android.widget.LinearLayout implements tj5.z {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.ui.search.FTSEditTextView mFtsEditText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.view.View backBtn;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView mCancelBtn;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.widget.LinearLayout searchContainer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.ui.widget.imageview.WeImageView searchIcon;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f209850i;

    /* renamed from: m, reason: collision with root package name */
    public tj5.y f209851m;

    public WeAppWebSearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        java.lang.Object systemService = getContext().getSystemService("layout_inflater");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) systemService;
        boolean z17 = this.f209850i;
        layoutInflater.inflate(z17 ? com.tencent.mm.R.layout.bbq : com.tencent.mm.R.layout.bbp, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mdr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setSearchContainer((android.widget.LinearLayout) findViewById);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.b5i);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setMCancelBtn((android.widget.TextView) findViewById2);
        getMCancelBtn().setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        getMCancelBtn().setOnClickListener(new tj5.a0(this));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.gfl);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setMFtsEditText((com.tencent.mm.ui.search.FTSEditTextView) findViewById3);
        getFtsEditText().g();
        if (z17) {
            getFtsEditText().getTagPanel().setBackground(null);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485067qt2);
            if (linearLayout != null) {
                linearLayout.setBackground(null);
            }
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f485068qt3);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            ((android.widget.RelativeLayout) findViewById4).setBackground(null);
        }
        getMFtsEditText().setSearchIconGone(8);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.meb);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        setSearchIcon((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById5);
        getSearchIcon().setVisibility(0);
        getSearchIcon().setOnClickListener(new tj5.b0(this));
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

    public final com.tencent.mm.ui.search.FTSEditTextView getMFtsEditText() {
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.mFtsEditText;
        if (fTSEditTextView != null) {
            return fTSEditTextView;
        }
        kotlin.jvm.internal.o.o("mFtsEditText");
        throw null;
    }

    public final android.widget.LinearLayout getSearchContainer() {
        android.widget.LinearLayout linearLayout = this.searchContainer;
        if (linearLayout != null) {
            return linearLayout;
        }
        kotlin.jvm.internal.o.o("searchContainer");
        throw null;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView getSearchIcon() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.searchIcon;
        if (weImageView != null) {
            return weImageView;
        }
        kotlin.jvm.internal.o.o("searchIcon");
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

    public final void setMFtsEditText(com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView) {
        kotlin.jvm.internal.o.g(fTSEditTextView, "<set-?>");
        this.mFtsEditText = fTSEditTextView;
    }

    public final void setSearchContainer(android.widget.LinearLayout linearLayout) {
        kotlin.jvm.internal.o.g(linearLayout, "<set-?>");
        this.searchContainer = linearLayout;
    }

    public final void setSearchIcon(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        kotlin.jvm.internal.o.g(weImageView, "<set-?>");
        this.searchIcon = weImageView;
    }

    @Override // tj5.z
    public void setSearchViewListener(tj5.y searchViewListener) {
        kotlin.jvm.internal.o.g(searchViewListener, "searchViewListener");
        this.f209851m = searchViewListener;
    }

    @Override // tj5.z
    public void setVisible(int i17) {
        setVisibility(i17);
    }

    public WeAppWebSearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }

    public WeAppWebSearchView(android.content.Context context, boolean z17) {
        super(context);
        this.f209850i = z17;
        a();
    }
}
