package qn2;

/* loaded from: classes3.dex */
public final class t implements ek2.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn2.z f365151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f365152b;

    public t(qn2.z zVar, yz5.a aVar) {
        this.f365151a = zVar;
        this.f365152b = aVar;
    }

    @Override // ek2.z0
    public void a(int i17, int i18, java.lang.String str, r45.ht1 resp) {
        km2.z zVar;
        r45.cz1 cz1Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (i17 == 0 && i18 == 0) {
            qn2.z zVar2 = this.f365151a;
            ((on2.z2) zVar2.P0(on2.z2.class)).g7((r45.cz1) resp.getCustom(1));
            ((on2.z2) zVar2.P0(on2.z2.class)).X6(resp);
            r45.cz1 cz1Var2 = (r45.cz1) resp.getCustom(1);
            java.lang.String str2 = null;
            if ((cz1Var2 != null ? cz1Var2.getString(0) : null) != null) {
                r45.cz1 cz1Var3 = (r45.cz1) resp.getCustom(1);
                java.lang.String string = cz1Var3 != null ? cz1Var3.getString(0) : null;
                km2.z zVar3 = ((on2.z2) zVar2.P0(on2.z2.class)).f347092m;
                if (zVar3 != null && (cz1Var = zVar3.f309232d) != null) {
                    str2 = cz1Var.getString(0);
                }
                if (kotlin.jvm.internal.o.b(string, str2) && (zVar = ((on2.z2) zVar2.P0(on2.z2.class)).f347092m) != null) {
                    zVar.f309232d = (r45.cz1) resp.getCustom(1);
                }
            }
        }
        this.f365152b.invoke();
    }
}
