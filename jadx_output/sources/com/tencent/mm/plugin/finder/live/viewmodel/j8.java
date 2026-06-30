package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class j8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.l8 f117168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f117169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.h8 f117170c;

    public j8(com.tencent.mm.plugin.finder.live.viewmodel.l8 l8Var, boolean z17, com.tencent.mm.plugin.finder.live.viewmodel.h8 h8Var) {
        this.f117168a = l8Var;
        this.f117169b = z17;
        this.f117170c = h8Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList<r45.z63> list;
        java.util.LinkedList<r45.z63> list2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.viewmodel.l8 l8Var = this.f117168a;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.viewmodel.i8(l8Var));
        int i17 = fVar.f70615a;
        boolean z17 = this.f117169b;
        com.tencent.mm.plugin.finder.live.viewmodel.h8 h8Var = this.f117170c;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.a73 a73Var = l8Var.f117224f;
            if (a73Var != null && (list = a73Var.getList(0)) != null) {
                for (r45.z63 z63Var : list) {
                    if (kotlin.jvm.internal.o.b(z63Var.getString(0), h8Var.f117132d.getString(0))) {
                        z63Var.set(2, java.lang.Integer.valueOf(h8Var.f117132d.getInteger(2)));
                        r45.a73 a73Var2 = l8Var.f117224f;
                        if (a73Var2 != null && (list2 = a73Var2.getList(0)) != null) {
                            for (r45.z63 z63Var2 : list2) {
                                if (z63Var2 != null) {
                                    com.tencent.mars.xlog.Log.i("SimpleUIComponent_set", "GameRankSwitch appid:" + z63Var2.getString(0) + ", name:" + z63Var2.getString(1) + ", enable:" + z63Var2.getInteger(2));
                                }
                            }
                        }
                        g92.b bVar = g92.b.f269769e;
                        m92.f fVar2 = new m92.f();
                        r45.ob4 e17 = fVar2.e();
                        r45.a73 a73Var3 = new r45.a73();
                        r45.a73 a73Var4 = l8Var.f117224f;
                        a73Var3.parseFrom(a73Var4 != null ? a73Var4.toByteArray() : null);
                        e17.set(11, a73Var3);
                        bVar.S1(fVar2, m92.j.f325000r);
                    }
                }
            }
            if (l8Var.f117228m) {
                if (z17) {
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.r0 r0Var = (ml2.r0) c17;
                    java.lang.String string = h8Var.f117132d.getString(0);
                    ml2.r0.Rj(r0Var, 5, string == null ? "" : string, 0, 4, null);
                } else {
                    i95.m c18 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    ml2.r0 r0Var2 = (ml2.r0) c18;
                    java.lang.String string2 = h8Var.f117132d.getString(0);
                    ml2.r0.Rj(r0Var2, 7, string2 == null ? "" : string2, 0, 4, null);
                }
            }
        } else {
            h8Var.f117132d.set(2, java.lang.Integer.valueOf(!z17 ? 1 : 0));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveModBasicInfo failed, reset ");
            r45.z63 z63Var3 = h8Var.f117132d;
            java.lang.String string3 = z63Var3.getString(0);
            if (string3 == null) {
                string3 = "";
            }
            sb6.append(string3);
            sb6.append(", ");
            sb6.append(z63Var3.getInteger(2));
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
            if (l8Var.f117228m && z17) {
                ml2.r0 r0Var3 = (ml2.r0) i95.n0.c(ml2.r0.class);
                java.lang.String string4 = z63Var3.getString(0);
                r0Var3.Qj(6, string4 != null ? string4 : "", fVar.f70616b);
            }
        }
        return jz5.f0.f302826a;
    }
}
