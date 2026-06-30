package vv4;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f440445a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f440446b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f440447c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440449e;

    public b(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI, java.lang.String preRequestKey, java.lang.String imagePath, android.graphics.RectF rect, java.lang.String extInfo) {
        kotlin.jvm.internal.o.g(preRequestKey, "preRequestKey");
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        kotlin.jvm.internal.o.g(rect, "rect");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        this.f440449e = mMFTSImageRecognitionUI;
        this.f440445a = preRequestKey;
        this.f440446b = imagePath;
        this.f440447c = rect;
        this.f440448d = extInfo;
    }

    public java.lang.String toString() {
        android.graphics.RectF rectF = this.f440447c;
        dv4.o oVar = new dv4.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("preRequestKey", this.f440445a), new jz5.l("initialSliceList", kz5.b0.c(kz5.c1.k(new jz5.l("url", this.f440449e.Z6(this.f440446b, oVar)), new jz5.l("box", oVar.a()), new jz5.l("extInfo", this.f440448d)))))));
    }
}
