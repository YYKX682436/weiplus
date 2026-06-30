package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class h implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.i f115526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f115527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f115528c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f115529d;

    public h(com.tencent.mm.plugin.finder.live.util.i iVar, java.lang.String str, android.view.View view, yz5.l lVar) {
        this.f115526a = iVar;
        this.f115527b = str;
        this.f115528c = view;
        this.f115529d = lVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        kotlin.jvm.internal.o.d(bitmap);
        com.tencent.mm.plugin.finder.live.util.g gVar = new com.tencent.mm.plugin.finder.live.util.g(this.f115526a, bitmap, this.f115527b, this.f115528c, this.f115529d);
        ((dl4.m0) tVar).getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new dl4.q(bitmap, gVar));
    }
}
