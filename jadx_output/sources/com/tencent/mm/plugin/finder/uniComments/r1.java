package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class r1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final jv2.d f130394d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f130395e;

    public r1(jv2.d commentItem, int i17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        this.f130394d = commentItem;
        this.f130395e = lVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        jv2.a aVar;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            jv2.d dVar = this.f130394d;
            if (itemId == 0) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(dVar.f302207d.j())) {
                    return;
                }
                com.tencent.mm.sdk.platformtools.b0.e(dVar.f302207d.j());
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490361st, 0).show();
                return;
            }
            if (itemId == 1) {
                yz5.l lVar = this.f130395e;
                if (lVar != null) {
                    lVar.invoke(dVar);
                    return;
                }
                return;
            }
            if (itemId == 2) {
                kotlin.jvm.internal.o.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "getContext(...)");
                jv2.a aVar2 = dVar.f302207d;
                long j17 = aVar2.field_feedId;
                aVar2.t0();
                return;
            }
            if (itemId != 3) {
                if (itemId == 999) {
                    com.tencent.mm.sdk.platformtools.b0.e((dVar == null || (aVar = dVar.f302207d) == null) ? null : aVar.toString());
                    return;
                }
                return;
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y yVar = hb2.y.f280114e;
            long itemId2 = dVar.getItemId();
            jv2.a aVar3 = dVar.f302207d;
            long j18 = aVar3.field_feedId;
            java.lang.String str = aVar3.field_objectNonceId;
            if (str == null) {
                str = "";
            }
            yVar.o(itemId2, j18, str, true, new com.tencent.mm.plugin.finder.uniComments.q1());
        }
    }
}
