package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class im extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.qm f129373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(com.tencent.mm.plugin.finder.ui.qm qmVar) {
        super(0);
        this.f129373d = qmVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataListJustForAdapter;
        boolean a17 = hc2.e.a();
        com.tencent.mm.plugin.finder.ui.qm qmVar = this.f129373d;
        com.tencent.mars.xlog.Log.i(qmVar.f129749x0, "PersonalizedUpdate " + a17);
        if (a17) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = qmVar.f106570t;
            if (baseFeedLoader != null && (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) != null) {
                hb2.q qVar = hb2.q.f280082e;
                com.tencent.mm.ui.MMActivity mMActivity = qmVar.f106421d;
                com.tencent.mm.plugin.finder.feed.i0 i0Var = qmVar.f106424g;
                if (qVar.o(mMActivity, i0Var != null ? i0Var.o() : null, dataListJustForAdapter, null, 0)) {
                    qmVar.H1 = true;
                }
            }
            qmVar.H1 = false;
        }
        return jz5.f0.f302826a;
    }
}
