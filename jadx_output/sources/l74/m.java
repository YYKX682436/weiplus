package l74;

/* loaded from: classes4.dex */
public final class m extends i74.i {

    /* renamed from: q, reason: collision with root package name */
    public final l74.k f316899q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f316900r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f316901s;

    /* renamed from: t, reason: collision with root package name */
    public int f316902t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, com.tencent.mm.plugin.sns.ui.listener.i timelineClickListener) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(timelineClickListener, "timelineClickListener");
        this.f289497m = timelineClickListener;
        this.f289491d = context;
        this.f316899q = new l74.k(context, this.f289496i, this);
        this.f289500p = this.f289491d.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a_c);
        com.tencent.mars.xlog.Log.i("FeedbackVer2PromptManager", "init, windowWith = " + this.f289500p);
        if (this.f289491d instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) {
            i74.a aVar = this.f289496i;
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            aVar.f289457c = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
    }

    private final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        if (this.f289492e == null) {
            this.f289492e = new m74.b(this.f289491d);
        }
        m74.b bVar = this.f289492e;
        bVar.setContentView(this.f316900r ? l74.p.a(this.f289491d) : l74.p.b(this.f289491d));
        bVar.setWidth(this.f289500p);
        bVar.setHeight(-2);
        bVar.setFocusable(true);
        bVar.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        bVar.setOnDismissListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    @Override // i74.i, i74.l
    public void b(android.view.View view, int i17, java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        com.tencent.mars.xlog.Log.i("FeedbackVer2PromptManager", "onAction, actionId: " + i17);
        if (this.f316901s) {
            super.b(view, i17, obj);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (i17 == 1) {
                s();
            } else if (i17 == 2) {
                i();
            } else if (i17 == 3) {
                j();
            } else if (i17 == 8) {
                t();
            } else if (i17 == 9) {
                r();
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("FeedbackVer2PromptManager", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    @Override // i74.i
    public void n(int i17) {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.view.View view4;
        android.view.View view5;
        android.view.View view6;
        android.view.View view7;
        android.view.View view8;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        l74.k kVar = this.f316899q;
        kVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        boolean z17 = i17 >= 0;
        if (kVar.f316892f) {
            if (z17) {
                l74.o oVar = kVar.f316894h;
                if (oVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    view7 = oVar.f316913a;
                    if (view7 == null) {
                        kotlin.jvm.internal.o.o("topArrowIcon");
                        throw null;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                } else {
                    view7 = null;
                }
                if (view7 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view9 = view7;
                    yj0.a.d(view9, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                l74.o oVar2 = kVar.f316894h;
                if (oVar2 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    view8 = oVar2.f316914b;
                    if (view8 == null) {
                        kotlin.jvm.internal.o.o("bottomArrowIcon");
                        throw null;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                } else {
                    view8 = null;
                }
                if (view8 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    android.view.View view10 = view8;
                    yj0.a.d(view10, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view10, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                l74.o oVar3 = kVar.f316894h;
                if (oVar3 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    view5 = oVar3.f316913a;
                    if (view5 == null) {
                        kotlin.jvm.internal.o.o("topArrowIcon");
                        throw null;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                } else {
                    view5 = null;
                }
                if (view5 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    android.view.View view11 = view5;
                    yj0.a.d(view11, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view11, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                l74.o oVar4 = kVar.f316894h;
                if (oVar4 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    view6 = oVar4.f316914b;
                    if (view6 == null) {
                        kotlin.jvm.internal.o.o("bottomArrowIcon");
                        throw null;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                } else {
                    view6 = null;
                }
                if (view6 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    android.view.View view12 = view6;
                    yj0.a.d(view12, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view12, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else if (z17) {
            l74.n nVar = kVar.f316895i;
            if (nVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                view3 = nVar.f316903a;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("topArrowIcon");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
            } else {
                view3 = null;
            }
            if (view3 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                android.view.View view13 = view3;
                yj0.a.d(view13, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            l74.n nVar2 = kVar.f316895i;
            if (nVar2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                view4 = nVar2.f316904b;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("bottomArrowIcon");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
            } else {
                view4 = null;
            }
            if (view4 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                android.view.View view14 = view4;
                yj0.a.d(view14, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            l74.n nVar3 = kVar.f316895i;
            if (nVar3 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                view = nVar3.f316903a;
                if (view == null) {
                    kotlin.jvm.internal.o.o("topArrowIcon");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
            } else {
                view = null;
            }
            if (view != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                android.view.View view15 = view;
                yj0.a.d(view15, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view15, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            l74.n nVar4 = kVar.f316895i;
            if (nVar4 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                view2 = nVar4.f316904b;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("bottomArrowIcon");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
            } else {
                view2 = null;
            }
            if (view2 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                android.view.View view16 = view2;
                yj0.a.d(view16, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view16, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    @Override // i74.i
    public boolean o(android.view.View rawAnchor, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        int i17;
        i74.a aVar = this.f289496i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showFeedback", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        kotlin.jvm.internal.o.g(rawAnchor, "rawAnchor");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        this.f316901s = false;
        this.f316902t = 0;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ca4.j g17 = g(rawAnchor);
            if (g17 == null) {
                com.tencent.mars.xlog.Log.e("FeedbackVer2PromptManager", "the unlike tag is null. there is no data for showing window!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showFeedback", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
                return false;
            }
            aVar.q(g17, snsInfo);
            this.f316900r = aVar.p();
            com.tencent.mars.xlog.Log.i("FeedbackVer2PromptManager", "showFeedBack, isPersonalizedSwitchView: " + this.f316900r);
            boolean z17 = this.f316900r;
            boolean z18 = this.f289499o;
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 178);
                a84.t0.a(aVar.b(z18, 1556));
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 205);
                a84.t0.a(aVar.b(z18, com.tencent.mm.plugin.appbrand.jsapi.bio.face.q.CTRL_INDEX));
            }
            this.f289494g = h(rawAnchor);
            e();
            com.tencent.mars.xlog.Log.i("FeedbackVer2PromptManager", "showFeedback, windows.hash=" + this.f289492e.hashCode());
            if (this.f289492e.isShowing()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showFeedback", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
                return true;
            }
            this.f316899q.e(this.f289492e.getContentView());
            int c17 = c(this.f289494g, this.f289492e.getContentView());
            n(c17);
            m74.b bVar = this.f289492e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            if (c17 < 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
                i17 = com.tencent.mm.R.style.f494542pp;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
                i17 = com.tencent.mm.R.style.f494543pq;
            }
            bVar.setAnimationStyle(i17);
            this.f289492e.showAsDropDown(this.f289494g, 0, c17, 8388613);
            m74.b bVar2 = this.f289492e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDimAccount", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDimAccount", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            bVar2.a(0.5f);
            if (this.f316900r) {
                u();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showFeedback", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            return true;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            java.lang.Object m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
            }
            kotlin.Result.m527isFailureimpl(m521constructorimpl);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showFeedback", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            return false;
        }
    }

    @Override // i74.i, android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        l74.k kVar = this.f316899q;
        kVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentMode", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        int i17 = kVar.f316890d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMode", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        if (i17 != this.f316902t) {
            boolean z17 = this.f289499o;
            i74.a aVar = this.f289496i;
            if (i17 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 181);
                a84.t0.a(aVar.b(z17, com.tencent.mm.plugin.appbrand.jsapi.bio.face.p.CTRL_INDEX));
            } else if (i17 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 180);
                a84.t0.a(aVar.b(z17, 1558));
            }
            com.tencent.mars.xlog.Log.i("FeedbackVer2PromptManager", "request set PersonalizedAdSwitch, mode: " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestChangeMode", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            com.tencent.mars.xlog.Log.i("FeedbackVer2PromptManager", "request set PersonalizedAdSwitch, mode: " + i17);
            if (i17 == 1 || i17 == 2) {
                r45.x75 x75Var = new r45.x75();
                x75Var.f389847d = i17;
                x75Var.b().l();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestChangeMode", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        }
        this.f289492e = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    public final void r() {
        s34.p0 p0Var;
        com.tencent.mm.plugin.sns.storage.l lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLikedAd", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        d();
        android.content.Context context = this.f289491d;
        i74.a aVar = this.f289496i;
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikedAdsClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.tencent.mm.plugin.sns.storage.ADXml e17 = aVar.e();
        if (e17 == null || (lVar = e17.adFeedbackInfo) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikedAdsClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            p0Var = null;
        } else {
            p0Var = lVar.f166041c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikedAdsClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
        n74.x.a(context, p0Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 207);
        a84.t0.a(aVar.b(this.f289499o, 1562));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLikedAd", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    public final void s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNoInterestingClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        if (this.f289492e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNoInterestingClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            return;
        }
        android.view.View findViewById = android.view.LayoutInflater.from(this.f289491d).inflate(this.f289493f, (android.view.ViewGroup) null).findViewById(com.tencent.mm.R.id.n2o);
        kotlin.jvm.internal.o.d(findViewById);
        pm0.v.B(findViewById);
        android.view.View contentView = this.f289492e.getContentView();
        android.view.ViewGroup viewGroup = contentView instanceof android.view.ViewGroup ? (android.view.ViewGroup) contentView : null;
        android.view.KeyEvent.Callback childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
        if (viewGroup2 != null) {
            viewGroup2.removeViewAt(1);
            viewGroup2.addView(findViewById, 1);
        }
        this.f289492e.getContentView().requestLayout();
        this.f316901s = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNoInterestingUI", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        i74.d dVar = this.f289495h;
        dVar.e(findViewById);
        if (findViewById.findViewById(com.tencent.mm.R.id.n2t) != null) {
            dVar.c(findViewById.findViewById(com.tencent.mm.R.id.n2t));
        }
        if (findViewById.findViewById(com.tencent.mm.R.id.n2v) != null) {
            android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.n2v);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackPromptManager", "setNoInterestingUI", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackPromptManager", "setNoInterestingUI", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNoInterestingUI", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNoInterestingClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    public final void t() {
        s34.p0 p0Var;
        com.tencent.mm.plugin.sns.storage.l lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        d();
        android.content.Context context = this.f289491d;
        i74.a aVar = this.f289496i;
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReceivedReasonClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.tencent.mm.plugin.sns.storage.ADXml e17 = aVar.e();
        if (e17 == null || (lVar = e17.adFeedbackInfo) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReceivedReasonClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            p0Var = null;
        } else {
            p0Var = lVar.f166040b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReceivedReasonClickAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
        n74.x.a(context, p0Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 206);
        a84.t0.a(aVar.b(this.f289499o, 1561));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }

    public final void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestStatusAndUpdate", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
        com.tencent.mars.xlog.Log.i("FeedbackVer2PromptManager", "requestStatusAndUpdate");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.x75 x75Var = new r45.x75();
        x75Var.f389847d = 3;
        pq5.g l17 = x75Var.b().l();
        android.content.Context context = this.f289491d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) context).h(new l74.l(this, currentTimeMillis));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestStatusAndUpdate", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
    }
}
