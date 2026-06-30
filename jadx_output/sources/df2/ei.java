package df2;

/* loaded from: classes3.dex */
public final class ei implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.fi f230063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.q12 f230065c;

    public ei(df2.fi fiVar, java.lang.String str, r45.q12 q12Var) {
        this.f230063a = fiVar;
        this.f230064b = str;
        this.f230065c = q12Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        df2.fi fiVar = this.f230063a;
        com.tencent.mars.xlog.Log.i(fiVar.f230143m, "CgiFinderLiveGetUserGameConfig errType=" + fVar.f70615a + " errCode=" + fVar.f70616b);
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            java.util.LinkedList list = ((r45.hv1) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getGame_user_info_list(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.n73 n73Var = (r45.n73) next;
                r45.z53 z53Var = (r45.z53) n73Var.getCustom(1);
                boolean z17 = false;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(z53Var != null ? z53Var.getString(0) : null)) {
                    r45.z53 z53Var2 = (r45.z53) n73Var.getCustom(1);
                    if (kotlin.jvm.internal.o.b(z53Var2 != null ? z53Var2.getString(0) : null, this.f230064b)) {
                        z17 = true;
                    }
                }
                if (z17) {
                    obj2 = next;
                    break;
                }
            }
            r45.n73 n73Var2 = (r45.n73) obj2;
            fiVar.f230145o = n73Var2;
            if (n73Var2 != null) {
                fiVar.d7(this.f230065c);
                fiVar.c7(fiVar.b7(n73Var2));
            }
        }
        return jz5.f0.f302826a;
    }
}
