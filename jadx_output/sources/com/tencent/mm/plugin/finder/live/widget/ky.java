package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class ky implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget f118869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f118870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f118871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f118872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f118873e;

    public ky(com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget finderLiveVisitorFinderDetailWidget, r45.xn1 xn1Var, kotlinx.coroutines.y0 y0Var, yz5.l lVar, yz5.a aVar) {
        this.f118869a = finderLiveVisitorFinderDetailWidget;
        this.f118870b = xn1Var;
        this.f118871c = y0Var;
        this.f118872d = lVar;
        this.f118873e = aVar;
    }

    @Override // zy2.i5
    public final void a(java.lang.Object obj) {
        if (obj instanceof r45.nw6) {
            java.lang.String str = this.f118869a.f117699d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request finderUserpagePreview username: ");
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) this.f118870b.getCustom(0);
            sb6.append(finderContact != null ? finderContact.getUsername() : null);
            sb6.append(" success: ");
            sb6.append(((r45.nw6) obj).toJSON());
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            kotlinx.coroutines.y0 y0Var = this.f118871c;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.widget.jy(this.f118869a, obj, this.f118872d, this.f118873e, null), 2, null);
        }
    }
}
