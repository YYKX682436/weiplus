package zf0;

/* loaded from: classes11.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472392f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.String str, zf0.v0 v0Var, java.lang.String str2) {
        super(1);
        this.f472390d = str;
        this.f472391e = v0Var;
        this.f472392f = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        java.lang.String reason = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(reason, "reason");
        kotlinx.coroutines.flow.n2 Ai = ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(this.f472390d);
        gm0.b bVar = gm0.j1.b().f273245h;
        if (bVar != null && (lifecycleScope = bVar.f273145e) != null) {
            v65.i.b(lifecycleScope, null, new zf0.b0(Ai, this.f472391e, reason, this.f472392f, this.f472390d, null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
