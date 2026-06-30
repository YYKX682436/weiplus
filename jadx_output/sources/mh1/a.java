package mh1;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final mh1.a f326289d = new mh1.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4 L;
        boolean z17 = false;
        try {
            if (((ob0.h3) i95.n0.c(ob0.h3.class)) != null) {
                boolean c17 = sp3.d.c();
                jz5.g gVar = mh1.b.f326290a;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c17);
                if (valueOf != null && (L = com.tencent.mm.sdk.platformtools.o4.L()) != null) {
                    L.A("WeAppV8LiteStrategy#cachedIs3GUserSpace", valueOf.booleanValue() ? 1 : 2);
                }
                z17 = c17;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeAppMemoryStrategy", "query is3GUserSpace fail since " + e17);
            jz5.g gVar2 = mh1.b.f326290a;
            com.tencent.mm.sdk.platformtools.o4 L2 = com.tencent.mm.sdk.platformtools.o4.L();
            int i17 = L2 != null ? L2.getInt("WeAppV8LiteStrategy#cachedIs3GUserSpace", 0) : 0;
            java.lang.Boolean bool = i17 != 1 ? i17 != 2 ? null : java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
            if (bool != null) {
                z17 = bool.booleanValue();
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
