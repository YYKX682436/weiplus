package jc2;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc2.f f298948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vs2 f298949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jc2.f fVar, r45.vs2 vs2Var) {
        super(1);
        this.f298948d = fVar;
        this.f298949e = vs2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        this.f298948d.getClass();
        r45.vs2 vs2Var = this.f298949e;
        if (vs2Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.InnerDropTabRedDotInterceptor", "removeShowInfoWithReport :" + vs2Var.f388487e + ' ' + path);
            java.util.LinkedList show_infos = vs2Var.f388489g;
            kotlin.jvm.internal.o.f(show_infos, "show_infos");
            java.util.Iterator it = show_infos.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (kotlin.jvm.internal.o.b(((r45.f03) obj2).f373892i, path)) {
                    break;
                }
            }
            r45.f03 f03Var = (r45.f03) obj2;
            if (f03Var != null) {
                com.tencent.mm.plugin.finder.report.x2.m(com.tencent.mm.plugin.finder.report.x2.f125429a, vs2Var, f03Var, 13, null, 0L, 24, null);
            }
            hc2.u0.g(vs2Var, path, true);
        }
        return jz5.f0.f302826a;
    }
}
