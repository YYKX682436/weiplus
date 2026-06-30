package ys2;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f465151d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f465152e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Vibrator f465153f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f465154g;

    /* renamed from: h, reason: collision with root package name */
    public float f465155h;

    /* renamed from: i, reason: collision with root package name */
    public float f465156i;

    public f(java.lang.ref.WeakReference controller) {
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f465151d = controller;
        this.f465152e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
        this.f465153f = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        this.f465154g = new ys2.e(this);
    }

    public final boolean a() {
        ys2.h hVar = (ys2.h) this.f465151d.get();
        return hVar != null && hVar.f465165s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r11 != 3) goto L52;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ys2.f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
