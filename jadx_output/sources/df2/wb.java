package df2;

/* loaded from: classes10.dex */
public final class wb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f231675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f231677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f231678h;

    public wb(int i17, int i18, df2.zb zbVar, boolean z17, yz5.a aVar) {
        this.f231674d = i17;
        this.f231675e = i18;
        this.f231676f = zbVar;
        this.f231677g = z17;
        this.f231678h = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(this.f231674d, this.f231675e);
        ofInt.setDuration(200L);
        df2.zb zbVar = this.f231676f;
        ofInt.addUpdateListener(new df2.rb(zbVar));
        ofInt.addListener(new df2.vb(this.f231677g, zbVar, this.f231678h));
        ofInt.start();
    }
}
