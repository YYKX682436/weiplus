package iq2;

/* loaded from: classes2.dex */
public final class q implements sp2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293759a;

    public q(iq2.d0 d0Var) {
        this.f293759a = d0Var;
    }

    @Override // sp2.k
    public int e() {
        r45.s92 s92Var;
        r45.dk2 dk2Var = this.f293759a.f293736t;
        if (dk2Var == null || (s92Var = (r45.s92) dk2Var.getCustom(12)) == null) {
            return 0;
        }
        return s92Var.getInteger(1);
    }

    @Override // sp2.k
    public com.tencent.mm.protobuf.g f() {
        r45.dk2 dk2Var = this.f293759a.f293736t;
        if (dk2Var != null) {
            return dk2Var.getByteString(6);
        }
        return null;
    }

    @Override // sp2.k
    public void h(int i17, com.tencent.mm.protobuf.g gVar, int i18, yz5.l gciListener) {
        kotlin.jvm.internal.o.g(gciListener, "gciListener");
    }

    @Override // sp2.k
    public boolean i() {
        return true;
    }

    @Override // sp2.k
    public boolean k() {
        return ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).Bi();
    }

    @Override // sp2.k
    public /* bridge */ /* synthetic */ r45.h81 m() {
        return null;
    }
}
