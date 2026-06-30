package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameInfoViewForeign extends android.widget.RelativeLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f140871d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f140872e;

    /* renamed from: f, reason: collision with root package name */
    public int f140873f;

    /* renamed from: g, reason: collision with root package name */
    public int f140874g;

    /* renamed from: h, reason: collision with root package name */
    public final int f140875h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnClickListener f140876i;

    public GameInfoViewForeign(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140873f = 0;
        this.f140874g = 0;
        this.f140875h = 2;
        this.f140876i = new com.tencent.mm.plugin.game.ui.y3(this);
        this.f140871d = context;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this.f140876i);
        this.f140872e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gnp);
        int d17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().d1();
        this.f140874g = d17;
        if (d17 > 0 && d17 <= 99) {
            this.f140872e.setVisibility(0);
            this.f140872e.setText("" + this.f140874g);
        } else if (d17 > 99) {
            this.f140872e.setVisibility(0);
            this.f140872e.setText("99+");
            this.f140872e.setTextSize(1, 9.0f);
        } else {
            this.f140872e.setVisibility(4);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameInfoViewForeign", "initView finished");
    }

    public void setSourceScene(int i17) {
        this.f140873f = i17;
    }
}
