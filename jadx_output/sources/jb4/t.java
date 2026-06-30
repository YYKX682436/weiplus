package jb4;

/* loaded from: classes4.dex */
public class t extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f298848a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f298849b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f298850c;

    /* renamed from: d, reason: collision with root package name */
    public final jb4.u f298851d;

    public t(java.lang.String str, java.lang.String str2, java.lang.String str3, jb4.u uVar) {
        this.f298849b = str;
        this.f298850c = str2;
        this.f298848a = str3;
        this.f298851d = uVar;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        java.lang.String str = this.f298850c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        android.graphics.Bitmap b17 = jb4.v.b(this.f298849b, this.f298848a);
        if (b17 != null) {
            com.tencent.mars.xlog.Log.i("SphereImageView.SphereImageLoader", "has shot");
        } else {
            try {
                if (android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mars.xlog.Log.e("SphereImageView.SphereImageLoader", "thumbUrl is empty");
                } else {
                    b17 = za4.t0.h(str);
                    if (b17 != null) {
                        com.tencent.mars.xlog.Log.i("SphereImageView.SphereImageLoader", "has cache thumb");
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SphereImageView.SphereImageLoader", "getCachedImg exp:" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        return b17;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        jb4.u uVar = this.f298851d;
        if (uVar != null) {
            uVar.a(true, "", bitmap, this.f298849b);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
    }
}
