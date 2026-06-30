package com.tencent.mm.sns_compose.page;

/* loaded from: classes4.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n85.t f193545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f193546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.page.p1 f193547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f193548g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(n85.t tVar, android.content.Context context, com.tencent.mm.sns_compose.page.p1 p1Var, kotlinx.coroutines.y0 y0Var) {
        super(0);
        this.f193545d = tVar;
        this.f193546e = context;
        this.f193547f = p1Var;
        this.f193548g = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n85.t tVar = this.f193545d;
        int i17 = tVar.f335731k & 64;
        android.content.Context context = this.f193546e;
        if (i17 > 0) {
            com.tencent.mm.sns_compose.page.s0.o(context, this.f193547f, this.f193548g, tVar);
        } else {
            kotlin.jvm.internal.o.g(context, "context");
            java.lang.String snsId = tVar.f335724d;
            kotlin.jvm.internal.o.g(snsId, "snsId");
            com.tencent.mars.xlog.Log.i("PlatformOp", "showDetailUI() called with: context = " + context + ", snsId = " + snsId);
            dx1.g.f244489a.j("MomentsTogetherHistoryBrowsing", "withFriendDetailCount", snsId, bx1.u.f36313h);
        }
        return jz5.f0.f302826a;
    }
}
