package cw2;

/* loaded from: classes10.dex */
public final class n9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv3.c f223890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xeffect.effect.EffectManager f223891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(zv3.c cVar, com.tencent.mm.xeffect.effect.EffectManager effectManager) {
        super(0);
        this.f223890d = cVar;
        this.f223891e = effectManager;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((zv3.f) this.f223890d).a();
        this.f223891e.k();
        return jz5.f0.f302826a;
    }
}
