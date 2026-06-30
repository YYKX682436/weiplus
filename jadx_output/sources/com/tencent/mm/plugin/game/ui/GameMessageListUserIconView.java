package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameMessageListUserIconView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f140927d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.g1 f140928e;

    /* renamed from: f, reason: collision with root package name */
    public kk.j f140929f;

    public GameMessageListUserIconView(android.content.Context context) {
        super(context);
        this.f140927d = context;
        if (this.f140928e == null) {
            this.f140928e = new com.tencent.mm.plugin.game.model.g1(context);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f140928e == null) {
            this.f140928e = new com.tencent.mm.plugin.game.model.g1(this.f140927d);
        }
    }

    public void setSourceScene(int i17) {
        com.tencent.mm.plugin.game.model.g1 g1Var = this.f140928e;
        if (g1Var != null) {
            g1Var.f140318d = i17;
        } else {
            this.f140928e = new com.tencent.mm.plugin.game.model.g1(this.f140927d, i17);
        }
    }

    public GameMessageListUserIconView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140927d = context;
        if (this.f140928e == null) {
            this.f140928e = new com.tencent.mm.plugin.game.model.g1(context);
        }
    }
}
