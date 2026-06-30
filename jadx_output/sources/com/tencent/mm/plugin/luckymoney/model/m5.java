package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public abstract class m5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f145452a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static int f145453b = Integer.MAX_VALUE;

    static {
        new jt0.i(10, com.tencent.mm.plugin.luckymoney.model.m5.class);
    }

    public static void A(android.view.View view) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.4f, 0.98f, 0.4f, 0.98f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setInterpolator(new android.view.animation.OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.98f, 1.0f, 0.98f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(50L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.model.j5());
        if (view != null) {
            view.startAnimation(scaleAnimation);
        }
    }

    public static void B(android.view.View view, android.view.animation.Animation.AnimationListener animationListener) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.model.k5(view, scaleAnimation2));
        if (animationListener != null) {
            scaleAnimation2.setAnimationListener(animationListener);
        }
        if (view != null) {
            view.startAnimation(scaleAnimation);
        }
    }

    public static boolean C(java.lang.String str, java.lang.String str2, int i17) {
        ot0.q qVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(", ");
            if (str2 == null) {
                str2 = "";
            }
            sb6.append(str2);
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyUtil", sb6.toString());
            return false;
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.d1(str);
        f9Var.r1(2);
        f9Var.u1(str2);
        f9Var.e1(c01.w9.o(str2));
        f9Var.j1(1);
        if (i17 == 3) {
            f9Var.setType(469762097);
        } else {
            f9Var.setType(436207665);
        }
        long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        if (M9 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyUtil", fp.k.c() + "insert msg failed :" + M9);
            return false;
        }
        if (f9Var.k2()) {
            v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
            int a17 = ot0.u.a(f9Var);
            ((u90.a) vVar).getClass();
            com.tencent.mm.modelstat.e.f71505a.a(f9Var, a17);
        } else {
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
            com.tencent.mm.modelstat.e.f71505a.b(f9Var);
        }
        f9Var.setMsgId(M9);
        ot0.t tVar = new ot0.t();
        tVar.field_xml = f9Var.j();
        if (str != null) {
            qVar = ot0.q.v(f9Var.U1());
            if (qVar != null) {
                tVar.field_title = qVar.f348654f;
                tVar.field_description = qVar.f348658g;
            }
        } else {
            qVar = null;
        }
        tVar.field_type = 2001;
        tVar.field_msgId = M9;
        tVar.field_msgTalker = f9Var.Q0();
        tVar.field_msgSvrId = f9Var.I0();
        if (qVar != null && qVar.f348666i == 2001 && qVar.f348634J == 1) {
            if (android.text.TextUtils.isEmpty(qVar.f348716u1) || android.text.TextUtils.isEmpty(qVar.f348720v1) || qVar.f348724w1 <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! don't send predownload image event, because image preload data is illegal!");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! send predownload image event!");
                com.tencent.mm.autogen.events.C2CNYPredownloadImgEvent c2CNYPredownloadImgEvent = new com.tencent.mm.autogen.events.C2CNYPredownloadImgEvent();
                am.m1 m1Var = new am.m1();
                c2CNYPredownloadImgEvent.f54022g = m1Var;
                m1Var.f7290b = qVar.f348720v1;
                m1Var.f7289a = qVar.f348716u1;
                m1Var.f7291c = qVar.f348724w1;
                c2CNYPredownloadImgEvent.e();
            }
        }
        ot0.t y07 = ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(str2, M9);
        if (y07 != null && y07.field_msgId == M9) {
            ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(tVar, new java.lang.String[0]);
        } else if (!((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).D0(tVar)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyUtil", "PinOpenApi.getAppMessageStorage().insert msg failed id:" + M9);
        }
        if (qVar != null) {
            java.lang.String str3 = qVar.f348704r1;
            if (!(str3 == null || str3.length() == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtilNew", "[sendLocalMsg] add local item : %s", qVar.f348704r1);
                java.lang.String str4 = qVar.f348704r1;
                android.net.Uri parse = android.net.Uri.parse(str4 != null ? str4 : "");
                if (parse != null) {
                    try {
                        java.lang.String queryParameter = parse.getQueryParameter("sendid");
                        at4.k1 k1Var = new at4.k1();
                        k1Var.field_mNativeUrl = qVar.f348704r1;
                        k1Var.field_receiveStatus = 0;
                        k1Var.field_invalidtime = qVar.M0;
                        k1Var.field_sender = f9Var.Q0();
                        k1Var.field_sendId = queryParameter;
                        k1Var.field_msgLocalId = f9Var.getMsgId();
                        k1Var.field_hbType = -1;
                        ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().replace(k1Var);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyUtilNew", "[sendLocalMsg] parse url  error! %s", e17.getMessage());
                    }
                }
                return true;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyUtilNew", "[sendLocalMsg] msg、content or native is null");
        return true;
    }

    public static void D(android.widget.TextView textView) {
        textView.setShadowLayer(8.0f, 0.0f, 0.0f, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478718f9));
    }

    public static void E(android.content.Context context, android.widget.TextView textView, java.lang.String str) {
        if (textView == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
    }

    public static android.app.Dialog F(android.content.Context context, boolean z17) {
        return db5.e1.O(context, null, 3, com.tencent.mm.R.style.f494256i6, context.getString(com.tencent.mm.R.string.ggc), true, z17, new com.tencent.mm.plugin.luckymoney.model.l5());
    }

    public static void G(android.widget.ImageView imageView, int i17) {
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(com.tencent.mm.R.drawable.f481504uw);
        android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) imageView.getDrawable();
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    public static void H(android.widget.ImageView imageView) {
        android.graphics.drawable.AnimationDrawable animationDrawable;
        if (imageView == null || !(imageView.getDrawable() instanceof android.graphics.drawable.AnimationDrawable) || (animationDrawable = (android.graphics.drawable.AnimationDrawable) imageView.getDrawable()) == null) {
            return;
        }
        animationDrawable.stop();
    }

    public static void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_VERSIONSV2_STRING_SYNC;
        java.lang.String str2 = (java.lang.String) c17.m(u3Var, null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str = str2 + "," + str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "add reddot version, final version is %s", str);
        gm0.j1.u().c().x(u3Var, str);
    }

    public static void b(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2) {
        if (imageView == null) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, str2, 0.1f);
            return;
        }
        gk0.k kVar = new gk0.k(i65.a.h(imageView.getContext(), com.tencent.mm.R.dimen.aly), i65.a.h(imageView.getContext(), com.tencent.mm.R.dimen.alx));
        kVar.f272434e = com.tencent.mm.R.drawable.bhm;
        kVar.f272433d = 0.1f;
        ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).wi(imageView, str, kVar);
    }

    public static java.lang.Boolean c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "target version is null");
            return java.lang.Boolean.FALSE;
        }
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_VERSIONSV2_STRING_SYNC, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String[] split = str2.split(",");
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str3 : split) {
            hashSet.add(str3);
        }
        if (hashSet.contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "target version exist %s", str);
            return java.lang.Boolean.TRUE;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "target version not exist %s", str);
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.app.Activity r13, int r14, java.lang.String r15, com.tencent.mm.modelbase.m1 r16, android.os.Bundle r17, boolean r18, android.content.DialogInterface.OnClickListener r19, com.tencent.mm.wallet_core.g r20, int r21) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.model.m5.d(android.app.Activity, int, java.lang.String, com.tencent.mm.modelbase.m1, android.os.Bundle, boolean, android.content.DialogInterface$OnClickListener, com.tencent.mm.wallet_core.g, int):boolean");
    }

    public static void e(r45.lm5 lm5Var) {
        java.lang.String str;
        try {
            str = new java.lang.String(lm5Var.toByteArray(), java.nio.charset.StandardCharsets.ISO_8859_1);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyUtil", e17, "[finalSaveSelectSkinEntryLocalRedDotInfo] save reddot local data fail", new java.lang.Object[0]);
            str = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_INFOV2_STRING_SYNC, str);
    }

    public static java.lang.String f(android.content.Context context, long j17) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        if (j17 < 3600000) {
            return "";
        }
        long timeInMillis = j17 - new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
        if (timeInMillis > 0 && timeInMillis <= 86400000) {
            return new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(j17));
        }
        android.text.format.Time time = new android.text.format.Time();
        time.set(j17);
        return k35.s.a(context.getString(com.tencent.mm.R.string.f492138fc5, " "), time).toString();
    }

    public static java.lang.String g(r45.lm5 lm5Var) {
        java.lang.String str;
        if (lm5Var == null) {
            return "";
        }
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        f17.getClass();
        char c17 = 65535;
        switch (f17.hashCode()) {
            case 115861276:
                if (f17.equals("zh_CN")) {
                    c17 = 0;
                    break;
                }
                break;
            case 115861428:
                if (f17.equals("zh_HK")) {
                    c17 = 1;
                    break;
                }
                break;
            case 115861812:
                if (f17.equals("zh_TW")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                str = lm5Var.f379632q;
                break;
            case 1:
                str = lm5Var.f379633r;
                break;
            case 2:
                str = lm5Var.f379634s;
                break;
            default:
                str = lm5Var.f379635t;
                break;
        }
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : "";
    }

    public static long h() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return c01.id.a();
    }

    public static int i(android.content.Context context) {
        if (f145453b == Integer.MAX_VALUE) {
            f145453b = context.getResources().getColor(com.tencent.mm.R.color.f479340wv);
        }
        return f145453b;
    }

    public static java.lang.String j(java.lang.String str) {
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
        if (n07 != null) {
            return n07.d();
        }
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || !n17.d1().equals(str) || n17.H == 4) {
            return null;
        }
        gm0.j1.i();
        byte[] s17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().s(str);
        if (com.tencent.mm.sdk.platformtools.t8.M0(s17)) {
            return null;
        }
        try {
            return ((r45.tn4) new r45.tn4().parseFrom(s17)).U;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyUtil", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    public static long k(java.lang.String str) {
        long longValue;
        synchronized (com.tencent.mm.plugin.luckymoney.model.m5.class) {
            try {
                try {
                    longValue = ((java.lang.Long) f145452a.get(str)).longValue();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyUtil", e17, "", new java.lang.Object[0]);
                    return -1L;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        return longValue;
    }

    public static java.lang.String l() {
        gm0.j1.i();
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SELFINFO_SMALLIMGURL_STRING, null);
    }

    public static java.lang.String m(java.lang.String str) {
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || !n17.d1().equals(str)) {
            return null;
        }
        return n17.P0();
    }

    public static r45.lm5 n() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_INFOV2_STRING_SYNC, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "config str is null");
            return null;
        }
        r45.lm5 lm5Var = new r45.lm5();
        try {
            lm5Var.parseFrom(str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            return lm5Var;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyUtil", e17, "parse RedPacketCoverRedDotLocalData fail", new java.lang.Object[0]);
            return null;
        }
    }

    public static void o(com.tencent.mm.ui.MMActivity mMActivity, int i17, int i18, int i19, boolean z17) {
        if (i18 != 0 || i19 <= 1) {
            p(mMActivity, i17, z17);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(mMActivity, com.tencent.mm.plugin.luckymoney.ui.SelectLuckyMoneyContactUI.class);
        intent.putExtra("key_friends_num", i19);
        if (z17) {
            intent.putExtra("scene_from", 5);
        }
        mMActivity.startActivityForResult(intent, i17);
    }

    public static void p(com.tencent.mm.ui.MMActivity mMActivity, int i17, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("select_is_ret", true);
        intent.putExtra("Select_Conv_Type", 3);
        if (z17) {
            intent.putExtra("scene_from", 5);
        }
        j45.l.v(mMActivity, ".ui.transmit.SelectConversationUI", intent, i17);
    }

    public static void q(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.j1(0);
        f9Var.u1(str2);
        f9Var.r1(3);
        f9Var.d1(str);
        f9Var.e1(c01.w9.m(str2, c01.id.c() / 1000));
        f9Var.setType(10000);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
    }

    public static boolean r(int i17) {
        return i17 == 2;
    }

    public static boolean s() {
        return ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() == 8;
    }

    public static boolean t(int i17) {
        java.util.Set set = c01.e2.f37117a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactStorageLogic", "union luckymoney logic：isOpenImIncludeAssociateRoomOrOpenIMUser sceneid :%s ", java.lang.Integer.valueOf(i17));
        if (i17 == 1005) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactStorageLogic", "union luckymoney logic：use union luckymoney ");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactStorageLogic", "union luckymoney logic：use normal luckymoney ");
        return false;
    }

    public static void u(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "load url: %s", str);
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f342083g = hb3.o.Ni().Zi();
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342096t = z17;
        if (z17) {
            fVar.f342097u = 0.0f;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            fVar.f342081e = false;
        } else {
            fVar.f342084h = str2;
            fVar.f342081e = true;
        }
        n11.a.b().h(str, imageView, fVar.a());
    }

    public static boolean v() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_busi_luckymoney_normal_new_style_open_config, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "openNewStyleConfig：%s ", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public static boolean w() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_atmosphere_dynamic_cover_close_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyAtmosphereDynamicConfigCover：%s ", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public static boolean x() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_atmosphere_dynamic_detail_close_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyAtmosphereDynamicConfigDetail：%s ", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public static boolean y() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lucky_money_dynamic_cover_close_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyDynamicConfigCover：%s ", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public static boolean z() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lucky_money_dynamic_prepare_close_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyDynamicConfigPrepare：%s ", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }
}
