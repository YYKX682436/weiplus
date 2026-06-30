package nu0;

/* loaded from: classes5.dex */
public final class q2 implements com.tencent.maas.imagestudio.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f340080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f340082c;

    public q2(int i17, nu0.b4 b4Var, int i18) {
        this.f340080a = i17;
        this.f340081b = b4Var;
        this.f340082c = i18;
    }

    @Override // com.tencent.maas.imagestudio.h
    public final void a(java.lang.String str) {
        nu0.b4 b4Var = this.f340081b;
        ju0.b bVar = b4Var.K;
        if (this.f340080a == bVar.f301680g) {
            int i17 = this.f340082c;
            bVar.f301680g = i17;
            nu0.b4.d7(b4Var, i17);
        }
        nu0.i q76 = b4Var.q7();
        q76.V6("edit_material", "adjust_images_order", q76.U6());
    }
}
