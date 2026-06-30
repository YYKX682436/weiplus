package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class c1 extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public final android.content.Context f141534b2;

    /* renamed from: c2, reason: collision with root package name */
    public final int f141535c2;

    /* renamed from: d2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.b1 f141536d2;

    /* renamed from: e2, reason: collision with root package name */
    public final kk.j f141537e2;

    /* renamed from: f2, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.ui.message.j1 f141538f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.s f141539g2;

    /* renamed from: h2, reason: collision with root package name */
    public final java.util.Set f141540h2;

    public c1(android.content.Context context, int i17) {
        super(context, null);
        this.f141540h2 = new java.util.HashSet();
        this.f141534b2 = context;
        this.f141535c2 = i17;
        this.f141537e2 = new jt0.i(30, com.tencent.mm.plugin.game.ui.message.c1.class);
        this.f141538f2 = new com.tencent.mm.plugin.game.ui.message.j1(i17, new com.tencent.mm.plugin.game.ui.message.u0(this));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.ui.message.y0(this, context));
    }

    public final void g1(android.widget.ImageView imageView, java.lang.String str, float f17) {
        r53.v vVar = new r53.v();
        vVar.f392703a = false;
        vVar.f392709g = f17;
        r53.y.a().e(imageView, str, vVar.a(), new com.tencent.mm.plugin.game.ui.message.z0(this, str));
    }

    public void setEmptyCallback(com.tencent.mm.plugin.game.ui.message.s sVar) {
        this.f141539g2 = sVar;
    }
}
