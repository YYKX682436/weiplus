package jy4;

/* loaded from: classes5.dex */
public class b0 implements vg3.t4 {
    @Override // vg3.t4
    public void A(com.tencent.mm.protobuf.f fVar) {
        r45.j4 j4Var = (r45.j4) fVar;
        if (j4Var.f377560g == 51 || !c01.z1.r().equals(j4Var.f377558e.f372756d)) {
            return;
        }
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).o2(j4Var.f377559f.f372756d, j4Var.f377568r);
        if (o27.I0() == 0) {
            com.tencent.mars.xlog.Log.i("WebWXSyncExtensionCallback", "[MicroMsg.MultiTerminalSyncMgr] msg not exit, svrID:%d", java.lang.Long.valueOf(j4Var.f377568r));
        } else {
            com.tencent.mars.xlog.Log.i("WebWXSyncExtensionCallback", "[MicroMsg.MultiTerminalSyncMgr] selfSend msg, svrID:%d, localId:%d", java.lang.Long.valueOf(j4Var.f377568r), java.lang.Long.valueOf(o27.getMsgId()));
            iy4.j.a(o27.getMsgId(), o27.Q0());
        }
    }

    @Override // vg3.t4
    public /* bridge */ /* synthetic */ void E0(com.tencent.mm.protobuf.f fVar) {
    }
}
