package jp3;

/* loaded from: classes.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f300989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f300991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300993h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300994i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300995m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300996n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300997o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300998p;

    public e(int i17, java.lang.String str, android.app.Activity activity, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.f300989d = i17;
        this.f300990e = str;
        this.f300991f = activity;
        this.f300992g = str2;
        this.f300993h = str3;
        this.f300994i = str4;
        this.f300995m = str5;
        this.f300996n = str6;
        this.f300997o = str7;
        this.f300998p = str8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doReturnAndFinish] errorCode：");
        int i17 = this.f300989d;
        sb6.append(i17);
        sb6.append(", errorMsg：");
        java.lang.String str = this.f300990e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintHelper", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("palm_error_code", i17);
        if (str == null) {
            str = "88888";
        }
        intent.putExtra("palm_error_msg", str);
        java.lang.String str2 = this.f300992g;
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("palm_stats_file_path", str2);
        java.lang.String str3 = this.f300993h;
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("palm_register_image_path", str3);
        java.lang.String str4 = this.f300994i;
        if (str4 == null) {
            str4 = "";
        }
        intent.putExtra("palm_register_image_md5", str4);
        java.lang.String str5 = this.f300995m;
        if (str5 == null) {
            str5 = "";
        }
        intent.putExtra("palm_live_image_path", str5);
        java.lang.String str6 = this.f300996n;
        if (str6 == null) {
            str6 = "";
        }
        intent.putExtra("palm_live_image_md5", str6);
        java.lang.String str7 = this.f300997o;
        if (str7 == null) {
            str7 = "";
        }
        intent.putExtra("palm_video_path", str7);
        java.lang.String str8 = this.f300998p;
        intent.putExtra("palm_video_md5", str8 != null ? str8 : "");
        intent.putExtra("phone_type", o45.wf.f343024b + '_' + o45.wf.f343025c);
        android.app.Activity activity = this.f300991f;
        activity.setResult(-1, intent);
        activity.finish();
    }
}
