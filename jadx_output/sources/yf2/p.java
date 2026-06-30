package yf2;

/* loaded from: classes3.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf2.q f461763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461764b;

    public p(yf2.q qVar, java.lang.String str) {
        this.f461763a = qVar;
        this.f461764b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        yf2.q qVar = this.f461763a;
        if (i17 == 0 && fVar.f70616b == 0) {
            java.util.LinkedList list = ((r45.hv1) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getGame_user_info_list(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                r45.n73 n73Var = (r45.n73) obj2;
                r45.z53 z53Var = (r45.z53) n73Var.getCustom(1);
                boolean z17 = false;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(z53Var != null ? z53Var.getString(0) : null)) {
                    r45.z53 z53Var2 = (r45.z53) n73Var.getCustom(1);
                    if (kotlin.jvm.internal.o.b(z53Var2 != null ? z53Var2.getString(0) : null, this.f461764b)) {
                        z17 = true;
                    }
                }
                if (z17) {
                    break;
                }
            }
            r45.n73 n73Var2 = (r45.n73) obj2;
            if (n73Var2 == null) {
                com.tencent.mars.xlog.Log.i(qVar.f461769m, "no game match");
            } else {
                java.lang.String str = qVar.f461769m;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh url:");
                r45.z53 z53Var3 = (r45.z53) n73Var2.getCustom(1);
                sb6.append(z53Var3 != null ? z53Var3.getString(17) : null);
                sb6.append(", hasSet:");
                r45.z53 z53Var4 = (r45.z53) n73Var2.getCustom(1);
                sb6.append(z53Var4 != null ? java.lang.Boolean.valueOf(z53Var4.getBoolean(16)) : null);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
            }
        } else {
            com.tencent.mars.xlog.Log.i(qVar.f461769m, "CGI error");
        }
        return jz5.f0.f302826a;
    }
}
