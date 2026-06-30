package hb5;

/* loaded from: classes9.dex */
public class b0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatSearchUI f280151d;

    public b0(com.tencent.mm.ui.bizchat.BizChatSearchUI bizChatSearchUI) {
        this.f280151d = bizChatSearchUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        long j18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatSearchUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.bizchat.BizChatSearchUI bizChatSearchUI = this.f280151d;
        hb5.k0 item = bizChatSearchUI.f197934o.getItem(i17);
        int i18 = item.f280210a;
        if (i18 == 1 || i18 == 2) {
            java.lang.Object obj = item.f280211b;
            if (obj instanceof s01.h) {
                s01.h hVar = (s01.h) obj;
                if (hVar != null) {
                    j18 = hVar.field_bizChatLocalId;
                }
                j18 = -1;
            } else {
                if (obj instanceof r45.uj) {
                    r45.xj xjVar = ((r45.uj) obj).f387407d;
                    java.lang.String str = bizChatSearchUI.f197926d;
                    s01.a0 a0Var = new s01.a0();
                    a0Var.field_userId = xjVar.f390153d;
                    a0Var.field_userName = xjVar.f390154e;
                    a0Var.field_brandUserName = str;
                    a0Var.field_headImageUrl = xjVar.f390156g;
                    a0Var.field_profileUrl = xjVar.f390157h;
                    a0Var.field_UserVersion = xjVar.f390155f;
                    a0Var.field_addMemberUrl = xjVar.f390159m;
                    if (!r01.q3.Vi().J0(a0Var) ? r01.q3.Vi().insert(a0Var) : true) {
                        s01.h hVar2 = new s01.h();
                        hVar2.field_bizChatServId = a0Var.field_userId;
                        hVar2.field_brandUserName = a0Var.field_brandUserName;
                        hVar2.field_chatName = a0Var.field_userName;
                        hVar2.field_chatType = 1;
                        s01.h m17 = s01.r.m(hVar2);
                        if (m17 != null) {
                            s01.b J0 = r01.q3.aj().J0(m17.field_bizChatLocalId);
                            J0.field_bizChatId = m17.field_bizChatLocalId;
                            J0.field_unReadCount = 0;
                            if (com.tencent.mm.sdk.platformtools.t8.K0(J0.field_brandUserName)) {
                                J0.field_brandUserName = m17.field_brandUserName;
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                J0.field_lastMsgTime = currentTimeMillis;
                                J0.field_flag = currentTimeMillis;
                            }
                            if (!r01.q3.aj().n1(J0)) {
                                r01.q3.aj().insert(J0);
                            }
                            j18 = m17.field_bizChatLocalId;
                        }
                    }
                }
                j18 = -1;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bizChatSearchUI.f197926d) && j18 >= 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", bizChatSearchUI.f197926d);
                intent.putExtra("key_biz_chat_id", j18);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_need_send_video", false);
                intent.putExtra("key_is_biz_chat", true);
                j45.l.u(bizChatSearchUI.getContext(), ".ui.chatting.ChattingUI", intent, null);
            }
        } else if (i18 == 6) {
            try {
                r45.co coVar = (r45.co) ((fb5.n) item.f280211b).f260898b;
                if (coVar != null) {
                    boolean l17 = r01.z.l(coVar.f371676d);
                    rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                    java.lang.String str2 = coVar.f371676d;
                    ((qv.o) u2Var).getClass();
                    boolean g17 = r01.z.g(str2);
                    qk.o b17 = r01.z.b(coVar.f371676d);
                    java.lang.String z07 = b17 == null ? null : b17.z0();
                    if (z07 == null) {
                        z07 = "";
                    }
                    if (l17) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("rawUrl", z07);
                        intent2.putExtra("useJs", true);
                        intent2.putExtra("srcUsername", coVar.f371676d);
                        intent2.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                        intent2.addFlags(67108864);
                        j45.l.j(bizChatSearchUI.getContext(), "webview", ".ui.tools.WebViewUI", intent2, null);
                        bizChatSearchUI.T6(b17, 2);
                    } else if (g17) {
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.putExtra("Contact_User", coVar.f371676d);
                        intent3.addFlags(67108864);
                        intent3.putExtra("biz_chat_from_scene", 3);
                        j45.l.u(bizChatSearchUI.getContext(), ".ui.bizchat.BizChatConversationUI", intent3, null);
                    } else {
                        android.content.Intent intent4 = new android.content.Intent();
                        intent4.addFlags(67108864);
                        intent4.putExtra("finish_direct", true);
                        intent4.putExtra("Chat_User", coVar.f371676d);
                        intent4.putExtra("chat_from_scene", 2);
                        androidx.appcompat.app.AppCompatActivity context = bizChatSearchUI.getContext();
                        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
                        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent4, context);
                        bizChatSearchUI.T6(b17, 1);
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        } else if (i18 == 3) {
            if (((java.lang.Integer) item.f280211b).intValue() == 1) {
                android.content.Intent intent5 = new android.content.Intent(bizChatSearchUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.bizchat.BizChatSearchUI.class);
                intent5.putExtra("enterprise_biz_name", bizChatSearchUI.f197926d);
                intent5.putExtra("biz_chat_search_scene", 2);
                intent5.putExtra("biz_chat_search_text", bizChatSearchUI.f197931i.g());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent5);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(bizChatSearchUI, arrayList2.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bizChatSearchUI.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(bizChatSearchUI, "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (((java.lang.Integer) item.f280211b).intValue() == 2) {
                android.content.Intent intent6 = new android.content.Intent(bizChatSearchUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.bizchat.BizChatSearchUI.class);
                intent6.putExtra("enterprise_biz_name", bizChatSearchUI.f197926d);
                intent6.putExtra("biz_chat_search_scene", 3);
                intent6.putExtra("biz_chat_search_text", bizChatSearchUI.f197931i.g());
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent6);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(bizChatSearchUI, arrayList3.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreGroupUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bizChatSearchUI.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(bizChatSearchUI, "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreGroupUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (((java.lang.Integer) item.f280211b).intValue() == 3) {
                android.content.Intent intent7 = new android.content.Intent(bizChatSearchUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.bizchat.BizChatSearchUI.class);
                intent7.putExtra("enterprise_biz_name", bizChatSearchUI.f197926d);
                intent7.putExtra("enterprise_biz_father_name", bizChatSearchUI.f197927e);
                intent7.putExtra("biz_chat_search_scene", 4);
                intent7.putExtra("biz_chat_search_text", bizChatSearchUI.f197931i.g());
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent7);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(bizChatSearchUI, arrayList4.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreAppUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bizChatSearchUI.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(bizChatSearchUI, "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreAppUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/bizchat/BizChatSearchUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
