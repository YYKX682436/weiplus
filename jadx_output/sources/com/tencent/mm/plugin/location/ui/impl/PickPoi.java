package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class PickPoi extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f144702d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.Animation f144703e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f144704f;

    /* renamed from: g, reason: collision with root package name */
    public u60.f f144705g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.impl.d0 f144706h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f144707i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.impl.c0 f144708m;

    /* renamed from: n, reason: collision with root package name */
    public final u60.e f144709n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.impl.v1 f144710o;

    public PickPoi(android.content.Context context) {
        super(context);
        this.f144706h = new com.tencent.mm.plugin.location.ui.impl.d0();
        this.f144707i = true;
        this.f144708m = null;
        this.f144709n = new com.tencent.mm.plugin.location.ui.impl.a0(this);
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f144702d = context;
        this.f144705g = ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi();
        this.f144703e = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477910ey);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bsp, (android.view.ViewGroup) this, true);
        this.f144704f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.in6);
        if (j65.e.b()) {
            this.f144704f.setImageResource(com.tencent.mm.R.drawable.c8k);
        }
        post(new com.tencent.mm.plugin.location.ui.impl.z(this, inflate, context));
    }

    public void b(double d17, double d18, boolean z17, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.location.ui.impl.d0 d0Var = new com.tencent.mm.plugin.location.ui.impl.d0();
        this.f144706h = d0Var;
        d0Var.f144787m = 3;
        d0Var.f144775a = this.f144702d.getResources().getString(com.tencent.mm.R.string.ggf);
        com.tencent.mm.plugin.location.ui.impl.d0 d0Var2 = this.f144706h;
        d0Var2.f144778d = d17;
        d0Var2.f144777c = d18;
        d0Var2.f144776b = "";
        d0Var2.f144789o = str;
        d0Var2.f144790p = str2;
        u60.f fVar = this.f144705g;
        u60.e eVar = this.f144709n;
        ((i11.g) fVar).c(eVar);
        u60.h hVar = new u60.h(d17, d18);
        hVar.f424871d = i17;
        hVar.f424872e = str2;
        hVar.f424870c = 2;
        hVar.f424874g = z17;
        ((i11.g) this.f144705g).b(hVar, eVar);
        this.f144707i = true;
    }

    public com.tencent.mm.plugin.location.ui.impl.d0 getPoi() {
        return this.f144706h;
    }

    public void setAdapter(com.tencent.mm.plugin.location.ui.impl.c0 c0Var) {
        this.f144708m = c0Var;
    }

    public void setLocationArrow(int i17) {
        this.f144704f.setImageResource(i17);
    }

    public void setOnCurPoiGet(com.tencent.mm.plugin.location.ui.impl.v1 v1Var) {
        this.f144710o = v1Var;
    }

    public PickPoi(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144706h = new com.tencent.mm.plugin.location.ui.impl.d0();
        this.f144707i = true;
        this.f144708m = null;
        this.f144709n = new com.tencent.mm.plugin.location.ui.impl.a0(this);
        a(context);
    }

    public PickPoi(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f144706h = new com.tencent.mm.plugin.location.ui.impl.d0();
        this.f144707i = true;
        this.f144708m = null;
        this.f144709n = new com.tencent.mm.plugin.location.ui.impl.a0(this);
        a(context);
    }
}
