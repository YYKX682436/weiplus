package com.tencent.mm.timelineedit;

/* loaded from: classes10.dex */
public class MediaInfoRetriever {
    private byte _hellAccFlag_;

    public static int[] getImageInfo(java.lang.String str) {
        new android.graphics.BitmapFactory.Options().inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/timelineedit/MediaInfoRetriever", "getImageInfo", "(Ljava/lang/String;)[I", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
        yj0.a.e(obj, decodeFile, "com/tencent/mm/timelineedit/MediaInfoRetriever", "getImageInfo", "(Ljava/lang/String;)[I", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        return decodeFile != null ? new int[]{decodeFile.getWidth(), decodeFile.getHeight()} : new int[]{0, 0};
    }

    public static int[] getVideoOrAudioInfo(java.lang.String str) {
        rm5.p d17 = rm5.l.f397520a.d(str);
        return d17 != null ? new int[]{d17.f397535d, d17.f397532a, d17.f397533b} : new int[]{0, 0, 0};
    }
}
