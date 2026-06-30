package o94;

/* loaded from: classes.dex */
public class b implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f343734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f343735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343736c;

    public b(android.widget.ImageView imageView, int i17, java.lang.String str) {
        this.f343734a = imageView;
        this.f343735b = i17;
        this.f343736c = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
        int i17 = this.f343735b;
        android.widget.ImageView imageView = this.f343734a;
        imageView.setTag(i17, "");
        com.tencent.mars.xlog.Log.e("HalfScreenSubscribeUtils", "onDownloadError, hash=" + imageView.hashCode() + ", url=" + this.f343736c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.widget.ImageView imageView = this.f343734a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
                if (J2 != null) {
                    imageView.setImageBitmap(J2);
                    imageView.setTag(this.f343735b, this.f343736c);
                    imageView.hashCode();
                } else {
                    com.tencent.mars.xlog.Log.e("HalfScreenSubscribeUtils", "onDownloaded, bitmap==null");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("HalfScreenSubscribeUtils", "onDownloaded, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
    }
}
