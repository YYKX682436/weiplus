package com.tencent.mm.plugin.game.luggage.ui.circle;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(B#\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020\t¢\u0006\u0004\b'\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\f\u001a\u00020\u0002R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/GameEmojiPickView;", "Landroid/widget/FrameLayout;", "", "emojiStr", "Ljz5/f0;", "setEmojiStr", "Lcom/tencent/mm/pluginsdk/ui/k0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTextOperationListener", "", "visibility", "setVisibility", "getImeEmojiConfig", "", "m", "Z", "getCanShowEmoji", "()Z", "setCanShowEmoji", "(Z)V", "canShowEmoji", "n", "Ljava/lang/String;", "getPickEmojiStr", "()Ljava/lang/String;", "setPickEmojiStr", "(Ljava/lang/String;)V", "pickEmojiStr", "o", "I", "getMsourceScene", "()I", "setMsourceScene", "(I)V", "msourceScene", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class GameEmojiPickView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.k0 f140001d;

    /* renamed from: e, reason: collision with root package name */
    public final lr.m0 f140002e;

    /* renamed from: f, reason: collision with root package name */
    public final ir.x0 f140003f;

    /* renamed from: g, reason: collision with root package name */
    public final lr.l0 f140004g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f140005h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140006i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean canShowEmoji;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public java.lang.String pickEmojiStr;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int msourceScene;

    /* renamed from: p, reason: collision with root package name */
    public cl0.e f140010p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameEmojiPickView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        ix2.a aVar = new ix2.a();
        this.f140002e = aVar;
        lr.a1 a1Var = new lr.a1();
        ir.x0 x0Var = new ir.x0();
        this.f140003f = x0Var;
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        lr.p pVar = new lr.p(0, null, null, 6, null);
        this.f140004g = pVar;
        this.f140005h = new java.util.LinkedList();
        this.f140006i = "";
        this.pickEmojiStr = "";
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bfq, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lq9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPanelRecyclerView gameEmojiPanelRecyclerView = (com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPanelRecyclerView) findViewById;
        com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiLayoutManager gameEmojiLayoutManager = new com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiLayoutManager(getContext(), a1Var.f320561b);
        gameEmojiPanelRecyclerView.setHasFixedSize(true);
        gameEmojiPanelRecyclerView.setAdapter(aVar);
        gameEmojiPanelRecyclerView.setSizeResolver(a1Var);
        gameEmojiPanelRecyclerView.setPanelLifeCycle(x0Var);
        gameEmojiPanelRecyclerView.setLayoutManager(gameEmojiLayoutManager);
        gameEmojiPanelRecyclerView.setFocusable(false);
        gameEmojiPanelRecyclerView.setItemAnimator(null);
        aVar.f320620g = pVar;
        this.f140006i = getImeEmojiConfig();
        a();
    }

    public final void a() {
        setVisibility(8);
        if (this.f140006i.length() == 0) {
            return;
        }
        try {
            cl0.e jSONArray = new cl0.g(this.f140006i).getJSONArray("default");
            this.f140010p = jSONArray;
            java.util.LinkedList linkedList = this.f140005h;
            if (jSONArray != null) {
                int length = jSONArray.length();
                int i17 = 0;
                while (i17 < length) {
                    gr.c0 c0Var = new gr.c0(jSONArray.getString(i17));
                    i17++;
                    linkedList.add(new ir.a1(c0Var, false, i17));
                }
            }
            if (!linkedList.isEmpty()) {
                this.canShowEmoji = true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("GameEmojiPickView", "parse data error, exception : %s", e17);
        }
    }

    public final boolean getCanShowEmoji() {
        return this.canShowEmoji;
    }

    public final java.lang.String getImeEmojiConfig() {
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("IMEmoji");
        return d17 == null ? "" : d17;
    }

    public final int getMsourceScene() {
        return this.msourceScene;
    }

    public final java.lang.String getPickEmojiStr() {
        return this.pickEmojiStr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f140003f.a();
    }

    public final void setCanShowEmoji(boolean z17) {
        this.canShowEmoji = z17;
    }

    public final void setEmojiStr(java.lang.String emojiStr) {
        kotlin.jvm.internal.o.g(emojiStr, "emojiStr");
        this.f140006i = "{\"default\":" + emojiStr + '}';
        java.util.LinkedList linkedList = this.f140005h;
        linkedList.clear();
        a();
        java.lang.Object obj = this.f140002e;
        ((lr.z) obj).E(linkedList);
        ((androidx.recyclerview.widget.f2) obj).notifyDataSetChanged();
    }

    public final void setMsourceScene(int i17) {
        this.msourceScene = i17;
    }

    public final void setOnTextOperationListener(com.tencent.mm.pluginsdk.ui.k0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f140001d = listener;
        ((lr.p) this.f140004g).f320569e = new f53.r(this);
    }

    public final void setPickEmojiStr(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.pickEmojiStr = str;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 != 0 || !this.canShowEmoji) {
            super.setVisibility(8);
            return;
        }
        super.setVisibility(i17);
        if (this.f140010p != null) {
            cl0.g gVar = new cl0.g();
            try {
                gVar.h("emoticonIDArray", java.lang.String.valueOf(this.f140010p));
            } catch (org.json.JSONException unused) {
            }
            com.tencent.mm.game.report.l.c(getContext(), 90, 9001, 0, 1, this.msourceScene, gVar.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameEmojiPickView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        ix2.a aVar = new ix2.a();
        this.f140002e = aVar;
        lr.a1 a1Var = new lr.a1();
        ir.x0 x0Var = new ir.x0();
        this.f140003f = x0Var;
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        lr.p pVar = new lr.p(0, null, null, 6, null);
        this.f140004g = pVar;
        this.f140005h = new java.util.LinkedList();
        this.f140006i = "";
        this.pickEmojiStr = "";
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bfq, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lq9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPanelRecyclerView gameEmojiPanelRecyclerView = (com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPanelRecyclerView) findViewById;
        com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiLayoutManager gameEmojiLayoutManager = new com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiLayoutManager(getContext(), a1Var.f320561b);
        gameEmojiPanelRecyclerView.setHasFixedSize(true);
        gameEmojiPanelRecyclerView.setAdapter(aVar);
        gameEmojiPanelRecyclerView.setSizeResolver(a1Var);
        gameEmojiPanelRecyclerView.setPanelLifeCycle(x0Var);
        gameEmojiPanelRecyclerView.setLayoutManager(gameEmojiLayoutManager);
        gameEmojiPanelRecyclerView.setFocusable(false);
        gameEmojiPanelRecyclerView.setItemAnimator(null);
        aVar.f320620g = pVar;
        this.f140006i = getImeEmojiConfig();
        a();
    }
}
