package jm4;

/* loaded from: classes11.dex */
public class b5 extends com.tencent.unit_rc.BaseProxyObject implements jm4.n3, jm4.u3, b66.o, jm4.f {
    @Override // jm4.u3
    public void F2(byte[] context, int i17, byte[] msg) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msg, "msg");
        urgen.ur_0025.UR_7616.UR_E8AE(getCppPointer(), context, i17, msg);
    }

    @Override // b66.r
    public void G2() {
        urgen.ur_2BA9.UR_12FB.UR_B39A(getCppPointer());
    }

    @Override // jm4.n3
    public void Mc(jm4.k3 k3Var) {
    }

    @Override // b66.r
    public void bd(int i17, b66.a aVar, bw5.kq0 kq0Var, int i18) {
        urgen.ur_2BA9.UR_12FB.UR_227C(getCppPointer(), i17, aVar, kq0Var != null ? kq0Var.toByteArray() : null, i18);
    }

    @Override // jm4.n3
    public void c9(byte[] item) {
        kotlin.jvm.internal.o.g(item, "item");
    }

    @Override // jm4.n3
    public void f1(bw5.kq0 kq0Var, int i17, int i18, bw5.mq0 mq0Var) {
    }

    @Override // b66.r
    public void fd(bw5.kq0 kq0Var, bw5.pq0 state, bw5.lq0 event, bw5.mq0 mq0Var) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(event, "event");
        urgen.ur_2BA9.UR_12FB.UR_B1C5(getCppPointer(), kq0Var != null ? kq0Var.toByteArray() : null, state.f31808d, event.f29930d, mq0Var != null ? mq0Var.toByteArray() : null);
    }

    @Override // b66.r
    public void h5(b66.a aVar, b66.a aVar2) {
        urgen.ur_2BA9.UR_12FB.UR_D5C6(getCppPointer(), aVar, aVar2);
    }

    @Override // b66.r
    public void m0(bw5.kq0 kq0Var) {
        urgen.ur_2BA9.UR_12FB.UR_35FF(getCppPointer(), kq0Var != null ? kq0Var.toByteArray() : null);
    }

    @Override // jm4.u3
    public void o(byte[] context, int i17, byte[] msg) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msg, "msg");
        urgen.ur_0025.UR_7616.UR_4D3C(getCppPointer(), context, i17, msg);
    }

    @Override // b66.r
    public void s0(byte[] context, bw5.iq0 event, byte[] info) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(info, "info");
        urgen.ur_2BA9.UR_12FB.UR_B16F(getCppPointer(), context, event.f28681d, info);
    }

    @Override // jm4.u3
    public void x(long j17, long j18, long j19) {
        urgen.ur_0025.UR_7616.UR_8654(getCppPointer(), j17, j18, j19);
    }

    @Override // b66.o
    public void y0(b66.n nVar) {
        urgen.ur_2BA9.UR_7DD6.UR_B0B4(getCppPointer(), nVar);
    }
}
