package com.tencent.mm.plugin.game.widget;

/* loaded from: classes5.dex */
public class AutoScrollTextView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f141924d;

    /* renamed from: e, reason: collision with root package name */
    public int f141925e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f141926f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f141927g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.Animation f141928h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.animation.Animation f141929i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f141930m;

    public AutoScrollTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f141924d = new java.util.ArrayList();
        this.f141925e = 0;
        this.f141930m = new com.tencent.mm.sdk.platformtools.b4(new s53.a(this), true);
        android.widget.TextView textView = new android.widget.TextView(context, attributeSet);
        this.f141926f = textView;
        textView.setVisibility(8);
        android.widget.TextView textView2 = new android.widget.TextView(context, attributeSet);
        this.f141927g = textView2;
        textView2.setVisibility(8);
        addView(this.f141926f);
        addView(this.f141927g);
        setOrientation(1);
        setGravity(17);
        setPadding(0, 0, 0, 0);
        this.f141928h = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477879e3);
        this.f141929i = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477892eg);
    }

    public final void a(android.widget.TextView textView, java.lang.String str) {
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(new android.text.SpannableString(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f141930m.d();
    }

    public void setText(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = this.f141924d;
        arrayList.clear();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f141930m;
        b4Var.d();
        if (list == null || list.size() == 0) {
            this.f141926f.setVisibility(8);
            this.f141927g.setVisibility(8);
            return;
        }
        arrayList.addAll(list);
        a(this.f141926f, (java.lang.String) arrayList.get(0));
        this.f141926f.setVisibility(0);
        this.f141925e = 0;
        if (arrayList.size() == 1) {
            return;
        }
        b4Var.c(5000L, 5000L);
    }
}
