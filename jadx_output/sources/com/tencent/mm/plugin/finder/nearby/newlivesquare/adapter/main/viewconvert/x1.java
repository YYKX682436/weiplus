package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class x1 implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f122024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f122025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp2.b f122026c;

    public x1(com.tencent.mm.protocal.protobuf.FinderObject finderObject, kotlin.jvm.internal.h0 h0Var, wp2.b bVar) {
        this.f122024a = finderObject;
        this.f122025b = h0Var;
        this.f122026c = bVar;
    }

    @Override // ep0.c
    public void a(ip0.a aVar, cp0.n nVar, hp0.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onImageLoadFinish from ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f282909a) : null);
        sb6.append(" feedId: ");
        sb6.append(pm0.v.u(this.f122024a.getId()));
        sb6.append(" url: ");
        sb6.append((java.lang.String) this.f122025b.f310123d);
        com.tencent.mars.xlog.Log.i("LiveReplayConvert", sb6.toString());
        this.f122026c.f448388t.set(1, java.lang.Long.valueOf(((int) r3.getLong(1)) | 1));
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
    }
}
