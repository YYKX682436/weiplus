package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class v6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f173166d;

    public v6(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI) {
        this.f173166d = teenModePrivatePwdUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (!(editable != null && editable.length() == 4)) {
            if (editable != null && editable.length() == 0) {
                return;
            }
            com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI = this.f173166d;
            int i17 = com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.f172900r;
            teenModePrivatePwdUI.j7();
            return;
        }
        com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI2 = this.f173166d;
        int i18 = com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.f172900r;
        int e76 = teenModePrivatePwdUI2.e7();
        kotlinx.coroutines.a1 a1Var = kotlinx.coroutines.a1.DEFAULT;
        o01.c cVar = o01.d.f341891a;
        if (e76 == 1 || this.f173166d.e7() == 5) {
            com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI3 = this.f173166d;
            teenModePrivatePwdUI3.getClass();
            r45.ey6 ey6Var = new r45.ey6();
            ey6Var.f373831d = teenModePrivatePwdUI3.c7(teenModePrivatePwdUI3.k7());
            teenModePrivatePwdUI3.f172906m = db5.e1.Q(teenModePrivatePwdUI3, teenModePrivatePwdUI3.getString(com.tencent.mm.R.string.f490573yv), teenModePrivatePwdUI3.getString(com.tencent.mm.R.string.jtq), true, false, null);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 6895;
            lVar.f70666c = "/cgi-bin/micromsg-bin/verifyteenagermodepwd";
            lVar.f70664a = ey6Var;
            lVar.f70665b = new r45.fy6();
            kotlinx.coroutines.flow.j a17 = cVar.a(lVar.a());
            androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(teenModePrivatePwdUI3).a(um3.b.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = ((um3.b) a18).O6();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.c(O6, kotlinx.coroutines.internal.b0.f310484a, a1Var, new com.tencent.mm.plugin.teenmode.ui.l6(a17, teenModePrivatePwdUI3, null));
            return;
        }
        if (this.f173166d.e7() == 2) {
            if (this.f173166d.h7()) {
                android.content.Intent intent = new android.content.Intent(this.f173166d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
                intent.putExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS, this.f173166d.k7());
                intent.putExtra("intent_process", 2);
                intent.putExtra("intent_process_step_one", false);
                this.f173166d.startActivityForResult(intent, 100);
                return;
            }
            if (!this.f173166d.k7().equals(this.f173166d.getIntent().getStringExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS))) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("result_err", this.f173166d.getString(com.tencent.mm.R.string.jto));
                this.f173166d.setResult(0, intent2);
                this.f173166d.finish();
                return;
            }
            com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI4 = this.f173166d;
            teenModePrivatePwdUI4.f172906m = db5.e1.Q(teenModePrivatePwdUI4, teenModePrivatePwdUI4.getString(com.tencent.mm.R.string.f490573yv), teenModePrivatePwdUI4.getString(com.tencent.mm.R.string.f490552yb), true, false, null);
            r45.v26 v26Var = new r45.v26();
            v26Var.f387827d = teenModePrivatePwdUI4.c7(teenModePrivatePwdUI4.k7());
            v26Var.f387830g = 2;
            v26Var.f387831h = ((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h;
            v26Var.f387832i = 2;
            com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
            lVar2.f70667d = 4277;
            lVar2.f70666c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
            lVar2.f70664a = v26Var;
            lVar2.f70665b = new r45.w26();
            kotlinx.coroutines.flow.j a19 = cVar.a(lVar2.a());
            androidx.lifecycle.c1 a27 = pf5.z.f353948a.a(teenModePrivatePwdUI4).a(um3.b.class);
            kotlin.jvm.internal.o.f(a27, "get(...)");
            com.tencent.mm.sdk.coroutines.LifecycleScope O62 = ((um3.b) a27).O6();
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.c(O62, kotlinx.coroutines.internal.b0.f310484a, a1Var, new com.tencent.mm.plugin.teenmode.ui.g6(a19, teenModePrivatePwdUI4, null));
            return;
        }
        if (this.f173166d.e7() == 3) {
            if (this.f173166d.h7()) {
                android.content.Intent intent3 = new android.content.Intent(this.f173166d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
                intent3.putExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS, this.f173166d.k7());
                intent3.putExtra("intent_process", 3);
                intent3.putExtra("intent_process_step_one", false);
                this.f173166d.startActivityForResult(intent3, 100);
                return;
            }
            if (!this.f173166d.k7().equals(this.f173166d.getIntent().getStringExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS))) {
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("result_err", this.f173166d.getString(com.tencent.mm.R.string.jto));
                this.f173166d.setResult(0, intent4);
                this.f173166d.finish();
                return;
            }
            if (c01.e2.a0()) {
                com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI5 = this.f173166d;
                teenModePrivatePwdUI5.f172906m = db5.e1.Q(teenModePrivatePwdUI5, teenModePrivatePwdUI5.getString(com.tencent.mm.R.string.f490573yv), teenModePrivatePwdUI5.getString(com.tencent.mm.R.string.f490552yb), true, false, null);
                r45.v26 v26Var2 = new r45.v26();
                v26Var2.f387827d = teenModePrivatePwdUI5.c7(teenModePrivatePwdUI5.k7());
                v26Var2.f387830g = 1;
                com.tencent.mm.modelbase.l lVar3 = new com.tencent.mm.modelbase.l();
                lVar3.f70667d = 4277;
                lVar3.f70666c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
                lVar3.f70664a = v26Var2;
                lVar3.f70665b = new r45.w26();
                kotlinx.coroutines.flow.j a28 = cVar.a(lVar3.a());
                androidx.lifecycle.c1 a29 = pf5.z.f353948a.a(teenModePrivatePwdUI5).a(um3.b.class);
                kotlin.jvm.internal.o.f(a29, "get(...)");
                com.tencent.mm.sdk.coroutines.LifecycleScope O63 = ((um3.b) a29).O6();
                kotlinx.coroutines.p0 p0Var3 = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.c(O63, kotlinx.coroutines.internal.b0.f310484a, a1Var, new com.tencent.mm.plugin.teenmode.ui.e6(a28, teenModePrivatePwdUI5, null));
                return;
            }
            if (this.f173166d.i7()) {
                android.content.Intent intent5 = new android.content.Intent();
                intent5.putExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS, this.f173166d.k7());
                intent5.putExtra("IntentResult_GoTeenModeGuardianInfoUI", true);
                this.f173166d.setResult(0);
            } else {
                android.content.Intent intent6 = new android.content.Intent(this.f173166d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI.class);
                intent6.putExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS, this.f173166d.k7());
                com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI6 = this.f173166d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent6);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(teenModePrivatePwdUI6, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$6", "afterTextChanged", "(Landroid/text/Editable;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                teenModePrivatePwdUI6.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(teenModePrivatePwdUI6, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$6", "afterTextChanged", "(Landroid/text/Editable;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.teenmode.ui.u6 u6Var = new com.tencent.mm.plugin.teenmode.ui.u6(this.f173166d);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(u6Var, 200L, false);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
