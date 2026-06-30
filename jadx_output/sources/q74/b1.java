package q74;

/* loaded from: classes4.dex */
public class b1 implements z84.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f360418a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f360419b;

    /* renamed from: c, reason: collision with root package name */
    public final z74.i f360420c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f360421d;

    /* renamed from: e, reason: collision with root package name */
    public final q74.b0 f360422e;

    /* renamed from: g, reason: collision with root package name */
    public q74.d0 f360424g;

    /* renamed from: i, reason: collision with root package name */
    public final int f360426i;

    /* renamed from: f, reason: collision with root package name */
    public boolean f360423f = true;

    /* renamed from: h, reason: collision with root package name */
    public int f360425h = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f360427j = false;

    /* renamed from: k, reason: collision with root package name */
    public final android.os.Handler f360428k = new android.os.Handler(android.os.Looper.getMainLooper());

    public b1(z74.i iVar, q74.b0 b0Var, int i17) {
        this.f360420c = iVar;
        this.f360422e = b0Var;
        this.f360426i = i17;
    }

    @Override // z84.c
    public void a(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        try {
            q74.b0 b0Var = this.f360422e;
            if (b0Var != null) {
                b0Var.h(i17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            h(cardLayoutManager, i17, false, i19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    @Override // z84.c
    public void b(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        try {
            if (i17 == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                this.f360418a = true;
                if (cardLayoutManager != null) {
                    cardLayoutManager.o();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                this.f360418a = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    @Override // z84.c
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        try {
            q74.b0 b0Var = this.f360422e;
            if (b0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataAutoSlideInCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                q74.a0 d17 = b0Var.d(i17);
                if (d17 != null) {
                    d17.f360391d++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataAutoSlideInCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    @Override // z84.c
    public void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (this.f360424g != null) {
            com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "onNotifyActionUp, do notifyBindCurrentProductViewData, targetPosition is " + i17);
            this.f360424g.b(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    public final s34.x0 e(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (cardLayoutManager == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return null;
        }
        try {
            androidx.recyclerview.widget.f2 u17 = cardLayoutManager.u();
            if (u17 instanceof q74.x0) {
                s34.x0 B = ((q74.x0) u17).B(i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                return B;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        return null;
    }

    public final q74.y0 f(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (cardLayoutManager == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return null;
        }
        try {
            androidx.recyclerview.widget.k3 v17 = cardLayoutManager.v(i17);
            if (v17 instanceof q74.y0) {
                q74.y0 y0Var = (q74.y0) v17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                return y0Var;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        return null;
    }

    public void g(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (this.f360418a) {
            com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "onVideoCompleted, mIsContentPressed=true, replay");
            if (onlineVideoView != null) {
                onlineVideoView.M(0, true);
            }
        } else if (!this.f360423f) {
            boolean w17 = cardLayoutManager.w();
            com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "onVideoCompleted, autoLoop=false, isLastItem=" + w17);
            if (!w17) {
                cardLayoutManager.A();
            } else if (onlineVideoView != null) {
                com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "onVideoCompleted, autoLoop=false, replay");
                onlineVideoView.M(0, true);
            }
        } else if (cardLayoutManager != null) {
            cardLayoutManager.A();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    public final void h(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17, boolean z17, int i18) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        s34.a1 a1Var;
        com.tencent.mm.plugin.sns.storage.ADXml adXml2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (cardLayoutManager == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f360421d;
        s34.x0 e17 = e(cardLayoutManager, i17);
        q74.y0 f17 = f(cardLayoutManager, i17);
        if (snsInfo == null || e17 == null || f17 == null || f17.f360575h == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.SlideFullCardVideoPlayHelper", "playInner::the resInfo or view holder is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return;
        }
        if (this.f360424g != null && (i18 == 1 || i18 == 2 || i17 == 0)) {
            com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "playInner, do notifyBindCurrentProductViewData, cardItemPosition is " + i17 + ", itemVisibleChangedCallScene is " + i18);
            this.f360424g.b(i17);
        }
        cardLayoutManager.o();
        if (this.f360419b) {
            if (e17.a()) {
                com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "playInner:: currentPosition is " + i17 + ", the res info is sight");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                android.os.Handler handler = this.f360428k;
                handler.removeCallbacksAndMessages(null);
                if (this.f360426i != 0 && i17 == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportSnsCommentPlayVideoDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                    int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_slide_full_card_play_video_in_sns_comment_delay, 1);
                    com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "support sns comment play video delay, value is " + Ni);
                    boolean z18 = Ni > 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportSnsCommentPlayVideoDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                    if (z18) {
                        if (this.f360427j) {
                            i(cardLayoutManager, f17.f360575h, snsInfo, e17.f402828e, z17);
                        } else {
                            handler.postDelayed(new q74.z0(this, f17, cardLayoutManager, snsInfo, e17, z17), 600L);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                    }
                }
                this.f360427j = true;
                i(cardLayoutManager, f17.f360575h, snsInfo, e17.f402828e, z17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            } else {
                if (this.f360423f || !cardLayoutManager.w()) {
                    cardLayoutManager.B(j(i17, e17) ? 5000L : 3000L);
                }
                z74.i iVar = this.f360420c;
                if (iVar != null) {
                    iVar.d();
                }
            }
            q74.d0 d0Var = this.f360424g;
            if (d0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
                if (s34.z0.f402836c.a(d0Var.f360440a)) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = d0Var.f360440a;
                    s34.a1 a1Var2 = (snsInfo2 == null || (adXml2 = snsInfo2.getAdXml()) == null) ? null : adXml2.adSliderFullCardInfo;
                    if (a1Var2 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
                    } else {
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = d0Var.f360440a;
                        s34.z0 z0Var = (snsInfo3 == null || (adXml = snsInfo3.getAdXml()) == null || (a1Var = adXml.adSliderFullCardInfo) == null) ? null : a1Var.f402569f;
                        if (z0Var == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                            int i19 = i17 % a1Var2.f402564a;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                            q74.s0 s0Var = d0Var.f360443d;
                            if (i19 == 0 && z0Var.a()) {
                                s0Var.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagHasPlayFlag", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                                boolean z19 = s0Var.f360513v;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagHasPlayFlag", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                                if (!z19) {
                                    com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameLogic", "onVideoPlaying, doPAGPlaying");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPAGPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                                    kotlinx.coroutines.y0 y0Var = s0Var.f360511t;
                                    if (y0Var != null) {
                                        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                                        kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new q74.i0(s0Var, null), 2, null);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPAGPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                            int i27 = i17 % a1Var2.f402564a;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                            if (i27 == 0 && !z0Var.a()) {
                                com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameLogic", "onVideoPlaying, doStatusTwoAnimNoPAG");
                                s0Var.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doStatusTwoAnimNoPAG", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                                kotlinx.coroutines.y0 y0Var2 = s0Var.f360511t;
                                if (y0Var2 != null) {
                                    kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
                                    kotlinx.coroutines.l.d(y0Var2, kotlinx.coroutines.internal.b0.f310484a, null, new q74.k0(s0Var, 0, null), 2, null);
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doStatusTwoAnimNoPAG", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameLogic", "onVideoPlaying, is not slideItemProduct type");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "playInner::the adSlide item is not able to play video");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager r8, android.view.ViewGroup r9, com.tencent.mm.plugin.sns.storage.SnsInfo r10, r45.jj4 r11, boolean r12) {
        /*
            r7 = this;
            java.lang.String r0 = "playVideo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            z74.i r2 = r7.f360420c
            if (r2 == 0) goto L78
            if (r8 == 0) goto L78
            if (r9 == 0) goto L78
            if (r10 == 0) goto L78
            if (r11 != 0) goto L15
            goto L78
        L15:
            xd4.j0 r3 = new xd4.j0
            r3.<init>()
            r3.f453659a = r11
            java.lang.String r4 = r10.getLocalid()
            r3.f453660b = r4
            long r4 = r10.field_snsId
            java.lang.String r4 = ca4.z0.t0(r4)
            r3.f453662d = r4
            int r10 = r10.getCreateTime()
            r3.f453661c = r10
            android.content.Context r10 = r9.getContext()
            java.lang.String r4 = r11.f377855d
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r10 = r2.a(r10, r4)
            java.lang.String r4 = "getVideoViewInContainer"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            boolean r5 = a84.y0.e(r9)
            if (r5 == 0) goto L54
            r5 = 0
            android.view.View r5 = r9.getChildAt(r5)
            boolean r6 = r5 instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView
            if (r6 == 0) goto L54
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r5 = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) r5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            goto L58
        L54:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            r5 = 0
        L58:
            if (r5 != 0) goto L5e
            r7.k(r10, r8, r9, r3)
            goto L74
        L5e:
            if (r5 != r10) goto L6e
            if (r12 == 0) goto L68
            java.lang.String r8 = r11.f377855d
            r2.f(r5, r8)
            goto L74
        L68:
            java.lang.String r8 = r11.f377855d
            r2.g(r5, r8)
            goto L74
        L6e:
            a84.y0.c(r9)
            r7.k(r10, r8, r9, r3)
        L74:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L78:
            java.lang.String r8 = "SnsAd.SlideFullCardVideoPlayHelper"
            java.lang.String r9 = "the input params are invalid!!!!"
            com.tencent.mars.xlog.Log.e(r8, r9)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.b1.i(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager, android.view.ViewGroup, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, boolean):void");
    }

    public final boolean j(int i17, s34.x0 x0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldUseLongTimeExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        boolean z17 = false;
        if (i17 < 0 || x0Var == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardVideoPlayHelper", "shouldUseLongTimeExposure, position < 0 or resInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldUseLongTimeExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return false;
        }
        if (!s34.z0.d(this.f360421d)) {
            com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "shouldUseLongTimeExposure, is not slideItemProduct type");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldUseLongTimeExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return false;
        }
        s34.z0 z0Var = this.f360421d.getAdXml().adSliderFullCardInfo.f402569f;
        if (z0Var == null || !z0Var.a()) {
            com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "shouldUseLongTimeExposure, adSlideItemProductInfo is null or not support PAG");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldUseLongTimeExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return false;
        }
        if (i17 == 0 && !x0Var.a()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldUseLongTimeExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        return z17;
    }

    public final void k(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, android.view.ViewGroup viewGroup, xd4.j0 j0Var) {
        z74.i iVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (onlineVideoView != null && (iVar = this.f360420c) != null) {
            j0Var.f453660b = ca4.m0.e(j0Var.f453660b, j0Var.f453659a.f377855d + "_");
            a84.y0.i(onlineVideoView);
            a84.y0.o(onlineVideoView, -1, -1);
            a84.y0.b(viewGroup, onlineVideoView, 0);
            a84.y0.p(onlineVideoView, true);
            onlineVideoView.setThumbViewScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            onlineVideoView.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
            onlineVideoView.setVideoCallback(new q74.a1(this, cardLayoutManager, onlineVideoView, cardLayoutManager.p()));
            iVar.h(onlineVideoView, j0Var, j0Var.f453662d, j0Var.f453659a.f377855d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    public void l(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "resumePlayByTimeline is called!");
        this.f360419b = true;
        if (cardLayoutManager != null) {
            try {
                int p17 = cardLayoutManager.p();
                if (p17 >= 0) {
                    h(cardLayoutManager, p17, true, 2);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }
}
