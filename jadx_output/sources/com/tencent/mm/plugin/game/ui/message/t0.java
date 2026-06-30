package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class t0 extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public final android.content.Context f141639b2;

    /* renamed from: c2, reason: collision with root package name */
    public final int f141640c2;

    /* renamed from: d2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.r0 f141641d2;

    /* renamed from: e2, reason: collision with root package name */
    public final kk.j f141642e2;

    /* renamed from: f2, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.ui.message.j1 f141643f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.s f141644g2;

    /* renamed from: h2, reason: collision with root package name */
    public final java.util.Set f141645h2;

    public t0(android.content.Context context, int i17) {
        super(context, null);
        this.f141645h2 = new java.util.HashSet();
        this.f141639b2 = context;
        this.f141640c2 = i17;
        this.f141642e2 = new jt0.i(30, com.tencent.mm.plugin.game.ui.message.t0.class);
        this.f141643f2 = new com.tencent.mm.plugin.game.ui.message.j1(i17, new com.tencent.mm.plugin.game.ui.message.p0(this));
        this.f141641d2 = new com.tencent.mm.plugin.game.ui.message.r0(this, context, ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().i1(1), ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(1));
        setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        setAdapter(this.f141641d2);
    }

    public final void g1(android.widget.ImageView imageView, java.lang.String str, float f17) {
        r53.v vVar = new r53.v();
        vVar.f392703a = false;
        vVar.f392709g = f17;
        r53.y.a().e(imageView, str, vVar.a(), new com.tencent.mm.plugin.game.ui.message.q0(this, str));
    }

    public void setEmptyCallback(com.tencent.mm.plugin.game.ui.message.s sVar) {
        this.f141644g2 = sVar;
    }
}
