package ie4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ie4.a f291002a = new ie4.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f291003b = je4.c.f299317a.a();

    public final void a(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem item) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteLivePhotoDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPicFileHelper", "deleteLivePhotoDir " + item.h());
        java.lang.String b17 = b(item);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeDeleteDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPicFileHelper", "safeDeleteDir >> " + b17);
        if (r26.n0.D(b17, "draft", false, 2, null) && !r26.n0.B(b17, "DCIM", true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiPicFileHelper", "delete dir ret >> " + com.tencent.mm.vfs.w6.g(b17, true));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeDeleteDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteLivePhotoDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
    }

    public final java.lang.String b(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        java.lang.String str = f291003b + snsPublishLivePhotoItem.h() + '/';
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiPicFileHelper", "create sns draft livePhoto dir:" + str + " result:" + com.tencent.mm.vfs.w6.u(str));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        return str;
    }

    public final java.lang.String c(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem item) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoParsePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String b17 = b(item);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b17);
        sb6.append("pre_temp_sns_live_photo_parse_");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.String b18 = item.b();
        kotlin.jvm.internal.o.d(b18);
        sb7.append(b18);
        sb7.append(java.lang.System.currentTimeMillis());
        byte[] bytes = sb7.toString().getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb8 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoParsePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        return sb8;
    }

    public final long d(java.lang.String fromPath, java.lang.String toPath) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeCopyFile", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        kotlin.jvm.internal.o.g(fromPath, "fromPath");
        kotlin.jvm.internal.o.g(toPath, "toPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPicFileHelper", "copyFile >> fromPath: " + fromPath + " toPath: " + toPath);
        if (r26.n0.B(fromPath, "draft", false)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiPicFileHelper", "is already copy");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeCopyFile", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
            return -1L;
        }
        long d17 = com.tencent.mm.vfs.w6.d(fromPath, toPath, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeCopyFile", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        return d17;
    }
}
