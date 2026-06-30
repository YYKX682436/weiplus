package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes12.dex */
public class jf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f169510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.kf f169511e;

    public jf(com.tencent.mm.plugin.sns.ui.kf kfVar, int i17) {
        this.f169511e = kfVar;
        this.f169510d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.storage.ya z07;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsChatRoomMemberUI$ChatroomMemberAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        com.tencent.mm.plugin.sns.ui.lf lfVar = this.f169511e.f169629f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        com.tencent.mm.plugin.sns.ui.ff ffVar = (com.tencent.mm.plugin.sns.ui.ff) lfVar;
        ffVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$1");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI.f166838s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI snsChatRoomMemberUI = ffVar.f168341a;
        com.tencent.mm.plugin.sns.ui.kf kfVar = snsChatRoomMemberUI.f166840e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        int i18 = this.f169510d;
        kfVar.a(i18).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        com.tencent.mm.plugin.sns.ui.kf kfVar2 = snsChatRoomMemberUI.f166840e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        com.tencent.mm.storage.z3 z3Var = kfVar2.a(i18).f168609a;
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsChatRoomMemberUI", "cont is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$1");
        } else {
            java.lang.String d17 = z3Var.d1();
            java.lang.String P0 = z3Var.P0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            com.tencent.mm.storage.a3 a3Var = snsChatRoomMemberUI.f166841f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            java.lang.String T6 = com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI.T6(snsChatRoomMemberUI, a3Var, d17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(T6)) {
                T6 = z3Var.g2();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goToContactInfo", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            if (com.tencent.mm.sdk.platformtools.t8.K0(T6) && (z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(d17)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
                T6 = z07.field_conRemark;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goToContactInfo", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", d17);
                intent.putExtra("Contact_RemarkName", T6);
                com.tencent.mm.storage.a3 a3Var2 = snsChatRoomMemberUI.f166841f;
                if (a3Var2 != null) {
                    intent.putExtra("Contact_RoomNickname", a3Var2.z0(d17));
                }
                intent.putExtra("Contact_Nick", P0);
                intent.putExtra("Contact_RoomMember", true);
                intent.putExtra("room_name", snsChatRoomMemberUI.f166845m);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(d17, true);
                if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                    com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
                    am.au auVar = setLocalQQMobileEvent.f54766g;
                    auVar.f6187a = intent;
                    auVar.f6188b = d17;
                    setLocalQQMobileEvent.e();
                }
                if (n17 != null && n17.k2()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ",14");
                }
                intent.putExtra("Contact_Scene", 14);
                intent.putExtra("Is_RoomOwner", snsChatRoomMemberUI.f166846n);
                intent.putExtra("Contact_ChatRoomId", snsChatRoomMemberUI.f166842g);
                intent.putExtra("CONTACT_INFO_UI_SOURCE", snsChatRoomMemberUI.f166850r);
                j45.l.j(snsChatRoomMemberUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goToContactInfo", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$1");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsChatRoomMemberUI$ChatroomMemberAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter$1");
    }
}
