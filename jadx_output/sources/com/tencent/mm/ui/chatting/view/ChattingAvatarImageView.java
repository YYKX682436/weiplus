package com.tencent.mm.ui.chatting.view;

/* loaded from: classes5.dex */
public class ChattingAvatarImageView extends com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f202819p = 0;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f202820m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f202821n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f202822o;

    public ChattingAvatarImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView
    public float getTipTextSize() {
        try {
            return ((android.widget.TextView) this.f152895i.getContentView().findViewById(com.tencent.mm.R.id.kpx)).getTextSize();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingAvatarImageView", th6, "getTipTextSize err", new java.lang.Object[0]);
            return 0.0f;
        }
    }

    @Override // com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView, mp3.m
    public void m(java.lang.CharSequence charSequence) {
        android.view.View contentView = this.f152895i.getContentView();
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.kpx);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, charSequence));
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.f486269qn1);
        com.tencent.mm.ui.bk.s0(textView2.getPaint());
        textView2.setOnClickListener(new com.tencent.mm.ui.chatting.view.e(this));
        postDelayed(this.f202822o, 200L);
    }

    @Override // com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView, com.tencent.mm.plugin.patmsg.ui.AvatarPatImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f202822o);
        this.f202820m.dead();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(com.tencent.mm.R.id.f486268qn0, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492683hg2)));
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        com.tencent.mm.sdk.event.IListener iListener = this.f202820m;
        if (iListener != null) {
            if (i17 == 8) {
                iListener.dead();
            } else if (i17 == 0) {
                iListener.alive();
            }
        }
    }

    @Override // com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView, android.view.View
    public void onWindowVisibilityChanged(int i17) {
        super.onWindowVisibilityChanged(i17);
        if (i17 == 8) {
            this.f152895i.dismiss();
            ((pp3.j) this.f152894h).a();
            ((pp3.j) this.f152894h).b();
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i17, android.os.Bundle bundle) {
        pp3.b bVar;
        if (i17 == com.tencent.mm.R.id.f486268qn0) {
            if (!(getDoubleClickListener() != null ? getDoubleClickListener().a(this) : false) && (bVar = this.f152894h) != null) {
                ((pp3.j) bVar).d();
            }
        }
        return super.performAccessibilityAction(i17, bundle);
    }

    public ChattingAvatarImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f202820m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PatTipNeedDismissEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.ui.chatting.view.ChattingAvatarImageView.1
            {
                this.__eventId = 447918382;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PatTipNeedDismissEvent patTipNeedDismissEvent) {
                int i18 = com.tencent.mm.ui.chatting.view.ChattingAvatarImageView.f202819p;
                com.tencent.mm.ui.chatting.view.ChattingAvatarImageView chattingAvatarImageView = com.tencent.mm.ui.chatting.view.ChattingAvatarImageView.this;
                chattingAvatarImageView.f152895i.dismiss();
                ((pp3.j) chattingAvatarImageView.f152894h).a();
                ((pp3.j) chattingAvatarImageView.f152894h).b();
                if (!patTipNeedDismissEvent.f54606g.f8594a) {
                    return false;
                }
                chattingAvatarImageView.f202820m.dead();
                return false;
            }
        };
        this.f202821n = false;
        this.f202822o = new com.tencent.mm.ui.chatting.view.d(this);
    }
}
