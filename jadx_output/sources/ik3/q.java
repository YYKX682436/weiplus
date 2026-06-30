package ik3;

/* loaded from: classes8.dex */
public final class q extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f291909f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f291910g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f291909f = jz5.h.b(ik3.m.f291904d);
        this.f291910g = jz5.h.b(ik3.l.f291903d);
    }

    @Override // jm0.g
    public void N6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAffFsc", "registerAffSyncCppToNativeManager");
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        com.tencent.wechat.aff.star.j.f217514a = ik3.h.f291896a;
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAffFsc", "onAccountInit");
        O6(new ik3.p(this));
    }

    @Override // jm0.g
    public void R6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAffFsc", "onAccountInitBefore");
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("multitask"), false);
        if (!com.tencent.mm.vfs.w6.j(i17)) {
            com.tencent.mm.vfs.w6.u(i17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAffFsc", "db init result: " + com.tencent.wechat.aff.star.d.f217506b.e(i17));
    }

    public final int T6(int i17) {
        if (i17 == 1) {
            return 5;
        }
        if (i17 == 2) {
            return 9;
        }
        if (i17 == 3) {
            return 7;
        }
        if (i17 == 4) {
            return 8;
        }
        switch (i17) {
            case 22:
                return 10;
            case 23:
                return 11;
            case 24:
                return 4;
            case 25:
                return 3;
            case 26:
                return 1;
            case 27:
                return 2;
            default:
                return 0;
        }
    }

    public final lk3.b U6() {
        return (lk3.b) ((jz5.n) this.f291909f).getValue();
    }

    public final int V6(bw5.a40 a40Var) {
        if (a40Var == null) {
            return -1;
        }
        int i17 = a40Var.b().f25730d;
        int i18 = 2;
        if (i17 != 9) {
            if (i17 == 1) {
                return 26;
            }
            if (i17 == 2) {
                return 27;
            }
            i18 = 3;
            if (i17 == 3) {
                return 25;
            }
            if (i17 == 4) {
                return 24;
            }
            if (i17 == 11) {
                return 23;
            }
            if (i17 == 5) {
                return 1;
            }
            if (i17 != 7) {
                if (i17 == 8) {
                    return 4;
                }
                return i17 == 10 ? 22 : -1;
            }
        }
        return i18;
    }

    public final com.tencent.mm.plugin.multitask.model.MultiTaskInfo W6(int i17, bw5.a40 a40Var) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        multiTaskInfo.field_type = V6(a40Var);
        multiTaskInfo.field_id = a40Var.b().c();
        multiTaskInfo.field_createTime = a40Var.b().f25736m * 1000;
        multiTaskInfo.field_updateTime = a40Var.f25009e * 1000;
        bw5.bl0 b17 = a40Var.b();
        com.tencent.mm.protobuf.g gVar = b17.f25741r[11] ? b17.f25740q : com.tencent.mm.protobuf.g.f192155b;
        if (gVar != null) {
            multiTaskInfo.field_data = gVar.g();
        }
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(ga0.e.class)).all()).iterator();
        while (it.hasNext()) {
            fs.q qVar = (fs.q) it.next();
            if (qVar.hasKey(java.lang.Integer.valueOf(V6(a40Var)))) {
                ga0.e eVar = (ga0.e) qVar.get();
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo B9 = eVar != null ? eVar.B9(a40Var) : null;
                multiTaskInfo.field_showData = B9 != null ? B9.field_showData : null;
                multiTaskInfo.v0().set(1, a40Var.b().getTitle());
                com.tencent.mm.plugin.multitask.u0 u0Var = com.tencent.mm.plugin.multitask.u0.f150506a;
                kotlin.jvm.internal.o.f(a40Var.b().c(), "getBid(...)");
                multiTaskInfo.v0().set(7, java.lang.Boolean.valueOf(!com.tencent.mm.vfs.w6.j(u0Var.b(r2))));
            }
        }
        return multiTaskInfo;
    }
}
