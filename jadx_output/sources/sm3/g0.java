package sm3;

/* loaded from: classes10.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final sm3.f0 f409862a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f409863b;

    /* renamed from: c, reason: collision with root package name */
    public float f409864c;

    /* renamed from: d, reason: collision with root package name */
    public float f409865d;

    /* renamed from: e, reason: collision with root package name */
    public float f409866e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f409867f;

    /* renamed from: g, reason: collision with root package name */
    public final int f409868g;

    /* renamed from: h, reason: collision with root package name */
    public final int f409869h;

    /* renamed from: i, reason: collision with root package name */
    public float f409870i;

    /* renamed from: j, reason: collision with root package name */
    public float f409871j;

    /* renamed from: k, reason: collision with root package name */
    public int f409872k = 0;

    /* renamed from: l, reason: collision with root package name */
    public android.view.GestureDetector f409873l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f409874m;

    public g0(android.content.Context context, sm3.f0 f0Var) {
        this.f409862a = f0Var;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f409868g = viewConfiguration.getScaledTouchSlop() * 2;
        this.f409869h = viewConfiguration.getScaledTouchSlop() * 4;
        if (context.getApplicationInfo().targetSdkVersion > 18) {
            this.f409863b = true;
            if (this.f409873l == null) {
                this.f409873l = new android.view.GestureDetector(context, new sm3.e0(this), null);
            }
        }
    }

    public final boolean a() {
        return this.f409872k != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sm3.g0.b(android.view.MotionEvent):boolean");
    }
}
