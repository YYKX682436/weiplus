package com.tencent.mm.ui.chatting.history.chromes;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010!\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b \u0010\u001c¨\u0006*"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/chromes/MsgHistoryGallerySearchBarView;", "Lcom/tencent/mm/ui/immersive/ImmersiveBaseChromeView;", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "Ljz5/f0;", "setSearchText", "Leh5/a;", "g", "Leh5/a;", "getImmersiveType", "()Leh5/a;", "immersiveType", "Lkotlin/Function1;", "h", "Lyz5/l;", "getOnSearchTextChangedListener", "()Lyz5/l;", "setOnSearchTextChangedListener", "(Lyz5/l;)V", "onSearchTextChangedListener", "", "i", "getOnSearchFocusChangedListener", "setOnSearchFocusChangedListener", "onSearchFocusChangedListener", "", "value", "getSearchHint", "()Ljava/lang/CharSequence;", "setSearchHint", "(Ljava/lang/CharSequence;)V", "searchHint", "getSearchText", "searchText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MsgHistoryGallerySearchBarView extends com.tencent.mm.ui.immersive.ImmersiveBaseChromeView {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f201731n = 0;

    /* renamed from: f, reason: collision with root package name */
    public em.d2 f201732f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final eh5.a immersiveType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.l onSearchTextChangedListener;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.l onSearchFocusChangedListener;

    /* renamed from: m, reason: collision with root package name */
    public final vc5.r f201736m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGallerySearchBarView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static /* synthetic */ void e(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView msgHistoryGallerySearchBarView, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            em.d2 d2Var = msgHistoryGallerySearchBarView.f201732f;
            if (d2Var == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            z17 = d2Var.d().hasFocus();
        }
        if ((i17 & 2) != 0) {
            em.d2 d2Var2 = msgHistoryGallerySearchBarView.f201732f;
            if (d2Var2 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            android.text.Editable text = d2Var2.d().getText();
            z18 = !(text == null || text.length() == 0);
        }
        if ((i17 & 4) != 0) {
            z19 = true;
        }
        msgHistoryGallerySearchBarView.d(z17, z18, z19);
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseChromeView
    public android.view.View a() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ekp, (android.view.ViewGroup) this, false);
        em.d2 d2Var = new em.d2(inflate);
        this.f201732f = d2Var;
        d2Var.d().setMaxLines(1);
        d2Var.d().setSingleLine(true);
        d2Var.d().setHorizontallyScrolling(true);
        d2Var.d().setInputType(1);
        d2Var.d().setImeOptions(3);
        d2Var.d().setOnEditorActionListener(new vc5.m(d2Var, this));
        d2Var.a().setOnClickListener(new vc5.n(this));
        d2Var.d().setOnFocusChangeListener(new vc5.o(this));
        d2Var.d().addTextChangedListener(this.f201736m);
        d2Var.c().setOnClickListener(new vc5.p(d2Var, this));
        d2Var.b().setOnClickListener(new vc5.q(d2Var, this));
        android.text.Editable text = d2Var.d().getText();
        d(false, !(text == null || text.length() == 0), false);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    public final void b() {
        java.lang.Object systemService = getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        em.d2 d2Var = this.f201732f;
        if (d2Var != null) {
            inputMethodManager.hideSoftInputFromWindow(d2Var.d().getWindowToken(), 0);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }

    public final void c() {
        em.d2 d2Var = this.f201732f;
        if (d2Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        d2Var.d().requestFocus();
        java.lang.Object systemService = getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        em.d2 d2Var2 = this.f201732f;
        if (d2Var2 != null) {
            inputMethodManager.showSoftInput(d2Var2.d(), 1);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.d(boolean, boolean, boolean):void");
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseChromeView
    public eh5.a getImmersiveType() {
        return this.immersiveType;
    }

    public final yz5.l getOnSearchFocusChangedListener() {
        return this.onSearchFocusChangedListener;
    }

    public final yz5.l getOnSearchTextChangedListener() {
        return this.onSearchTextChangedListener;
    }

    public final java.lang.CharSequence getSearchHint() {
        em.d2 d2Var = this.f201732f;
        if (d2Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        java.lang.CharSequence hint = d2Var.d().getHint();
        kotlin.jvm.internal.o.f(hint, "getHint(...)");
        return hint;
    }

    public final java.lang.CharSequence getSearchText() {
        em.d2 d2Var = this.f201732f;
        if (d2Var == null) {
            return null;
        }
        if (d2Var != null) {
            return d2Var.d().getText();
        }
        kotlin.jvm.internal.o.o("binding");
        throw null;
    }

    public final void setOnSearchFocusChangedListener(yz5.l lVar) {
        this.onSearchFocusChangedListener = lVar;
    }

    public final void setOnSearchTextChangedListener(yz5.l lVar) {
        this.onSearchTextChangedListener = lVar;
    }

    public final void setSearchHint(java.lang.CharSequence value) {
        kotlin.jvm.internal.o.g(value, "value");
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.b(this)) {
            addOnAttachStateChangeListener(new vc5.s(this, this, value));
            return;
        }
        em.d2 d2Var = this.f201732f;
        if (d2Var != null) {
            d2Var.d().setHint(value);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }

    public final void setSearchText(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        em.d2 d2Var = this.f201732f;
        if (d2Var == null) {
            return;
        }
        if (d2Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        d2Var.d().setText(text);
        em.d2 d2Var2 = this.f201732f;
        if (d2Var2 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        d2Var2.d().setSelection(text.length());
        c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGallerySearchBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public /* synthetic */ MsgHistoryGallerySearchBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGallerySearchBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.immersiveType = eh5.a.f252951d;
        this.f201736m = new vc5.r(this);
    }
}
