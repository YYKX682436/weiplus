package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class GameDetailAutoScrollView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f140729d;

    /* renamed from: e, reason: collision with root package name */
    public int f140730e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f140731f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f140732g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f140733h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f140734i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f140735m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f140736n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.animation.Animation f140737o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.animation.Animation f140738p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f140739q;

    public GameDetailAutoScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140729d = new java.util.ArrayList();
        this.f140730e = 0;
        this.f140739q = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.game.ui.m2(this), true);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bfb, (android.view.ViewGroup) this, false);
        this.f140731f = viewGroup;
        this.f140732g = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.gji);
        this.f140733h = (android.widget.TextView) this.f140731f.findViewById(com.tencent.mm.R.id.gjj);
        addView(this.f140731f);
        this.f140731f.setVisibility(8);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bfb, (android.view.ViewGroup) this, false);
        this.f140734i = viewGroup2;
        this.f140735m = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.gji);
        this.f140736n = (android.widget.TextView) this.f140734i.findViewById(com.tencent.mm.R.id.gjj);
        addView(this.f140734i);
        this.f140734i.setVisibility(8);
        this.f140737o = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477879e3);
        this.f140738p = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477892eg);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f140739q.d();
    }

    public void setText(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = this.f140729d;
        arrayList.clear();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f140739q;
        b4Var.d();
        if (list == null || list.size() == 0 || list.size() % 2 != 0) {
            this.f140731f.setVisibility(8);
            this.f140734i.setVisibility(8);
            return;
        }
        arrayList.addAll(list);
        this.f140730e = 0;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        java.lang.CharSequence charSequence = (java.lang.CharSequence) arrayList.get(0);
        float textSize = this.f140732g.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f140732g.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, charSequence, textSize));
        this.f140733h.setText((java.lang.CharSequence) arrayList.get(1));
        this.f140731f.setVisibility(0);
        this.f140734i.setVisibility(8);
        if (arrayList.size() / 2 == 1) {
            return;
        }
        b4Var.c(5000L, 5000L);
    }
}
