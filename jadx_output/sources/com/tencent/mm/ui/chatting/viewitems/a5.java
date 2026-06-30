package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class a5 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203283s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488536wc);
        com.tencent.mm.ui.chatting.viewitems.y4 y4Var = new com.tencent.mm.ui.chatting.viewitems.y4();
        y4Var.b(xgVar, false);
        xgVar.setTag(y4Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        menuItem.getItemId();
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        g4Var.c(((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d(), 100, 0, this.f203283s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String U1 = f9Var.U1();
        if (U1 != null) {
            ot0.q v17 = ot0.q.v(U1);
            java.lang.String str = com.tencent.mm.sdk.platformtools.t8.K0(v17.f348668i1) ? v17.f348674k : v17.f348668i1;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(v17.f348704r1)) {
                ot0.d dVar2 = (ot0.d) v17.y(ot0.d.class);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_native_url", v17.f348704r1);
                intent.putExtra("key_image_id", v17.f348716u1);
                intent.putExtra("key_image_aes_key", v17.f348720v1);
                intent.putExtra("key_image_length", v17.f348724w1);
                intent.putExtra("key_username", dVar.x());
                intent.putExtra("key_msgid", f9Var.getMsgId());
                intent.putExtra("key_msg_newyear_localreceivestatus", dVar2.f348439c);
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = dVar2.f348438b;
                if (emojiInfo != null) {
                    intent.putExtra("key_emoji_md5", emojiInfo.field_md5);
                }
                ot0.e eVar = (ot0.e) v17.y(ot0.e.class);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(eVar.f348443c)) {
                    intent.putExtra("key_voice_url", eVar.f348442b);
                    intent.putExtra("key_voice_asekey", eVar.f348443c);
                    intent.putExtra("key_voice_length", eVar.f348444d);
                    intent.putExtra("key_voice_play_time", eVar.f348445e);
                    intent.putExtra("key_voice_keyword", eVar.f348447g);
                }
                j45.l.j(dVar.g(), "luckymoney", ".ui.LuckyMoneyNewYearReceiveUIV2", intent, null);
            } else if ("1004".equals(v17.f348700q1) && !com.tencent.mm.sdk.platformtools.t8.K0(v17.H1)) {
                ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).wi(v17.f348712t1, java.lang.Long.valueOf(f9Var.getMsgId()));
                com.tencent.mm.ui.chatting.viewitems.b5.a(dVar.g(), v17.f348674k, v17.H1);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).wi(v17.f348712t1, java.lang.Long.valueOf(f9Var.getMsgId()));
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("rawUrl", str);
                j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent2, null);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f203283s = dVar;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.tencent.mm.ui.chatting.viewitems.y4 y4Var = (com.tencent.mm.ui.chatting.viewitems.y4) g0Var;
        ot0.d dVar3 = (ot0.d) v17.y(ot0.d.class);
        if (v17.G1 == 1) {
            y4Var.a(2, this);
            if (dVar3.f348439c == 0) {
                y4Var.f206028d.setBackgroundResource(com.tencent.mm.R.drawable.cal);
                y4Var.f206029e.setBackgroundResource(com.tencent.mm.R.drawable.c_u);
                y4Var.f206027c.setVisibility(8);
            } else {
                y4Var.f206028d.setBackgroundResource(com.tencent.mm.R.drawable.cam);
                y4Var.f206029e.setBackgroundResource(com.tencent.mm.R.drawable.c_v);
                y4Var.f206027c.setVisibility(0);
                int i17 = dVar3.f348439c;
                if (i17 == 1) {
                    y4Var.f206027c.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492427gm0));
                } else if (i17 == 2) {
                    y4Var.f206027c.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492430gm3));
                }
            }
        } else {
            y4Var.a(1, this);
            if (dVar3.f348439c == 0) {
                if (com.tencent.mm.ui.bk.C()) {
                    y4Var.f206029e.setBackgroundResource(com.tencent.mm.R.drawable.a_t);
                } else {
                    y4Var.f206029e.setBackgroundResource(com.tencent.mm.R.drawable.a_t);
                }
                y4Var.f206035k.setVisibility(8);
                y4Var.f206035k.setTextColor(android.graphics.Color.parseColor("#FFE2B1"));
                y4Var.f206034j.setTextColor(android.graphics.Color.parseColor("#FFE2B1"));
                y4Var.f206033i.setIconColor(android.graphics.Color.parseColor("#FFE2B1"));
            } else {
                if (com.tencent.mm.ui.bk.C()) {
                    y4Var.f206029e.setBackgroundResource(com.tencent.mm.R.drawable.c6u);
                    y4Var.f206035k.setTextColor(android.graphics.Color.parseColor("#7FFFE2B1"));
                    y4Var.f206034j.setTextColor(android.graphics.Color.parseColor("#7FFFE2B1"));
                    y4Var.f206033i.setIconColor(android.graphics.Color.parseColor("#7FFFE2B1"));
                } else {
                    y4Var.f206029e.setBackgroundResource(com.tencent.mm.R.drawable.bun);
                    y4Var.f206035k.setTextColor(android.graphics.Color.parseColor("#FFE2B1"));
                    y4Var.f206034j.setTextColor(android.graphics.Color.parseColor("#FFE2B1"));
                    y4Var.f206033i.setIconColor(android.graphics.Color.parseColor("#FFE2B1"));
                }
                y4Var.f206035k.setVisibility(0);
                int i18 = dVar3.f348439c;
                if (i18 == 1) {
                    y4Var.f206035k.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492427gm0));
                } else if (i18 == 2) {
                    y4Var.f206035k.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492430gm3));
                }
            }
            ot0.e eVar = (ot0.e) v17.y(ot0.e.class);
            if (com.tencent.mm.sdk.platformtools.t8.K0(eVar.f348443c)) {
                y4Var.f206032h.setVisibility(8);
                y4Var.c(104);
            } else {
                y4Var.f206032h.setVisibility(0);
                y4Var.f206034j.setText(java.lang.String.format("%d\"", java.lang.Long.valueOf(eVar.f348445e / 1000)));
                y4Var.c(84);
            }
            y4Var.f206028d.setVisibility(8);
            android.view.ViewGroup.LayoutParams layoutParams = y4Var.f206029e.getLayoutParams();
            layoutParams.width = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 131);
            y4Var.f206029e.setLayoutParams(layoutParams);
        }
        g0Var.clickArea.setOnClickListener(w(dVar));
        g0Var.clickArea.setOnLongClickListener(u(dVar));
        g0Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        g0Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, this.f203283s.D(), g0Var, null));
    }
}
