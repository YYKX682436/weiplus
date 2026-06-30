package wv2;

/* loaded from: classes10.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wv2.f f450003a;

    public d(wv2.f fVar) {
        this.f450003a = fVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.iq2) fVar.f70618d).getCustom(1);
        if (finderObject != null) {
            finderObject.getId();
        }
        wv2.f fVar2 = this.f450003a;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = fVar2.f450005h;
        finderItem.trackPost("doPostSceneEnd");
        java.util.concurrent.CountDownLatch countDownLatch = fVar2.f450008n;
        if (i17 == 0 && i18 == 0) {
            fVar2.f450007m = new wv2.h(finderItem);
            countDownLatch.countDown();
        } else {
            com.tencent.mm.plugin.finder.report.p2.f125237a.P(finderItem.getLocalId(), i17, i18);
            if (finderItem.isPostFailed()) {
                mv2.f0 f0Var = mv2.f0.f331561a;
                pm0.v.X(new mv2.w(finderItem.getLocalId()));
            }
            fVar2.f450007m = new wv2.n(finderItem, 2);
            countDownLatch.countDown();
        }
        return jz5.f0.f302826a;
    }
}
