package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class r5 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f173125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI f173126e;

    public r5(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI) {
        this.f173125d = u3Var;
        this.f173126e = teenModeGuardianInfoUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        o01.a aVar = (o01.a) obj;
        if (aVar.f359284a == q01.f.f359276e) {
            this.f173125d.dismiss();
            int i17 = aVar.f359286c;
            com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI = this.f173126e;
            if (i17 == 0) {
                db5.t7.h(teenModeGuardianInfoUI.getContext(), teenModeGuardianInfoUI.getString(com.tencent.mm.R.string.jtf));
                vh4.t1 t1Var = (vh4.t1) i95.n0.c(vh4.t1.class);
                r45.w26 w26Var = (r45.w26) aVar.f359289f;
                if (w26Var == null || (str = w26Var.f388807d) == null) {
                    str = null;
                }
                t1Var.f437138h = str;
                ((vh4.t1) i95.n0.c(vh4.t1.class)).f437139i = 2;
                if (teenModeGuardianInfoUI.getIntent().getBooleanExtra("IntentKey_DontGoPwdUI", false)) {
                    teenModeGuardianInfoUI.setResult(-1);
                    teenModeGuardianInfoUI.finish();
                } else {
                    android.content.Intent intent = new android.content.Intent(teenModeGuardianInfoUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
                    intent.putExtra("intent_process", 4);
                    intent.addFlags(67108864);
                    com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI2 = this.f173126e;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(teenModeGuardianInfoUI2, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$doScene$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    teenModeGuardianInfoUI2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(teenModeGuardianInfoUI2, "com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$doScene$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                ((vh4.t1) i95.n0.c(vh4.t1.class)).T(14);
            } else {
                com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI.Z6(teenModeGuardianInfoUI, aVar.f359287d);
                ((vh4.t1) i95.n0.c(vh4.t1.class)).T(13);
            }
        }
        return jz5.f0.f302826a;
    }
}
