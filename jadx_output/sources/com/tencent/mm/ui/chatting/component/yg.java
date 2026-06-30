package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.c1.class)
/* loaded from: classes9.dex */
public class yg extends com.tencent.mm.ui.chatting.component.a implements sb5.c1 {
    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        com.tencent.mm.autogen.events.LocationServerEvent locationServerEvent = new com.tencent.mm.autogen.events.LocationServerEvent();
        locationServerEvent.f54481g.f6559a = 2;
        locationServerEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.LocationComponent", "doDestroy: ");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        new com.tencent.mm.autogen.events.CleanStaticMapEvent().e();
    }

    @Override // yn.d
    public void h0(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 == 67 || i17 == 68) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                if (i11.u.a(com.tencent.mm.sdk.platformtools.x2.f193071a).b(this.f198580d.g())) {
                    i11.u.a(com.tencent.mm.sdk.platformtools.x2.f193071a).d(this.f198580d.g());
                    return;
                } else {
                    db5.e1.C(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.hhm), this.f198580d.s().getString(com.tencent.mm.R.string.hht), this.f198580d.s().getString(com.tencent.mm.R.string.g6z), this.f198580d.s().getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.ui.chatting.component.xg(this), null);
                    return;
                }
            }
            if (i17 == 67) {
                o0();
            } else {
                p0();
            }
        }
    }

    public boolean m0(com.tencent.mm.storage.f9 f9Var) {
        if (!f9Var.L2()) {
            return false;
        }
        com.tencent.mm.ui.chatting.ic.d(f9Var);
        this.f198580d.L(true);
        return true;
    }

    public java.util.Map n0() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e;
        hashMap.put("has_reddot", 0);
        hashMap.put("attachment_exp_sessionid", chatFooter.getAppPanel().f189929e);
        hashMap.put("chat_name", this.f198580d.x());
        java.lang.String x17 = this.f198580d.x();
        int i17 = com.tencent.mm.storage.z3.m4(x17) ? 3 : com.tencent.mm.storage.z3.N4(x17) ? 2 : 1;
        if (c01.e2.R(x17)) {
            i17 = 4;
        }
        hashMap.put("chat_type", java.lang.Integer.valueOf(i17));
        return hashMap;
    }

    public void o0() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 1, "");
        android.content.Intent intent = new android.content.Intent();
        if (this.f198580d.D()) {
            intent.putExtra("type_tag", 2);
        } else {
            intent.putExtra("type_tag", 1);
        }
        intent.putExtra("map_view_type", 0);
        intent.putExtra("map_indoor_support", 1);
        intent.putExtra("map_sender_name", this.f198580d.t());
        intent.putExtra("map_talker_name", this.f198580d.x());
        j45.l.j(this.f198580d.g(), ya.b.LOCATION, ".ui.RedirectUI", intent, null);
        com.tencent.mm.plugin.report.service.b1.f(3, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p0() {
        /*
            r4 = this;
            yb5.d r0 = r4.f198580d
            android.app.Activity r0 = r0.g()
            boolean r0 = iq.b.C(r0)
            if (r0 != 0) goto Leb
            yb5.d r0 = r4.f198580d
            android.app.Activity r0 = r0.g()
            boolean r0 = iq.b.v(r0)
            if (r0 != 0) goto Leb
            yb5.d r0 = r4.f198580d
            android.app.Activity r0 = r0.g()
            boolean r0 = iq.b.e(r0)
            if (r0 != 0) goto Leb
            java.lang.Class<com.tencent.mm.plugin.multitalk.model.y> r0 = com.tencent.mm.plugin.multitalk.model.y.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.multitalk.model.y r0 = (com.tencent.mm.plugin.multitalk.model.y) r0
            yb5.d r1 = r4.f198580d
            java.lang.String r1 = r1.x()
            boolean r0 = r0.q4(r1)
            if (r0 == 0) goto L4f
            java.lang.String r0 = "MicroMsg.ChattingUI.LocationComponent"
            java.lang.String r1 = "click share location, but now is in multitalk!"
            com.tencent.mars.xlog.Log.i(r0, r1)
            yb5.d r0 = r4.f198580d
            android.app.Activity r0 = r0.g()
            r1 = 2131772008(0x7f104268, float:1.9175363E38)
            r2 = 2131756315(0x7f10051b, float:1.9143534E38)
            db5.e1.i(r0, r1, r2)
            return
        L4f:
            r0 = 0
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r1 != 0) goto Ld2
            q21.a r1 = q21.d.a()
            if (r1 == 0) goto L96
            q21.a r1 = q21.d.a()
            yb5.d r2 = r4.f198580d
            com.tencent.mm.storage.z3 r2 = r2.u()
            java.lang.String r2 = r2.d1()
            va3.z0 r1 = (va3.z0) r1
            boolean r1 = r1.f(r2)
            if (r1 == 0) goto L96
            q21.a r1 = q21.d.a()
            yb5.d r2 = r4.f198580d
            com.tencent.mm.storage.z3 r2 = r2.u()
            java.lang.String r2 = r2.d1()
            va3.z0 r1 = (va3.z0) r1
            java.util.LinkedList r1 = r1.b(r2)
            if (r1 == 0) goto L96
            yb5.d r2 = r4.f198580d
            java.lang.String r2 = r2.t()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L96
            r1 = 1
            goto L97
        L96:
            r1 = 0
        L97:
            if (r1 != 0) goto Ld2
            yb5.d r1 = r4.f198580d
            android.app.Activity r1 = r1.g()
            com.tencent.mm.ui.widget.dialog.a r2 = new com.tencent.mm.ui.widget.dialog.a
            r2.<init>()
            r2.f211729s = r0
            android.content.res.Resources r0 = of5.b.a(r1)
            r3 = 2131769644(0x7f10392c, float:1.9170568E38)
            java.lang.String r0 = r0.getString(r3)
            r2.f211732v = r0
            com.tencent.mm.ui.chatting.component.wg r0 = new com.tencent.mm.ui.chatting.component.wg
            r0.<init>(r4)
            r2.E = r0
            com.tencent.mm.ui.widget.dialog.j0 r0 = new com.tencent.mm.ui.widget.dialog.j0
            r3 = 2131821911(0x7f110557, float:1.9276579E38)
            r0.<init>(r1, r3)
            r0.e(r2)
            com.tencent.mm.ui.widget.dialog.d0 r1 = r2.f211723m
            if (r1 == 0) goto Lce
            android.widget.EditText r2 = r0.f211837r
            r1.a(r2)
        Lce:
            r0.show()
            goto Leb
        Ld2:
            yb5.d r0 = r4.f198580d
            com.tencent.mm.ui.chatting.manager.c r0 = r0.f460708c
            java.lang.Class<sb5.j2> r1 = sb5.j2.class
            yn.e r0 = r0.a(r1)
            sb5.j2 r0 = (sb5.j2) r0
            java.lang.String r1 = "fromPluginLocation"
            com.tencent.mm.ui.chatting.component.sm r0 = (com.tencent.mm.ui.chatting.component.sm) r0
            r0.t0(r1)
            r0 = 3
            r1 = 10
            com.tencent.mm.plugin.report.service.b1.f(r0, r1)
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.yg.p0():void");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        com.tencent.mm.autogen.events.LocationServerEvent locationServerEvent = new com.tencent.mm.autogen.events.LocationServerEvent();
        am.ej ejVar = locationServerEvent.f54481g;
        ejVar.f6559a = 0;
        ejVar.f6560b = com.tencent.mm.sdk.platformtools.m2.d();
        com.tencent.mm.storage.z3.R4(this.f198580d.u().d1());
        locationServerEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.LocationComponent", "doCreate: ");
    }
}
