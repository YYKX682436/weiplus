package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oo f134581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.yj0 f134582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f134584g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f134585h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134586i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(r45.oo ooVar, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, int i18, java.lang.String str) {
        super(0);
        this.f134581d = ooVar;
        this.f134582e = yj0Var;
        this.f134583f = baseFinderFeed;
        this.f134584g = i17;
        this.f134585h = i18;
        this.f134586i = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f134582e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(yj0Var.getLikeFlag());
        r45.oo ooVar = this.f134581d;
        ooVar.set(9, valueOf);
        int likeCount = yj0Var.getLikeCount();
        if (likeCount < 0) {
            likeCount = 0;
        }
        ooVar.set(8, java.lang.Integer.valueOf(likeCount));
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "likeBulletComment " + hc2.b0.f(this.f134583f, true) + " onLikeFail: errType = " + this.f134584g + ", errCode = " + this.f134585h + ", errMsg = " + this.f134586i + " like_flag:" + ooVar.getInteger(9) + ", like_count:" + ooVar.getInteger(8));
        return jz5.f0.f302826a;
    }
}
