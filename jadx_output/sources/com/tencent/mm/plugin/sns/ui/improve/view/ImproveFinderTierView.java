package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveFinderTierView;", "Landroid/widget/LinearLayout;", "", "getReqType", "", "getPublishId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveFinderTierView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f169135d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f169136e;

    public ImproveFinderTierView(android.content.Context context) {
        super(context);
        this.f169135d = com.tencent.mm.plugin.sns.model.l4.qj().b();
        ym5.a1.h(this, new bd4.g0(this));
    }

    public static final /* synthetic */ java.lang.String a(com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView improveFinderTierView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPublishId", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        java.lang.String publishId = improveFinderTierView.getPublishId();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPublishId", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        return publishId;
    }

    public static final /* synthetic */ int b(com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView improveFinderTierView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getReqType", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        int reqType = improveFinderTierView.getReqType();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getReqType", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        return reqType;
    }

    public static final jz5.l c(com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView improveFinderTierView, cl0.g gVar, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$jsonToIntPair", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        improveFinderTierView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jsonToIntPair", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        jz5.l lVar = new jz5.l(str, java.lang.Integer.valueOf(gVar.optInt(str, -1)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jsonToIntPair", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$jsonToIntPair", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        return lVar;
    }

    public static final jz5.l d(com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView improveFinderTierView, cl0.g gVar, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$jsonToStrPair", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        improveFinderTierView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jsonToStrPair", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        java.lang.String optString = gVar.optString(str, "null");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderTierView", "report key:" + str + " value:" + optString);
        jz5.l lVar = new jz5.l(str, optString);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jsonToStrPair", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$jsonToStrPair", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        return lVar;
    }

    private final java.lang.String getPublishId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPublishId", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("new_feed_id");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderTierView", "getPublishId value:" + stringExtra);
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPublishId", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        return stringExtra;
    }

    private final int getReqType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReqType", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        rc4.e eVar = rc4.e.f394136a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserRefresh", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        boolean z17 = rc4.e.f394146k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserRefresh", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqType", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
            return 3;
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        if (((android.app.Activity) context).getIntent().getBooleanExtra("enter_by_red", false)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqType", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
            return 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqType", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        return 1;
    }

    public ImproveFinderTierView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f169135d = com.tencent.mm.plugin.sns.model.l4.qj().b();
        ym5.a1.h(this, new bd4.g0(this));
    }

    public ImproveFinderTierView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f169135d = com.tencent.mm.plugin.sns.model.l4.qj().b();
        ym5.a1.h(this, new bd4.g0(this));
    }
}
