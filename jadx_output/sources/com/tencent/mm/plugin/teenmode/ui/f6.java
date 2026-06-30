package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class f6 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f172995d;

    public f6(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI) {
        this.f172995d = teenModePrivatePwdUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        o01.a aVar = (o01.a) obj;
        if (aVar.f359284a == q01.f.f359276e) {
            com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI = this.f172995d;
            com.tencent.mm.ui.widget.dialog.u3 u3Var = teenModePrivatePwdUI.f172906m;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (aVar.f359286c == 0) {
                vh4.t1 t1Var = (vh4.t1) i95.n0.c(vh4.t1.class);
                r45.w26 w26Var = (r45.w26) aVar.f359289f;
                if (w26Var == null || (str = w26Var.f388807d) == null) {
                    str = ((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h;
                }
                t1Var.f437138h = str;
                ((vh4.t1) i95.n0.c(vh4.t1.class)).f437139i = 2;
                android.content.Intent intent = new android.content.Intent(teenModePrivatePwdUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.class);
                intent.addFlags(67108864);
                intent.putExtra("intent_from_sys_to_inner", teenModePrivatePwdUI.f172907n);
                com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI2 = this.f172995d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(teenModePrivatePwdUI2, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$doModify$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                teenModePrivatePwdUI2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(teenModePrivatePwdUI2, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$doModify$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                db5.t7.h(teenModePrivatePwdUI.getContext(), teenModePrivatePwdUI.getString(com.tencent.mm.R.string.f490480w9));
                ((vh4.t1) i95.n0.c(vh4.t1.class)).T(16);
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("result_err", aVar.f359287d);
                teenModePrivatePwdUI.setResult(0, intent2);
                teenModePrivatePwdUI.finish();
            }
        }
        return jz5.f0.f302826a;
    }
}
