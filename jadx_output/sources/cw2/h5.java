package cw2;

/* loaded from: classes10.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mu3.b f223742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.xlabeffect.XEffectConfig f223743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(mu3.b bVar, com.tencent.mm.plugin.xlabeffect.XEffectConfig xEffectConfig) {
        super(0);
        this.f223742d = bVar;
        this.f223743e = xEffectConfig;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mu3.b bVar = this.f223742d;
        if (bVar != null) {
            com.tencent.mm.plugin.xlabeffect.XEffectConfig it = this.f223743e;
            kotlin.jvm.internal.o.f(it, "$it");
            bVar.f331400x = it;
            p05.l4 l4Var = bVar.f331398v;
            if (l4Var != null) {
                l4Var.F(it);
            }
        }
        return jz5.f0.f302826a;
    }
}
