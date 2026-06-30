package w11;

/* loaded from: classes12.dex */
public class f2 implements w11.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w11.d2 f442022a;

    public f2(w11.d2 d2Var) {
        this.f442022a = d2Var;
    }

    public void a(final r45.jj6 jj6Var, w11.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "onContinueSync continueSyncScene:%s syncDataId:%s", fVar, jj6Var.f377889m);
        x51.q1 q1Var = this.f442022a.f441999a;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: w11.f2$$a
            @Override // java.lang.Runnable
            public final void run() {
                w11.f2 f2Var = w11.f2.this;
                f2Var.getClass();
                r45.jj6 jj6Var2 = jj6Var;
                int i17 = jj6Var2.f377890n;
                w11.d2 d2Var = f2Var.f442022a;
                if (i17 != 0) {
                    if (i17 == 1) {
                        if ((jj6Var2.f377891o & 1) > 0) {
                            gm0.j1.d().g(new w11.n0(jj6Var2.f377892p, w11.c2.f441991a.a()));
                        }
                        d2Var.d(new w11.v(jj6Var2));
                        return;
                    } else {
                        if (i17 == 2) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "onContinueSync SyncDataType_LightPush onFinishCmd index:%s ", java.lang.Integer.valueOf(jj6Var2.f377894r));
                            int i18 = jj6Var2.f377894r;
                            gm0.j1.i();
                            com.tencent.mm.booter.y1.b(i18, gm0.j1.b().h());
                            d2Var.d(new w11.v(jj6Var2));
                            return;
                        }
                        return;
                    }
                }
                r45.ew4 ew4Var = jj6Var2.f377883d;
                if (ew4Var != null) {
                    if ((ew4Var.f373760f & jj6Var2.f377886g) != 0) {
                        r45.c50 c50Var = ew4Var.f373759e;
                        if (c50Var == null || !c50Var.f371295e.isEmpty() || !jj6Var2.f377887h || jj6Var2.f377895s <= 10) {
                            int i19 = jj6Var2.f377885f;
                            int i27 = jj6Var2.f377886g;
                            int i28 = jj6Var2.f377895s + 1;
                            jj6Var2.f377895s = i28;
                            d2Var.getClass();
                            d2Var.a(new z11.b(d2Var, i19, i27, i28, com.tencent.mm.booter.x1.e()));
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.SyncService", "MMKVProcessor %s onFinishCmd is continue Sync , but no Cmd , I will not continue again.", java.lang.Integer.valueOf(jj6Var2.f377888i));
                            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                            errorMsgInfoStruct.f56113e = 3556L;
                            errorMsgInfoStruct.f56117i = jj6Var2.f377888i;
                            errorMsgInfoStruct.f56118j = jj6Var2.f377883d.f373760f;
                            errorMsgInfoStruct.f56119k = jj6Var2.f377886g;
                            errorMsgInfoStruct.r(jj6Var2.f377885f + "");
                            errorMsgInfoStruct.s(jj6Var2.f377895s + "");
                            errorMsgInfoStruct.k();
                        }
                    }
                }
                d2Var.d(new w11.v(jj6Var2));
            }
        };
        q1Var.getClass();
        q1Var.a(runnable, 50L, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(r45.jj6 jj6Var, w11.u uVar) {
        if (jj6Var.f377890n == 0) {
            if (uVar == 0) {
                w11.v vVar = new w11.v(jj6Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "onSceneCallback netscene is null, use:%s", vVar.toString());
                gm0.j1.d().onSceneEnd(0, 0, "", vVar);
            } else {
                com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) uVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "onSceneCallback netscene is %s", java.lang.Integer.valueOf(m1Var.hashCode()));
                gm0.j1.d().onSceneEnd(0, 0, "", m1Var);
            }
        }
    }
}
