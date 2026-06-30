package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ja0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.da f134840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler f134841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f134842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134843g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(cw2.da daVar, com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler, long j17, java.lang.String str) {
        super(0);
        this.f134840d = daVar;
        this.f134841e = finderVideoRecycler;
        this.f134842f = j17;
        this.f134843g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cw2.da daVar = this.f134840d;
        if (daVar instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) {
            ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar).setOnPlayerStopListener(new com.tencent.mm.plugin.finder.viewmodel.component.ha0(this.f134841e, daVar, this.f134842f, this.f134843g));
            this.f134840d.d();
        } else {
            daVar.d();
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = this.f134841e;
            finderVideoRecycler.f133675h.post(new com.tencent.mm.plugin.finder.viewmodel.component.ia0(finderVideoRecycler, this.f134840d, this.f134842f, this.f134843g));
        }
        return jz5.f0.f302826a;
    }
}
