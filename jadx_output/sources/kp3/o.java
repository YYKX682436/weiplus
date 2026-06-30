package kp3;

/* loaded from: classes14.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f311017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.youtu.YTBizPalmRegister.Result f311018e;

    public o(kp3.x xVar, com.tencent.youtu.YTBizPalmRegister.Result result) {
        this.f311017d = xVar;
        this.f311018e = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int i17;
        androidx.appcompat.app.AppCompatActivity activity = this.f311017d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        kp3.p0 p0Var = (kp3.p0) zVar.a(activity).a(kp3.p0.class);
        com.tencent.youtu.YTBizPalmRegister.Result result = this.f311018e;
        int i18 = result.tipCode;
        int i19 = result.targetHandType;
        boolean z17 = result.isFirstPalm;
        p0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] errorCode： " + i18 + " ，targetHandType: " + i19 + " (left:0、right：1), isFirstSDKVerifyFrame ： " + z17 + ' ');
        if (p0Var.f311030p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] isFirtVerify");
            p0Var.f311030p = false;
            p0Var.f311032r.f310975a = i18;
            p0Var.O6(p0Var.Q6(), "palm_verify_circle_begin.pag", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[setEnterAnimation]");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(p0Var.Q6(), "alpha", 0.0f, 1.0f);
            if (ofFloat != null) {
                ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
                str = "tipsErrorIv";
                ofFloat.setDuration(200L);
                ofFloat.addListener(new kp3.j0(p0Var));
                ofFloat.start();
            } else {
                str = "tipsErrorIv";
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            kp3.k0 k0Var = new kp3.k0(p0Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(k0Var, 300L, false);
            p0Var.O6(p0Var.S6(), "palm_verify_tips_enter.pag", true);
            android.widget.ImageView imageView = p0Var.f311025h;
            if (imageView == null) {
                kotlin.jvm.internal.o.o(str);
                throw null;
            }
            imageView.setVisibility(4);
            com.tencent.mm.plugin.palm.ui.PalmPrintVerifyMask R6 = p0Var.R6();
            int i27 = com.tencent.mm.plugin.palm.ui.PalmPrintVerifyMask.f152882p;
            R6.a(false, true);
        } else {
            str = "tipsErrorIv";
        }
        if (!p0Var.f311033s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] finishAnimation: no, return ");
            return;
        }
        int i28 = i19 != com.tencent.youtu.YTBizPalmRegister.HandType.UNKNOWN ? i19 : p0Var.f311032r.f310976b;
        if (p0Var.f311032r.f310976b != i28) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] do change hand type");
            p0Var.f311032r.f310976b = i28;
            if (i19 == com.tencent.youtu.YTBizPalmRegister.HandType.RIGHT) {
                android.widget.ImageView imageView2 = p0Var.f311025h;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o(str);
                    throw null;
                }
                imageView2.setScaleX(1.0f);
                p0Var.S6().setScaleX(1.0f);
            } else if (i19 == com.tencent.youtu.YTBizPalmRegister.HandType.LEFT) {
                android.widget.ImageView imageView3 = p0Var.f311025h;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o(str);
                    throw null;
                }
                imageView3.setScaleX(-1.0f);
                p0Var.S6().setScaleX(-1.0f);
            }
        }
        kp3.e0 e0Var = p0Var.f311032r;
        if (e0Var.f310975a != i18 || p0Var.f311031q) {
            e0Var.f310975a = i18;
            androidx.appcompat.app.AppCompatActivity activity2 = p0Var.getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.palm.ui.PalmPrintMainUI");
            java.lang.Integer num = ((com.tencent.mm.plugin.palm.ui.PalmPrintMainUI) activity2).f152877m;
            boolean z18 = num != null && num.intValue() == 2;
            android.widget.TextView T6 = p0Var.T6();
            androidx.appcompat.app.AppCompatActivity activity3 = p0Var.getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            ((kp3.x) zVar.a(activity3).a(kp3.x.class)).f311049e.getClass();
            android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
            if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PIPELINE_SUCCESS) {
                i17 = z18 ? com.tencent.mm.R.string.f492679oc1 : com.tencent.mm.R.string.m4u;
            } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_ACTION_OPEN) {
                i17 = com.tencent.mm.R.string.m4i;
            } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_ACTION_STILL_OPEN) {
                i17 = com.tencent.mm.R.string.m4t;
            } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_ACTION_CLOSE) {
                i17 = com.tencent.mm.R.string.m4c;
            } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_ACTION_STILL_CLOSE) {
                i17 = com.tencent.mm.R.string.m4s;
            } else {
                if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_MULTI || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_MULTI) {
                    i17 = com.tencent.mm.R.string.m4g;
                } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_TYPE_LEFT) {
                    i17 = z18 ? com.tencent.mm.R.string.obx : com.tencent.mm.R.string.m4j;
                } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_TYPE_RIGHT) {
                    i17 = z18 ? com.tencent.mm.R.string.oby : com.tencent.mm.R.string.m4k;
                } else {
                    if ((((((i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_NOT_AVAILABLE || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_LATERAL) || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_FORWARD) || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_ABNORMAL) || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_REGISTRATION) || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_NOISE) || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_TOTAL) {
                        i17 = com.tencent.mm.R.string.f492676mc3;
                    } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_TOO_NEAR) {
                        i17 = com.tencent.mm.R.string.muu;
                    } else {
                        if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_MOVE_CENTER || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_OUT_OF_IMAGE) {
                            i17 = com.tencent.mm.R.string.f492675mc2;
                        } else {
                            if ((i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_LEAN_FORWARD || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_LEAN_BACKWARD) || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_LEAN_RIGHT_LEFT) {
                                i17 = com.tencent.mm.R.string.muw;
                            } else {
                                if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_DORSUM || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_OCCLUSION) {
                                    i17 = com.tencent.mm.R.string.mc7;
                                } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_MOVE_CLOSER) {
                                    i17 = com.tencent.mm.R.string.m4d;
                                } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_MOVE_FURTHER) {
                                    i17 = com.tencent.mm.R.string.m4e;
                                } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_MOVE_ROTATE) {
                                    i17 = com.tencent.mm.R.string.m4f;
                                } else {
                                    if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_LIGHT_DART || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_ILLUM_DARK) {
                                        i17 = com.tencent.mm.R.string.m4r;
                                    } else {
                                        if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_BLUE || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_GREEN) {
                                            i17 = com.tencent.mm.R.string.f492677mc5;
                                        } else {
                                            if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_ILLUM_BRIGHT || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_LIGHT_BRIGHT) {
                                                i17 = com.tencent.mm.R.string.m4q;
                                            } else {
                                                if (((i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_LINE || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_BLURRINESS) || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_FOCUS) || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_MOVE_FAST) {
                                                    i17 = com.tencent.mm.R.string.m4o;
                                                } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_CONTINUE_BLURRINESS) {
                                                    i17 = com.tencent.mm.R.string.mc6;
                                                } else {
                                                    if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_NOT_FOUND || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_NOT_FOUND) {
                                                        if (i28 == com.tencent.youtu.YTBizPalmRegister.HandType.LEFT) {
                                                            i17 = com.tencent.mm.R.string.muv;
                                                        } else if (i28 == com.tencent.youtu.YTBizPalmRegister.HandType.RIGHT) {
                                                            i17 = com.tencent.mm.R.string.muz;
                                                        }
                                                    }
                                                    i17 = com.tencent.mm.R.string.m4n;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            java.lang.String string = resources.getString(i17);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            T6.setText(string);
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] do change tips： " + ((java.lang.Object) p0Var.T6().getText()));
            if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_NOT_FOUND || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_NOT_FOUND) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] not found hand，firstHandleErrorCode ：" + p0Var.f311031q);
                if (!p0Var.f311031q) {
                    p0Var.Q6().n();
                    p0Var.Q6().setVisibility(8);
                    p0Var.O6(p0Var.S6(), "palm_verify_tips_enter.pag", true);
                    android.widget.ImageView imageView4 = p0Var.f311025h;
                    if (imageView4 == null) {
                        kotlin.jvm.internal.o.o(str);
                        throw null;
                    }
                    imageView4.setVisibility(4);
                    p0Var.R6().a(true, false);
                }
            } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PIPELINE_SUCCESS) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] verify success");
                p0Var.Q6().setVisibility(0);
                p0Var.O6(p0Var.Q6(), "palm_verify_circle_end.pag", true);
                android.widget.ImageView imageView5 = p0Var.f311025h;
                if (imageView5 == null) {
                    kotlin.jvm.internal.o.o(str);
                    throw null;
                }
                imageView5.setVisibility(4);
                p0Var.R6().a(true, true);
                p0Var.S6().n();
                p0Var.S6().setVisibility(4);
                android.widget.ImageView imageView6 = p0Var.f311025h;
                if (imageView6 == null) {
                    kotlin.jvm.internal.o.o(str);
                    throw null;
                }
                imageView6.setVisibility(4);
                android.widget.ProgressBar progressBar = p0Var.f311024g;
                if (progressBar == null) {
                    kotlin.jvm.internal.o.o(ed3.a.NAME);
                    throw null;
                }
                progressBar.setVisibility(0);
                p0Var.P6("heavy");
                ((ku5.t0) ku5.t0.f312615d).g(new kp3.f0(p0Var, com.tencent.mm.R.string.m4v));
            } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_ACTION_CLOSE) {
                p0Var.P6("light");
                ((ku5.t0) ku5.t0.f312615d).g(new kp3.f0(p0Var, com.tencent.mm.R.string.hpq));
                p0Var.R6().a(true, true);
                p0Var.Q6().n();
                p0Var.Q6().setVisibility(8);
                android.widget.ImageView imageView7 = p0Var.f311025h;
                if (imageView7 == null) {
                    kotlin.jvm.internal.o.o(str);
                    throw null;
                }
                imageView7.setVisibility(4);
                com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] verify action： close");
                p0Var.O6(p0Var.S6(), "palm_verify_tips_close.pag", true);
            } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_ACTION_STILL_CLOSE) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] keep action ");
                p0Var.R6().a(true, true);
                android.widget.ImageView imageView8 = p0Var.f311025h;
                if (imageView8 == null) {
                    kotlin.jvm.internal.o.o(str);
                    throw null;
                }
                imageView8.setVisibility(4);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doChangeView] verify error");
                if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_MOVE_ROTATE) {
                    p0Var.O6(p0Var.S6(), "palm_verify_tips_move_rotate.pag", true);
                    android.widget.ImageView imageView9 = p0Var.f311025h;
                    if (imageView9 == null) {
                        kotlin.jvm.internal.o.o(str);
                        throw null;
                    }
                    imageView9.setVisibility(4);
                } else if (i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_HAND_LEAN_BACKWARD || i18 == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PALM_QUALITY_FORWARD) {
                    p0Var.O6(p0Var.S6(), "palm_verify_tips_lean_backward.pag", true);
                    android.widget.ImageView imageView10 = p0Var.f311025h;
                    if (imageView10 == null) {
                        kotlin.jvm.internal.o.o(str);
                        throw null;
                    }
                    imageView10.setVisibility(4);
                } else {
                    p0Var.S6().n();
                    p0Var.S6().setVisibility(8);
                    android.widget.ImageView imageView11 = p0Var.f311025h;
                    if (imageView11 == null) {
                        kotlin.jvm.internal.o.o(str);
                        throw null;
                    }
                    imageView11.setVisibility(0);
                }
                p0Var.Q6().n();
                p0Var.Q6().setVisibility(8);
                p0Var.R6().a(true, false);
            }
            p0Var.f311031q = false;
        }
    }
}
