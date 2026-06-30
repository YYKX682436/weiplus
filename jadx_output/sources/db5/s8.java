package db5;

/* loaded from: classes10.dex */
public class s8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f228507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f228508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f228509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f228510g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f228511h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f228512i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MultiTouchImageView f228513m;

    public s8(com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView, float f17, long j17, float f18, float f19, float f27, float f28) {
        this.f228513m = multiTouchImageView;
        this.f228507d = f17;
        this.f228508e = j17;
        this.f228509f = f18;
        this.f228510g = f19;
        this.f228511h = f27;
        this.f228512i = f28;
    }

    @Override // java.lang.Runnable
    public void run() {
        float currentTimeMillis = (float) (java.lang.System.currentTimeMillis() - this.f228508e);
        float f17 = this.f228507d;
        float min = java.lang.Math.min(f17, currentTimeMillis);
        float f18 = this.f228509f + (this.f228510g * min);
        float f19 = this.f228511h;
        float f27 = this.f228512i;
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f228513m;
        multiTouchImageView.a(f18, f19, f27);
        multiTouchImageView.h();
        if (min < f17) {
            multiTouchImageView.V.post(this);
        }
    }
}
