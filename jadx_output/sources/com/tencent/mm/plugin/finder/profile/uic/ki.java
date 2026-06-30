package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ki extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ri f123905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader f123906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(com.tencent.mm.plugin.finder.profile.uic.ri riVar, com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader finderProfileTingSongListLoader) {
        super(3);
        this.f123905d = riVar;
        this.f123906e = finderProfileTingSongListLoader;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        if (!booleanValue2) {
            ((com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f123905d.f124194m).getValue()).f();
        }
        com.tencent.mars.xlog.Log.i(this.f123906e.getF123427d(), "fetchCallback isInit:" + booleanValue + " hasMore:" + booleanValue2);
        return jz5.f0.f302826a;
    }
}
