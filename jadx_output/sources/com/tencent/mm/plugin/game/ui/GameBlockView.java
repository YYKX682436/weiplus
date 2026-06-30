package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class GameBlockView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.LayoutInflater f140680d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f140681e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f140682f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.b4 f140683g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.a0 f140684h;

    public GameBlockView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(1);
        this.f140680d = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f140681e = new android.widget.LinearLayout.LayoutParams(-1, -2);
        this.f140682f = this;
        this.f140683g = new com.tencent.mm.plugin.game.ui.b4();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameBlockView", "initView finished");
    }
}
