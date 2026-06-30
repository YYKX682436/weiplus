package zf0;

/* loaded from: classes11.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f472411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472413f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(yz5.a aVar, zf0.v0 v0Var, java.lang.String str) {
        super(1);
        this.f472411d = aVar;
        this.f472412e = v0Var;
        this.f472413f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        java.lang.String reason = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(reason, "reason");
        java.lang.String str = (java.lang.String) this.f472411d.invoke();
        if (str != null) {
            java.lang.String str2 = r26.n0.N(str) ^ true ? str : null;
            if (str2 != null) {
                kotlinx.coroutines.flow.n2 Bi = ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Bi(str2);
                gm0.b bVar = gm0.j1.b().f273245h;
                if (bVar != null && (lifecycleScope = bVar.f273145e) != null) {
                    v65.i.b(lifecycleScope, null, new zf0.e0(Bi, this.f472412e, reason, this.f472413f, str2, null), 1, null);
                }
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", this.f472412e.id() + " skip cancel upload reason:" + reason + " tag:" + this.f472413f + " clientId empty");
        return jz5.f0.f302826a;
    }
}
