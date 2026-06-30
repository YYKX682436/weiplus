package yk5;

/* loaded from: classes11.dex */
public class h implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.voicesearch.SearchConversationResultUI f462883d;

    public h(com.tencent.mm.ui.voicesearch.SearchConversationResultUI searchConversationResultUI) {
        this.f462883d = searchConversationResultUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.voicesearch.SearchConversationResultUI searchConversationResultUI = this.f462883d;
        if (i17 < searchConversationResultUI.f211170d.getHeaderViewsCount()) {
            yj0.a.h(this, "com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int headerViewsCount = i17 - searchConversationResultUI.f211170d.getHeaderViewsCount();
        com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) searchConversationResultUI.f211171e.getItem(headerViewsCount);
        if (l4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceSearchResultUI", "null user at position = " + headerViewsCount);
            yj0.a.h(this, "com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (com.tencent.mm.storage.z3.f4(l4Var.h1())) {
            if ((c01.z1.n() & 2) == 0) {
                j45.l.j(searchConversationResultUI.getContext(), "tmessage", ".ui.TConversationUI", new android.content.Intent().putExtra("finish_direct", true), null);
            } else {
                j45.l.j(searchConversationResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
            }
        } else if (com.tencent.mm.storage.z3.u4(l4Var.h1())) {
            j45.l.j(searchConversationResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
        } else if (com.tencent.mm.storage.z3.W3(l4Var.h1())) {
            j45.l.j(searchConversationResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
        } else if (com.tencent.mm.storage.z3.v4(l4Var.h1())) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).h(l4Var.h1());
            j45.l.j(searchConversationResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
        } else {
            if (!com.tencent.mm.storage.z3.t4(l4Var.h1())) {
                if (com.tencent.mm.storage.z3.w4(l4Var.h1())) {
                    if (c01.z1.E()) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("type", 20);
                        j45.l.j(searchConversationResultUI, "readerapp", ".ui.ReaderAppUI", intent, null);
                    } else {
                        j45.l.j(searchConversationResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                    }
                } else if (com.tencent.mm.storage.z3.x4(l4Var.h1())) {
                    if ((c01.z1.n() & 262144) == 0) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("type", 11);
                        j45.l.j(searchConversationResultUI, "readerapp", ".ui.ReaderAppUI", intent2, null);
                    } else {
                        j45.l.j(searchConversationResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                    }
                } else if (com.tencent.mm.storage.z3.Q3(l4Var.h1())) {
                    j45.l.j(searchConversationResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                } else if (com.tencent.mm.storage.z3.d4(l4Var.h1())) {
                    if (c01.z1.D()) {
                        j45.l.j(searchConversationResultUI, "masssend", ".ui.MassSendHistoryUI", new android.content.Intent().putExtra("finish_direct", true), null);
                    } else {
                        j45.l.j(searchConversationResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                    }
                } else if (com.tencent.mm.storage.z3.e4(l4Var.h1())) {
                    if ((c01.z1.n() & 16) == 0) {
                        searchConversationResultUI.startActivity(com.tencent.mm.ui.chatting.ChattingUI.class, new android.content.Intent().putExtra("Chat_User", l4Var.h1()).putExtra("finish_direct", true));
                    } else {
                        j45.l.j(searchConversationResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                    }
                } else {
                    if (!com.tencent.mm.storage.z3.c4(searchConversationResultUI.f211172f) && !com.tencent.mm.storage.z3.C4(searchConversationResultUI.f211172f)) {
                        java.lang.String str2 = searchConversationResultUI.f211172f;
                        if (!(str2 != null && str2.equalsIgnoreCase("feedsapp"))) {
                            java.lang.String str3 = searchConversationResultUI.f211172f;
                            if (!(str3 != null && str3.equalsIgnoreCase("voipapp"))) {
                                java.lang.String str4 = searchConversationResultUI.f211172f;
                                if (!(str4 != null && str4.equalsIgnoreCase("voicevoipapp")) && !com.tencent.mm.storage.z3.Y3(searchConversationResultUI.f211172f)) {
                                    java.lang.String str5 = searchConversationResultUI.f211172f;
                                    if (!(str5 != null && str5.equalsIgnoreCase("qqfriend"))) {
                                        searchConversationResultUI.startActivity(com.tencent.mm.ui.chatting.ChattingUI.class, new android.content.Intent().putExtra("Chat_User", l4Var.h1()).putExtra("finish_direct", true));
                                    }
                                }
                            }
                        }
                    }
                    j45.l.j(searchConversationResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                }
                str = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
                yj0.a.h(this, "com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", str);
            }
            if ((c01.z1.n() & 1) == 0) {
                searchConversationResultUI.startActivity(com.tencent.mm.ui.chatting.ChattingUI.class, new android.content.Intent().putExtra("Chat_User", l4Var.h1()).putExtra("finish_direct", true));
            } else {
                j45.l.j(searchConversationResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
            }
        }
        str = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
        yj0.a.h(this, "com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", str);
    }
}
