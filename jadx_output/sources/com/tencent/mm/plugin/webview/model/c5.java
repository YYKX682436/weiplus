package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.modelsns.SnsAdClick f182825a;

    /* renamed from: b, reason: collision with root package name */
    public int f182826b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f182827c = new java.util.ArrayList();

    public void a() {
        java.util.ArrayList arrayList = this.f182827c;
        try {
            if (!arrayList.isEmpty()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putStringArrayList("reportAdH5Load", new java.util.ArrayList<>(arrayList));
                bundle.putInt("errCode", this.f182826b);
                bundle.putParcelable("snsAdClick", this.f182825a);
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.model.b5.f182795d.getClass(), null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebviewReporter", e17, "", new java.lang.Object[0]);
        }
        this.f182825a = null;
        arrayList.clear();
    }
}
