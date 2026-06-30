package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public abstract class ChatFooterPanel extends android.widget.LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f189765e = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.l0 f189766d;

    /* loaded from: classes5.dex */
    public static abstract class RecommendView extends android.widget.LinearLayout {
        public RecommendView(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public abstract void setProductID(java.lang.String str);

        public RecommendView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
            super(context, attributeSet, i17);
        }
    }

    public ChatFooterPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
    }

    public abstract void b();

    public abstract void c();

    public abstract void d(boolean z17);

    public abstract void e(boolean z17, boolean z18);

    public void f(boolean z17) {
    }

    public void g(int i17, boolean z17) {
    }

    public com.tencent.mm.pluginsdk.ui.h1 getPanelSlideIndicator() {
        return null;
    }

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public void k() {
    }

    public abstract void l();

    public void m() {
    }

    public abstract void n();

    public abstract void o(boolean z17, boolean z18);

    public abstract void p(boolean z17, boolean z18);

    public abstract void q(android.content.Context context, int i17, java.lang.Runnable runnable);

    public void setCallback(com.tencent.mm.pluginsdk.ui.chat.j6 j6Var) {
    }

    public abstract void setDefaultEmojiByDetail(java.lang.String str);

    public abstract void setEmojiPanelBackground(int i17);

    public abstract void setEntranceScene(int i17);

    public abstract void setExpandedForReport(boolean z17);

    public abstract void setFinishButtonTitle(java.lang.String str);

    public void setFooterType(int i17) {
    }

    public abstract void setHBScene(int i17);

    public abstract void setHideSearchJumpMoreEntrance(boolean z17);

    public abstract void setInitSelectTab(java.lang.String str);

    public void setOnEmojiSelectTabChangeListener(com.tencent.mm.pluginsdk.ui.j0 j0Var) {
    }

    public void setOnTextOperationListener(com.tencent.mm.pluginsdk.ui.k0 k0Var) {
    }

    public void setPanelBackgroundColor(int i17) {
    }

    public void setPanelForeground(android.graphics.drawable.Drawable drawable) {
    }

    @java.lang.Deprecated
    public abstract void setPortHeightPx(int i17);

    public abstract void setSearchDialogForceDarkMode(boolean z17);

    public abstract void setSearchIncludeCustom(boolean z17);

    public abstract void setSearchSource(int i17);

    public abstract void setSendButtonEnable(boolean z17);

    public abstract void setShowClose(boolean z17);

    public void setShowGame(boolean z17) {
    }

    public abstract void setShowSearch(boolean z17);

    public abstract void setShowSend(boolean z17);

    public abstract void setShowSmiley(boolean z17);

    public abstract void setShowStore(boolean z17);

    public void setSmileyPanelExpandable(boolean z17) {
    }

    public void setSmileyPanelExpandableOnSimpleMode(boolean z17) {
    }

    public void setTabBackgroundColor(int i17) {
    }

    public abstract void setTabBackgroundResource(int i17);

    public abstract void setTalkerName(java.lang.String str);

    public abstract void setToSendText(java.lang.String str);

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.pluginsdk.ui.l0 l0Var;
        int visibility = getVisibility();
        super.setVisibility(i17);
        if (visibility == i17 || (l0Var = this.f189766d) == null) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = ((com.tencent.mm.pluginsdk.ui.chat.s7) l0Var).f190646a;
        if (c8Var.n()) {
            c8Var.u();
        }
    }

    public void setVisibleChangeListener(com.tencent.mm.pluginsdk.ui.l0 l0Var) {
        this.f189766d = l0Var;
    }
}
