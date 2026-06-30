package com.tencent.mm.plugin.finder.view.emoji;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/finder/view/emoji/FinderEmojiPickView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/pluginsdk/ui/k0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnTextOperationListener", "", "visibility", "setVisibility", "", "getImeEmojiConfig", "", "m", "Z", "getCanShowEmoji", "()Z", "setCanShowEmoji", "(Z)V", "canShowEmoji", "n", "Ljava/lang/String;", "getPickEmojiStr", "()Ljava/lang/String;", "setPickEmojiStr", "(Ljava/lang/String;)V", "pickEmojiStr", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderEmojiPickView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.k0 f132039d;

    /* renamed from: e, reason: collision with root package name */
    public final lr.m0 f132040e;

    /* renamed from: f, reason: collision with root package name */
    public final ir.x0 f132041f;

    /* renamed from: g, reason: collision with root package name */
    public final lr.l0 f132042g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f132043h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f132044i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean canShowEmoji;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public java.lang.String pickEmojiStr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderEmojiPickView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        ix2.a aVar = new ix2.a();
        this.f132040e = aVar;
        ir.x0 x0Var = new ir.x0();
        this.f132041f = x0Var;
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        lr.p pVar = new lr.p(0, null, null, 6, null);
        this.f132042g = pVar;
        this.f132043h = new java.util.LinkedList();
        this.f132044i = "";
        this.pickEmojiStr = "";
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.agi, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lq9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPanelRecyclerView finderEmojiPanelRecyclerView = (com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPanelRecyclerView) findViewById;
        ix2.d dVar = new ix2.d();
        com.tencent.mm.plugin.finder.view.emoji.FinderEmojiLayoutManager finderEmojiLayoutManager = new com.tencent.mm.plugin.finder.view.emoji.FinderEmojiLayoutManager(getContext(), dVar.f320561b);
        finderEmojiPanelRecyclerView.setHasFixedSize(true);
        finderEmojiPanelRecyclerView.setAdapter(aVar);
        finderEmojiPanelRecyclerView.setSizeResolver(dVar);
        finderEmojiPanelRecyclerView.setPanelLifeCycle(x0Var);
        finderEmojiPanelRecyclerView.setLayoutManager(finderEmojiLayoutManager);
        finderEmojiPanelRecyclerView.setFocusable(false);
        finderEmojiPanelRecyclerView.setItemAnimator(null);
        aVar.f320620g = pVar;
        this.f132044i = getImeEmojiConfig();
        a();
    }

    public final void a() {
        java.util.LinkedList linkedList;
        setVisibility(8);
        java.lang.String str = this.f132044i;
        if (str.length() == 0) {
            return;
        }
        try {
            cl0.e jSONArray = new cl0.g(str).getJSONArray("default");
            int length = jSONArray.length();
            int i17 = 0;
            while (true) {
                linkedList = this.f132043h;
                if (i17 >= length) {
                    break;
                }
                gr.c0 c0Var = new gr.c0(jSONArray.getString(i17));
                i17++;
                linkedList.add(new ir.a1(c0Var, false, i17));
            }
            if (!linkedList.isEmpty()) {
                this.canShowEmoji = true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderEmojiPickView", "parse data error, exception : %s", e17);
        }
    }

    public final boolean getCanShowEmoji() {
        return this.canShowEmoji;
    }

    public final java.lang.String getImeEmojiConfig() {
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("IMEmoji");
        return d17 == null ? "" : d17;
    }

    public final java.lang.String getPickEmojiStr() {
        return this.pickEmojiStr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f132041f.a();
    }

    public final void setCanShowEmoji(boolean z17) {
        this.canShowEmoji = z17;
    }

    public final void setOnTextOperationListener(com.tencent.mm.pluginsdk.ui.k0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f132039d = listener;
        ((lr.p) this.f132042g).f320569e = new ix2.c(this);
    }

    public final void setPickEmojiStr(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.pickEmojiStr = str;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 == 0 && this.canShowEmoji) {
            super.setVisibility(i17);
        } else {
            super.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderEmojiPickView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        ix2.a aVar = new ix2.a();
        this.f132040e = aVar;
        ir.x0 x0Var = new ir.x0();
        this.f132041f = x0Var;
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        lr.p pVar = new lr.p(0, null, null, 6, null);
        this.f132042g = pVar;
        this.f132043h = new java.util.LinkedList();
        this.f132044i = "";
        this.pickEmojiStr = "";
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.agi, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lq9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPanelRecyclerView finderEmojiPanelRecyclerView = (com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPanelRecyclerView) findViewById;
        ix2.d dVar = new ix2.d();
        com.tencent.mm.plugin.finder.view.emoji.FinderEmojiLayoutManager finderEmojiLayoutManager = new com.tencent.mm.plugin.finder.view.emoji.FinderEmojiLayoutManager(getContext(), dVar.f320561b);
        finderEmojiPanelRecyclerView.setHasFixedSize(true);
        finderEmojiPanelRecyclerView.setAdapter(aVar);
        finderEmojiPanelRecyclerView.setSizeResolver(dVar);
        finderEmojiPanelRecyclerView.setPanelLifeCycle(x0Var);
        finderEmojiPanelRecyclerView.setLayoutManager(finderEmojiLayoutManager);
        finderEmojiPanelRecyclerView.setFocusable(false);
        finderEmojiPanelRecyclerView.setItemAnimator(null);
        aVar.f320620g = pVar;
        this.f132044i = getImeEmojiConfig();
        a();
    }
}
