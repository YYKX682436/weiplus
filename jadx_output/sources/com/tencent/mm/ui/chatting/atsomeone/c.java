package com.tencent.mm.ui.chatting.atsomeone;

/* loaded from: classes.dex */
public final class c implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final ym3.c f198475d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.k0 f198476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.atsomeone.AtSomeoneSearchDataSource f198477f;

    public c(com.tencent.mm.ui.chatting.atsomeone.AtSomeoneSearchDataSource atSomeoneSearchDataSource, ym3.c request, u26.k0 channel) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(channel, "channel");
        this.f198477f = atSomeoneSearchDataSource;
        this.f198475d = request;
        this.f198476e = channel;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.util.List list;
        if (vVar != null) {
            if ((kotlin.jvm.internal.o.b(vVar.f351157b, this.f198477f.f198466f) ? vVar : null) != null) {
                int i17 = vVar.f351158c;
                boolean z17 = true;
                u26.k0 k0Var = this.f198476e;
                if (i17 != 0) {
                    u26.s.a(k0Var, null, 1, null);
                    return;
                }
                ym3.d dVar = new ym3.d(this.f198475d);
                java.util.List resultList = vVar.f351160e;
                kotlin.jvm.internal.o.f(resultList, "resultList");
                p13.y yVar = (p13.y) kz5.n0.a0(resultList, 0);
                if (yVar != null) {
                    yVar.f351203u = vVar.f351159d;
                } else {
                    yVar = null;
                }
                if (yVar != null && (list = yVar.f351196n) != null) {
                    java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(((p13.l) next).f351114e, z17);
                        java.util.ArrayList arrayList = dVar.f463149c;
                        kotlin.jvm.internal.o.d(n17);
                        com.tencent.mm.ui.chatting.atsomeone.b bVar = new com.tencent.mm.ui.chatting.atsomeone.b(i18, n17, 1, null, 8, null);
                        bVar.f198470g = vVar.f351159d;
                        arrayList.add(bVar);
                        i18 = i19;
                        z17 = true;
                    }
                }
                k0Var.e(dVar);
            }
        }
    }
}
