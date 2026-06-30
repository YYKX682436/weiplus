package p74;

/* loaded from: classes4.dex */
public final class w implements z84.c {

    /* renamed from: a, reason: collision with root package name */
    public final z74.i f352607a;

    /* renamed from: b, reason: collision with root package name */
    public final q74.b0 f352608b;

    /* renamed from: c, reason: collision with root package name */
    public final int f352609c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f352610d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f352611e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f352612f;

    /* renamed from: g, reason: collision with root package name */
    public int f352613g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f352614h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f352616j;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f352615i = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public boolean f352617k = true;

    public w(z74.i iVar, q74.b0 b0Var, int i17) {
        this.f352607a = iVar;
        this.f352608b = b0Var;
        this.f352609c = i17;
    }

    public static final /* synthetic */ q74.b0 e(p74.w wVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdChannelData$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        q74.b0 b0Var = wVar.f352608b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdChannelData$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        return b0Var;
    }

    public static final void f(p74.w wVar, com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        wVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        androidx.recyclerview.widget.f2 u17 = cardLayoutManager.u();
        boolean z17 = u17 != null && i17 >= 0 && i17 == u17.getItemCount() - 1;
        if (wVar.f352610d || wVar.f352616j || i17 >= 2 || z17) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "onVideoCompleted, replay video, isPressed=" + wVar.f352610d + ", hasUserInteraction=" + wVar.f352616j + ", position=" + i17 + ", isLast=" + z17);
            if (onlineVideoView != null) {
                onlineVideoView.M(0, true);
            }
        } else {
            com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "onVideoCompleted, scroll to next item");
            cardLayoutManager.A();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    @Override // z84.c
    public void a(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        q74.b0 b0Var = this.f352608b;
        if (b0Var != null) {
            try {
                b0Var.h(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardVideoPlayHelper", "onVisibleItemChanged error: " + th6.getMessage());
            }
        }
        if (this.f352616j && b0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateManualSlideCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            b0Var.f360416i++;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateManualSlideCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        }
        if (i18 >= 0 && i18 != i17) {
            m(cardLayoutManager, i18, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        i(cardLayoutManager, i17, false, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    @Override // z84.c
    public void b(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "onScrollStateChanged: state=" + (i17 != 0 ? i17 != 1 ? i17 != 2 ? "UNKNOWN" : "SETTLING" : "DRAGGING" : "IDLE") + " (" + i17 + "), mHasUserInteraction=" + this.f352616j);
            if (i17 == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                this.f352610d = true;
                this.f352616j = true;
                if (cardLayoutManager != null) {
                    cardLayoutManager.o();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                this.f352610d = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    @Override // z84.c
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        try {
            q74.b0 b0Var = this.f352608b;
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    @Override // z84.c
    public void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "onNotifyActionUp: targetPosition=" + i17 + ", setting mHasUserInteraction=true");
        this.f352616j = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    public final s34.x0 g(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        s34.x0 x0Var = null;
        try {
            androidx.recyclerview.widget.f2 u17 = cardLayoutManager.u();
            if (u17 instanceof p74.c) {
                p74.c cVar = (p74.c) u17;
                cVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
                if (!cVar.f352523g.isEmpty() && i17 >= 0 && i17 < cVar.f352523g.size()) {
                    s34.x0 x0Var2 = (s34.x0) cVar.f352523g.get(i17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
                    x0Var = x0Var2;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardVideoPlayHelper", "getAdSlideFullCardItemInfo error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        return x0Var;
    }

    public final p74.g h(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        p74.g gVar = null;
        try {
            androidx.recyclerview.widget.k3 v17 = cardLayoutManager.v(i17);
            if (v17 instanceof p74.g) {
                gVar = (p74.g) v17;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardVideoPlayHelper", "getCardViewHolder error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        return gVar;
    }

    public final void i(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17, boolean z17, int i18) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        s34.a1 a1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        if (cardLayoutManager == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f352614h;
        s34.x0 g17 = g(cardLayoutManager, i17);
        p74.g h17 = h(cardLayoutManager, i17);
        if (snsInfo == null || g17 == null || h17 == null || h17.k() == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdSlideCardVideoPlayHelper", "playInner, resInfo or view holder is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            return;
        }
        cardLayoutManager.o();
        if (!this.f352611e) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "playInner, not ready to play");
        } else if (g17.a()) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "playInner, play video at position=" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            android.os.Handler handler = this.f352615i;
            handler.removeCallbacksAndMessages(null);
            android.widget.FrameLayout k17 = h17.k();
            if (k17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            } else {
                if (this.f352609c != 0 && i17 == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportSnsCommentPlayVideoDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                    int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_slide_full_card_play_video_in_sns_comment_delay, 1);
                    com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "support sns comment play video delay, value is " + Ni);
                    boolean z18 = Ni > 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportSnsCommentPlayVideoDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                    if (z18) {
                        if (this.f352612f) {
                            j(cardLayoutManager, k17, snsInfo, g17.f402828e, z17);
                        } else {
                            handler.postDelayed(new p74.v(this, k17, cardLayoutManager, snsInfo, g17, z17), 600L);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                    }
                }
                this.f352612f = true;
                j(cardLayoutManager, k17, snsInfo, g17.f402828e, z17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            }
        } else {
            com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "playInner, play image at position=" + i17);
            if (this.f352616j || cardLayoutManager.w()) {
                com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "skip image auto scroll, hasUserInteraction=" + this.f352616j + ", position=" + i17);
            } else {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f352614h;
                long j17 = (snsInfo2 == null || (adXml = snsInfo2.getAdXml()) == null || (a1Var = adXml.adSliderFullCardInfo) == null) ? 0L : a1Var.f402568e;
                if (j17 == 0) {
                    j17 = 3000;
                }
                cardLayoutManager.B(j17);
                com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "schedule image auto scroll in " + j17 + "ms");
            }
            z74.i iVar = this.f352607a;
            if (iVar != null) {
                iVar.d();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager r8, android.view.ViewGroup r9, com.tencent.mm.plugin.sns.storage.SnsInfo r10, r45.jj4 r11, boolean r12) {
        /*
            r7 = this;
            java.lang.String r0 = "playVideo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            z74.i r2 = r7.f352607a
            if (r2 == 0) goto L7f
            if (r9 == 0) goto L7f
            if (r10 == 0) goto L7f
            if (r11 != 0) goto L13
            goto L7f
        L13:
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
            if (r5 == 0) goto L4f
            r5 = 0
            android.view.View r5 = r9.getChildAt(r5)
            boolean r6 = r5 instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView
            if (r6 == 0) goto L4f
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r5 = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) r5
            goto L50
        L4f:
            r5 = 0
        L50:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            if (r5 != 0) goto L59
            r7.k(r10, r8, r9, r3)
            goto L7b
        L59:
            boolean r4 = kotlin.jvm.internal.o.b(r5, r10)
            if (r4 == 0) goto L75
            int r9 = r8.p()
            r10 = 1
            r7.m(r8, r9, r10)
            if (r12 == 0) goto L6f
            java.lang.String r8 = r11.f377855d
            r2.f(r5, r8)
            goto L7b
        L6f:
            java.lang.String r8 = r11.f377855d
            r2.g(r5, r8)
            goto L7b
        L75:
            a84.y0.c(r9)
            r7.k(r10, r8, r9, r3)
        L7b:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L7f:
            java.lang.String r8 = "SnsAd.AdSlideCardVideoPlayHelper"
            java.lang.String r9 = "playVideo, invalid params"
            com.tencent.mars.xlog.Log.e(r8, r9)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p74.w.j(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager, android.view.ViewGroup, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, boolean):void");
    }

    public final void k(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, android.view.ViewGroup viewGroup, xd4.j0 j0Var) {
        z74.i iVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        if (onlineVideoView != null && (iVar = this.f352607a) != null) {
            j0Var.f453660b += '_' + j0Var.f453659a.f377855d + '_';
            a84.y0.i(onlineVideoView);
            a84.y0.o(onlineVideoView, -1, -1);
            a84.y0.b(viewGroup, onlineVideoView, 0);
            a84.y0.p(onlineVideoView, true);
            onlineVideoView.setThumbViewScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            onlineVideoView.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
            onlineVideoView.setVideoCallback(new p74.u(this, cardLayoutManager, onlineVideoView, cardLayoutManager.p()));
            iVar.h(onlineVideoView, j0Var, j0Var.f453662d, j0Var.f453659a.f377855d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    public final void l(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "triggerPlayByTimeline is called!");
        this.f352611e = true;
        if (cardLayoutManager != null) {
            try {
                int p17 = cardLayoutManager.p();
                if (p17 >= 0) {
                    i(cardLayoutManager, p17, true, 2);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardVideoPlayHelper", "triggerPlayByTimeline error: " + th6.getMessage());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    public final void m(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager, int i17, boolean z17) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (cardLayoutManager == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            return;
        }
        s34.x0 g17 = g(cardLayoutManager, i17);
        boolean z18 = false;
        if (g17 != null && g17.a()) {
            z18 = true;
        }
        if (!z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            return;
        }
        androidx.recyclerview.widget.f2 u17 = cardLayoutManager.u();
        if (u17 instanceof p74.c) {
            ((p74.c) u17).x(i17, z17);
        }
        m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("SnsAd.AdSlideCardVideoPlayHelper", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }
}
