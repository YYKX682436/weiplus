package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class ve implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity f174374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$onCreate$dataList$1 f174375e;

    public ve(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity, com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$onCreate$dataList$1 textStatusOtherTopicFriendsActivity$onCreate$dataList$1) {
        this.f174374d = textStatusOtherTopicFriendsActivity;
        this.f174375e = textStatusOtherTopicFriendsActivity$onCreate$dataList$1;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Object obj2;
        ym3.o oVar = (ym3.o) obj;
        ym3.p pVar = oVar.f463177a;
        ym3.p pVar2 = ym3.p.f463180e;
        boolean z17 = true;
        com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity = this.f174374d;
        if (pVar == pVar2) {
            kotlinx.coroutines.r2 r2Var = textStatusOtherTopicFriendsActivity.f173660g;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.y0 b17 = v65.m.b(textStatusOtherTopicFriendsActivity);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            textStatusOtherTopicFriendsActivity.f173660g = kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.textstatus.ui.se(textStatusOtherTopicFriendsActivity, null), 2, null);
        }
        if (oVar.f463177a == ym3.p.f463181f) {
            kotlinx.coroutines.r2 r2Var2 = textStatusOtherTopicFriendsActivity.f173660g;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            textStatusOtherTopicFriendsActivity.runOnUiThread(new com.tencent.mm.plugin.textstatus.ui.te(textStatusOtherTopicFriendsActivity));
            java.util.Iterator it = this.f174375e.f152065o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((nj4.i) obj2) instanceof nj4.e) {
                        break;
                    }
                }
            }
            boolean z18 = obj2 == null;
            jz5.g gVar = textStatusOtherTopicFriendsActivity.f173667q;
            if (!z18) {
                textStatusOtherTopicFriendsActivity.W6().setVisibility(0);
                java.lang.Object value = ((jz5.n) gVar).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                ((android.view.ViewGroup) value).setVisibility(8);
                com.tencent.mm.plugin.textstatus.ui.mg.P6((com.tencent.mm.plugin.textstatus.ui.mg) textStatusOtherTopicFriendsActivity.component(com.tencent.mm.plugin.textstatus.ui.mg.class), 0, 1, null);
                return;
            }
            boolean z19 = j62.e.g().c(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusStrengthenHistory()) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.TopicExptConfig", "getTopicStrengthHistoryEntrance >> " + z19);
            if (!z19) {
                textStatusOtherTopicFriendsActivity.W6().setVisibility(8);
            }
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((android.view.ViewGroup) value2).setVisibility(0);
            java.lang.Object value3 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            ((android.view.ViewGroup) value3).setPadding(0, 0, 0, (com.tencent.mm.ui.bl.a(textStatusOtherTopicFriendsActivity.getContext()) + com.tencent.mm.ui.bl.h(textStatusOtherTopicFriendsActivity.getContext())) / 2);
            java.lang.Object value4 = ((jz5.n) textStatusOtherTopicFriendsActivity.f173668r).getValue();
            kotlin.jvm.internal.o.f(value4, "getValue(...)");
            com.tencent.mm.ui.bk.s0(((android.widget.TextView) value4).getPaint());
            mj4.h E = ai4.m0.f5173a.E();
            java.lang.String h17 = E != null ? ((mj4.k) E).h() : null;
            if (h17 != null && !r26.n0.N(h17)) {
                z17 = false;
            }
            if (!z17) {
                com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.U6(textStatusOtherTopicFriendsActivity).setVisibility(8);
                return;
            }
            com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.U6(textStatusOtherTopicFriendsActivity).setVisibility(0);
            com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.U6(textStatusOtherTopicFriendsActivity).setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.ue(textStatusOtherTopicFriendsActivity));
            qj4.s sVar = qj4.s.f363958a;
            qj4.s.l(sVar, 35L, null, null, 0L, null, 0L, 62, null);
            java.lang.String a17 = en1.a.a();
            kotlin.jvm.internal.o.d(a17);
            sVar.a(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.U6(textStatusOtherTopicFriendsActivity), new qj4.l(a17, false, 15L, null, null, null, null, 120, null));
        }
    }
}
