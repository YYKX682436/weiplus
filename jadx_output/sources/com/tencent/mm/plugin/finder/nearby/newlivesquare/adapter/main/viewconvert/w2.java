package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class w2 implements ep0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f122003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f122004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp2.b f122006d;

    public w2(boolean z17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str, wp2.b bVar) {
        this.f122003a = z17;
        this.f122004b = finderObject;
        this.f122005c = str;
        this.f122006d = bVar;
    }

    @Override // ep0.f
    public void a(long j17) {
        if (this.f122003a) {
            com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "reportReadCacheTime: " + j17 + " feedId: " + pm0.v.u(this.f122004b.getId()) + " url: " + this.f122005c);
            wp2.b bVar = this.f122006d;
            r45.d94 d94Var = bVar.f448388t;
            d94Var.set(1, java.lang.Long.valueOf((long) (((int) d94Var.getLong(1)) | 1)));
            bVar.f448388t.set(2, java.lang.Integer.valueOf((int) j17));
            bVar.f448388t.set(3, java.lang.Long.valueOf(c01.id.c()));
        }
    }

    @Override // ep0.f
    public void b(long j17) {
        if (this.f122003a) {
            com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "reportDownloadTime: " + j17 + " feedId: " + pm0.v.u(this.f122004b.getId()) + " url: " + this.f122005c);
            wp2.b bVar = this.f122006d;
            r45.d94 d94Var = bVar.f448388t;
            d94Var.set(1, java.lang.Long.valueOf((long) (((int) d94Var.getLong(1)) | 1)));
            bVar.f448388t.set(2, java.lang.Integer.valueOf((int) j17));
            bVar.f448388t.set(3, java.lang.Long.valueOf(c01.id.c()));
        }
    }
}
