package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public class u implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI f150304d;

    public u(com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI multiTalkSelectContactUI) {
        this.f150304d = multiTalkSelectContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        if (com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f150304d.F);
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ",");
            com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI multiTalkSelectContactUI = this.f150304d;
            if (multiTalkSelectContactUI.H) {
                int size = multiTalkSelectContactUI.F.size();
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI multiTalkSelectContactUI2 = this.f150304d;
                com.tencent.mm.plugin.multitalk.model.u0.f(size, multiTalkSelectContactUI2.L, 1, "", multiTalkSelectContactUI2.I.f408694p);
                if (((jp5.o) i95.n0.c(jp5.o.class)).ib()) {
                    ((jp5.o) i95.n0.c(jp5.o.class)).Jh(c01.z1.r(), new java.util.ArrayList(linkedList), this.f150304d.C);
                } else {
                    linkedList.add(c01.z1.r());
                    java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ",");
                    com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
                    final com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI multiTalkSelectContactUI3 = this.f150304d;
                    java.lang.String str = multiTalkSelectContactUI3.C;
                    java.lang.Object[] objArr = new java.lang.Object[5];
                    objArr[0] = java.lang.Boolean.valueOf(Ri.f150162e);
                    objArr[1] = java.lang.Boolean.valueOf(Ri.f150163f);
                    objArr[2] = java.lang.Boolean.valueOf(Ri.f150166i);
                    objArr[3] = Ri.f150176s.toString();
                    objArr[4] = java.lang.Boolean.valueOf(Ri.f150177t == null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "createMultiTalk All Var Value:\n isMute: %b isHandsFree: %b isCameraFace: %b multiTalkStatus: %s groupIsNull: %b", objArr);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(220L, 0L, 1L, false);
                    if (com.tencent.mm.sdk.platformtools.l5.Bi()) {
                        db5.e1.i(multiTalkSelectContactUI3, com.tencent.mm.R.string.f492319g14, com.tencent.mm.R.string.f490573yv);
                    } else if (vq4.p0.c()) {
                        db5.e1.i(multiTalkSelectContactUI3, com.tencent.mm.R.string.g19, com.tencent.mm.R.string.f490573yv);
                    } else if (vq4.p0.d()) {
                        db5.e1.i(multiTalkSelectContactUI3, com.tencent.mm.R.string.g18, com.tencent.mm.R.string.f490573yv);
                    } else if (p21.i.a()) {
                        db5.e1.i(multiTalkSelectContactUI3, com.tencent.mm.R.string.f492318g13, com.tencent.mm.R.string.f490573yv);
                    } else if (Ri.x()) {
                        p21.i.b(multiTalkSelectContactUI3, com.tencent.mm.R.string.h1r, null);
                    } else {
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - Ri.A;
                        if (!Ri.f150187z || currentTimeMillis >= Ri.B) {
                            Ri.f150187z = false;
                            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
                            i4Var.Z = new com.tencent.mm.plugin.multitalk.ilinkservice.u4() { // from class: com.tencent.mm.plugin.multitalk.model.v0$$a
                                @Override // com.tencent.mm.plugin.multitalk.ilinkservice.u4
                                public final void a(int i17, java.lang.String str2) {
                                    android.app.Activity activity = multiTalkSelectContactUI3;
                                    if (i17 != 92006 || str2 == null) {
                                        com.tencent.mm.plugin.multitalk.model.e3.Ri().N(activity);
                                        return;
                                    }
                                    com.tencent.mm.plugin.multitalk.model.v0 Ri2 = com.tencent.mm.plugin.multitalk.model.e3.Ri();
                                    Ri2.getClass();
                                    android.content.Intent intent = new android.content.Intent();
                                    intent.putExtra("rawUrl", str2);
                                    intent.putExtra("showShare", false);
                                    intent.putExtra("show_bottom", false);
                                    intent.putExtra("needRedirect", false);
                                    intent.putExtra("neverGetA8Key", true);
                                    intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                                    intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
                                    j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
                                    com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.Z = null;
                                    if (activity != null) {
                                        activity.finish();
                                        Ri2.K();
                                    }
                                    Ri2.f(false, false);
                                }
                            };
                            com.tencent.mm.sdk.platformtools.t8.P1(c18.split(","));
                            sj3.e4 e4Var = Ri.f150176s;
                            if (e4Var != sj3.e4.Init) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "already in multitalk! cannot start again, status:%s", e4Var.toString());
                                i4Var.Z = null;
                            } else {
                                Ri.D(sj3.e4.Creating);
                                java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(c18.split(","));
                                synchronized (Ri.T) {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.util.Iterator it = P1.iterator();
                                    while (it.hasNext()) {
                                        java.lang.String str2 = (java.lang.String) it.next();
                                        com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = new com.tencent.mm.plugin.multitalk.ilinkservice.w();
                                        wVar.f149842c = str2;
                                        wVar.f149844e = 2;
                                        arrayList.add(wVar);
                                    }
                                    com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
                                    i4Var2.N(com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().f273148a.a(1)), c01.z1.r());
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve:  enter newMultiTalkInvite. %s, %s", arrayList, str);
                                    i4Var2.f149643p1 = str;
                                    i4Var2.J(new com.tencent.mm.plugin.multitalk.ilinkservice.n1(i4Var2, arrayList, str));
                                    Ri.O(str, 2);
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12722, 1);
                                    zj3.i.f473328a.d();
                                }
                            }
                            com.tencent.mm.autogen.events.MultiTalkStatusEvent multiTalkStatusEvent = new com.tencent.mm.autogen.events.MultiTalkStatusEvent();
                            multiTalkStatusEvent.f54506g.f6474a = true;
                            multiTalkStatusEvent.e();
                            gi.q0 q0Var = new gi.q0("MultiTalk");
                            Ri.Y = q0Var;
                            q0Var.b();
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "createMultiTalk, isOverLoadFail is true! elapsedWaitMs:" + currentTimeMillis + ", overLoadFailTimeLimit:" + Ri.B);
                            int ceil = (int) java.lang.Math.ceil(((double) (Ri.B - currentTimeMillis)) / 1000.0d);
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.h2n, java.lang.Integer.valueOf(ceil)), 0).show();
                        }
                    }
                }
                this.f150304d.finish();
            } else {
                com.tencent.mm.plugin.multitalk.model.u0.f(multiTalkSelectContactUI.F.size(), this.f150304d.L, 2, com.tencent.mm.plugin.multitalk.model.o2.e(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t), 0);
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI multiTalkSelectContactUI4 = this.f150304d;
                multiTalkSelectContactUI4.setResult(-1, multiTalkSelectContactUI4.getIntent().putExtra("Select_Contact", c17));
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI multiTalkSelectContactUI5 = this.f150304d;
                multiTalkSelectContactUI5.D = false;
                multiTalkSelectContactUI5.finish();
            }
        } else {
            p21.i.b(this.f150304d, com.tencent.mm.R.string.f490500wu, null);
        }
        this.f150304d.hideVKB();
        return true;
    }
}
