package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wb0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f114913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dc0 f114914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f114915c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114916d;

    public wb0(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var, cm2.g0 g0Var, android.view.View view) {
        this.f114913a = imageView;
        this.f114914b = dc0Var;
        this.f114915c = g0Var;
        this.f114916d = view;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.vb0((android.graphics.Bitmap) obj, this.f114913a, this.f114914b, this.f114915c, this.f114916d));
    }
}
