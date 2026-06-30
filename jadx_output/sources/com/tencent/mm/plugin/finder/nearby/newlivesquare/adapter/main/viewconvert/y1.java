package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class y1 implements ep0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f122040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f122041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp2.b f122042c;

    public y1(com.tencent.mm.protocal.protobuf.FinderObject finderObject, kotlin.jvm.internal.h0 h0Var, wp2.b bVar) {
        this.f122040a = finderObject;
        this.f122041b = h0Var;
        this.f122042c = bVar;
    }

    @Override // ep0.f
    public void a(long j17) {
        com.tencent.mars.xlog.Log.i("LiveReplayConvert", "reportReadCacheTime: " + j17 + " feedId: " + pm0.v.u(this.f122040a.getId()) + " url: " + ((java.lang.String) this.f122041b.f310123d));
        wp2.b bVar = this.f122042c;
        r45.d94 d94Var = bVar.f448388t;
        d94Var.set(1, java.lang.Long.valueOf((long) (((int) d94Var.getLong(1)) | 1)));
        bVar.f448388t.set(2, java.lang.Integer.valueOf((int) j17));
        bVar.f448388t.set(3, java.lang.Long.valueOf(c01.id.c()));
    }

    @Override // ep0.f
    public void b(long j17) {
        com.tencent.mars.xlog.Log.i("LiveReplayConvert", "reportDownloadTime: " + j17 + " feedId: " + pm0.v.u(this.f122040a.getId()) + " url: " + ((java.lang.String) this.f122041b.f310123d));
        wp2.b bVar = this.f122042c;
        r45.d94 d94Var = bVar.f448388t;
        d94Var.set(1, java.lang.Long.valueOf((long) (((int) d94Var.getLong(1)) | 1)));
        bVar.f448388t.set(2, java.lang.Integer.valueOf((int) j17));
        bVar.f448388t.set(3, java.lang.Long.valueOf(c01.id.c()));
    }
}
