package com.tencent.mm.plugin.sns.ad.widget.gllib;

/* loaded from: classes4.dex */
public class GLViewContainer extends android.opengl.GLSurfaceView implements t84.h {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f163576p = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f163577d;

    /* renamed from: e, reason: collision with root package name */
    public int f163578e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f163579f;

    /* renamed from: g, reason: collision with root package name */
    public int f163580g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f163581h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f163582i;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f163583m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f163584n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f163585o;

    public GLViewContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163579f = false;
        this.f163581h = new java.util.HashMap();
        this.f163582i = new java.util.ArrayList();
        this.f163583m = new float[16];
        this.f163584n = new float[16];
        this.f163585o = new float[16];
        setEGLContextClientVersion(2);
        setZOrderOnTop(true);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(1);
        setRenderer(new t84.g(this, context));
        setRenderMode(0);
    }

    public static /* synthetic */ java.util.ArrayList a(com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        java.util.ArrayList arrayList = gLViewContainer.f163582i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return arrayList;
    }

    public static /* synthetic */ int b(com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        int i17 = gLViewContainer.f163577d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return i17;
    }

    public static /* synthetic */ int c(com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        int i17 = gLViewContainer.f163578e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return i17;
    }

    public void d(t84.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        queueEvent(new t84.d(this, aVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
    }

    public t84.a e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildAt", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        if (i17 < 0 || i17 >= getChildCount()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildAt", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            return null;
        }
        t84.a aVar = (t84.a) this.f163582i.get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildAt", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return aVar;
    }

    public int f(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextureId", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        if (bitmap != null) {
            int hashCode = bitmap.hashCode();
            java.util.HashMap hashMap = this.f163581h;
            r2 = hashMap.containsKey(java.lang.Integer.valueOf(hashCode)) ? ((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(hashCode))).intValue() : -1;
            if (r2 <= 0 && (r2 = t84.i.b(bitmap)) > 0) {
                hashMap.put(java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(r2));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextureId", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return r2;
    }

    public void g(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
    }

    public int getChildCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildCount", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        int size = this.f163582i.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildCount", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return size;
    }

    @Override // t84.h
    public android.graphics.Rect getGlobalVisibleRect() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        android.graphics.Rect rect = new android.graphics.Rect();
        getGlobalVisibleRect(rect);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return rect;
    }

    @Override // android.view.View, t84.h
    public void invalidate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        requestRender();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
    }
}
