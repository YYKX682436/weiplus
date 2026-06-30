package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class k extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f169593d;

    /* renamed from: e, reason: collision with root package name */
    public final ca4.j f169594e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f169595f;

    /* renamed from: g, reason: collision with root package name */
    public int f169596g = 0;

    public k(android.content.Context context, ca4.j jVar) {
        this.f169594e = null;
        this.f169595f = null;
        this.f169593d = context;
        this.f169594e = jVar;
        this.f169595f = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        int i17 = this.f169596g;
        ca4.j jVar = this.f169594e;
        if (i17 == 1) {
            int size = jVar.f39952a.f39940b.adUnlikeInfo.a().size();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
            return size;
        }
        com.tencent.mm.plugin.sns.storage.l lVar = jVar.f39952a.f39939a.adFeedbackInfo;
        int size2 = (lVar != null ? ((java.util.LinkedList) lVar.f166039a).size() : 0) + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return size2;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        java.lang.Object obj = this.f169594e.f39952a.f39940b.adUnlikeInfo.a().get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        long j17 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return j17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        android.content.Context context = this.f169593d;
        android.view.View inflate = view == null ? android.view.View.inflate(context, com.tencent.mm.R.layout.f487980d5, null) : view;
        ca4.j jVar = this.f169594e;
        inflate.setTag(jVar);
        int i18 = this.f169596g;
        java.lang.String str2 = this.f169595f;
        if (i18 == 1) {
            com.tencent.mm.plugin.sns.storage.c cVar = (com.tencent.mm.plugin.sns.storage.c) getItem(i17);
            str = "zh_CN".equals(str2) ? cVar.f165942a : ("zh_TW".equals(str2) || "zh_HK".equals(str2)) ? cVar.f165943b : cVar.f165944c;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = cVar.f165944c;
            }
        } else if (i17 == 0) {
            if (jVar != null) {
                ca4.i iVar = jVar.f39952a;
                if (iVar.f39939a != null) {
                    com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = iVar.f39940b;
                    java.lang.String str3 = "zh_CN".equals(str2) ? aDInfo.adDislikeInfoTitle_cn : ("zh_TW".equals(str2) || "zh_HK".equals(str2)) ? aDInfo.adDislikeInfoTitle_tw : aDInfo.adDislikeInfoTitle_en;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        str3 = context.getString(com.tencent.mm.R.string.j8p);
                    }
                    str = str3;
                }
            }
            str = "";
        } else {
            com.tencent.mm.plugin.sns.storage.l lVar = jVar.f39952a.f39939a.adFeedbackInfo;
            if (lVar != null) {
                java.util.List list = lVar.f166039a;
                if (i17 <= ((java.util.LinkedList) list).size()) {
                    com.tencent.mm.plugin.sns.storage.m mVar = (com.tencent.mm.plugin.sns.storage.m) ((java.util.LinkedList) list).get(i17 - 1);
                    str = "zh_CN".equals(str2) ? mVar.f166057a : ("zh_TW".equals(str2) || "zh_HK".equals(str2)) ? mVar.f166059c : mVar.f166058b;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        str = mVar.f166058b;
                    }
                }
            }
            str = "";
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482679l1);
        if (jVar.f39952a.f39940b.forbidClick) {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        } else {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478524a5));
        }
        textView.setText(str);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f482678l0);
        int i19 = i17 == getCount() - 1 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/AdUnLikeReasonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/AdUnLikeReasonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return inflate;
    }
}
