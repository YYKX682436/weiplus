package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\u000b\u001a\u00020\u00042\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCommentPostRealNamePanel;", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "tv", "Ljz5/f0;", "setLicenseText", "Lkotlin/Function3;", "Landroid/content/Context;", "Landroid/content/Intent;", "", "callback", "setWebviewForwardCallback", "", "height", "setDialogHeight", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveCommentPostRealNamePanel extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public yz5.q f115825d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f115826e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f115827f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f115828g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f115829h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveCommentPostRealNamePanel(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f115829h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel$realnameNotifyListener$1
            {
                this.__eventId = 323604482;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
                boolean z17;
                com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent event = walletRealNameResultNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                dead();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realnameNotifyListener ");
                am.a20 a20Var = event.f54973g;
                sb6.append(a20Var.f6120a);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveCommentPostRealNamePanel", sb6.toString());
                if (a20Var.f6120a == -1) {
                    com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel = com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel.this;
                    yz5.l lVar = finderLiveCommentPostRealNamePanel.f115826e;
                    if (lVar != null) {
                        lVar.invoke(java.lang.Boolean.TRUE);
                    }
                    com.tencent.mm.ui.widget.dialog.z2 z2Var = finderLiveCommentPostRealNamePanel.f115827f;
                    if (z2Var == null) {
                        kotlin.jvm.internal.o.o("bottomDialog");
                        throw null;
                    }
                    z2Var.B();
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f327363g);
                } else {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f327364h);
                }
                return false;
            }
        };
        a(context);
    }

    private final void setLicenseText(android.widget.TextView textView) {
        java.lang.String string = textView.getContext().getResources().getString(com.tencent.mm.R.string.d4l);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = textView.getContext().getResources().getString(com.tencent.mm.R.string.dab, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        kotlin.jvm.internal.o.f(format, "format(...)");
        int L = r26.n0.L(format, string, 0, false, 6, null);
        int length = string.length() + L;
        android.text.SpannableString spannableString = new android.text.SpannableString(format);
        spannableString.setSpan(new com.tencent.mm.plugin.finder.live.view.p3(this), L, length, 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.ape, this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f485538i11);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.CheckBox) findViewById).setOnCheckedChangeListener(new com.tencent.mm.plugin.finder.live.view.n3(this));
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f485539i12);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setLicenseText((android.widget.TextView) findViewById2);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 1);
        this.f115827f = z2Var;
        z2Var.y(context.getResources().getString(com.tencent.mm.R.string.gcs));
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = this.f115827f;
        if (z2Var2 == null) {
            kotlin.jvm.internal.o.o("bottomDialog");
            throw null;
        }
        z2Var2.F = new com.tencent.mm.plugin.finder.live.view.o3(this, context);
        z2Var2.x(1);
        com.tencent.mm.ui.widget.dialog.z2 z2Var3 = this.f115827f;
        if (z2Var3 != null) {
            z2Var3.j(this);
        } else {
            kotlin.jvm.internal.o.o("bottomDialog");
            throw null;
        }
    }

    public final void setDialogHeight(double d17) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f115827f;
        if (z2Var != null) {
            z2Var.u((int) d17);
        } else {
            kotlin.jvm.internal.o.o("bottomDialog");
            throw null;
        }
    }

    public final void setWebviewForwardCallback(yz5.q callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f115825d = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveCommentPostRealNamePanel(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f115829h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel$realnameNotifyListener$1
            {
                this.__eventId = 323604482;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
                boolean z17;
                com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent event = walletRealNameResultNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                dead();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realnameNotifyListener ");
                am.a20 a20Var = event.f54973g;
                sb6.append(a20Var.f6120a);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveCommentPostRealNamePanel", sb6.toString());
                if (a20Var.f6120a == -1) {
                    com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel = com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel.this;
                    yz5.l lVar = finderLiveCommentPostRealNamePanel.f115826e;
                    if (lVar != null) {
                        lVar.invoke(java.lang.Boolean.TRUE);
                    }
                    com.tencent.mm.ui.widget.dialog.z2 z2Var = finderLiveCommentPostRealNamePanel.f115827f;
                    if (z2Var == null) {
                        kotlin.jvm.internal.o.o("bottomDialog");
                        throw null;
                    }
                    z2Var.B();
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f327363g);
                } else {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f327364h);
                }
                return false;
            }
        };
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveCommentPostRealNamePanel(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f115829h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel$realnameNotifyListener$1
            {
                this.__eventId = 323604482;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
                boolean z17;
                com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent event = walletRealNameResultNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                dead();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realnameNotifyListener ");
                am.a20 a20Var = event.f54973g;
                sb6.append(a20Var.f6120a);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveCommentPostRealNamePanel", sb6.toString());
                if (a20Var.f6120a == -1) {
                    com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel = com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel.this;
                    yz5.l lVar = finderLiveCommentPostRealNamePanel.f115826e;
                    if (lVar != null) {
                        lVar.invoke(java.lang.Boolean.TRUE);
                    }
                    com.tencent.mm.ui.widget.dialog.z2 z2Var = finderLiveCommentPostRealNamePanel.f115827f;
                    if (z2Var == null) {
                        kotlin.jvm.internal.o.o("bottomDialog");
                        throw null;
                    }
                    z2Var.B();
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f327363g);
                } else {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f327364h);
                }
                return false;
            }
        };
        a(context);
    }
}
