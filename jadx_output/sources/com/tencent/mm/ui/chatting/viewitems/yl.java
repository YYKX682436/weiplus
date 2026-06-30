package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class yl extends com.tencent.mm.ui.chatting.viewitems.a0 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488526w0);
        com.tencent.mm.ui.chatting.viewitems.xl xlVar = new com.tencent.mm.ui.chatting.viewitems.xl(this);
        xlVar.a(xgVar);
        xgVar.setTag(xlVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        menuItem.getItemId();
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        g4Var.c(((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d(), 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mars.xlog.Log.i("MicrMsg.ChattingItemHardDeviceMsgLike", "hy: user clicked on the like item");
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.i("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, msg is null.");
            return false;
        }
        java.lang.String U1 = f9Var.U1();
        ot0.q v17 = ot0.q.v(U1);
        if (v17 == null) {
            com.tencent.mars.xlog.Log.i("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, content is null.");
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(v17.f348674k)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", v17.f348674k);
            j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            return true;
        }
        if ((((com.tencent.mm.storage.k4) c01.d9.b().q()).n(v17.F0, true).getType() & 524288) != 0) {
            com.tencent.mars.xlog.Log.i("MicrMsg.ChattingItemHardDeviceMsgLike", "we run black user");
        } else {
            int i17 = v17.f348634J;
            if (i17 == 2) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(v17.f348691o0)) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_is_latest", true);
                    intent2.putExtra("app_username", v17.H);
                    intent2.putExtra("device_type", v17.C0);
                    intent2.putExtra("locate_to_username", v17.F0);
                    j45.l.j(dVar.g(), "exdevice", ".ui.ExdeviceRankInfoUI", intent2, null);
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("key_rank_info", U1);
                    intent3.putExtra("key_rank_title", v17.f348735z0);
                    intent3.putExtra("key_champion_info", v17.A0);
                    intent3.putExtra("key_champion_coverimg", v17.A0);
                    intent3.putExtra("rank_id", v17.f348691o0);
                    intent3.putExtra("app_username", v17.H);
                    intent3.putExtra("device_type", v17.C0);
                    intent3.putExtra("key_champioin_username", v17.f348731y0);
                    intent3.putExtra("locate_to_username", v17.F0);
                    j45.l.j(dVar.g(), "exdevice", ".ui.ExdeviceRankInfoUI", intent3, null);
                }
                ve4.g.a(30);
            } else if (i17 == 4) {
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra(dm.i4.COL_USERNAME, v17.F0);
                intent4.putExtra("app_username", "gh_43f2581f6fd6");
                j45.l.j(dVar.g(), "exdevice", ".ui.ExdeviceProfileUI", intent4, null);
                ve4.g.a(29);
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        int i17;
        com.tencent.mm.ui.chatting.viewitems.xl xlVar = (com.tencent.mm.ui.chatting.viewitems.xl) g0Var;
        ot0.q v17 = ot0.q.v(dVar2.f394254d.f445300b.U1());
        com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), g0Var, null);
        if (v17 != null && (v17.f348634J == 2 || (i17 = v17.B0) == 2 || i17 == 4)) {
            kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
            android.widget.ImageView imageView = xlVar.f205996b;
            java.lang.String str2 = v17.F0;
            ((com.tencent.mm.feature.avatar.w) zVar).getClass();
            com.tencent.mm.pluginsdk.ui.u.b(imageView, str2, 0.5f, true);
            xlVar.f205997c.i(0, dVar.s().getDimension(com.tencent.mm.R.dimen.f479897ia));
            xlVar.f205997c.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.a0c));
            xlVar.f205997c.setEllipsize(android.text.TextUtils.TruncateAt.END);
            xlVar.f205997c.setSingleLine(true);
            xlVar.f205997c.setShouldEllipsize(true);
            com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = xlVar.f205997c;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = dVar.g();
            java.lang.String str3 = v17.E0;
            ((ke0.e) xVar).getClass();
            noMeasuredTextView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g17, str3));
        }
        g0Var.clickArea.setOnLongClickListener(u(dVar));
        g0Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        g0Var.clickArea.setTag(erVar);
        g0Var.clickArea.setOnClickListener(w(dVar));
    }
}
