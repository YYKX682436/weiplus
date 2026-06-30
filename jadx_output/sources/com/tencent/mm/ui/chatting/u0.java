package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class u0 implements android.view.View.OnClickListener, com.tencent.mm.pluginsdk.model.app.h3, com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f202726f = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/mp/readtemplate?t=wxm-appmsg-inform&bizusername=%s&tid=%s&mid=%s&mtime=%s&scene=%s#wechat_redirect";

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f202727d;

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f202728e;

    public u0(yb5.d dVar) {
        this.f202728e = dVar;
    }

    public static void b(com.tencent.mm.ui.chatting.u0 u0Var, com.tencent.mm.modelbase.m1 m1Var) {
        u0Var.getClass();
        c01.d9.e().g(m1Var);
        yb5.d dVar = u0Var.f202728e;
        u0Var.f202727d = db5.e1.Q(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.f490573yv), dVar.s().getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.chatting.t0(u0Var, m1Var));
    }

    @Override // com.tencent.mm.pluginsdk.model.app.h3
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.pluginsdk.model.app.u3 u3Var) {
        android.app.ProgressDialog progressDialog = this.f202727d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f202727d.dismiss();
            this.f202727d = null;
        }
        com.tencent.mm.pluginsdk.model.app.u5.Ai().a(2, this);
        yb5.d dVar = this.f202728e;
        if (i17 == 0 && i18 == 0) {
            db5.e1.T(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.foy));
        } else {
            if (com.tencent.mm.ui.pc.a(dVar.g(), i17, i18, str, 4)) {
                return;
            }
            dp.a.makeText(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.f492217fn4, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppSpamClickListener", "onClick tag is null");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = view.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.er;
        yb5.d dVar = this.f202728e;
        if (z17) {
            com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
            if (erVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppSpamClickListener", "ItemDataTag is null");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.String str = erVar.f203927w.f348646d;
            boolean z18 = false;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppSpamClickListener", "appId is null or nil");
            } else {
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                if (com.tencent.mm.pluginsdk.model.app.w.j(str, false, false) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppSpamClickListener", "get null appinfo : appid = " + str);
                } else {
                    z18 = true;
                }
            }
            if (!z18) {
                yj0.a.h(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.tencent.mm.pluginsdk.model.app.f Ai = com.tencent.mm.pluginsdk.model.app.u5.Ai();
            Ai.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.model.app.g(Ai, 2, this));
            int i17 = dVar.D() ? 2 : 1;
            java.lang.String x17 = dVar.x();
            if (com.tencent.mm.storage.z3.R4(x17)) {
                x17 = c01.w9.s(erVar.c().j());
            }
            ot0.q qVar = erVar.f203927w;
            erVar.c();
            db5.e1.A(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.f490474w3), dVar.s().getString(com.tencent.mm.R.string.f490475w4), dVar.s().getString(com.tencent.mm.R.string.f489792bt), dVar.s().getString(com.tencent.mm.R.string.hux), new com.tencent.mm.ui.chatting.r0(this, qVar, x17, i17), new com.tencent.mm.ui.chatting.s0(this, qVar, x17, i17));
        } else if (view.getTag() instanceof com.tencent.mm.ui.chatting.m6) {
            com.tencent.mm.ui.chatting.m6 m6Var = (com.tencent.mm.ui.chatting.m6) view.getTag();
            if (m6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppSpamClickListener", "TemplateItemDataTag is null");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(m6Var.f201947b) || m6Var.f201948c == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppSpamClickListener", "wrong args, tag is null ? ", java.lang.Boolean.FALSE);
            } else {
                db5.e1.h(dVar.g(), null, new java.lang.String[]{dVar.s().getString(com.tencent.mm.R.string.f493348ju3), dVar.s().getString(com.tencent.mm.R.string.f493349ju4), dVar.s().getString(com.tencent.mm.R.string.f490347sg)}, null, true, new com.tencent.mm.ui.chatting.q0(this, m6Var));
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.app.ProgressDialog progressDialog = this.f202727d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f202727d.dismiss();
            this.f202727d = null;
        }
        c01.d9.e().q(mc1.c.CTRL_INDEX, this);
        yb5.d dVar = this.f202728e;
        if (i17 == 0 && i18 == 0) {
            db5.e1.T(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.foy));
        } else {
            dp.a.makeText(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.f493350ju5, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
    }
}
