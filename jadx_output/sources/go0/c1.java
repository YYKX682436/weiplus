package go0;

/* loaded from: classes14.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f1 f273744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(go0.f1 f1Var) {
        super(1);
        this.f273744d = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float[] m17 = (float[]) obj;
        kotlin.jvm.internal.o.g(m17, "m");
        android.opengl.Matrix.scaleM(m17, 0, !this.f273744d.R ? 1.0f : -1.0f, -1.0f, 1.0f);
        return jz5.f0.f302826a;
    }
}
