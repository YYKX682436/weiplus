package com.tencent.mm.ui.conversation;

/* loaded from: classes2.dex */
public class ChatBotConversationTextLine extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f207288d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f207289e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f207290f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f207291g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f207292h;

    public ChatBotConversationTextLine(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f207292h = false;
        a();
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.e0h, this);
        this.f207288d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.spn);
        this.f207289e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.spk);
        this.f207290f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.spl);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f207292h) {
            this.f207292h = false;
            int width = (((i19 - i17) - this.f207289e.getWidth()) - this.f207290f.getWidth()) - i65.a.b(getContext(), 16);
            this.f207288d.setText(this.f207291g);
            if (width > 0) {
                this.f207288d.setMaxWidth(width);
            }
        }
    }

    public ChatBotConversationTextLine(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f207292h = false;
        a();
    }
}
