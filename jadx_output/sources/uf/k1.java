package uf;

/* loaded from: classes7.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o1 f427040d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(uf.o1 o1Var) {
        super(1);
        this.f427040d = o1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        uf.h2 it = (uf.h2) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "volume now:" + it.f427031b);
        f06.v[] vVarArr = uf.o1.f427071u;
        uf.o0 q17 = this.f427040d.q();
        kotlin.jvm.internal.o.d(it.f427031b);
        q17.e(((java.lang.Number) r3).intValue() - 1);
        return jz5.f0.f302826a;
    }
}
