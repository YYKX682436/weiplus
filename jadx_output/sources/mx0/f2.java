package mx0;

/* loaded from: classes5.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.k3 f331973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f331974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(mx0.k3 k3Var, mx0.q2 q2Var) {
        super(0);
        this.f331973d = k3Var;
        this.f331974e = q2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float volume;
        com.tencent.maas.camstudio.MJCamMusicVolumeDesc z07;
        java.lang.Float f17 = this.f331973d.f222353c.f256883f;
        if (f17 != null) {
            volume = f17.floatValue();
        } else {
            pp0.p0 p0Var = this.f331974e.f332236g.K;
            volume = ((p0Var == null || (z07 = p0Var.z0()) == null) ? 1.0f : z07.getVolume()) / 2.0f;
        }
        return new jz5.l(java.lang.Integer.valueOf(e06.p.f((int) (volume * 200), 0, 200)), 100);
    }
}
