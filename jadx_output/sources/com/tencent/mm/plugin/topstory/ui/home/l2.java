package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes7.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f175034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.m2 f175036f;

    public l2(com.tencent.mm.plugin.topstory.ui.home.m2 m2Var, int i17, java.lang.String str) {
        this.f175036f = m2Var;
        this.f175034d = i17;
        this.f175035e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f175035e;
        com.tencent.mm.plugin.topstory.ui.home.m2 m2Var = this.f175036f;
        int i17 = this.f175034d;
        try {
            java.lang.String str2 = (java.lang.String) m2Var.f175047g.get(java.lang.Integer.valueOf(i17));
            org.json.JSONArray jSONArray = com.tencent.mm.sdk.platformtools.t8.K0(str2) ? new org.json.JSONArray() : new org.json.JSONArray(str2);
            jSONArray.put(str);
            m2Var.d(i17, jSONArray.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId finish: %s, %s", java.lang.Integer.valueOf(i17), str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId, exception: " + e17.getMessage());
        }
    }
}
