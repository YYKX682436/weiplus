package zk4;

/* loaded from: classes11.dex */
public final class k extends com.tencent.unit_rc.BaseObject implements b66.t {
    @Override // b66.t
    public void o(byte[] item, int i17, byte[] msg) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // b66.t
    public void x(long j17, long j18, long j19) {
        java.util.Iterator it = ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).f252241e.iterator();
        while (it.hasNext()) {
            pm0.v.X(new com.tencent.mm.plugin.mv.ui.shake.y(j17, j19, ((com.tencent.mm.plugin.mv.ui.shake.z) ((rk4.a6) it.next())).f150972a));
        }
    }
}
