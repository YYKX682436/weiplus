package oo5;

/* loaded from: classes8.dex */
public final class b implements com.tencent.xweb.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oo5.e f347202a;

    public b(oo5.e eVar) {
        this.f347202a = eVar;
    }

    @Override // com.tencent.xweb.o1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.NativePreviewFileView", "onUserCancel");
    }

    @Override // com.tencent.xweb.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
        java.util.Objects.toString(hashMap);
    }

    @Override // com.tencent.xweb.o1
    public void c() {
    }

    @Override // com.tencent.xweb.o1
    public void d(int i17, android.graphics.Bitmap bitmap) {
        java.util.Objects.toString(bitmap);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pageIndex", java.lang.Integer.valueOf(i17));
        oo5.e eVar = this.f347202a;
        if (bitmap != null) {
            eVar.getClass();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            hashMap.put(com.tencent.tav.core.AssetExtension.SCENE_THUMBNAIL, byteArray);
        }
        io.flutter.plugin.common.MethodChannel methodChannel = eVar.f347211m;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onThumbnailLoad", hashMap);
        }
    }

    @Override // com.tencent.xweb.o1
    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.NativePreviewFileView", "onPageCountUpdate, totalCount: " + i17);
        oo5.e eVar = this.f347202a;
        eVar.f347212n = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("totalCount", java.lang.Integer.valueOf(i17));
        io.flutter.plugin.common.MethodChannel methodChannel = eVar.f347211m;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onPageCountUpdate", hashMap);
        }
    }

    @Override // com.tencent.xweb.o1
    public void f(int i17, int i18, int i19) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pageIndex", java.lang.Integer.valueOf(i17));
        hashMap.put("pageWidth", java.lang.Integer.valueOf(i18));
        hashMap.put("pageHeight", java.lang.Integer.valueOf(i19));
        io.flutter.plugin.common.MethodChannel methodChannel = this.f347202a.f347211m;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onPageChange", hashMap);
        }
    }

    @Override // com.tencent.xweb.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
    }

    @Override // com.tencent.xweb.o1
    public void h(android.view.MotionEvent motionEvent) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f347202a.f347211m;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onSingleTap", null);
        }
    }

    @Override // com.tencent.xweb.o1
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.NativePreviewFileView", "onReachEnd");
    }

    @Override // com.tencent.xweb.o1
    public void onDoubleTap(android.view.MotionEvent motionEvent) {
    }
}
