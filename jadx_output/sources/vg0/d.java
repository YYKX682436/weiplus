package vg0;

/* loaded from: classes8.dex */
public final class d implements ou4.c0 {
    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        r45.e64 i17 = su4.r2.i();
        callback.a(kz5.c1.k(new jz5.l("precision", java.lang.Long.valueOf(i17.f373048f)), new jz5.l("gpsSource", java.lang.Long.valueOf(i17.f373051i)), new jz5.l("latitude", java.lang.Double.valueOf(i17.f373047e)), new jz5.l("longitude", java.lang.Double.valueOf(i17.f373046d)), new jz5.l("addrFlag", java.lang.Long.valueOf(i17.f373053n))));
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return "onGetLbsLocation";
    }
}
