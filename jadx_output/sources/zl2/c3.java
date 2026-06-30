package zl2;

/* loaded from: classes3.dex */
public final class c3 implements ek2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f473696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f473697b;

    public c3(gk2.e eVar, yz5.a aVar) {
        this.f473696a = eVar;
        this.f473697b = aVar;
    }

    @Override // ek2.l0
    public void a(int i17, int i18, java.lang.String str, r45.gm1 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        if (i17 == 0 && i18 == 0) {
            ((mm2.c1) this.f473696a.a(mm2.c1.class)).Z6().m(resp);
            yz5.a aVar = this.f473697b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }
}
