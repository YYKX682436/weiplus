package vv4;

/* loaded from: classes11.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f440504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f440506h;

    public u(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI, java.lang.String str, android.graphics.RectF rectF, java.lang.String str2, kotlin.jvm.internal.h0 h0Var) {
        this.f440502d = mMFTSImageRecognitionUI;
        this.f440503e = str;
        this.f440504f = rectF;
        this.f440505g = str2;
        this.f440506h = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI = this.f440502d;
        java.lang.String str = mMFTSImageRecognitionUI.f181638m;
        if (str == null) {
            kotlin.jvm.internal.o.o("imgPath");
            throw null;
        }
        zv4.f fVar = zv4.f.f476460a;
        if (com.tencent.mm.sdk.platformtools.y1.g(str)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            str = m11.b1.Di().P0(str);
            kotlin.jvm.internal.o.d(str);
        }
        android.graphics.Bitmap c17 = com.tencent.mm.graphics.e.c(str);
        java.lang.String b17 = c17 != null ? fVar.b(c17, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, true) : null;
        if (b17 != null) {
            mMFTSImageRecognitionUI.f181638m = b17;
        }
        java.lang.String str2 = this.f440503e;
        boolean z17 = str2.length() > 0;
        android.graphics.RectF rectF = this.f440504f;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("skip upload with preRequestKey key=");
            sb6.append(str2);
            sb6.append(" rect=");
            sb6.append(rectF != null ? rectF.toString() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMFTSImageRecognitionUI", sb6.toString());
            java.lang.String str3 = this.f440503e;
            java.lang.String str4 = mMFTSImageRecognitionUI.f181638m;
            if (str4 == null) {
                kotlin.jvm.internal.o.o("imgPath");
                throw null;
            }
            if (rectF == null) {
                rectF = new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f);
            }
            com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.V6(mMFTSImageRecognitionUI, new vv4.b(mMFTSImageRecognitionUI, str3, str4, rectF, this.f440505g).toString());
            return;
        }
        if (mMFTSImageRecognitionUI.Y6() != 13) {
            kotlinx.coroutines.l.d(mMFTSImageRecognitionUI.getLifecycleAsyncScope(), null, null, new vv4.t(mMFTSImageRecognitionUI, null), 3, null);
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("skip upload with scanQuery=");
        kotlin.jvm.internal.h0 h0Var = this.f440506h;
        sb7.append((java.lang.String) h0Var.f310123d);
        sb7.append(" rect=");
        sb7.append(rectF != null ? rectF.toString() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMFTSImageRecognitionUI", sb7.toString());
        java.lang.String str5 = (java.lang.String) h0Var.f310123d;
        java.lang.String str6 = mMFTSImageRecognitionUI.f181638m;
        if (str6 == null) {
            kotlin.jvm.internal.o.o("imgPath");
            throw null;
        }
        if (rectF == null) {
            rectF = new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f);
        }
        com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.V6(mMFTSImageRecognitionUI, new vv4.a(mMFTSImageRecognitionUI, str5, str6, rectF, this.f440505g).toString());
    }
}
