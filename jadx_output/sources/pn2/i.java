package pn2;

/* loaded from: classes3.dex */
public final class i implements ek2.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pn2.s f357000a;

    public i(pn2.s sVar) {
        this.f357000a = sVar;
    }

    @Override // ek2.z0
    public void a(int i17, int i18, java.lang.String str, r45.ht1 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        pn2.s sVar = this.f357000a;
        if (i17 == 0 && i18 == 0) {
            ((on2.z2) sVar.f357013e.a(on2.z2.class)).g7((r45.cz1) resp.getCustom(1));
            ((on2.z2) sVar.f357013e.a(on2.z2.class)).X6(resp);
        }
        qo0.c.a(sVar.f357014f, qo0.b.f365404q3, null, 2, null);
        qo0.c cVar = sVar.f357014f;
        qo0.b bVar = qo0.b.f365393o3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_LOTTERY_CARD_SHOW_STATUS", false);
        cVar.statusChange(bVar, bundle);
    }
}
