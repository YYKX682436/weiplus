package xq4;

/* loaded from: classes14.dex */
public class c extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public int f456110a;

    /* renamed from: b, reason: collision with root package name */
    public long f456111b;

    /* renamed from: c, reason: collision with root package name */
    public xq4.b f456112c;

    public c(xq4.b bVar) {
        super(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f456110a = -1;
        this.f456111b = 0L;
        if (bVar == null) {
            return;
        }
        this.f456112c = bVar;
        enable();
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        int i18;
        xq4.b bVar;
        if (i17 < 0 || i17 > 360) {
            return;
        }
        if (java.lang.Math.abs(this.f456110a - i17) < 30) {
            long j17 = this.f456111b;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (android.os.SystemClock.elapsedRealtime() - j17 < 300) {
                return;
            }
        }
        this.f456110a = i17;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f456111b = android.os.SystemClock.elapsedRealtime();
        if (i17 <= 60 || i17 >= 300) {
            if (i17 <= 30 || i17 >= 330) {
                i18 = 1;
            }
            i18 = -1;
        } else if (i17 >= 30 && i17 <= 150) {
            if (i17 >= 60 && i17 <= 120) {
                i18 = 2;
            }
            i18 = -1;
        } else if (i17 < 120 || i17 > 240) {
            if (i17 >= 210 && i17 <= 330 && i17 >= 240 && i17 <= 300) {
                i18 = 4;
            }
            i18 = -1;
        } else {
            if (i17 >= 150 && i17 <= 210) {
                i18 = 3;
            }
            i18 = -1;
        }
        if (i18 == -1 || (bVar = this.f456112c) == null) {
            return;
        }
        bVar.e(i18);
    }
}
