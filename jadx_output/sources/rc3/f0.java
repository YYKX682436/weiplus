package rc3;

/* loaded from: classes7.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.n4 f393985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(rc3.w0 w0Var, com.tencent.mm.plugin.magicbrush.n4 n4Var) {
        super(0);
        this.f393984d = w0Var;
        this.f393985e = n4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qc3.f fVar;
        com.tencent.mm.plugin.magicbrush.n4 n4Var = this.f393985e;
        rc3.w0 w0Var = this.f393984d;
        java.lang.String str = w0Var.f394105z;
        java.lang.String str2 = w0Var.f394087e;
        com.tencent.mars.xlog.Log.i(str, "onServerMgrReady");
        if (w0Var.A == null) {
            try {
                fVar = n4Var.B5(str2, w0Var);
            } catch (android.os.RemoteException e17) {
                java.lang.String obj = e17.toString();
                com.tencent.mars.xlog.Log.e(str, "remote exception: " + obj);
                je3.i.t8(je3.k.f299298e, w0Var.f394102w, "remoteException-IMBServerMgr", obj, null, 0.0f, 24, null);
                fVar = null;
            }
            com.tencent.mars.xlog.Log.i(str, "connect to biz server " + fVar);
            if (fVar != null) {
                w0Var.B = n4Var;
                w0Var.A = new tc3.l0(str2, fVar, new rc3.e0(w0Var));
                java.util.Iterator it = w0Var.f394092m.iterator();
                while (it.hasNext()) {
                    ((jc3.u) it.next()).x5();
                }
                while (!w0Var.f394101v) {
                    kz5.q qVar = w0Var.f394100u;
                    if (!(!qVar.isEmpty())) {
                        break;
                    }
                    ((yz5.a) qVar.removeFirst()).invoke();
                }
            } else if (!w0Var.C) {
                w0Var.C = true;
                w0Var.f394094o.postDelayed(new rc3.d0(w0Var), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            }
        }
        return jz5.f0.f302826a;
    }
}
