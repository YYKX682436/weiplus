package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes.dex */
public class ChatTabTopArea extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView f141111d;

    public ChatTabTopArea(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bf8, this);
        findViewById(com.tencent.mm.R.id.jsv).setOnClickListener(new com.tencent.mm.plugin.game.ui.chat_tab.p(this));
        this.f141111d = (com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView) findViewById(com.tencent.mm.R.id.glk);
    }

    public ChatTabTopArea(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ChatTabTopArea(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
