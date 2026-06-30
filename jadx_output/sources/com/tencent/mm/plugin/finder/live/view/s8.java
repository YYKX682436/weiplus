package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class s8 implements com.tencent.mm.plugin.appbrand.widget.d0 {
    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public int a() {
        return com.tencent.mm.R.layout.axg;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public void b(android.content.Context context, java.lang.String data, yz5.l onWidgetCreated) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(onWidgetCreated, "onWidgetCreated");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public android.widget.RelativeLayout.LayoutParams c() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i65.a.b(context, 72), i65.a.b(context, 89));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.topMargin = i65.a.b(context, 12);
        layoutParams.rightMargin = i65.a.b(context, 12);
        return layoutParams;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public android.view.View d(android.content.Context context, java.lang.String data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488968dj, (android.view.ViewGroup) null);
        try {
            if (new org.json.JSONObject(data).has("image_path")) {
                kotlin.jvm.internal.o.d(inflate);
                e(inflate, data);
            } else {
                com.tencent.mars.xlog.Log.i("FinderLiveProductRecordPlayWidget", "No img path try fetchDataTask");
                pm0.v.X(new com.tencent.mm.plugin.finder.live.view.i8(inflate));
                com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(data), com.tencent.mm.plugin.finder.live.view.h8.class, new com.tencent.mm.plugin.finder.live.view.j8(this, inflate), null);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveProductRecordPlayWidget", th6, "createWidget failed, data:".concat(data), new java.lang.Object[0]);
        }
        inflate.setTag("isAsyncFinderRecordPlayWidget");
        return inflate;
    }

    public final void e(android.view.View view, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveProductRecordPlayWidget", "updateWidgetVisibilityAndImage data is null");
            pm0.v.X(new com.tencent.mm.plugin.finder.live.view.k8(view));
            return;
        }
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("image_path");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                com.tencent.mars.xlog.Log.e("FinderLiveProductRecordPlayWidget", "updateWidgetVisibilityAndImage but no imgData");
                pm0.v.X(new com.tencent.mm.plugin.finder.live.view.l8(view));
                return;
            }
            pm0.v.X(new com.tencent.mm.plugin.finder.live.view.o8(view, str));
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) view.findViewById(com.tencent.mm.R.id.uuu);
            if (mMRoundCornerImageView != null) {
                pm0.v.w(new com.tencent.mm.plugin.finder.live.view.q8(optString, mMRoundCornerImageView));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveProductRecordPlayWidget", th6, "updateWidgetVisibilityAndImage error", new java.lang.Object[0]);
            pm0.v.X(new com.tencent.mm.plugin.finder.live.view.r8(view));
        }
    }
}
