package p81;

/* loaded from: classes7.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p81.j f352722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p81.j jVar) {
        super(2);
        this.f352722d = jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.launching.a6 error = (com.tencent.mm.plugin.appbrand.launching.a6) obj;
        kotlin.jvm.internal.o.g(error, "error");
        p81.j jVar = this.f352722d;
        jVar.a(6, "onError(" + error + ", " + ((java.lang.String) obj2) + ')');
        switch (error.ordinal()) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                r81.f fVar = r81.f.INSTANCE;
                boolean z17 = jVar.f352726d;
                int i17 = z17 ? 50 : 49;
                int i18 = jVar.f352725c;
                fVar.b(i18, i17);
                if (com.tencent.mm.plugin.appbrand.launching.a6.f84490h == error) {
                    fVar.b(i18, z17 ? 59 : 58);
                    break;
                }
                break;
            default:
                p81.j.b(jVar, false);
                break;
        }
        jVar.f352724b.invoke(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
