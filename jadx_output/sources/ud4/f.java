package ud4;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.plugin.sns.model.f2 {

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f426693c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f426694d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f426695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ud4.h f426696f;

    public f(ud4.h hVar, android.widget.ImageView imageView, java.lang.String str) {
        this.f426696f = hVar;
        this.f426693c = imageView;
        this.f426694d = str;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public java.lang.Object a(java.lang.Object[] objArr) {
        java.lang.Boolean bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        int i17 = ud4.h.f426703t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        boolean z17 = this.f426696f.f426708p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (z17) {
            bool = java.lang.Boolean.FALSE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        } else {
            int mj6 = com.tencent.mm.plugin.sns.model.l4.mj();
            int mj7 = com.tencent.mm.plugin.sns.model.l4.mj();
            this.f426695e = com.tencent.mm.sdk.platformtools.x.T(this.f426694d, mj6, mj7, true);
            android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(this.f426695e, com.tencent.mm.compatible.util.Exif.fromFile(r4).getOrientationInDegree());
            this.f426695e = w07;
            this.f426695e = com.tencent.mm.plugin.sns.storage.m2.m0(w07);
            bool = java.lang.Boolean.TRUE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        return bool;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public java.util.concurrent.ExecutorService b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        java.util.concurrent.ExecutorService ij6 = com.tencent.mm.plugin.sns.model.l4.ij();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        return ij6;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public void c(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        super.c((java.lang.Boolean) obj);
        int i17 = ud4.h.f426703t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        ud4.h hVar = this.f426696f;
        boolean z17 = hVar.f426708p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        } else {
            if (ca4.z0.f(this.f426695e)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                java.util.HashMap hashMap = hVar.f426704i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                android.graphics.Bitmap bitmap = this.f426695e;
                java.lang.String str = this.f426694d;
                hashMap.put(str, bitmap);
                android.widget.ImageView imageView = this.f426693c;
                if (imageView.getTag() != null && (imageView.getTag() instanceof java.lang.String) && imageView.getTag().equals(str)) {
                    imageView.setImageBitmap(this.f426695e);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
    }
}
