package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.g.class)
/* loaded from: classes9.dex */
public final class h0 extends com.tencent.mm.ui.chatting.component.a implements sb5.g {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f199134e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f199135f = new com.tencent.mm.ui.chatting.component.g0(this);

    @Override // yn.d
    public void Z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsComponent", "onFinish");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        java.util.Set set = this.f199134e;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsComponent", "onChattingInit %s, exposedMsgs: %d", this, java.lang.Integer.valueOf(set.size()));
        set.clear();
    }

    public final boolean m0() {
        if (!((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui()) {
            return false;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f198580d.x(), true);
        if ((n17 == null || n17.m2()) ? false : true) {
            return false;
        }
        return ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Bi(this.f198580d.x());
    }

    public boolean n0() {
        return kotlin.jvm.internal.o.b("BrandEcsTemplateMsg@fakeuser", this.f198580d.x());
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (m0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsComponent", "onChattingResume, username: ".concat(this.f198580d.x()));
            bw.k kVar = (bw.k) i95.n0.c(bw.k.class);
            java.lang.String x17 = this.f198580d.x();
            zv.e2 e2Var = (zv.e2) kVar;
            e2Var.getClass();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            r45.r06 r06Var = new r45.r06();
            r06Var.f384403d = x17;
            r06Var.f384404e = 1;
            lVar.f70664a = r06Var;
            lVar.f70665b = new r45.s06();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/timeline/serviceuseractionreport";
            lVar.f70667d = 28908;
            com.tencent.mm.modelbase.z2.d(lVar.a(), new zv.d2(e2Var), false);
            bw.j jVar = (bw.j) i95.n0.c(bw.j.class);
            java.lang.String x18 = this.f198580d.x();
            ((zv.o0) jVar).getClass();
            if (zv.q.f476079a.g()) {
                kk.l lVar2 = ow.y.f349274a;
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsPrivateNoticeMsgLogic", "inChatting");
                ow.y.f349275b.put(x18, java.lang.Boolean.TRUE);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        if (!n0()) {
            if (m0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsComponent", "onChattingPause, username: ".concat(this.f198580d.x()));
                bw.j jVar = (bw.j) i95.n0.c(bw.j.class);
                java.lang.String x17 = this.f198580d.x();
                ((zv.o0) jVar).getClass();
                if (zv.q.f476079a.g()) {
                    kk.l lVar = ow.y.f349274a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsPrivateNoticeMsgLogic", "outChatting");
                    ow.y.f349275b.remove(x17);
                    return;
                }
                return;
            }
            return;
        }
        boolean z17 = false;
        java.lang.Boolean booleanExtra = this.f198580d.f460717l.getBooleanExtra("key_is_jump_from_brs_box", false);
        kotlin.jvm.internal.o.f(booleanExtra, "getBooleanExtra(...)");
        if (booleanExtra.booleanValue()) {
            pm0.v.K(null, com.tencent.mm.ui.chatting.component.e0.f198953d);
            return;
        }
        if (this.f198580d.l() != null) {
            java.lang.Boolean booleanExtra2 = this.f198580d.f460717l.getBooleanExtra("KIsHalfScreen", false);
            kotlin.jvm.internal.o.f(booleanExtra2, "getBooleanExtra(...)");
            if (booleanExtra2.booleanValue()) {
                z17 = true;
            }
        }
        boolean z18 = ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).f199695s;
        if (z17 && z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsComponent", "onChattingPause halfScreen and markUnread, skip");
        } else {
            pm0.v.K(null, com.tencent.mm.ui.chatting.component.f0.f199000d);
        }
    }
}
