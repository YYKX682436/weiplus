package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class lq extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f204529b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f204530c = null;

    public static void b(com.tencent.mm.ui.chatting.viewitems.lq lqVar, rd5.d dVar, boolean z17, com.tencent.mm.ui.chatting.adapter.q qVar, yb5.d dVar2, com.tencent.mm.ui.chatting.viewitems.kq kqVar, android.view.View.OnLongClickListener onLongClickListener) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (lqVar == null) {
            return;
        }
        java.lang.String y07 = f9Var.y0();
        if (!android.text.TextUtils.isEmpty(y07) && !y07.equals(c01.z1.r())) {
            ((co5.p) ((jp5.n) i95.n0.c(jp5.n.class))).Ni(y07);
        }
        android.widget.ImageView imageView = lqVar.stateIV;
        if (imageView != null) {
            imageView.setVisibility(f9Var.P0() == 6 ? 8 : 0);
        }
        r45.j07 j07Var = null;
        lqVar.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar, dVar2.D(), lqVar, null));
        lqVar.clickArea.setOnClickListener(kqVar);
        lqVar.clickArea.setOnLongClickListener(onLongClickListener);
        lqVar.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar2.f460708c.a(sb5.z.class))).B1);
        java.lang.String str = f9Var.G;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                j07Var = com.tencent.mm.plugin.voip.model.j0.s(f9Var.j());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemVoip", "parseInviteMsgBubbleMsg error = " + th6.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemVoip", th6, "", new java.lang.Object[0]);
            }
            if (j07Var != null) {
                lqVar.f204529b.setText(j07Var.f377477d);
            } else {
                lqVar.f204529b.setText(str);
            }
        } else if (z17) {
            lqVar.f204529b.setText(com.tencent.mm.R.string.f493457ka2);
        } else {
            lqVar.f204529b.setText(com.tencent.mm.R.string.f493458ka3);
        }
        if (lqVar.f204530c == null || f9Var.j() == null) {
            return;
        }
        if (j07Var != null) {
            if (j07Var.f377478e == 1) {
                if (!z17) {
                    lqVar.f204530c.setBackgroundResource(com.tencent.mm.R.raw.voip_voicecall);
                    return;
                }
                android.view.View view = lqVar.f204530c;
                android.graphics.drawable.Drawable drawable = dVar2.g().getDrawable(com.tencent.mm.R.raw.voip_voicecall);
                com.tencent.mm.ui.uk.f(drawable, dVar2.g().getResources().getColor(com.tencent.mm.R.color.FG_0));
                view.setBackground(drawable);
                return;
            }
            if (!z17) {
                lqVar.f204530c.setBackgroundResource(com.tencent.mm.R.raw.voip_videocall_to);
                return;
            }
            android.view.View view2 = lqVar.f204530c;
            android.graphics.drawable.Drawable drawable2 = dVar2.g().getDrawable(com.tencent.mm.R.raw.voip_videocall);
            com.tencent.mm.ui.uk.f(drawable2, dVar2.g().getResources().getColor(com.tencent.mm.R.color.FG_0));
            view2.setBackground(drawable2);
            return;
        }
        if (ip.l.h(f9Var.j())) {
            if (!z17) {
                lqVar.f204530c.setBackgroundResource(com.tencent.mm.R.raw.voip_voicecall);
                return;
            }
            android.view.View view3 = lqVar.f204530c;
            android.graphics.drawable.Drawable drawable3 = dVar2.g().getDrawable(com.tencent.mm.R.raw.voip_voicecall);
            com.tencent.mm.ui.uk.f(drawable3, dVar2.g().getResources().getColor(com.tencent.mm.R.color.FG_0));
            view3.setBackground(drawable3);
            return;
        }
        if (ip.l.g(f9Var.j())) {
            if (!z17) {
                lqVar.f204530c.setBackgroundResource(com.tencent.mm.R.raw.voip_videocall_to);
                return;
            }
            android.view.View view4 = lqVar.f204530c;
            android.graphics.drawable.Drawable drawable4 = dVar2.g().getDrawable(com.tencent.mm.R.raw.voip_videocall);
            com.tencent.mm.ui.uk.f(drawable4, dVar2.g().getResources().getColor(com.tencent.mm.R.color.FG_0));
            view4.setBackground(drawable4);
        }
    }

    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view, boolean z17) {
        super.create(view);
        this.timeTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1);
        this.f204529b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483704bs3);
        this.clickArea = view.findViewById(com.tencent.mm.R.id.bkg);
        this.f204530c = view.findViewById(com.tencent.mm.R.id.f483703bs2);
        this.stateIV = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqx);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        return this;
    }
}
