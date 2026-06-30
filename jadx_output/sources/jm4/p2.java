package jm4;

/* loaded from: classes11.dex */
public class p2 extends b66.i implements jm4.n2 {

    /* renamed from: e, reason: collision with root package name */
    public static final jm4.o2 f300403e = new jm4.o2(null);

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

    public jm4.g3 f() {
        return (jm4.g3) urgen.ur_0025.UR_882D.UR_0C69(getCppPointer());
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

    public void g(jm4.d0 d0Var) {
        urgen.ur_0025.UR_882D.UR_4F23(getCppPointer(), d0Var);
    }

    @Override // b66.r
    public void h5(b66.a aVar, b66.a aVar2) {
        urgen.ur_2BA9.UR_12FB.UR_D5C6(getCppPointer(), aVar, aVar2);
    }

    public void j(jm4.h2 h2Var) {
        urgen.ur_0025.UR_882D.UR_9C0B(getCppPointer(), h2Var);
    }

    @Override // b66.r
    public void m0(bw5.kq0 kq0Var) {
        urgen.ur_2BA9.UR_12FB.UR_35FF(getCppPointer(), kq0Var != null ? kq0Var.toByteArray() : null);
    }

    public void n(jm4.m2 m2Var) {
        urgen.ur_0025.UR_882D.UR_99D2(getCppPointer(), m2Var);
    }

    @Override // b66.r
    public void s0(byte[] context, bw5.iq0 event, byte[] info) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(info, "info");
        urgen.ur_2BA9.UR_12FB.UR_B16F(getCppPointer(), context, event.f28681d, info);
    }
}
