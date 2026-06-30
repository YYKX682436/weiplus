package ef1;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f252389a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f252390b;

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f252392d;

    /* renamed from: e, reason: collision with root package name */
    public final ef1.d f252393e;

    /* renamed from: f, reason: collision with root package name */
    public float f252394f;

    /* renamed from: c, reason: collision with root package name */
    public ef1.c f252391c = ef1.c.None;

    /* renamed from: g, reason: collision with root package name */
    public int f252395g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f252396h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f252397i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f252398j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f252399k = new ef1.a(this);

    public e(android.content.Context context, android.view.View view, ef1.d dVar) {
        this.f252394f = 0.0f;
        this.f252389a = context;
        this.f252393e = dVar;
        this.f252390b = view;
        this.f252392d = new android.view.GestureDetector(context, new ef1.b(this));
        this.f252394f = oe1.x1.b(context);
    }
}
