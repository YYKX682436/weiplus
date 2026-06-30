package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class aj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f128865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f128866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(fc2.a aVar, com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f128865d = aVar;
        this.f128866e = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        java.lang.String string;
        fc2.t tVar = (fc2.t) this.f128865d;
        int i17 = tVar.f260989h;
        int i18 = tVar.f260994m;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f128866e;
        if (i17 >= 0) {
            finderShareFeedRelUI.f128778k2 = com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI.x7(finderShareFeedRelUI, i17);
            finderShareFeedRelUI.E7().B = finderShareFeedRelUI.f128778k2;
        }
        if (i18 >= 0) {
            boolean z17 = true;
            if (i18 != finderShareFeedRelUI.f128781m2) {
                finderShareFeedRelUI.f128781m2 = i18;
                if (i18 <= 1 && finderShareFeedRelUI.f128773f2) {
                    com.tencent.mm.plugin.finder.feed.w8 w8Var = finderShareFeedRelUI.E;
                    if (w8Var == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    if (w8Var.o().getEnableRefresh() && finderShareFeedRelUI.E7().L) {
                        com.tencent.mm.plugin.finder.ui.qm qmVar = finderShareFeedRelUI.D;
                        if (qmVar == null) {
                            kotlin.jvm.internal.o.o("presenter");
                            throw null;
                        }
                        qmVar.j0();
                    }
                }
            }
            if (finderShareFeedRelUI.f128768a2 || (finderShareFeedRelUI.getContext() instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI)) {
                com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(tVar.f260992k);
                java.lang.Long valueOf = h17 != null ? java.lang.Long.valueOf(h17.getId()) : null;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = finderShareFeedRelUI.f128780l2;
                if (!kotlin.jvm.internal.o.b(valueOf, finderItem != null ? java.lang.Long.valueOf(finderItem.getId()) : null)) {
                    finderShareFeedRelUI.f128780l2 = h17;
                    if (h17 != null && (feedObject = h17.getFeedObject()) != null && (object_extend = feedObject.getObject_extend()) != null && (string = object_extend.getString(25)) != null && finderShareFeedRelUI.f128768a2) {
                        ((sg0.w2) ((tg0.r1) i95.n0.c(tg0.r1.class))).ij(string, null);
                        java.lang.String str = finderShareFeedRelUI.B1;
                        if (str != null && str.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            ((com.tencent.mm.plugin.finder.assist.l9) ((jz5.n) finderShareFeedRelUI.f128769b2).getValue()).a(string);
                        } else {
                            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                            ((com.tencent.mm.feature.lite.i) g0Var).rj(finderShareFeedRelUI.B1, "onFinderFeedFocusChange", "{\"currentTid\": \"" + string + "\"}");
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
