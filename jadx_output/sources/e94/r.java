package e94;

/* loaded from: classes4.dex */
public class r extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView f250387a;

    public r(com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView) {
        this.f250387a = twistCoverView;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        java.lang.String str4;
        float f17;
        float f18;
        java.lang.String str5;
        java.lang.String str6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1");
        int i17 = message.what;
        if (i17 != 1) {
            if (i17 == 2) {
                com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView = this.f250387a;
                float f19 = message.arg1 / 1000.0f;
                int i18 = com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView.C;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                twistCoverView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTwistDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                twistCoverView.f163916d.setProgress(f19);
                if (java.lang.Math.abs(f19) >= 1.0f && !twistCoverView.f163924o) {
                    com.tencent.mars.xlog.Log.i("TwistCoverView", "onTwistActionSucc by degree");
                    twistCoverView.f();
                    twistCoverView.setSensorEnabled(false);
                    twistCoverView.f163934y.removeMessages(2);
                    twistCoverView.f163934y.removeMessages(1);
                    if (twistCoverView.f163921i != null) {
                        twistCoverView.h(1, false, twistCoverView.f163921i.f166111h);
                    } else {
                        com.tencent.mars.xlog.Log.e("TwistCoverView", "onTwistDegreeChange, mAdTwistInfo==null");
                    }
                    twistCoverView.e();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTwistDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            } else if (i17 == 3) {
                com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView2 = this.f250387a;
                int i19 = com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView.C;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                twistCoverView2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                if (!twistCoverView2.f163924o) {
                    com.tencent.mars.xlog.Log.i("TwistCoverView", "onTwistActionSucc by acceleration");
                    twistCoverView2.f();
                    twistCoverView2.setSensorEnabled(false);
                    android.os.Handler handler = twistCoverView2.f163934y;
                    handler.removeMessages(2);
                    handler.removeMessages(1);
                    twistCoverView2.f163916d.setProgress(1.0f);
                    twistCoverView2.h(1, true, 0.0f);
                    twistCoverView2.e();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            } else if (i17 == 4) {
                com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView3 = this.f250387a;
                int i27 = com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView.C;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                android.animation.AnimatorSet animatorSet = twistCoverView3.f163923n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                if (animatorSet != null) {
                    com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView4 = this.f250387a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    android.animation.AnimatorSet animatorSet2 = twistCoverView4.f163923n;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    if (!animatorSet2.isRunning()) {
                        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView5 = this.f250387a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        android.animation.AnimatorSet animatorSet3 = twistCoverView5.f163923n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        animatorSet3.start();
                    }
                }
            }
            str5 = "handleMessage";
            str6 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
        } else {
            com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView6 = this.f250387a;
            long j17 = message.arg1;
            int i28 = com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView.C;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            twistCoverView6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            if (twistCoverView6.f163921i == null) {
                com.tencent.mars.xlog.Log.e("TwistCoverView", "checkShow， mAdTwistInfo==null");
                twistCoverView6.a();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                str4 = "access$000";
                str2 = "handleMessage";
                str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
            } else {
                if (j17 < twistCoverView6.f163921i.f166107d || j17 > twistCoverView6.f163921i.f166108e) {
                    if (twistCoverView6.d()) {
                        twistCoverView6.setSensorEnabled(false);
                    }
                    twistCoverView6.f163931v = false;
                    if (twistCoverView6.f163930u) {
                        twistCoverView6.f163930u = false;
                        if (!twistCoverView6.f163932w) {
                            twistCoverView6.h(2, false, twistCoverView6.f163935z);
                        }
                    }
                    twistCoverView6.f163929t = true;
                } else {
                    if (!twistCoverView6.d() && !twistCoverView6.f163927r) {
                        twistCoverView6.i();
                        twistCoverView6.setSensorEnabled(true);
                    }
                    twistCoverView6.f163931v = true;
                    if (twistCoverView6.f163929t) {
                        twistCoverView6.f163929t = false;
                        twistCoverView6.f163932w = false;
                        twistCoverView6.h(3, false, 0.0f);
                    }
                    twistCoverView6.f163930u = true;
                }
                if (j17 < twistCoverView6.f163921i.f166109f || j17 > twistCoverView6.f163921i.f166110g) {
                    str = "access$000";
                    str2 = "handleMessage";
                    str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                    twistCoverView6.b();
                } else if (twistCoverView6.f163926q && twistCoverView6.getVisibility() == 0) {
                    twistCoverView6.j();
                    str = "access$000";
                    str2 = "handleMessage";
                    str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                    z17 = false;
                    twistCoverView6.f163926q = z17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    str4 = str;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    if (twistCoverView6.f163925p) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        str = "access$000";
                        str2 = "handleMessage";
                        str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                    } else {
                        com.tencent.mars.xlog.Log.i("TwistCoverView", "show");
                        twistCoverView6.f163925p = true;
                        if (twistCoverView6.getVisibility() != 0) {
                            twistCoverView6.setVisibility(0);
                            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(twistCoverView6, "alpha", 0.0f, 1.0f);
                            ofFloat.setDuration(250L);
                            ofFloat.start();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                            if (twistCoverView6.f163921i == null) {
                                com.tencent.mars.xlog.Log.e("TwistCoverView", "initIconAnim err, info==null");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                                str = "access$000";
                                str2 = "handleMessage";
                                str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                            } else {
                                if (twistCoverView6.f163921i.f166112i) {
                                    f17 = 45.0f;
                                    f18 = -5.0f;
                                } else {
                                    f17 = -45.0f;
                                    f18 = 5.0f;
                                }
                                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(twistCoverView6.f163917e, "rotation", 0.0f, 0.0f);
                                ofFloat2.setDuration(100L);
                                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(twistCoverView6.f163917e, "rotation", 0.0f, f17);
                                ofFloat3.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                                ofFloat3.setDuration(700L);
                                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(twistCoverView6.f163917e, "rotation", f17, f17);
                                str2 = "handleMessage";
                                str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                                ofFloat4.setDuration(200L);
                                android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(twistCoverView6.f163917e, "rotation", f17, f18);
                                str = "access$000";
                                ofFloat5.setDuration(200L);
                                float f27 = -f18;
                                android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(twistCoverView6.f163917e, "rotation", f18, f27);
                                ofFloat6.setDuration(200L);
                                android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(twistCoverView6.f163917e, "rotation", f27, 0.0f);
                                ofFloat7.setDuration(200L);
                                android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
                                twistCoverView6.f163923n = animatorSet4;
                                animatorSet4.playSequentially(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7);
                                twistCoverView6.f163923n.addListener(new e94.u(twistCoverView6));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                            }
                            twistCoverView6.k();
                        } else {
                            str = "access$000";
                            str2 = "handleMessage";
                            str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                        }
                        if (twistCoverView6.f163921i != null) {
                            twistCoverView6.f163918f.setText(twistCoverView6.f163921i.f166113m);
                            twistCoverView6.f163919g.setText(twistCoverView6.f163921i.f166114n);
                            twistCoverView6.f163916d.setShowMode(twistCoverView6.f163921i.f166112i ? 1 : 0);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    }
                }
                z17 = false;
                twistCoverView6.f163926q = z17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                str4 = str;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            str5 = str2;
            str6 = str3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str6);
    }
}
