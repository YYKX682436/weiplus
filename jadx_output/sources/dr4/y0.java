package dr4;

/* loaded from: classes14.dex */
public final class y0 implements xq4.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242767d;

    public y0(dr4.p1 p1Var) {
        this.f242767d = p1Var;
    }

    @Override // xq4.d
    public void Y(int i17, int i18) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoIPRenderMgr", "camera preview size apply is " + i18 + " and " + i17, new java.lang.Object[0]);
        dr4.x1 x1Var = this.f242767d.f242708g;
        if (x1Var != null) {
            dr4.c0 c0Var = x1Var.f242762b;
            if (c0Var != null) {
                c0Var.d(new android.util.Size(i18, i17));
            }
            dr4.c0 c0Var2 = x1Var.f242762b;
            if (c0Var2 != null) {
                c0Var2.f242598a = i18;
            }
            if (c0Var2 != null) {
                c0Var2.f242599b = i17;
            }
            dr4.h hVar = x1Var.f242765e;
            if (hVar != null) {
                hVar.l(new android.util.Size(i18, i17));
            }
            dr4.d2 d2Var = x1Var.f242763c;
            if (d2Var != null) {
                d2Var.l(new android.util.Size(i18, i17));
            }
        }
        gq4.v.wi().f365981o = new android.util.Size(i18, i17);
        this.f242767d.getClass();
        rq4.c cVar = qq4.c.f365987a;
        if (cVar != null) {
            java.util.HashMap hashMap = cVar.f398940b;
            sq4.b bVar = (sq4.b) hashMap.get(cVar.f398943e);
            java.lang.String str = bVar != null ? bVar.f411379g == null ? bVar.f411373a : bVar.f411382j : null;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -2057948716) {
                    if (hashCode != 931431321) {
                        if (hashCode == 1776673909 && str.equals("InitCamera")) {
                            cVar.a();
                            cVar.f398943e = null;
                        }
                    } else if (str.equals("SwitchCamera")) {
                        sq4.b bVar2 = (sq4.b) hashMap.get(cVar.f398946h);
                        if (bVar2 != null) {
                            bVar2.b();
                        }
                        rq4.a aVar = cVar.f398939a;
                        if (aVar != null) {
                            if (aVar.f398934a == 1) {
                                sq4.b bVar3 = (sq4.b) hashMap.get("SwitchCamera_1");
                                if (bVar3 != null) {
                                    long j17 = bVar3.f411380h;
                                    long j18 = cVar.f398948j;
                                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    long currentTimeMillis = j18 + (java.lang.System.currentTimeMillis() - j17);
                                    cVar.f398948j = currentTimeMillis;
                                    cVar.f398948j = currentTimeMillis / 2;
                                }
                            } else {
                                sq4.b bVar4 = (sq4.b) hashMap.get("CameraIDChanged_0");
                                if (bVar4 != null) {
                                    long j19 = bVar4.f411380h;
                                    long j27 = cVar.f398948j;
                                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    long currentTimeMillis2 = j27 + (java.lang.System.currentTimeMillis() - j19);
                                    cVar.f398948j = currentTimeMillis2;
                                    cVar.f398948j = currentTimeMillis2 / 2;
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCameraParamsReport", "switchCamera end cost " + cVar.f398948j);
                        cVar.f398943e = null;
                    }
                } else if (str.equals("SwitchPreview")) {
                    sq4.b bVar5 = (sq4.b) hashMap.get("SwitchPreview");
                    if (bVar5 != null) {
                        bVar5.b();
                    }
                    cVar.f398943e = null;
                }
            }
            cVar.a();
            cVar.f398943e = null;
        }
        xq4.a aVar2 = this.f242767d.f242704c;
        if (aVar2 != null) {
            zq4.b bVar6 = (zq4.b) aVar2;
            try {
                android.hardware.Camera.Parameters c17 = bVar6.f475044d.c();
                boolean z19 = bVar6.f475041a;
                rq4.b bVar7 = rq4.c.f398938m;
                if (z19) {
                    bVar7.a(c17, 1);
                } else {
                    bVar7.a(c17, 0);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // xq4.d
    public void e(int i17) {
    }

    @Override // xq4.d
    public void o() {
        ((ku5.t0) ku5.t0.f312615d).B(new dr4.x0(this.f242767d));
        rq4.q qVar = rq4.q.f399067a;
        rq4.q.f399071e = 1;
    }

    @Override // xq4.d
    public void q(int i17) {
        java.util.ArrayList arrayList = qq4.a.f365966a;
        java.util.Iterator it = qq4.a.f365966a.iterator();
        while (it.hasNext()) {
            ((rq4.k) ((oq4.a) it.next())).a(i17);
        }
    }

    @Override // xq4.d
    public void v(byte[] bArr, long j17, int i17, int i18, int i19, int i27, double d17) {
    }
}
