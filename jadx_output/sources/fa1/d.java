package fa1;

/* loaded from: classes7.dex */
public class d implements cl.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fa1.a f260680b;

    public d(fa1.a aVar, java.lang.String str) {
        this.f260680b = aVar;
        this.f260679a = str;
    }

    @Override // cl.o
    public void a() {
        java.lang.String str = this.f260679a;
        fa1.a aVar = this.f260680b;
        if (str != null) {
            aVar.getClass();
            aVar.P0(new fa1.a$$a(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.p(aVar.N, aVar.P);
    }

    @Override // cl.o
    public void b(long j17, long j18) {
        java.lang.String str = this.f260679a;
        fa1.a aVar = this.f260680b;
        if (str != null) {
            aVar.P0(new fa1.a$$b(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.o(aVar.N, aVar.P, j17, j18, false, (com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F());
    }
}
