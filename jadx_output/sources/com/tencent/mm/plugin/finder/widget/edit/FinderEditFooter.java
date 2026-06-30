package com.tencent.mm.plugin.finder.widget.edit;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\t¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/widget/edit/FinderEditFooter;", "Lcom/tencent/mm/ui/widget/InputPanelLinearLayout;", "Lqy2/a;", "alignModeChangeListener", "Ljz5/f0;", "setAlignModeChangeListener", "Lcom/tencent/mm/pluginsdk/ui/k0;", "smileyTextListener", "setSmileyTextOperationListener", "", "getCurrentAlignMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderEditFooter extends com.tencent.mm.ui.widget.InputPanelLinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f136940p = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageButton f136941g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageButton f136942h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f136943i;

    /* renamed from: m, reason: collision with root package name */
    public int f136944m;

    /* renamed from: n, reason: collision with root package name */
    public qy2.a f136945n;

    /* renamed from: o, reason: collision with root package name */
    public int f136946o;

    public FinderEditFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f136944m = 101;
        this.f136946o = 201;
        f();
    }

    @Override // com.tencent.mm.ui.widget.InputPanelLinearLayout, al5.e0
    public void J2(boolean z17, int i17) {
        super.J2(z17, i17);
        if (!z17) {
            if (this.f136946o == 201) {
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f136943i;
                if (chatFooterPanel != null) {
                    chatFooterPanel.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("smileyPanel");
                    throw null;
                }
            }
            return;
        }
        this.f136946o = 201;
        android.widget.ImageButton imageButton = this.f136941g;
        if (imageButton == null) {
            kotlin.jvm.internal.o.o("emojiBtn");
            throw null;
        }
        imageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f136943i;
        if (chatFooterPanel2 != null) {
            chatFooterPanel2.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
    }

    public final void f() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.ag9, this);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7o);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.d_r);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById;
        this.f136941g = imageButton;
        imageButton.setOnClickListener(new qy2.b(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f482938sc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) findViewById2;
        this.f136942h = imageButton2;
        imageButton2.setOnClickListener(new qy2.c(this));
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        this.f136943i = wi6;
        wi6.setEntranceScene(0);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f136943i;
        if (chatFooterPanel == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel.setSearchSource(4);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f136943i;
        if (chatFooterPanel2 == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel2.setVisibility(8);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel3 = this.f136943i;
        if (chatFooterPanel3 == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel3.setBackgroundResource(com.tencent.mm.R.drawable.f481144lt);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel4 = this.f136943i;
        if (chatFooterPanel4 == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel4.c();
        int g17 = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel5 = this.f136943i;
        if (chatFooterPanel5 != null) {
            linearLayout.addView(chatFooterPanel5, -1, g17);
        } else {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
    }

    /* renamed from: getCurrentAlignMode, reason: from getter */
    public final int getF136944m() {
        return this.f136944m;
    }

    public final void setAlignModeChangeListener(qy2.a alignModeChangeListener) {
        kotlin.jvm.internal.o.g(alignModeChangeListener, "alignModeChangeListener");
        this.f136945n = alignModeChangeListener;
    }

    public final void setSmileyTextOperationListener(com.tencent.mm.pluginsdk.ui.k0 smileyTextListener) {
        kotlin.jvm.internal.o.g(smileyTextListener, "smileyTextListener");
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f136943i;
        if (chatFooterPanel != null) {
            chatFooterPanel.setOnTextOperationListener(smileyTextListener);
        } else {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
    }

    public FinderEditFooter(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f136944m = 101;
        this.f136946o = 201;
        f();
    }
}
