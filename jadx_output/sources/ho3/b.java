package ho3;

/* loaded from: classes13.dex */
public class b extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho3.c f282871a;

    public b(ho3.c cVar) {
        this.f282871a = cVar;
    }

    public final void b(int i17, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FLST", "handle msg %d ", 1);
        ho3.c cVar = this.f282871a;
        if (z17) {
            long j18 = cVar.f282873a;
            if (j18 == 0) {
                cVar.f282873a = j17;
            } else if (j18 == j17) {
                return;
            } else {
                cVar.f282873a = j17;
            }
        } else if (cVar.f282873a != j17) {
            return;
        }
        if (!iq.b.l(com.tencent.mm.sdk.platformtools.x2.f193071a, false)) {
            cVar.getClass();
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 2;
            obtain.obj = java.lang.Long.valueOf(j17);
            cVar.f282874b.sendMessageAtFrontOfQueue(obtain);
            return;
        }
        java.lang.String str = "FinderLive_" + j17 + "_" + java.util.UUID.randomUUID().toString();
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finderlive_sensor_max_sampling_count, 0);
        if (Ni <= 0) {
            Ni = 0;
        }
        jo3.b bVar = new jo3.b(str, Ni);
        if (Ni > 0) {
            ot5.i iVar = io3.c.f293500d;
            java.lang.Object obj = iVar.f348878a;
            if (obj == null) {
                synchronized (iVar) {
                    obj = iVar.f348878a;
                    if (obj == null) {
                        obj = iVar.a();
                        iVar.f348878a = obj;
                    }
                }
            }
            io3.c cVar2 = (io3.c) obj;
            cVar2.c(1, i17, bVar, 0L);
            cVar2.c(3, 0, str, bVar.f300893b);
            int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finderlive_sensor_report_interval, 0);
            int i18 = bVar.f300893b;
            if (Ni2 <= i18) {
                Ni2 = i18;
            }
            if (Ni2 > 0) {
                ho3.c cVar3 = this.f282871a;
                cVar3.getClass();
                android.os.Message obtain2 = android.os.Message.obtain();
                obtain2.what = 1;
                obtain2.arg1 = i17;
                obtain2.arg2 = 0;
                obtain2.obj = java.lang.Long.valueOf(j17);
                cVar3.f282874b.sendMessageDelayed(obtain2, Ni2);
            }
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        try {
            int i17 = message.what;
            boolean z17 = true;
            if (i17 == 1) {
                int i18 = message.arg1;
                long longValue = ((java.lang.Long) message.obj).longValue();
                if (message.arg2 <= 0) {
                    z17 = false;
                }
                b(i18, longValue, z17);
            } else if (i17 == 2) {
                ((java.lang.Long) message.obj).longValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.FLST", "handle msg %d ", 1);
                ho3.c cVar = this.f282871a;
                cVar.f282874b.removeMessages(1);
                cVar.f282873a = 0L;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FLST", "handle msg %d error: %s", java.lang.Integer.valueOf(message.what), th6.toString());
        }
    }
}
