package com.tencent.mm.xwebutil;

/* loaded from: classes8.dex */
public class c implements com.tencent.xweb.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f214828a;

    public c(android.webkit.ValueCallback valueCallback) {
        this.f214828a = valueCallback;
    }

    @Override // com.tencent.xweb.o1
    public void a() {
    }

    @Override // com.tencent.xweb.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
        android.webkit.ValueCallback valueCallback;
        if (hashMap == null) {
            com.tencent.mars.xlog.Log.e("XFilesReaderLogic", "onGeneralCallback error, param is null");
            return;
        }
        if ("gc_onCustomMenuClick".equals(str)) {
            java.lang.Object obj = hashMap.get("gc_customMenuId");
            if (obj instanceof java.lang.Integer) {
                int intValue = ((java.lang.Integer) obj).intValue();
                com.tencent.mars.xlog.Log.i("XFilesReaderLogic", "onGeneralCallback onCustomMenuClick, id = " + intValue);
                if (intValue == 0 && (valueCallback = this.f214828a) != null) {
                    valueCallback.onReceiveValue("xwebFileReaderMenuEditClick");
                }
            }
        }
    }

    @Override // com.tencent.xweb.o1
    public void c() {
        android.webkit.ValueCallback valueCallback = this.f214828a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue("xwebFileReaderUserOperated");
        }
    }

    @Override // com.tencent.xweb.o1
    public void d(int i17, android.graphics.Bitmap bitmap) {
    }

    @Override // com.tencent.xweb.o1
    public void e(int i17) {
    }

    @Override // com.tencent.xweb.o1
    public void f(int i17, int i18, int i19) {
    }

    @Override // com.tencent.xweb.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
    }

    @Override // com.tencent.xweb.o1
    public void h(android.view.MotionEvent motionEvent) {
    }

    @Override // com.tencent.xweb.o1
    public void i() {
        android.webkit.ValueCallback valueCallback = this.f214828a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue("xwebFileReaderReachEnd");
        }
    }

    @Override // com.tencent.xweb.o1
    public void onDoubleTap(android.view.MotionEvent motionEvent) {
    }
}
