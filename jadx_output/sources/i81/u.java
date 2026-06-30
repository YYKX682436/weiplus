package i81;

/* loaded from: classes7.dex */
public class u implements com.tencent.mm.plugin.appbrand.pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.n5 f289621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i81.r f289622b;

    public u(i81.r rVar, com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var) {
        this.f289622b = rVar;
        this.f289621a = n5Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.pc
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, jz5.l lVar, java.lang.String str) {
        if (c0Var == null) {
            return;
        }
        this.f289621a.p(this.f289622b.f289610q).n(c0Var);
    }
}
