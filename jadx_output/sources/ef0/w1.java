package ef0;

/* loaded from: classes2.dex */
public final class w1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.f2 f252346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qk.aa f252347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.ba f252348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.g80 f252349d;

    public w1(ef0.f2 f2Var, qk.aa aaVar, qk.ba baVar, bw5.g80 g80Var) {
        this.f252346a = f2Var;
        this.f252347b = aaVar;
        this.f252348c = baVar;
        this.f252349d = g80Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        bw5.i80 i80Var;
        qk.t9 t9Var;
        byte[] bArr;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        str = "";
        if (fVar == null || (t9Var = (qk.t9) fVar.f70618d) == null || (bArr = t9Var.f364338d) == null) {
            i80Var = null;
        } else {
            i80Var = new bw5.i80();
            i80Var.parseFrom(bArr);
            str = i80Var.f28500g[4] ? i80Var.f28499f : "";
            kotlin.jvm.internal.o.f(str, "getBgmListenId(...)");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommonService", "likeMusic callback, errType:" + fVar.f70615a + ", errCode:" + fVar.f70616b + " listenId:" + str);
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        bw5.g80 g80Var = this.f252349d;
        qk.ba baVar = this.f252348c;
        if (i17 == 0 && fVar.f70616b == 0) {
            this.f252346a.getClass();
            qk.aa aaVar = this.f252347b;
            if (aaVar.f364014c) {
                d75.b.g(new ef0.e2(aaVar));
            }
            if (baVar == null) {
                return null;
            }
            baVar.a(str, g80Var, true, i80Var);
        } else {
            if (baVar == null) {
                return null;
            }
            baVar.a(str, g80Var, false, i80Var);
        }
        return f0Var;
    }
}
