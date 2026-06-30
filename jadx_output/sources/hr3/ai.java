package hr3;

/* loaded from: classes11.dex */
public class ai implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f283407e;

    public ai(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, java.lang.String str) {
        this.f283407e = sayHiWithSnsPermissionUI3;
        this.f283406d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gm0.j1.i();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        final com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f283407e;
        gr3.k.f274889a.c("view_clk", sayHiWithSnsPermissionUI3.f153859u, Bi.n(sayHiWithSnsPermissionUI3.f153860v, true), "RelationAddRequestSend");
        android.app.ProgressDialog progressDialog = sayHiWithSnsPermissionUI3.f153858t;
        if (progressDialog != null && progressDialog.isShowing()) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean[] zArr = sayHiWithSnsPermissionUI3.G1;
        int i17 = 0;
        boolean z17 = zArr[0];
        java.lang.String str = this.f283406d;
        fo3.s sVar = fo3.s.INSTANCE;
        if (z17) {
            zArr[0] = false;
        } else {
            sVar.qb("ce_ver_usr", "<VerifyUsr>", str);
            sVar.H2("ce_ver_usr", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_ver_usr");
        }
        if (!sayHiWithSnsPermissionUI3.g7() && !sayHiWithSnsPermissionUI3.f7() && sayHiWithSnsPermissionUI3.G) {
            android.widget.TextView textView = (android.widget.TextView) sayHiWithSnsPermissionUI3.findViewById(com.tencent.mm.R.id.nxx);
            textView.setText(com.tencent.mm.R.string.hmw);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) sayHiWithSnsPermissionUI3.findViewById(com.tencent.mm.R.id.nxw);
            int color = sayHiWithSnsPermissionUI3.getResources().getColor(com.tencent.mm.R.color.f478714f5);
            int color2 = sayHiWithSnsPermissionUI3.getResources().getColor(com.tencent.mm.R.color.Brand_100);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewGroup, "translationX", 0.0f, -20.0f, 0.0f, 20.0f, 0.0f);
            ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            if (sayHiWithSnsPermissionUI3.K1 == 0) {
                android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(color), java.lang.Integer.valueOf(color2));
                ofObject.addUpdateListener(new hr3.rh(sayHiWithSnsPermissionUI3, textView));
                ofObject.addListener(new hr3.sh(sayHiWithSnsPermissionUI3, null));
                animatorSet.play(ofObject).with(ofFloat);
            } else {
                textView.setTextColor(color2);
                animatorSet.play(ofFloat);
            }
            animatorSet.setDuration(300);
            animatorSet.start();
            com.tencent.mm.ui.jk.a();
            sayHiWithSnsPermissionUI3.K1++;
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        sVar.c2(str, 3);
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "mCommitBtn onClick() called needVerify:%s userName:%s", java.lang.Boolean.valueOf(sayHiWithSnsPermissionUI3.A), sayHiWithSnsPermissionUI3.f153860v);
        if (((j93.n) sayHiWithSnsPermissionUI3.component(j93.n.class)).R6()) {
            ((j93.n) sayHiWithSnsPermissionUI3.component(j93.n.class)).T6();
        }
        if (sayHiWithSnsPermissionUI3.A) {
            ((hr3.gg) sayHiWithSnsPermissionUI3.component(hr3.gg.class)).O6(sayHiWithSnsPermissionUI3.a7(), new yz5.a() { // from class: hr3.hh$$b
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i18 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.R1;
                    final com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI32 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this;
                    ((hr3.pf) sayHiWithSnsPermissionUI32.component(hr3.pf.class)).Q6(new yz5.l() { // from class: hr3.hh$$c
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // yz5.l
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            int i19;
                            java.lang.String str2;
                            java.lang.String str3;
                            java.lang.String str4;
                            r45.dz3 dz3Var = (r45.dz3) obj;
                            int i27 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.R1;
                            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI33 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this;
                            sayHiWithSnsPermissionUI33.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "invoke() commitVerify called with: imgInfoList = [" + dz3Var + "]");
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            linkedList.add(sayHiWithSnsPermissionUI33.f153860v);
                            java.util.LinkedList linkedList2 = new java.util.LinkedList();
                            linkedList2.add(java.lang.Integer.valueOf(sayHiWithSnsPermissionUI33.f153868z));
                            java.lang.String b76 = sayHiWithSnsPermissionUI33.b7();
                            java.util.HashMap hashMap = new java.util.HashMap();
                            if (sayHiWithSnsPermissionUI33.g7()) {
                                i19 = 0;
                            } else {
                                boolean z18 = sayHiWithSnsPermissionUI33.f153851o.f211363x;
                                i19 = z18;
                                if (sayHiWithSnsPermissionUI33.f153852p.f211363x) {
                                    i19 = (z18 ? 1 : 0) | 2;
                                }
                            }
                            int i28 = i19;
                            if (sayHiWithSnsPermissionUI33.g7()) {
                                i28 = (i19 == true ? 1 : 0) | 8;
                            }
                            sayHiWithSnsPermissionUI33.J1 = i28;
                            hashMap.put(sayHiWithSnsPermissionUI33.f153860v, java.lang.Integer.valueOf(i28));
                            str2 = "";
                            if (sayHiWithSnsPermissionUI33.K) {
                                l41.f0 f0Var = new l41.f0(sayHiWithSnsPermissionUI33.f153860v, b76, sayHiWithSnsPermissionUI33.getIntent().getStringExtra("AntispamTicket"), i28);
                                long longExtra = sayHiWithSnsPermissionUI33.getIntent().getLongExtra("k_add_friend_verify_record_client_msg_id", 0L);
                                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(sayHiWithSnsPermissionUI33.f153860v, true);
                                if (n17 == null || !com.tencent.mm.storage.z3.m4(sayHiWithSnsPermissionUI33.f153860v)) {
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
                                f0Var.H(longExtra, str2, str4, str3);
                                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "SayHiWithSnsPermissionUI3 sendOpenIMVerifyRequest clientMsgId=%d openImCustomInfo=%s openImAppId=%s descWordingId=%s", java.lang.Long.valueOf(longExtra), str2, str4, str3);
                                c01.d9.e().g(f0Var);
                                sayHiWithSnsPermissionUI33.f153858t = db5.e1.Q(sayHiWithSnsPermissionUI33.getContext(), sayHiWithSnsPermissionUI33.getString(com.tencent.mm.R.string.f490573yv), sayHiWithSnsPermissionUI33.getString(com.tencent.mm.R.string.iin), true, true, new hr3.fi(sayHiWithSnsPermissionUI33, f0Var));
                                return null;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "addTextOptionMenu:send addcontact.");
                            java.lang.String stringExtra = sayHiWithSnsPermissionUI33.getIntent().getStringExtra("source_from_user_name");
                            java.lang.String stringExtra2 = sayHiWithSnsPermissionUI33.getIntent().getStringExtra("source_from_nick_name");
                            r35.a aVar = new r35.a(sayHiWithSnsPermissionUI33, null);
                            aVar.H = sayHiWithSnsPermissionUI33.V ? "" : b76;
                            aVar.f369019t = stringExtra;
                            aVar.f369020u = stringExtra2;
                            aVar.I = hashMap;
                            aVar.f369018s = sayHiWithSnsPermissionUI33.f153859u;
                            aVar.M = java.lang.System.currentTimeMillis();
                            aVar.f369007e = new hr3.ki(sayHiWithSnsPermissionUI33, b76, stringExtra, stringExtra2, hashMap, linkedList2, dz3Var, linkedList);
                            aVar.f369022w = false;
                            aVar.E = dz3Var;
                            aVar.G = new hr3.ih(sayHiWithSnsPermissionUI33);
                            gm0.j1.i();
                            com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(sayHiWithSnsPermissionUI33.f153860v, true);
                            boolean r27 = n18.r2();
                            sayHiWithSnsPermissionUI33.D1 = r27;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "isContactBeforeSendVerify:%s", java.lang.Boolean.valueOf(r27));
                            aVar.k(sayHiWithSnsPermissionUI33, n18, sayHiWithSnsPermissionUI33.f153860v, linkedList2);
                            sayHiWithSnsPermissionUI33.Y6();
                            sayHiWithSnsPermissionUI33.f153858t = db5.e1.Q(sayHiWithSnsPermissionUI33.getContext(), sayHiWithSnsPermissionUI33.getString(com.tencent.mm.R.string.f490573yv), sayHiWithSnsPermissionUI33.getString(com.tencent.mm.R.string.iin), true, true, new hr3.jh(sayHiWithSnsPermissionUI33, aVar));
                            return null;
                        }
                    });
                    return null;
                }
            });
        } else if (sayHiWithSnsPermissionUI3.C) {
            final java.lang.String stringExtra = sayHiWithSnsPermissionUI3.getIntent().getStringExtra("Verify_ticket");
            if (!sayHiWithSnsPermissionUI3.g7()) {
                boolean z18 = sayHiWithSnsPermissionUI3.f153851o.f211363x;
                i17 = z18;
                if (sayHiWithSnsPermissionUI3.f153852p.f211363x) {
                    i17 = (z18 ? 1 : 0) | 2;
                }
            }
            final int i18 = i17;
            if (sayHiWithSnsPermissionUI3.g7()) {
                i18 = (i17 == true ? 1 : 0) | 8;
            }
            sayHiWithSnsPermissionUI3.J1 = i18;
            if (sayHiWithSnsPermissionUI3.K) {
                l41.h0 h0Var = new l41.h0(sayHiWithSnsPermissionUI3.f153860v, stringExtra, i18);
                c01.d9.e().g(h0Var);
                sayHiWithSnsPermissionUI3.f153858t = db5.e1.Q(sayHiWithSnsPermissionUI3.getContext(), sayHiWithSnsPermissionUI3.getString(com.tencent.mm.R.string.f490573yv), sayHiWithSnsPermissionUI3.getString(com.tencent.mm.R.string.f490960bd4), true, true, new hr3.bi(this, h0Var));
            } else {
                ((hr3.gg) sayHiWithSnsPermissionUI3.component(hr3.gg.class)).O6(sayHiWithSnsPermissionUI3.a7(), new yz5.a() { // from class: hr3.ai$$a
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.String str2 = stringExtra;
                        int i19 = i18;
                        hr3.ai aiVar = hr3.ai.this;
                        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 activity = aiVar.f283407e;
                        kotlin.jvm.internal.o.g(activity, "activity");
                        com.tencent.mm.pluginsdk.model.m3 m3Var = new com.tencent.mm.pluginsdk.model.m3(3, activity.f153860v, str2, activity.f153868z, activity.f153859u, i19, activity.N, ((hr3.ld) pf5.z.f353948a.a(activity).a(hr3.ld.class)).R6());
                        c01.d9.e().g(m3Var);
                        activity.f153858t = db5.e1.Q(activity.getContext(), activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.f490960bd4), true, true, new hr3.ci(aiVar, m3Var));
                        return null;
                    }
                });
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
