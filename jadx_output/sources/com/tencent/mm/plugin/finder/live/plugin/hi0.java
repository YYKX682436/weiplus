package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hi0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ji0 f112814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f112815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.z63 f112816c;

    public hi0(com.tencent.mm.plugin.finder.live.plugin.ji0 ji0Var, boolean z17, r45.z63 z63Var) {
        this.f112814a = ji0Var;
        this.f112815b = z17;
        this.f112816c = z63Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList<r45.z63> list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.plugin.ji0 ji0Var = this.f112814a;
        ji0Var.u1();
        int i17 = fVar.f70615a;
        java.lang.String str = ji0Var.f113107p;
        r45.z63 z63Var = this.f112816c;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.a73 a73Var = ji0Var.f113113v;
            boolean z17 = this.f112815b;
            if (a73Var != null && (list = a73Var.getList(0)) != null) {
                for (r45.z63 z63Var2 : list) {
                    if (kotlin.jvm.internal.o.b(z63Var2.getString(0), z63Var.getString(0))) {
                        z63Var2.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
                        java.lang.String TAG = str + "_set";
                        kotlin.jvm.internal.o.g(TAG, "TAG");
                        com.tencent.mars.xlog.Log.i(TAG, "GameRankSwitch appid:" + z63Var2.getString(0) + ", name:" + z63Var2.getString(1) + ", enable:" + z63Var2.getInteger(2));
                        g92.b bVar = g92.b.f269769e;
                        m92.f fVar2 = new m92.f();
                        r45.ob4 e17 = fVar2.e();
                        r45.a73 a73Var2 = new r45.a73();
                        r45.a73 a73Var3 = ji0Var.f113113v;
                        a73Var2.parseFrom(a73Var3 != null ? a73Var3.toByteArray() : null);
                        e17.set(11, a73Var2);
                        bVar.S1(fVar2, m92.j.f325000r);
                    }
                }
            }
            if (z17) {
                android.view.ViewGroup viewGroup = ji0Var.f365323d;
                db5.t7.h(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.ehs));
            }
            dk2.xf W0 = ji0Var.W0();
            if (W0 != null) {
                ((dk2.r4) W0).q(null);
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            java.lang.String string = z63Var.getString(0);
            ml2.r0.Rj(r0Var, 5, string == null ? "" : string, 0, 4, null);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveModBasicInfo failed, reset ");
            java.lang.String string2 = z63Var.getString(0);
            if (string2 == null) {
                string2 = "";
            }
            sb6.append(string2);
            sb6.append(", ");
            sb6.append(z63Var.getInteger(2));
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            ml2.r0 r0Var2 = (ml2.r0) i95.n0.c(ml2.r0.class);
            java.lang.String string3 = z63Var.getString(0);
            r0Var2.Qj(6, string3 != null ? string3 : "", fVar.f70616b);
        }
        return jz5.f0.f302826a;
    }
}
