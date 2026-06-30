package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes10.dex */
public final class l2 extends rz3.g {
    public l2(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f401811f = context;
    }

    @Override // rz3.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(long j17, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        java.lang.String string = bundle.getString("key_translate_file_path");
        if (string == null) {
            string = "";
        }
        if (string.length() > 0) {
            ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.scanner.model.j2(this, string));
            return;
        }
        byte[] byteArray = bundle.getByteArray("key_translate_yuv_byte_array");
        if (byteArray == null) {
            byteArray = new byte[0];
        }
        byte[] bArr = byteArray;
        if (!(bArr.length == 0)) {
            ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.scanner.model.k2(this, bArr, (android.graphics.Point) bundle.getParcelable("key_translate_camera_resolution"), bundle.getInt("key_translate_camera_rotation", 0), bundle.getLong("key_translate_capture_time", 0L)));
        }
    }

    @Override // rz3.a
    public void destroy() {
    }

    public final void e(java.lang.String path, int i17, android.graphics.Bitmap bitmap, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslateHandler", "jumpResultUI originPath: %s, captureTime: %d", path, java.lang.Long.valueOf(j17));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.scanner.model.n2.f158964a;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.scanner.model.n2.f158964a.put(path, bitmap);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_translation_origin_image_path", path);
        intent.putExtra("key_translation_source", i17);
        intent.putExtra("key_translation_capture_time", j17);
        intent.setClass(this.f401811f, com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI.class);
        android.content.Context context = this.f401811f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/scanner/model/ScanTranslateHandler", "jumpResultUI", "(Ljava/lang/String;ILandroid/graphics/Bitmap;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/scanner/model/ScanTranslateHandler", "jumpResultUI", "(Ljava/lang/String;ILandroid/graphics/Bitmap;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
