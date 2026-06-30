package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class f5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 f121673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f121674e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 a5Var, long j17) {
        super(1);
        this.f121673d = a5Var;
        this.f121674e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f cgiBack = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "loadMoreDataIfNeeded: load end, errType=" + cgiBack.f70615a + ", errCode=" + cgiBack.f70616b);
        this.f121673d.f121579g = false;
        rq2.o.f398847a.e(6, java.lang.System.currentTimeMillis() - this.f121674e, true);
        return jz5.f0.f302826a;
    }
}
