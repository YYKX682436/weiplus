package dg5;

/* loaded from: classes9.dex */
public class u implements dg5.v, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.BaseConversationUI f232401d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f232402e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f232403f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f232404g = false;

    /* renamed from: h, reason: collision with root package name */
    public final dg5.t f232405h = new dg5.t(this);

    public u(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI, java.lang.String str) {
        this.f232401d = baseConversationUI;
        this.f232402e = str;
    }

    @Override // dg5.v
    public boolean a(android.view.View view, android.graphics.Point point, int i17, long j17, com.tencent.mm.ui.conversation.p7 p7Var) {
        dg5.t tVar = this.f232405h;
        tVar.f232397d = new rl5.r(tVar.f232400g.f232401d);
        tVar.f232398e = new dg5.s(tVar);
        int i18 = point.x;
        int i19 = point.y;
        com.tencent.mm.storage.l4 l4Var = p7Var.f207965c;
        tVar.getClass();
        if (l4Var == null) {
            return true;
        }
        tVar.f232399f = l4Var.h1();
        tVar.f232397d.g(view, i17, j17, tVar, tVar.f232398e, i18, i19);
        return true;
    }

    @Override // dg5.v
    public void b(com.tencent.mm.ui.conversation.p7 p7Var) {
        com.tencent.mm.storage.l4 l4Var = p7Var.f207965c;
        if (l4Var == null) {
            return;
        }
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String h17 = l4Var.h1();
        ((qv.o) u2Var).getClass();
        boolean g17 = r01.z.g(h17);
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f232401d;
        if (g17) {
            android.content.Intent intent = new android.content.Intent(baseConversationUI, (java.lang.Class<?>) com.tencent.mm.ui.bizchat.BizChatConversationUI.class);
            intent.putExtra("Contact_User", l4Var.h1());
            intent.putExtra("biz_chat_from_scene", 7);
            intent.addFlags(67108864);
            com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI2 = this.f232401d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(baseConversationUI2, arrayList.toArray(), "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationPresenter", "onItemClick", "(Lcom/tencent/mm/ui/conversation/MergeBizChatConversationAdapter$BizChatConversationHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            baseConversationUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(baseConversationUI2, "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationPresenter", "onItemClick", "(Lcom/tencent/mm/ui/conversation/MergeBizChatConversationAdapter$BizChatConversationHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (!r01.z.l(l4Var.h1())) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("key_is_biz_chat", false);
            baseConversationUI.startChatting(l4Var.h1(), bundle, true);
            c(r01.z.b(l4Var.h1()), 1, l4Var.d1());
            return;
        }
        qk.o b17 = r01.z.b(l4Var.h1());
        java.lang.String z07 = b17 == null ? null : b17.z0();
        if (z07 == null) {
            z07 = "";
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", z07);
        intent2.putExtra("useJs", true);
        intent2.putExtra("srcUsername", l4Var.h1());
        intent2.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
        intent2.putExtra("geta8key_scene", 51);
        intent2.addFlags(67108864);
        j45.l.j(baseConversationUI, "webview", ".ui.tools.WebViewUI", intent2, null);
        c(b17, 2, l4Var.d1());
    }

    public final void c(qk.o oVar, int i17, int i18) {
        r01.m y07 = r01.q3.bj().y0(this.f232402e);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14507, java.lang.Long.valueOf(y07 != null ? y07.field_wwCorpId : 0L), java.lang.Long.valueOf(oVar != null ? oVar.w0() : 0L), java.lang.Long.valueOf(y07 != null ? y07.field_wwUserVid : 0L), 1, java.lang.Integer.valueOf(i18 > 0 ? 1 : 2), java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gi5 gi5Var;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.protobuf.f fVar2;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f232403f;
        if (u3Var != null && u3Var.isShowing()) {
            this.f232403f.dismiss();
        }
        if (i17 == 0 && i18 == 0 && m1Var.getType() == 1394) {
            r45.mi6 mi6Var = null;
            com.tencent.mm.modelbase.o oVar = ((er3.f) m1Var).f256031e;
            r45.li6 li6Var = (oVar == null || (fVar2 = oVar.f70710a.f70684a) == null) ? null : (r45.li6) fVar2;
            if (oVar != null && (fVar = oVar.f70711b.f70700a) != null) {
                mi6Var = (r45.mi6) fVar;
            }
            if (mi6Var == null || (gi5Var = mi6Var.f380551d) == null || gi5Var.f375288d != 0) {
                if (mi6Var == null || mi6Var.f380551d == null) {
                    com.tencent.mars.xlog.Log.w("EnterpriseConversationPresenter", "chuangchen onSceneEnd type:%s, err:resp == null", java.lang.Integer.valueOf(m1Var.getType()));
                    return;
                } else {
                    com.tencent.mars.xlog.Log.w("EnterpriseConversationPresenter", "chuangchen onSceneEnd type:%s, err:code:%s", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(mi6Var.f380551d.f375288d));
                    return;
                }
            }
            if (li6Var.f379506e) {
                qk.o b17 = r01.z.b(li6Var.f379505d);
                b17.field_brandFlag |= 1;
                r45.ln4 ln4Var = new r45.ln4();
                ln4Var.f379659d = b17.field_brandFlag;
                ln4Var.f379660e = li6Var.f379505d;
                ((e21.z0) c01.d9.b().w()).c(new xg3.p0(47, ln4Var));
                r01.q3.cj().update(b17, new java.lang.String[0]);
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(b17.field_username);
                if (((com.tencent.mm.storage.m4) c01.d9.b().r()).u(b17.field_enterpriseFather) <= 0) {
                    ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(b17.field_enterpriseFather);
                } else {
                    c01.d9.b().k().b(b17.field_enterpriseFather);
                }
            }
        }
    }
}
