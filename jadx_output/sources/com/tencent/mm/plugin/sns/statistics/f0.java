package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f164850d;

    public f0(java.util.ArrayList arrayList) {
        this.f164850d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportYuanBaoEvent$1");
        java.util.Iterator it = this.f164850d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            int type = galleryItem$MediaItem.getType();
            java.lang.String o17 = type != 1 ? type != 6 ? "" : galleryItem$MediaItem.o() : galleryItem$MediaItem.f138430e;
            try {
                java.lang.String i17 = com.tencent.mm.vfs.w6.i(o17, false);
                if (!android.text.TextUtils.isEmpty(i17)) {
                    kotlin.jvm.internal.o.d(i17);
                    androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(i17);
                    java.lang.String attribute = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_MAKE);
                    java.lang.String attribute2 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_MODEL);
                    if (kotlin.jvm.internal.o.b("yuanbao.tencent.com", attribute) && !android.text.TextUtils.isEmpty(attribute2)) {
                        com.tencent.mars.xlog.Log.i("SnsPublishProcessReport", "path:%s model:%s", o17, attribute2);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        kotlin.jvm.internal.o.d(attribute2);
                        hashMap.put("yb_template_id", attribute2);
                        java.lang.String wi6 = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
                        kotlin.jvm.internal.o.f(wi6, "checkSnsPostSessionId(...)");
                        hashMap.put("sns_publish_sessionid", wi6);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("yb_retouch_to_publisher", hashMap, 36244);
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsUploadElment", e17, "parse error", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportYuanBaoEvent$1");
    }
}
