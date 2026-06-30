package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentFooter;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/ui/tools/c5;", "Lcom/tencent/mm/plugin/mv/ui/view/f1;", "imp", "Ljz5/f0;", "setOnCommentSendImp", "", "visibility", "setVisibility", "getTrueHeight", dm.i4.COL_ID, "setEditViewBackground", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MusicMvCommentFooter extends android.widget.LinearLayout implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f151647d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f151648e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f151649f;

    /* renamed from: g, reason: collision with root package name */
    public int f151650g;

    /* renamed from: h, reason: collision with root package name */
    public int f151651h;

    /* renamed from: i, reason: collision with root package name */
    public int f151652i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f151653m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.f1 f151654n;

    /* renamed from: o, reason: collision with root package name */
    public int f151655o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f151656p;

    public MusicMvCommentFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f151650g = 200;
        this.f151651h = 200;
        this.f151652i = -1;
        b();
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", "hideSmileyPanel");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f151648e;
        if (weImageView != null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f151648e;
        if (weImageView2 != null) {
            weImageView2.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f151649f;
        if (chatFooterPanel == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel.animate().cancel();
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f151649f;
        if (chatFooterPanel2 == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        if (chatFooterPanel2.getVisibility() == 0) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel3 = this.f151649f;
            if (chatFooterPanel3 == null) {
                kotlin.jvm.internal.o.o("smileyPanel");
                throw null;
            }
            chatFooterPanel3.h();
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel4 = this.f151649f;
            if (chatFooterPanel4 != null) {
                chatFooterPanel4.animate().alpha(0.0f).setDuration(175L).withEndAction(new com.tencent.mm.plugin.mv.ui.view.g1(this)).start();
            } else {
                kotlin.jvm.internal.o.o("smileyPanel");
                throw null;
            }
        }
    }

    public final void b() {
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        android.os.Bundle inputExtras;
        com.tencent.mm.ui.widget.MMEditText mMEditText2;
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.c4p, this);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.c7o);
        this.f151648e = weImageView;
        if (weImageView != null) {
            weImageView.setOnClickListener(new com.tencent.mm.plugin.mv.ui.view.i1(this));
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.c6q);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMEditText");
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = (com.tencent.mm.ui.widget.MMEditText) findViewById;
        this.f151647d = mMEditText3;
        mMEditText3.setEnableSendBtn(true);
        if (com.tencent.mm.ui.bk.w() && (mMEditText2 = this.f151647d) != null) {
            mMEditText2.setImeOptions(268435456);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText4 = this.f151647d;
        if (mMEditText4 != null) {
            mMEditText4.setImeOptions(4);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText5 = this.f151647d;
        if (mMEditText5 != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(mMEditText5.getInputType() & (-65));
            kotlin.jvm.internal.o.d(valueOf);
            mMEditText5.setInputType(valueOf.intValue());
        }
        ck5.f b17 = ck5.f.b(this.f151647d);
        b17.f42561f = 0;
        b17.f42560e = 80;
        b17.d(null);
        com.tencent.mm.ui.widget.MMEditText mMEditText6 = this.f151647d;
        if (mMEditText6 != null && (inputExtras = mMEditText6.getInputExtras(true)) != null) {
            inputExtras.putBoolean("IS_CHAT_EDITOR", true);
        }
        if (android.os.Build.VERSION.SDK_INT == 28 && (mMEditText = this.f151647d) != null) {
            mMEditText.setBreakStrategy(1);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText7 = this.f151647d;
        if (mMEditText7 != null) {
            mMEditText7.setOnEditorActionListener(new com.tencent.mm.plugin.mv.ui.view.h1(this));
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7o);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        this.f151649f = wi6;
        wi6.setEntranceScene(0);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f151649f;
        if (chatFooterPanel == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel.setSearchSource(4);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f151649f;
        if (chatFooterPanel2 == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel2.setBackgroundResource(com.tencent.mm.R.drawable.f481144lt);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel3 = this.f151649f;
        if (chatFooterPanel3 == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel3.c();
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel4 = this.f151649f;
        if (chatFooterPanel4 == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel4.setShowSend(true);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel5 = this.f151649f;
        if (chatFooterPanel5 == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel5.setVisibility(4);
        int a17 = com.tencent.mm.sdk.platformtools.d2.a(getContext());
        this.f151652i = a17;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel6 = this.f151649f;
        if (chatFooterPanel6 == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        linearLayout.addView(chatFooterPanel6, -1, a17);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel7 = this.f151649f;
        if (chatFooterPanel7 != null) {
            chatFooterPanel7.setOnTextOperationListener(new com.tencent.mm.plugin.mv.ui.view.j1(this));
        } else {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
    }

    public final int getTrueHeight() {
        return this.f151652i + i65.a.b(getContext(), 48);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", "onWindowFocusChanged: " + z17);
        this.f151653m = z17;
        if (getVisibility() == 0 && z17 && this.f151650g == 201) {
            post(new com.tencent.mm.plugin.mv.ui.view.k1(this));
        }
    }

    public final void setEditViewBackground(int i17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f151647d;
        if (mMEditText == null) {
            return;
        }
        mMEditText.setBackground(getContext().getDrawable(i17));
    }

    public final void setOnCommentSendImp(com.tencent.mm.plugin.mv.ui.view.f1 imp) {
        kotlin.jvm.internal.o.g(imp, "imp");
        this.f151654n = imp;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.ui.tools.f5 f5Var;
        super.setVisibility(i17);
        this.f151650g = 200;
        boolean z17 = i17 == 0;
        com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", "setVisibility, cutEditMode:" + this.f151650g + ", isShow:" + z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showState ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", sb6.toString());
        if (!z17) {
            com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", "allGone");
            this.f151651h = 200;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).hideVKB();
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f151649f;
            if (chatFooterPanel == null) {
                kotlin.jvm.internal.o.o("smileyPanel");
                throw null;
            }
            chatFooterPanel.setAlpha(0.0f);
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f151649f;
            if (chatFooterPanel2 == null) {
                kotlin.jvm.internal.o.o("smileyPanel");
                throw null;
            }
            chatFooterPanel2.setVisibility(4);
        }
        if (!z17) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            dv2.f2 f2Var = (dv2.f2) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(dv2.f2.class);
            java.util.ArrayList arrayList = f2Var.f243853e;
            kotlin.jvm.internal.m0.a(arrayList).remove(this);
            if (!arrayList.isEmpty() || (f5Var = f2Var.f243852d) == null) {
                return;
            }
            f5Var.d();
            return;
        }
        this.f151656p = false;
        this.f151653m = true;
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dv2.f2 f2Var2 = (dv2.f2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(dv2.f2.class);
        f2Var2.f243853e.add(this);
        com.tencent.mm.ui.tools.f5 f5Var2 = f2Var2.f243852d;
        if (f5Var2 != null) {
            f5Var2.f();
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f151647d;
        if (mMEditText != null) {
            mMEditText.requestFocus();
        }
        com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", "onlyShowVKB");
        this.f151651h = 201;
        android.content.Context context4 = getContext();
        kotlin.jvm.internal.o.e(context4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) context4).showVKB();
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", "onKeyboardHeightChanged: " + i17);
        if (this.f151653m) {
            boolean z18 = i17 > 0;
            if (this.f151656p == z18) {
                return;
            }
            if (this.f151655o == 0) {
                this.f151655o = i17;
            }
            if (this.f151652i != i17 && i17 != 0) {
                this.f151652i = i17;
                com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", "refreshBottomPanelHeight, " + this.f151652i);
                if (this.f151652i > 0) {
                    fp.w.m(getContext(), this.f151652i);
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, this.f151652i);
                    com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f151649f;
                    if (chatFooterPanel == null) {
                        kotlin.jvm.internal.o.o("smileyPanel");
                        throw null;
                    }
                    chatFooterPanel.setLayoutParams(layoutParams);
                }
            }
            if (z18) {
                this.f151650g = 201;
                a();
            } else {
                int i18 = this.f151651h;
                if (i18 == 200) {
                    com.tencent.mm.plugin.mv.ui.view.f1 f1Var = this.f151654n;
                    if (f1Var != null) {
                        ((com.tencent.mm.plugin.mv.ui.uic.g0) f1Var).a(null, null);
                    }
                    this.f151650g = 200;
                    a();
                } else if (i18 == 202) {
                    this.f151650g = 202;
                    com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", hc1.i.NAME);
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f151648e;
                    if (weImageView != null) {
                        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_keyboard);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f151648e;
                    if (weImageView2 != null) {
                        weImageView2.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
                    }
                    com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f151649f;
                    if (chatFooterPanel2 == null) {
                        kotlin.jvm.internal.o.o("smileyPanel");
                        throw null;
                    }
                    chatFooterPanel2.setVisibility(0);
                    com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel3 = this.f151649f;
                    if (chatFooterPanel3 == null) {
                        kotlin.jvm.internal.o.o("smileyPanel");
                        throw null;
                    }
                    chatFooterPanel3.i();
                    com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel4 = this.f151649f;
                    if (chatFooterPanel4 == null) {
                        kotlin.jvm.internal.o.o("smileyPanel");
                        throw null;
                    }
                    chatFooterPanel4.animate().cancel();
                    com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel5 = this.f151649f;
                    if (chatFooterPanel5 == null) {
                        kotlin.jvm.internal.o.o("smileyPanel");
                        throw null;
                    }
                    chatFooterPanel5.animate().alpha(1.0f).setDuration(175L).start();
                }
                this.f151651h = 200;
            }
            this.f151651h = 200;
            this.f151656p = z18;
        }
    }

    public MusicMvCommentFooter(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f151650g = 200;
        this.f151651h = 200;
        this.f151652i = -1;
        b();
    }
}
