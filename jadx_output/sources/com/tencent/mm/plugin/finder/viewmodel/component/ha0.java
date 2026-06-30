package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ha0 implements cw2.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler f134601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw2.da f134602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f134603c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134604d;

    public ha0(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler, cw2.da daVar, long j17, java.lang.String str) {
        this.f134601a = finderVideoRecycler;
        this.f134602b = daVar;
        this.f134603c = j17;
        this.f134604d = str;
    }

    @Override // cw2.ya
    public void b() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = this.f134601a;
        finderVideoRecycler.f133675h.post(new com.tencent.mm.plugin.finder.viewmodel.component.ga0(finderVideoRecycler, this.f134602b, this.f134603c, this.f134604d));
        ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) this.f134602b).setOnPlayerStopListener(null);
    }
}
