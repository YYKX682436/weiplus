package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.f4 f164173f;

    public e4(com.tencent.mm.plugin.sns.model.f4 f4Var, java.lang.String str, int i17) {
        this.f164173f = f4Var;
        this.f164171d = str;
        this.f164172e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$4");
        android.content.SharedPreferences.Editor edit = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("sns_ad_download_resource_preferences", 0).edit();
        java.lang.String str = this.f164171d;
        edit.putBoolean(str, true).commit();
        com.tencent.mm.plugin.sns.model.g4.f(this.f164173f.f164191d).o(str, this.f164172e);
        com.tencent.mm.plugin.sns.model.l4.Cj().w(str, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$4");
    }
}
