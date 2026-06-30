package vw;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv.z2 f440677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(rv.z2 z2Var) {
        super(1);
        this.f440677d = z2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ipcinvoker.r rVar = ((com.tencent.mm.plugin.appbrand.jsapi.biz.s) this.f440677d).f80007a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(it));
        }
        return jz5.f0.f302826a;
    }
}
