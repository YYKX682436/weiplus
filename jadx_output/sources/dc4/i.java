package dc4;

/* loaded from: classes4.dex */
public final class i extends dc4.v implements i64.k0 {
    public android.view.ViewStub A;
    public a44.k B;
    public n74.j1 C;
    public android.view.ViewStub D;
    public com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer E;
    public com.tencent.mm.plugin.sns.ad.widget.living.v F;
    public int G;
    public int H;
    public com.tencent.mm.plugin.sns.ui.widget.l I;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.TimeLineObject f228752p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f228753q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.b1 f228754r;

    /* renamed from: s, reason: collision with root package name */
    public final android.app.Activity f228755s;

    /* renamed from: t, reason: collision with root package name */
    public final int f228756t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.k4 f228757u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f228758v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f228759w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView f228760x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f228761y;

    /* renamed from: z, reason: collision with root package name */
    public r74.a0 f228762z;

    public i(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, i64.b1 b1Var, android.app.Activity mActivity, int i17, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        kotlin.jvm.internal.o.g(mActivity, "mActivity");
        this.f228752p = timeLineObject;
        this.f228753q = snsInfo;
        this.f228754r = b1Var;
        this.f228755s = mActivity;
        this.f228756t = i17;
        this.f228757u = k4Var;
        this.f228759w = jz5.h.b(new dc4.d(this));
    }

