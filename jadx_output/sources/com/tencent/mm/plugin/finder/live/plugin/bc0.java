package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bc0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f112006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dc0 f112007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f112008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f112009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f112010e;

    public bc0(android.view.View view, com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var, cm2.g0 g0Var, boolean z17, android.graphics.Bitmap bitmap) {
        this.f112006a = view;
        this.f112007b = dc0Var;
        this.f112008c = g0Var;
        this.f112009d = z17;
        this.f112010e = bitmap;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ac0((android.graphics.Bitmap) obj, this.f112006a, this.f112007b, this.f112008c, this.f112009d, this.f112010e));
    }
}
