package hc1;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hc1.i f280293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f280294b;

    public g(hc1.i iVar, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f280293a = iVar;
        this.f280294b = e9Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f280293a.f280299g.x(str, this.f280294b);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        this.f280293a.f280299g.x("[DELETE_EMOTION]", this.f280294b);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        this.f280293a.f280299g.x("[DONE_EMOTION]", this.f280294b);
    }
}
