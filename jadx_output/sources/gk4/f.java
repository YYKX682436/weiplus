package gk4;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f272550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gk4.r rVar) {
        super(0);
        this.f272550d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk4.a aVar;
        gk4.r rVar;
        yz5.p pVar;
        if ((!this.f272550d.f272606k.isEmpty()) && this.f272550d.f272611p == gk4.e.f272543e) {
            gk4.s sVar = ((hk4.a) this.f272550d.f272606k.getFirst()).f281929h;
            if (sVar != null && (aVar = sVar.f272629h) != null && (pVar = (rVar = this.f272550d).f272600e) != null) {
                pVar.invoke(java.lang.Long.valueOf(rVar.f272612q), aVar);
            }
        } else {
            com.tencent.mars.xlog.Log.i(this.f272550d.f272602g, "not callback progress");
        }
        return jz5.f0.f302826a;
    }
}
