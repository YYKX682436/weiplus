package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class v2 implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f121982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f121983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp2.b f121985d;

    public v2(boolean z17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str, wp2.b bVar) {
        this.f121982a = z17;
        this.f121983b = finderObject;
        this.f121984c = str;
        this.f121985d = bVar;
    }

    @Override // ep0.c
    public void a(ip0.a aVar, cp0.n nVar, hp0.e eVar) {
        if (this.f121982a) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onImageLoadFinish from ");
            sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f282909a) : null);
            sb6.append(" feedId: ");
            sb6.append(pm0.v.u(this.f121983b.getId()));
            sb6.append(" url: ");
            sb6.append(this.f121984c);
            com.tencent.mars.xlog.Log.i("Finder.LivingConvert", sb6.toString());
            this.f121985d.f448388t.set(1, java.lang.Long.valueOf(((int) r3.getLong(1)) | 1));
        }
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
    }
}
