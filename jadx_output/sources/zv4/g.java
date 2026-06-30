package zv4;

/* loaded from: classes8.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.app.Activity activity, org.json.JSONObject json, android.graphics.Rect rect, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(json, "json");
        kotlin.jvm.internal.o.g(rect, "rect");
        int b17 = b(json.optString("bizName"));
        java.lang.String optString = json.optString("bizKey");
        long Z = pm0.v.Z(json.optString("objectId"));
        java.lang.String optString2 = json.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString3 = json.optString("coverImgUrl");
        java.lang.String optString4 = json.optString("displaySourceName");
        java.lang.String optString5 = json.optString("iconUrl");
        long optLong = json.optLong("finderPlayedPosition");
        long optLong2 = json.optLong("createTime");
        com.tencent.mars.xlog.Log.i("addMinimizeTask", "JSAPI input converted to objectId=[" + Z + "], title=[" + optString2 + "], coverUrl=[" + optString3 + "], nickName=[" + optString4 + "], headUrl=[" + optString5 + "], videoDuration=[" + optLong + "], createTime=[" + optLong2 + "], bizKey=[" + optString + "], bizName=[" + b17 + ']');
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.d(optString2);
        kotlin.jvm.internal.o.d(optString3);
        kotlin.jvm.internal.o.d(optString4);
        kotlin.jvm.internal.o.d(optString5);
        ((c61.l7) b6Var).Di(activity, Z, optString2, optString3, optString4, optString5, optLong, bitmap, rect, b17, optLong2, optString);
    }

    public final int b(java.lang.String str) {
        return (!kotlin.jvm.internal.o.b(str, "k1kVideo") && kotlin.jvm.internal.o.b(str, ya.a.SEARCH)) ? 30 : 27;
    }

    public final android.graphics.Rect c(android.graphics.RectF rectF, android.view.View view) {
        kotlin.jvm.internal.o.g(rectF, "rectF");
        kotlin.jvm.internal.o.g(view, "view");
        int[] t17 = pm0.v.t(view);
        float f17 = view.getContext().getResources().getDisplayMetrics().density;
        float f18 = (t17[0] / f17) + rectF.left;
        float f19 = (t17[1] / f17) + rectF.top;
        return new android.graphics.Rect((int) f18, (int) f19, (int) (f18 + rectF.width()), (int) (f19 + rectF.height()));
    }

    public final android.graphics.Bitmap d(android.graphics.Bitmap bitmap, android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        kotlin.jvm.internal.o.g(rect, "rect");
        rect.intersect(new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
        int i17 = rect.left;
        int i18 = rect.top;
        int width = rect.width();
        int height = rect.height();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(bitmap);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/websearch/utils/MinimizeTaskJsApiUtils$Companion", "cropBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/websearch/utils/MinimizeTaskJsApiUtils$Companion", "cropBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        if (!kotlin.jvm.internal.o.b(bitmap, createBitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public final android.graphics.RectF e(org.json.JSONObject json) {
        kotlin.jvm.internal.o.g(json, "json");
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.left = (float) json.optDouble("viewX");
        rectF.top = (float) json.optDouble("viewY");
        rectF.right = rectF.left + ((float) json.optDouble("viewWidth"));
        rectF.bottom = rectF.top + ((float) json.optDouble("viewHeight"));
        return rectF;
    }

    public final void f(int i17, java.lang.String bizKey, android.content.Context context) {
        kotlin.jvm.internal.o.g(bizKey, "bizKey");
        kotlin.jvm.internal.o.g(context, "context");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.multitask.l0.C7((com.tencent.mm.plugin.multitask.l0) c17, bizKey, i17, false, 4, null);
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.d(com.tencent.mm.R.string.oa8);
        e4Var.c();
    }
}
