package jm4;

/* loaded from: classes9.dex */
public final class d5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f300380d;

    public d5(yz5.l lVar) {
        this.f300380d = lVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        bw5.s1 s1Var = new bw5.s1();
        int integer = ret.getInteger(1);
        boolean[] zArr = s1Var.f32748g;
        if (integer == 0) {
            com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "black list succ");
            s1Var.f32745d = 0L;
            zArr[1] = true;
            s1Var.f32746e = "";
            zArr[2] = true;
            s1Var.f32747f = com.tencent.mm.protobuf.g.f192155b;
            zArr[3] = true;
        } else {
            com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "black list failed");
            s1Var.f32745d = 1L;
            zArr[1] = true;
            s1Var.f32746e = "";
            zArr[2] = true;
            s1Var.f32747f = com.tencent.mm.protobuf.g.f192155b;
            zArr[3] = true;
        }
        yz5.l lVar = this.f300380d;
        if (lVar != null) {
            lVar.invoke(s1Var);
        }
    }
}
