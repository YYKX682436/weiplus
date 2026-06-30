package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f129536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f129537e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI, com.tencent.mm.protobuf.g gVar) {
        super(1);
        this.f129536d = finderFansListUI;
        this.f129537e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.v51 resp = (r45.v51) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI = this.f129536d;
        if (kotlin.jvm.internal.o.b(finderFansListUI.f128572z, this.f129537e)) {
            finderFansListUI.f128570x = resp.getInteger(2) != 0;
            if (finderFansListUI.f128572z == null) {
                finderFansListUI.f128569w.clear();
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.ui.l5(resp, finderFansListUI));
            }
            finderFansListUI.f128572z = resp.getByteString(4);
            pm0.v.X(new com.tencent.mm.plugin.finder.ui.m5(finderFansListUI, resp));
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderFansListUI", "not my buf, ignore!");
        }
        return jz5.f0.f302826a;
    }
}
