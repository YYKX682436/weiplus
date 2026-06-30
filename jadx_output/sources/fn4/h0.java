package fn4;

/* loaded from: classes15.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f264538a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f264539b;

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f264541d;

    /* renamed from: e, reason: collision with root package name */
    public final fn4.c f264542e;

    /* renamed from: f, reason: collision with root package name */
    public float f264543f;

    /* renamed from: c, reason: collision with root package name */
    public fn4.g0 f264540c = fn4.g0.None;

    /* renamed from: g, reason: collision with root package name */
    public int f264544g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f264545h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f264546i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f264547j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f264548k = new fn4.e0(this);

    public h0(android.content.Context context, android.view.View view, fn4.c cVar) {
        this.f264543f = 0.0f;
        this.f264538a = context;
        this.f264542e = cVar;
        this.f264539b = view;
        this.f264541d = new android.view.GestureDetector(context, new fn4.f0(this));
        this.f264543f = vv4.e1.b(context);
    }

    public void a(android.view.MotionEvent motionEvent) {
        fn4.c cVar = this.f264542e;
        boolean g17 = cVar.g();
        fn4.g0 g0Var = fn4.g0.None;
        if (!g17) {
            this.f264540c = g0Var;
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        android.content.Context context = this.f264538a;
        if (actionMasked == 0) {
            this.f264545h = motionEvent.getRawX();
            this.f264544g = ((android.media.AudioManager) context.getSystemService("audio")).getStreamVolume(3);
            this.f264543f = vv4.e1.b(context);
        }
        android.view.GestureDetector gestureDetector = this.f264541d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (actionMasked == 1 || actionMasked == 3) {
            fn4.g0 g0Var2 = this.f264540c;
            if (g0Var2 == fn4.g0.FastBackwardOrForward) {
                cVar.f(this.f264547j, motionEvent.getRawX() - this.f264545h);
                this.f264546i = -1;
                this.f264547j = 0;
                this.f264545h = 0.0f;
            } else if (g0Var2 == fn4.g0.Volume) {
                cVar.b(this.f264544g / ((android.media.AudioManager) context.getSystemService("audio")).getStreamMaxVolume(3));
            } else if (g0Var2 == fn4.g0.Brightness) {
                cVar.e(this.f264543f);
            }
            this.f264540c = g0Var;
        }
    }
}
