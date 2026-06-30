package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class bj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f128955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f128956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(fc2.a aVar, com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f128955d = aVar;
        this.f128956e = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        java.lang.String string;
        ec2.a aVar = (ec2.a) this.f128955d;
        if (aVar.f250946d == 12 && (h17 = bu2.j.f24534a.h(aVar.f250947e)) != null && (feedObject = h17.getFeedObject()) != null && (object_extend = feedObject.getObject_extend()) != null && (string = object_extend.getString(25)) != null) {
            com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f128956e;
            java.lang.String str = finderShareFeedRelUI.B1;
            if (str == null || str.length() == 0) {
                ((com.tencent.mm.plugin.finder.assist.l9) ((jz5.n) finderShareFeedRelUI.f128769b2).getValue()).b(string);
            } else {
                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                ((com.tencent.mm.feature.lite.i) g0Var).rj(finderShareFeedRelUI.B1, "onFinderFeedNegativeFeedback", "{\"currentTid\": \"" + string + "\"}");
            }
        }
        return jz5.f0.f302826a;
    }
}
