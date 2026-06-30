package du3;

/* loaded from: classes.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.q f243674a;

    public p(du3.q qVar) {
        this.f243674a = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.b()) {
            kotlin.jvm.internal.o.f(((r45.pg7) ((r45.z86) fVar.f70618d).getCustom(1)).getList(0), "getAiImgEditTags(...)");
            if (!r0.isEmpty()) {
                java.util.Iterator it = ((r45.pg7) ((r45.z86) fVar.f70618d).getCustom(1)).getList(0).iterator();
                while (it.hasNext()) {
                    r45.y6 y6Var = (r45.y6) it.next();
                    com.tencent.mars.xlog.Log.i(this.f243674a.f243680e, "ai tag info:" + y6Var.getString(0) + ' ' + y6Var.getString(1));
                }
                return ((ku5.t0) ku5.t0.f312615d).B(new du3.o(this.f243674a, fVar));
            }
        }
        com.tencent.mars.xlog.Log.e(this.f243674a.f243680e, "request error:" + fVar);
        return jz5.f0.f302826a;
    }
}
