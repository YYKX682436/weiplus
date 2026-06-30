package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class my implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f119134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget f119135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f119136c;

    public my(kotlinx.coroutines.y0 y0Var, com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget finderLiveVisitorFinderDetailWidget, yz5.a aVar) {
        this.f119134a = y0Var;
        this.f119135b = finderLiveVisitorFinderDetailWidget;
        this.f119136c = aVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var = this.f119134a;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget finderLiveVisitorFinderDetailWidget = this.f119135b;
        kotlinx.coroutines.l.d(y0Var, g3Var, null, new com.tencent.mm.plugin.finder.live.widget.ly(finderLiveVisitorFinderDetailWidget, this.f119136c, null), 2, null);
        com.tencent.mars.xlog.Log.i(finderLiveVisitorFinderDetailWidget.f117699d, "request finderUserpagePreview failed: " + ((java.lang.Integer) obj));
    }
}
