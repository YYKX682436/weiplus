package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vj implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f120070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget f120071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f120072c;

    public vj(kotlinx.coroutines.y0 y0Var, com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget, yz5.a aVar) {
        this.f120070a = y0Var;
        this.f120071b = finderLiveFinderDetailWidget;
        this.f120072c = aVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var = this.f120070a;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget = this.f120071b;
        kotlinx.coroutines.l.d(y0Var, g3Var, null, new com.tencent.mm.plugin.finder.live.widget.uj(finderLiveFinderDetailWidget, this.f120072c, null), 2, null);
        com.tencent.mars.xlog.Log.i(finderLiveFinderDetailWidget.f117617d, "request finderUserpagePreview failed: " + ((java.lang.Integer) obj));
    }
}
