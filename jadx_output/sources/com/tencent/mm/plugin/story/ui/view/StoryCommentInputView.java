package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bR6\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R6\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryCommentInputView;", "Lcom/tencent/mm/ui/widget/InputPanelFrameLayout;", "", "visible", "Ljz5/f0;", "setKeyboardVisibility", "", "getContent", "Lnf4/j;", "storyInfo", "setHostStory", "Lkotlin/Function2;", "", "z", "Lyz5/p;", "getCommentInputCallback", "()Lyz5/p;", "setCommentInputCallback", "(Lyz5/p;)V", "commentInputCallback", "Lgf4/a;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getCommentReplyCallback", "setCommentReplyCallback", "commentReplyCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StoryCommentInputView extends com.tencent.mm.ui.widget.InputPanelFrameLayout {

    /* renamed from: A, reason: from kotlin metadata */
    public yz5.p commentReplyCallback;
    public final java.lang.Runnable B;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f171936f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMEditText f171937g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f171938h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f171939i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f171940m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f171941n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f171942o;

    /* renamed from: p, reason: collision with root package name */
    public final pf4.q f171943p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f171944q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f171945r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.ChatFooterPanel f171946s;

    /* renamed from: t, reason: collision with root package name */
    public int f171947t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f171948u;

    /* renamed from: v, reason: collision with root package name */
    public int f171949v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f171950w;

    /* renamed from: x, reason: collision with root package name */
    public final int f171951x;

    /* renamed from: y, reason: collision with root package name */
    public final int f171952y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public yz5.p commentInputCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryCommentInputView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.cw_, this);
        setClickable(true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nko);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f171936f = frameLayout;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.nkq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById2;
        this.f171937g = mMEditText;
        mMEditText.setEnableSendBtn(true);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nkn);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        this.f171938h = imageView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.nkr);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.nky);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f171939i = textView;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.nkv);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f171940m = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.nku);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f171941n = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.nkw);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById8;
        this.f171942o = recyclerView;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.nkx);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f171944q = findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.nkt);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f171945r = findViewById10;
        pf4.q qVar = new pf4.q();
        this.f171943p = qVar;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        recyclerView.setAdapter(qVar);
        recyclerView.setVisibility(8);
        recyclerView.setFocusable(false);
        qVar.f353887g = new rf4.z(this);
        qVar.f353886f = new rf4.a0(this, context);
        this.f171951x = getResources().getColor(com.tencent.mm.R.color.f479528a80);
        this.f171952y = getResources().getColor(com.tencent.mm.R.color.f478532ac);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni((android.widget.ImageView) findViewById4, ef4.w.f252468t.e());
        com.tencent.mm.api.SmileyPanel c17 = qk.w9.c(context, true);
        this.f171946s = c17;
        this.f171949v = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        frameLayout.addView(c17, new android.widget.FrameLayout.LayoutParams(-1, this.f171949v));
        c17.setPortHeightPx(this.f171949v);
        int i18 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        c17.setEntranceScene(0);
        c17.setSearchSource(6);
        c17.c();
        c17.setVisibility(0);
        c17.setShowSend(true);
        c17.i();
        c17.setOnTextOperationListener(new rf4.g0(this));
        mMEditText.addTextChangedListener(new rf4.b0(this));
        findViewById9.setOnClickListener(new rf4.c0(this, context));
        imageView.setOnClickListener(new rf4.d0(this, context));
        mMEditText.setOnEditorActionListener(new rf4.e0(this));
        setOnClickListener(new rf4.f0(this));
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_sticker, -1));
        frameLayout.setVisibility(0);
        this.f171950w = false;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.Object l17 = gm0.j1.u().c().l(4, null);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, (java.lang.String) l17, textSize));
        this.f171947t = 2;
        this.B = new rf4.i0(this);
    }

    public static final void a(com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView) {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) storyCommentInputView.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(storyCommentInputView.getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setKeyboardVisibility(boolean z17) {
        java.lang.Runnable runnable = this.B;
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
        this.f171948u = z17;
        android.widget.FrameLayout frameLayout = this.f171936f;
        if (z17) {
            this.f171947t = 2;
            frameLayout.setVisibility(4);
        } else if (this.f171947t == 0) {
            frameLayout.setVisibility(0);
        } else {
            frameLayout.setVisibility(8);
            this.f171947t = -1;
        }
        if (this.f171949v == i17 || i17 == 0) {
            return;
        }
        this.f171949v = i17;
        fp.w.m(getContext(), i17);
        int g17 = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f171946s;
        chatFooterPanel.setPortHeightPx(g17);
        chatFooterPanel.b();
        android.view.ViewGroup.LayoutParams layoutParams = chatFooterPanel.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = g17;
        }
    }

    public final void c(java.lang.CharSequence charSequence, java.lang.String toUser, boolean z17) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.CharSequence j17;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f171937g;
        float textSize = mMEditText.getTextSize();
        ((ke0.e) xVar).getClass();
        mMEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, charSequence, textSize));
        if (charSequence != null) {
            mMEditText.setSelection(charSequence.length());
        }
        android.widget.TextView textView = this.f171939i;
        if (z17) {
            string = getResources().getString(com.tencent.mm.R.string.jn_);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            string2 = getResources().getString(com.tencent.mm.R.string.jn9);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(toUser, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(getResources().getString(com.tencent.mm.R.string.jn9));
            sb6.append(' ');
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = textView.getContext();
            java.lang.String g27 = n17 != null ? n17.g2() : null;
            if (g27 == null) {
                g27 = "";
            }
            float textSize2 = textView.getTextSize();
            ((ke0.e) xVar2).getClass();
            sb6.append((java.lang.Object) com.tencent.mm.pluginsdk.ui.span.c0.j(context2, g27, textSize2));
            j17 = sb6.toString();
        } else {
            string = getResources().getString(com.tencent.mm.R.string.jlr);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            string2 = getResources().getString(com.tencent.mm.R.string.jlq);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = getContext();
            java.lang.Object l17 = gm0.j1.u().c().l(4, null);
            kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.String");
            float textSize3 = textView.getTextSize();
            ((ke0.e) xVar3).getClass();
            j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context3, (java.lang.String) l17, textSize3);
        }
        mMEditText.setHint(string2);
        this.f171941n.setText(string);
        textView.setText(j17);
    }

    public final yz5.p getCommentInputCallback() {
        return this.commentInputCallback;
    }

    public final yz5.p getCommentReplyCallback() {
        return this.commentReplyCallback;
    }

    public final java.lang.CharSequence getContent() {
        android.text.Editable text = this.f171937g.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final void setCommentInputCallback(yz5.p pVar) {
        this.commentInputCallback = pVar;
    }

    public final void setCommentReplyCallback(yz5.p pVar) {
        this.commentReplyCallback = pVar;
    }

    public final void setHostStory(nf4.j jVar) {
        this.f171943p.f353885e = jVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryCommentInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
