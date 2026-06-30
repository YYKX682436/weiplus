package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class tj implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget f119887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f119888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f119889c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f119890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f119891e;

    public tj(com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget, r45.xn1 xn1Var, kotlinx.coroutines.y0 y0Var, yz5.p pVar, yz5.a aVar) {
        this.f119887a = finderLiveFinderDetailWidget;
        this.f119888b = xn1Var;
        this.f119889c = y0Var;
        this.f119890d = pVar;
        this.f119891e = aVar;
    }

    @Override // zy2.i5
    public final void a(java.lang.Object obj) {
        if (obj instanceof r45.nw6) {
            java.lang.String str = this.f119887a.f117617d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request finderUserpagePreview username: ");
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) this.f119888b.getCustom(0);
            sb6.append(finderContact != null ? finderContact.getUsername() : null);
            sb6.append(" success: ");
            sb6.append(((r45.nw6) obj).toJSON());
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            kotlinx.coroutines.y0 y0Var = this.f119889c;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.widget.sj(this.f119887a, obj, this.f119890d, this.f119891e, null), 2, null);
        }
    }
}
