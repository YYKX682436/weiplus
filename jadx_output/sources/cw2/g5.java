package cw2;

/* loaded from: classes10.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mu3.b f223728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f223729e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(mu3.b bVar, boolean z17) {
        super(0);
        this.f223728d = bVar;
        this.f223729e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        p05.l4 l4Var;
        mu3.b bVar = this.f223728d;
        if (bVar != null && (l4Var = bVar.f331398v) != null && !this.f223729e) {
            l4Var.F(new com.tencent.mm.plugin.xlabeffect.XEffectConfig());
        }
        return jz5.f0.f302826a;
    }
}
