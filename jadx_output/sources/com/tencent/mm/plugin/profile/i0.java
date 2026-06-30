package com.tencent.mm.plugin.profile;

/* loaded from: classes8.dex */
public class i0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153489d;

    public i0(com.tencent.mm.plugin.profile.e0 e0Var) {
        this.f153489d = e0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        r45.du5 du5Var;
        android.net.Uri uri;
        m1Var.setHasCallbackToQueue(true);
        er3.a aVar = (er3.a) m1Var;
        com.tencent.mm.plugin.profile.e0 e0Var = this.f153489d;
        com.tencent.mm.modelbase.o oVar = aVar.f256019e;
        if (i17 == 0 && i18 == 0) {
            if (aVar.f256020f == null) {
                aVar.f256020f = (r45.kk3) oVar.f70711b.f70700a;
            }
            java.lang.String str3 = aVar.f256020f.f378779d;
            try {
                uri = android.net.Uri.parse(str3);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "goToWework() Exception:%s", e17.getMessage());
                uri = null;
            }
            e0Var.f153420d.startActivityForResult(new android.content.Intent("android.intent.action.VIEW", uri), 111);
            com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "goToWework() success! openurl:%s", str3);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "goToWework() fail!");
        if (aVar.f256020f == null) {
            aVar.f256020f = (r45.kk3) oVar.f70711b.f70700a;
        }
        r45.ie ieVar = aVar.f256020f.BaseResponse;
        if (ieVar == null || (du5Var = ieVar.f376960e) == null) {
            str2 = aVar.f256021g;
        } else {
            str2 = du5Var.f372756d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = e0Var.f153420d.getString(com.tencent.mm.R.string.hfg);
        }
        com.tencent.mm.ui.MMActivity mMActivity = e0Var.f153420d;
        db5.e1.F(mMActivity, str2, mMActivity.getString(com.tencent.mm.R.string.jz9), false);
    }
}
