package fb3;

/* loaded from: classes.dex */
public final class c implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fb3.e f260853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260854b;

    public c(fb3.e eVar, java.lang.String str) {
        this.f260853a = eVar;
        this.f260854b = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String str2;
        android.content.Intent intent;
        fb3.e eVar;
        fb3.e eVar2 = this.f260853a;
        if (!z17) {
            if (eVar2.f260858f) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.String str3 = eVar2.f260856d;
                g0Var.d(27809, 4, str3, str3, this.f260854b, eVar2.f260857e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 12);
                return;
            } else {
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.String str4 = eVar2.f260856d;
                g0Var2.d(27809, 4, str4, str4, this.f260854b, eVar2.f260857e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
                return;
            }
        }
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
        android.content.Intent intent2 = new android.content.Intent(eVar2.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.class);
        if (eVar2.f260858f) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.String str5 = eVar2.f260856d;
            g0Var3.d(27809, 3, str5, str5, this.f260854b, eVar2.f260857e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 12);
            intent2.putExtra("key_way", 11);
            intent2.putExtra("key_from", 5);
            str2 = "key_from";
            intent = intent2;
            eVar = eVar2;
        } else {
            com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.String str6 = eVar2.f260856d;
            str2 = "key_from";
            intent = intent2;
            eVar = eVar2;
            g0Var4.d(27809, 3, str6, str6, this.f260854b, eVar2.f260857e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
            intent.putExtra("key_way", 9);
            intent.putExtra(str2, 4);
        }
        java.lang.String str7 = this.f260854b;
        if (com.tencent.mm.storage.z3.R4(str7)) {
            intent.putExtra("key_chatroom_num", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str7));
            intent.putExtra("key_type", 1);
            intent.putExtra(str2, 1);
            intent.putExtra("key_username", str7);
            intent.putExtra("pay_channel", 14);
            intent.putExtra("key_enter_from_quick_send_packet", true);
            intent.putExtra("key_session_id", eVar.f260857e);
            intent.putExtra("key_quick_send_packet_origin_materialid", eVar.f260856d);
        } else {
            intent.putExtra("key_type", 0);
            intent.putExtra(str2, 1);
            intent.putExtra("key_username", str7);
            intent.putExtra("pay_channel", 11);
            intent.putExtra("key_enter_from_quick_send_packet", true);
            intent.putExtra("key_session_id", eVar.f260857e);
            intent.putExtra("key_quick_send_packet_origin_materialid", eVar.f260856d);
        }
        eVar.getActivity().startActivityForResult(intent, eVar.f260859g);
    }
}
