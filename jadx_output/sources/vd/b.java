package vd;

/* loaded from: classes7.dex */
public final class b implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f435360a;

    public b(yz5.p pVar) {
        this.f435360a = pVar;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        boolean z17 = obj instanceof com.tencent.mm.plugin.appbrand.networking.p;
        yz5.p pVar = this.f435360a;
        if (z17) {
            pVar.invoke(java.lang.Boolean.FALSE, obj);
        } else if (obj instanceof java.lang.Throwable) {
            pVar.invoke(java.lang.Boolean.FALSE, new com.tencent.mm.plugin.appbrand.networking.p(com.tencent.mm.plugin.appbrand.networking.o.SEND, 0, ((java.lang.Throwable) obj).getMessage(), null));
        } else {
            pVar.invoke(java.lang.Boolean.FALSE, new com.tencent.mm.plugin.appbrand.networking.p(com.tencent.mm.plugin.appbrand.networking.o.SEND, 0, obj != null ? obj.toString() : null, null));
        }
    }
}
