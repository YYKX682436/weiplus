package dy3;

/* loaded from: classes.dex */
public final class q implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final ym3.c f244603d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.k0 f244604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneSearchDataSource f244605f;

    public q(com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneSearchDataSource ringtoneAtSomeoneSearchDataSource, ym3.c request, u26.k0 channel) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(channel, "channel");
        this.f244605f = ringtoneAtSomeoneSearchDataSource;
        this.f244603d = request;
        this.f244604e = channel;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        if (vVar != null) {
            if ((kotlin.jvm.internal.o.b(vVar.f351157b, this.f244605f.f158580e) ? vVar : null) != null) {
                int i17 = vVar.f351158c;
                u26.k0 k0Var = this.f244604e;
                boolean z17 = true;
                if (i17 != 0) {
                    u26.s.a(k0Var, null, 1, null);
                    return;
                }
                ym3.d dVar = new ym3.d(this.f244603d);
                java.util.List list = vVar.f351160e;
                if (list != null) {
                    int i18 = 0;
                    for (java.lang.Object obj : list) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(((p13.y) obj).f351187e, z17);
                        java.util.ArrayList arrayList = dVar.f463149c;
                        kotlin.jvm.internal.o.d(n17);
                        dy3.p pVar = new dy3.p(i18, n17, 1, null, 8, null);
                        pVar.f244598g = vVar.f351159d;
                        arrayList.add(pVar);
                        z17 = true;
                        i18 = i19;
                    }
                }
                k0Var.e(dVar);
            }
        }
    }
}
