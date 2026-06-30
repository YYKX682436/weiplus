package yd;

/* loaded from: classes7.dex */
public class n extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f460955g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.StringBuilder f460956h;

    /* renamed from: i, reason: collision with root package name */
    public yd.r f460957i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f460958m;

    public n(android.content.Context context) {
        super(context, null);
        this.f460955g = new java.util.ArrayList(4);
        this.f460956h = new java.lang.StringBuilder(100);
        this.f460957i = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new yd.m(this), true);
        this.f460958m = b4Var;
        setTextSize(12.0f);
        setTextColor(-65536);
        setFocusable(false);
        setClickable(false);
        setOnClickListener(null);
        b4Var.c(1000L, 1000L);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }
}
