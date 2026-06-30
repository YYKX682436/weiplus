package ul4;

/* loaded from: classes11.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul4.i f428606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ul4.i iVar) {
        super(0);
        this.f428606d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ul4.i iVar = this.f428606d;
        if (iVar.f428623n) {
            b66.n a17 = iVar.a();
            if (a17 != null) {
                bw5.nq0 nq0Var = new bw5.nq0();
                nq0Var.f30787d = true;
                nq0Var.f30788e[1] = true;
                urgen.ur_2BA9.UR_C8FE.UR_39F9(((b66.q) a17).getCppPointer(), nq0Var.toByteArray());
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusController", "TingAudioFocusController " + iVar.f428618f + " onPause failed for too frequent.");
        }
        return jz5.f0.f302826a;
    }
}
