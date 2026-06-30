package ww1;

/* loaded from: classes15.dex */
public abstract class y2 {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0206, code lost:
    
        if ((r0 == 0) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(android.content.Context r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, int r34, y60.e r35, boolean r36, int r37, float r38, boolean r39, double r40) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ww1.y2.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, int, y60.e, boolean, int, float, boolean, double):android.graphics.Bitmap");
    }

    public static void b(int i17, ww1.b3 b3Var, ww1.b3 b3Var2, ww1.a3 a3Var, ww1.a3 a3Var2, android.content.Context context) {
        float b17 = i65.a.b(context, 32);
        if (i17 == 2) {
            float f17 = -b17;
            g(b3Var2, a3Var2, 0.0f, a3Var2.f450115y, 90.0f, 270.0f, 0.0f, 1.0f, f17, 0.0f);
            b3Var2.f450125c.setBackgroundResource(com.tencent.mm.R.drawable.f481303pz);
            b3Var2.f450123b.setBackgroundResource(com.tencent.mm.R.drawable.f481301px);
            g(b3Var, null, a3Var.f450115y, 0.0f, 270.0f, 450.0f, 1.0f, 0.0f, 0.0f, f17);
            b3Var.f450125c.setBackgroundResource(com.tencent.mm.R.drawable.f481274p6);
            b3Var.f450123b.setBackgroundResource(com.tencent.mm.R.drawable.f481272p4);
            return;
        }
        float f18 = -b17;
        g(b3Var, null, 0.0f, a3Var.f450115y, 90.0f, 270.0f, 0.0f, 1.0f, f18, 0.0f);
        b3Var.f450125c.setBackgroundResource(com.tencent.mm.R.drawable.f481303pz);
        b3Var.f450123b.setBackgroundResource(com.tencent.mm.R.drawable.f481301px);
        g(b3Var2, null, a3Var2.f450115y, 0.0f, 270.0f, 450.0f, 1.0f, 0.0f, 0.0f, f18);
        b3Var2.f450125c.setBackgroundResource(com.tencent.mm.R.drawable.f481274p6);
        b3Var2.f450123b.setBackgroundResource(com.tencent.mm.R.drawable.f481272p4);
    }

    public static void c(ww1.a3 a3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeLogic", "[getMchConfig]");
        r45.fw fwVar = new r45.fw();
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_WX_PAY_COLLECT_QRCODE_MCH_CONFIG_STRING_SYNC, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeLogic", "getConfig failed");
        } else {
            try {
                fwVar.parseFrom(str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeLogic", "getConfig success");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeLogic", "parse fail, " + e17.getLocalizedMessage());
            }
        }
        ww1.c3.a(a3Var, null, fwVar);
    }

    public static void d(ww1.b3 b3Var) {
        android.widget.RelativeLayout relativeLayout = b3Var.V;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(8);
        b3Var.X.clearAnimation();
        b3Var.W.setVisibility(8);
    }

    public static void e(ww1.b3 b3Var, ww1.a3 a3Var, java.lang.String str, android.content.Context context) {
        android.widget.RelativeLayout relativeLayout = b3Var.V;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(0);
        b3Var.Y.setVisibility(0);
        android.widget.TextView textView = b3Var.Z;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = context.getString(com.tencent.mm.R.string.l0g);
        }
        textView.setText(str);
        b3Var.X.clearAnimation();
        b3Var.W.setVisibility(8);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) b3Var.Y.getLayoutParams();
        if (b3Var.f450123b.getVisibility() == 0) {
            layoutParams.topMargin = i65.a.b(context, 96);
        } else {
            layoutParams.topMargin = i65.a.b(context, 124);
        }
        b3Var.Y.setLayoutParams(layoutParams);
        b3Var.V.post(new ww1.u2(b3Var, a3Var));
    }

    public static void f(ww1.b3 b3Var, ww1.a3 a3Var, android.content.Context context) {
        if (b3Var.V == null) {
            return;
        }
        float b17 = i65.a.b(context, 25) / 2;
        b3Var.V.setVisibility(0);
        b3Var.W.setVisibility(0);
        b3Var.Y.setVisibility(8);
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 0, b17, 0, b17);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        b3Var.X.startAnimation(rotateAnimation);
        b3Var.V.post(new ww1.t2(b3Var, a3Var));
    }

    public static void g(ww1.b3 b3Var, ww1.a3 a3Var, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, f18);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ww1.o2(b3Var));
        if (f18 > 0.0f) {
            ofFloat.addListener(new ww1.q2(b3Var, a3Var));
        }
        ofFloat.start();
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(f28, f29);
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new ww1.r2(b3Var));
        ofFloat2.start();
        android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(f19, f27);
        ofFloat3.setDuration(300L);
        ofFloat3.addUpdateListener(new ww1.s2(b3Var));
        ofFloat3.start();
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, f37, f38);
        translateAnimation.setDuration(300L);
        b3Var.f450138j.startAnimation(translateAnimation);
    }
}
