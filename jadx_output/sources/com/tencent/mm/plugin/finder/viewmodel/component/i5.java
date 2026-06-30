package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oo f134697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.yj0 f134698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134699f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(r45.oo ooVar, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(0);
        this.f134697d = ooVar;
        this.f134698e = yj0Var;
        this.f134699f = baseFinderFeed;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f134698e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(yj0Var.getLikeFlag());
        r45.oo ooVar = this.f134697d;
        ooVar.set(9, valueOf);
        int likeCount = yj0Var.getLikeCount();
        if (likeCount < 0) {
            likeCount = 0;
        }
        ooVar.set(8, java.lang.Integer.valueOf(likeCount));
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "likeBulletComment " + hc2.b0.f(this.f134699f, true) + " onLikeSucceed:like_flag:" + ooVar.getInteger(9) + ", like_count:" + ooVar.getInteger(8));
        return jz5.f0.f302826a;
    }
}
