package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class h5 extends com.tencent.mm.ui.chatting.viewitems.a0 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488450tn);
        com.tencent.mm.ui.chatting.viewitems.f5 f5Var = new com.tencent.mm.ui.chatting.viewitems.f5();
        f5Var.a(xgVar);
        xgVar.setTag(f5Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean N() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        ot0.q v17;
        ux3.a aVar;
        java.lang.Object bVar;
        android.text.style.ForegroundColorSpan foregroundColorSpan;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgRingtone", "fill item %d, msgId %d", java.lang.Integer.valueOf(holder.getAdapterPosition()), java.lang.Long.valueOf(f9Var.getMsgId()));
            java.lang.String j17 = f9Var.j();
            if (j17 == null || (v17 = ot0.q.v(j17)) == null || (aVar = (ux3.a) v17.y(ux3.a.class)) == null) {
                return;
            }
            vx3.i iVar = aVar.f431874b;
            android.app.Activity g17 = ui6.g();
            java.lang.String str2 = iVar.f441291h;
            java.lang.String string = g17.getString(com.tencent.mm.R.string.f493476kd3);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String str3 = string + ' ' + str2;
            android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(str3);
            kotlin.jvm.internal.o.f(newSpannable, "newSpannable(...)");
            int length = string.length();
            if ((f9Var.F & 16384) != 0) {
                bVar = new android.text.style.StyleSpan(0);
                foregroundColorSpan = new android.text.style.ForegroundColorSpan(i65.a.d(g17, com.tencent.mm.R.color.FG_1));
            } else {
                bVar = new gb5.b();
                foregroundColorSpan = new android.text.style.ForegroundColorSpan(i65.a.d(g17, com.tencent.mm.R.color.FG_1));
            }
            newSpannable.setSpan(foregroundColorSpan, 0, length, 17);
            newSpannable.setSpan(bVar, 0, str3.length(), 17);
            newSpannable.setSpan(new com.tencent.mm.ui.chatting.viewitems.g5(ui6.g().getResources().getColor(com.tencent.mm.R.color.f479308vo), ui6.g().getResources().getColor(com.tencent.mm.R.color.f479310vq), g17, str, iVar), string.length() + 1, str3.length(), 18);
            android.widget.TextView textView = ((com.tencent.mm.ui.chatting.viewitems.f5) holder).f203942b;
            if (textView != null) {
                textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
            android.widget.TextView textView2 = ((com.tencent.mm.ui.chatting.viewitems.f5) holder).f203942b;
            if (textView2 != null) {
                textView2.setClickable(true);
            }
            android.widget.TextView textView3 = ((com.tencent.mm.ui.chatting.viewitems.f5) holder).f203942b;
            if (textView3 != null) {
                textView3.setText(newSpannable, android.widget.TextView.BufferType.SPANNABLE);
            }
            mx3.b0 b0Var = mx3.b0.f332528a;
            java.lang.String str4 = str == null ? "" : str;
            java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(iVar.f441298o);
            kotlin.jvm.internal.o.f(r07, "getUnsignedLongString(...)");
            b0Var.e(f9Var, str4, r07);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgRingtone", "error happened parse msg info");
        }
    }
}
