package hc1;

/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.plugin.appbrand.widget.input.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hc1.i f280291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.h1 f280292e;

    public f(hc1.i iVar, com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var) {
        this.f280291d = iVar;
        this.f280292e = h1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void a(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void d(int i17) {
        this.f280291d.f280300h = i17;
        pm0.v.X(new hc1.e(this.f280292e, i17));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public int getHeight() {
        return this.f280291d.f280300h;
    }
}
