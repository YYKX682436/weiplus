package x74;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f452452a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f452453b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f452454c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452455d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f452456e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f452457f;

    public b(android.app.Activity activity, android.view.ViewGroup viewGroup) {
        this(activity, viewGroup, false);
    }

    public static final void a(x74.b bVar, int i17, int i18) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        com.tencent.mars.xlog.Log.i("SnsAd.PreviewHelper", "calc watermark bound");
        android.view.ViewGroup viewGroup = bVar.f452453b;
        if (viewGroup == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        } else {
            android.view.View view = bVar.f452456e;
            if (view == null) {
                com.tencent.mars.xlog.Log.w("SnsAd.PreviewHelper", "the water mark view is null!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            } else {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        com.tencent.mars.xlog.Log.w("SnsAd.PreviewHelper", "the water mark view has not layout params");
                        layoutParams = new android.view.ViewGroup.LayoutParams(i17, i18);
                    }
                    layoutParams.width = i17;
                    if (bVar.f452454c) {
                        layoutParams.height = i18;
                    } else {
                        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f482875qh);
                        if (findViewById != null) {
                            if (findViewById.getVisibility() == 0) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativePositionToRoot", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
                                android.graphics.Rect rect = new android.graphics.Rect();
                                findViewById.getDrawingRect(rect);
                                viewGroup.offsetDescendantRectToMyCoords(findViewById, rect);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativePositionToRoot", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
                                i18 = rect.top;
                            }
                        }
                        layoutParams.height = i18;
                    }
                    view.setLayoutParams(layoutParams);
                    m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
                }
                kotlin.Result.m527isFailureimpl(m521constructorimpl);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
    }

    public final void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        android.view.View findViewById;
        android.view.View inflate;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        java.lang.String T = ca4.z0.T(snsInfo);
        if (T == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.PreviewHelper", "the sns id is empty!!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("activityRootView", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        android.view.View view = null;
        android.app.Activity activity = this.f452452a;
        if (activity == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("activityRootView", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            findViewById = null;
        } else {
            findViewById = activity.findViewById(android.R.id.content);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("activityRootView", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        }
        if (findViewById == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.PreviewHelper", "the fixed view is null!!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("SnsAd.PreviewHelper", "the activityRootView is attached to windows " + findViewById.isAttachedToWindow() + ", the sns id is " + this.f452455d + ", new sns id is " + T);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInflate", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        if (activity == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInflate", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        } else {
            if (this.f452456e == null) {
                com.tencent.mars.xlog.Log.i("SnsAd.PreviewHelper", "the watermark view is going to inflate!!");
                android.view.ViewGroup viewGroup = this.f452453b;
                android.view.View findViewById2 = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.r8q) : null;
                android.view.ViewStub viewStub = findViewById2 instanceof android.view.ViewStub ? (android.view.ViewStub) findViewById2 : null;
                if (viewStub != null && (inflate = viewStub.inflate()) != null) {
                    java.lang.String string = activity.getString(com.tencent.mm.R.string.f493191ma2);
                    if (string == null) {
                        string = "";
                    }
                    java.lang.String str = string;
                    int color = activity.getColor(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.afc : com.tencent.mm.R.color.afb);
                    android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.r8s);
                    if (imageView != null) {
                        imageView.setImageDrawable(new b44.b(str, a84.d0.a(10), color, -18.0f, 0.0f, 0, 48, null));
                    }
                    view = inflate;
                }
                this.f452456e = view;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInflate", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        }
        if (kotlin.jvm.internal.o.b(this.f452455d, T) && !this.f452454c) {
            com.tencent.mars.xlog.Log.i("SnsAd.PreviewHelper", "the sns id is same as the before, the current id is ".concat(T));
            android.view.View view2 = this.f452456e;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "update", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "update", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (this.f452457f) {
            com.tencent.mars.xlog.Log.i("SnsAd.PreviewHelper", "there is already an draw listener in view tree observer!!");
        } else {
            this.f452457f = true;
            android.view.ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(new x74.a(this, findViewById, T));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
    }

    public final void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        java.lang.Object m521constructorimpl;
        boolean h07;
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateWithSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        if (this.f452453b == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWithSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPreviewAd", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            if (snsInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPreviewAd", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
                h07 = false;
            } else {
                h07 = ca4.m0.h0(snsInfo);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPreviewAd", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            }
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (!h07) {
            com.tencent.mars.xlog.Log.i("SnsAd.PreviewHelper", "the sns feed does not need water mark");
            android.view.View view = this.f452456e;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "updateWithSnsInfo", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "updateWithSnsInfo", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWithSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            return;
        }
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (snsInfo != null) {
            b(snsInfo);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.PreviewHelper", "the sns info is null, is it real sns feed ??!!!!");
            android.view.View view2 = this.f452456e;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "updateWithSnsInfo", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "updateWithSnsInfo", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var2);
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWithSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
    }

    public b(android.app.Activity activity, android.view.ViewGroup viewGroup, boolean z17) {
        this.f452452a = activity;
        this.f452453b = viewGroup;
        this.f452454c = z17;
        this.f452455d = "";
    }
}
