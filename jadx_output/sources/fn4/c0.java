package fn4;

/* loaded from: classes15.dex */
public class c0 extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public int f264483a;

    /* renamed from: b, reason: collision with root package name */
    public int f264484b;

    /* renamed from: c, reason: collision with root package name */
    public long f264485c;

    /* renamed from: d, reason: collision with root package name */
    public long f264486d;

    /* renamed from: e, reason: collision with root package name */
    public fn4.b0 f264487e;

    public c0(android.content.Context context) {
        super(context);
        this.f264483a = -1;
        this.f264484b = -1;
        this.f264485c = 0L;
        this.f264486d = 0L;
    }

    @Override // android.view.OrientationEventListener
    public void enable() {
        super.enable();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f264486d = android.os.SystemClock.elapsedRealtime();
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        long j17 = this.f264486d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 >= 2000 && java.lang.Math.abs(this.f264483a - i17) >= 60) {
            if (android.os.SystemClock.elapsedRealtime() - this.f264485c >= 1000) {
                this.f264483a = i17;
                this.f264485c = android.os.SystemClock.elapsedRealtime();
                if (i17 <= 60 || i17 >= 300) {
                    if (i17 <= 30 || i17 >= 330) {
                        this.f264484b = 0;
                    }
                } else if (i17 < 30 || i17 > 150) {
                    if (i17 < 120 || i17 > 240) {
                        if (i17 >= 210 && i17 <= 330 && i17 >= 240 && i17 <= 300) {
                            this.f264484b = 270;
                        }
                    } else if (i17 >= 150 && i17 <= 210) {
                        this.f264484b = 180;
                    }
                } else if (i17 >= 60 && i17 <= 120) {
                    this.f264484b = 90;
                }
                fn4.b0 b0Var = this.f264487e;
                if (b0Var != null) {
                    ((fn4.x) b0Var).f264617a.e7(this.f264484b);
                }
            }
        }
    }
}
