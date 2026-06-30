package wl5;

/* loaded from: classes10.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f447117a;

    /* renamed from: b, reason: collision with root package name */
    public final wl5.v f447118b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View.OnClickListener f447119c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnTouchListener f447120d;

    /* renamed from: e, reason: collision with root package name */
    public final rl5.r f447121e;

    /* renamed from: f, reason: collision with root package name */
    public int f447122f = com.tencent.mm.R.color.f478860j6;

    /* renamed from: g, reason: collision with root package name */
    public int f447123g = com.tencent.mm.R.color.a3y;

    /* renamed from: h, reason: collision with root package name */
    public int f447124h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f447125i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f447126j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f447127k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f447128l = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f447129m = true;

    public o(android.view.View view, rl5.r rVar, wl5.v vVar, android.view.View.OnClickListener onClickListener, android.view.View.OnTouchListener onTouchListener) {
        this.f447117a = view;
        this.f447121e = rVar;
        this.f447118b = vVar;
        this.f447119c = onClickListener;
        this.f447120d = onTouchListener;
    }

    public wl5.o a(int i17) {
        com.tencent.mm.ui.yk.a("SelectableTextHelper", "setLeftPadding:%s", java.lang.Integer.valueOf(i17));
        this.f447125i = i17;
        return this;
    }
}
