package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fB\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR6\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryMsgInputView;", "Lcom/tencent/mm/ui/widget/InputPanelFrameLayout;", "", "visible", "Ljz5/f0;", "setKeyboardVisibility", "", "getContent", "", "p", "I", "getInputType", "()I", "setInputType", "(I)V", "inputType", "Lkotlin/Function2;", "", org.chromium.base.BaseSwitches.V, "Lyz5/p;", "getCommentInputCallback", "()Lyz5/p;", "setCommentInputCallback", "(Lyz5/p;)V", "commentInputCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StoryMsgInputView extends com.tencent.mm.ui.widget.InputPanelFrameLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f171984x = 0;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f171985f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMEditText f171986g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f171987h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f171988i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f171989m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f171990n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.ChatFooterPanel f171991o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int inputType;

    /* renamed from: q, reason: collision with root package name */
    public boolean f171993q;

    /* renamed from: r, reason: collision with root package name */
    public int f171994r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f171995s;

    /* renamed from: t, reason: collision with root package name */
    public final int f171996t;

    /* renamed from: u, reason: collision with root package name */
    public final int f171997u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public yz5.p commentInputCallback;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f171999w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryMsgInputView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.inputType = -1;
        android.view.View.inflate(context, com.tencent.mm.R.layout.cwz, this);
        setClickable(true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nko);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f171985f = frameLayout;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.nkq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById2;
        this.f171986g = mMEditText;
        mMEditText.setEnableSendBtn(true);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nkn);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        this.f171987h = imageView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.nkv);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f171988i = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.nku);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.nkx);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f171989m = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.nkt);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f171990n = findViewById7;
        this.f171996t = getResources().getColor(com.tencent.mm.R.color.f479528a80);
        this.f171997u = getResources().getColor(com.tencent.mm.R.color.f478532ac);
        com.tencent.mm.api.SmileyPanel c17 = qk.w9.c(context, true);
        this.f171991o = c17;
        this.f171994r = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        frameLayout.addView(c17, new android.widget.FrameLayout.LayoutParams(-1, this.f171994r));
        c17.setPortHeightPx(this.f171994r);
        int i18 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        c17.setEntranceScene(0);
        c17.setSearchSource(6);
        c17.c();
        c17.setVisibility(0);
        c17.setShowSend(true);
        c17.i();
        c17.setOnTextOperationListener(new rf4.l1(this));
        mMEditText.addTextChangedListener(new rf4.h1(this));
        findViewById6.setOnClickListener(new rf4.i1(this, context));
        imageView.setOnClickListener(new rf4.j1(this, context));
        mMEditText.setOnEditorActionListener(new rf4.k1(this));
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_sticker, -1));
        this.f171995s = false;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        this.f171999w = new rf4.m1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setKeyboardVisibility(boolean z17) {
        java.lang.Runnable runnable = this.f171999w;
        if (z17) {
            post(runnable);
            return;
        }
        removeCallbacks(runnable);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    @Override // com.tencent.mm.ui.widget.InputPanelFrameLayout, al5.e0
    public void J2(boolean z17, int i17) {
        super.J2(z17, i17);
        this.f171993q = z17;
        android.widget.FrameLayout frameLayout = this.f171985f;
        if (z17) {
            this.inputType = 2;
            frameLayout.setVisibility(4);
        } else if (this.inputType == 0) {
            frameLayout.setVisibility(0);
        } else {
            frameLayout.setVisibility(8);
            this.inputType = -1;
        }
        if (this.f171994r == i17 || i17 == 0) {
            return;
        }
        this.f171994r = i17;
        fp.w.m(getContext(), i17);
        int g17 = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f171991o;
        chatFooterPanel.setPortHeightPx(g17);
        android.view.ViewGroup.LayoutParams layoutParams = chatFooterPanel.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = g17;
        }
    }

    public final void b() {
        int i17 = this.inputType;
        if (i17 == 0) {
            this.f171985f.setVisibility(8);
        } else if (i17 == 2) {
            c();
        }
        this.inputType = -1;
    }

    public final void c() {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public final void d(java.lang.CharSequence charSequence, java.lang.String toUser, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f171986g;
        float textSize = mMEditText.getTextSize();
        ((ke0.e) xVar).getClass();
        mMEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, charSequence, textSize));
        if (charSequence != null) {
            mMEditText.setSelection(charSequence.length());
        }
        if (z17) {
            kotlin.jvm.internal.o.f(getResources().getString(com.tencent.mm.R.string.jn_), "getString(...)");
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(toUser, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(getResources().getString(com.tencent.mm.R.string.jn9));
            sb6.append(' ');
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = mMEditText.getContext();
            java.lang.String g27 = n17 != null ? n17.g2() : null;
            if (g27 == null) {
                g27 = "";
            }
            float textSize2 = mMEditText.getTextSize();
            ((ke0.e) xVar2).getClass();
            sb6.append((java.lang.Object) com.tencent.mm.pluginsdk.ui.span.c0.j(context2, g27, textSize2));
            str = sb6.toString();
        } else {
            kotlin.jvm.internal.o.f(getResources().getString(com.tencent.mm.R.string.jlr), "getString(...)");
            java.lang.String string = getResources().getString(com.tencent.mm.R.string.jlr);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            str = string;
        }
        mMEditText.setHint(str);
    }

    public final void e(int i17, boolean z17) {
        if (z17 && i17 == 0) {
            this.f171986g.requestFocus();
            this.inputType = 2;
            this.f171987h.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_sticker, -1));
            this.f171985f.setVisibility(4);
            setKeyboardVisibility(true);
        }
        setVisibility(i17);
        if (z17) {
            return;
        }
        clearFocus();
    }

    public final yz5.p getCommentInputCallback() {
        return this.commentInputCallback;
    }

    public final java.lang.CharSequence getContent() {
        android.text.Editable text = this.f171986g.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final int getInputType() {
        return this.inputType;
    }

    public final void setCommentInputCallback(yz5.p pVar) {
        this.commentInputCallback = pVar;
    }

    public final void setInputType(int i17) {
        this.inputType = i17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryMsgInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
