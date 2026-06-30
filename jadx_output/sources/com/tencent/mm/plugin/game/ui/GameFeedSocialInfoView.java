package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class GameFeedSocialInfoView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f140821d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.widget.GameSmallAvatarList f140822e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f140823f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f140824g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f140825h;

    public GameFeedSocialInfoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140821d = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.a_7);
        this.f140822e = (com.tencent.mm.plugin.game.widget.GameSmallAvatarList) findViewById(com.tencent.mm.R.id.a_d);
        this.f140823f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a9y);
        this.f140824g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f484050cu2);
        this.f140825h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cus);
    }

    public void setData(m53.o0 o0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(o0Var.f323933e) && o0Var.f323934f == null) {
            this.f140821d.setVisibility(8);
        } else {
            this.f140821d.setVisibility(0);
            this.f140822e.setData(o0Var.f323933e);
            java.lang.String str = o0Var.f323934f;
            if (str != null) {
                this.f140823f.setText(str);
                this.f140823f.setVisibility(0);
            } else {
                this.f140823f.setVisibility(8);
            }
        }
        if (o0Var.f323935g == null) {
            this.f140824g.setVisibility(8);
        } else {
            this.f140824g.setVisibility(0);
            this.f140825h.setText(o0Var.f323935g);
        }
    }
}
