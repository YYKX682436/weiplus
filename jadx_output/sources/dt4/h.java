package dt4;

/* loaded from: classes9.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final synchronized dt4.p a(java.lang.String talker) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(talker, "talker");
        java.util.Map map = dt4.p.f243267g;
        if (!map.containsKey(talker)) {
            map.put(talker, new dt4.p(talker, null));
        }
        obj = ((java.util.LinkedHashMap) map).get(talker);
        kotlin.jvm.internal.o.d(obj);
        return (dt4.p) obj;
    }

    public final void b(android.content.Context context, java.lang.String talker, dt4.u itemData) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(itemData, "itemData");
        long j17 = itemData.f243297f;
        if (j17 <= 0) {
            return;
        }
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(talker, j17);
        java.lang.String j18 = n17.j();
        ot0.q v17 = ot0.q.v(j18);
        if (j18 == null || v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerDataCenter", "xml or content is null!");
            return;
        }
        int i17 = itemData.f243296e;
        if (i17 == 301) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sender_name", n17.Q0());
            intent.putExtra("appmsg_type", v17.I0);
            intent.putExtra("transfer_id", v17.L0);
            intent.putExtra(ya.b.TRANSACTION_ID, v17.K0);
            intent.putExtra("effective_date", v17.N0);
            intent.putExtra("total_fee", v17.Q0);
            intent.putExtra("fee_type", v17.R0);
            intent.putExtra("payer_name", v17.O0);
            intent.putExtra("receiver_name", v17.P0);
            intent.putExtra("transfer_attach", v17.S0);
            j45.l.j(context, "remittance", ".ui.RemittanceSwipeDetailUI", intent, null);
            return;
        }
        if (i17 != 201) {
            if (i17 == 101) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("bill_no", v17.f348736z1);
                intent2.putExtra("launcher_user_name", v17.I);
                intent2.putExtra("enter_scene", 1);
                intent2.putExtra("chatroom", talker);
                j45.l.j(context, "aa", ".ui.PaylistAAUI", intent2, null);
                return;
            }
            return;
        }
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putExtra("key_swipe", 1);
        intent3.putExtra("key_anim_slide", true);
        intent3.putExtra("key_way", 0);
        intent3.putExtra("key_native_url", v17.f348704r1);
        intent3.putExtra("key_username", talker);
        intent3.putExtra("key_from_username", g95.e0.d(n17));
        java.lang.String c2cSceneId = v17.f348700q1;
        kotlin.jvm.internal.o.f(c2cSceneId, "c2cSceneId");
        intent3.putExtra("scene_id", java.lang.Integer.parseInt(c2cSceneId));
        intent3.putExtra("key_invalidtime", v17.M0);
        ot0.c cVar = (ot0.c) v17.y(ot0.c.class);
        ot0.j jVar = (ot0.j) v17.y(ot0.j.class);
        intent3.putExtra("key_exclusive_username", cVar.f348421n);
        intent3.putExtra("key_cropname", cVar.f348411d);
        intent3.putExtra("key_receive_envelope_url", cVar.f348416i);
        intent3.putExtra("key_receive_envelope_md5", cVar.f348417j);
        intent3.putExtra("key_receive_envelope_dynamic_url", cVar.f348433z);
        intent3.putExtra("key_receive_envelope_dynamic_md5", cVar.A);
        intent3.putExtra("key_receive_envelope_dynamic_type", cVar.B);
        intent3.putExtra("key_receive_envelope_widget_url", cVar.f348422o);
        intent3.putExtra("key_receive_envelope_widget_md5", cVar.f348423p);
        intent3.putExtra("key_receive_envelope_widget_status_flag", cVar.f348428u);
        intent3.putExtra("key_receive_envelope_fission_info", cVar.f348429v);
        intent3.putExtra("key_packet_create_time", (int) n17.getCreateTime());
        intent3.putExtra("key_packet_source", jVar.f348540l);
        intent3.putExtra("key_detail_envelope_url", cVar.f348418k);
        intent3.putExtra("key_detail_envelope_md5", cVar.f348419l);
        intent3.putExtra("key_detail_envelope_dynamic_url", cVar.C);
        intent3.putExtra("key_detail_envelope_dynamic_md5", cVar.D);
        intent3.putExtra("key_about_url", jVar.f348538j);
        intent3.putExtra("key_packet_id", jVar.f348539k);
        intent3.putExtra("key_has_story", jVar.f348543o);
        intent3.putExtra("key_material_flag", jVar.f348544p);
        intent3.putExtra("key_msgid", n17.getMsgId());
        intent3.putExtra("key_lucky_money_can_received", true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(v17.f348704r1)) {
            try {
                intent3.putExtra("key_sendid", android.net.Uri.parse(v17.f348704r1).getQueryParameter("sendid"));
            } catch (java.lang.Exception unused) {
            }
        }
        j45.l.j(context, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent3, null);
    }

    public final int c(int i17) {
        return i17 != 101 ? i17 != 201 ? i17 != 301 ? com.tencent.mm.R.string.lhc : com.tencent.mm.R.string.i1h : com.tencent.mm.R.string.lf_ : com.tencent.mm.R.string.gat;
    }
}
