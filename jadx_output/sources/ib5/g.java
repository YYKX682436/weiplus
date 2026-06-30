package ib5;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f290267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.blur.BlurView f290268e;

    public g(com.tencent.mm.ui.blur.BlurView blurView, boolean z17) {
        this.f290268e = blurView;
        this.f290267d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f290268e.f198005d.d(this.f290267d);
    }
}
