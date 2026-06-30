package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class nm {
    public nm(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(yb5.d ui6, k41.k0 k0Var, com.tencent.mm.ui.chatting.viewitems.jm holder) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.String str3 = "";
        if (k0Var == null || (str = k0Var.f304017a) == null) {
            str = "";
        }
        android.widget.ImageView imageView = holder.f204273b;
        if (imageView != null) {
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.bhm);
        }
        com.tencent.mm.ui.chatting.viewitems.a0.T(holder.f204273b, str, null);
        android.widget.TextView textView = holder.f204276e;
        if (textView != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = ui6.g();
            if (k0Var != null && (str2 = k0Var.f304018b) != null) {
                str3 = str2;
            }
            android.widget.TextView textView2 = holder.f204276e;
            kotlin.jvm.internal.o.d(textView2);
            float textSize = textView2.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g17, str3, textSize));
        }
        android.widget.TextView textView3 = holder.f204274c;
        if (textView3 != null) {
            textView3.setText(com.tencent.mm.R.string.b4x);
        }
        java.lang.String str4 = k0Var != null ? k0Var.f304021e : null;
        java.lang.String str5 = k0Var != null ? k0Var.f304022f : null;
        boolean z17 = true;
        java.lang.String str6 = str5;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
            android.app.Activity g18 = ui6.g();
            android.widget.TextView textView4 = holder.f204275d;
            kotlin.jvm.internal.o.d(textView4);
            float textSize2 = textView4.getTextSize();
            android.graphics.Bitmap cj6 = ((l41.q2) b0Var).cj(str4);
            str6 = str5;
            if (cj6 != null) {
                android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(g18, "  " + str5);
                int b17 = (int) (textSize2 + ((float) i65.a.b(g18, 2)));
                android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(com.tencent.mm.sdk.platformtools.x2.f193071a, cj6);
                imageSpan.getDrawable().setBounds(0, 0, b17, b17);
                i17.setSpan(imageSpan, 0, 1, 33);
                str6 = i17;
            }
        }
        if (str6 != null && str6.length() != 0) {
            z17 = false;
        }
        if (z17) {
            android.widget.TextView textView5 = holder.f204275d;
            if (textView5 == null) {
                return;
            }
            textView5.setVisibility(8);
            return;
        }
        android.widget.TextView textView6 = holder.f204275d;
        if (textView6 != null) {
            textView6.setVisibility(0);
        }
        android.widget.TextView textView7 = holder.f204275d;
        if (textView7 == null) {
            return;
        }
        textView7.setText(str6);
    }

    public final void b(yb5.d ui6, com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        if (f9Var == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(ui6.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", c01.w9.l(ui6.D(), f9Var.j(), f9Var.A0()));
        intent.putExtra("Retr_Msg_Type", 8);
        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(ui6, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$Companion", "transmitCard", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ui6.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(ui6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$Companion", "transmitCard", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
