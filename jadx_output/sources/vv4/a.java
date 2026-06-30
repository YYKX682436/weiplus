package vv4;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f440439a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f440440b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f440441c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440442d;

    public a(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI, java.lang.String query, java.lang.String imagePath, android.graphics.RectF rect, java.lang.String extInfo) {
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        kotlin.jvm.internal.o.g(rect, "rect");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        this.f440442d = mMFTSImageRecognitionUI;
        this.f440439a = imagePath;
        this.f440440b = rect;
        this.f440441c = extInfo;
    }

    public java.lang.String toString() {
        android.graphics.RectF rectF = this.f440440b;
        dv4.o oVar = new dv4.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("referrer", this.f440441c), new jz5.l("initialSliceList", kz5.b0.c(kz5.c1.k(new jz5.l("url", this.f440442d.Z6(this.f440439a, oVar)), new jz5.l("box", oVar.a())))))));
    }
}
