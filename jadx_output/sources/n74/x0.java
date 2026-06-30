package n74;

/* loaded from: classes4.dex */
public abstract class x0 {
    public static android.widget.ImageView a(android.content.Context context, com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, int i17, int i18) {
        android.widget.FrameLayout.LayoutParams e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
        if (context == null || photosContent == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
            return null;
        }
        try {
            e17 = photosContent.e(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AddWeAppIconHelper", th6.toString());
        }
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("AddWeAppIconHelper", "getEachImageViewLayoutParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
            return null;
        }
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(e17);
        layoutParams.width = i18;
        layoutParams.height = i18;
        imageView.setImageDrawable(i65.a.i(context, com.tencent.mm.R.drawable.bpt));
        imageView.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
        return imageView;
    }
}
