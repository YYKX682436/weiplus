package mz0;

/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(mz0.b2 b2Var) {
        super(0);
        this.f333012d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = this.f333012d;
        android.app.Activity context = b2Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        android.app.Activity context2 = b2Var.getContext();
        mz0.k0 k0Var = new mz0.k0(b2Var);
        mz0.l0 l0Var = new mz0.l0(b2Var);
        mz0.m0 m0Var = new mz0.m0(b2Var);
        mz0.n0 n0Var = new mz0.n0(b2Var);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a Z6 = b2Var.Z6();
        yz5.q k76 = b2Var.k7();
        kotlin.jvm.internal.o.g(context2, "context");
        return new zy0.e(context2, k0Var, l0Var, m0Var, n0Var, Z6, k76);
    }
}
