package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.ui.VoipViewFragment f176987a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.ui.e f176988b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f176989c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f176990d = false;

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipVoiceMiniManager", "dismiss now.. isFinish: %b, smallView: %s", java.lang.Boolean.valueOf(z17), this.f176987a);
        com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment = this.f176987a;
        if (voipViewFragment == null) {
            if (z17) {
                iq4.b.f293798a.d();
                return;
            }
            return;
        }
        if (z17) {
            iq4.b.f293798a.f0(voipViewFragment);
        }
        com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment2 = this.f176987a;
        if (voipViewFragment2 != null) {
            voipViewFragment2.getClass();
            try {
                com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView = voipViewFragment2.f176933e;
                if (baseSmallView != null) {
                    baseSmallView.j();
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoipViewFragment", "recycle bitmap failed");
            }
            this.f176987a.setOnClickListener(null);
            this.f176987a = null;
        }
    }

    public final void b(final android.content.Intent intent, boolean z17, final boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipVoiceMiniManager", "mini now..");
        com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment = this.f176987a;
        if (voipViewFragment != null) {
            this.f176988b.c(intent, voipViewFragment.a(z17, false));
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.g(context, "context");
        this.f176987a = new com.tencent.mm.plugin.voip.ui.VoipViewFragment(context, null);
        this.f176990d = false;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f176989c;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f176987a.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.voip.ui.t0$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.plugin.voip.ui.t0 t0Var = com.tencent.mm.plugin.voip.ui.t0.this;
                t0Var.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z19 = z18;
                arrayList.add(java.lang.Boolean.valueOf(z19));
                android.content.Intent intent2 = intent;
                arrayList.add(intent2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", t0Var, array);
                iq4.c cVar = iq4.b.f293798a;
                cVar.f93132d.M.f93090m = 3;
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().h0(cVar.f93132d);
                if (z19) {
                    intent2.addFlags(268435456);
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "lambda$mini$1", "(ZLandroid/content/Intent;Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context2, "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "lambda$mini$1", "(ZLandroid/content/Intent;Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    java.lang.String str = gq4.v.Bi().f176558a.f176431u;
                    boolean z27 = gq4.v.Bi().f176558a.f176432v;
                    if (android.text.TextUtils.isEmpty(str)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.VoipVoiceMiniManager", "null talkName");
                    } else {
                        ((y03.e) i95.n0.c(y03.e.class)).d8(com.tencent.mm.sdk.platformtools.x2.f193071a, str, z27, new com.tencent.mm.plugin.voip.ui.t0$$b());
                    }
                }
                com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.voip.ui.v0(t0Var), false);
                t0Var.f176989c = b4Var2;
                b4Var2.c(2000L, 2000L);
                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.voip.ui.w0(t0Var), 200L);
                yj0.a.h(t0Var, "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (z17) {
            iq4.b.f293798a.e0(4, false, this.f176987a, 1L, false);
        } else {
            iq4.b.f293798a.e0(8, false, this.f176987a, 1L, false);
        }
        iq4.b.f293798a.z();
        this.f176988b.c(intent, this.f176987a.a(z17, false));
        e(gq4.v.Bi().w());
    }

    public void c(boolean z17) {
        if (this.f176987a == null || this.f176990d) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).A("showIcon");
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.voip.ui.e1(this, z17), "showIcon");
    }

    public void d(android.content.Intent intent, boolean z17, boolean z18, com.tencent.mm.plugin.voip.ui.e eVar) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipVoiceMiniManager", "showMini, intent cannot be null!");
            return;
        }
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipVoiceMiniManager", "showMini, VoipMiniCallBack cannot be null!");
            return;
        }
        this.f176988b = eVar;
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            eVar.d();
            b(intent, z17, z18);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.VoipVoiceMiniManager", "mini, permission denied");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        java.lang.String string = context.getString(com.tencent.mm.R.string.kbt);
        com.tencent.mm.plugin.voip.ui.u0 u0Var = new com.tencent.mm.plugin.voip.ui.u0(this, eVar, intent, z17, z18);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.R6(context, 9, string, u0Var, true, false, a17);
    }

    public void e(boolean z17) {
        com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment = this.f176987a;
        if (voipViewFragment != null) {
            voipViewFragment.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipViewFragment", "showRemoteCaptureState pause is " + z17);
            com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView = voipViewFragment.f176933e;
            if (baseSmallView != null) {
                baseSmallView.i(z17);
            }
        }
    }
}
