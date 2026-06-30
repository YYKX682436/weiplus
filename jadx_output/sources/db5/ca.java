package db5;

/* loaded from: classes15.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f228308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f228309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f228310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f228311g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f228312h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f228313i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.WxImageView f228314m;

    public ca(com.tencent.mm.ui.base.WxImageView wxImageView, float f17, long j17, float f18, float f19, float f27, float f28) {
        this.f228314m = wxImageView;
        this.f228308d = f17;
        this.f228309e = j17;
        this.f228310f = f18;
        this.f228311g = f19;
        this.f228312h = f27;
        this.f228313i = f28;
    }

    @Override // java.lang.Runnable
    public void run() {
        float currentTimeMillis = (float) (java.lang.System.currentTimeMillis() - this.f228309e);
        float f17 = this.f228308d;
        float min = java.lang.Math.min(f17, currentTimeMillis);
        float f18 = this.f228310f + (this.f228311g * min);
        float f19 = this.f228312h;
        float f27 = this.f228313i;
        com.tencent.mm.ui.base.WxImageView wxImageView = this.f228314m;
        wxImageView.a(f18, f19, f27);
        if (min < f17) {
            wxImageView.f197742p0.post(this);
        }
    }
}
