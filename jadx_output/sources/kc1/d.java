package kc1;

/* loaded from: classes14.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f306282a;

    /* renamed from: b, reason: collision with root package name */
    public final float f306283b;

    /* renamed from: c, reason: collision with root package name */
    public final float f306284c;

    /* renamed from: d, reason: collision with root package name */
    public final float f306285d;

    public d(kc1.f fVar, android.graphics.RectF rectF) {
        this.f306282a = rectF.centerX() - (rectF.width() / 2.0f);
        this.f306283b = rectF.centerY() - (rectF.height() / 2.0f);
        this.f306284c = rectF.width();
        this.f306285d = rectF.height();
    }

    public d(kc1.f fVar, float f17, float f18, float f19, float f27) {
        this.f306282a = f17;
        this.f306283b = f18;
        this.f306284c = f19;
        this.f306285d = f27;
    }
}
