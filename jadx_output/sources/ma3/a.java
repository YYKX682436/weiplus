package ma3;

/* loaded from: classes8.dex */
public final class a implements com.tencent.xweb.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ma3.c f325210a;

    public a(ma3.c cVar) {
        this.f325210a = cVar;
    }

    @Override // com.tencent.xweb.o1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppXFileView", "xfile on user cancel finish");
    }

    @Override // com.tencent.xweb.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
        if (!kotlin.jvm.internal.o.b(str, "gc_ViewEdgeChanged")) {
            kotlin.jvm.internal.o.b(str, "gc_onScaleEnd");
            return;
        }
        java.lang.Object obj = hashMap != null ? hashMap.get("gc_ViewIsLeftEdge") : null;
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.lang.Object obj2 = hashMap != null ? hashMap.get("gc_ViewIsRightEdge") : null;
        java.lang.Boolean bool2 = obj2 instanceof java.lang.Boolean ? (java.lang.Boolean) obj2 : null;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppXFileView", "ViewEdgeChanged isLeftEdge: " + booleanValue + ", isRightEdge: " + booleanValue2);
        java.lang.String str2 = (booleanValue && booleanValue2) ? com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL : booleanValue2 ? "left" : booleanValue ? "right" : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
        io.flutter.plugin.common.MethodChannel methodChannel = this.f325210a.f325212d;
        if (methodChannel != null) {
            methodChannel.invokeMethod("disableSwipeGesture", kz5.c1.i(new jz5.l(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, str2)));
        }
    }

    @Override // com.tencent.xweb.o1
    public void c() {
    }

    @Override // com.tencent.xweb.o1
    public void d(int i17, android.graphics.Bitmap thumbnail) {
        kotlin.jvm.internal.o.g(thumbnail, "thumbnail");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppXFileView", "xfile onThumbnailLoad " + i17);
    }

    @Override // com.tencent.xweb.o1
    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppXFileView", "xfile onPageCountUpdate " + i17);
    }

    @Override // com.tencent.xweb.o1
    public void f(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppXFileView", "xfile onPageChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19);
    }

    @Override // com.tencent.xweb.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppXFileView", "xfile onViewStatusChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19 + " and scale " + f17 + " and transX " + i27 + " and " + i28);
    }

    @Override // com.tencent.xweb.o1
    public void h(android.view.MotionEvent motionEvent) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f325210a.f325212d;
        if (methodChannel != null) {
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("x", motionEvent != null ? java.lang.Float.valueOf(motionEvent.getX(0)) : 0);
            lVarArr[1] = new jz5.l("y", motionEvent != null ? java.lang.Float.valueOf(motionEvent.getY(0)) : 0);
            methodChannel.invokeMethod("onSingleTap", kz5.c1.i(lVarArr));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppXFileView", "xfile onSingleTap, %s", java.lang.String.valueOf(motionEvent));
    }

    @Override // com.tencent.xweb.o1
    public void i() {
    }

    @Override // com.tencent.xweb.o1
    public void onDoubleTap(android.view.MotionEvent motionEvent) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f325210a.f325212d;
        if (methodChannel != null) {
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("x", motionEvent != null ? java.lang.Float.valueOf(motionEvent.getX(0)) : 0);
            lVarArr[1] = new jz5.l("y", motionEvent != null ? java.lang.Float.valueOf(motionEvent.getY(0)) : 0);
            methodChannel.invokeMethod("onDoubleTap", kz5.c1.i(lVarArr));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppXFileView", "xfile onSingleTap, %s", java.lang.String.valueOf(motionEvent));
    }
}
