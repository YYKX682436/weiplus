package ig5;

/* loaded from: classes12.dex */
public class a extends android.graphics.drawable.AnimationDrawable {

    /* renamed from: d, reason: collision with root package name */
    public int f291463d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f291464e;

    public a() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MMAnimationDrawable", "[init] %s %s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
    }

    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MMAnimationDrawable", "setCustomDuration() called with: customDuration = [" + i17 + "]");
        this.f291463d = i17;
        unscheduleSelf(this);
        selectDrawable(this.f291464e);
        scheduleSelf(this, android.os.SystemClock.uptimeMillis() + i17);
    }

    @Override // android.graphics.drawable.AnimationDrawable, java.lang.Runnable
    public void run() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MMAnimationDrawable", "[stop] %s %s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        int numberOfFrames = getNumberOfFrames();
        int i17 = this.f291464e + 1;
        this.f291464e = i17;
        if (i17 >= numberOfFrames) {
            this.f291464e = 0;
        }
        if (this.f291463d == 0) {
            super.run();
        } else {
            selectDrawable(this.f291464e);
            scheduleSelf(this, android.os.SystemClock.uptimeMillis() + this.f291463d);
        }
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public void start() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MMAnimationDrawable", "[start] %s %s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        super.start();
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public void stop() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MMAnimationDrawable", "[stop] %s %s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        super.stop();
    }
}
