package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class p4 {
    public static void a(com.tencent.mm.ui.chatting.viewitems.k4 k4Var, ot0.q qVar, boolean z17) {
        android.view.View view = k4Var.clickArea;
        android.widget.ImageView imageView = k4Var.f204303f;
        android.widget.ImageView imageView2 = k4Var.f204304g;
        imageView.setVisibility(8);
        imageView2.setVisibility(8);
        if (qVar != null) {
            ot0.b bVar = (ot0.b) qVar.y(ot0.b.class);
            java.lang.String str = z17 ? bVar.f348389o : bVar.f348392r;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CHoneyPay", "get background name: %s", str);
                int identifier = view.getResources().getIdentifier(str, "drawable", com.tencent.mm.sdk.platformtools.x2.f193072b);
                if (identifier > 0) {
                    view.setBackgroundResource(identifier);
                    view.setPadding(0, 0, 0, 0);
                    k4Var.resetChatBubbleWidthWithNewStyle(view, k4Var.f204305h);
                    return;
                }
            }
            java.lang.String str2 = z17 ? (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(bVar.f348391q)) ? bVar.f348390p : bVar.f348391q : (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(bVar.f348394t)) ? bVar.f348393s : bVar.f348394t;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                imageView.setVisibility(8);
                imageView2.setVisibility(8);
                if (z17) {
                    view.setBackgroundResource(com.tencent.mm.R.drawable.c2csendermsgnodebg);
                } else {
                    view.setBackgroundResource(com.tencent.mm.R.drawable.c2creceivermsgnodebg);
                }
            } else {
                imageView.setVisibility(0);
                imageView2.setVisibility(0);
                if (z17) {
                    view.setBackgroundResource(com.tencent.mm.R.drawable.by9);
                    imageView2.setImageResource(com.tencent.mm.R.drawable.k_);
                } else {
                    view.setBackgroundResource(com.tencent.mm.R.drawable.f481076by0);
                    imageView2.setImageResource(com.tencent.mm.R.drawable.f481075k7);
                }
                view.post(new com.tencent.mm.ui.chatting.viewitems.j4(str2, view, imageView, imageView2, str2, z17));
            }
        }
        view.setPadding(0, 0, 0, 0);
        k4Var.resetChatBubbleWidthWithNewStyle(view, k4Var.f204305h);
    }

    public static void b(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, ot0.b bVar, com.tencent.mm.ui.chatting.viewitems.k4 k4Var, ot0.q qVar) {
        android.widget.TextView textView = k4Var.f204300c;
        if (textView == null) {
            return;
        }
        textView.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
        java.lang.String str = f9Var.A0() == 1 ? bVar.f348381g : bVar.f348380f;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = qVar.f348658g;
            k4Var.f204300c.setSingleLine(false);
            k4Var.f204300c.setMaxLines(3);
        } else {
            k4Var.f204300c.setSingleLine(true);
        }
        k4Var.f204300c.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(dVar.g(), str, k4Var.f204306i));
        k4Var.f204300c.setTextSize(0, k4Var.f204306i);
        int Di = ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).Di(bVar.f348382h, !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f348396v) ? bVar.f348396v : bVar.f348395u);
        if (Di != -1) {
            k4Var.f204300c.setTextColor(Di);
        } else {
            k4Var.f204300c.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
    }

    public static void c(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, ot0.b bVar, com.tencent.mm.ui.chatting.viewitems.k4 k4Var, ot0.q qVar) {
        android.widget.TextView textView = k4Var.f204301d;
        if (textView == null) {
            return;
        }
        textView.setText(f9Var.A0() == 1 ? bVar.f348385k : bVar.f348386l);
        int Di = ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).Di(bVar.f348387m, !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f348398x) ? bVar.f348398x : bVar.f348397w);
        if (Di != -1) {
            k4Var.f204301d.setTextColor(Di);
        } else {
            k4Var.f204301d.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
    }

    public static void d(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, ot0.b bVar, com.tencent.mm.ui.chatting.viewitems.k4 k4Var, ot0.q qVar) {
        android.widget.TextView textView = k4Var.f204302e;
        if (textView == null) {
            return;
        }
        textView.setText(f9Var.A0() == 1 ? bVar.f348383i : bVar.f348384j);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f348400z) && bVar.f348400z.equals("#888888")) {
            k4Var.f204302e.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.f478553an));
            if (com.tencent.mm.ui.bk.C()) {
                k4Var.f204302e.setAlpha(0.5f);
                return;
            } else {
                k4Var.f204302e.setAlpha(0.8f);
                return;
            }
        }
        int Di = ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).Di(bVar.f348400z, bVar.f348399y);
        if (Di != -1) {
            k4Var.f204302e.setTextColor(Di);
            k4Var.f204302e.setAlpha(1.0f);
        } else {
            k4Var.f204302e.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.f478553an));
            k4Var.f204302e.setAlpha(0.7f);
        }
    }

    public static void e(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, ot0.b bVar, com.tencent.mm.ui.chatting.viewitems.k4 k4Var, ot0.q qVar) {
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = k4Var.f204299b;
        if (cdnImageView == null) {
            return;
        }
        cdnImageView.setImageBitmap(null);
        java.lang.String str = (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(bVar.f348379e)) ? !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f348378d) ? bVar.f348378d : "" : bVar.f348379e;
        int b17 = i65.a.b(dVar.g(), 44);
        cdnImageView.b(str, b17, b17, com.tencent.mm.R.raw.honey_pay_bank_logo);
    }

    public static android.graphics.Bitmap f(android.graphics.Bitmap bitmap, int i17, int i18, boolean z17) {
        int ceil = (int) java.lang.Math.ceil(bitmap.getWidth() * (i17 / bitmap.getHeight()));
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, ceil, i17, true);
        int i19 = ceil - i18;
        if (i19 < 0) {
            i19 = 0;
        }
        return com.tencent.mm.sdk.platformtools.x.p(com.tencent.mm.sdk.platformtools.x.a0(createScaledBitmap, new android.graphics.Rect(i19, 0, ceil, i17), false), z17 ? com.tencent.mm.R.drawable.bxz : com.tencent.mm.R.drawable.by8);
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Context context) {
        try {
            r45.wl6 wl6Var = new r45.wl6();
            wl6Var.parseFrom(android.util.Base64.decode(str, 0));
            int i17 = wl6Var.f389261d;
            if (i17 == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", wl6Var.f389262e);
                intent.putExtra("msgUsername", str2);
                intent.putExtra("geta8key_username", str3);
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).cj(context, intent);
            } else if (i17 == 2) {
                qg0.g0 g0Var = (qg0.g0) i95.n0.c(qg0.g0.class);
                r45.nm6 nm6Var = wl6Var.f389263f;
                ((pg0.p3) g0Var).hj(nm6Var.f381518d, nm6Var.f381519e, nm6Var.f381520f, 1007);
            } else if (i17 == 3) {
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).fj(context, wl6Var.f389264g);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgC2CHoneyPay", "ThirdC2CRouteInfo type:%s is invalid", java.lang.Integer.valueOf(i17));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemAppMsgC2CHoneyPay", e17, "", new java.lang.Object[0]);
        }
    }
}
