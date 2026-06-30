package ym5;

/* loaded from: classes15.dex */
public class g3 implements ym5.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.PhotoView f463341a;

    public g3(com.tencent.mm.view.PhotoView photoView) {
        this.f463341a = photoView;
    }

    @Override // ym5.d3
    public float a() {
        android.graphics.RectF rectF = this.f463341a.L;
        return (rectF.top + rectF.bottom) / 2.0f;
    }
}
