package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f185067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f185068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f185069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185070g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f185071h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185072i;

    public e3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, int i17, double d17, double d18, java.lang.String str, int i18) {
        this.f185072i = c1Var;
        this.f185067d = i17;
        this.f185068e = d17;
        this.f185069f = d18;
        this.f185070g = str;
        this.f185071h = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.g8 c76;
        com.tencent.mm.plugin.webview.stub.z0 z0Var;
        nw4.y2 y2Var;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185072i;
        android.content.Context context = c1Var.f184975d;
        int i17 = this.f185071h;
        if (context != null && (context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
            android.content.Context context2 = c1Var.f184975d;
            double d17 = this.f185068e;
            double d18 = this.f185069f;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.d3 d3Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.d3(this);
            com.tencent.mm.plugin.webview.ui.tools.jsapi.u8 u8Var = c1Var.D;
            u8Var.getClass();
            if (context2 != null && (context2 instanceof com.tencent.mm.ui.MMActivity) && !((com.tencent.mm.ui.MMActivity) context2).isFinishing()) {
                u8Var.f185443d = i17;
                z17 = true;
                u8Var.f185444e = true;
                u8Var.f185445f = this.f185067d;
                u8Var.f185446g = new com.tencent.mm.plugin.webview.ui.tools.jsapi.q8(d17, d18, null);
                u8Var.f185447h = this.f185070g;
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context2);
                u8Var.f185448i = weakReference;
                u8Var.f185449m = d3Var;
                android.content.Context context3 = (android.content.Context) weakReference.get();
                if (context3 != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(context3, "com.tencent.mm.pluginsdk.ui.tools.AppChooserUI");
                    java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(5);
                    arrayList.add(jt.w.TencentMap.h());
                    arrayList.add(jt.w.GoogleMap.h());
                    arrayList.add(jt.w.SogouMap.h());
                    arrayList.add(jt.w.BaiduMap.h());
                    arrayList.add(jt.w.AutonaviMap.h());
                    intent.putStringArrayListExtra("targetwhitelist", arrayList);
                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(java.lang.String.format("geo:%f,%f", java.lang.Double.valueOf(u8Var.f185446g.f185368a), java.lang.Double.valueOf(u8Var.f185446g.f185369b))));
                    intent.putExtra("targetintent", intent2);
                    android.os.Bundle bundle = new android.os.Bundle(2);
                    bundle.putInt("key_map_app", u8Var.f185445f);
                    bundle.putParcelable("key_target_intent", intent2);
                    intent.putExtra("key_recommend_params", bundle);
                    intent.putExtra("type", 2);
                    intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, context3.getString(com.tencent.mm.R.string.f493690lb0));
                    ((com.tencent.mm.ui.MMActivity) context3).mmStartActivityForResult((com.tencent.mm.ui.da) u8Var, intent, 33);
                }
                if (!z17 || (z0Var = (c76 = c1Var.c7(i17)).f185141b) == null || (y2Var = c76.f185140a) == null) {
                    return;
                }
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.L3(this.f185072i, z0Var, y2Var, "openMapNavigateMenu:fail", null, true, true);
                return;
            }
        }
        z17 = false;
        if (z17) {
        }
    }
}
