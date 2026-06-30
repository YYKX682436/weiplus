package l74;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f316887a;

    /* renamed from: b, reason: collision with root package name */
    public final i74.a f316888b;

    /* renamed from: c, reason: collision with root package name */
    public final i74.l f316889c;

    /* renamed from: d, reason: collision with root package name */
    public int f316890d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f316891e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f316892f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f316893g;

    /* renamed from: h, reason: collision with root package name */
    public l74.o f316894h;

    /* renamed from: i, reason: collision with root package name */
    public l74.n f316895i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f316896j;

    public k(android.content.Context mContext, i74.a aVar, i74.l lVar) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f316887a = mContext;
        this.f316888b = aVar;
        this.f316889c = lVar;
        this.f316896j = true;
    }

    public static final /* synthetic */ android.view.View a(l74.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMContentView$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        android.view.View view = kVar.f316891e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMContentView$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        return view;
    }

    public static final /* synthetic */ i74.l b(l74.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFeedbackController$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        i74.l lVar = kVar.f316889c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFeedbackController$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        return lVar;
    }

    public final void c(int i17) {
        java.lang.String str;
        l74.o oVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSwitchUIStatus", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        this.f316890d = i17;
        l74.o oVar2 = this.f316894h;
        if (oVar2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPersonalizedTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view = oVar2.f316917e;
            if (view == null) {
                kotlin.jvm.internal.o.o("personalizedTitleView");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPersonalizedTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.n();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPersonalizedDesView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view2 = oVar2.f316918f;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("personalizedDesView");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPersonalizedDesView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.n();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRandomTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view3 = oVar2.f316926n;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("randomTitleView");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRandomTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.n();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRandomDescView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view4 = oVar2.f316927o;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("randomDescView");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRandomDescView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.n();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPersonalizedTitleLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view5 = oVar2.f316919g;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("personalizedTitleLoadingMask");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPersonalizedTitleLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.c();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPersonalizedDescLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view6 = oVar2.f316920h;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("personalizedDescLoadingMask");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPersonalizedDescLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.c();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRandomTitleLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view7 = oVar2.f316928p;
            if (view7 == null) {
                kotlin.jvm.internal.o.o("randomTitleLoadingMask");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRandomTitleLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.c();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRandomDescLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            android.view.View view8 = oVar2.f316929q;
            if (view8 == null) {
                kotlin.jvm.internal.o.o("randomDescLoadingMask");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRandomDescLoadingMask", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
            c44.a.c();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.content.Context context = this.f316887a;
            if (1 == i17) {
                l74.o oVar3 = this.f316894h;
                if (oVar3 != null) {
                    oVar3.d().setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.Brand_Alpha_0_1));
                    oVar3.c().setBackgroundResource(com.tencent.mm.R.drawable.d8v);
                    oVar3.h().setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_3));
                    oVar3.g().setBackgroundResource(com.tencent.mm.R.drawable.d8u);
                    if (this.f316896j) {
                        android.view.View b17 = oVar3.b();
                        c44.a.n();
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        arrayList9.add(0);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(b17, arrayList9.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        b17.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(b17, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View f17 = oVar3.f();
                        c44.a.k();
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        arrayList10.add(4);
                        java.util.Collections.reverse(arrayList10);
                        yj0.a.d(f17, arrayList10.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        f17.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                        yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else if (2 == i17 && (oVar = this.f316894h) != null) {
                oVar.h().setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.Brand_Alpha_0_1, context.getTheme()));
                oVar.g().setBackgroundResource(com.tencent.mm.R.drawable.d8v);
                oVar.d().setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_3, context.getTheme()));
                oVar.c().setBackgroundResource(com.tencent.mm.R.drawable.d8u);
                if (this.f316896j) {
                    android.view.View f18 = oVar.f();
                    c44.a.n();
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    arrayList11.add(0);
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(f18, arrayList11.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    f18.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                    yj0.a.f(f18, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View b18 = oVar.b();
                    c44.a.k();
                    java.util.ArrayList arrayList12 = new java.util.ArrayList();
                    arrayList12.add(4);
                    java.util.Collections.reverse(arrayList12);
                    yj0.a.d(b18, arrayList12.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    b18.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                    yj0.a.f(b18, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "setSwitchUIStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            str = "setSwitchUIStatus";
        } else {
            str = "setSwitchUIStatus";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFeedbackViewUIStatus", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        if (this.f316892f) {
            l74.o oVar = this.f316894h;
            if (oVar != null) {
                if (this.f316893g) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    android.view.View view = oVar.f316934v;
                    if (view == null) {
                        kotlin.jvm.internal.o.o("spaceView");
                        throw null;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View a17 = oVar.a();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(a17, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    android.view.View view2 = oVar.f316934v;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("spaceView");
                        throw null;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$PersonalizedSwitchViewHolder");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View a18 = oVar.a();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(a18, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(a18, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            l74.n nVar = this.f316895i;
            if (nVar != null) {
                if (this.f316893g) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                    android.view.View view3 = nVar.f316909g;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("spaceView");
                        throw null;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View a19 = nVar.a();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(a19, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a19.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(a19, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                    android.view.View view4 = nVar.f316909g;
                    if (view4 == null) {
                        kotlin.jvm.internal.o.o("spaceView");
                        throw null;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpaceView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder$FeedbackViewHolder");
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList7.add(0);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View a27 = nVar.a();
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(a27, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a27.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(a27, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer", "updateFeedbackViewUIStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFeedbackViewUIStatus", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r5 != true) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r31) {
        /*
            Method dump skipped, instructions count: 1479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l74.k.e(android.view.View):void");
    }
}
