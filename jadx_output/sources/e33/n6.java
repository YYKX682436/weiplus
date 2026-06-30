package e33;

/* loaded from: classes8.dex */
public final class n6 {
    public n6(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, java.util.ArrayList videoList, java.util.ArrayList imageList, int[] index, android.graphics.Point point) {
        int i17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(videoList, "videoList");
        kotlin.jvm.internal.o.g(imageList, "imageList");
        kotlin.jvm.internal.o.g(index, "index");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.VLogPreloadUI.class);
        intent.putStringArrayListExtra("key_select_video_list", videoList);
        intent.putStringArrayListExtra("key_select_image_list", imageList);
        intent.putExtra(ya.b.INDEX, index);
        if (point != null && (i17 = point.x) > 0 && point.y > 0) {
            intent.putExtra("KEY_PREVIEW_WIDTH", i17);
            intent.putExtra("KEY_PREVIEW_HEIGHT", point.y);
        }
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4381);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/VLogPreloadUI$Companion", "jumpToVLogPreloadUI", "(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;[ILandroid/graphics/Point;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        activity.overridePendingTransition(0, 0);
    }
}
