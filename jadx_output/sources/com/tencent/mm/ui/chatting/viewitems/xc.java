package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class xc extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205980s;

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x006e. Please report as an issue. */
    public static boolean d0(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (!com.tencent.mm.sdk.platformtools.f9.SessionPayment.k(dVar.g(), null)) {
            return true;
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgRemittanceFrom", "[onChattingItemClickedFrom] content == null");
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_remittance_data_lose_switch, false)) {
                com.tencent.mm.ui.chatting.viewitems.bd.a(dVar.g(), f9Var.Q0());
            }
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sender_name", f9Var.Q0());
        int i17 = v17.I0;
        if (i17 != 1) {
            if (i17 != 11) {
                if (i17 != 21) {
                    switch (i17) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                            break;
                        case 7:
                            break;
                        default:
                            switch (i17) {
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                    break;
                                case 27:
                                    break;
                                default:
                                    java.lang.String str = com.tencent.mm.sdk.platformtools.t8.K0(v17.f348668i1) ? v17.f348674k : v17.f348668i1;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgRemittanceFrom", "Unrecognized type %d, probably version to low & check update! url:%s", java.lang.Integer.valueOf(v17.I0), str);
                                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                        return true;
                                    }
                                    intent.putExtra("rawUrl", str);
                                    j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
                                    return true;
                            }
                    }
                }
            }
            intent.putExtra("is_sender", true);
            intent.putExtra("appmsg_type", v17.I0);
            intent.putExtra("transfer_id", v17.L0);
            intent.putExtra(ya.b.TRANSACTION_ID, v17.K0);
            intent.putExtra("effective_date", v17.N0);
            intent.putExtra("total_fee", v17.Q0);
            intent.putExtra("fee_type", v17.R0);
            intent.putExtra("payer_name", v17.O0);
            intent.putExtra("receiver_name", v17.P0);
            intent.putExtra("transfer_attach", v17.S0);
            if (c01.z1.I()) {
                j45.l.j(dVar.g(), "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", intent, null);
                return true;
            }
            j45.l.j(dVar.g(), "remittance", ".ui.RemittanceDetailUI", intent, null);
            return true;
        }
        intent.putExtra("invalid_time", v17.M0);
        intent.putExtra("is_sender", false);
        intent.putExtra("appmsg_type", v17.I0);
        intent.putExtra("transfer_id", v17.L0);
        intent.putExtra(ya.b.TRANSACTION_ID, v17.K0);
        intent.putExtra("effective_date", v17.N0);
        intent.putExtra("total_fee", v17.Q0);
        intent.putExtra("fee_type", v17.R0);
        intent.putExtra("key_msg_id", f9Var.getMsgId());
        intent.putExtra("payer_name", v17.O0);
        intent.putExtra("receiver_name", v17.P0);
        intent.putExtra("transfer_attach", v17.S0);
        boolean I = c01.z1.I();
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = dVar.f460717l;
        if (I) {
            j45.l.p(baseChattingUIFragment, "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", intent, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP);
            return true;
        }
        j45.l.p(baseChattingUIFragment, "remittance", ".ui.RemittanceDetailUI", intent, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488511vf);
        com.tencent.mm.ui.chatting.viewitems.wc wcVar = new com.tencent.mm.ui.chatting.viewitems.wc();
        wcVar.a(xgVar, true);
        xgVar.setTag(wcVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (f9Var == null) {
            return false;
        }
        g4Var.c(d17, 100, 0, this.f205980s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return d0(dVar, f9Var);
    }

    public final void e0(com.tencent.mm.ui.chatting.viewitems.wc wcVar) {
        wcVar.clickArea.setBackgroundResource(com.tencent.mm.R.drawable.f481074k6);
        wcVar.clickArea.setPadding(0, 0, 0, 0);
        if (wcVar.f205921e != null) {
            if (com.tencent.mm.ui.bk.C()) {
                wcVar.f205918b.setAlpha(0.3f);
                wcVar.f205919c.setAlpha(0.3f);
                wcVar.f205920d.setAlpha(0.3f);
                wcVar.f205922f.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an));
                wcVar.f205922f.setAlpha(0.3f);
                wcVar.f205923g.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an));
                wcVar.f205923g.setAlpha(0.3f);
            } else {
                wcVar.f205918b.setAlpha(1.0f);
                wcVar.f205919c.setAlpha(1.0f);
                wcVar.f205920d.setAlpha(1.0f);
                wcVar.f205922f.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.adh));
                wcVar.f205922f.setAlpha(1.0f);
                wcVar.f205923g.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.adh));
                wcVar.f205923g.setAlpha(1.0f);
            }
            wcVar.f205921e.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
    }

    public final void f0(com.tencent.mm.ui.chatting.viewitems.wc wcVar) {
        wcVar.clickArea.setBackgroundResource(com.tencent.mm.R.drawable.c2c_chatfrom_remittance_expired_bg);
        wcVar.clickArea.setPadding(0, 0, 0, 0);
        if (wcVar.f205921e != null) {
            if (com.tencent.mm.ui.bk.C()) {
                wcVar.f205918b.setAlpha(0.3f);
                wcVar.f205919c.setAlpha(0.3f);
                wcVar.f205920d.setAlpha(0.3f);
                wcVar.f205922f.setAlpha(0.3f);
                wcVar.f205922f.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an));
                wcVar.f205923g.setAlpha(0.3f);
                wcVar.f205923g.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an));
            } else {
                wcVar.f205918b.setAlpha(1.0f);
                wcVar.f205919c.setAlpha(1.0f);
                wcVar.f205920d.setAlpha(1.0f);
                wcVar.f205922f.setAlpha(1.0f);
                wcVar.f205922f.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.adh));
                wcVar.f205923g.setAlpha(1.0f);
                wcVar.f205923g.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.adh));
            }
            wcVar.f205921e.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
    }

    public final void g0(com.tencent.mm.ui.chatting.viewitems.wc wcVar) {
        if (wcVar.f205921e != null) {
            if (com.tencent.mm.ui.bk.C()) {
                wcVar.f205918b.setAlpha(0.8f);
                wcVar.f205919c.setAlpha(0.8f);
                wcVar.f205920d.setAlpha(0.8f);
                wcVar.f205922f.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an));
                wcVar.f205922f.setAlpha(0.5f);
                wcVar.f205923g.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an));
                wcVar.f205923g.setAlpha(0.5f);
            } else {
                wcVar.f205918b.setAlpha(1.0f);
                wcVar.f205919c.setAlpha(1.0f);
                wcVar.f205920d.setAlpha(1.0f);
                wcVar.f205922f.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.adh));
                wcVar.f205922f.setAlpha(1.0f);
                wcVar.f205923g.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.adh));
                wcVar.f205923g.setAlpha(1.0f);
            }
            wcVar.f205921e.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return com.tencent.mm.ui.chatting.viewitems.bd.b(f9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02cb  */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 r25, yb5.d r26, rd5.d r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.xc.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
