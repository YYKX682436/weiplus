package dk2;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f233468a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.k0 f233469b;

    /* renamed from: c, reason: collision with root package name */
    public int f233470c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f233471d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f233472e;

    /* renamed from: f, reason: collision with root package name */
    public int f233473f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f233474g;

    /* renamed from: h, reason: collision with root package name */
    public int f233475h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f233476i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f233477j;

    /* renamed from: k, reason: collision with root package name */
    public int f233478k;

    /* renamed from: l, reason: collision with root package name */
    public int f233479l;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f233480m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f233481n;

    /* renamed from: o, reason: collision with root package name */
    public final gm2.k f233482o;

    public g0(gk2.e curLiveContext, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        kotlin.jvm.internal.o.g(curLiveContext, "curLiveContext");
        this.f233468a = curLiveContext;
        this.f233469b = k0Var;
        this.f233480m = new dk2.w(this);
        this.f233481n = new com.tencent.mm.sdk.platformtools.b4("FinderLiveAnchorVerifyManager::Timer", (com.tencent.mm.sdk.platformtools.a4) new dk2.v(this), true);
        this.f233482o = new gm2.k(ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 22.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.e() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(dk2.g0 r2, int r3) {
        /*
            com.tencent.mm.sdk.platformtools.b4 r0 = r2.f233481n
            if (r0 == 0) goto Lc
            boolean r0 = r0.e()
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L1b
            r2.f233473f = r3
            com.tencent.mm.sdk.platformtools.b4 r2 = r2.f233481n
            if (r2 == 0) goto L21
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.c(r0, r0)
            goto L21
        L1b:
            int r0 = r2.f233473f
            if (r3 >= r0) goto L21
            r2.f233473f = r3
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.g0.a(dk2.g0, int):void");
    }

    public static final java.lang.CharSequence b(dk2.g0 g0Var, java.lang.String str, int i17) {
        g0Var.getClass();
        if (str == null || i17 < 0) {
            return null;
        }
        int L = r26.n0.L(str, "@", 0, false, 6, null);
        if (L < 0) {
            return str;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        int length = valueOf.length() + L;
        android.text.SpannableString spannableString = new android.text.SpannableString(r26.i0.t(str, "@", valueOf, false));
        spannableString.setSpan(g0Var.f233482o, L, length, 17);
        return spannableString;
    }

    public static final void c(dk2.g0 g0Var, boolean z17) {
        int i17;
        int i18;
        g0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", "postVerifyRequest: success:" + z17 + ", currentVerifyMode:" + g0Var.f233470c + ", verification_id:" + g0Var.f233471d);
        int i19 = g0Var.f233470c;
        if (i19 != 1) {
            if (i19 == 2) {
                i18 = z17 ? 11 : 12;
            } else if (i19 == 3) {
                i18 = z17 ? 21 : 22;
            } else if (i19 == 4) {
                i18 = 23;
            } else if (i19 != 5) {
                i17 = 0;
            } else {
                i18 = z17 ? 32 : 33;
            }
            i17 = i18;
        } else {
            i17 = z17 ? 1 : 2;
        }
        dk2.a0 a0Var = (i19 == 3 || i19 == 4) ? new dk2.a0(z17, g0Var) : null;
        gk2.e eVar = g0Var.f233468a;
        long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
        long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
        java.lang.String str = g0Var.f233471d;
        if (str == null) {
            str = "";
        }
        new ek2.m2(j17, j18, i17, str, a0Var).l();
        int i27 = g0Var.f233470c;
        if (i27 == 1) {
            if (z17) {
                pm0.v.X(new dk2.b0(g0Var));
                return;
            }
            return;
        }
        if (i27 != 2) {
            if (i27 == 3) {
                pm0.v.X(new dk2.y(g0Var));
                return;
            }
            if (i27 == 4) {
                pm0.v.X(new dk2.z(g0Var));
                return;
            }
            if (i27 == 5 && z17) {
                pm0.v.X(new dk2.b0(g0Var));
                if (((mm2.t2) eVar.a(mm2.t2.class)).f329430i) {
                    ((mm2.t2) eVar.a(mm2.t2.class)).f329430i = false;
                    ((mm2.t2) eVar.a(mm2.t2.class)).f329428g = false;
                    return;
                }
                return;
            }
            return;
        }
        if (!z17) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            jz2.x0 x0Var = jz2.x0.f302754a;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ((jz5.n) jz2.x0.f302758e).getValue());
            intent.addFlags(872415232);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAnchorVerifyManager", "postVerifyRequest", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/live/model/FinderLiveAnchorVerifyManager", "postVerifyRequest", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", "gotoVerificationH5: verificationUrl:" + g0Var.f233472e);
        if (g0Var.f233472e == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = g0Var.f233469b;
        android.content.Context context3 = k0Var != null ? k0Var.getContext() : null;
        android.app.Activity activity = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
        if (activity == null) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("KEY_URL", g0Var.f233472e);
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        intent2.setClass(activity, (java.lang.Class) ((jz5.n) jz2.x0.H).getValue());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderAnchorVerifyWebviewUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderAnchorVerifyWebviewUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void d(boolean z17) {
        gk2.e liveData = this.f233468a;
        if (z17 && ((mm2.t2) liveData.a(mm2.t2.class)).f329428g) {
            return;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e3j);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e3n);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String str = z17 ? string : string2;
        int i17 = this.f233470c;
        if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 5) {
            if (!((mm2.x4) ((mm2.c1) liveData.a(mm2.c1.class)).business(mm2.x4.class)).N6(str, kz5.c0.i(string, string2), "addSystemMsg")) {
                zl2.r4 r4Var = zl2.r4.f473950a;
                kotlin.jvm.internal.o.g(liveData, "liveData");
                r45.t12 t12Var = new r45.t12();
                t12Var.set(3, 10001);
                t12Var.set(2, str);
                ((mm2.x4) ((mm2.c1) liveData.a(mm2.c1.class)).business(mm2.x4.class)).f329528f.add(new dk2.mf(t12Var));
                no0.h.f338720a.a();
            }
            if (z17) {
                dk2.ef efVar = dk2.ef.f233372a;
                tn0.w0 w0Var = dk2.ef.f233378d;
                if (w0Var != null) {
                    w0Var.y(2);
                    return;
                }
                return;
            }
            dk2.ef efVar2 = dk2.ef.f233372a;
            tn0.w0 w0Var2 = dk2.ef.f233378d;
            if (w0Var2 != null) {
                w0Var2.n0(2);
            }
        }
    }

    public final void e(boolean z17) {
        r45.iy1 iy1Var;
        tn0.w0 f17;
        kn0.p pVar;
        kn0.p pVar2;
        in0.q e17;
        kn0.p pVar3;
        gk2.e eVar = this.f233468a;
        if (!((mm2.c1) eVar.a(mm2.c1.class)).a8() || (iy1Var = ((mm2.t2) eVar.a(mm2.t2.class)).f329427f) == null) {
            return;
        }
        boolean z18 = false;
        if (android.text.TextUtils.equals(this.f233471d, iy1Var.getString(2)) && this.f233470c == iy1Var.getInteger(0) && !z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", "checkAnchorVerify: same id and mode, ignore. currentVerifyMode:" + this.f233470c + ", currentVerifyId:" + this.f233471d);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", "updateVerifyInfo: verify_mode:" + iy1Var.getInteger(0) + ", verification_id:" + iy1Var.getString(2) + ", remaining_seconds:" + iy1Var.getInteger(3));
        this.f233470c = iy1Var.getInteger(0);
        this.f233471d = iy1Var.getString(2);
        this.f233472e = iy1Var.getString(4);
        pm0.v.X(new dk2.f0(iy1Var, this));
        d(true);
        ((mm2.t2) eVar.a(mm2.t2.class)).f329428g = true;
        dk2.ef efVar = dk2.ef.f233372a;
        in0.q e18 = efVar.e();
        if (((e18 == null || (pVar3 = e18.D) == null || pVar3.f309588h) ? false : true) && (e17 = efVar.e()) != null) {
            e17.k0();
        }
        if (((mm2.c1) eVar.a(mm2.c1.class)).Y4) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("miniGame start anchor verify live status is pausing:");
            in0.q e19 = efVar.e();
            sb6.append((e19 == null || (pVar2 = e19.D) == null) ? null : java.lang.Boolean.valueOf(pVar2.f309588h));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", sb6.toString());
            tn0.w0 f18 = efVar.f();
            if (f18 != null && (pVar = f18.D) != null && !pVar.f309588h) {
                z18 = true;
            }
            if (!z18 || (f17 = efVar.f()) == null) {
                return;
            }
            f17.k0();
        }
    }

    public final void f() {
        tn0.w0 f17;
        kn0.p pVar;
        int i17 = ((mm2.c1) this.f233468a.a(mm2.c1.class)).Z4;
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 f18 = efVar.f();
        java.lang.Boolean valueOf = (f18 == null || (pVar = f18.D) == null) ? null : java.lang.Boolean.valueOf(pVar.f309588h);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", "miniGame finish anchor verify live status is pausing:" + valueOf + " captureVolume:" + i17);
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE) && (f17 = efVar.f()) != null) {
            f17.r0();
        }
        tn0.w0 f19 = efVar.f();
        if (f19 != null) {
            f19.B0(i17);
        }
    }

    public final void g() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", "mockForceRectify");
        gk2.e eVar = this.f233468a;
        ((mm2.t2) eVar.a(mm2.t2.class)).f329430i = true;
        r45.iy1 iy1Var = new r45.iy1();
        iy1Var.set(0, 5);
        iy1Var.set(6, "直播安全警告");
        iy1Var.set(1, "直播存在违规行为，请及时调整并在15分钟内完成整改，否则将被平台中断直播");
        iy1Var.set(5, "整改完成");
        iy1Var.set(8, "@秒后可操作");
        iy1Var.set(12, 30);
        iy1Var.set(11, 900);
        iy1Var.set(10, "直播将在@秒后中断");
        iy1Var.set(9, 60);
        iy1Var.set(2, "mock_verify_" + java.lang.System.currentTimeMillis());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本");
        linkedList.add("昵称涉及低俗色情");
        linkedList.add("直播主题涉及利用学生名义博眼球");
        linkedList.add("直播可能存在剧情演绎，请注意甄别后下单");
        linkedList.add("直播间售卖商品价值较高，请注意甄别后下单");
        linkedList.add("当前直播间的店铺体验分低，请注意甄别");
        linkedList.add("请勿轻信升值赚钱、高价回收等虚假宣传，谨慎辨别，理性消费");
        iy1Var.set(15, linkedList);
        iy1Var.set(17, "http://dldir1v6.qq.com/weixin/checkresupdate/ExclamationMarkCircle_dbb5b04f1ec04a4993d3c8ebf6912f07.png");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        finderJumpInfo.setWording("去申诉");
        iy1Var.set(16, finderJumpInfo);
        ((mm2.t2) eVar.a(mm2.t2.class)).f329427f = iy1Var;
        e(true);
    }

    public final void h() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", "reset");
        this.f233470c = 0;
        this.f233471d = null;
        this.f233472e = null;
        this.f233473f = 0;
        this.f233474g = null;
        this.f233475h = 0;
        this.f233476i = null;
        this.f233477j = null;
        this.f233478k = 0;
        this.f233479l = 0;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f233481n;
        if (b4Var != null) {
            b4Var.d();
        }
        ((mm2.t2) this.f233468a.a(mm2.t2.class)).f329430i = false;
    }
}
