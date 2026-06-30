package jm4;

/* loaded from: classes2.dex */
public final class e5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final jm4.e5 f300381a = new jm4.e5();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        bw5.i80 i80Var;
        qk.t9 t9Var;
        byte[] bArr;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null || (t9Var = (qk.t9) fVar.f70618d) == null || (bArr = t9Var.f364338d) == null) {
            i80Var = null;
        } else {
            i80Var = new bw5.i80();
            i80Var.parseFrom(bArr);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("did like item:");
        sb6.append(i80Var != null ? i80Var.f28500g[4] ? i80Var.f28499f : "" : null);
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", sb6.toString());
        return jz5.f0.f302826a;
    }
}
