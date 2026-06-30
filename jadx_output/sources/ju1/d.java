package ju1;

/* loaded from: classes10.dex */
public final class d implements i4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ju1.p0 f301704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f301705b;

    public d(ju1.p0 p0Var, int i17) {
        this.f301704a = p0Var;
        this.f301705b = i17;
    }

    @Override // i4.h
    public final void a(i4.j jVar) {
        int i17 = this.f301705b;
        ju1.p0 p0Var = this.f301704a;
        if (jVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardViewUtils", "getPrimaryColor, palette generated fail");
            ((ju1.b) p0Var).a(i17);
            return;
        }
        i4.i iVar = jVar.f288359d;
        if (iVar != null) {
            ((ju1.b) p0Var).a(iVar.f288349d);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardViewUtils", "getPrimaryColor, palette generated but swatch is null");
            ((ju1.b) p0Var).a(i17);
        }
    }
}
