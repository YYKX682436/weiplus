package mx0;

/* loaded from: classes5.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f332151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f332152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(java.lang.Float f17, mx0.q2 q2Var) {
        super(1);
        this.f332151d = f17;
        this.f332152e = q2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchMusic completed, push bgm volume=");
            java.lang.Float f17 = this.f332151d;
            sb6.append(f17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicEntranceV2Plugin", sb6.toString());
            yx0.b8 b8Var = this.f332152e.f332236g;
            kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.n5(b8Var, f17.floatValue(), null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
