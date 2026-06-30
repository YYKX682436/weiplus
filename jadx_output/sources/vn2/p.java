package vn2;

/* loaded from: classes2.dex */
public final class p extends com.tencent.unit_rc.BaseObject implements qg3.a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f438345e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f438346d = jz5.h.b(vn2.o.f438341d);

    public static final r45.hn6 a(vn2.p pVar, bw5.wy wyVar, int i17) {
        pVar.getClass();
        if (wyVar == null) {
            return null;
        }
        r45.hn6 hn6Var = new r45.hn6();
        java.util.LinkedList<bw5.yr> linkedList = wyVar.f34870d;
        if (linkedList != null) {
            for (bw5.yr yrVar : linkedList) {
                java.util.LinkedList list = hn6Var.getList(0);
                r45.gn6 gn6Var = new r45.gn6();
                gn6Var.set(0, java.lang.Long.valueOf(yrVar.f35632d));
                boolean[] zArr = yrVar.f35661r2;
                gn6Var.set(1, zArr[25] ? yrVar.E : "");
                gn6Var.set(2, 23);
                gn6Var.set(3, zArr[34] ? yrVar.N : "");
                bw5.qs qsVar = zArr[98] ? yrVar.f35659q2 : new bw5.qs();
                gn6Var.set(4, qsVar != null ? qsVar.S1[43] ? qsVar.U : com.tencent.mm.protobuf.g.f192155b : null);
                list.add(gn6Var);
            }
        }
        return hn6Var;
    }

    @Override // qg3.a
    public void d6(bw5.ev evVar, bw5.c40 c40Var, yz5.l onSuccess, yz5.p onFail) {
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onFail, "onFail");
        kotlinx.coroutines.l.d((kotlinx.coroutines.y0) ((jz5.n) this.f438346d).getValue(), null, null, new vn2.n(evVar, c40Var, this, onSuccess, onFail, null), 3, null);
    }

    @Override // qg3.a
    public java.lang.String jg() {
        return "AndroidNativeMainFeedsCache";
    }
}
