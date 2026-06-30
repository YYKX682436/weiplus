package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class b1 implements y90.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ChatroomContactUI f206616d;

    public b1(com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI) {
        this.f206616d = chatroomContactUI;
    }

    @Override // y90.j
    public void G2() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.t8.n(str);
        com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI = this.f206616d;
        if (str != null) {
            int i17 = com.tencent.mm.ui.contact.ChatroomContactUI.f206338u;
            chatroomContactUI.getClass();
            if (str.length() > 0) {
                com.tencent.mm.ui.contact.ContactCountView contactCountView = chatroomContactUI.f206340e;
                if (contactCountView != null) {
                    contactCountView.setVisible(false);
                }
                if (str != null || str.length() == 0) {
                    chatroomContactUI.f206339d.setAdapter((android.widget.ListAdapter) chatroomContactUI.f206345m);
                    chatroomContactUI.f206339d.setBackgroundColor(chatroomContactUI.getResources().getColor(com.tencent.mm.R.color.a48));
                    chatroomContactUI.f206345m.notifyDataSetChanged();
                    chatroomContactUI.f206346n.y(false);
                    chatroomContactUI.f206345m.q();
                }
                android.view.View view = chatroomContactUI.f206342g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI", "doQuery", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/contact/ChatroomContactUI", "doQuery", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                chatroomContactUI.f206339d.setAdapter((android.widget.ListAdapter) chatroomContactUI.f206346n);
                chatroomContactUI.f206339d.setBackgroundColor(chatroomContactUI.getResources().getColor(com.tencent.mm.R.color.aaw));
                chatroomContactUI.f206346n.y(true);
                yk5.u uVar = chatroomContactUI.f206346n;
                uVar.getClass();
                java.lang.String trim = str.trim();
                if (trim.startsWith("@")) {
                    trim = trim.substring(1) + "%@micromsg.with.all.biz.qq.com";
                }
                if (trim != null && !trim.equals(uVar.f462906p)) {
                    uVar.x(new yk5.r(uVar));
                }
                uVar.f462906p = trim;
                uVar.f462905o = null;
                if (trim == null) {
                    uVar.f462906p = "";
                }
                uVar.c();
                uVar.x(new yk5.q(uVar, true));
                chatroomContactUI.f206346n.notifyDataSetChanged();
                return;
            }
        }
        com.tencent.mm.ui.contact.ContactCountView contactCountView2 = chatroomContactUI.f206340e;
        if (contactCountView2 != null) {
            contactCountView2.setVisible(true);
        }
        if (str != null) {
        }
        chatroomContactUI.f206339d.setAdapter((android.widget.ListAdapter) chatroomContactUI.f206345m);
        chatroomContactUI.f206339d.setBackgroundColor(chatroomContactUI.getResources().getColor(com.tencent.mm.R.color.a48));
        chatroomContactUI.f206345m.notifyDataSetChanged();
        chatroomContactUI.f206346n.y(false);
        chatroomContactUI.f206345m.q();
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
        android.view.View view = this.f206616d.f206342g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI = this.f206616d;
        chatroomContactUI.f206339d.setAdapter((android.widget.ListAdapter) chatroomContactUI.f206345m);
        chatroomContactUI.f206345m.notifyDataSetChanged();
        chatroomContactUI.f206346n.y(false);
        android.view.View view = chatroomContactUI.f206342g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // y90.j
    public void m6() {
        this.f206616d.hideVKB();
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // y90.j
    public void o2(boolean z17, java.lang.String[] strArr, long j17, int i17) {
        com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI = this.f206616d;
        if (z17) {
            android.content.Intent intent = new android.content.Intent(chatroomContactUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.voicesearch.VoiceSearchResultUI.class);
            intent.putExtra("VoiceSearchResultUI_Resultlist", strArr);
            intent.putExtra("VoiceSearchResultUI_VoiceId", j17);
            intent.putExtra("VoiceSearchResultUI_ShowType", i17);
            androidx.appcompat.app.AppCompatActivity context = chatroomContactUI.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(chatroomContactUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.voicesearch.VoiceSearchResultUI.class);
        intent2.putExtra("VoiceSearchResultUI_Resultlist", new java.lang.String[0]);
        intent2.putExtra("VoiceSearchResultUI_Error", chatroomContactUI.getContext().getString(com.tencent.mm.R.string.f490500wu));
        intent2.putExtra("VoiceSearchResultUI_VoiceId", j17);
        intent2.putExtra("VoiceSearchResultUI_ShowType", i17);
        androidx.appcompat.app.AppCompatActivity context2 = chatroomContactUI.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
