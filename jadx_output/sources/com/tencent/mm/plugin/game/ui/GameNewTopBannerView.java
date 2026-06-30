package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class GameNewTopBannerView extends android.widget.FrameLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f140946d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f140947e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f140948f;

    /* renamed from: g, reason: collision with root package name */
    public int f140949g;

    /* renamed from: h, reason: collision with root package name */
    public int f140950h;

    /* renamed from: i, reason: collision with root package name */
    public int f140951i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f140952m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f140953n;

    public GameNewTopBannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140952m = "";
        this.f140953n = null;
        this.f140946d = context;
    }

    public final int a(android.widget.ImageView imageView, int i17, int i18) {
        int h17 = r53.f.h(this.f140946d);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameTopBannerView", "resizeGameThemePic, params is null");
            return 0;
        }
        layoutParams.height = (int) ((i17 / i18) * h17);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        return layoutParams.height;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameNewTopBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof java.lang.String)) {
            java.lang.String str = (java.lang.String) view.getTag();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.game.report.l.d(this.f140946d, 10, 1017, 1, r53.f.v(this.f140946d, str, "game_center_top_banner", null), 0, null, this.f140951i, 0, null, null, this.f140953n);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameNewTopBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140947e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ahg);
        this.f140948f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.n0h);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTopBannerView", "initView finished");
    }
}
