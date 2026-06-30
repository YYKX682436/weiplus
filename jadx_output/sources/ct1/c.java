package ct1;

/* loaded from: classes11.dex */
public abstract class c implements ct1.v {

    /* renamed from: g, reason: collision with root package name */
    public static c01.v8 f222220g;

    /* renamed from: d, reason: collision with root package name */
    public final vg3.z4 f222221d = new ct1.a(this);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.zero.a1 f222222e = new com.tencent.mm.plugin.zero.a1();

    /* renamed from: f, reason: collision with root package name */
    public final w11.u f222223f = new ct1.b(this);

    public boolean b(r45.w3 w3Var) {
        return true;
    }

    public final void c(r45.w3 w3Var) {
        r45.j4 j4Var = w3Var.f388826d;
        if (j4Var.f377564n == null) {
            j4Var.f377564n = new r45.cu5();
            com.tencent.mars.xlog.Log.e("BaseBypSyncHandler", "[processToFunctionMsg] ImgBuf is null");
        }
        com.tencent.mm.modelbase.p0 p0Var = new com.tencent.mm.modelbase.p0(w3Var.f388826d, false, false, false);
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f37061a.b1(p0Var);
    }

    public void f() {
        w11.u uVar = this.f222223f;
        if (this.f222222e.f188620a != null) {
            boolean z17 = uVar instanceof w11.z0;
            com.tencent.mm.plugin.messenger.foundation.v2 v2Var = com.tencent.mm.plugin.messenger.foundation.z2.f148769b;
            if (z17) {
                v2Var.z(uVar);
            } else if ((uVar instanceof java.lang.String) && uVar.equals("NetSceneInit")) {
                v2Var.z(uVar);
            } else if (uVar instanceof w11.u) {
                v2Var.z(uVar);
            }
        }
        com.tencent.mars.xlog.Log.i("BaseBypSyncHandler", "[finishReceive]");
    }

    public abstract int h();

    public abstract int i();

    public abstract vg3.z4 k();

    public void l(java.util.List list) {
    }

    public final void m(vg3.x3 x3Var, r45.w3 w3Var, r45.tr trVar) {
        java.lang.String g17 = x51.j1.g(w3Var.f388830h ? w3Var.f388826d.f377558e : w3Var.f388826d.f377559f);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, "");
        if (w3Var.f388830h && !g17.equals(str)) {
            ((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) x3Var).hj()).y0(g17, i());
        }
        if (i() == 11) {
            java.lang.String n17 = n(w3Var);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
                w3Var.f388826d.f377566p = n17;
            }
        } else if (w3Var.f388830h) {
            w3Var.f388826d.f377559f = x51.j1.i(w3Var.f388827e);
        } else {
            w3Var.f388826d.f377558e = x51.j1.i(w3Var.f388827e);
        }
        com.tencent.mm.modelbase.p0 p0Var = new com.tencent.mm.modelbase.p0(w3Var.f388826d, false, false, false);
        p0Var.f70732g = new r45.w3().parseFrom(trVar.f386721f.f192156a);
        p0Var.f70733h = h();
        vg3.w3 w3Var2 = (vg3.w3) i95.n0.c(vg3.w3.class);
        vg3.z4 k17 = k();
        ((com.tencent.mm.plugin.messenger.foundation.b2) w3Var2).getClass();
        com.tencent.mm.plugin.messenger.foundation.a2.b(p0Var, com.tencent.mm.booter.x1.e(), k17);
    }

    public java.lang.String n(r45.w3 w3Var) {
        return null;
    }

    public boolean o(java.lang.Exception exc) {
        return false;
    }

    public void pi(java.util.LinkedList linkedList, boolean z17) {
        int i17;
        w11.u uVar = this.f222223f;
        com.tencent.mm.plugin.zero.a1 a1Var = this.f222222e;
        com.tencent.mars.xlog.Log.i("BaseBypSyncHandler", "[onReceive] size=%s", java.lang.Integer.valueOf(linkedList.size()));
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
        try {
            try {
                a1Var.b(uVar);
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.tr trVar = (r45.tr) it.next();
                    if (trVar.f386720e == 1) {
                        r45.w3 w3Var = new r45.w3();
                        w3Var.parseFrom(trVar.f386721f.f192156a);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(w3Var.f388827e) && ((i17 = w3Var.f388826d.f377560g) == 10002 || i17 == 10001)) {
                            com.tencent.mars.xlog.Log.i("BaseBypSyncHandler", "dispatchToSysCmdMsgExtension, MsgType=%s isContinue=%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
                            c(w3Var);
                        } else if (com.tencent.mm.sdk.platformtools.t8.K0(w3Var.f388827e)) {
                            com.tencent.mars.xlog.Log.e("BaseBypSyncHandler", "msg_session_id is null! FromUserName=%s ToUserName=%s", x51.j1.g(w3Var.f388826d.f377558e), x51.j1.g(w3Var.f388826d.f377559f));
                        } else {
                            r45.j4 j4Var = w3Var.f388826d;
                            if (j4Var.f377568r == 0) {
                                com.tencent.mars.xlog.Log.e("BaseBypSyncHandler", "NewMsgId is zero! FromUserName=%s ToUserName=%s", x51.j1.g(j4Var.f377558e), x51.j1.g(w3Var.f388826d.f377559f));
                            } else if (b(w3Var)) {
                                linkedList2.add(w3Var);
                                m(x3Var, w3Var, trVar);
                            } else {
                                com.tencent.mars.xlog.Log.e("BaseBypSyncHandler", "[onReceive] ignore this msg %s", w3Var.f388827e);
                            }
                        }
                    }
                }
                l(linkedList2);
                a1Var.a(uVar);
                if (z17) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("BaseBypSyncHandler", e17, "", new java.lang.Object[0]);
                if (o(e17)) {
                    throw new java.lang.RuntimeException(e17);
                }
                l(linkedList2);
                a1Var.a(uVar);
                if (z17) {
                    return;
                }
            }
            f();
        } catch (java.lang.Throwable th6) {
            l(linkedList2);
            a1Var.a(uVar);
            if (!z17) {
                f();
            }
            throw th6;
        }
    }
}
