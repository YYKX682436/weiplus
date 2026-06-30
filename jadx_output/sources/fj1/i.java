package fj1;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.j f263120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fj1.j jVar) {
        super(0);
        this.f263120d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.f263120d.f263107a.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ej1.a aVar = (ej1.a) entry.getValue();
            yz5.a aVar2 = aVar.f253276b;
            if (aVar2 == null || (k0Var = (com.tencent.mm.plugin.appbrand.jsapi.k0) aVar2.invoke()) == null) {
                k0Var = (com.tencent.mm.plugin.appbrand.jsapi.k0) aVar.f253275a.newInstance();
            }
            hashMap.put(str, k0Var);
        }
        return hashMap;
    }
}
