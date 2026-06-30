package ul4;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul4.i f428611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ul4.i iVar) {
        super(0);
        this.f428611d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ul4.i iVar = this.f428611d;
        if (iVar.f428623n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusController", "TingAudioFocusController " + iVar.f428618f + " onResume failed for too frequent.");
        } else {
            b66.n a17 = iVar.a();
            if (a17 != null && a17.i() == 0) {
                if (a17 != null) {
                    b66.q qVar = (b66.q) a17;
                    urgen.ur_2BA9.UR_C8FE.UR_709D(qVar.getCppPointer(), qVar.f());
                }
            } else if (a17 != null) {
                bw5.oq0 oq0Var = new bw5.oq0();
                oq0Var.f31209d = true;
                oq0Var.f31210e[1] = true;
                urgen.ur_2BA9.UR_C8FE.UR_2D39(((b66.q) a17).getCppPointer(), oq0Var.toByteArray());
            }
        }
        return jz5.f0.f302826a;
    }
}
