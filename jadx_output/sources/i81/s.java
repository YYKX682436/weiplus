package i81;

/* loaded from: classes7.dex */
public class s implements com.tencent.mm.plugin.appbrand.pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.n5 f289616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i81.r f289617b;

    public s(i81.r rVar, com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var) {
        this.f289617b = rVar;
        this.f289616a = n5Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.pc
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, jz5.l lVar, java.lang.String str) {
        if (c0Var == null) {
            return;
        }
        this.f289616a.p(this.f289617b).n(c0Var);
    }
}
