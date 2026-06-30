package p05;

/* loaded from: classes10.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.l4 f350724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(p05.l4 l4Var) {
        super(1);
        this.f350724d = l4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float[] m17 = (float[]) obj;
        kotlin.jvm.internal.o.g(m17, "m");
        if (this.f350724d.f350592e) {
            android.opengl.Matrix.scaleM(m17, 0, 1.0f, -1.0f, 1.0f);
        }
        return jz5.f0.f302826a;
    }
}
