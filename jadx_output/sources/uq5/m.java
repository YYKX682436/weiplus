package uq5;

/* loaded from: classes10.dex */
public final class m extends uq5.y {

    /* renamed from: d, reason: collision with root package name */
    public float f430259d;

    public m(long j17) {
        super(j17);
        this.f430259d = 0.5f;
    }

    @Override // uq5.y
    public uq5.k c() {
        return uq5.k.GradientBlurEffect;
    }

    public final void d(float f17) {
        com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.setEffectParams$renderlib_release(this.f430269c, kz5.b1.e(new jz5.l(8, java.lang.Float.valueOf(f17))));
    }
}