    public static final void l(dc4.i iVar, android.view.View view, r45.jj4 jj4Var, int i17, int i18) {
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        } else {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = iVar.f228753q;
            if (snsInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            } else if (i17 <= 0 || i18 <= 0) {
                com.tencent.mars.xlog.Log.e("AdCombineGridDetailItem", "fillAdLivingView materialWidth or materialHeight less than 0");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            } else {
                n74.j1 j1Var = iVar.C;
                i64.b1 b1Var2 = iVar.f228754r;
                if (j1Var != null) {
                    android.app.Activity activity = iVar.f228755s;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                    int i19 = b1Var2 != null ? b1Var2.f289095j : 1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                    b1Var = b1Var2;
                    j1Var.b(activity, snsInfo, view, i19, true);
                } else {
                    b1Var = b1Var2;
                }
                if (ca4.m0.X(iVar.q()) && com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(snsInfo)) {
                    android.view.ViewStub viewStub = iVar.D;
                    if (viewStub != null && iVar.E == null) {
                        iVar.E = (com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer) a84.y0.h(viewStub);
                    }
                    if (iVar.E == null) {
                        com.tencent.mars.xlog.Log.e("AdCombineGridDetailItem", "fillAdLivingView but adLivingContainer is null");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                    } else {
                        com.tencent.mars.xlog.Log.i("AdCombineGridDetailItem", "showAdLivingStream fillAdLivingView");
                        r74.a0 a0Var = iVar.f228762z;
                        if (a0Var != null) {
                            a0Var.m(r74.l.f393219d);
                        }
                        a84.y0.o(iVar.E, i17, i18);
                        if (iVar.F == null) {
                            iVar.F = new com.tencent.mm.plugin.sns.ad.widget.living.v(iVar.E);
                        }
                        com.tencent.mm.plugin.sns.ad.widget.living.v vVar = iVar.F;
                        if (vVar != null) {
                            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = iVar.f228753q;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                            int i27 = b1Var != null ? b1Var.f289095j : 1;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                            vVar.d(snsInfo2, i27, jj4Var, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                        }
                        if (snsInfo.isAdForbidAutoPlay()) {
                            r74.a0 a0Var2 = iVar.f228762z;
                            if (a0Var2 != null) {
                                a0Var2.m(r74.l.f393222g);
                            }
                        } else {
                            l44.b3.f316041a.h(iVar.f228832e);
                            com.tencent.mm.plugin.sns.ad.widget.living.v vVar2 = iVar.F;
                            if (vVar2 != null) {
                                vVar2.i();
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    public static final /* synthetic */ int m(dc4.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdLivingContainerWidth$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        int i17 = iVar.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdLivingContainerWidth$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        return i17;
    }

    public static final /* synthetic */ void n(dc4.i iVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAdLivingContainerHeight$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        iVar.H = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAdLivingContainerHeight$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    public static final /* synthetic */ void o(dc4.i iVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAdLivingContainerWidth$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        iVar.G = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAdLivingContainerWidth$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        this.f228758v = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        this.f228834g = view2;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f228753q;
        this.f228832e = snsInfo;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f228752p;
        this.f228831d = timeLineObject;
        if ((timeLineObject != null ? timeLineObject.Id : null) != null) {
            kotlin.jvm.internal.o.d(timeLineObject != null ? timeLineObject.Id : null);
        }
        r();
        boolean X = ca4.m0.X(q());
        i64.b1 b1Var = this.f228754r;
        if (X) {
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = new com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView((android.content.Context) this.f228755s, true);
            this.f228760x = snsTimelineVideoView;
            snsTimelineVideoView.x(false);
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView2 = this.f228760x;
            if (snsTimelineVideoView2 != null) {
                snsTimelineVideoView2.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView3 = this.f228760x;
            if (snsTimelineVideoView3 != null) {
                snsTimelineVideoView3.setThumbViewScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            a84.y0.o(this.f228760x, -1, -1);
            a84.y0.p(this.f228760x, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f228759w).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            a84.y0.b(viewGroup, this.f228760x, 0);
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView4 = this.f228760x;
            if (snsTimelineVideoView4 != null) {
                snsTimelineVideoView4.setUICallback(new dc4.a(this));
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView5 = this.f228760x;
            if (snsTimelineVideoView5 != null) {
                snsTimelineVideoView5.setVideoCallback(new z74.e(this.f228832e, snsTimelineVideoView5, b1Var, 4));
            }
        }
        this.A = (android.view.ViewStub) this.f228836i.findViewById(com.tencent.mm.R.id.g6y);
        this.D = (android.view.ViewStub) this.f228836i.findViewById(com.tencent.mm.R.id.n4i);
        this.f228762z = new r74.a0(this.f228758v, this.f228755s, this.f228753q, this.f228754r, this.f228756t, dc4.b.f228717d, dc4.c.f228721d, this.f228757u, this.f228839o);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOnAdRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        if (b1Var != null) {
            java.lang.String T = ca4.z0.T(snsInfo);
            if (!android.text.TextUtils.isEmpty(T) && !kotlin.jvm.internal.o.b("0", T)) {
                b1Var.a(T, this);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOnAdRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(this.f228753q) && (vVar = this.F) != null) {
            vVar.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        super.g();
        com.tencent.mm.plugin.sns.ad.widget.living.u uVar = com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f228753q;
        if (uVar.a(snsInfo)) {
            com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.F;
            if (vVar != null) {
                vVar.g();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            return;
        }
        if (this.f228761y) {
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.f228760x;
            if (snsTimelineVideoView != null) {
                snsTimelineVideoView.F();
            }
            i64.b1 b1Var = this.f228754r;
            if (b1Var != null) {
                b1Var.q(snsInfo != null ? snsInfo.field_snsId : 0L);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    @Override // dc4.v
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        super.i();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    @Override // dc4.v
    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f228753q;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            return;
        }
        com.tencent.mm.plugin.sns.storage.m0 m0Var = snsInfo.getAdXml().adCombinedGridInfo;
        if (m0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f228752p;
        if (timeLineObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            return;
        }
        r45.jj4 r17 = r();
        java.lang.Integer valueOf = r17 != null ? java.lang.Integer.valueOf(r17.f377856e) : null;
        this.f228761y = false;
        android.app.Activity activity = this.f228755s;
        com.tencent.mm.plugin.sns.ui.jw jwVar = activity instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI ? ((com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) activity).K2 : null;
        if (this.C == null) {
            this.C = new n74.j1();
        }
        r74.a0 a0Var = this.f228762z;
        if (a0Var != null) {
            a0Var.l(m0Var, valueOf, snsInfo, r(), this.f228752p, snsInfo.getLocalid(), jwVar, this.C);
        }
        if (this.B == null) {
            this.B = new a44.k(this.A, this.f228834g);
        }
        m0Var.b();
        r74.a0 a0Var2 = this.f228762z;
        if (a0Var2 != null) {
            a0Var2.k(m0Var, new dc4.e(this));
        }
        if (this.I == null) {
            this.I = new dc4.h(snsInfo, this, activity, this.f228758v);
        }
        com.tencent.mm.plugin.sns.ui.widget.l lVar = this.I;
        if (lVar != null) {
            lVar.f(snsInfo);
        }
        if (ca4.m0.X(q())) {
            this.f228761y = true;
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.f228760x;
            if (snsTimelineVideoView != null) {
                snsTimelineVideoView.setMute(true);
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView2 = this.f228760x;
            if (snsTimelineVideoView2 != null) {
                snsTimelineVideoView2.P(r(), snsInfo.getLocalid(), timeLineObject.CreateTime);
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView3 = this.f228760x;
            if (snsTimelineVideoView3 != null) {
                snsTimelineVideoView3.a();
            }
            if (snsInfo.isAdForbidAutoPlay()) {
                r74.a0 a0Var3 = this.f228762z;
                if (a0Var3 != null) {
                    a0Var3.m(r74.l.f393222g);
                }
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(this.f228832e)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                } else {
                    com.tencent.mars.xlog.Log.i("AdCombineGridDetailItem", "startPlay");
                    com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView4 = this.f228760x;
                    if (snsTimelineVideoView4 != null) {
                        if (snsTimelineVideoView4.w() || snsTimelineVideoView4.f0()) {
                            com.tencent.mars.xlog.Log.i("AdCombineGridDetailItem", "onlineVideo, resumePlay, hash=" + hashCode());
                            snsTimelineVideoView4.K();
                        } else {
                            com.tencent.mars.xlog.Log.i("AdCombineGridDetailItem", "onlineVideo, onResume, hash=" + hashCode());
                            l44.b3.f316041a.h(this.f228832e);
                            snsTimelineVideoView4.C();
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    public final android.app.Activity p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActivity", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActivity", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        return this.f228755s;
    }

    public final int q() {
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContentStyle", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f228752p;
        int i17 = (timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null) ? 0 : a90Var.f369837e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContentStyle", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        return i17;
    }

    public final r45.jj4 r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        r45.jj4 jj4Var = null;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f228752p;
        if ((timeLineObject != null ? timeLineObject.ContentObj : null) != null && timeLineObject.ContentObj.f369840h.size() >= 1) {
            jj4Var = (r45.jj4) timeLineObject.ContentObj.f369840h.get(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        return jj4Var;
    }
}
