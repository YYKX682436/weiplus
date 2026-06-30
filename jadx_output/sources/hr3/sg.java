package hr3;

/* loaded from: classes11.dex */
public class sg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI f283983e;

    public sg(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, java.lang.String str) {
        this.f283983e = sayHiWithSnsPermissionUI;
        this.f283982d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        final com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI activity = this.f283983e;
        gr3.k.f274889a.c("view_clk", activity.f153823p, Bi.n(activity.f153826q, true), "RelationAddRequestSend");
        android.app.ProgressDialog progressDialog = activity.f153822o;
        if (progressDialog != null && progressDialog.isShowing()) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean[] zArr = activity.B1;
        boolean z17 = zArr[0];
        java.lang.String str = this.f283982d;
        fo3.s sVar = fo3.s.INSTANCE;
        if (z17) {
            zArr[0] = false;
        } else {
            sVar.qb("ce_ver_usr", "<VerifyUsr>", str);
            sVar.H2("ce_ver_usr", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_ver_usr");
        }
        sVar.c2(str, 3);
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "mCommitBtn onClick() called needVerify:%s userName:%s", java.lang.Boolean.valueOf(activity.f153831v), activity.f153826q);
        if (((j93.n) activity.component(j93.n.class)).R6()) {
            ((j93.n) activity.component(j93.n.class)).T6();
        }
        if (activity.f153831v) {
            ((hr3.gg) activity.component(hr3.gg.class)).O6(activity.c7(), new yz5.a() { // from class: hr3.hg$$b
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i17 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.O1;
                    final com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.this;
                    ((hr3.pf) sayHiWithSnsPermissionUI.component(hr3.pf.class)).Q6(new yz5.l() { // from class: hr3.hg$$c
                        @Override // yz5.l
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            java.lang.String str2;
                            java.lang.String str3;
                            java.lang.String str4;
                            r45.dz3 dz3Var = (r45.dz3) obj;
                            int i18 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.O1;
                            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI2 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.this;
                            sayHiWithSnsPermissionUI2.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "invoke() commitVerify called with: imgInfoList = [" + dz3Var + "]");
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            linkedList.add(sayHiWithSnsPermissionUI2.f153826q);
                            java.util.LinkedList linkedList2 = new java.util.LinkedList();
                            linkedList2.add(java.lang.Integer.valueOf(sayHiWithSnsPermissionUI2.f153830u));
                            java.lang.String d76 = sayHiWithSnsPermissionUI2.d7();
                            java.util.HashMap hashMap = new java.util.HashMap();
                            int O6 = ((bs3.m) pf5.z.f353948a.a(sayHiWithSnsPermissionUI2).a(bs3.m.class)).O6();
                            sayHiWithSnsPermissionUI2.E1 = O6;
                            hashMap.put(sayHiWithSnsPermissionUI2.f153826q, java.lang.Integer.valueOf(O6));
                            str2 = "";
                            if (sayHiWithSnsPermissionUI2.G) {
                                l41.f0 f0Var = new l41.f0(sayHiWithSnsPermissionUI2.f153826q, d76, sayHiWithSnsPermissionUI2.getIntent().getStringExtra("AntispamTicket"), O6);
                                sayHiWithSnsPermissionUI2.f153838y1 = sayHiWithSnsPermissionUI2.getIntent().getLongExtra("k_add_friend_verify_record_client_msg_id", 0L);
                                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(sayHiWithSnsPermissionUI2.f153826q, true);
                                if (n17 == null || !com.tencent.mm.storage.z3.m4(sayHiWithSnsPermissionUI2.f153826q)) {
                                    str3 = "";
                                    str4 = str3;
                                } else {
                                    java.lang.String str5 = n17.J1;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    str4 = n17.Q0();
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    java.lang.String G0 = n17.G0();
                                    str3 = G0 != null ? G0 : "";
                                    str2 = str5;
                                }
                                f0Var.H(sayHiWithSnsPermissionUI2.f153838y1, str2, str4, str3);
                                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "SayHiWithSnsPermissionUI sendOpenIMVerifyRequest clientMsgId=%d openImCustomInfo=%s openImAppId=%s descWordingId=%s", java.lang.Long.valueOf(sayHiWithSnsPermissionUI2.f153838y1), str2, str4, str3);
                                c01.d9.e().g(f0Var);
                                sayHiWithSnsPermissionUI2.f153822o = db5.e1.Q(sayHiWithSnsPermissionUI2.getContext(), sayHiWithSnsPermissionUI2.getString(com.tencent.mm.R.string.f490573yv), sayHiWithSnsPermissionUI2.getString(com.tencent.mm.R.string.iin), true, true, new hr3.yg(sayHiWithSnsPermissionUI2, f0Var));
                                return null;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "addTextOptionMenu:send addcontact.");
                            java.lang.String stringExtra = sayHiWithSnsPermissionUI2.getIntent().getStringExtra("source_from_user_name");
                            java.lang.String stringExtra2 = sayHiWithSnsPermissionUI2.getIntent().getStringExtra("source_from_nick_name");
                            r35.a aVar = new r35.a(sayHiWithSnsPermissionUI2, null);
                            aVar.H = sayHiWithSnsPermissionUI2.H ? "" : d76;
                            aVar.f369019t = stringExtra;
                            aVar.f369020u = stringExtra2;
                            aVar.I = hashMap;
                            java.util.List b76 = sayHiWithSnsPermissionUI2.b7(sayHiWithSnsPermissionUI2.L);
                            if (!com.tencent.mm.sdk.platformtools.t8.L0(b76)) {
                                ((java.util.LinkedList) aVar.f369005J).add(b76);
                            }
                            aVar.f369018s = sayHiWithSnsPermissionUI2.f153823p;
                            aVar.M = java.lang.System.currentTimeMillis();
                            aVar.f369007e = new hr3.dh(sayHiWithSnsPermissionUI2, d76, stringExtra, stringExtra2, hashMap, linkedList2, dz3Var, linkedList);
                            aVar.f369022w = false;
                            aVar.E = dz3Var;
                            aVar.G = new hr3.eh(sayHiWithSnsPermissionUI2);
                            gm0.j1.i();
                            com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(sayHiWithSnsPermissionUI2.f153826q, true);
                            boolean r27 = n18.r2();
                            sayHiWithSnsPermissionUI2.f153835x1 = r27;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "isContactBeforeSendVerify:%s", java.lang.Boolean.valueOf(r27));
                            aVar.k(sayHiWithSnsPermissionUI2, n18, sayHiWithSnsPermissionUI2.f153826q, linkedList2);
                            ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436679e, vg3.b.f436645e, vg3.c.f436654f, 0, new java.util.ArrayList(java.util.Collections.singletonList(sayHiWithSnsPermissionUI2.f153826q))));
                            sayHiWithSnsPermissionUI2.Z6();
                            sayHiWithSnsPermissionUI2.f153822o = db5.e1.Q(sayHiWithSnsPermissionUI2.getContext(), sayHiWithSnsPermissionUI2.getString(com.tencent.mm.R.string.f490573yv), sayHiWithSnsPermissionUI2.getString(com.tencent.mm.R.string.iin), true, true, new hr3.ig(sayHiWithSnsPermissionUI2, aVar));
                            return null;
                        }
                    });
                    return null;
                }
            });
        } else if (activity.f153833x) {
            final java.lang.String stringExtra = activity.getIntent().getStringExtra("Verify_ticket");
            kotlin.jvm.internal.o.g(activity, "activity");
            final int O6 = ((bs3.m) pf5.z.f353948a.a(activity).a(bs3.m.class)).O6();
            activity.E1 = O6;
            if (activity.G) {
                l41.h0 h0Var = new l41.h0(activity.f153826q, stringExtra, O6);
                c01.d9.e().g(h0Var);
                activity.f153822o = db5.e1.Q(activity.getContext(), activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.f490960bd4), true, true, new hr3.tg(this, h0Var));
            } else {
                ((hr3.gg) activity.component(hr3.gg.class)).O6(activity.c7(), new yz5.a() { // from class: hr3.sg$$a
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.String str2 = stringExtra;
                        int i17 = O6;
                        hr3.sg sgVar = hr3.sg.this;
                        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI activity2 = sgVar.f283983e;
                        kotlin.jvm.internal.o.g(activity2, "activity");
                        com.tencent.mm.pluginsdk.model.m3 m3Var = new com.tencent.mm.pluginsdk.model.m3(3, activity2.f153826q, str2, activity2.f153830u, activity2.f153823p, i17, activity2.L, ((hr3.ld) pf5.z.f353948a.a(activity2).a(hr3.ld.class)).R6());
                        c01.d9.e().g(m3Var);
                        activity2.f153822o = db5.e1.Q(activity2.getContext(), activity2.getString(com.tencent.mm.R.string.f490573yv), activity2.getString(com.tencent.mm.R.string.f490960bd4), true, true, new hr3.ug(sgVar, m3Var));
                        return null;
                    }
                });
            }
            ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436680f, vg3.b.f436645e, vg3.c.f436653e, 0, new java.util.ArrayList(java.util.Collections.singletonList(activity.f153826q))));
        }
        long longExtra = activity.getIntent().getLongExtra("key_msg_id", 0L);
        if (jh3.n.f(longExtra)) {
            jh3.n.i(longExtra, 4);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
